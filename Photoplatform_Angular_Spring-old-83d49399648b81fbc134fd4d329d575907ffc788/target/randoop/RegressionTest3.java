import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test001");
        de.htw.sdf.photoplatform.webservice.ViewController viewController0 = new de.htw.sdf.photoplatform.webservice.ViewController();
        java.lang.String str1 = viewController0.index();
        java.lang.String str2 = viewController0.index();
        java.lang.String str3 = viewController0.index();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "/index.html" + "'", str1.equals("/index.html"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/index.html" + "'", str2.equals("/index.html"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "/index.html" + "'", str3.equals("/index.html"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test002");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        java.lang.String str2 = userRegister0.getFirstName();
        userRegister0.setEmail("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test003");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        image0.setDescription("/collections/{collectionId}/images/{imageId}");
        java.lang.String str6 = image0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(imageData3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test004");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = null;
        collectionImage0.setCollection(collection5);
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user8 = collection7.getUser();
        collectionImage0.setCollection(collection7);
        java.lang.String str10 = collection7.toString();
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Collection{user=null, name='null'}" + "'", str10.equals("Collection{user=null, name='null'}"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test005");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls2 = null;
        collectionImageDAOImpl0.setClazz(cls2);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage5 = collectionImageDAOImpl0.findOne((long) 404);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test006");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory3 = application0.servletContainer();
        org.springframework.validation.Validator validator4 = application0.getValidator();
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory3);
        org.junit.Assert.assertNull(validator4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test007");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.lang.String str2 = collection0.getName();
        java.lang.String str3 = collection0.getDescription();
        de.htw.sdf.photoplatform.persistence.model.User user4 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b5 = user4.isAdmin();
        java.lang.String str6 = user4.getSecToken();
        boolean b7 = user4.isAccountNonLocked();
        boolean b8 = user4.isCredentialsNonExpired();
        java.lang.String str9 = user4.getLastName();
        java.lang.String str10 = user4.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole11 = user4.getUserRoles();
        collection0.setUser(user4);
        boolean b13 = collection0.isPublic();
        boolean b14 = collection0.isPublic();
        org.junit.Assert.assertNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(list_userRole11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test008");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isBecomePhotographer();
        user0.setFirstName("/index.html");
        boolean b4 = user0.isAccountNonExpired();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard5 = user0.getAuthorities();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(collection_wildcard5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test009");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.Boolean b4 = userData0.isEnabled();
        userData0.setPhone("/collections/photographers");
        userData0.setLastName("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        userData0.setCompany("/collections/create");
        java.lang.String str11 = userData0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null:1528137250344:31149e863206f62132f4465a1c878d2c" + "'", str11.equals("null:1528137250344:31149e863206f62132f4465a1c878d2c"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test010");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.toString();
        image0.setChangeDate();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=1.0}" + "'", str5.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=1.0}"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test011");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long6 = new java.util.ArrayList<java.lang.Long>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long6, long_array5);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long6);
        collectionData0.setName("/user/login");
        java.lang.String str11 = collectionData0.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData12 = collectionData0.getUserdata();
        collectionData0.setName("");
        org.junit.Assert.assertNotNull(long_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(userData12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test012");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array2 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection3 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3, collection_array2);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData5 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData7 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.lang.String str9 = photographerData0.getPhone();
        photographerData0.setPhone("/collections/{collectionId}/images");
        java.lang.String str12 = photographerData0.getHomepage();
        java.lang.String str13 = photographerData0.getIban();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array14 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection15 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection15, collection_array14);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData17 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection15);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData18 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection15);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData19 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection15);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData20 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection15);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection15);
        photographerData0.setSwift("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(collection_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(list_collectionData17);
        org.junit.Assert.assertNotNull(list_collectionData18);
        org.junit.Assert.assertNotNull(list_collectionData19);
        org.junit.Assert.assertNotNull(list_collectionData20);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test013");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        org.springframework.validation.Errors errors5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors5);
        int i7 = notFoundException6.getCode();
        notFoundException3.addSuppressed((java.lang.Throwable) notFoundException6);
        org.springframework.web.context.request.WebRequest webRequest9 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError10 = imageController0.handleNotFoundException(notFoundException6, webRequest9);
        org.springframework.web.multipart.MultipartFile[] multipartFile_array11 = new org.springframework.web.multipart.MultipartFile[] {};
        try {
            java.lang.String str12 = imageController0.handleImageUpload(multipartFile_array11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertNotNull(responseError10);
        org.junit.Assert.assertNotNull(multipartFile_array11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test014");
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory0 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = null;
        collectionCategory0.setCollection(collection1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = null;
        collectionCategory0.setCollection(collection3);
        de.htw.sdf.photoplatform.persistence.model.Category category5 = collectionCategory0.getCategory();
        java.util.Date date6 = collectionCategory0.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user8 = collection7.getUser();
        collectionCategory0.setCollection(collection7);
        java.lang.String str10 = collection7.getDescription();
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData12 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(category5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test015");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            javax.persistence.Query query9 = userDAOImpl0.createQuery("Image{name='Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}', path='null', isPublic=false, enabled=false, price=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test016");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage9 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView10 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest7, httpServletResponse8, (java.lang.Object) userImage9, modelAndView10);
        java.util.Date date12 = userImage9.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Image image13 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image13.setMobileThumbPath("ROLE_CUSTOMER");
        userImage9.setImage(image13);
        de.htw.sdf.photoplatform.persistence.model.Image image17 = userImage9.getImage();
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNotNull(image17);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test017");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.controller.UserController userController1 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException4 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors3);
        int i5 = notFoundException4.getCode();
        org.springframework.web.context.request.WebRequest webRequest6 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError7 = userController1.handleNotFoundException(notFoundException4, webRequest6);
        org.springframework.web.context.request.WebRequest webRequest8 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError9 = photographerController0.handleNotFoundException(notFoundException4, webRequest8);
        int i10 = responseError9.getCode();
        java.lang.String str11 = responseError9.getDeveloperInfo();
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i10 == 10001);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001" + "'", str11.equals("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test018");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = collectionDAOImpl0.getEntityManager();
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage7 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 10L, 11002, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test019");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls5 = null;
        collectionCategoryDAOImpl0.setClazz(cls5);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls7 = null;
        collectionCategoryDAOImpl0.setClazz(cls7);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls9 = null;
        collectionCategoryDAOImpl0.setClazz(cls9);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory11 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection12 = null;
        collectionCategory11.setCollection(collection12);
        de.htw.sdf.photoplatform.persistence.model.Collection collection14 = null;
        collectionCategory11.setCollection(collection14);
        de.htw.sdf.photoplatform.persistence.model.Category category16 = collectionCategory11.getCategory();
        java.util.Date date17 = collectionCategory11.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection18 = collectionCategory11.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Category category19 = collectionCategory11.getCategory();
        de.htw.sdf.photoplatform.persistence.model.Category category20 = collectionCategory11.getCategory();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData21 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData22 = collectionData21.getThumbnail();
        collectionData21.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b25 = collectionData21.getPublic();
        de.htw.sdf.photoplatform.persistence.model.User user26 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b27 = user26.isAdmin();
        java.lang.String str28 = user26.getSecToken();
        boolean b29 = user26.isAccountNonLocked();
        boolean b30 = user26.isCredentialsNonExpired();
        java.lang.String str31 = user26.getLastName();
        java.lang.String str32 = user26.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole33 = user26.getUserRoles();
        de.htw.sdf.photoplatform.persistence.model.Collection collection34 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData21, user26);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory35 = collection34.getCollectionCategories();
        java.lang.String str36 = collection34.getName();
        collectionCategory11.setCollection(collection34);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory38 = collectionCategoryDAOImpl0.update(collectionCategory11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(category16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(collection18);
        org.junit.Assert.assertNull(category19);
        org.junit.Assert.assertNull(category20);
        org.junit.Assert.assertNull(imageData22);
        org.junit.Assert.assertTrue("'" + b25 + "' != '" + false + "'", b25.equals(false));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(list_userRole33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(set_collectionCategory35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test020");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData4 = null;
        user1.setPhotographerData(photographerData4);
        user1.setAccountNonLocked(true);
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard8 = user1.getAuthorities();
        try {
            java.lang.Boolean b9 = userManagerImpl0.isUserPhotographer(user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(collection_wildcard8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test021");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls5 = null;
        collectionImageDAOImpl0.setClazz(cls5);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage8 = collectionImageDAOImpl0.findOne(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test022");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        java.lang.String str5 = user0.toString();
        boolean b6 = user0.isAccountNonExpired();
        user0.setAccountNonLocked(false);
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData9 = new de.htw.sdf.photoplatform.webservice.dto.UserData(user0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str5.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test023");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        boolean b5 = image0.isEnabled();
        image0.setPath("ROLE_ADMIN");
        image0.setPrice((java.lang.Double) 10.0d);
        boolean b10 = image0.isEnabled();
        java.lang.String str11 = image0.getMime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test024");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.lockUser("null:1528137290306:359bf08f2d461e07611e727909d973a0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test025");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        java.lang.String str2 = photographerData0.getIban();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection3 = photographerData0.getCollections();
        photographerData0.setPhone("abe34aa080ac4421665a72329e218ae76e6eae82d181635ba4a5f8548e70866084fd9cd5c793d5b3a4165763081b95813d4bdb3d679b27d667fea0502caa5a9b");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData6 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection7 = photographerData6.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array8 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection9 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection9, collection_array8);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData11 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection9);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData12 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection9);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData13 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection9);
        photographerData6.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection9);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection9);
        photographerData0.setCompany("/collections/update");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(list_collection3);
        org.junit.Assert.assertNull(list_collection7);
        org.junit.Assert.assertNotNull(collection_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(list_collectionData11);
        org.junit.Assert.assertNotNull(list_collectionData12);
        org.junit.Assert.assertNotNull(list_collectionData13);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test026");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls4 = null;
        collectionDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.Image image7 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image7.setCreatedBy("");
        image7.setPrice((java.lang.Double) 1.0d);
        java.lang.String str12 = image7.getDescription();
        java.lang.String str13 = image7.getMime();
        image7.setMobileThumbPath("/photographer/upload");
        boolean b16 = image7.isEnabled();
        image7.setPrice((java.lang.Double) 1.0d);
        collection6.setThumbnail(image7);
        java.lang.String str20 = collection6.getDescription();
        try {
            collectionDAOImpl0.create(collection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test027");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry6 = null;
        application0.addResourceHandlers(resourceHandlerRegistry6);
        org.springframework.web.servlet.LocaleResolver localeResolver8 = application0.localeResolver();
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry9 = null;
        try {
            application0.addInterceptors(interceptorRegistry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(localeResolver8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test028");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole3 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole4 = userRoleDAOImpl0.update(userRole3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test029");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor1 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest2 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse3 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor1.afterCompletion(httpServletRequest2, httpServletResponse3, (java.lang.Object) 10, (java.lang.Exception) notFoundException6);
        javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse9 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage10 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView11 = null;
        requestLoggerInterceptor1.postHandle(httpServletRequest8, httpServletResponse9, (java.lang.Object) userImage10, modelAndView11);
        javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse14 = null;
        de.htw.sdf.photoplatform.Application application15 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer16 = null;
        application15.configureAsyncSupport(asyncSupportConfigurer16);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer18 = null;
        application15.configureAsyncSupport(asyncSupportConfigurer18);
        org.springframework.validation.MessageCodesResolver messageCodesResolver20 = application15.getMessageCodesResolver();
        de.htw.sdf.photoplatform.Application application21 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer22 = null;
        application21.configureDefaultServletHandling(defaultServletHandlerConfigurer22);
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array24 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver25 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver25, handlerMethodArgumentResolver_array24);
        application21.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver25);
        application15.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver25);
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        requestLoggerInterceptor1.postHandle(httpServletRequest13, httpServletResponse14, (java.lang.Object) arraylist_handlerMethodArgumentResolver25, modelAndView29);
        javax.servlet.http.HttpServletRequest httpServletRequest31 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse32 = null;
        de.htw.sdf.photoplatform.persistence.model.User user33 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b34 = user33.isAdmin();
        user33.setPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard37 = user33.getAuthorities();
        boolean b39 = user33.isRoleIncluded("");
        boolean b40 = user33.isAdmin();
        requestLoggerInterceptor1.afterConcurrentHandlingStarted(httpServletRequest31, httpServletResponse32, (java.lang.Object) user33);
        try {
            userManagerImpl0.delete(user33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(messageCodesResolver20);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(collection_wildcard37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test030");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        try {
            javax.persistence.Query query6 = imageDAOImpl0.createQuery("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test031");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image4.setCreatedBy("");
        collectionImage3.setImage(image4);
        de.htw.sdf.photoplatform.persistence.model.Image image8 = collectionImage3.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection9 = null;
        collectionImage3.setCollection(collection9);
        de.htw.sdf.photoplatform.persistence.model.Image image11 = collectionImage3.getImage();
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage12 = collectionImageDAOImpl0.update(collectionImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(image8);
        org.junit.Assert.assertNotNull(image11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test032");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        photographerData0.setCompany("/collections/{collectionId}/images");
        photographerData0.setPhone("/photographer/images");
        java.lang.String str6 = photographerData0.getPaypalID();
        java.lang.String str7 = photographerData0.getIban();
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test033");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getMessageSuccess();
        imageData2.setMobilePath("/users/update");
        imageData2.setPrice((java.lang.Double) 100.0d);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = imageData2.getUserData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(userData8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test034");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setMetaData("/user/becomePhotographer");
        image0.setDescription("null:1528137275958:f851f7955c556afa6678bd624fd107e4");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test035");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setMobileThumbPath("ROLE_CUSTOMER");
        java.lang.String str3 = image0.getMetaData();
        image0.setName("/users/update");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test036");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        image1.setThumbPath("/users/admin/{start}/{count}");
        image1.setUpdatedBy("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory9 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = null;
        collectionCategory9.setCollection(collection10);
        de.htw.sdf.photoplatform.persistence.model.Collection collection12 = null;
        collectionCategory9.setCollection(collection12);
        de.htw.sdf.photoplatform.persistence.model.Collection collection14 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user15 = collection14.getUser();
        java.lang.String str16 = collection14.getName();
        collectionCategory9.setCollection(collection14);
        collectionImage0.setCollection(collection14);
        java.util.Date date19 = null;
        collection14.setUpdatedAt(date19);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory21 = collection14.getCollectionCategories();
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(set_collectionCategory21);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test037");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        imageData2.setMime("/showcase");
        imageData2.setMessageSuccess("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData9 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str10 = userData9.getLastName();
        java.lang.String str11 = userData9.getEmail();
        java.lang.String str12 = userData9.getHomepage();
        imageData2.setUserData(userData9);
        java.lang.Long long14 = userData9.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test038");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData8 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array13 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long14 = new java.util.ArrayList<java.lang.Long>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long14, long_array13);
        collectionData8.setImageIds((java.util.List<java.lang.Long>) arraylist_long14);
        collectionData8.setName("/user/login");
        java.lang.String str19 = collectionData8.getDescription();
        java.util.List<java.lang.Long> list_long20 = collectionData8.getImageIds();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage21 = userImageDAOImpl0.getOwnerImages((long) 1, list_long20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNotNull(long_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(list_long20);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test039");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData1 = collectionData0.getUserdata();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str3 = userData2.getLastName();
        java.util.List<java.lang.String> list_str4 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData2.setRoles(list_str4);
        collectionData0.setUserdata(userData2);
        org.junit.Assert.assertNull(userData1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(list_str4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test040");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userRoleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager7 = userRoleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole8 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role9 = userRole8.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role10 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole8.setRole(role10);
        try {
            userRoleDAOImpl0.create(userRole8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager7);
        org.junit.Assert.assertNull(role9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test041");
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage0 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = userImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userImage0.getUser();
        org.junit.Assert.assertNull(image1);
        org.junit.Assert.assertNull(user2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test042");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        java.lang.String str2 = collectionData0.getName();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = collectionData3.getThumbnail();
        collectionData3.setPublic((java.lang.Boolean) false);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = null;
        collectionData3.setThumbnail(imageData7);
        de.htw.sdf.photoplatform.persistence.model.Image image9 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str10 = image9.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData11 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image9);
        imageData11.setMobilePath("/users/update");
        java.lang.Long long14 = imageData11.getCode();
        imageData11.setName("/users/update");
        collectionData3.setThumbnail(imageData11);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData18 = collectionData3.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData19 = collectionData3.getUserdata();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData20 = collectionData3.getThumbnail();
        java.lang.String str21 = collectionData3.getName();
        de.htw.sdf.photoplatform.persistence.model.UserImage[] userImage_array22 = new de.htw.sdf.photoplatform.persistence.model.UserImage[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserImage> arraylist_userImage23 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserImage>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage23, userImage_array22);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData25 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage23);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData26 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage23);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData27 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage23);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData28 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage23);
        collectionData3.setImages(list_imageData28);
        collectionData0.setImages(list_imageData28);
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(imageData4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNotNull(imageData18);
        org.junit.Assert.assertNull(userData19);
        org.junit.Assert.assertNotNull(imageData20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(userImage_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(list_imageData25);
        org.junit.Assert.assertNotNull(list_imageData26);
        org.junit.Assert.assertNotNull(list_imageData27);
        org.junit.Assert.assertNotNull(list_imageData28);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test043");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        java.lang.String str5 = userData0.getHomepage();
        java.lang.Boolean b6 = userData0.isBanned();
        java.lang.String str7 = userData0.getSwift();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test044");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        try {
            collectionDAOImpl0.deleteById((long) 11002);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test045");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        java.lang.String str3 = image1.getUpdatedBy();
        java.lang.String str4 = image1.getSmallThumbPath();
        java.lang.String str5 = image1.getUpdatedBy();
        image1.setCreatedBy("ROLE_ADMIN");
        java.lang.String str8 = image1.toString();
        de.htw.sdf.photoplatform.persistence.model.User user9 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b10 = user9.isAdmin();
        java.lang.String str11 = user9.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData12 = null;
        user9.setPhotographerData(photographerData12);
        user9.setAccountNonLocked(true);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage16 = imageManagerImpl0.addOwnerToImage(image1, user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str8.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test046");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        boolean b5 = image0.isEnabled();
        image0.setMobileThumbPath("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        java.lang.String str8 = image0.getPath();
        java.lang.String str9 = image0.getPath();
        image0.setName("/showcase");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test047");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData0.setRoles(list_str2);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str5 = userData4.getLastName();
        java.util.List<java.lang.String> list_str6 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData4.setRoles(list_str6);
        userData0.setRoles(list_str6);
        java.lang.String str9 = userData0.getEmail();
        java.lang.String str10 = userData0.getHomepage();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test048");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = null;
        collectionImage0.setCollection(collection5);
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user8 = collection7.getUser();
        collectionImage0.setCollection(collection7);
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = null;
        collectionImage0.setCollection(collection10);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test049");
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isBecomePhotographer();
        boolean b3 = user1.isAccountNonExpired();
        java.lang.String str5 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user1, (long) 11004);
        java.util.Date date6 = null;
        user1.setUpdatedAt(date6);
        user1.setFirstName("/collections/{collectionId}");
        try {
            boolean b10 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("/user/makeadmin/{id}", (org.springframework.security.core.userdetails.UserDetails) user1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "39c73479cb767c5a09248b3313c03447" + "'", str5.equals("39c73479cb767c5a09248b3313c03447"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test050");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.Boolean b4 = userData0.isEnabled();
        java.lang.String str5 = userData0.getFirstName();
        java.lang.String str6 = userData0.getHomepage();
        java.lang.String str7 = userData0.getFirstName();
        java.lang.String str8 = userData0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test051");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setMobileThumbPath("ROLE_CUSTOMER");
        image0.setCreatedBy("/collections/photographers");
        image0.setName("ROLE_PHOTOGRAPHER");
        boolean b7 = image0.isPublic();
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test052");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        image0.setThumbPath("/user/{name}");
        image0.setMetaData("ROLE_BECOME_PHOTOGRAPHER");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test053");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController1 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException4 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors3);
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController1.handleBadRequestException(badRequestException4, webRequest5);
        org.springframework.web.context.request.WebRequest webRequest7 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError8 = authenticationController0.handleBadRequestException(badRequestException4, webRequest7);
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister9 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister9.setPasswordConfirm("/collections/{collectionId}/images");
        userRegister9.setPassword("");
        org.springframework.validation.BindingResult bindingResult14 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData15 = authenticationController0.login((de.htw.sdf.photoplatform.webservice.dto.UserCredential) userRegister9, bindingResult14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test054");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array5 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver6 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver6, handlerExceptionResolver_array5);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver6);
        org.springframework.web.servlet.LocaleResolver localeResolver9 = application0.localeResolver();
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor10 = application0.localeChangeInterceptor();
        org.springframework.web.servlet.config.annotation.PathMatchConfigurer pathMatchConfigurer11 = null;
        application0.configurePathMatch(pathMatchConfigurer11);
        de.htw.sdf.photoplatform.Application application13 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer14 = null;
        application13.configureAsyncSupport(asyncSupportConfigurer14);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer16 = null;
        application13.configureAsyncSupport(asyncSupportConfigurer16);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array18 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver19 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver19, handlerExceptionResolver_array18);
        application13.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver19);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver19);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(localeResolver9);
        org.junit.Assert.assertNotNull(localeChangeInterceptor10);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array18);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test055");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        boolean b5 = image0.isEnabled();
        image0.setPath("ROLE_ADMIN");
        image0.setPrice((java.lang.Double) 10.0d);
        java.util.Date date10 = null;
        image0.setUpdatedAt(date10);
        image0.setThumbPath("");
        java.lang.String str14 = image0.getMime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test056");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls5 = null;
        imageDAOImpl0.setClazz(cls5);
        try {
            imageDAOImpl0.deleteById((long) 10001);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test057");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setPasswordConfirm("/collections/{collectionId}/images");
        userRegister0.setPassword("");
        java.lang.String str5 = userRegister0.getEmail();
        userRegister0.setFirstName("bbd35e0331b2294504855572375f9bec");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test058");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = collectionDAOImpl0.getEntityManager();
        try {
            javax.persistence.Query query5 = collectionDAOImpl0.createQuery("null:1528137288598:ad8bd3d70b0b05c981518fa0961e2c2d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test059");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        user0.setAccountNonLocked(true);
        boolean b7 = user0.isEnabled();
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = new de.htw.sdf.photoplatform.webservice.dto.UserData(user0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test060");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls4 = null;
        imageDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = imageDAOImpl0.getEntityManager();
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test061");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        image1.setThumbPath("/users/admin/{start}/{count}");
        image1.setUpdatedBy("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory9 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = null;
        collectionCategory9.setCollection(collection10);
        de.htw.sdf.photoplatform.persistence.model.Collection collection12 = null;
        collectionCategory9.setCollection(collection12);
        de.htw.sdf.photoplatform.persistence.model.Collection collection14 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user15 = collection14.getUser();
        java.lang.String str16 = collection14.getName();
        collectionCategory9.setCollection(collection14);
        collectionImage0.setCollection(collection14);
        java.util.Date date19 = null;
        collection14.setUpdatedAt(date19);
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData21 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData(collection14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test062");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPasswordConfirm();
        userPasswordChange0.setPasswordConfirm("");
        java.lang.String str6 = userPasswordChange0.getPassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test063");
        de.htw.sdf.photoplatform.manager.impl.HashManagerImpl hashManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.HashManagerImpl();
        java.lang.String str2 = hashManagerImpl0.hash("49961de64838862febaeead9e5ed74a8");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "c6b1a776700c142c2308d9e211ec2604d74447a464b7bd416cbd43a82f0863c6a3d248fed0cbeb045d3aadff070cb1b731612d4d3fe9f8f566131d7f92804f6c" + "'", str2.equals("c6b1a776700c142c2308d9e211ec2604d74447a464b7bd416cbd43a82f0863c6a3d248fed0cbeb045d3aadff070cb1b731612d4d3fe9f8f566131d7f92804f6c"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test064");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls3 = null;
        userRoleDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userRoleDAOImpl0.getEntityManager();
        try {
            userRoleDAOImpl0.deleteById((long) 10000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test065");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls5 = null;
        collectionDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.Image image8 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image8.setCreatedBy("");
        image8.setPrice((java.lang.Double) 1.0d);
        java.lang.String str13 = image8.getDescription();
        java.lang.String str14 = image8.getMime();
        image8.setMobileThumbPath("/photographer/upload");
        boolean b17 = image8.isEnabled();
        image8.setPrice((java.lang.Double) 1.0d);
        collection7.setThumbnail(image8);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage21 = collection7.getCollectionImages();
        java.lang.String str22 = collection7.toString();
        java.lang.String str23 = collection7.toString();
        java.lang.String str24 = collection7.getName();
        try {
            collectionDAOImpl0.delete(collection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(set_collectionImage21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Collection{user=null, name='null'}" + "'", str22.equals("Collection{user=null, name='null'}"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Collection{user=null, name='null'}" + "'", str23.equals("Collection{user=null, name='null'}"));
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test066");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage9 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView10 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest7, httpServletResponse8, (java.lang.Object) userImage9, modelAndView10);
        java.util.Date date12 = userImage9.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.User user13 = new de.htw.sdf.photoplatform.persistence.model.User();
        user13.setEnabled(false);
        userImage9.setOwner(user13);
        java.lang.String str17 = user13.getPassword();
        java.lang.String str18 = user13.getUsername();
        user13.setLastName("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        boolean b21 = user13.isPhotographer();
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test067");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls3 = null;
        categoryDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = categoryDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category7 = categoryDAOImpl0.findByName("null:1528137265625:03bf1b2c50bffe4b6b17dad8841e9f70");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test068");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = userController0.getUserProfileData("null:1528137270629:cbd34b0779b1c1d7e1215815c5bcba0d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test069");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls3 = null;
        userRoleDAOImpl0.setClazz(cls3);
        try {
            userRoleDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test070");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        photographerData0.setCompany("/collections/showcase");
        java.lang.String str4 = photographerData0.getPhone();
        photographerData0.setHomepage("/collections/photographers/{start}/{count}");
        photographerData0.setIban("obfuscate");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test071");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setUsername("/api");
        user1.setUsername("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        boolean b8 = user1.isPhotographer();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard9 = user1.getAuthorities();
        java.lang.String str10 = user1.getPassword();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(collection_wildcard9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test072");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long6 = new java.util.ArrayList<java.lang.Long>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long6, long_array5);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long6);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData9 = collectionData0.getImages();
        de.htw.sdf.photoplatform.persistence.model.Image image10 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str11 = image10.getMime();
        java.lang.String str12 = image10.getUpdatedBy();
        java.lang.String str13 = image10.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData14 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image10);
        java.lang.Long long15 = imageData14.getId();
        collectionData0.setThumbnail(imageData14);
        collectionData0.setPublic((java.lang.Boolean) true);
        collectionData0.setDescription("hi!");
        de.htw.sdf.photoplatform.persistence.model.UserImage[] userImage_array21 = new de.htw.sdf.photoplatform.persistence.model.UserImage[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserImage> arraylist_userImage22 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserImage>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage22, userImage_array21);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData24 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage22);
        collectionData0.setImages(list_imageData24);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData26 = collectionData0.getThumbnail();
        java.lang.String str27 = imageData26.getMobilePath();
        org.junit.Assert.assertNotNull(long_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(list_imageData9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNotNull(userImage_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(list_imageData24);
        org.junit.Assert.assertNotNull(imageData26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test073");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long6 = new java.util.ArrayList<java.lang.Long>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long6, long_array5);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long6);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData9 = collectionData0.getImages();
        java.lang.String str10 = collectionData0.getDescription();
        collectionData0.setDescription("obfuscate");
        collectionData0.setPublic((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(long_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(list_imageData9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test074");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        collectionData0.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b4 = collectionData0.getPublic();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = collectionData0.getThumbnail();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(imageData5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test075");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        java.lang.String str5 = userData0.getHomepage();
        java.lang.Boolean b6 = userData0.isBanned();
        java.util.List<java.lang.String> list_str7 = userData0.getRoles();
        java.lang.String str8 = userData0.getSwift();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
        org.junit.Assert.assertNull(list_str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test076");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole6 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role7 = userRole6.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role8 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole6.setRole(role8);
        de.htw.sdf.photoplatform.persistence.model.Role role10 = userRole6.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role11 = null;
        userRole6.setRole(role11);
        de.htw.sdf.photoplatform.persistence.model.User user13 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b14 = user13.isAdmin();
        java.lang.String str15 = user13.getSecToken();
        boolean b16 = user13.isAccountNonLocked();
        boolean b17 = user13.isPhotographer();
        userRole6.setUser(user13);
        de.htw.sdf.photoplatform.persistence.model.Role role19 = userRole6.getRole();
        try {
            userRoleDAOImpl0.create(userRole6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(role7);
        org.junit.Assert.assertNotNull(role10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(role19);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test077");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        java.lang.String str5 = user0.toString();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard6 = user0.getAuthorities();
        java.lang.String str8 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user0, (long) 1);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str5.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertNull(collection_wildcard6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "aa0668324371e9b034306466d6abdba5" + "'", str8.equals("aa0668324371e9b034306466d6abdba5"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test078");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        try {
            javax.persistence.Query query4 = userDAOImpl0.createQuery("/collections/update");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test079");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        java.lang.String str1 = becomePhotographer0.getHomepage();
        becomePhotographer0.setPhone("9e8062a1d79d79e31daf17f2e0544261af391092c46033dfcfa4c0391b7eeeb6a8a498016e4c6924314fa3a526f390fd48523c8a280218f2104630a210b3a469");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test080");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.Role role3 = null;
        try {
            roleDAOImpl0.delete(role3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test081");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.Long long5 = imageData2.getCode();
        imageData2.setName("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = imageData2.getUserData();
        imageData2.setMetadata("Category{name='null'}");
        java.lang.String str11 = imageData2.getPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(userData8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test082");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        java.lang.String str3 = userData0.getHomepage();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str5 = userData4.getLastName();
        java.util.List<java.lang.String> list_str6 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData4.setRoles(list_str6);
        userData0.setRoles(list_str6);
        java.lang.String str9 = userData0.getLastName();
        userData0.setLastName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        userData0.setIban("null:1528137255129:74131369d5ab98a30139e53b9d69dc36");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test083");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors2);
        org.springframework.validation.Errors errors4 = badRequestException3.getErrors();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController0.handleBadRequestException(badRequestException3, webRequest5);
        try {
            java.lang.String str8 = photographerController0.deleteCollection((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test084");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = collectionDAOImpl0.getEntityManager();
        try {
            collectionDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test085");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        boolean b5 = user1.isRoleIncluded("39c73479cb767c5a09248b3313c03447");
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard6 = user1.getAuthorities();
        user1.setUpdatedBy("obfuscate");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(collection_wildcard6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test086");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setThumbPath("/users/admin/{start}/{count}");
        image0.setMime("/users/admin/{start}/{count}");
        image0.setMobileThumbPath("null:1528137264754:37059375c02a8fd63e589326ff8446ea");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test087");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        image5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str8 = image5.getSmallThumbPath();
        boolean b9 = image5.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData10 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image5);
        java.util.Date date11 = image5.getCreatedAt();
        org.junit.Assert.assertNotNull(image5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(imageData10);
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test088");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        boolean b2 = user0.isAdmin();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test089");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = null;
        collectionData0.setUserdata(userData2);
        java.lang.String str4 = collectionData0.getName();
        collectionData0.setName("/photographer/upload");
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test090");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = roleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole4 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role5 = userRole4.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role6 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole4.setRole(role6);
        de.htw.sdf.photoplatform.persistence.model.User user8 = userRole4.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user9 = userRole4.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user10 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b11 = user10.isAdmin();
        java.lang.String str12 = user10.getSecToken();
        userRole4.setUser(user10);
        de.htw.sdf.photoplatform.persistence.model.Role role14 = userRole4.getRole();
        de.htw.sdf.photoplatform.persistence.model.User user15 = null;
        userRole4.setUser(user15);
        de.htw.sdf.photoplatform.persistence.model.Role role17 = userRole4.getRole();
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role18 = roleDAOImpl0.update(role17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(role5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(role14);
        org.junit.Assert.assertNotNull(role17);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test091");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole6 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role7 = userRole6.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role8 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole6.setRole(role8);
        de.htw.sdf.photoplatform.persistence.model.User user10 = userRole6.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user11 = userRole6.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user12 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b13 = user12.isAdmin();
        java.lang.String str14 = user12.getSecToken();
        userRole6.setUser(user12);
        de.htw.sdf.photoplatform.persistence.model.User user16 = userRole6.getUser();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole17 = userRoleDAOImpl0.update(userRole6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(role7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(user16);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test092");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getIban();
        userData0.setEmail("/api");
        userData0.setPhone("ROLE_BECOME_PHOTOGRAPHER");
        java.lang.String str6 = userData0.getSecToken();
        userData0.setBanned(false);
        java.lang.String str9 = userData0.getSwift();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test093");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.Boolean b4 = userData0.isBanned();
        java.lang.String str5 = userData0.getIban();
        userData0.setPhone("null:1528137248666:32ad08d7594d28504f1460b47d9ec391");
        userData0.setHomepage("/users/update");
        userData0.setPaypalID("/api");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test094");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData1 = collectionData0.getUserdata();
        long long2 = collectionData0.getId();
        java.lang.Long[] long_array8 = new java.lang.Long[] { 10L, 1L, 100L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long9 = new java.util.ArrayList<java.lang.Long>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long9, long_array8);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long9);
        de.htw.sdf.photoplatform.persistence.model.Image image12 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData13 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image12);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData14 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image12);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData15 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image12);
        collectionData0.setThumbnail(imageData15);
        org.junit.Assert.assertNull(userData1);
        org.junit.Assert.assertTrue(long2 == 0L);
        org.junit.Assert.assertNotNull(long_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(imageData13);
        org.junit.Assert.assertNotNull(imageData15);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test095");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerData3.getCollections();
        photographerData3.setCompany("/collections/showcase");
        user0.setPhotographerData(photographerData3);
        java.lang.String str8 = user0.getFirstName();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(list_collection4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test096");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage9 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView10 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest7, httpServletResponse8, (java.lang.Object) userImage9, modelAndView10);
        de.htw.sdf.photoplatform.persistence.model.Image image12 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str13 = image12.getMime();
        java.lang.String str14 = image12.getUpdatedBy();
        java.lang.String str15 = image12.getSmallThumbPath();
        image12.setCreatedBy("/collections/addimage");
        image12.setEnabled(true);
        userImage9.setImage(image12);
        de.htw.sdf.photoplatform.persistence.model.User user21 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b22 = user21.isAdmin();
        user21.setPassword("ROLE_PHOTOGRAPHER");
        boolean b26 = user21.isRoleIncluded("/user/becomePhotographer");
        boolean b27 = user21.isCredentialsNonExpired();
        userImage9.setUser(user21);
        user21.setFirstName("null:1528137288660:1a2c7fbd81ed38e3fb25d5bcfea287cf");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test097");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        java.lang.String str2 = photographerData0.getIban();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection3 = photographerData0.getCollections();
        photographerData0.setPhone("abe34aa080ac4421665a72329e218ae76e6eae82d181635ba4a5f8548e70866084fd9cd5c793d5b3a4165763081b95813d4bdb3d679b27d667fea0502caa5a9b");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData6 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection7 = photographerData6.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array8 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection9 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection9, collection_array8);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData11 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection9);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData12 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection9);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData13 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection9);
        photographerData6.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection9);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection9);
        photographerData0.setHomepage("");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData18 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection19 = photographerData18.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array20 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection21 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection21, collection_array20);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData23 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection21);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData24 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection21);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData25 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection21);
        photographerData18.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection21);
        java.lang.String str27 = photographerData18.getPhone();
        photographerData18.setPhone("/collections/{collectionId}/images");
        java.lang.String str30 = photographerData18.getHomepage();
        java.lang.String str31 = photographerData18.getIban();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array32 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection33 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection33, collection_array32);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData35 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection33);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData36 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection33);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData37 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection33);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData38 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection33);
        photographerData18.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection33);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection33);
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(list_collection3);
        org.junit.Assert.assertNull(list_collection7);
        org.junit.Assert.assertNotNull(collection_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(list_collectionData11);
        org.junit.Assert.assertNotNull(list_collectionData12);
        org.junit.Assert.assertNotNull(list_collectionData13);
        org.junit.Assert.assertNull(list_collection19);
        org.junit.Assert.assertNotNull(collection_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(list_collectionData23);
        org.junit.Assert.assertNotNull(list_collectionData24);
        org.junit.Assert.assertNotNull(list_collectionData25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(collection_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(list_collectionData35);
        org.junit.Assert.assertNotNull(list_collectionData36);
        org.junit.Assert.assertNotNull(list_collectionData37);
        org.junit.Assert.assertNotNull(list_collectionData38);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test098");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        java.lang.String str5 = becomePhotographer0.getCompany();
        becomePhotographer0.setIban("/collections/addimage");
        becomePhotographer0.setSwift("null:1528137269023:a165acffd0d2c313e6fa2c2dbbd2dc76");
        becomePhotographer0.setPaypalID("null:1528137264754:37059375c02a8fd63e589326ff8446ea");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test099");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = image0.getCreatedBy();
        image0.setThumbPath("/user/login");
        java.util.Date date5 = null;
        image0.setUpdatedAt(date5);
        java.util.Date date7 = null;
        image0.setCreatedAt(date7);
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test100");
        de.htw.sdf.photoplatform.persistence.model.Role role0 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role0.setName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        role0.setName("hi!");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test101");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        java.lang.String str5 = becomePhotographer0.getCompany();
        becomePhotographer0.setIban("/collections/addimage");
        java.lang.String str8 = becomePhotographer0.getHomepage();
        becomePhotographer0.setCompany("ec7908a224b49d37ffc84c612f320838");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test102");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setAccountNonLocked(true);
        boolean b6 = user1.isAccountNonExpired();
        java.lang.String str7 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user1);
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData8 = user1.getPhotographerData();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null:1528137293936:a0988808b1e86f8e45491a6365ca0d34" + "'", str7.equals("null:1528137293936:a0988808b1e86f8e45491a6365ca0d34"));
        org.junit.Assert.assertNull(photographerData8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test103");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        image0.setName("/collections/create");
        image0.setDescription("obfuscate");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test104");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setId((java.lang.Long) 0L);
        java.lang.String str3 = userData0.getSecToken();
        java.lang.Long long4 = userData0.getId();
        userData0.setCompany("ROLE_ADMIN");
        userData0.setSwift("/user/register");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test105");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.Boolean b4 = userData0.isEnabled();
        userData0.setPhone("/collections/photographers");
        java.lang.Long long7 = userData0.getId();
        java.lang.String str8 = userData0.getPaypalID();
        java.lang.Boolean b9 = userData0.isBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test106");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls6 = null;
        collectionImageDAOImpl0.setClazz(cls6);
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test107");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str5 = imageData4.getMime();
        imageData4.setPrice((java.lang.Double) 1.0d);
        java.lang.Double d8 = imageData4.getPrice();
        imageData4.setMessageFailed("hi!");
        imageData4.setDescription("/user/login");
        java.lang.String str13 = imageData4.getSmallPath();
        java.lang.String str14 = imageData4.getMessageSuccess();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + d8 + "' != '" + 1.0d + "'", d8.equals(1.0d));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test108");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls6 = null;
        userImageDAOImpl0.setClazz(cls6);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage9 = userImageDAOImpl0.findOne((long) 11002);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test109");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        java.lang.String str5 = user0.toString();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard6 = user0.getAuthorities();
        java.lang.String str7 = user0.getFirstName();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str5.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertNull(collection_wildcard6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test110");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController1 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException4 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors3);
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController1.handleBadRequestException(badRequestException4, webRequest5);
        org.springframework.web.context.request.WebRequest webRequest7 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError8 = authenticationController0.handleBadRequestException(badRequestException4, webRequest7);
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController9 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors11 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException12 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors11);
        org.springframework.validation.Errors errors14 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException15 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors14);
        int i16 = notFoundException15.getCode();
        notFoundException12.addSuppressed((java.lang.Throwable) notFoundException15);
        org.springframework.web.context.request.WebRequest webRequest18 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError19 = imageController9.handleNotFoundException(notFoundException15, webRequest18);
        java.lang.Throwable[] throwable_array20 = notFoundException15.getSuppressed();
        org.springframework.web.context.request.WebRequest webRequest21 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError22 = authenticationController0.handleNotFoundException(notFoundException15, webRequest21);
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController23 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException25 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER");
        org.springframework.web.context.request.WebRequest webRequest26 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError27 = photographerController23.handleBadRequestException(badRequestException25, webRequest26);
        org.springframework.web.context.request.WebRequest webRequest28 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError29 = authenticationController0.handleBadRequestException(badRequestException25, webRequest28);
        java.lang.RuntimeException runtimeException30 = null;
        try {
            authenticationController0.handleBaseException(runtimeException30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
        org.junit.Assert.assertTrue(i16 == 10001);
        org.junit.Assert.assertNotNull(responseError19);
        org.junit.Assert.assertNotNull(throwable_array20);
        org.junit.Assert.assertNotNull(responseError22);
        org.junit.Assert.assertNotNull(responseError27);
        org.junit.Assert.assertNotNull(responseError29);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test111");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData4 = null;
        user1.setPhotographerData(photographerData4);
        user1.setAccountNonLocked(true);
        boolean b8 = user1.isEnabled();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage11 = imageManagerImpl0.getPhotographImages(user1, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test112");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = collectionData3.getThumbnail();
        collectionData3.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b7 = collectionData3.getPublic();
        de.htw.sdf.photoplatform.persistence.model.User user8 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b9 = user8.isAdmin();
        java.lang.String str10 = user8.getSecToken();
        boolean b11 = user8.isAccountNonLocked();
        boolean b12 = user8.isCredentialsNonExpired();
        java.lang.String str13 = user8.getLastName();
        java.lang.String str14 = user8.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole15 = user8.getUserRoles();
        de.htw.sdf.photoplatform.persistence.model.Collection collection16 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData3, user8);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage17 = collection16.getCollectionImages();
        try {
            collectionDAOImpl0.delete(collection16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(imageData4);
        org.junit.Assert.assertTrue("'" + b7 + "' != '" + false + "'", b7.equals(false));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(list_userRole15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(set_collectionImage17);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test113");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        imageData2.setMessageFailed("/showcase");
        java.lang.String str7 = imageData2.getMime();
        java.lang.String str8 = imageData2.getMime();
        imageData2.setThumbnailPath("Image{name='Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}', path='null', isPublic=false, enabled=false, price=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test114");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        java.lang.String str5 = userData0.getHomepage();
        java.util.List<java.lang.String> list_str6 = userData0.getRoles();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list_str6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test115");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        try {
            collectionDAOImpl0.deleteById(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test116");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setUsername("/api");
        java.lang.String str6 = user1.getFirstName();
        boolean b8 = user1.isRoleIncluded("/user/becomePhotographer");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test117");
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory0 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = null;
        collectionCategory0.setCollection(collection1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = null;
        collectionCategory0.setCollection(collection3);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user6 = collection5.getUser();
        java.lang.String str7 = collection5.getName();
        collectionCategory0.setCollection(collection5);
        de.htw.sdf.photoplatform.persistence.model.Image image9 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str10 = image9.getMime();
        image9.setMobileThumbPath("");
        image9.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long15 = image9.getId();
        java.lang.String str16 = image9.getThumbPath();
        collection5.setThumbnail(image9);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test118");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController1 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException4 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors3);
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController1.handleBadRequestException(badRequestException4, webRequest5);
        org.springframework.web.context.request.WebRequest webRequest7 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError8 = authenticationController0.handleBadRequestException(badRequestException4, webRequest7);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user10 = authenticationController0.userByName("/user/enablephotographer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test119");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getMetadata();
        imageData2.setMessageSuccess("/showcase");
        imageData2.setMime("/users/update");
        java.lang.String str11 = imageData2.getMetadata();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test120");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array3 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler4 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler4, handlerMethodReturnValueHandler_array3);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler4);
        org.springframework.format.FormatterRegistry formatterRegistry7 = null;
        application0.addFormatters(formatterRegistry7);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer9 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer9);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer11 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer11);
        org.springframework.web.servlet.config.annotation.PathMatchConfigurer pathMatchConfigurer13 = null;
        application0.configurePathMatch(pathMatchConfigurer13);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer15 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer15);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer17 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer17);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test121");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str3 = userRegister0.getPasswordConfirm();
        java.lang.String str4 = userRegister0.getPasswordConfirm();
        java.lang.String str5 = userRegister0.getPasswordConfirm();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test122");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors2);
        org.springframework.validation.Errors errors4 = badRequestException3.getErrors();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController0.handleBadRequestException(badRequestException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController7 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors9 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException10 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors9);
        org.springframework.web.context.request.WebRequest webRequest11 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError12 = photographerController7.handleBadRequestException(badRequestException10, webRequest11);
        int i13 = badRequestException10.getCode();
        org.springframework.web.context.request.WebRequest webRequest14 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError15 = photographerController0.handleBadRequestException(badRequestException10, webRequest14);
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController16 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors18 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException19 = new de.htw.sdf.photoplatform.exception.NotFoundException("null:1528137265625:03bf1b2c50bffe4b6b17dad8841e9f70", errors18);
        org.springframework.web.context.request.WebRequest webRequest20 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError21 = imageController16.handleNotFoundException(notFoundException19, webRequest20);
        org.springframework.web.context.request.WebRequest webRequest22 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError23 = photographerController0.handleNotFoundException(notFoundException19, webRequest22);
        try {
            java.lang.String str25 = photographerController0.deletePhotographersImage((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError12);
        org.junit.Assert.assertTrue(i13 == 10000);
        org.junit.Assert.assertNotNull(responseError15);
        org.junit.Assert.assertNotNull(responseError21);
        org.junit.Assert.assertNotNull(responseError23);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test123");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getSecToken();
        java.lang.Boolean b5 = userData0.isAdmin();
        java.lang.Boolean b6 = userData0.isBanned();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData7 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str8 = userData7.getLastName();
        java.util.List<java.lang.String> list_str9 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData7.setRoles(list_str9);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData11 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str12 = userData11.getLastName();
        java.util.List<java.lang.String> list_str13 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData11.setRoles(list_str13);
        userData7.setRoles(list_str13);
        userData0.setRoles(list_str13);
        userData0.setAdmin(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list_str13);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test124");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setUsername("/api");
        boolean b6 = user1.isAccountNonLocked();
        java.lang.String str7 = user1.getSecToken();
        boolean b8 = user1.isAccountNonExpired();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test125");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry6 = null;
        application0.addResourceHandlers(resourceHandlerRegistry6);
        org.springframework.web.servlet.LocaleResolver localeResolver8 = application0.localeResolver();
        org.springframework.web.servlet.config.annotation.PathMatchConfigurer pathMatchConfigurer9 = null;
        application0.configurePathMatch(pathMatchConfigurer9);
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry11 = null;
        application0.addResourceHandlers(resourceHandlerRegistry11);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(localeResolver8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test126");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role4 = roleDAOImpl0.findByName("null:1528137269023:a165acffd0d2c313e6fa2c2dbbd2dc76");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test127");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.User user4 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b5 = user4.isAdmin();
        java.lang.String str6 = user4.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData7 = null;
        user4.setPhotographerData(photographerData7);
        java.lang.String str9 = user4.toString();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard10 = user4.getAuthorities();
        boolean b12 = user4.isRoleIncluded("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        user4.setSecToken("Category{name='null'}");
        java.lang.String str15 = user4.getFirstName();
        try {
            userDAOImpl0.delete(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str9.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertNull(collection_wildcard10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test128");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory4 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = null;
        collectionCategory4.setCollection(collection5);
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = null;
        collectionCategory4.setCollection(collection7);
        de.htw.sdf.photoplatform.persistence.model.Collection collection9 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user10 = collection9.getUser();
        java.lang.String str11 = collection9.getName();
        collectionCategory4.setCollection(collection9);
        try {
            collectionCategoryDAOImpl0.delete(collectionCategory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test129");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getSecToken();
        java.lang.Boolean b5 = userData0.isAdmin();
        java.lang.Boolean b6 = userData0.isBanned();
        userData0.setBanned(false);
        userData0.setPhone("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_CUSTOMER");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test130");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        java.lang.String str3 = userData0.getHomepage();
        java.lang.String str4 = userData0.getHomepage();
        java.lang.String str5 = userData0.getCompany();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test131");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = null;
        collectionData0.setUserdata(userData2);
        java.lang.String str4 = collectionData0.getName();
        long long5 = collectionData0.getId();
        collectionData0.setId(1L);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str9 = userData8.getLastName();
        collectionData0.setUserdata(userData8);
        collectionData0.setName("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData13 = collectionData0.getUserdata();
        java.util.List<java.lang.String> list_str14 = userData13.getRoles();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(userData13);
        org.junit.Assert.assertNull(list_str14);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test132");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        collectionData0.setPublic((java.lang.Boolean) false);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = null;
        collectionData0.setThumbnail(imageData4);
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str7 = image6.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image6);
        imageData8.setMobilePath("/users/update");
        java.lang.Long long11 = imageData8.getCode();
        imageData8.setName("/users/update");
        collectionData0.setThumbnail(imageData8);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData15 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData15.setId((java.lang.Long) 0L);
        userData15.setEnabled(false);
        userData15.setAdmin(false);
        userData15.setId((java.lang.Long) 100L);
        collectionData0.setUserdata(userData15);
        collectionData0.setId((long) (-1));
        java.util.List<java.lang.Long> list_long27 = collectionData0.getImageIds();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(list_long27);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test133");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setMetaData("/user/becomePhotographer");
        java.lang.Long long6 = image0.getId();
        java.lang.String str7 = image0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test134");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array5 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver6 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver6, handlerExceptionResolver_array5);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver6);
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor9 = application0.localeChangeInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse11 = null;
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange12 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        org.springframework.web.servlet.ModelAndView modelAndView13 = null;
        localeChangeInterceptor9.postHandle(httpServletRequest10, httpServletResponse11, (java.lang.Object) userPasswordChange12, modelAndView13);
        javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse16 = null;
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData17 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData18 = collectionData17.getThumbnail();
        collectionData17.setPublic((java.lang.Boolean) false);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData21 = null;
        collectionData17.setThumbnail(imageData21);
        de.htw.sdf.photoplatform.persistence.model.Image image23 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str24 = image23.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData25 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image23);
        imageData25.setMobilePath("/users/update");
        java.lang.Long long28 = imageData25.getCode();
        imageData25.setName("/users/update");
        collectionData17.setThumbnail(imageData25);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData32 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData32.setId((java.lang.Long) 0L);
        userData32.setEnabled(false);
        userData32.setAdmin(false);
        userData32.setId((java.lang.Long) 100L);
        collectionData17.setUserdata(userData32);
        java.lang.Boolean b42 = userData32.isEnabled();
        org.springframework.web.servlet.ModelAndView modelAndView43 = null;
        localeChangeInterceptor9.postHandle(httpServletRequest15, httpServletResponse16, (java.lang.Object) b42, modelAndView43);
        javax.servlet.http.HttpServletRequest httpServletRequest45 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse46 = null;
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer47 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        java.lang.String str48 = becomePhotographer47.getHomepage();
        java.lang.String str49 = becomePhotographer47.getCompany();
        becomePhotographer47.setCompany("/collections/{collectionId}/images");
        org.springframework.web.servlet.ModelAndView modelAndView52 = null;
        localeChangeInterceptor9.postHandle(httpServletRequest45, httpServletResponse46, (java.lang.Object) becomePhotographer47, modelAndView52);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(localeChangeInterceptor9);
        org.junit.Assert.assertNull(imageData18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(long28);
        org.junit.Assert.assertTrue("'" + b42 + "' != '" + false + "'", b42.equals(false));
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test135");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = userController0.getUserProfileData("77ce3535f163da232981f0d31864a601ca7857e39a64df07a354c6860cf425727ccc18a2328f2e2bfe2e86f09067f3be6c7841e138ba6b4e2d0fea3d964ab0d9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test136");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor1 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest2 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse3 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor1.afterCompletion(httpServletRequest2, httpServletResponse3, (java.lang.Object) 10, (java.lang.Exception) notFoundException6);
        javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse9 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage10 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView11 = null;
        requestLoggerInterceptor1.postHandle(httpServletRequest8, httpServletResponse9, (java.lang.Object) userImage10, modelAndView11);
        de.htw.sdf.photoplatform.persistence.model.Image image13 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str14 = image13.getMime();
        java.lang.String str15 = image13.getUpdatedBy();
        java.lang.String str16 = image13.getSmallThumbPath();
        image13.setCreatedBy("/collections/addimage");
        image13.setEnabled(true);
        userImage10.setImage(image13);
        de.htw.sdf.photoplatform.persistence.model.User user22 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b23 = user22.isAdmin();
        user22.setPassword("ROLE_PHOTOGRAPHER");
        boolean b27 = user22.isRoleIncluded("/user/becomePhotographer");
        boolean b28 = user22.isCredentialsNonExpired();
        userImage10.setUser(user22);
        java.lang.String str30 = user22.getLastName();
        java.lang.String str31 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user22);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user32 = userManagerImpl0.update(user22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "null:1528137294482:f7980f901922497a4bb147d3b0a0f56d" + "'", str31.equals("null:1528137294482:f7980f901922497a4bb147d3b0a0f56d"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test137");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls1 = null;
        categoryDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category4 = categoryDAOImpl0.findOne((long) 400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test138");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setMobileThumbPath("ROLE_CUSTOMER");
        image0.setCreatedBy("/collections/photographers");
        image0.setName("ROLE_PHOTOGRAPHER");
        java.util.Date date7 = null;
        image0.setUpdatedAt(date7);
        boolean b9 = image0.isPublic();
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test139");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        imageData2.setMime("/showcase");
        imageData2.setMessageSuccess("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str9 = imageData2.getPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test140");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.makeAdmin("null:1528137255129:74131369d5ab98a30139e53b9d69dc36");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test141");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image9 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str10 = image9.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData11 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image9);
        imageData11.setName("");
        java.lang.Double d14 = imageData11.getPrice();
        imageData11.setName("/user/enablephotographer");
        org.springframework.web.servlet.ModelAndView modelAndView17 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest7, httpServletResponse8, (java.lang.Object) "/user/enablephotographer", modelAndView17);
        javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse20 = null;
        org.springframework.validation.Errors errors24 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError25 = new de.htw.sdf.photoplatform.exception.common.ResponseError((int) (byte) 1, (int) (byte) 0, "/users/admin/{start}/{count}", errors24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str26 = responseError25.getErrors();
        requestLoggerInterceptor0.afterConcurrentHandlingStarted(httpServletRequest19, httpServletResponse20, (java.lang.Object) map_str_list_str26);
        javax.servlet.http.HttpServletRequest httpServletRequest28 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse29 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image30 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData31 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image30);
        try {
            boolean b32 = requestLoggerInterceptor0.preHandle(httpServletRequest28, httpServletResponse29, (java.lang.Object) imageData31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(d14);
        org.junit.Assert.assertNotNull(map_str_list_str26);
        org.junit.Assert.assertNotNull(imageData31);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test142");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        java.lang.String str2 = userRegister0.getFirstName();
        userRegister0.setEmail("null:1528137288598:ad8bd3d70b0b05c981518fa0961e2c2d");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test143");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setPassword("ROLE_PHOTOGRAPHER");
        boolean b5 = user0.isRoleIncluded("/user/becomePhotographer");
        boolean b6 = user0.isCredentialsNonExpired();
        java.lang.String str7 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user0);
        java.util.Date date8 = user0.getUpdatedAt();
        boolean b9 = user0.isAccountNonExpired();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null:1528137294582:dab166dacc3695a720d9c3367ef6e28e" + "'", str7.equals("null:1528137294582:dab166dacc3695a720d9c3367ef6e28e"));
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test144");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer1 = null;
        application0.configureDefaultServletHandling(defaultServletHandlerConfigurer1);
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array3 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver4 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver4, handlerMethodArgumentResolver_array3);
        application0.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver4);
        org.springframework.validation.MessageCodesResolver messageCodesResolver7 = application0.getMessageCodesResolver();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer8 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer8);
        org.springframework.web.servlet.config.annotation.ViewControllerRegistry viewControllerRegistry10 = null;
        application0.addViewControllers(viewControllerRegistry10);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(messageCodesResolver7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test145");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        boolean b4 = user0.isCredentialsNonExpired();
        boolean b5 = user0.isCredentialsNonExpired();
        java.lang.String str6 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user0);
        user0.setAccountNonLocked(false);
        java.lang.String str10 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user0, (long) 'a');
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null:1528137294610:43443b4d31d40fe9ba18ff14b1e6cb37" + "'", str6.equals("null:1528137294610:43443b4d31d40fe9ba18ff14b1e6cb37"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "93e210c4650e33acb58f8d1cfa9bbe56" + "'", str10.equals("93e210c4650e33acb58f8d1cfa9bbe56"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test146");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setUsername("/api");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData7 = null;
        user2.setPhotographerData(photographerData7);
        user2.setPassword("/user/register");
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage13 = userImageDAOImpl0.getPhotographImages(user2, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test147");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        de.htw.sdf.photoplatform.Application application3 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer4 = null;
        application3.configureContentNegotiation(contentNegotiationConfigurer4);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array6 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler7 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler7, handlerMethodReturnValueHandler_array6);
        application3.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler7);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler7);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory11 = application0.servletContainer();
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory11);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test148");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls3 = null;
        categoryDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = categoryDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category7 = categoryDAOImpl0.findByName("ROLE_ADMIN");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test149");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPasswordConfirm();
        java.lang.String str4 = userPasswordChange0.getPassword();
        java.lang.String str5 = userPasswordChange0.getNewPassword();
        java.lang.String str6 = userPasswordChange0.getNewPassword();
        java.lang.String str7 = userPasswordChange0.getPassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "/showcase" + "'", str5.equals("/showcase"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "/showcase" + "'", str6.equals("/showcase"));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test150");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setName("");
        java.lang.Double d5 = imageData2.getPrice();
        java.lang.Long long6 = imageData2.getCode();
        imageData2.setCode((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(d5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test151");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole3 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role4 = userRole3.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role5 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole3.setRole(role5);
        role5.setName("/collections/create");
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role9 = roleDAOImpl0.update(role5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(role4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test152");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getPath();
        imageData2.setPath("/photographer/upload");
        imageData2.setMime("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test153");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError(10, (int) (byte) 0, "/collections/photographers/{start}/{count}", errors3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test154");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls7 = null;
        userImageDAOImpl0.setClazz(cls7);
        javax.persistence.EntityManager entityManager9 = userImageDAOImpl0.getEntityManager();
        try {
            javax.persistence.Query query11 = userImageDAOImpl0.createQuery("aa0668324371e9b034306466d6abdba5");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager9);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test155");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getMetadata();
        java.lang.String str7 = imageData2.getMetadata();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str9 = userData8.getLastName();
        java.util.List<java.lang.String> list_str10 = userData8.getRoles();
        java.lang.String str11 = userData8.getEmail();
        userData8.setCompany("/collections/{collectionId}/images");
        userData8.setBanned(false);
        java.lang.String str16 = userData8.getPhone();
        imageData2.setUserData(userData8);
        userData8.setPhone("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(list_str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test156");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        boolean b5 = image0.isEnabled();
        image0.setPath("ROLE_ADMIN");
        image0.setPrice((java.lang.Double) 10.0d);
        java.util.Date date10 = null;
        image0.setUpdatedAt(date10);
        image0.setThumbPath("");
        image0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test157");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        java.lang.String str3 = becomePhotographer0.getIban();
        becomePhotographer0.setPaypalID("ROLE_CUSTOMER");
        becomePhotographer0.setCompany("ec7908a224b49d37ffc84c612f320838");
        becomePhotographer0.setHomepage("null:1528137264754:37059375c02a8fd63e589326ff8446ea");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test158");
        de.htw.sdf.photoplatform.manager.impl.HashManagerImpl hashManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.HashManagerImpl();
        java.lang.String str2 = hashManagerImpl0.hash("/user/becomePhotographer");
        java.lang.String str4 = hashManagerImpl0.hash("Image{name='null', path='', isPublic=false, enabled=false, price=1.0}");
        try {
            java.lang.String str7 = hashManagerImpl0.hash("/users/profile/{userId}", "ec7908a224b49d37ffc84c612f320838");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c" + "'", str2.equals("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "77ce3535f163da232981f0d31864a601ca7857e39a64df07a354c6860cf425727ccc18a2328f2e2bfe2e86f09067f3be6c7841e138ba6b4e2d0fea3d964ab0d9" + "'", str4.equals("77ce3535f163da232981f0d31864a601ca7857e39a64df07a354c6860cf425727ccc18a2328f2e2bfe2e86f09067f3be6c7841e138ba6b4e2d0fea3d964ab0d9"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test159");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer7 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer7.setPhone("ROLE_ADMIN");
        becomePhotographer7.setPhone("/user/makeadmin/{id}");
        becomePhotographer7.setIban("ROLE_ADMIN");
        java.lang.String str14 = becomePhotographer7.getPhone();
        becomePhotographer7.setHomepage("ROLE_PHOTOGRAPHER");
        org.springframework.validation.BindingResult bindingResult17 = null;
        try {
            boolean b18 = userController0.becomePhotographer(becomePhotographer7, bindingResult17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "/user/makeadmin/{id}" + "'", str14.equals("/user/makeadmin/{id}"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test160");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        collectionData0.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b4 = collectionData0.getPublic();
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isAdmin();
        java.lang.String str7 = user5.getSecToken();
        boolean b8 = user5.isAccountNonLocked();
        boolean b9 = user5.isCredentialsNonExpired();
        java.lang.String str10 = user5.getLastName();
        java.lang.String str11 = user5.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole12 = user5.getUserRoles();
        de.htw.sdf.photoplatform.persistence.model.Collection collection13 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData0, user5);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory14 = collection13.getCollectionCategories();
        java.lang.String str15 = collection13.getName();
        de.htw.sdf.photoplatform.persistence.model.User user16 = collection13.getUser();
        user16.setSecToken("Image{name='null', path='null', isPublic=false, enabled=false, price=-1.0}");
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(list_userRole12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(set_collectionCategory14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(user16);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test161");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController1 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException4 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors3);
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController1.handleBadRequestException(badRequestException4, webRequest5);
        org.springframework.web.context.request.WebRequest webRequest7 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError8 = authenticationController0.handleBadRequestException(badRequestException4, webRequest7);
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController9 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors11 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException12 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors11);
        org.springframework.validation.Errors errors14 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException15 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors14);
        int i16 = notFoundException15.getCode();
        notFoundException12.addSuppressed((java.lang.Throwable) notFoundException15);
        org.springframework.web.context.request.WebRequest webRequest18 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError19 = imageController9.handleNotFoundException(notFoundException15, webRequest18);
        java.lang.Throwable[] throwable_array20 = notFoundException15.getSuppressed();
        org.springframework.web.context.request.WebRequest webRequest21 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError22 = authenticationController0.handleNotFoundException(notFoundException15, webRequest21);
        org.springframework.validation.Errors errors24 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException25 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors24);
        int i26 = notFoundException25.getCode();
        java.lang.Throwable[] throwable_array27 = notFoundException25.getSuppressed();
        org.springframework.validation.Errors errors29 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException30 = new de.htw.sdf.photoplatform.exception.BadRequestException("", errors29);
        org.springframework.validation.Errors errors32 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException33 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors32);
        int i34 = notFoundException33.getCode();
        java.lang.Throwable[] throwable_array35 = notFoundException33.getSuppressed();
        badRequestException30.addSuppressed((java.lang.Throwable) notFoundException33);
        notFoundException25.addSuppressed((java.lang.Throwable) notFoundException33);
        org.springframework.web.context.request.WebRequest webRequest38 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError39 = authenticationController0.handleNotFoundException(notFoundException33, webRequest38);
        java.lang.RuntimeException runtimeException40 = null;
        try {
            authenticationController0.handleBaseException(runtimeException40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
        org.junit.Assert.assertTrue(i16 == 10001);
        org.junit.Assert.assertNotNull(responseError19);
        org.junit.Assert.assertNotNull(throwable_array20);
        org.junit.Assert.assertNotNull(responseError22);
        org.junit.Assert.assertTrue(i26 == 10001);
        org.junit.Assert.assertNotNull(throwable_array27);
        org.junit.Assert.assertTrue(i34 == 10001);
        org.junit.Assert.assertNotNull(throwable_array35);
        org.junit.Assert.assertNotNull(responseError39);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test162");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getEmail();
        userData0.setCompany("/collections/{collectionId}/images");
        userData0.setIban("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str8 = userData0.getPaypalID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test163");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        image0.setMobileThumbPath("");
        image0.setPublic(true);
        image0.setDescription("/api");
        image0.setMobileThumbPath("Collection{user=null, name='null'}");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test164");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors2);
        org.springframework.validation.Errors errors4 = badRequestException3.getErrors();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController0.handleBadRequestException(badRequestException3, webRequest5);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData9 = photographerController0.getShowcase((int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test165");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor5 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException10 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor5.afterCompletion(httpServletRequest6, httpServletResponse7, (java.lang.Object) 10, (java.lang.Exception) notFoundException10);
        javax.servlet.http.HttpServletRequest httpServletRequest12 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse13 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage14 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView15 = null;
        requestLoggerInterceptor5.postHandle(httpServletRequest12, httpServletResponse13, (java.lang.Object) userImage14, modelAndView15);
        java.util.Date date17 = userImage14.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.User user18 = new de.htw.sdf.photoplatform.persistence.model.User();
        user18.setEnabled(false);
        userImage14.setOwner(user18);
        java.lang.String str22 = user18.getPassword();
        boolean b24 = user18.isRoleIncluded("/user/makeadmin/{id}");
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image25 = imageManagerImpl0.update((java.lang.Long) 100L, "null:1528137294582:dab166dacc3695a720d9c3367ef6e28e", (java.lang.Double) 10.0d, "39c73479cb767c5a09248b3313c03447", user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test166");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls3 = null;
        categoryDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = categoryDAOImpl0.getEntityManager();
        try {
            categoryDAOImpl0.deleteById((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test167");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls5 = null;
        collectionDAOImpl0.setClazz(cls5);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection7 = collectionDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test168");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls5 = null;
        collectionDAOImpl0.setClazz(cls5);
        try {
            collectionDAOImpl0.deleteById((long) 11003);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test169");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole3 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role4 = userRole3.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role5 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole3.setRole(role5);
        de.htw.sdf.photoplatform.persistence.model.User user7 = userRole3.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user8 = userRole3.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user9 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b10 = user9.isAdmin();
        java.lang.String str11 = user9.getSecToken();
        userRole3.setUser(user9);
        de.htw.sdf.photoplatform.persistence.model.Role role13 = userRole3.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role14 = userRole3.getRole();
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role15 = roleDAOImpl0.update(role14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(role4);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(role13);
        org.junit.Assert.assertNotNull(role14);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test170");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        boolean b5 = image0.isEnabled();
        image0.setPath("ROLE_ADMIN");
        image0.setPrice((java.lang.Double) 10.0d);
        java.util.Date date10 = null;
        image0.setUpdatedAt(date10);
        image0.setPrice((java.lang.Double) (-1.0d));
        image0.setDescription("null:1528137275958:f851f7955c556afa6678bd624fd107e4");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test171");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.Boolean b4 = userData0.isEnabled();
        userData0.setPhone("/collections/photographers");
        userData0.setLastName("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        java.lang.String str9 = userData0.getCompany();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test172");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls5 = null;
        collectionDAOImpl0.setClazz(cls5);
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection9 = collectionDAOImpl0.findByUserAndCollectionId(1L, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test173");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        java.lang.String str2 = photographerData0.getIban();
        java.lang.String str3 = photographerData0.getSwift();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerData0.getCollections();
        photographerData0.setHomepage("/user/unlock/{id}");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(list_collection4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test174");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.controller.UserController userController1 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException4 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors3);
        int i5 = notFoundException4.getCode();
        org.springframework.web.context.request.WebRequest webRequest6 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError7 = userController1.handleNotFoundException(notFoundException4, webRequest6);
        org.springframework.web.context.request.WebRequest webRequest8 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError9 = photographerController0.handleNotFoundException(notFoundException4, webRequest8);
        de.htw.sdf.photoplatform.webservice.controller.UserController userController10 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors12 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException13 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors12);
        int i14 = notFoundException13.getCode();
        org.springframework.web.context.request.WebRequest webRequest15 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError16 = userController10.handleNotFoundException(notFoundException13, webRequest15);
        org.springframework.web.context.request.WebRequest webRequest17 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError18 = photographerController0.handleNotFoundException(notFoundException13, webRequest17);
        int i19 = responseError18.getCode();
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i14 == 10001);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
        org.junit.Assert.assertTrue(i19 == 10001);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test175");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls2 = null;
        collectionImageDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage5 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image6.setCreatedBy("");
        image6.setThumbPath("/users/admin/{start}/{count}");
        image6.setUpdatedBy("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        collectionImage5.setImage(image6);
        try {
            collectionImageDAOImpl0.create(collectionImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test176");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        userPasswordChange0.setPasswordConfirm("/collections/{collectionId}/images");
        java.lang.String str5 = userPasswordChange0.getNewPassword();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "/showcase" + "'", str5.equals("/showcase"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test177");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls6 = null;
        userImageDAOImpl0.setClazz(cls6);
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor8 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException13 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor8.afterCompletion(httpServletRequest9, httpServletResponse10, (java.lang.Object) 10, (java.lang.Exception) notFoundException13);
        javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse16 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage17 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView18 = null;
        requestLoggerInterceptor8.postHandle(httpServletRequest15, httpServletResponse16, (java.lang.Object) userImage17, modelAndView18);
        java.util.Date date20 = userImage17.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Image image21 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str22 = image21.getMime();
        java.lang.String str23 = image21.getUpdatedBy();
        java.lang.String str24 = image21.getSmallThumbPath();
        java.lang.String str25 = image21.getUpdatedBy();
        java.lang.String str26 = image21.toString();
        userImage17.setImage(image21);
        de.htw.sdf.photoplatform.persistence.model.User user28 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b29 = user28.isPhotographer();
        userImage17.setUser(user28);
        de.htw.sdf.photoplatform.persistence.model.User user31 = userImage17.getUser();
        boolean b32 = user31.isAccountNonLocked();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole33 = user31.getUserRoles();
        java.lang.String str34 = user31.getFirstName();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData35 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection36 = photographerData35.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array37 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection38 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection38, collection_array37);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData40 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection38);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData41 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection38);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData42 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection38);
        photographerData35.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection38);
        java.lang.String str44 = photographerData35.getPhone();
        photographerData35.setPhone("/collections/{collectionId}/images");
        java.lang.String str47 = photographerData35.getHomepage();
        java.lang.String str48 = photographerData35.getIban();
        user31.setPhotographerData(photographerData35);
        user31.setEnabled(true);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage54 = userImageDAOImpl0.getPhotographImages(user31, 0, 10002);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str26.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(list_userRole33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(list_collection36);
        org.junit.Assert.assertNotNull(collection_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(list_collectionData40);
        org.junit.Assert.assertNotNull(list_collectionData41);
        org.junit.Assert.assertNotNull(list_collectionData42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test178");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        java.lang.String str3 = becomePhotographer0.getIban();
        java.lang.String str4 = becomePhotographer0.getHomepage();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test179");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls7 = null;
        userImageDAOImpl0.setClazz(cls7);
        javax.persistence.EntityManager entityManager9 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls10 = null;
        userImageDAOImpl0.setClazz(cls10);
        de.htw.sdf.photoplatform.persistence.model.User user12 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b13 = user12.isAdmin();
        user12.setPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard16 = user12.getAuthorities();
        boolean b17 = user12.isAdmin();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage19 = userImageDAOImpl0.getPhotographImage(user12, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(collection_wildcard16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test180");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getSmallPath();
        imageData2.setPath("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.Boolean b9 = userData8.isAdmin();
        imageData2.setUserData(userData8);
        java.lang.String str11 = userData8.getHomepage();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test181");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection4 = collectionDAOImpl0.findById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test182");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory1 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = null;
        collectionCategory1.setCollection(collection2);
        java.util.Date date4 = collectionCategory1.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Category category5 = new de.htw.sdf.photoplatform.persistence.model.Category();
        java.lang.String str6 = category5.toString();
        java.lang.String str7 = category5.getName();
        collectionCategory1.setCategory(category5);
        try {
            categoryManagerImpl0.create(category5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Category{name='null'}" + "'", str6.equals("Category{name='null'}"));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test183");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors2);
        org.springframework.validation.Errors errors4 = badRequestException3.getErrors();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController0.handleBadRequestException(badRequestException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController7 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors9 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException10 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors9);
        org.springframework.web.context.request.WebRequest webRequest11 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError12 = photographerController7.handleBadRequestException(badRequestException10, webRequest11);
        int i13 = badRequestException10.getCode();
        org.springframework.web.context.request.WebRequest webRequest14 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError15 = photographerController0.handleBadRequestException(badRequestException10, webRequest14);
        try {
            java.lang.String str18 = photographerController0.deleteImageFromCollection((java.lang.Long) 1L, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError12);
        org.junit.Assert.assertTrue(i13 == 10000);
        org.junit.Assert.assertNotNull(responseError15);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test184");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls4 = null;
        collectionCategoryDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory6 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = null;
        collectionCategory6.setCollection(collection7);
        java.util.Date date9 = collectionCategory6.getUpdatedAt();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData10 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData11 = collectionData10.getThumbnail();
        collectionData10.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b14 = collectionData10.getPublic();
        de.htw.sdf.photoplatform.persistence.model.User user15 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b16 = user15.isAdmin();
        java.lang.String str17 = user15.getSecToken();
        boolean b18 = user15.isAccountNonLocked();
        boolean b19 = user15.isCredentialsNonExpired();
        java.lang.String str20 = user15.getLastName();
        java.lang.String str21 = user15.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole22 = user15.getUserRoles();
        de.htw.sdf.photoplatform.persistence.model.Collection collection23 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData10, user15);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage24 = collection23.getCollectionImages();
        collectionCategory6.setCollection(collection23);
        de.htw.sdf.photoplatform.persistence.model.Category category26 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category26.setName("/user/enablephotographer");
        category26.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category26.setDescription("obfuscate");
        category26.setDescription("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        collectionCategory6.setCategory(category26);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory36 = collectionCategoryDAOImpl0.getCollectionCategoryBy(category26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(imageData11);
        org.junit.Assert.assertTrue("'" + b14 + "' != '" + false + "'", b14.equals(false));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(list_userRole22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(set_collectionImage24);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test185");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData1 = collectionData0.getUserdata();
        collectionData0.setPublic((java.lang.Boolean) true);
        long long4 = collectionData0.getId();
        org.junit.Assert.assertNull(userData1);
        org.junit.Assert.assertTrue(long4 == 0L);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test186");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor1 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest2 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse3 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor1.afterCompletion(httpServletRequest2, httpServletResponse3, (java.lang.Object) 10, (java.lang.Exception) notFoundException6);
        javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse9 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage10 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView11 = null;
        requestLoggerInterceptor1.postHandle(httpServletRequest8, httpServletResponse9, (java.lang.Object) userImage10, modelAndView11);
        java.util.Date date13 = userImage10.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.User user14 = new de.htw.sdf.photoplatform.persistence.model.User();
        user14.setEnabled(false);
        userImage10.setOwner(user14);
        java.lang.String str18 = user14.getPassword();
        boolean b20 = user14.isRoleIncluded("/user/makeadmin/{id}");
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage23 = imageManagerImpl0.getPhotographImages(user14, 11003, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test187");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage2 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image3.setCreatedBy("");
        image3.setThumbPath("/users/admin/{start}/{count}");
        image3.setUpdatedBy("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        collectionImage2.setImage(image3);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory11 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection12 = null;
        collectionCategory11.setCollection(collection12);
        de.htw.sdf.photoplatform.persistence.model.Collection collection14 = null;
        collectionCategory11.setCollection(collection14);
        de.htw.sdf.photoplatform.persistence.model.Collection collection16 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user17 = collection16.getUser();
        java.lang.String str18 = collection16.getName();
        collectionCategory11.setCollection(collection16);
        collectionImage2.setCollection(collection16);
        try {
            collectionImageDAOImpl0.delete(collectionImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test188");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController1 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException4 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors3);
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController1.handleBadRequestException(badRequestException4, webRequest5);
        org.springframework.web.context.request.WebRequest webRequest7 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError8 = authenticationController0.handleBadRequestException(badRequestException4, webRequest7);
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController9 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors11 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException12 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors11);
        org.springframework.validation.Errors errors14 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException15 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors14);
        int i16 = notFoundException15.getCode();
        notFoundException12.addSuppressed((java.lang.Throwable) notFoundException15);
        org.springframework.web.context.request.WebRequest webRequest18 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError19 = imageController9.handleNotFoundException(notFoundException15, webRequest18);
        java.lang.Throwable[] throwable_array20 = notFoundException15.getSuppressed();
        org.springframework.web.context.request.WebRequest webRequest21 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError22 = authenticationController0.handleNotFoundException(notFoundException15, webRequest21);
        org.springframework.validation.Errors errors24 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException25 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors24);
        org.springframework.validation.Errors errors27 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException28 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors27);
        int i29 = notFoundException28.getCode();
        notFoundException25.addSuppressed((java.lang.Throwable) notFoundException28);
        org.springframework.web.context.request.WebRequest webRequest31 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError32 = authenticationController0.handleNotFoundException(notFoundException25, webRequest31);
        int i33 = responseError32.getStatus();
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
        org.junit.Assert.assertTrue(i16 == 10001);
        org.junit.Assert.assertNotNull(responseError19);
        org.junit.Assert.assertNotNull(throwable_array20);
        org.junit.Assert.assertNotNull(responseError22);
        org.junit.Assert.assertTrue(i29 == 10001);
        org.junit.Assert.assertNotNull(responseError32);
        org.junit.Assert.assertTrue(i33 == 404);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test189");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.controller.UserController userController1 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException4 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors3);
        int i5 = notFoundException4.getCode();
        org.springframework.web.context.request.WebRequest webRequest6 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError7 = userController1.handleNotFoundException(notFoundException4, webRequest6);
        org.springframework.web.context.request.WebRequest webRequest8 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError9 = photographerController0.handleNotFoundException(notFoundException4, webRequest8);
        de.htw.sdf.photoplatform.webservice.controller.UserController userController10 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors12 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException13 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors12);
        int i14 = notFoundException13.getCode();
        org.springframework.web.context.request.WebRequest webRequest15 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError16 = userController10.handleNotFoundException(notFoundException13, webRequest15);
        org.springframework.web.context.request.WebRequest webRequest17 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError18 = photographerController0.handleNotFoundException(notFoundException13, webRequest17);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData21 = photographerController0.getCollections((int) (short) 0, 400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i14 == 10001);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test190");
        java.lang.String str1 = de.htw.sdf.photoplatform.security.TokenUtils.getUserNameFromToken("Image{name='null', path='null', isPublic=false, enabled=false, price=-1.0}");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=-1.0}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=-1.0}"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test191");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        userRegister0.setLastName("/photographer/images");
        userRegister0.setLastName("null:1528137265625:03bf1b2c50bffe4b6b17dad8841e9f70");
        userRegister0.setPassword("obfuscate");
        userRegister0.setPassword("ROLE_ADMIN");
        userRegister0.setPasswordConfirm("null:1528137288660:1a2c7fbd81ed38e3fb25d5bcfea287cf");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test192");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        image0.setMobileThumbPath("");
        image0.setPrice((java.lang.Double) 100.0d);
        boolean b6 = image0.isEnabled();
        image0.setPrice((java.lang.Double) 0.0d);
        image0.setPublic(true);
        image0.setMobileThumbPath("ROLE_PHOTOGRAPHER");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test193");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        java.lang.Boolean b5 = userData0.isEnabled();
        userData0.setPaypalID("null:1528137270629:cbd34b0779b1c1d7e1215815c5bcba0d");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test194");
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException1 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException(11002);
        int i2 = authorizationException1.getCode();
        org.junit.Assert.assertTrue(i2 == 11002);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test195");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.lang.String str2 = collection0.getName();
        java.lang.String str3 = collection0.getDescription();
        de.htw.sdf.photoplatform.persistence.model.User user4 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b5 = user4.isAdmin();
        java.lang.String str6 = user4.getSecToken();
        boolean b7 = user4.isAccountNonLocked();
        boolean b8 = user4.isCredentialsNonExpired();
        java.lang.String str9 = user4.getLastName();
        java.lang.String str10 = user4.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole11 = user4.getUserRoles();
        collection0.setUser(user4);
        boolean b13 = collection0.isPublic();
        de.htw.sdf.photoplatform.persistence.model.User user14 = collection0.getUser();
        org.junit.Assert.assertNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(list_userRole11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(user14);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test196");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        imageData1.setMessageFailed("/user/register");
        imageData1.setCode((java.lang.Long) 100L);
        java.lang.String str6 = imageData1.getMobilePath();
        imageData1.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test197");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        java.lang.String str5 = user0.toString();
        java.lang.String str7 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user0, (long) (short) 100);
        java.lang.Long long8 = user0.getId();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData9 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection10 = photographerData9.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array11 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection12 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection12, collection_array11);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData14 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection12);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData15 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection12);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData16 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection12);
        photographerData9.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection12);
        java.lang.String str18 = photographerData9.getCompany();
        photographerData9.setPhone("49961de64838862febaeead9e5ed74a8");
        user0.setPhotographerData(photographerData9);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str5.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ec7908a224b49d37ffc84c612f320838" + "'", str7.equals("ec7908a224b49d37ffc84c612f320838"));
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(list_collection10);
        org.junit.Assert.assertNotNull(collection_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(list_collectionData14);
        org.junit.Assert.assertNotNull(list_collectionData15);
        org.junit.Assert.assertNotNull(list_collectionData16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test198");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("39c73479cb767c5a09248b3313c03447", errors1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test199");
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage0 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = userImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.User user2 = null;
        userImage0.setUser(user2);
        java.util.Date date4 = null;
        userImage0.setCreatedAt(date4);
        org.junit.Assert.assertNull(image1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test200");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls7 = null;
        roleDAOImpl0.setClazz(cls7);
        de.htw.sdf.photoplatform.persistence.model.Role role9 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role9.setName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str12 = role9.getName();
        role9.setName("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str15 = role9.getName();
        try {
            roleDAOImpl0.delete(role9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception" + "'", str12.equals("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}" + "'", str15.equals("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test201");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        image1.setThumbPath("/users/admin/{start}/{count}");
        image1.setUpdatedBy("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory9 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = null;
        collectionCategory9.setCollection(collection10);
        de.htw.sdf.photoplatform.persistence.model.Collection collection12 = null;
        collectionCategory9.setCollection(collection12);
        de.htw.sdf.photoplatform.persistence.model.Collection collection14 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user15 = collection14.getUser();
        java.lang.String str16 = collection14.getName();
        collectionCategory9.setCollection(collection14);
        collectionImage0.setCollection(collection14);
        java.util.Date date19 = null;
        collection14.setUpdatedAt(date19);
        collection14.setPublic(false);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test202");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.Boolean b4 = userData0.isEnabled();
        userData0.setPhone("/collections/photographers");
        java.lang.Long long7 = userData0.getId();
        userData0.setLastName("null:1528137266330:9de181051f39b56aea6ebed61ac6f110");
        java.lang.Boolean b10 = userData0.isAdmin();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertTrue("'" + b10 + "' != '" + false + "'", b10.equals(false));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test203");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.User user6 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage8 = userImageDAOImpl0.getPhotographImage(user6, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test204");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("/collections/addimage");
        userRegister0.setPasswordConfirm("/collections/{collectionId}");
        java.lang.String str5 = userRegister0.getLastName();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "/collections/addimage" + "'", str5.equals("/collections/addimage"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test205");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.validation.MessageCodesResolver messageCodesResolver3 = application0.getMessageCodesResolver();
        org.junit.Assert.assertNull(messageCodesResolver3);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test206");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setPaypalID("ROLE_CUSTOMER");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test207");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        javax.persistence.EntityManager entityManager7 = roleDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Role> list_role8 = roleDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager7);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test208");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = null;
        collectionData0.setUserdata(userData2);
        java.lang.String str4 = collectionData0.getName();
        long long5 = collectionData0.getId();
        collectionData0.setId(1L);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData8 = collectionData0.getImages();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData9 = collectionData0.getImages();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(list_imageData8);
        org.junit.Assert.assertNull(list_imageData9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test209");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        try {
            javax.persistence.Query query5 = userImageDAOImpl0.createQuery("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test210");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = imageData1.getName();
        imageData1.setMime("/users/profile/{userId}");
        imageData1.setCode((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test211");
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory0 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = null;
        collectionCategory0.setCollection(collection1);
        java.util.Date date3 = collectionCategory0.getUpdatedAt();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData4 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = collectionData4.getThumbnail();
        collectionData4.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b8 = collectionData4.getPublic();
        de.htw.sdf.photoplatform.persistence.model.User user9 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b10 = user9.isAdmin();
        java.lang.String str11 = user9.getSecToken();
        boolean b12 = user9.isAccountNonLocked();
        boolean b13 = user9.isCredentialsNonExpired();
        java.lang.String str14 = user9.getLastName();
        java.lang.String str15 = user9.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole16 = user9.getUserRoles();
        de.htw.sdf.photoplatform.persistence.model.Collection collection17 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData4, user9);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage18 = collection17.getCollectionImages();
        collectionCategory0.setCollection(collection17);
        de.htw.sdf.photoplatform.persistence.model.Category category20 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category20.setName("/user/enablephotographer");
        category20.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category20.setDescription("obfuscate");
        category20.setDescription("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        collectionCategory0.setCategory(category20);
        java.lang.String str30 = category20.toString();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(imageData5);
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(list_userRole16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(set_collectionImage18);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Category{name='726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c'}" + "'", str30.equals("Category{name='726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c'}"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test212");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData8.setPrice((java.lang.Double) (-1.0d));
        java.lang.Double d11 = imageData8.getPrice();
        java.lang.Long long12 = imageData8.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + d11 + "' != '" + (-1.0d) + "'", d11.equals((-1.0d)));
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test213");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls8 = null;
        userDAOImpl0.setClazz(cls8);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user11 = userDAOImpl0.findById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test214");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole0.setRole(role2);
        de.htw.sdf.photoplatform.persistence.model.User user4 = userRole0.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user5 = userRole0.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user6 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b7 = user6.isAdmin();
        java.lang.String str8 = user6.getSecToken();
        userRole0.setUser(user6);
        de.htw.sdf.photoplatform.persistence.model.User user10 = userRole0.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user11 = userRole0.getUser();
        java.lang.String str12 = user11.getSecToken();
        org.junit.Assert.assertNull(role1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test215");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        user0.setSecToken("");
        user0.setFirstName("null:1528137271348:359dea61c52e045b1b927389910fdd93");
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test216");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls4 = null;
        collectionImageDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage6 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image7 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image7.setCreatedBy("");
        collectionImage6.setImage(image7);
        de.htw.sdf.photoplatform.persistence.model.Image image11 = collectionImage6.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection12 = collectionImage6.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Image image13 = collectionImage6.getImage();
        try {
            collectionImageDAOImpl0.delete(collectionImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNotNull(image11);
        org.junit.Assert.assertNull(collection12);
        org.junit.Assert.assertNotNull(image13);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test217");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors2);
        org.springframework.validation.Errors errors4 = badRequestException3.getErrors();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController0.handleBadRequestException(badRequestException3, webRequest5);
        int i7 = badRequestException3.getCode();
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertTrue(i7 == 10000);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test218");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage9 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView10 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest7, httpServletResponse8, (java.lang.Object) userImage9, modelAndView10);
        java.util.Date date12 = userImage9.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.User user13 = new de.htw.sdf.photoplatform.persistence.model.User();
        user13.setEnabled(false);
        userImage9.setOwner(user13);
        de.htw.sdf.photoplatform.persistence.model.Image image17 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str18 = image17.getMime();
        java.lang.String str19 = image17.getMobileThumbPath();
        image17.setMetaData("/user/makeadmin/{id}");
        java.lang.String str22 = image17.toString();
        java.lang.String str23 = image17.getName();
        userImage9.setImage(image17);
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData25 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(userImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str22.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test219");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.controller.UserController userController1 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException4 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors3);
        int i5 = notFoundException4.getCode();
        org.springframework.web.context.request.WebRequest webRequest6 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError7 = userController1.handleNotFoundException(notFoundException4, webRequest6);
        org.springframework.web.context.request.WebRequest webRequest8 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError9 = photographerController0.handleNotFoundException(notFoundException4, webRequest8);
        int i10 = responseError9.getCode();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str11 = responseError9.getErrors();
        int i12 = responseError9.getStatus();
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i10 == 10001);
        org.junit.Assert.assertNotNull(map_str_list_str11);
        org.junit.Assert.assertTrue(i12 == 404);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test220");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls4 = null;
        imageDAOImpl0.setClazz(cls4);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls6 = null;
        imageDAOImpl0.setClazz(cls6);
        try {
            javax.persistence.Query query9 = imageDAOImpl0.createQuery("de.htw.sdf.photoplatform.exception.NotFoundException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test221");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image5 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image5.setCreatedBy("");
        collectionImage4.setImage(image5);
        de.htw.sdf.photoplatform.persistence.model.Image image9 = collectionImage4.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = null;
        collectionImage4.setCollection(collection10);
        de.htw.sdf.photoplatform.persistence.model.Image image12 = collectionImage4.getImage();
        try {
            collectionImageDAOImpl0.create(collectionImage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNotNull(image9);
        org.junit.Assert.assertNotNull(image12);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test222");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        java.lang.String str3 = userData0.getHomepage();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str5 = userData4.getLastName();
        java.util.List<java.lang.String> list_str6 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData4.setRoles(list_str6);
        userData0.setRoles(list_str6);
        java.lang.String str9 = userData0.getSecToken();
        java.lang.String str10 = userData0.getIban();
        userData0.setPhone("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test223");
        org.springframework.security.core.userdetails.UserDetailsService userDetailsService0 = null;
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer(userDetailsService0);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity2 = null;
        xAuthTokenConfigurer1.setBuilder(httpSecurity2);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity4 = null;
        xAuthTokenConfigurer1.init(httpSecurity4);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity6 = null;
        xAuthTokenConfigurer1.init(httpSecurity6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test224");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData0.setRoles(list_str2);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str5 = userData4.getLastName();
        java.util.List<java.lang.String> list_str6 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData4.setRoles(list_str6);
        userData0.setRoles(list_str6);
        userData0.setBanned(false);
        java.lang.String str11 = userData0.getPhone();
        de.htw.sdf.photoplatform.persistence.model.Image image12 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str13 = image12.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData14 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image12);
        imageData14.setMetadata("/photographer/upload");
        imageData14.setMime("/showcase");
        imageData14.setMessageSuccess("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData21 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str22 = userData21.getLastName();
        java.lang.String str23 = userData21.getEmail();
        java.lang.String str24 = userData21.getHomepage();
        imageData14.setUserData(userData21);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData26 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str27 = userData26.getLastName();
        java.util.List<java.lang.String> list_str28 = userData26.getRoles();
        java.lang.String str29 = userData26.getSwift();
        java.lang.Boolean b30 = userData26.isEnabled();
        userData26.setId((java.lang.Long) 1L);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData33 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str34 = userData33.getLastName();
        java.util.List<java.lang.String> list_str35 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData33.setRoles(list_str35);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData37 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str38 = userData37.getLastName();
        java.util.List<java.lang.String> list_str39 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData37.setRoles(list_str39);
        userData33.setRoles(list_str39);
        userData26.setRoles(list_str39);
        userData21.setRoles(list_str39);
        userData0.setRoles(list_str39);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(list_str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + b30 + "' != '" + false + "'", b30.equals(false));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(list_str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(list_str39);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test225");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.lang.String str1 = photographerData0.getPhone();
        photographerData0.setPaypalID("Category{name='/photographer/images/{imageId}'}");
        photographerData0.setCompany("/collections/{collectionId}/images");
        java.lang.String str6 = photographerData0.getSwift();
        photographerData0.setHomepage("de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test226");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        image0.setMobileThumbPath("");
        image0.setPrice((java.lang.Double) 100.0d);
        java.lang.String str6 = image0.getUpdatedBy();
        image0.setMetaData("aa0668324371e9b034306466d6abdba5");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test227");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData0.setRoles(list_str2);
        java.lang.String str4 = userData0.getEmail();
        userData0.setSwift("ROLE_CUSTOMER");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test228");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        java.lang.String str3 = userData0.getHomepage();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str5 = userData4.getLastName();
        java.util.List<java.lang.String> list_str6 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData4.setRoles(list_str6);
        userData0.setRoles(list_str6);
        java.lang.String str9 = userData0.getLastName();
        userData0.setLastName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        java.lang.Boolean b12 = userData0.isBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test229");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("/collections/addimage");
        userRegister0.setLastName("/user/becomePhotographer");
        java.lang.String str5 = userRegister0.getEmail();
        java.lang.String str6 = userRegister0.getEmail();
        java.lang.String str7 = userRegister0.getPasswordConfirm();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test230");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.Boolean b4 = userData0.isBanned();
        java.lang.String str5 = userData0.getIban();
        userData0.setPhone("null:1528137248666:32ad08d7594d28504f1460b47d9ec391");
        userData0.setLastName("49961de64838862febaeead9e5ed74a8");
        userData0.setFirstName("");
        java.util.List<java.lang.String> list_str12 = userData0.getRoles();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list_str12);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test231");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getMessageSuccess();
        imageData2.setMime("Image{name='null', path='null', isPublic=false, enabled=false, price=1.0}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test232");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole3 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        try {
            userRoleDAOImpl0.delete(userRole3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test233");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls4 = null;
        imageDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str7 = image6.getMime();
        java.lang.String str8 = image6.getUpdatedBy();
        java.lang.String str9 = image6.getSmallThumbPath();
        java.lang.String str10 = image6.getUpdatedBy();
        image6.setPrice((java.lang.Double) (-1.0d));
        try {
            imageDAOImpl0.delete(image6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test234");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        java.lang.String str5 = image0.toString();
        image0.setName("/collections/create");
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        image0.setEnabled(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str5.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNotNull(imageData8);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test235");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str7 = imageData6.getMime();
        java.lang.String str8 = imageData6.getPath();
        java.lang.String str9 = imageData6.getMobilePath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test236");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole0.setRole(role2);
        de.htw.sdf.photoplatform.persistence.model.User user4 = userRole0.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user5 = userRole0.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user6 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b7 = user6.isAdmin();
        java.lang.String str8 = user6.getSecToken();
        userRole0.setUser(user6);
        de.htw.sdf.photoplatform.persistence.model.Role role10 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role11 = userRole0.getRole();
        role11.setName("5b077a3001f6b54eed6802448a739229");
        role11.setName("");
        org.junit.Assert.assertNull(role1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(role10);
        org.junit.Assert.assertNotNull(role11);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test237");
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory0 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = null;
        collectionCategory0.setCollection(collection1);
        java.util.Date date3 = collectionCategory0.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Category category4 = new de.htw.sdf.photoplatform.persistence.model.Category();
        java.lang.String str5 = category4.toString();
        java.lang.String str6 = category4.getName();
        collectionCategory0.setCategory(category4);
        de.htw.sdf.photoplatform.persistence.model.Collection collection8 = collectionCategory0.getCollection();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Category{name='null'}" + "'", str5.equals("Category{name='null'}"));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test238");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls1 = null;
        categoryDAOImpl0.setClazz(cls1);
        try {
            categoryDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test239");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData1 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData1.setSwift("/photographer/images");
        java.lang.String str4 = userData1.getPaypalID();
        userData1.setHomepage("");
        java.lang.String str7 = userData1.getIban();
        java.lang.String str8 = userData1.getFirstName();
        org.springframework.validation.BindingResult bindingResult9 = null;
        try {
            userController0.updateUser(userData1, bindingResult9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test240");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        try {
            javax.persistence.Query query8 = roleDAOImpl0.createQuery("93e210c4650e33acb58f8d1cfa9bbe56");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test241");
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection0 = null;
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData2 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData(list_collection0, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test242");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getSmallThumbPath();
        java.lang.String str3 = image0.toString();
        image0.setMime("/users/changepassword");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test243");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        photographerData0.setCompany("/collections/{collectionId}/images");
        photographerData0.setPhone("/photographer/images");
        java.lang.String str6 = photographerData0.getPhone();
        java.lang.String str7 = photographerData0.getPaypalID();
        java.lang.String str8 = photographerData0.getHomepage();
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "/photographer/images" + "'", str6.equals("/photographer/images"));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test244");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        becomePhotographer0.setIban("/photographer/upload");
        java.lang.String str9 = becomePhotographer0.getCompany();
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test245");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setName("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str6 = image0.getPath();
        image0.setSmallThumbPath("Collection{user=null, name='null'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test246");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController1 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException4 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors3);
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController1.handleBadRequestException(badRequestException4, webRequest5);
        org.springframework.web.context.request.WebRequest webRequest7 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError8 = authenticationController0.handleBadRequestException(badRequestException4, webRequest7);
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister9 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister9.setPasswordConfirm("/collections/{collectionId}/images");
        userRegister9.setPassword("");
        java.lang.String str14 = userRegister9.getLastName();
        java.lang.String str15 = userRegister9.getFirstName();
        org.springframework.validation.BindingResult bindingResult16 = null;
        try {
            authenticationController0.register(userRegister9, bindingResult16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test247");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer1 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer1.setPhone("ROLE_ADMIN");
        java.lang.String str4 = becomePhotographer1.getSwift();
        java.lang.String str5 = becomePhotographer1.getCompany();
        org.springframework.validation.BindingResult bindingResult6 = null;
        try {
            boolean b7 = userController0.becomePhotographer(becomePhotographer1, bindingResult6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test248");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            userDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test249");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        java.lang.String str5 = userData0.getHomepage();
        userData0.setFirstName("null:1528137293936:a0988808b1e86f8e45491a6365ca0d34");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test250");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        collectionData0.setPublic((java.lang.Boolean) false);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = null;
        collectionData0.setThumbnail(imageData4);
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str7 = image6.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image6);
        imageData8.setMobilePath("/users/update");
        java.lang.Long long11 = imageData8.getCode();
        imageData8.setName("/users/update");
        collectionData0.setThumbnail(imageData8);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData15 = collectionData0.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData16 = collectionData0.getUserdata();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData17 = collectionData0.getThumbnail();
        java.lang.String str18 = imageData17.getMessageFailed();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNotNull(imageData15);
        org.junit.Assert.assertNull(userData16);
        org.junit.Assert.assertNotNull(imageData17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test251");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor4 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse6 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException9 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor4.afterCompletion(httpServletRequest5, httpServletResponse6, (java.lang.Object) 10, (java.lang.Exception) notFoundException9);
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage13 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView14 = null;
        requestLoggerInterceptor4.postHandle(httpServletRequest11, httpServletResponse12, (java.lang.Object) userImage13, modelAndView14);
        de.htw.sdf.photoplatform.persistence.model.Image image16 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str17 = image16.getMime();
        java.lang.String str18 = image16.getUpdatedBy();
        java.lang.String str19 = image16.getSmallThumbPath();
        image16.setCreatedBy("/collections/addimage");
        image16.setEnabled(true);
        userImage13.setImage(image16);
        de.htw.sdf.photoplatform.persistence.model.User user25 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b26 = user25.isAdmin();
        user25.setPassword("ROLE_PHOTOGRAPHER");
        boolean b30 = user25.isRoleIncluded("/user/becomePhotographer");
        boolean b31 = user25.isCredentialsNonExpired();
        userImage13.setUser(user25);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage33 = userImageDAOImpl0.update(userImage13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test252");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage9 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView10 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest7, httpServletResponse8, (java.lang.Object) userImage9, modelAndView10);
        java.util.Date date12 = userImage9.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.User user13 = new de.htw.sdf.photoplatform.persistence.model.User();
        user13.setEnabled(false);
        userImage9.setOwner(user13);
        java.lang.String str17 = user13.getPassword();
        java.lang.String str18 = user13.getUsername();
        user13.setLastName("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        boolean b22 = user13.isRoleIncluded("");
        java.lang.String str23 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user13);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null:1528137297120:81de46218c60e4d53d53e57bf8eedaac" + "'", str23.equals("null:1528137297120:81de46218c60e4d53d53e57bf8eedaac"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test253");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role4 = roleDAOImpl0.findByName("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test254");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = null;
        collectionImage0.setCollection(collection5);
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user8 = collection7.getUser();
        collectionImage0.setCollection(collection7);
        java.util.Date date10 = collection7.getUpdatedAt();
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test255");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        userData0.setIban("/collections/{collectionId}");
        java.lang.Boolean b5 = userData0.isEnabled();
        userData0.setPhone("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER");
        java.lang.String str8 = userData0.getCompany();
        userData0.setIban("ROLE_PHOTOGRAPHER");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test256");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage9 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView10 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest7, httpServletResponse8, (java.lang.Object) userImage9, modelAndView10);
        de.htw.sdf.photoplatform.persistence.model.Image image12 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str13 = image12.getMime();
        java.lang.String str14 = image12.getUpdatedBy();
        java.lang.String str15 = image12.getSmallThumbPath();
        image12.setCreatedBy("/collections/addimage");
        image12.setEnabled(true);
        userImage9.setImage(image12);
        de.htw.sdf.photoplatform.persistence.model.User user21 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b22 = user21.isAdmin();
        user21.setPassword("ROLE_PHOTOGRAPHER");
        boolean b26 = user21.isRoleIncluded("/user/becomePhotographer");
        boolean b27 = user21.isCredentialsNonExpired();
        userImage9.setUser(user21);
        user21.setAccountNonLocked(true);
        java.lang.String str31 = user21.getSecToken();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test257");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        image0.setMobileThumbPath("/photographer/upload");
        boolean b9 = image0.isEnabled();
        boolean b10 = image0.isEnabled();
        java.lang.Long long11 = image0.getId();
        image0.setMobileThumbPath("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test258");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array2 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection3 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3, collection_array2);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData5 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData7 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.lang.String str9 = photographerData0.getPhone();
        photographerData0.setPhone("/collections/{collectionId}/images");
        java.lang.String str12 = photographerData0.getIban();
        photographerData0.setPaypalID("obfuscate");
        java.lang.String str15 = photographerData0.getPaypalID();
        photographerData0.setPhone("null:1528137290244:943874d4d401ee35c1fdddc6428199d7");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "obfuscate" + "'", str15.equals("obfuscate"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test259");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array5 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver6 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver6, handlerExceptionResolver_array5);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver6);
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor9 = application0.localeChangeInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse11 = null;
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange12 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        org.springframework.web.servlet.ModelAndView modelAndView13 = null;
        localeChangeInterceptor9.postHandle(httpServletRequest10, httpServletResponse11, (java.lang.Object) userPasswordChange12, modelAndView13);
        javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse16 = null;
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array17 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection18 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection18, collection_array17);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData20 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection18);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData21 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection18);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData23 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection18, (java.lang.Boolean) true);
        localeChangeInterceptor9.afterConcurrentHandlingStarted(httpServletRequest15, httpServletResponse16, (java.lang.Object) list_collectionData23);
        javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse26 = null;
        de.htw.sdf.photoplatform.webservice.dto.UserData userData27 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData27.setSwift("/photographer/images");
        java.lang.String str30 = userData27.getPaypalID();
        java.lang.Boolean b31 = userData27.isEnabled();
        localeChangeInterceptor9.afterConcurrentHandlingStarted(httpServletRequest25, httpServletResponse26, (java.lang.Object) b31);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(localeChangeInterceptor9);
        org.junit.Assert.assertNotNull(collection_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(list_collectionData20);
        org.junit.Assert.assertNotNull(list_collectionData21);
        org.junit.Assert.assertNotNull(list_collectionData23);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + b31 + "' != '" + false + "'", b31.equals(false));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test260");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        try {
            collectionDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test261");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager4 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isAdmin();
        user5.setPassword("ROLE_PHOTOGRAPHER");
        boolean b10 = user5.isRoleIncluded("/user/becomePhotographer");
        boolean b11 = user5.isCredentialsNonExpired();
        java.lang.String str12 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user5);
        java.util.Date date13 = user5.getUpdatedAt();
        try {
            userDAOImpl0.create(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null:1528137297333:e1e5c68d68c7d00f238648caf11f2301" + "'", str12.equals("null:1528137297333:e1e5c68d68c7d00f238648caf11f2301"));
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test262");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage4 = userImageDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test263");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage3 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = userImage3.getImage();
        de.htw.sdf.photoplatform.persistence.model.User user5 = null;
        userImage3.setUser(user5);
        de.htw.sdf.photoplatform.persistence.model.User user7 = userImage3.getUser();
        try {
            userImageDAOImpl0.delete(userImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test264");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = image0.getCreatedBy();
        image0.setThumbPath("/user/login");
        java.util.Date date5 = null;
        image0.setUpdatedAt(date5);
        image0.setId((java.lang.Long) 1L);
        java.lang.String str9 = image0.getThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData10 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.util.Date date11 = null;
        image0.setUpdatedAt(date11);
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "/user/login" + "'", str9.equals("/user/login"));
        org.junit.Assert.assertNotNull(imageData10);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test265");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = roleDAOImpl0.getEntityManager();
        try {
            roleDAOImpl0.deleteById((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test266");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        collectionData0.setPublic((java.lang.Boolean) false);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = null;
        collectionData0.setThumbnail(imageData4);
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str7 = image6.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image6);
        imageData8.setMobilePath("/users/update");
        java.lang.Long long11 = imageData8.getCode();
        imageData8.setName("/users/update");
        collectionData0.setThumbnail(imageData8);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData15 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData15.setId((java.lang.Long) 0L);
        userData15.setEnabled(false);
        userData15.setAdmin(false);
        userData15.setId((java.lang.Long) 100L);
        collectionData0.setUserdata(userData15);
        java.lang.Boolean b25 = userData15.isEnabled();
        java.lang.String str26 = userData15.getFirstName();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + b25 + "' != '" + false + "'", b25.equals(false));
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test267");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getMessageSuccess();
        imageData2.setMobilePath("/users/update");
        java.lang.String str6 = imageData2.getSmallPath();
        java.lang.String str7 = imageData2.getName();
        imageData2.setSmallPath("/user/login");
        imageData2.setSmallPath("/user/becomePhotographer");
        imageData2.setMobilePath("null:1528137290306:359bf08f2d461e07611e727909d973a0");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test268");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = collectionImage0.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Image image7 = collectionImage0.getImage();
        image7.setMetaData("/index.html");
        java.util.Date date10 = null;
        image7.setUpdatedAt(date10);
        org.junit.Assert.assertNotNull(image5);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(image7);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test269");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        imageData1.setMessageFailed("/user/register");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str5 = userData4.getLastName();
        java.lang.String str6 = userData4.getEmail();
        java.lang.String str7 = userData4.getHomepage();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str9 = userData8.getLastName();
        java.util.List<java.lang.String> list_str10 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData8.setRoles(list_str10);
        userData4.setRoles(list_str10);
        java.lang.String str13 = userData4.getLastName();
        userData4.setLastName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        java.util.List<java.lang.String> list_str16 = userData4.getRoles();
        imageData1.setUserData(userData4);
        java.lang.String str18 = imageData1.getThumbnailPath();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list_str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(list_str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test270");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        org.springframework.validation.Errors errors5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors5);
        int i7 = notFoundException6.getCode();
        notFoundException3.addSuppressed((java.lang.Throwable) notFoundException6);
        java.lang.String str9 = notFoundException3.toString();
        org.springframework.web.context.request.WebRequest webRequest10 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError11 = photographerController0.handleNotFoundException(notFoundException3, webRequest10);
        try {
            java.lang.String str13 = photographerController0.updateCollectionShowcase("4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str9.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
        org.junit.Assert.assertNotNull(responseError11);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test271");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.Boolean b4 = userData0.isEnabled();
        userData0.setPhone("/collections/photographers");
        userData0.setLastName("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        java.util.List<java.lang.String> list_str9 = userData0.getRoles();
        userData0.setEmail("null:1528137271848:6816eb5a920569f38c51d1b8bbf267cc");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(list_str9);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test272");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer1 = null;
        application0.configureDefaultServletHandling(defaultServletHandlerConfigurer1);
        de.htw.sdf.photoplatform.Application application3 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer4 = null;
        application3.configureAsyncSupport(asyncSupportConfigurer4);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer6 = null;
        application3.configureAsyncSupport(asyncSupportConfigurer6);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array8 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver9 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver9, handlerExceptionResolver_array8);
        application3.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver9);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver9);
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor13 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException18 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor13.afterCompletion(httpServletRequest14, httpServletResponse15, (java.lang.Object) 10, (java.lang.Exception) notFoundException18);
        javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse21 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage22 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView23 = null;
        requestLoggerInterceptor13.postHandle(httpServletRequest20, httpServletResponse21, (java.lang.Object) userImage22, modelAndView23);
        javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse26 = null;
        de.htw.sdf.photoplatform.Application application27 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer28 = null;
        application27.configureAsyncSupport(asyncSupportConfigurer28);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer30 = null;
        application27.configureAsyncSupport(asyncSupportConfigurer30);
        org.springframework.validation.MessageCodesResolver messageCodesResolver32 = application27.getMessageCodesResolver();
        de.htw.sdf.photoplatform.Application application33 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer34 = null;
        application33.configureDefaultServletHandling(defaultServletHandlerConfigurer34);
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array36 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver37 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver37, handlerMethodArgumentResolver_array36);
        application33.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver37);
        application27.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver37);
        org.springframework.web.servlet.ModelAndView modelAndView41 = null;
        requestLoggerInterceptor13.postHandle(httpServletRequest25, httpServletResponse26, (java.lang.Object) arraylist_handlerMethodArgumentResolver37, modelAndView41);
        application0.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver37);
        de.htw.sdf.photoplatform.Application application44 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer45 = null;
        application44.configureDefaultServletHandling(defaultServletHandlerConfigurer45);
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array47 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver48 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver48, handlerMethodArgumentResolver_array47);
        application44.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver48);
        application0.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver48);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory52 = application0.servletContainer();
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(messageCodesResolver32);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory52);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test273");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array5 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver6 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver6, handlerExceptionResolver_array5);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver6);
        org.springframework.web.servlet.LocaleResolver localeResolver9 = application0.localeResolver();
        de.htw.sdf.photoplatform.Application application10 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer11 = null;
        application10.configureAsyncSupport(asyncSupportConfigurer11);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer13 = null;
        application10.configureContentNegotiation(contentNegotiationConfigurer13);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory15 = application10.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry16 = null;
        application10.addResourceHandlers(resourceHandlerRegistry16);
        org.springframework.web.servlet.LocaleResolver localeResolver18 = application10.localeResolver();
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array19 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver20 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver20, handlerMethodArgumentResolver_array19);
        application10.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver20);
        de.htw.sdf.photoplatform.Application application23 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer24 = null;
        application23.configureContentNegotiation(contentNegotiationConfigurer24);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array26 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler27 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler27, handlerMethodReturnValueHandler_array26);
        application23.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler27);
        org.springframework.format.FormatterRegistry formatterRegistry30 = null;
        application23.addFormatters(formatterRegistry30);
        de.htw.sdf.photoplatform.Application application32 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer33 = null;
        application32.configureAsyncSupport(asyncSupportConfigurer33);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer35 = null;
        application32.configureAsyncSupport(asyncSupportConfigurer35);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array37 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver38 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver38, handlerExceptionResolver_array37);
        application32.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver38);
        application23.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver38);
        application10.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver38);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver38);
        org.springframework.validation.MessageCodesResolver messageCodesResolver44 = application0.getMessageCodesResolver();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer45 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer45);
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor47 = application0.localeChangeInterceptor();
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(localeResolver9);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(localeResolver18);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(messageCodesResolver44);
        org.junit.Assert.assertNotNull(localeChangeInterceptor47);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test274");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        try {
            javax.persistence.Query query7 = userRoleDAOImpl0.createQuery("/user/unlock/{id}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test275");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls4 = null;
        userDAOImpl0.setClazz(cls4);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user7 = userDAOImpl0.findByEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test276");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls3 = null;
        categoryDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = categoryDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category7 = categoryDAOImpl0.findOne((long) 11002);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test277");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        org.springframework.validation.Errors errors5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors5);
        int i7 = notFoundException6.getCode();
        notFoundException3.addSuppressed((java.lang.Throwable) notFoundException6);
        java.lang.String str9 = notFoundException3.toString();
        org.springframework.web.context.request.WebRequest webRequest10 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError11 = photographerController0.handleNotFoundException(notFoundException3, webRequest10);
        int i12 = responseError11.getCode();
        int i13 = responseError11.getCode();
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str9.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
        org.junit.Assert.assertNotNull(responseError11);
        org.junit.Assert.assertTrue(i12 == 10001);
        org.junit.Assert.assertTrue(i13 == 10001);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test278");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection6 = collectionDAOImpl0.update(collection5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test279");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        java.lang.String str3 = userData0.getHomepage();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str5 = userData4.getLastName();
        java.util.List<java.lang.String> list_str6 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData4.setRoles(list_str6);
        userData0.setRoles(list_str6);
        java.lang.String str9 = userData0.getLastName();
        userData0.setLastName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        java.util.List<java.lang.String> list_str12 = userData0.getRoles();
        java.lang.String str13 = userData0.getSecToken();
        java.lang.String str14 = userData0.getSecToken();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list_str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test280");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str3 = userRegister0.getLastName();
        java.lang.String str4 = userRegister0.getFirstName();
        java.lang.String str5 = userRegister0.getPassword();
        java.lang.String str6 = userRegister0.getPassword();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception" + "'", str3.equals("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception"));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test281");
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException1 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException((int) ' ');
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test282");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage1 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image2.setCreatedBy("");
        collectionImage1.setImage(image2);
        de.htw.sdf.photoplatform.persistence.model.Image image6 = collectionImage1.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = null;
        collectionImage1.setCollection(collection7);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData9 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData10 = collectionData9.getThumbnail();
        collectionData9.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b13 = collectionData9.getPublic();
        de.htw.sdf.photoplatform.persistence.model.User user14 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b15 = user14.isAdmin();
        java.lang.String str16 = user14.getSecToken();
        boolean b17 = user14.isAccountNonLocked();
        boolean b18 = user14.isCredentialsNonExpired();
        java.lang.String str19 = user14.getLastName();
        java.lang.String str20 = user14.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole21 = user14.getUserRoles();
        de.htw.sdf.photoplatform.persistence.model.Collection collection22 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData9, user14);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage23 = collection22.getCollectionImages();
        de.htw.sdf.photoplatform.persistence.model.Image image24 = collection22.getThumbnail();
        collectionImage1.setCollection(collection22);
        java.lang.String str26 = collection22.getName();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection27 = photographerManagerImpl0.update(collection22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(image6);
        org.junit.Assert.assertNull(imageData10);
        org.junit.Assert.assertTrue("'" + b13 + "' != '" + false + "'", b13.equals(false));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(list_userRole21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(set_collectionImage23);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test283");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor1 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest2 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse3 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor1.afterCompletion(httpServletRequest2, httpServletResponse3, (java.lang.Object) 10, (java.lang.Exception) notFoundException6);
        javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse9 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage10 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView11 = null;
        requestLoggerInterceptor1.postHandle(httpServletRequest8, httpServletResponse9, (java.lang.Object) userImage10, modelAndView11);
        java.util.Date date13 = userImage10.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Image image14 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str15 = image14.getMime();
        java.lang.String str16 = image14.getUpdatedBy();
        java.lang.String str17 = image14.getSmallThumbPath();
        java.lang.String str18 = image14.getUpdatedBy();
        java.lang.String str19 = image14.toString();
        userImage10.setImage(image14);
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor21 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse23 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException26 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor21.afterCompletion(httpServletRequest22, httpServletResponse23, (java.lang.Object) 10, (java.lang.Exception) notFoundException26);
        javax.servlet.http.HttpServletRequest httpServletRequest28 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse29 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image30 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str31 = image30.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData32 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image30);
        imageData32.setName("");
        java.lang.Double d35 = imageData32.getPrice();
        imageData32.setName("/user/enablephotographer");
        org.springframework.web.servlet.ModelAndView modelAndView38 = null;
        requestLoggerInterceptor21.postHandle(httpServletRequest28, httpServletResponse29, (java.lang.Object) "/user/enablephotographer", modelAndView38);
        javax.servlet.http.HttpServletRequest httpServletRequest40 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse41 = null;
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole42 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role43 = userRole42.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role44 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole42.setRole(role44);
        de.htw.sdf.photoplatform.persistence.model.User user46 = userRole42.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user47 = userRole42.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user48 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b49 = user48.isAdmin();
        java.lang.String str50 = user48.getSecToken();
        userRole42.setUser(user48);
        de.htw.sdf.photoplatform.persistence.model.Role role52 = userRole42.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role53 = userRole42.getRole();
        org.springframework.validation.Errors errors55 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException56 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors55);
        org.springframework.validation.Errors errors58 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException59 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors58);
        int i60 = notFoundException59.getCode();
        notFoundException56.addSuppressed((java.lang.Throwable) notFoundException59);
        requestLoggerInterceptor21.afterCompletion(httpServletRequest40, httpServletResponse41, (java.lang.Object) userRole42, (java.lang.Exception) notFoundException59);
        de.htw.sdf.photoplatform.persistence.model.User user63 = userRole42.getUser();
        user63.setFirstName("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage66 = imageManagerImpl0.addOwnerToImage(image14, user63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str19.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(d35);
        org.junit.Assert.assertNull(role43);
        org.junit.Assert.assertNull(user46);
        org.junit.Assert.assertNull(user47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(role52);
        org.junit.Assert.assertNotNull(role53);
        org.junit.Assert.assertTrue(i60 == 10001);
        org.junit.Assert.assertNotNull(user63);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test284");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array2 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection3 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3, collection_array2);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData5 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData7 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.lang.String str9 = photographerData0.getPhone();
        photographerData0.setPhone("/collections/{collectionId}/images");
        java.lang.String str12 = photographerData0.getIban();
        photographerData0.setPaypalID("obfuscate");
        photographerData0.setIban("/collections/photographers/{start}/{count}");
        photographerData0.setPaypalID("ROLE_BECOME_PHOTOGRAPHER");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test285");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        collectionData0.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b4 = collectionData0.getPublic();
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isAdmin();
        java.lang.String str7 = user5.getSecToken();
        boolean b8 = user5.isAccountNonLocked();
        boolean b9 = user5.isCredentialsNonExpired();
        java.lang.String str10 = user5.getLastName();
        java.lang.String str11 = user5.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole12 = user5.getUserRoles();
        de.htw.sdf.photoplatform.persistence.model.Collection collection13 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData0, user5);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory14 = collection13.getCollectionCategories();
        collection13.setPublic(true);
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(list_userRole12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(set_collectionCategory14);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test286");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        java.lang.String str5 = user0.toString();
        user0.setId((java.lang.Long) 100L);
        boolean b8 = user0.isAdmin();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str5.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test287");
        de.htw.sdf.photoplatform.persistence.model.Category category0 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category0.setName("/user/enablephotographer");
        category0.setName("hi!");
        category0.setName("/photographer/images");
        java.lang.String str7 = category0.getName();
        java.lang.String str8 = category0.getDescription();
        java.lang.String str9 = category0.getName();
        java.lang.String str10 = category0.getName();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/photographer/images" + "'", str7.equals("/photographer/images"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "/photographer/images" + "'", str9.equals("/photographer/images"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/photographer/images" + "'", str10.equals("/photographer/images"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test288");
        de.htw.sdf.photoplatform.persistence.model.Category category0 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category0.setName("/user/enablephotographer");
        category0.setDescription("Category{name='/photographer/images/{imageId}'}");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test289");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("Category{name='726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c'}", errors1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test290");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData0.setRoles(list_str2);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str5 = userData4.getLastName();
        java.util.List<java.lang.String> list_str6 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData4.setRoles(list_str6);
        userData0.setRoles(list_str6);
        userData0.setBanned(false);
        java.lang.String str11 = userData0.getPhone();
        userData0.setBanned(false);
        userData0.setSwift("f69da696e5820bcbd9fb36421272c447");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test291");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<java.lang.Long> list_long3 = null;
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionImage> list_collectionImage4 = photographerManagerImpl0.addImagesToCollection((java.lang.Long) 0L, (java.lang.Long) 10L, list_long3);
            org.junit.Assert.fail("Expected exception of type de.htw.sdf.photoplatform.exception.common.ManagerException");
        } catch (de.htw.sdf.photoplatform.exception.common.ManagerException e) {
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test292");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory1 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = null;
        collectionCategory1.setCollection(collection2);
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = null;
        collectionCategory1.setCollection(collection4);
        de.htw.sdf.photoplatform.persistence.model.Category category6 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category6.setName("/user/enablephotographer");
        category6.setName("hi!");
        java.lang.String str11 = category6.getDescription();
        java.lang.String str12 = category6.getDescription();
        collectionCategory1.setCategory(category6);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage14 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image15 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image15.setCreatedBy("");
        collectionImage14.setImage(image15);
        de.htw.sdf.photoplatform.persistence.model.Image image19 = collectionImage14.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection20 = collectionImage14.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Image image21 = collectionImage14.getImage();
        image21.setMetaData("/index.html");
        boolean b24 = category6.equals((java.lang.Object) image21);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory25 = collectionCategoryDAOImpl0.getCollectionCategoryBy(category6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test293");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.lang.String str2 = collection0.getName();
        java.lang.String str3 = collection0.getDescription();
        de.htw.sdf.photoplatform.persistence.model.User user4 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b5 = user4.isAdmin();
        java.lang.String str6 = user4.getSecToken();
        boolean b7 = user4.isAccountNonLocked();
        boolean b8 = user4.isCredentialsNonExpired();
        java.lang.String str9 = user4.getLastName();
        java.lang.String str10 = user4.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole11 = user4.getUserRoles();
        collection0.setUser(user4);
        java.util.Date date13 = collection0.getCreatedAt();
        org.junit.Assert.assertNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(list_userRole11);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test294");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry6 = null;
        application0.addResourceHandlers(resourceHandlerRegistry6);
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry8 = null;
        try {
            application0.addInterceptors(interceptorRegistry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test295");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getMetadata();
        java.lang.String str7 = imageData2.getMetadata();
        imageData2.setMime("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str10 = imageData2.getName();
        imageData2.setDescription("de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test296");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.LocaleResolver localeResolver5 = application0.localeResolver();
        org.springframework.web.servlet.config.annotation.ViewControllerRegistry viewControllerRegistry6 = null;
        application0.addViewControllers(viewControllerRegistry6);
        javax.servlet.MultipartConfigElement multipartConfigElement8 = application0.multipartConfigElement();
        org.springframework.web.servlet.config.annotation.PathMatchConfigurer pathMatchConfigurer9 = null;
        application0.configurePathMatch(pathMatchConfigurer9);
        org.junit.Assert.assertNotNull(localeResolver5);
        org.junit.Assert.assertNotNull(multipartConfigElement8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test297");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls3 = null;
        categoryDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category6 = categoryDAOImpl0.findOne((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test298");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        java.lang.String str5 = imageData2.getMessageFailed();
        java.lang.Long long6 = imageData2.getCode();
        imageData2.setMetadata("/collections/{collectionId}/images");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test299");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setName("");
        java.lang.Double d5 = imageData2.getPrice();
        imageData2.setPrice((java.lang.Double) 100.0d);
        java.lang.String str8 = imageData2.getPath();
        imageData2.setName("/users/update");
        imageData2.setName("/api:1528137282451:b663d46b647142ba0b5f5a8d1cd8d8fe");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(d5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test300");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls7 = null;
        roleDAOImpl0.setClazz(cls7);
        try {
            javax.persistence.Query query10 = roleDAOImpl0.createQuery("/photographer/upload");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test301");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry6 = null;
        application0.addResourceHandlers(resourceHandlerRegistry6);
        de.htw.sdf.photoplatform.Application application8 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer9 = null;
        application8.configureAsyncSupport(asyncSupportConfigurer9);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer11 = null;
        application8.configureContentNegotiation(contentNegotiationConfigurer11);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory13 = application8.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry14 = null;
        application8.addResourceHandlers(resourceHandlerRegistry14);
        org.springframework.web.servlet.LocaleResolver localeResolver16 = application8.localeResolver();
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array17 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver18 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver18, handlerMethodArgumentResolver_array17);
        application8.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver18);
        de.htw.sdf.photoplatform.Application application21 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer22 = null;
        application21.configureContentNegotiation(contentNegotiationConfigurer22);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array24 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler25 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler25, handlerMethodReturnValueHandler_array24);
        application21.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler25);
        org.springframework.format.FormatterRegistry formatterRegistry28 = null;
        application21.addFormatters(formatterRegistry28);
        de.htw.sdf.photoplatform.Application application30 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer31 = null;
        application30.configureAsyncSupport(asyncSupportConfigurer31);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer33 = null;
        application30.configureAsyncSupport(asyncSupportConfigurer33);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array35 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver36 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b37 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver36, handlerExceptionResolver_array35);
        application30.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver36);
        application21.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver36);
        application8.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver36);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver36);
        org.springframework.web.servlet.config.annotation.PathMatchConfigurer pathMatchConfigurer42 = null;
        application0.configurePathMatch(pathMatchConfigurer42);
        org.springframework.format.FormatterRegistry formatterRegistry44 = null;
        application0.addFormatters(formatterRegistry44);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory13);
        org.junit.Assert.assertNotNull(localeResolver16);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array35);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test302");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls3 = null;
        categoryDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls5 = null;
        categoryDAOImpl0.setClazz(cls5);
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test303");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array2 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection3 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3, collection_array2);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData5 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData7 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.lang.String str9 = photographerData0.getPhone();
        photographerData0.setPhone("/collections/{collectionId}/images");
        java.lang.String str12 = photographerData0.getHomepage();
        photographerData0.setIban("/users/becomephotographers");
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection15 = photographerData0.getCollections();
        photographerData0.setPaypalID("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        photographerData0.setPhone("/collections/{collectionId}/images");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list_collection15);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test304");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.Boolean b4 = userData0.isBanned();
        java.lang.String str5 = userData0.getIban();
        userData0.setPhone("null:1528137248666:32ad08d7594d28504f1460b47d9ec391");
        userData0.setHomepage("/users/update");
        userData0.setEmail("/photographer/images");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test305");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str5 = imageData4.getMime();
        imageData4.setPrice((java.lang.Double) 1.0d);
        java.lang.Double d8 = imageData4.getPrice();
        imageData4.setMessageFailed("hi!");
        imageData4.setDescription("/user/login");
        imageData4.setMobilePath("null:1528137279822:b6febc5d19820053275b806a60630a06");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + d8 + "' != '" + 1.0d + "'", d8.equals(1.0d));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test306");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors2);
        org.springframework.validation.Errors errors4 = badRequestException3.getErrors();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController0.handleBadRequestException(badRequestException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController7 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors9 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException10 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors9);
        org.springframework.web.context.request.WebRequest webRequest11 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError12 = photographerController7.handleBadRequestException(badRequestException10, webRequest11);
        int i13 = badRequestException10.getCode();
        org.springframework.web.context.request.WebRequest webRequest14 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError15 = photographerController0.handleBadRequestException(badRequestException10, webRequest14);
        org.springframework.validation.Errors errors17 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException18 = new de.htw.sdf.photoplatform.exception.NotFoundException("ROLE_ADMIN", errors17);
        org.springframework.web.context.request.WebRequest webRequest19 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError20 = photographerController0.handleNotFoundException(notFoundException18, webRequest19);
        de.htw.sdf.photoplatform.persistence.model.Image image21 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str22 = image21.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData23 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image21);
        imageData23.setMobilePath("/users/update");
        java.lang.String str26 = imageData23.getDescription();
        java.lang.String str27 = imageData23.getMetadata();
        java.lang.String str28 = imageData23.getMetadata();
        imageData23.setPath("Category{name='null'}");
        org.springframework.validation.BindingResult bindingResult31 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData32 = photographerController0.updateImage(imageData23, bindingResult31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError12);
        org.junit.Assert.assertTrue(i13 == 10000);
        org.junit.Assert.assertNotNull(responseError15);
        org.junit.Assert.assertNotNull(responseError20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test307");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        image0.setEnabled(true);
        image0.setCreationDate();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test308");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.lang.String str2 = collection0.getName();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory3 = collection0.getCollectionCategories();
        de.htw.sdf.photoplatform.persistence.model.User user4 = collection0.getUser();
        collection0.setName("null:1528137279822:b6febc5d19820053275b806a60630a06");
        de.htw.sdf.photoplatform.persistence.model.User user7 = collection0.getUser();
        boolean b8 = collection0.isPublic();
        org.junit.Assert.assertNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(set_collectionCategory3);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test309");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setEmail("Image{name='null', path='null', isPublic=false, enabled=false, price=-1.0}");
        userRegister0.setLastName("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test310");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array2 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection3 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3, collection_array2);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData5 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData7 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.lang.String str9 = photographerData0.getPhone();
        photographerData0.setPhone("/collections/{collectionId}/images");
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array12 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection13 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection13, collection_array12);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData15 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection13);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData16 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection13);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData18 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection13, (java.lang.Boolean) true);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData20 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection13, (java.lang.Boolean) true);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection13);
        java.lang.String str22 = photographerData0.getPaypalID();
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(list_collectionData15);
        org.junit.Assert.assertNotNull(list_collectionData16);
        org.junit.Assert.assertNotNull(list_collectionData18);
        org.junit.Assert.assertNotNull(list_collectionData20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test311");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isBecomePhotographer();
        boolean b2 = user0.isAccountNonExpired();
        java.lang.String str4 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user0, (long) 11004);
        java.util.Date date5 = null;
        user0.setUpdatedAt(date5);
        java.lang.String str8 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user0, (long) '4');
        java.lang.String str9 = user0.getSecToken();
        boolean b10 = user0.isEnabled();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "39c73479cb767c5a09248b3313c03447" + "'", str4.equals("39c73479cb767c5a09248b3313c03447"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "49961de64838862febaeead9e5ed74a8" + "'", str8.equals("49961de64838862febaeead9e5ed74a8"));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test312");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData7 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str8 = userData7.getLastName();
        java.lang.String str9 = userData7.getEmail();
        java.lang.String str10 = userData7.getHomepage();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData11 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str12 = userData11.getLastName();
        java.util.List<java.lang.String> list_str13 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData11.setRoles(list_str13);
        userData7.setRoles(list_str13);
        java.lang.String str16 = userData7.getSecToken();
        userData7.setFirstName("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10000");
        org.springframework.validation.BindingResult bindingResult19 = null;
        try {
            userController0.updateUser(userData7, bindingResult19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list_str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test313");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array2 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection3 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3, collection_array2);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData5 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData7 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.lang.String str9 = photographerData0.getPhone();
        photographerData0.setPhone("/collections/{collectionId}/images");
        java.lang.String str12 = photographerData0.getIban();
        photographerData0.setPaypalID("/user/register");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test314");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer1 = null;
        application0.configureDefaultServletHandling(defaultServletHandlerConfigurer1);
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array3 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver4 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver4, handlerMethodArgumentResolver_array3);
        application0.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver4);
        org.springframework.format.FormatterRegistry formatterRegistry7 = null;
        application0.addFormatters(formatterRegistry7);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer9 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer9);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test315");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getName();
        image0.setMime("/users/profile/{userId}");
        java.lang.String str9 = image0.toString();
        image0.setMime("/photographer/images");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=1.0}" + "'", str9.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=1.0}"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test316");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image5 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image5.setCreatedBy("");
        image5.setThumbPath("/users/admin/{start}/{count}");
        image5.setUpdatedBy("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        collectionImage4.setImage(image5);
        try {
            collectionImageDAOImpl0.create(collectionImage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test317");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = imageData1.getName();
        imageData1.setMime("/users/profile/{userId}");
        java.lang.String str5 = imageData1.getMessageSuccess();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test318");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        java.lang.String str5 = user0.toString();
        boolean b6 = user0.isAccountNonExpired();
        user0.setAccountNonLocked(false);
        boolean b9 = user0.isAccountNonLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str5.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test319");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        userPasswordChange0.setPasswordConfirm("/collections/{collectionId}/images");
        userPasswordChange0.setPasswordConfirm("/api:1528137282451:b663d46b647142ba0b5f5a8d1cd8d8fe");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test320");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = null;
        collectionData0.setUserdata(userData2);
        java.lang.String str4 = collectionData0.getName();
        long long5 = collectionData0.getId();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData6 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = collectionData0.getThumbnail();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(list_imageData6);
        org.junit.Assert.assertNull(imageData7);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test321");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor1 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest2 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse3 = null;
        de.htw.sdf.photoplatform.Application application4 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer5 = null;
        application4.configureAsyncSupport(asyncSupportConfigurer5);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer7 = null;
        application4.configureAsyncSupport(asyncSupportConfigurer7);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array9 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver10 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver10, handlerExceptionResolver_array9);
        application4.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver10);
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor13 = application4.localeChangeInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange16 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        org.springframework.web.servlet.ModelAndView modelAndView17 = null;
        localeChangeInterceptor13.postHandle(httpServletRequest14, httpServletResponse15, (java.lang.Object) userPasswordChange16, modelAndView17);
        de.htw.sdf.photoplatform.exception.common.WebFormException webFormException20 = new de.htw.sdf.photoplatform.exception.common.WebFormException(11004);
        requestLoggerInterceptor1.afterCompletion(httpServletRequest2, httpServletResponse3, (java.lang.Object) localeChangeInterceptor13, (java.lang.Exception) webFormException20);
        javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse23 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image24 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str25 = image24.toString();
        java.lang.String str26 = image24.getName();
        image24.setDescription("/photographer/upload");
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        requestLoggerInterceptor1.postHandle(httpServletRequest22, httpServletResponse23, (java.lang.Object) image24, modelAndView29);
        java.lang.String str31 = image24.getCreatedBy();
        try {
            imageDAOImpl0.delete(image24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(localeChangeInterceptor13);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str25.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test322");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        org.springframework.validation.Errors errors5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors5);
        int i7 = notFoundException6.getCode();
        notFoundException3.addSuppressed((java.lang.Throwable) notFoundException6);
        org.springframework.web.context.request.WebRequest webRequest9 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError10 = imageController0.handleNotFoundException(notFoundException6, webRequest9);
        org.springframework.validation.Errors errors12 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException13 = new de.htw.sdf.photoplatform.exception.BadRequestException("", errors12);
        org.springframework.validation.Errors errors15 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException16 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors15);
        int i17 = notFoundException16.getCode();
        java.lang.Throwable[] throwable_array18 = notFoundException16.getSuppressed();
        badRequestException13.addSuppressed((java.lang.Throwable) notFoundException16);
        org.springframework.validation.Errors errors20 = badRequestException13.getErrors();
        org.springframework.web.context.request.WebRequest webRequest21 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError22 = imageController0.handleBadRequestException(badRequestException13, webRequest21);
        org.springframework.web.multipart.MultipartFile[] multipartFile_array23 = new org.springframework.web.multipart.MultipartFile[] {};
        try {
            java.lang.String str24 = imageController0.handleImageUpload(multipartFile_array23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertNotNull(responseError10);
        org.junit.Assert.assertTrue(i17 == 10001);
        org.junit.Assert.assertNotNull(throwable_array18);
        org.junit.Assert.assertNull(errors20);
        org.junit.Assert.assertNotNull(responseError22);
        org.junit.Assert.assertNotNull(multipartFile_array23);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test323");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = roleDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role5 = roleDAOImpl0.findOne((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test324");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setPassword("ROLE_PHOTOGRAPHER");
        boolean b4 = user0.isBecomePhotographer();
        user0.setFirstName("null:1528137281269:5056f29775854522e0ebd121af608756");
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test325");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long6 = new java.util.ArrayList<java.lang.Long>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long6, long_array5);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long6);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData9 = collectionData0.getImages();
        java.lang.String str10 = collectionData0.getName();
        collectionData0.setPublic((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(long_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(list_imageData9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test326");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls6 = null;
        userImageDAOImpl0.setClazz(cls6);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage10 = userImageDAOImpl0.getOwnerImages(0L, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test327");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setName("/photographer/upload");
        image0.setPublic(false);
        java.util.Date date5 = image0.getCreatedAt();
        image0.setPublic(false);
        image0.setSmallThumbPath("/users/changepassword");
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test328");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls8 = null;
        userDAOImpl0.setClazz(cls8);
        try {
            javax.persistence.Query query11 = userDAOImpl0.createQuery("de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test329");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData6 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array11 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long12, long_array11);
        collectionData6.setImageIds((java.util.List<java.lang.Long>) arraylist_long12);
        collectionData6.setId((long) (short) 1);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData17 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array22 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long23 = new java.util.ArrayList<java.lang.Long>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long23, long_array22);
        collectionData17.setImageIds((java.util.List<java.lang.Long>) arraylist_long23);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData26 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array31 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long32 = new java.util.ArrayList<java.lang.Long>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long32, long_array31);
        collectionData26.setImageIds((java.util.List<java.lang.Long>) arraylist_long32);
        collectionData17.setImageIds((java.util.List<java.lang.Long>) arraylist_long32);
        collectionData6.setImageIds((java.util.List<java.lang.Long>) arraylist_long32);
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage37 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 100L, (java.lang.Long) 10L, (java.util.List<java.lang.Long>) arraylist_long32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNotNull(long_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(long_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(long_array31);
        org.junit.Assert.assertTrue(b33 == true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test330");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        userRegister0.setEmail("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        userRegister0.setEmail("/users/update");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test331");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        java.lang.String str5 = userData0.getHomepage();
        java.lang.Boolean b6 = userData0.isBanned();
        java.lang.String str7 = userData0.getLastName();
        userData0.setBanned(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test332");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user9 = userDAOImpl0.findByAccountLocked(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test333");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls4 = null;
        imageDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image6);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image6);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData9 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image6);
        image6.setSmallThumbPath("/user/enablephotographer");
        try {
            imageDAOImpl0.delete(image6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNotNull(imageData7);
        org.junit.Assert.assertNotNull(imageData9);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test334");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor1 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest2 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse3 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor1.afterCompletion(httpServletRequest2, httpServletResponse3, (java.lang.Object) 10, (java.lang.Exception) notFoundException6);
        javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse9 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage10 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView11 = null;
        requestLoggerInterceptor1.postHandle(httpServletRequest8, httpServletResponse9, (java.lang.Object) userImage10, modelAndView11);
        java.util.Date date13 = userImage10.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Image image14 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str15 = image14.getMime();
        java.lang.String str16 = image14.getUpdatedBy();
        java.lang.String str17 = image14.getSmallThumbPath();
        java.lang.String str18 = image14.getUpdatedBy();
        java.lang.String str19 = image14.toString();
        userImage10.setImage(image14);
        de.htw.sdf.photoplatform.persistence.model.User user21 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b22 = user21.isPhotographer();
        userImage10.setUser(user21);
        de.htw.sdf.photoplatform.persistence.model.Image image24 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image24.setCreatedBy("");
        image24.setPrice((java.lang.Double) 1.0d);
        java.lang.String str29 = image24.getDescription();
        java.lang.String str30 = image24.getName();
        image24.setMime("/users/profile/{userId}");
        image24.setMetaData("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001");
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage35 = photographerManagerImpl0.createPhotographImage(user21, image24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str19.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test335");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls2 = null;
        userRoleDAOImpl0.setClazz(cls2);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = userRoleDAOImpl0.findOne(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test336");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole6 = userRoleDAOImpl0.findByUserAndRoleId((java.lang.Long) 10L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test337");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image9 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str10 = image9.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData11 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image9);
        imageData11.setName("");
        java.lang.Double d14 = imageData11.getPrice();
        imageData11.setName("/user/enablephotographer");
        org.springframework.web.servlet.ModelAndView modelAndView17 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest7, httpServletResponse8, (java.lang.Object) "/user/enablephotographer", modelAndView17);
        javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse20 = null;
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole21 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role22 = userRole21.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role23 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole21.setRole(role23);
        de.htw.sdf.photoplatform.persistence.model.User user25 = userRole21.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user26 = userRole21.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user27 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b28 = user27.isAdmin();
        java.lang.String str29 = user27.getSecToken();
        userRole21.setUser(user27);
        de.htw.sdf.photoplatform.persistence.model.Role role31 = userRole21.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role32 = userRole21.getRole();
        org.springframework.validation.Errors errors34 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException35 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors34);
        org.springframework.validation.Errors errors37 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException38 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors37);
        int i39 = notFoundException38.getCode();
        notFoundException35.addSuppressed((java.lang.Throwable) notFoundException38);
        requestLoggerInterceptor0.afterCompletion(httpServletRequest19, httpServletResponse20, (java.lang.Object) userRole21, (java.lang.Exception) notFoundException38);
        de.htw.sdf.photoplatform.persistence.model.Role role42 = userRole21.getRole();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(d14);
        org.junit.Assert.assertNull(role22);
        org.junit.Assert.assertNull(user25);
        org.junit.Assert.assertNull(user26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(role31);
        org.junit.Assert.assertNotNull(role32);
        org.junit.Assert.assertTrue(i39 == 10001);
        org.junit.Assert.assertNotNull(role42);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test338");
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException1 = new de.htw.sdf.photoplatform.exception.NotFoundException("/user/makeadmin/{id}");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test339");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls4 = null;
        userDAOImpl0.setClazz(cls4);
        try {
            org.springframework.security.core.userdetails.UserDetails userDetails7 = userDAOImpl0.loadUserByUsername("/collections/update");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test340");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = null;
        collectionData0.setUserdata(userData2);
        java.lang.String str4 = collectionData0.getName();
        long long5 = collectionData0.getId();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str7 = image6.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image6);
        imageData8.setMetadata("/photographer/upload");
        imageData8.setMime("/showcase");
        imageData8.setMessageSuccess("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        collectionData0.setThumbnail(imageData8);
        collectionData0.setId(0L);
        java.util.List<java.lang.Long> list_long18 = collectionData0.getImageIds();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list_long18);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test341");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = null;
        collectionData0.setUserdata(userData2);
        java.lang.String str4 = collectionData0.getName();
        long long5 = collectionData0.getId();
        collectionData0.setId(1L);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str9 = userData8.getLastName();
        collectionData0.setUserdata(userData8);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData11 = collectionData0.getUserdata();
        userData11.setEmail("ROLE_ADMIN");
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(userData11);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test342");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole3 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role4 = userRole3.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role5 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole3.setRole(role5);
        de.htw.sdf.photoplatform.persistence.model.Role role7 = userRole3.getRole();
        role7.setName("/users/admin/{start}/{count}");
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user10 = userDAOImpl0.findByRole(role7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(role4);
        org.junit.Assert.assertNotNull(role7);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test343");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls7 = null;
        userImageDAOImpl0.setClazz(cls7);
        javax.persistence.EntityManager entityManager9 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage10 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        de.htw.sdf.photoplatform.persistence.model.Image image11 = userImage10.getImage();
        de.htw.sdf.photoplatform.persistence.model.User user12 = null;
        userImage10.setUser(user12);
        de.htw.sdf.photoplatform.persistence.model.User user14 = userImage10.getUser();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage15 = userImageDAOImpl0.update(userImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager9);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test344");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls1 = null;
        categoryDAOImpl0.setClazz(cls1);
        try {
            categoryDAOImpl0.deleteById((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test345");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getEmail();
        userData0.setPhone("/photographer/images");
        userData0.setPhone("Category{name='/photographer/images/{imageId}'}");
        userData0.setFirstName("null:1528137297120:81de46218c60e4d53d53e57bf8eedaac");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test346");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        collectionData0.setPublic((java.lang.Boolean) false);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = null;
        collectionData0.setThumbnail(imageData4);
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str7 = image6.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image6);
        imageData8.setMobilePath("/users/update");
        java.lang.Long long11 = imageData8.getCode();
        imageData8.setName("/users/update");
        collectionData0.setThumbnail(imageData8);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData15 = collectionData0.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData16 = collectionData0.getUserdata();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData17 = collectionData0.getThumbnail();
        java.lang.String str18 = collectionData0.getName();
        de.htw.sdf.photoplatform.persistence.model.UserImage[] userImage_array19 = new de.htw.sdf.photoplatform.persistence.model.UserImage[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserImage> arraylist_userImage20 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserImage>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage20, userImage_array19);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData22 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage20);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData23 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage20);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData24 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage20);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData25 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage20);
        collectionData0.setImages(list_imageData25);
        collectionData0.setDescription("null:1528137279822:b6febc5d19820053275b806a60630a06");
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNotNull(imageData15);
        org.junit.Assert.assertNull(userData16);
        org.junit.Assert.assertNotNull(imageData17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(userImage_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(list_imageData22);
        org.junit.Assert.assertNotNull(list_imageData23);
        org.junit.Assert.assertNotNull(list_imageData24);
        org.junit.Assert.assertNotNull(list_imageData25);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test347");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = userImageDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage6 = userImageDAOImpl0.findOne((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test348");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long6 = new java.util.ArrayList<java.lang.Long>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long6, long_array5);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long6);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData9 = collectionData0.getImages();
        de.htw.sdf.photoplatform.persistence.model.Image image10 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str11 = image10.getMime();
        java.lang.String str12 = image10.getUpdatedBy();
        java.lang.String str13 = image10.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData14 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image10);
        java.lang.Long long15 = imageData14.getId();
        collectionData0.setThumbnail(imageData14);
        imageData14.setMime("null:1528137266330:9de181051f39b56aea6ebed61ac6f110");
        org.junit.Assert.assertNotNull(long_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(list_imageData9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(long15);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test349");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPassword();
        userPasswordChange0.setPasswordConfirm("/collections/showcase");
        userPasswordChange0.setPasswordConfirm("Image{name='null', path='null', isPublic=false, enabled=false, price=1.0}");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test350");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        java.lang.String str3 = userData0.getHomepage();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str5 = userData4.getLastName();
        java.util.List<java.lang.String> list_str6 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData4.setRoles(list_str6);
        userData0.setRoles(list_str6);
        userData0.setIban("Category{name='null'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test351");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isBecomePhotographer();
        boolean b2 = user0.isAccountNonExpired();
        user0.setAccountNonLocked(true);
        user0.setUpdatedBy("f69da696e5820bcbd9fb36421272c447");
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test352");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        userRegister0.setLastName("/photographer/images");
        userRegister0.setLastName("null:1528137265625:03bf1b2c50bffe4b6b17dad8841e9f70");
        userRegister0.setPassword("obfuscate");
        userRegister0.setPassword("ROLE_ADMIN");
        userRegister0.setFirstName("null:1528137277050:ea4b11766ecf85bf46d8a52721b360a9");
        userRegister0.setPassword("null:1528137290244:943874d4d401ee35c1fdddc6428199d7");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test353");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        collectionData0.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b4 = collectionData0.getPublic();
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isAdmin();
        java.lang.String str7 = user5.getSecToken();
        boolean b8 = user5.isAccountNonLocked();
        boolean b9 = user5.isCredentialsNonExpired();
        java.lang.String str10 = user5.getLastName();
        java.lang.String str11 = user5.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole12 = user5.getUserRoles();
        de.htw.sdf.photoplatform.persistence.model.Collection collection13 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData0, user5);
        collection13.setDescription("ROLE_BECOME_PHOTOGRAPHER");
        de.htw.sdf.photoplatform.persistence.model.User user16 = collection13.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user17 = collection13.getUser();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(list_userRole12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user17);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test354");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        try {
            collectionImageDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test355");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setPassword("");
        userPasswordChange0.setNewPassword("/users/profile/{userId}");
        java.lang.String str5 = userPasswordChange0.getPassword();
        java.lang.String str6 = userPasswordChange0.getPassword();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test356");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isBecomePhotographer();
        user0.setFirstName("/index.html");
        user0.setId((java.lang.Long) (-1L));
        boolean b6 = user0.isAdmin();
        java.lang.String str8 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user0, (long) '#');
        boolean b9 = user0.isEnabled();
        user0.setPassword("/collections/photographers/{start}/{count}");
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "f69da696e5820bcbd9fb36421272c447" + "'", str8.equals("f69da696e5820bcbd9fb36421272c447"));
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test357");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage9 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView10 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest7, httpServletResponse8, (java.lang.Object) userImage9, modelAndView10);
        de.htw.sdf.photoplatform.persistence.model.Image image12 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str13 = image12.getMime();
        java.lang.String str14 = image12.getUpdatedBy();
        java.lang.String str15 = image12.getSmallThumbPath();
        image12.setCreatedBy("/collections/addimage");
        image12.setEnabled(true);
        userImage9.setImage(image12);
        image12.setChangeDate();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData22 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image12);
        java.lang.String str23 = imageData22.getThumbnailPath();
        java.lang.String str24 = imageData22.getMessageSuccess();
        java.lang.String str25 = imageData22.getName();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(imageData22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test358");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.Long long5 = imageData2.getCode();
        imageData2.setName("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = imageData2.getUserData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData9 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData9.setSwift("/photographer/images");
        imageData2.setUserData(userData9);
        userData9.setSwift("/user/register");
        java.lang.String str15 = userData9.getSecToken();
        userData9.setEnabled(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(userData8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test359");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userRoleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager7 = userRoleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole8 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role9 = userRole8.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role10 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole8.setRole(role10);
        de.htw.sdf.photoplatform.persistence.model.Role role12 = userRole8.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role13 = userRole8.getRole();
        try {
            userRoleDAOImpl0.create(userRole8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager7);
        org.junit.Assert.assertNull(role9);
        org.junit.Assert.assertNotNull(role12);
        org.junit.Assert.assertNotNull(role13);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test360");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = collectionData0.getThumbnail();
        collectionData0.setDescription("null:1528137271348:359dea61c52e045b1b927389910fdd93");
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(imageData2);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test361");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isBecomePhotographer();
        boolean b2 = user0.isAccountNonExpired();
        java.lang.String str4 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user0, (long) 11004);
        java.util.Date date5 = null;
        user0.setUpdatedAt(date5);
        user0.setFirstName("/collections/{collectionId}");
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData9 = new de.htw.sdf.photoplatform.webservice.dto.UserData(user0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "39c73479cb767c5a09248b3313c03447" + "'", str4.equals("39c73479cb767c5a09248b3313c03447"));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test362");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("/collections/addimage");
        java.lang.String str3 = userRegister0.getLastName();
        java.lang.String str4 = userRegister0.getPasswordConfirm();
        java.lang.String str5 = userRegister0.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "/collections/addimage" + "'", str3.equals("/collections/addimage"));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test363");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors1);
        org.springframework.validation.Errors errors3 = notFoundException2.getErrors();
        org.springframework.validation.Errors errors4 = notFoundException2.getErrors();
        org.junit.Assert.assertNull(errors3);
        org.junit.Assert.assertNull(errors4);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test364");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.Boolean b4 = userData0.isBanned();
        userData0.setAdmin(false);
        java.lang.String str7 = userData0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test365");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setId((java.lang.Long) 0L);
        java.lang.String str3 = userData0.getPhone();
        java.lang.String str4 = userData0.getSecToken();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test366");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("null:1528137265168:246d1b80c2f43651d8cc26e44925e89a", errors1);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test367");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors2);
        org.springframework.validation.Errors errors4 = badRequestException3.getErrors();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController0.handleBadRequestException(badRequestException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController7 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors9 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException10 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors9);
        org.springframework.web.context.request.WebRequest webRequest11 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError12 = photographerController7.handleBadRequestException(badRequestException10, webRequest11);
        int i13 = badRequestException10.getCode();
        org.springframework.web.context.request.WebRequest webRequest14 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError15 = photographerController0.handleBadRequestException(badRequestException10, webRequest14);
        org.springframework.validation.BindingResult bindingResult17 = null;
        try {
            java.lang.String str18 = photographerController0.addImageToCollection("/users/admin/{start}/{count}", bindingResult17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError12);
        org.junit.Assert.assertTrue(i13 == 10000);
        org.junit.Assert.assertNotNull(responseError15);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test368");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController1 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException4 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors3);
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController1.handleBadRequestException(badRequestException4, webRequest5);
        org.springframework.web.context.request.WebRequest webRequest7 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError8 = authenticationController0.handleBadRequestException(badRequestException4, webRequest7);
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController9 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors11 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException12 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors11);
        org.springframework.validation.Errors errors14 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException15 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors14);
        int i16 = notFoundException15.getCode();
        notFoundException12.addSuppressed((java.lang.Throwable) notFoundException15);
        org.springframework.web.context.request.WebRequest webRequest18 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError19 = imageController9.handleNotFoundException(notFoundException15, webRequest18);
        java.lang.Throwable[] throwable_array20 = notFoundException15.getSuppressed();
        org.springframework.web.context.request.WebRequest webRequest21 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError22 = authenticationController0.handleNotFoundException(notFoundException15, webRequest21);
        java.lang.RuntimeException runtimeException23 = null;
        try {
            authenticationController0.handleBaseException(runtimeException23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
        org.junit.Assert.assertTrue(i16 == 10001);
        org.junit.Assert.assertNotNull(responseError19);
        org.junit.Assert.assertNotNull(throwable_array20);
        org.junit.Assert.assertNotNull(responseError22);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test369");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        java.lang.String str4 = user1.getUpdatedBy();
        java.lang.String str6 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user1, (long) 10001);
        java.lang.String str7 = user1.getLastName();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5b077a3001f6b54eed6802448a739229" + "'", str6.equals("5b077a3001f6b54eed6802448a739229"));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test370");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData1 = collectionData0.getUserdata();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str3 = image2.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image2);
        java.lang.String str5 = imageData4.getPath();
        imageData4.setDescription("null:1528137248666:32ad08d7594d28504f1460b47d9ec391");
        collectionData0.setThumbnail(imageData4);
        org.junit.Assert.assertNull(userData1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test371");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        java.lang.String str5 = user0.toString();
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        java.util.Date date9 = null;
        user0.setCreatedAt(date9);
        boolean b11 = user0.isBecomePhotographer();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str5.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test372");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage9 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView10 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest7, httpServletResponse8, (java.lang.Object) userImage9, modelAndView10);
        java.util.Date date12 = userImage9.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.User user13 = userImage9.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user14 = userImage9.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user15 = userImage9.getUser();
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test373");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        java.util.Date date6 = collectionImage0.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Image image7 = collectionImage0.getImage();
        java.lang.String str8 = image7.getSmallThumbPath();
        org.junit.Assert.assertNotNull(image5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(image7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test374");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange1 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange1.setNewPassword("/showcase");
        java.lang.String str4 = userPasswordChange1.getPasswordConfirm();
        userPasswordChange1.setPasswordConfirm("");
        java.lang.String str7 = userPasswordChange1.getPasswordConfirm();
        org.springframework.validation.BindingResult bindingResult8 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData9 = userController0.changePassword(userPasswordChange1, bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test375");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        java.lang.String str1 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test376");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPasswordConfirm();
        userPasswordChange0.setNewPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001");
        userPasswordChange0.setNewPassword("/user/lock/{id}");
        userPasswordChange0.setNewPassword("obfuscate");
        userPasswordChange0.setPasswordConfirm("/user/unlock/{id}");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test377");
        de.htw.sdf.photoplatform.webservice.dto.UserCredential userCredential0 = new de.htw.sdf.photoplatform.webservice.dto.UserCredential();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test378");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry6 = null;
        application0.addResourceHandlers(resourceHandlerRegistry6);
        org.springframework.web.servlet.LocaleResolver localeResolver8 = application0.localeResolver();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry9 = null;
        application0.addResourceHandlers(resourceHandlerRegistry9);
        org.springframework.validation.MessageCodesResolver messageCodesResolver11 = application0.getMessageCodesResolver();
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor12 = application0.localeChangeInterceptor();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer13 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer13);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(localeResolver8);
        org.junit.Assert.assertNull(messageCodesResolver11);
        org.junit.Assert.assertNotNull(localeChangeInterceptor12);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test379");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors2);
        org.springframework.validation.Errors errors4 = badRequestException3.getErrors();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController0.handleBadRequestException(badRequestException3, webRequest5);
        try {
            java.lang.String str8 = photographerController0.deletePhotographersImage((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test380");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer5 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer5);
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry7 = null;
        try {
            application0.addInterceptors(interceptorRegistry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test381");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test382");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData7 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str8 = userData7.getLastName();
        java.util.List<java.lang.String> list_str9 = userData7.getRoles();
        java.lang.String str10 = userData7.getSwift();
        java.lang.Boolean b11 = userData7.isEnabled();
        java.lang.String str12 = userData7.getFirstName();
        userData7.setSecToken("ec7908a224b49d37ffc84c612f320838");
        org.springframework.validation.BindingResult bindingResult15 = null;
        try {
            userController0.updateUser(userData7, bindingResult15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test383");
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory0 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = null;
        collectionCategory0.setCollection(collection1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = null;
        collectionCategory0.setCollection(collection3);
        de.htw.sdf.photoplatform.persistence.model.Category category5 = collectionCategory0.getCategory();
        java.util.Date date6 = collectionCategory0.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = collectionCategory0.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Collection collection8 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user9 = collection8.getUser();
        java.lang.String str10 = collection8.getName();
        java.lang.String str11 = collection8.toString();
        collection8.setDescription("Collection{user=null, name='null'}");
        collectionCategory0.setCollection(collection8);
        org.junit.Assert.assertNull(category5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Collection{user=null, name='null'}" + "'", str11.equals("Collection{user=null, name='null'}"));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test384");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            boolean b8 = userController0.enablePhotographer("/photographer/upload");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test385");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        userData0.setIban("/collections/{collectionId}");
        java.lang.Boolean b5 = userData0.isEnabled();
        userData0.setPhone("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER");
        java.lang.String str8 = userData0.getCompany();
        userData0.setHomepage("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test386");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER");
        org.springframework.web.context.request.WebRequest webRequest3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = photographerController0.handleBadRequestException(badRequestException2, webRequest3);
        try {
            java.lang.String str6 = photographerController0.deletePhotographersImage((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError4);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test387");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        javax.persistence.EntityManager entityManager7 = userDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user10 = userDAOImpl0.findByRoleAndEnabledFilter("/api:1528137282451:b663d46b647142ba0b5f5a8d1cd8d8fe", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager7);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test388");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls5 = null;
        imageDAOImpl0.setClazz(cls5);
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image8 = imageDAOImpl0.findOne(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test389");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        java.lang.String str3 = userData0.getHomepage();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str5 = userData4.getLastName();
        java.util.List<java.lang.String> list_str6 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData4.setRoles(list_str6);
        userData0.setRoles(list_str6);
        userData0.setPhone("Collection{user=null, name='null'}");
        userData0.setLastName("/users/admin/{start}/{count}");
        userData0.setBanned(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test390");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        image0.setCreatedBy("ROLE_ADMIN");
        java.lang.String str7 = image0.toString();
        image0.setId((java.lang.Long) 1L);
        java.lang.String str10 = image0.getMobileThumbPath();
        image0.setDescription("Category{name='null'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str7.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test391");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.Double d7 = imageData6.getPrice();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + d7 + "' != '" + 1.0d + "'", d7.equals(1.0d));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test392");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        image0.setMobileThumbPath("/photographer/upload");
        boolean b9 = image0.isPublic();
        image0.setEnabled(false);
        image0.setSmallThumbPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test393");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage9 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView10 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest7, httpServletResponse8, (java.lang.Object) userImage9, modelAndView10);
        java.util.Date date12 = userImage9.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Image image13 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str14 = image13.getMime();
        java.lang.String str15 = image13.getUpdatedBy();
        java.lang.String str16 = image13.getSmallThumbPath();
        java.lang.String str17 = image13.getUpdatedBy();
        java.lang.String str18 = image13.toString();
        userImage9.setImage(image13);
        de.htw.sdf.photoplatform.persistence.model.User user20 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b21 = user20.isPhotographer();
        userImage9.setUser(user20);
        de.htw.sdf.photoplatform.persistence.model.User user23 = userImage9.getUser();
        boolean b24 = user23.isAccountNonLocked();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole25 = user23.getUserRoles();
        java.lang.String str26 = user23.getFirstName();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData27 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection28 = photographerData27.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array29 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection30 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection30, collection_array29);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData32 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection30);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData33 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection30);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData34 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection30);
        photographerData27.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection30);
        java.lang.String str36 = photographerData27.getPhone();
        photographerData27.setPhone("/collections/{collectionId}/images");
        java.lang.String str39 = photographerData27.getHomepage();
        java.lang.String str40 = photographerData27.getIban();
        user23.setPhotographerData(photographerData27);
        java.lang.String str42 = user23.getLastName();
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str18.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(list_userRole25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(list_collection28);
        org.junit.Assert.assertNotNull(collection_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(list_collectionData32);
        org.junit.Assert.assertNotNull(list_collectionData33);
        org.junit.Assert.assertNotNull(list_collectionData34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test394");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.Double d1 = image0.getPrice();
        image0.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str4 = image0.getUpdatedBy();
        image0.setCreatedBy("Category{name='/photographer/images/{imageId}'}");
        java.lang.String str7 = image0.toString();
        java.lang.String str8 = image0.getMetaData();
        org.junit.Assert.assertNull(d1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=-1.0}" + "'", str7.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=-1.0}"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test395");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.toString();
        java.lang.String str2 = image0.getName();
        image0.setName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str5 = image0.getMobileThumbPath();
        java.lang.String str6 = image0.getDescription();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test396");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = null;
        collectionData0.setUserdata(userData2);
        java.lang.String str4 = collectionData0.getName();
        long long5 = collectionData0.getId();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str7 = image6.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image6);
        imageData8.setMetadata("/photographer/upload");
        imageData8.setMime("/showcase");
        imageData8.setMessageSuccess("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        collectionData0.setThumbnail(imageData8);
        java.lang.Boolean b16 = collectionData0.getPublic();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData17 = collectionData0.getThumbnail();
        java.lang.String str18 = collectionData0.getDescription();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(b16);
        org.junit.Assert.assertNotNull(imageData17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test397");
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData0 = new de.htw.sdf.photoplatform.webservice.dto.ImageData();
        imageData0.setMessageSuccess("/user/unlock/{id}");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test398");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user4 = userDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test399");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = collectionData0.getThumbnail();
        java.lang.Long[] long_array4 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long5, long_array4);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long5);
        collectionData0.setId((long) (short) -1);
        java.lang.Long[] long_array11 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long12, long_array11);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long12);
        collectionData0.setDescription("/collections/showcase");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData17 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str18 = userData17.getLastName();
        java.util.List<java.lang.String> list_str19 = userData17.getRoles();
        java.lang.String str20 = userData17.getSecToken();
        userData17.setCompany("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        java.lang.String str23 = userData17.getSwift();
        java.lang.String str24 = userData17.getIban();
        collectionData0.setUserdata(userData17);
        java.lang.Boolean b26 = collectionData0.getPublic();
        collectionData0.setName("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(imageData2);
        org.junit.Assert.assertNotNull(long_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(long_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(list_str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(b26);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test400");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory1 = null;
        collection0.setCollectionCategories(set_collectionCategory1);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory3 = collection0.getCollectionCategories();
        org.junit.Assert.assertNull(set_collectionCategory3);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test401");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData1 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str2 = userData1.getLastName();
        java.util.List<java.lang.String> list_str3 = userData1.getRoles();
        java.lang.String str4 = userData1.getSecToken();
        java.lang.String str5 = userData1.getLastName();
        java.lang.String str6 = userData1.getHomepage();
        org.springframework.validation.BindingResult bindingResult7 = null;
        try {
            userController0.updateUser(userData1, bindingResult7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(list_str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test402");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        collectionData0.setPublic((java.lang.Boolean) false);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = null;
        collectionData0.setThumbnail(imageData4);
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str7 = image6.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image6);
        imageData8.setMobilePath("/users/update");
        java.lang.Long long11 = imageData8.getCode();
        imageData8.setName("/users/update");
        collectionData0.setThumbnail(imageData8);
        java.lang.Double d15 = imageData8.getPrice();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(d15);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test403");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls3 = null;
        collectionCategoryDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls5 = null;
        collectionCategoryDAOImpl0.setClazz(cls5);
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test404");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity4 = xAuthTokenConfigurer3.and();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test405");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPaypalID("/photographer/images/{imageId}");
        java.lang.String str5 = becomePhotographer0.getSwift();
        becomePhotographer0.setCompany("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        java.lang.String str8 = becomePhotographer0.getIban();
        java.lang.String str9 = becomePhotographer0.getCompany();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null:1528137250344:31149e863206f62132f4465a1c878d2c" + "'", str9.equals("null:1528137250344:31149e863206f62132f4465a1c878d2c"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test406");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        java.lang.String str5 = becomePhotographer0.getCompany();
        becomePhotographer0.setIban("/collections/addimage");
        becomePhotographer0.setHomepage("null:1528137255129:74131369d5ab98a30139e53b9d69dc36");
        becomePhotographer0.setSwift("");
        java.lang.String str12 = becomePhotographer0.getCompany();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test407");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls7 = null;
        userImageDAOImpl0.setClazz(cls7);
        javax.persistence.EntityManager entityManager9 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls10 = null;
        userImageDAOImpl0.setClazz(cls10);
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor12 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse14 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException17 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor12.afterCompletion(httpServletRequest13, httpServletResponse14, (java.lang.Object) 10, (java.lang.Exception) notFoundException17);
        javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse20 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage21 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView22 = null;
        requestLoggerInterceptor12.postHandle(httpServletRequest19, httpServletResponse20, (java.lang.Object) userImage21, modelAndView22);
        java.util.Date date24 = userImage21.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.User user25 = new de.htw.sdf.photoplatform.persistence.model.User();
        user25.setEnabled(false);
        userImage21.setOwner(user25);
        de.htw.sdf.photoplatform.persistence.model.Image image29 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str30 = image29.getMime();
        java.lang.String str31 = image29.getMobileThumbPath();
        image29.setMetaData("/user/makeadmin/{id}");
        java.lang.String str34 = image29.toString();
        java.lang.String str35 = image29.getName();
        userImage21.setImage(image29);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage37 = userImageDAOImpl0.update(userImage21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager9);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str34.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test408");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        userData0.setFirstName("obfuscate");
        java.lang.String str5 = userData0.getHomepage();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test409");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        collectionData0.setPublic((java.lang.Boolean) false);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = null;
        collectionData0.setThumbnail(imageData4);
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str7 = image6.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image6);
        imageData8.setMobilePath("/users/update");
        java.lang.Long long11 = imageData8.getCode();
        imageData8.setName("/users/update");
        collectionData0.setThumbnail(imageData8);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData15 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData15.setId((java.lang.Long) 0L);
        userData15.setEnabled(false);
        userData15.setAdmin(false);
        userData15.setId((java.lang.Long) 100L);
        collectionData0.setUserdata(userData15);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData25 = collectionData0.getImages();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(list_imageData25);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test410");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole4 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role5 = userRole4.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role6 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole4.setRole(role6);
        de.htw.sdf.photoplatform.persistence.model.User user8 = userRole4.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user9 = userRole4.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user10 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b11 = user10.isAdmin();
        java.lang.String str12 = user10.getSecToken();
        userRole4.setUser(user10);
        de.htw.sdf.photoplatform.persistence.model.Role role14 = userRole4.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role15 = userRole4.getRole();
        try {
            userRoleDAOImpl0.delete(userRole4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(role5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(role14);
        org.junit.Assert.assertNotNull(role15);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test411");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        image0.setCreatedBy("ROLE_ADMIN");
        java.lang.String str7 = image0.toString();
        boolean b8 = image0.isPublic();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str7.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test412");
        de.htw.sdf.photoplatform.persistence.model.UserImage[] userImage_array0 = new de.htw.sdf.photoplatform.persistence.model.UserImage[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserImage> arraylist_userImage1 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserImage>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage1, userImage_array0);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData3 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData4 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData5 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData7 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage1);
        org.junit.Assert.assertNotNull(userImage_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_imageData3);
        org.junit.Assert.assertNotNull(list_imageData4);
        org.junit.Assert.assertNotNull(list_imageData5);
        org.junit.Assert.assertNotNull(list_imageData6);
        org.junit.Assert.assertNotNull(list_imageData7);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test413");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str9 = image0.getSmallThumbPath();
        java.lang.String str10 = image0.getMime();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test414");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        javax.persistence.EntityManager entityManager7 = roleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole8 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role9 = userRole8.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role10 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole8.setRole(role10);
        de.htw.sdf.photoplatform.persistence.model.User user12 = userRole8.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user13 = userRole8.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user14 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b15 = user14.isAdmin();
        java.lang.String str16 = user14.getSecToken();
        userRole8.setUser(user14);
        de.htw.sdf.photoplatform.persistence.model.Role role18 = userRole8.getRole();
        role18.setName("null:1528137248666:32ad08d7594d28504f1460b47d9ec391");
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role21 = roleDAOImpl0.update(role18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager7);
        org.junit.Assert.assertNull(role9);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(role18);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test415");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isBecomePhotographer();
        boolean b2 = user0.isAccountNonExpired();
        user0.setFirstName("77ce3535f163da232981f0d31864a601ca7857e39a64df07a354c6860cf425727ccc18a2328f2e2bfe2e86f09067f3be6c7841e138ba6b4e2d0fea3d964ab0d9");
        user0.setAccountNonLocked(true);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test416");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.servlet.config.annotation.ViewControllerRegistry viewControllerRegistry3 = null;
        application0.addViewControllers(viewControllerRegistry3);
        org.springframework.web.servlet.config.annotation.ViewControllerRegistry viewControllerRegistry5 = null;
        application0.addViewControllers(viewControllerRegistry5);
        org.springframework.web.servlet.LocaleResolver localeResolver7 = application0.localeResolver();
        de.htw.sdf.photoplatform.Application application8 = new de.htw.sdf.photoplatform.Application();
        de.htw.sdf.photoplatform.Application application9 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer10 = null;
        application9.configureAsyncSupport(asyncSupportConfigurer10);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer12 = null;
        application9.configureAsyncSupport(asyncSupportConfigurer12);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array14 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver15 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver15, handlerExceptionResolver_array14);
        application9.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver15);
        org.springframework.web.servlet.LocaleResolver localeResolver18 = application9.localeResolver();
        de.htw.sdf.photoplatform.Application application19 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer20 = null;
        application19.configureDefaultServletHandling(defaultServletHandlerConfigurer20);
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array22 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver23 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver23, handlerMethodArgumentResolver_array22);
        application19.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver23);
        application9.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver23);
        application8.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver23);
        application0.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver23);
        de.htw.sdf.photoplatform.Application application29 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer30 = null;
        application29.configureAsyncSupport(asyncSupportConfigurer30);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer32 = null;
        application29.configureAsyncSupport(asyncSupportConfigurer32);
        org.springframework.validation.MessageCodesResolver messageCodesResolver34 = application29.getMessageCodesResolver();
        de.htw.sdf.photoplatform.Application application35 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer36 = null;
        application35.configureDefaultServletHandling(defaultServletHandlerConfigurer36);
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array38 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver39 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver39, handlerMethodArgumentResolver_array38);
        application35.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver39);
        application29.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver39);
        application0.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver39);
        org.junit.Assert.assertNotNull(localeResolver7);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(localeResolver18);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(messageCodesResolver34);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array38);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test417");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError((int) (short) -1, 0, "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception", errors3);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test418");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isEnabled();
        user0.setCreatedBy("Collection{user=null, name='null'}");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test419");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image2.setCreatedBy("");
        image2.setPrice((java.lang.Double) 1.0d);
        java.lang.String str7 = image2.getDescription();
        java.lang.String str8 = image2.getMime();
        image2.setMobileThumbPath("/photographer/upload");
        boolean b11 = image2.isEnabled();
        image2.setPrice((java.lang.Double) 1.0d);
        collection1.setThumbnail(image2);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage15 = collection1.getCollectionImages();
        java.lang.String str16 = collection1.toString();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory17 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection18 = null;
        collectionCategory17.setCollection(collection18);
        de.htw.sdf.photoplatform.persistence.model.Collection collection20 = null;
        collectionCategory17.setCollection(collection20);
        de.htw.sdf.photoplatform.persistence.model.Category category22 = collectionCategory17.getCategory();
        java.util.Date date23 = collectionCategory17.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory[] collectionCategory_array24 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory[] { collectionCategory17 };
        java.util.LinkedHashSet<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> linkedhashset_collectionCategory25 = new java.util.LinkedHashSet<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>) linkedhashset_collectionCategory25, collectionCategory_array24);
        collection1.setCollectionCategories((java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>) linkedhashset_collectionCategory25);
        collection1.setCreatedBy("/collections/{collectionId}/images");
        java.lang.String str30 = collection1.getName();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection31 = photographerManagerImpl0.update(collection1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(set_collectionImage15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Collection{user=null, name='null'}" + "'", str16.equals("Collection{user=null, name='null'}"));
        org.junit.Assert.assertNull(category22);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertNotNull(collectionCategory_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test420");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = image0.getCreatedBy();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str5 = userData4.getLastName();
        java.util.List<java.lang.String> list_str6 = userData4.getRoles();
        java.lang.String str7 = userData4.getEmail();
        userData4.setPaypalID("/users/admin/{start}/{count}");
        userData4.setEmail("/user/{name}");
        imageData3.setUserData(userData4);
        java.util.List<java.lang.String> list_str13 = userData4.getRoles();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list_str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list_str13);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test421");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        java.lang.String str3 = userData0.getHomepage();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str5 = userData4.getLastName();
        java.util.List<java.lang.String> list_str6 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData4.setRoles(list_str6);
        userData0.setRoles(list_str6);
        java.lang.String str9 = userData0.getLastName();
        userData0.setLastName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        java.lang.String str12 = userData0.getEmail();
        java.lang.String str13 = userData0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test422");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory4 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = null;
        collectionCategory4.setCollection(collection5);
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = null;
        collectionCategory4.setCollection(collection7);
        de.htw.sdf.photoplatform.persistence.model.Collection collection9 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user10 = collection9.getUser();
        java.lang.String str11 = collection9.getName();
        collectionCategory4.setCollection(collection9);
        try {
            collectionCategoryDAOImpl0.create(collectionCategory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test423");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.Boolean b4 = userData0.isEnabled();
        userData0.setPhone("/collections/photographers");
        java.lang.Long long7 = userData0.getId();
        java.lang.String str8 = userData0.getPaypalID();
        userData0.setSwift("de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test424");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setIban("obfuscate");
        java.lang.String str3 = becomePhotographer0.getPhone();
        becomePhotographer0.setIban("null:1528137255129:74131369d5ab98a30139e53b9d69dc36");
        becomePhotographer0.setIban("5466ee41bed5654e4115c42a3a83695ca4116b0fb962fb91947017276c09124bb3c17abbb2199e1cb0917457cd1ad525f8bedf7a627e026584a96766ac42d85e");
        becomePhotographer0.setCompany("null:1528137255129:74131369d5ab98a30139e53b9d69dc36");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test425");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData7 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str8 = userData7.getLastName();
        java.util.List<java.lang.String> list_str9 = userData7.getRoles();
        java.lang.String str10 = userData7.getSecToken();
        java.lang.String str11 = userData7.getLastName();
        java.lang.Boolean b12 = userData7.isEnabled();
        java.lang.String str13 = userData7.getIban();
        java.lang.String str14 = userData7.getHomepage();
        userData7.setIban("/photographer/upload");
        org.springframework.validation.BindingResult bindingResult17 = null;
        try {
            userController0.updateUser(userData7, bindingResult17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test426");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors2);
        org.springframework.validation.Errors errors4 = badRequestException3.getErrors();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController0.handleBadRequestException(badRequestException3, webRequest5);
        java.lang.RuntimeException runtimeException7 = null;
        try {
            photographerController0.handleBaseException(runtimeException7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test427");
        de.htw.sdf.photoplatform.manager.impl.HashManagerImpl hashManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.HashManagerImpl();
        java.lang.String str2 = hashManagerImpl0.hash("/user/becomePhotographer");
        java.lang.String str4 = hashManagerImpl0.hash("Image{name='null', path='', isPublic=false, enabled=false, price=1.0}");
        java.lang.String str6 = hashManagerImpl0.hash("/index.html");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c" + "'", str2.equals("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "77ce3535f163da232981f0d31864a601ca7857e39a64df07a354c6860cf425727ccc18a2328f2e2bfe2e86f09067f3be6c7841e138ba6b4e2d0fea3d964ab0d9" + "'", str4.equals("77ce3535f163da232981f0d31864a601ca7857e39a64df07a354c6860cf425727ccc18a2328f2e2bfe2e86f09067f3be6c7841e138ba6b4e2d0fea3d964ab0d9"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "c18adf3e6684fc8f2606e13da230b0c8c917a59e137641a907750738357c63953b78e49d28b55aac397b8e9803482afc7f6207bb5836f5a1bc28d6adbc31995f" + "'", str6.equals("c18adf3e6684fc8f2606e13da230b0c8c917a59e137641a907750738357c63953b78e49d28b55aac397b8e9803482afc7f6207bb5836f5a1bc28d6adbc31995f"));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test428");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        java.lang.String str2 = userRegister0.getFirstName();
        userRegister0.setEmail("/collections/{collectionId}");
        java.lang.String str5 = userRegister0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test429");
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException1 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException((int) '#');
        java.lang.Throwable[] throwable_array2 = authorizationException1.getSuppressed();
        int i3 = authorizationException1.getCode();
        org.junit.Assert.assertNotNull(throwable_array2);
        org.junit.Assert.assertTrue(i3 == 35);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test430");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = null;
        collectionData0.setUserdata(userData2);
        java.lang.String str4 = collectionData0.getName();
        long long5 = collectionData0.getId();
        collectionData0.setId(1L);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str9 = userData8.getLastName();
        collectionData0.setUserdata(userData8);
        collectionData0.setName("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData13 = collectionData0.getUserdata();
        java.lang.Long long14 = userData13.getId();
        userData13.setSwift("null:1528137265168:246d1b80c2f43651d8cc26e44925e89a");
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(userData13);
        org.junit.Assert.assertNull(long14);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test431");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = image0.getCreatedBy();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str4 = imageData3.getMetadata();
        java.lang.String str5 = imageData3.getDescription();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test432");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setId((java.lang.Long) 0L);
        java.lang.String str3 = userData0.getSecToken();
        userData0.setSwift("aa0668324371e9b034306466d6abdba5");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test433");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.makeAdmin("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test434");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user5 = userDAOImpl0.findByEmail("/photographer/images");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test435");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors2);
        org.springframework.validation.Errors errors4 = badRequestException3.getErrors();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController0.handleBadRequestException(badRequestException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController7 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors9 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException10 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors9);
        org.springframework.web.context.request.WebRequest webRequest11 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError12 = photographerController7.handleBadRequestException(badRequestException10, webRequest11);
        int i13 = badRequestException10.getCode();
        org.springframework.web.context.request.WebRequest webRequest14 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError15 = photographerController0.handleBadRequestException(badRequestException10, webRequest14);
        org.springframework.validation.BindingResult bindingResult17 = null;
        try {
            java.lang.String str18 = photographerController0.addImageToCollection("/collections/photographers", bindingResult17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError12);
        org.junit.Assert.assertTrue(i13 == 10000);
        org.junit.Assert.assertNotNull(responseError15);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test436");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        image5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str8 = image5.getSmallThumbPath();
        boolean b9 = image5.isEnabled();
        boolean b10 = image5.isEnabled();
        org.junit.Assert.assertNotNull(image5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test437");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        java.lang.Long long1 = collectionImage0.getId();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = null;
        collectionImage0.setImage(image2);
        java.util.Date date4 = collectionImage0.getCreatedAt();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test438");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData0.setRoles(list_str2);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str5 = userData4.getLastName();
        java.util.List<java.lang.String> list_str6 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData4.setRoles(list_str6);
        userData0.setRoles(list_str6);
        userData0.setBanned(false);
        java.lang.String str11 = userData0.getSwift();
        userData0.setSecToken("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_CUSTOMER");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test439");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage5 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test440");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setMetaData("/user/becomePhotographer");
        java.lang.Long long6 = image0.getId();
        image0.setEnabled(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test441");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long6 = new java.util.ArrayList<java.lang.Long>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long6, long_array5);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long6);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData9 = collectionData0.getThumbnail();
        java.lang.String str10 = collectionData0.getDescription();
        org.junit.Assert.assertNotNull(long_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(imageData9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test442");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setCreatedBy("/collections/addimage");
        java.lang.Long long6 = image0.getId();
        java.lang.String str7 = image0.getMobileThumbPath();
        boolean b8 = image0.isEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test443");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls7 = null;
        userDAOImpl0.setClazz(cls7);
        try {
            userDAOImpl0.deleteById((long) 11003);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test444");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        image0.setMobileThumbPath("/photographer/upload");
        java.lang.String str9 = image0.getMobileThumbPath();
        java.lang.Double d10 = image0.getPrice();
        image0.setEnabled(false);
        image0.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "/photographer/upload" + "'", str9.equals("/photographer/upload"));
        org.junit.Assert.assertTrue("'" + d10 + "' != '" + 1.0d + "'", d10.equals(1.0d));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test445");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        boolean b4 = user0.isCredentialsNonExpired();
        boolean b5 = user0.isCredentialsNonExpired();
        java.lang.String str6 = user0.getPassword();
        boolean b7 = user0.isEnabled();
        java.lang.String str8 = user0.getPassword();
        user0.setEnabled(true);
        java.lang.String str11 = user0.getPassword();
        boolean b12 = user0.isBecomePhotographer();
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test446");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors1);
        int i3 = notFoundException2.getCode();
        java.lang.Throwable[] throwable_array4 = notFoundException2.getSuppressed();
        org.springframework.validation.Errors errors6 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException7 = new de.htw.sdf.photoplatform.exception.BadRequestException("", errors6);
        org.springframework.validation.Errors errors9 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException10 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors9);
        int i11 = notFoundException10.getCode();
        java.lang.Throwable[] throwable_array12 = notFoundException10.getSuppressed();
        badRequestException7.addSuppressed((java.lang.Throwable) notFoundException10);
        notFoundException2.addSuppressed((java.lang.Throwable) notFoundException10);
        int i15 = notFoundException10.getCode();
        org.springframework.validation.Errors errors16 = notFoundException10.getErrors();
        org.junit.Assert.assertTrue(i3 == 10001);
        org.junit.Assert.assertNotNull(throwable_array4);
        org.junit.Assert.assertTrue(i11 == 10001);
        org.junit.Assert.assertNotNull(throwable_array12);
        org.junit.Assert.assertTrue(i15 == 10001);
        org.junit.Assert.assertNull(errors16);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test447");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry6 = null;
        application0.addResourceHandlers(resourceHandlerRegistry6);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory8 = application0.servletContainer();
        de.htw.sdf.photoplatform.Application application9 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer10 = null;
        application9.configureDefaultServletHandling(defaultServletHandlerConfigurer10);
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array12 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver13 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver13, handlerMethodArgumentResolver_array12);
        application9.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver13);
        application0.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver13);
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor17 = application0.localeChangeInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest18 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse19 = null;
        de.htw.sdf.photoplatform.persistence.model.Collection collection20 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory21 = null;
        collection20.setCollectionCategories(set_collectionCategory21);
        org.springframework.web.servlet.ModelAndView modelAndView23 = null;
        localeChangeInterceptor17.postHandle(httpServletRequest18, httpServletResponse19, (java.lang.Object) collection20, modelAndView23);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(localeChangeInterceptor17);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test448");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        image1.setPrice((java.lang.Double) 1.0d);
        java.lang.String str6 = image1.getDescription();
        java.lang.String str7 = image1.getMime();
        image1.setMobileThumbPath("/photographer/upload");
        boolean b10 = image1.isEnabled();
        image1.setPrice((java.lang.Double) 1.0d);
        collection0.setThumbnail(image1);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage14 = collection0.getCollectionImages();
        de.htw.sdf.photoplatform.persistence.model.Image image15 = collection0.getThumbnail();
        java.lang.String str16 = collection0.getName();
        boolean b17 = collection0.isPublic();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(set_collectionImage14);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test449");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        userRegister0.setLastName("/photographer/images");
        userRegister0.setLastName("null:1528137265625:03bf1b2c50bffe4b6b17dad8841e9f70");
        userRegister0.setPassword("obfuscate");
        userRegister0.setPassword("ROLE_ADMIN");
        userRegister0.setFirstName("null:1528137277050:ea4b11766ecf85bf46d8a52721b360a9");
        java.lang.String str12 = userRegister0.getPassword();
        userRegister0.setLastName("/collections/photographers");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ROLE_ADMIN" + "'", str12.equals("ROLE_ADMIN"));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test450");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls6 = null;
        userRoleDAOImpl0.setClazz(cls6);
        javax.persistence.EntityManager entityManager8 = userRoleDAOImpl0.getEntityManager();
        try {
            userRoleDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager8);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test451");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        java.lang.String str5 = user0.toString();
        java.lang.String str7 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user0, (long) (short) 100);
        java.lang.Long long8 = user0.getId();
        boolean b9 = user0.isEnabled();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str5.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ec7908a224b49d37ffc84c612f320838" + "'", str7.equals("ec7908a224b49d37ffc84c612f320838"));
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test452");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls7 = null;
        userImageDAOImpl0.setClazz(cls7);
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor9 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse11 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException14 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor9.afterCompletion(httpServletRequest10, httpServletResponse11, (java.lang.Object) 10, (java.lang.Exception) notFoundException14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage18 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        requestLoggerInterceptor9.postHandle(httpServletRequest16, httpServletResponse17, (java.lang.Object) userImage18, modelAndView19);
        de.htw.sdf.photoplatform.persistence.model.Image image21 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str22 = image21.toString();
        image21.setThumbPath("/user/makeadmin/{id}");
        boolean b25 = image21.isEnabled();
        image21.setPublic(true);
        userImage18.setImage(image21);
        de.htw.sdf.photoplatform.persistence.model.User user29 = userImage18.getUser();
        de.htw.sdf.photoplatform.persistence.model.Image image30 = null;
        userImage18.setImage(image30);
        try {
            userImageDAOImpl0.delete(userImage18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str22.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(user29);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test453");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        image0.setMobileThumbPath("");
        image0.setPrice((java.lang.Double) 100.0d);
        boolean b6 = image0.isEnabled();
        image0.setPrice((java.lang.Double) 0.0d);
        image0.setPublic(true);
        boolean b11 = image0.isEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test454");
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array0 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection1 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1, collection_array0);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData3 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData4 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData5 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData8 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1, (java.lang.Boolean) false);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData9 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData11 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1, (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(collection_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_collectionData3);
        org.junit.Assert.assertNotNull(list_collectionData4);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData8);
        org.junit.Assert.assertNotNull(list_collectionData9);
        org.junit.Assert.assertNotNull(list_collectionData11);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test455");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity4 = null;
        xAuthTokenConfigurer3.setBuilder(httpSecurity4);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity6 = null;
        xAuthTokenConfigurer3.init(httpSecurity6);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test456");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getSmallThumbPath();
        java.lang.String str3 = image0.toString();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData4.setId((java.lang.Long) 100L);
        imageData4.setDescription("Image{name='null', path='null', isPublic=false, enabled=false, price=-1.0}");
        java.lang.Long long9 = imageData4.getCode();
        imageData4.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test457");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.controller.UserController userController1 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException4 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors3);
        int i5 = notFoundException4.getCode();
        org.springframework.web.context.request.WebRequest webRequest6 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError7 = userController1.handleNotFoundException(notFoundException4, webRequest6);
        org.springframework.web.context.request.WebRequest webRequest8 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError9 = photographerController0.handleNotFoundException(notFoundException4, webRequest8);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData10 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData11 = collectionData10.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData12 = null;
        collectionData10.setUserdata(userData12);
        java.lang.String str14 = collectionData10.getName();
        long long15 = collectionData10.getId();
        java.lang.String str16 = collectionData10.getName();
        org.springframework.validation.BindingResult bindingResult17 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection18 = photographerController0.createCollection(collectionData10, bindingResult17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertNull(list_imageData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(long15 == 0L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test458");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        collectionData0.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b4 = collectionData0.getPublic();
        de.htw.sdf.photoplatform.persistence.model.Image image5 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image5.setCreatedBy("");
        image5.setPrice((java.lang.Double) 1.0d);
        java.lang.String str10 = image5.getDescription();
        java.lang.String str11 = image5.getMime();
        boolean b12 = image5.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData13 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image5);
        imageData13.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str16 = imageData13.getMobilePath();
        imageData13.setName("Category{name='null'}");
        collectionData0.setThumbnail(imageData13);
        imageData13.setMessageFailed("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test459");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls5 = null;
        collectionCategoryDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory7 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection8 = null;
        collectionCategory7.setCollection(collection8);
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = null;
        collectionCategory7.setCollection(collection10);
        de.htw.sdf.photoplatform.persistence.model.Category category12 = collectionCategory7.getCategory();
        java.util.Date date13 = collectionCategory7.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection14 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user15 = collection14.getUser();
        collectionCategory7.setCollection(collection14);
        de.htw.sdf.photoplatform.persistence.model.Collection collection17 = collectionCategory7.getCollection();
        try {
            collectionCategoryDAOImpl0.delete(collectionCategory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(category12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test460");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        image1.setPrice((java.lang.Double) 1.0d);
        java.lang.String str6 = image1.getDescription();
        java.lang.String str7 = image1.getMime();
        image1.setMobileThumbPath("/photographer/upload");
        boolean b10 = image1.isEnabled();
        image1.setPrice((java.lang.Double) 1.0d);
        collection0.setThumbnail(image1);
        java.lang.String str14 = collection0.toString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Collection{user=null, name='null'}" + "'", str14.equals("Collection{user=null, name='null'}"));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test461");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setId((java.lang.Long) 0L);
        java.lang.String str3 = userData0.getFirstName();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test462");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity4 = xAuthTokenConfigurer3.and();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test463");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setPasswordConfirm("/collections/{collectionId}/images");
        userRegister0.setPassword("");
        java.lang.String str5 = userRegister0.getLastName();
        java.lang.String str6 = userRegister0.getLastName();
        java.lang.String str7 = userRegister0.getEmail();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test464");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage9 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image10 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image10.setCreatedBy("");
        collectionImage9.setImage(image10);
        de.htw.sdf.photoplatform.persistence.model.Collection collection14 = null;
        collectionImage9.setCollection(collection14);
        org.springframework.web.servlet.ModelAndView modelAndView16 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest7, httpServletResponse8, (java.lang.Object) collection14, modelAndView16);
        javax.servlet.http.HttpServletRequest httpServletRequest18 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse19 = null;
        de.htw.sdf.photoplatform.manager.impl.HashManagerImpl hashManagerImpl20 = new de.htw.sdf.photoplatform.manager.impl.HashManagerImpl();
        org.springframework.web.servlet.ModelAndView modelAndView21 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest18, httpServletResponse19, (java.lang.Object) hashManagerImpl20, modelAndView21);
        try {
            java.lang.String str25 = hashManagerImpl20.hash("/photographer/images", "null:1528137288660:1a2c7fbd81ed38e3fb25d5bcfea287cf");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test465");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        org.springframework.validation.Errors errors5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors5);
        int i7 = notFoundException6.getCode();
        notFoundException3.addSuppressed((java.lang.Throwable) notFoundException6);
        java.lang.String str9 = notFoundException3.toString();
        org.springframework.web.context.request.WebRequest webRequest10 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError11 = photographerController0.handleNotFoundException(notFoundException3, webRequest10);
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController12 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException14 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER");
        org.springframework.web.context.request.WebRequest webRequest15 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError16 = photographerController12.handleBadRequestException(badRequestException14, webRequest15);
        org.springframework.web.context.request.WebRequest webRequest17 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError18 = photographerController0.handleBadRequestException(badRequestException14, webRequest17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str19 = responseError18.getErrors();
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str9.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
        org.junit.Assert.assertNotNull(responseError11);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
        org.junit.Assert.assertNotNull(map_str_list_str19);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test466");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        try {
            javax.persistence.Query query6 = collectionImageDAOImpl0.createQuery("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test467");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.persistence.model.User user7 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b8 = user7.isBecomePhotographer();
        boolean b9 = user7.isAccountNonExpired();
        try {
            userDAOImpl0.delete(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test468");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls2 = null;
        categoryDAOImpl0.setClazz(cls2);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Category> list_category4 = categoryDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test469");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = image0.getCreatedBy();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData3.setPrice((java.lang.Double) 0.0d);
        imageData3.setCode((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test470");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        java.lang.String str5 = image0.toString();
        image0.setName("");
        image0.setSmallThumbPath("null:1528137255129:74131369d5ab98a30139e53b9d69dc36");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str5.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test471");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getSecToken();
        java.lang.Boolean b5 = userData0.isAdmin();
        userData0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test472");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getEmail();
        userData0.setPaypalID("/users/admin/{start}/{count}");
        userData0.setBanned(true);
        java.lang.Boolean b8 = userData0.isAdmin();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test473");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls7 = null;
        userImageDAOImpl0.setClazz(cls7);
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor9 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse11 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException14 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor9.afterCompletion(httpServletRequest10, httpServletResponse11, (java.lang.Object) 10, (java.lang.Exception) notFoundException14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage18 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView19 = null;
        requestLoggerInterceptor9.postHandle(httpServletRequest16, httpServletResponse17, (java.lang.Object) userImage18, modelAndView19);
        de.htw.sdf.photoplatform.persistence.model.Image image21 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str22 = image21.toString();
        image21.setThumbPath("/user/makeadmin/{id}");
        boolean b25 = image21.isEnabled();
        image21.setPublic(true);
        userImage18.setImage(image21);
        try {
            userImageDAOImpl0.create(userImage18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str22.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test474");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = null;
        collectionData0.setUserdata(userData2);
        java.lang.String str4 = collectionData0.getName();
        long long5 = collectionData0.getId();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str7 = image6.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image6);
        imageData8.setMetadata("/photographer/upload");
        imageData8.setMime("/showcase");
        imageData8.setMessageSuccess("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        collectionData0.setThumbnail(imageData8);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData16 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str17 = userData16.getLastName();
        java.util.List<java.lang.String> list_str18 = userData16.getRoles();
        java.lang.String str19 = userData16.getEmail();
        userData16.setCompany("/collections/{collectionId}/images");
        collectionData0.setUserdata(userData16);
        collectionData0.setName("/collections/create");
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(list_str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test475");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        userRegister0.setEmail("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str4 = userRegister0.getEmail();
        java.lang.String str5 = userRegister0.getEmail();
        userRegister0.setFirstName("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception" + "'", str4.equals("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception" + "'", str5.equals("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception"));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test476");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.User user7 = userDAOImpl0.findOne((long) 11002);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test477");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData8.setPrice((java.lang.Double) (-1.0d));
        imageData8.setMobilePath("/collections/photographers");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData13 = imageData8.getUserData();
        imageData8.setMetadata("/collections/{collectionId}/images/{imageId}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(userData13);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test478");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls7 = null;
        roleDAOImpl0.setClazz(cls7);
        try {
            roleDAOImpl0.deleteById((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test479");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData2 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData3 = collectionData0.getUserdata();
        java.util.List<java.lang.Long> list_long4 = collectionData0.getImageIds();
        de.htw.sdf.photoplatform.persistence.model.Image image5 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image5);
        java.lang.String str7 = imageData6.getName();
        imageData6.setMime("/users/profile/{userId}");
        imageData6.setPath("/collections/{collectionId}");
        java.lang.Long long12 = imageData6.getId();
        collectionData0.setThumbnail(imageData6);
        java.lang.String str14 = collectionData0.getName();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(list_imageData2);
        org.junit.Assert.assertNull(userData3);
        org.junit.Assert.assertNull(list_long4);
        org.junit.Assert.assertNotNull(imageData6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test480");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        javax.persistence.EntityManager entityManager7 = userDAOImpl0.getEntityManager();
        try {
            userDAOImpl0.deleteById((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager7);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test481");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(imageData2);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test482");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        image1.setPrice((java.lang.Double) 1.0d);
        java.lang.String str6 = image1.getDescription();
        java.lang.String str7 = image1.getMime();
        image1.setMobileThumbPath("/photographer/upload");
        boolean b10 = image1.isEnabled();
        image1.setPrice((java.lang.Double) 1.0d);
        collection0.setThumbnail(image1);
        java.lang.String str14 = collection0.getDescription();
        java.lang.String str15 = collection0.toString();
        java.lang.String str16 = collection0.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Collection{user=null, name='null'}" + "'", str15.equals("Collection{user=null, name='null'}"));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test483");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setHomepage("null:1528137288598:ad8bd3d70b0b05c981518fa0961e2c2d");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test484");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.Boolean b4 = userData0.isEnabled();
        userData0.setPhone("/collections/photographers");
        userData0.setLastName("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        userData0.setSecToken("/user/login");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test485");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls5 = null;
        collectionCategoryDAOImpl0.setClazz(cls5);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls7 = null;
        collectionCategoryDAOImpl0.setClazz(cls7);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls9 = null;
        collectionCategoryDAOImpl0.setClazz(cls9);
        try {
            collectionCategoryDAOImpl0.deleteById(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test486");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        org.springframework.validation.Errors errors5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors5);
        int i7 = notFoundException6.getCode();
        notFoundException3.addSuppressed((java.lang.Throwable) notFoundException6);
        org.springframework.web.context.request.WebRequest webRequest9 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError10 = imageController0.handleNotFoundException(notFoundException6, webRequest9);
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException12 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER");
        org.springframework.web.context.request.WebRequest webRequest13 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError14 = imageController0.handleBadRequestException(badRequestException12, webRequest13);
        org.springframework.web.multipart.MultipartFile multipartFile15 = null;
        org.springframework.web.multipart.MultipartFile[] multipartFile_array16 = new org.springframework.web.multipart.MultipartFile[] { multipartFile15 };
        try {
            java.lang.String str17 = imageController0.handleImageUpload(multipartFile_array16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertNotNull(responseError10);
        org.junit.Assert.assertNotNull(responseError14);
        org.junit.Assert.assertNotNull(multipartFile_array16);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test487");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        try {
            javax.persistence.Query query8 = roleDAOImpl0.createQuery("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test488");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry6 = null;
        application0.addResourceHandlers(resourceHandlerRegistry6);
        org.springframework.web.servlet.LocaleResolver localeResolver8 = application0.localeResolver();
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array9 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver10 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver10, handlerMethodArgumentResolver_array9);
        application0.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver10);
        org.springframework.validation.Validator validator13 = application0.getValidator();
        org.springframework.web.servlet.LocaleResolver localeResolver14 = application0.localeResolver();
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(localeResolver8);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(validator13);
        org.junit.Assert.assertNotNull(localeResolver14);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test489");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setMetaData("/user/becomePhotographer");
        java.lang.String str6 = image0.getUpdatedBy();
        image0.setMime("/users/admin/{start}/{count}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test490");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setPassword("ROLE_PHOTOGRAPHER");
        java.lang.String str4 = user0.getLastName();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test491");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        image0.setSmallThumbPath("/photographer/upload");
        java.lang.Double d4 = image0.getPrice();
        java.lang.String str5 = image0.getPath();
        java.lang.String str6 = image0.toString();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(d4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str6.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test492");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPassword();
        java.lang.String str4 = userPasswordChange0.getPasswordConfirm();
        userPasswordChange0.setNewPassword("null:1528137271348:359dea61c52e045b1b927389910fdd93");
        java.lang.String str7 = userPasswordChange0.getNewPassword();
        userPasswordChange0.setPasswordConfirm("de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null:1528137271348:359dea61c52e045b1b927389910fdd93" + "'", str7.equals("null:1528137271348:359dea61c52e045b1b927389910fdd93"));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test493");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        imageData1.setMessageFailed("/user/register");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str5 = userData4.getLastName();
        java.lang.String str6 = userData4.getEmail();
        java.lang.String str7 = userData4.getHomepage();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str9 = userData8.getLastName();
        java.util.List<java.lang.String> list_str10 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData8.setRoles(list_str10);
        userData4.setRoles(list_str10);
        java.lang.String str13 = userData4.getLastName();
        userData4.setLastName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        java.util.List<java.lang.String> list_str16 = userData4.getRoles();
        imageData1.setUserData(userData4);
        java.lang.Long long18 = imageData1.getId();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list_str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(list_str16);
        org.junit.Assert.assertNull(long18);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test494");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls7 = null;
        roleDAOImpl0.setClazz(cls7);
        de.htw.sdf.photoplatform.persistence.model.Role role9 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role10 = roleDAOImpl0.update(role9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test495");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setAccountNonLocked(true);
        boolean b6 = user1.isAccountNonExpired();
        boolean b7 = user1.isAccountNonExpired();
        boolean b8 = user1.isAdmin();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test496");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getPath();
        imageData2.setDescription("null:1528137248666:32ad08d7594d28504f1460b47d9ec391");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData6 = imageData2.getUserData();
        imageData2.setMobilePath("/collections/showcase");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(userData6);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test497");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.Long long5 = imageData2.getCode();
        imageData2.setName("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = imageData2.getUserData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData9 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData9.setSwift("/photographer/images");
        imageData2.setUserData(userData9);
        imageData2.setMetadata("de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
        imageData2.setSmallPath("4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(userData8);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test498");
        de.htw.sdf.photoplatform.persistence.model.Category category0 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category0.setName("/user/enablephotographer");
        category0.setName("hi!");
        category0.setName("/photographer/images");
        java.lang.String str7 = category0.getName();
        category0.setName("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/photographer/images" + "'", str7.equals("/photographer/images"));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test499");
        de.htw.sdf.photoplatform.persistence.model.Category category0 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category0.setName("/user/enablephotographer");
        category0.setName("hi!");
        category0.setName("/photographer/images");
        java.lang.String str7 = category0.getName();
        java.lang.String str8 = category0.getDescription();
        java.lang.String str9 = category0.getDescription();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/photographer/images" + "'", str7.equals("/photographer/images"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test500");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError((int) (byte) 1, (int) (byte) 0, "/users/admin/{start}/{count}", errors3);
        int i5 = responseError4.getStatus();
        java.lang.String str6 = responseError4.getDeveloperInfo();
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0" + "'", str6.equals("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0"));
    }
}

