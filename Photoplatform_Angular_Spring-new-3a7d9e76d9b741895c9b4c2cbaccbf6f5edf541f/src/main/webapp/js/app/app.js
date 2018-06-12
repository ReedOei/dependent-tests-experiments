var xAuthTokenHeaderName = 'x-auth-token';
var photoplatform = angular.module('photoplatform',
    [
        'ngRoute',
        'ngCookies',
        'angular-md5',
        'photoplatformControllers',
        'ui.bootstrap'
    ]);
var photoplatformControllers = angular.module('photoplatformControllers', []);

/**
 * App configuration.
 */
photoplatform.config([
    '$routeProvider',
    '$locationProvider',
    '$httpProvider',
    function ($routeProvider, $locationProvider, $httpProvider) {
        // Enable HTML5 strategy (without # in urls)
        $locationProvider.html5Mode(true);

        $routeProvider.when('/profile', {
            templateUrl: '/views/partials/profile/index.html',
            controller: 'UserCtrl'
        }).when('/register', {
            templateUrl: '/views/partials/home/register.html',
            controller: 'AuthCtrl'
        }).when('/login', {
            templateUrl: '/views/partials/profile/login.html',
            controller: 'AuthCtrl'
        }).when('/view/showcase/:userId', {
            templateUrl: '/views/partials/home/viewShowcase.html',
            controller: 'ViewShowcaseCtrl'
        }).when('/collection/:collectionId', {
            templateUrl: '/views/partials/home/viewCollection.html',
            controller: 'ViewCollectionCtrl'
        }).when('/profile/password/reset', {
            templateUrl: '/views/partials/home/passwordreset.html',
            controller: 'AuthCtrl'
        }).when('/profile/admin', {
            templateUrl: '/views/partials/profile/admin/control.html',
            controller: 'AdminMenuCtrl'
        }).when('/profile/edit', {
            templateUrl: '/views/partials/profile/editUser.html',
            controller: 'UserCtrl'
        }).when('/profile/view', {
            templateUrl: '/views/partials/profile/view.html',
            controller: 'UserCtrl'
        }).when('/profile/shoppinglist', {
            templateUrl: '/views/partials/profile/purchase/shoppingList.html',
            controller: 'ShoppingListCtrl'
        }).when('/profile/admin/edit/user/:userId', {
            templateUrl: '/views/partials/profile/admin/editUser.html',
            controller: 'AdminEditUserCtrl'
        }).when('/profile/photograph/register', {
            templateUrl: '/views/partials/profile/photographer/register.html',
            controller: 'UserCtrl'
        }).when('/profile/photograph/showcase', {
            templateUrl: '/views/partials/profile/photographer/showcase.html',
            controller: ''
        }).when('/profile/photograph/collection/edit', {
            templateUrl: '/views/partials/profile/photographer/collection/edit.html',
            controller: 'PhotographerCtrl'
        }).when('/profile/photograph/collection', {
            templateUrl: '/views/partials/profile/photographer/collection/collection.html',
            controller: 'PhotographerCtrl'
        }).when('/profile/photograph/collection/:collectionId/:collectionName', {
            templateUrl: '/views/partials/profile/photographer/collection/images.html',
            controller: 'CollectionCtrl'
        }).when('/profile/photograph/image', {
            templateUrl: '/views/partials/profile/photographer/image/image.html',
            controller: 'ImageCtrl'
        }).when('/cart', {
            templateUrl: '/views/partials/profile/purchase/shoppingCart.html',
            controller: ''
        }).when('/purchase/agb', {
            templateUrl: '/views/partials/profile/purchase/agb.html',
            controller: ''
        }).when('/purchase/transaction', {
            templateUrl: '/views/partials/profile/purchase/transaction.html',
            controller: ''
        }).when('/purchase/buy', {
            templateUrl: '/views/partials/profile/purchase/buy.html',
            controller: 'PurchaseCtrl'
        }).when('/purchase/approved', {
            templateUrl: '/views/partials/profile/purchase/approved.html',
            controller: 'PurchaseCtrl'
        }).when('/', {
            templateUrl: '/views/partials/home/home.html',
            controller: ''
        }).otherwise({
            redirectTo: '/'
        });

        /* Intercept http errors */
        var interceptor = function ($rootScope, $cookieStore, $q, $location) {
            function success(response) {
                return response;
            }

            function error(response) {

                var status = response.status;
                var config = response.config;
                var method = config.method;
                var url = config.url;
                
				if(status == 401) {
        			delete $rootScope.user;
        			$cookieStore.remove('user');
                    $location.path("/login");
                    $rootScope.error = status + "! Session Timeout";				
				} 
				else if (status == 403) {
                    $location.path("/login");
                    $rootScope.error = status + " ! Nicht authorisiert";
                }  
                else if (status !== 404) {
                	var error = method + " on " + url + " failed with status " + status;
                    $rootScope.error = response.data.message || error;                  
                }

                return $q.reject(response);
            }

            return function (promise) {
                return promise.then(success, error);
            };
        };

        $httpProvider.responseInterceptors.push(interceptor);

    }]).run(function ($rootScope, $http, $location, $cookieStore, UserService, ShoppingListService) {
    //Reset error and success when a new view is loaded
    $rootScope.$on('$viewContentLoaded', function () {
        delete $rootScope.error;
        if ($rootScope.transferSuccess == false || $rootScope.transferSuccess == undefined) {
            delete $rootScope.success;
        }
        else {
            $rootScope.transferSuccess = false;
        }
    });
    
 	$rootScope.$on('$routeChangeSuccess', function () {
 		if ($rootScope.user !== undefined) {
 			ShoppingListService.getItemsInShoppingCart().success(function (NumberOfImages) {
                    $rootScope.user.totalItems = NumberOfImages;
                    });
        }
    });
    
    $rootScope.logout = function () {
        UserService.logout($rootScope.user);
        delete $rootScope.user;
        delete $http.defaults.headers.common[xAuthTokenHeaderName];
        $cookieStore.remove('user');
        $location.path("/");
    };

    /* Try getting valid user from cookie or go to login page */

    var user = $cookieStore.get('user');
    if (user !== undefined) {
        $rootScope.user = user;
        $http.defaults.headers.common[xAuthTokenHeaderName] = user.secToken;

        $location.path($location.path());
    }

    $rootScope.isLoggedIn = function () {
        return $rootScope.user !== undefined;
    };

    $rootScope.ADMIN = "ROLE_ADMIN";
    $rootScope.CUSTOMER = "ROLE_CUSTOMER";
    $rootScope.PHOTOGRAPHER = "ROLE_PHOTOGRAPHER";
    $rootScope.BECOME_PHOTOGRAPHER = "ROLE_BECOME_PHOTOGRAPHER";
    $rootScope.hasRole = function (role) {
        if ($rootScope.user !== undefined) {
            for (var i = 0; i < $rootScope.user.roles.length; ++i) {
                if ($rootScope.user.roles[i] == role) {
                    return true;
                }
            }
        }
        return false;
    };

    $rootScope.isAdmin = function () {
        return $rootScope.hasRole($rootScope.ADMIN);
    };

    $rootScope.isCustomer = function () {
        return $rootScope.hasRole($rootScope.CUSTOMER);
    };

    $rootScope.isPhotographer = function () {
        return $rootScope.hasRole($rootScope.PHOTOGRAPHER);
    };

    $rootScope.isBecomePhotographer = function () {
        return $rootScope.hasRole($rootScope.BECOME_PHOTOGRAPHER);
    };

    console.log($rootScope.user);

});
