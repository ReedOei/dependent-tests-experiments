import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test002");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = userRole1.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role3 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole1.setRole(role3);
        de.htw.sdf.photoplatform.persistence.model.User user5 = userRole1.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user6 = userRole1.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user7 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b8 = user7.isAdmin();
        java.lang.String str9 = user7.getSecToken();
        userRole1.setUser(user7);
        de.htw.sdf.photoplatform.persistence.model.Role role11 = userRole1.getRole();
        roleDAOImpl0.delete(role11);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test003");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.Query query3 = imageDAOImpl0.createQuery("/api");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test004");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.getByRoleAndEnabled("ROLE_CUSTOMER", false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test005");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage2 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 100L);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test007");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = photographerManagerImpl0.getCollectionById((long) (byte) -1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test008");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isBecomePhotographer();
        user1.setUsername("ROLE_BECOME_PHOTOGRAPHER");
        userManagerImpl0.delete(user1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test009");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.toString();
        java.lang.String str3 = image1.getName();
        image1.setPublic(false);
        java.lang.String str6 = image1.getMetaData();
        java.util.Date date7 = image1.getCreatedAt();
        imageManagerImpl0.create(image1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test010");
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
        de.htw.sdf.photoplatform.persistence.model.User user23 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b24 = user23.isAdmin();
        java.lang.String str25 = user23.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData26 = null;
        user23.setPhotographerData(photographerData26);
        java.lang.String str28 = user23.toString();
        java.lang.String str30 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user23, (long) (short) 100);
        userImage9.setUser(user23);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on user23, user20, and notFoundException5.", !(user23.equals(user20) && user20.equals(notFoundException5)) || user23.equals(notFoundException5));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test011");
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage0 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = userImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userImage0.getOwner();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = userImage0.getImage();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(userImage0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test012");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        de.htw.sdf.photoplatform.persistence.model.User user3 = userDAOImpl0.findOne(0L);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test013");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        boolean b4 = user1.isAccountNonLocked();
        boolean b5 = user1.isCredentialsNonExpired();
        boolean b6 = user1.isCredentialsNonExpired();
        java.lang.String str7 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user1);
        user1.setAccountNonLocked(false);
        java.lang.Boolean b10 = userManagerImpl0.isUserAdmin(user1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test014");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryDAOImpl0.findOne(0L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test015");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        userManagerImpl0.registerUser("/user/login", "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception", "39c73479cb767c5a09248b3313c03447", "null:1528137264754:37059375c02a8fd63e589326ff8446ea");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test017");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        image1.setThumbPath("/users/admin/{start}/{count}");
        imageManagerImpl0.create(image1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test018");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.updateCollectionsPublicValue((java.lang.Long) 1L, (java.lang.Long) 10L, (java.lang.Boolean) false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test019");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage5 = userImageDAOImpl0.getOwnerImages((long) 11003, (java.lang.Long) (-1L));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test021");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        collectionDAOImpl0.delete(collection2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test022");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        userManagerImpl0.registerUser("/user/unlock/{id}", "/index.html", "/user/makeadmin/{id}", "/collections/showcase");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test023");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getShowcaseByUser((java.lang.Long) 0L, (int) (byte) 0, (-1));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test024");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole4 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isPhotographer();
        userRole4.setUser(user5);
        java.lang.String str8 = user5.getUpdatedBy();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage11 = userImageDAOImpl0.getPhotographImages(user5, 10000, 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test025");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category1.setName("/photographer/images/{imageId}");
        java.lang.String str8 = category1.getName();
        categoryManagerImpl0.delete(category1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test026");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        java.lang.String str2 = category1.toString();
        java.lang.String str3 = category1.getName();
        categoryManagerImpl0.create(category1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test027");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.isSigned("/collections/update");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test028");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category3 = categoryDAOImpl0.findByName("null:1528137269023:a165acffd0d2c313e6fa2c2dbbd2dc76");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test029");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteImage((java.lang.Long) 1L, (java.lang.Long) (-1L));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test030");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        javax.persistence.Query query3 = userRoleDAOImpl0.createQuery("hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test032");
        de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl collectionManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionManagerImpl0.getCollectionImages((java.lang.Long) 100L, 11002, (int) '4');
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test033");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection5 = collectionDAOImpl0.findCollectionsByUser((long) 11003, (int) (short) 100, 11002, (java.lang.Boolean) false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test034");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user3 = collection2.getUser();
        boolean b4 = collection2.isPublic();
        collectionDAOImpl0.create(collection2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test035");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = userRole1.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role3 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole1.setRole(role3);
        de.htw.sdf.photoplatform.persistence.model.Role role5 = userRole1.getRole();
        de.htw.sdf.photoplatform.persistence.model.User user6 = userRole1.getUser();
        userRoleDAOImpl0.create(userRole1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test036");
        de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl collectionManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionManagerImpl0.getCollectionImages((java.lang.Long) 10L, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test037");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setAccountNonLocked(true);
        java.lang.Boolean b8 = userManagerImpl0.isRoleIncluded(user2, "/collections/update");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test038");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getCollectionByUser((long) (short) 1, (int) (byte) 100, 11004);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test039");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.Query query2 = collectionImageDAOImpl0.createQuery("/collections/{collectionId}/images");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test040");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category4 = categoryDAOImpl0.findByName("ROLE_CUSTOMER");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test041");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = imageManagerImpl0.findById((long) 10001);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test042");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole2 = userRoleDAOImpl0.findByUserId((java.lang.Long) 100L);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test044");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        userImageDAOImpl0.deleteById((long) (short) 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test045");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.Query query3 = roleDAOImpl0.createQuery("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test046");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = roleDAOImpl0.findOne((long) (byte) 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test047");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        collectionDAOImpl0.deleteAll();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test048");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.lockUser((long) 11003);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test049");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = photographerManagerImpl0.addImageToCollection((java.lang.Long) 1L, (java.lang.Long) 10L, (java.lang.Long) 10L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test050");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = imageManagerImpl0.findById(100L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test051");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = collectionDAOImpl0.findByUserAndCollectionId((long) (short) -1, (long) (byte) -1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test052");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user5 = userDAOImpl0.findByAccountLocked(false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test053");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = imageDAOImpl0.getEntityManager();
        imageDAOImpl0.deleteById((long) 400);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test054");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category1.setName("/photographer/images/{imageId}");
        java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory8 = collectionCategoryDAOImpl0.getCollectionCategoryBy(category1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test056");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.lang.String str2 = collection0.getName();
        boolean b3 = collection0.isPublic();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData4 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData(collection0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test057");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.lockUser(0L);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test058");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) (-1L), (java.lang.Long) 100L, (java.lang.Long) (-1L));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test059");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = imageDAOImpl0.getEntityManager();
        javax.persistence.Query query6 = imageDAOImpl0.createQuery("ROLE_PHOTOGRAPHER");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test060");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("hi!");
        category1.setName("/photographer/images");
        categoryManagerImpl0.create(category1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test061");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        java.lang.String str3 = image1.getMobileThumbPath();
        image1.setPublic(true);
        imageManagerImpl0.create(image1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test062");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        imageDAOImpl0.deleteById((long) 10000);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test063");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = photographerManagerImpl0.getCollectionById((long) '#');
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test064");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = photographerManagerImpl0.getCollectionById((long) ' ');
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test065");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image4.setCreatedBy("");
        collectionImage3.setImage(image4);
        collectionImageDAOImpl0.delete(collectionImage3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test066");
        de.htw.sdf.photoplatform.webservice.controller.CollectionController collectionController0 = new de.htw.sdf.photoplatform.webservice.controller.CollectionController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData4 = collectionController0.getCollectionsImages((java.lang.Long) (-1L), (int) (byte) 1, (-1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test067");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findByName("ROLE_ADMIN");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test068");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user2 = collection1.getUser();
        java.lang.String str3 = collection1.getName();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory4 = collection1.getCollectionCategories();
        collectionDAOImpl0.delete(collection1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test069");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user5 = userDAOImpl0.findByEmail("null:1528137248666:32ad08d7594d28504f1460b47d9ec391");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test070");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Role role3 = roleDAOImpl0.getAdmin();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test071");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str5 = imageData4.getMime();
        java.lang.String str6 = imageData4.getMetadata();
        de.htw.sdf.photoplatform.persistence.model.Image image7 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str8 = image7.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData9 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image7);
        imageData9.setMobilePath("/users/update");
        java.lang.String str12 = imageData9.getSmallPath();
        imageData9.setPath("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData15 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.Boolean b16 = userData15.isAdmin();
        imageData9.setUserData(userData15);
        java.lang.Long long18 = userData15.getId();
        imageData4.setUserData(userData15);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on image0 and image7.", image0.equals(image7) == image7.equals(image0));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test073");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category3 = new de.htw.sdf.photoplatform.persistence.model.Category();
        java.lang.String str4 = category3.toString();
        categoryDAOImpl0.delete(category3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test074");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setUsername("/api");
        boolean b7 = user2.isAccountNonLocked();
        user2.setPassword("/collections/{collectionId}");
        java.lang.Boolean b10 = userManagerImpl0.isUserPhotographer(user2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test075");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category1.setDescription("obfuscate");
        category1.setDescription("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        category1.setName("/users/becomephotographers");
        categoryDAOImpl0.create(category1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test076");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        image1.setMobileThumbPath("");
        imageManagerImpl0.create(image1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test077");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getShowcaseByUser((java.lang.Long) 0L, 400, (int) (short) 10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test079");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getCollectionByUser((long) 10001, 100, (int) '#');
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test081");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionDAOImpl0.findByUserAndCollectionId((long) 'a', (long) 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test083");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.enablePhotographer((long) 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test085");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isBecomePhotographer();
        boolean b4 = user2.isAccountNonExpired();
        java.lang.String str6 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user2, (long) 11004);
        boolean b7 = user2.isPhotographer();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage8 = userImageDAOImpl0.getPhotographImages(user2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test086");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = photographerManagerImpl0.addImageToCollection((java.lang.Long) 0L, (java.lang.Long) 100L, (java.lang.Long) 100L);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test088");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        imageDAOImpl0.deleteById((long) (short) -1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test089");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user2 = collection1.getUser();
        java.lang.String str3 = collection1.getName();
        java.lang.String str4 = collection1.toString();
        collection1.setDescription("Collection{user=null, name='null'}");
        photographerManagerImpl0.delete(collection1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test090");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getShowcaseByUser((java.lang.Long) (-1L), 11004, (int) '#');
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test091");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userImageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage6 = userImageDAOImpl0.getOwnerImages((long) 10000, (java.lang.Long) 0L);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test092");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.User user3 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b4 = user3.isAdmin();
        java.lang.String str5 = user3.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData6 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection7 = photographerData6.getCollections();
        photographerData6.setCompany("/collections/showcase");
        user3.setPhotographerData(photographerData6);
        java.lang.String str11 = photographerData6.getSwift();
        user0.setPhotographerData(photographerData6);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on user0, user3, and user3.", !(user0.equals(user3) && user3.equals(user3)) || user0.equals(user3));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test093");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        roleDAOImpl0.deleteAll();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test094");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        boolean b8 = userManagerImpl0.becomePhotographer((-1L), "/collections/addimage", "ec7908a224b49d37ffc84c612f320838", "/users/admin/{start}/{count}", "de.htw.sdf.photoplatform.persistence.model.User [ID=null]", "/collections/update", "/users/profile/{userId}");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test095");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category3 = categoryDAOImpl0.findOne((long) (byte) 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test096");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findByName("");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test097");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteCollection((java.lang.Long) 10L, (java.lang.Long) 10L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test098");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.isSigned("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test099");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setDescription("/photographer/upload");
        categoryManagerImpl0.delete(category1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test100");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = photographerManagerImpl0.createCollection((java.lang.Long) 100L, "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception", "null:1528137271848:6816eb5a920569f38c51d1b8bbf267cc");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test101");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image6);
        image6.setPublic(true);
        image6.setCreatedBy("/collections/create");
        collectionImage0.setImage(image6);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on image6, image5, and imageData7.", !(image6.equals(image5) && image5.equals(imageData7)) || image6.equals(imageData7));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test102");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        java.lang.String str3 = image1.getUpdatedBy();
        java.lang.String str4 = image1.getSmallThumbPath();
        java.lang.String str5 = image1.getUpdatedBy();
        java.lang.String str6 = image1.toString();
        image1.setName("");
        imageManagerImpl0.create(image1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test103");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteImage((java.lang.Long) 1L, (java.lang.Long) 0L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test104");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage5 = userImageDAOImpl0.findOne((long) (short) -1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test105");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage2 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 1L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test106");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.lang.String str2 = collection0.getName();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory3 = collection0.getCollectionCategories();
        boolean b4 = collection0.isPublic();
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collection0.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData7 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection0, true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test107");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findById((long) 100);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test109");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Role role4 = roleDAOImpl0.findOne((long) 11004);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test110");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.unlockUser((long) 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test111");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        userDAOImpl0.deleteAll();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test112");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.checkUserPermissions("null:1528137277050:ea4b11766ecf85bf46d8a52721b360a9");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test113");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection5 = collectionDAOImpl0.findCollectionsByUser(0L, (-1), (int) (short) 100, (java.lang.Boolean) true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test114");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) 10L);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test115");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = categoryDAOImpl0.getEntityManager();
        categoryDAOImpl0.deleteAll();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test116");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard5 = user1.getAuthorities();
        boolean b7 = user1.isRoleIncluded("");
        boolean b8 = user1.isAdmin();
        userManagerImpl0.delete(user1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test117");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.getByRoleAndEnabled("5b077a3001f6b54eed6802448a739229", false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test119");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findById((long) (byte) 10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test120");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("hi!");
        category1.setName("/photographer/images");
        java.lang.String str8 = category1.getName();
        java.lang.String str9 = category1.getDescription();
        java.lang.String str10 = category1.getName();
        de.htw.sdf.photoplatform.persistence.model.Category category11 = categoryManagerImpl0.update(category1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test121");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Role role3 = roleDAOImpl0.findByName("/users/changepassword");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test123");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user2 = collection1.getUser();
        java.lang.String str3 = collection1.getName();
        boolean b4 = collection1.isPublic();
        collectionDAOImpl0.create(collection1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test124");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage2 = userImageDAOImpl0.findOne((long) (short) 10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test125");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        userManagerImpl0.registerUser("obfuscate", "/api", "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c", "null:1528137271348:359dea61c52e045b1b927389910fdd93");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test126");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user3 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b4 = user3.isAdmin();
        java.lang.String str5 = user3.getSecToken();
        boolean b6 = user3.isAccountNonLocked();
        boolean b7 = user3.isCredentialsNonExpired();
        boolean b8 = user3.isCredentialsNonExpired();
        java.lang.String str9 = user3.getPassword();
        boolean b10 = user3.isEnabled();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage13 = userImageDAOImpl0.getPhotographImages(user3, 400, 11004);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test127");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = photographerManagerImpl0.createCollection((java.lang.Long) 0L, "/photographer/images/{imageId}", "Category{name='/photographer/images/{imageId}'}");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test128");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        boolean b4 = user1.isAccountNonLocked();
        boolean b5 = user1.isCredentialsNonExpired();
        java.lang.String str6 = user1.getLastName();
        java.lang.String str7 = user1.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole8 = user1.getUserRoles();
        userManagerImpl0.delete(user1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test129");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category1.setName("/photographer/images/{imageId}");
        java.lang.String str8 = category1.getDescription();
        de.htw.sdf.photoplatform.persistence.model.Category category9 = categoryManagerImpl0.update(category1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test130");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.isSigned("77ce3535f163da232981f0d31864a601ca7857e39a64df07a354c6860cf425727ccc18a2328f2e2bfe2e86f09067f3be6c7841e138ba6b4e2d0fea3d964ab0d9");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test131");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection6 = collectionDAOImpl0.findCollectionsByUser((long) (byte) 0, (-1), 11004, (java.lang.Boolean) true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test132");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        boolean b8 = userManagerImpl0.becomePhotographer((long) (byte) 1, "null:1528137269023:a165acffd0d2c313e6fa2c2dbbd2dc76", "obfuscate", "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0", "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001", "Category{name='/photographer/images/{imageId}'}", "null:1528137275958:f851f7955c556afa6678bd624fd107e4");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test134");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage5 = imageManagerImpl0.getPhotographImages(user1, (int) 'a', (int) ' ');
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test136");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        collectionDAOImpl0.deleteById((long) (byte) 100);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test137");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = photographerManagerImpl0.createCollection((java.lang.Long) 10L, "/collections/update", "4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test138");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        collectionCategoryDAOImpl0.deleteById((long) (-1));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test139");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.isSigned("ROLE_PHOTOGRAPHER");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test141");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user5 = userDAOImpl0.findByRoleAndEnabledFilter("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c", false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test142");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = userRole1.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role3 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole1.setRole(role3);
        de.htw.sdf.photoplatform.persistence.model.User user5 = userRole1.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user6 = userRole1.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user7 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b8 = user7.isAdmin();
        java.lang.String str9 = user7.getSecToken();
        userRole1.setUser(user7);
        de.htw.sdf.photoplatform.persistence.model.Role role11 = userRole1.getRole();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole12 = userRoleDAOImpl0.update(userRole1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test143");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole3 = userRoleDAOImpl0.findByUserId((java.lang.Long) 0L);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test144");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findById((long) (short) -1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test146");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        boolean b4 = user1.isAccountNonLocked();
        boolean b5 = user1.isPhotographer();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage8 = imageManagerImpl0.getPhotographImages(user1, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test147");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.lockUser(1L);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test148");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData4 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array9 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long10, long_array9);
        collectionData4.setImageIds((java.util.List<java.lang.Long>) arraylist_long10);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData13 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array18 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long19 = new java.util.ArrayList<java.lang.Long>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long19, long_array18);
        collectionData13.setImageIds((java.util.List<java.lang.Long>) arraylist_long19);
        collectionData4.setImageIds((java.util.List<java.lang.Long>) arraylist_long19);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage23 = userImageDAOImpl0.getOwnerImages((-1L), (java.util.List<java.lang.Long>) arraylist_long19);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test149");
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
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor20 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        de.htw.sdf.photoplatform.Application application23 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer24 = null;
        application23.configureAsyncSupport(asyncSupportConfigurer24);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer26 = null;
        application23.configureAsyncSupport(asyncSupportConfigurer26);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array28 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver29 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver29, handlerExceptionResolver_array28);
        application23.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver29);
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor32 = application23.localeChangeInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest33 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse34 = null;
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange35 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        org.springframework.web.servlet.ModelAndView modelAndView36 = null;
        localeChangeInterceptor32.postHandle(httpServletRequest33, httpServletResponse34, (java.lang.Object) userPasswordChange35, modelAndView36);
        de.htw.sdf.photoplatform.exception.common.WebFormException webFormException39 = new de.htw.sdf.photoplatform.exception.common.WebFormException(11004);
        requestLoggerInterceptor20.afterCompletion(httpServletRequest21, httpServletResponse22, (java.lang.Object) localeChangeInterceptor32, (java.lang.Exception) webFormException39);
        javax.servlet.http.HttpServletRequest httpServletRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image43 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str44 = image43.toString();
        java.lang.String str45 = image43.getName();
        image43.setDescription("/photographer/upload");
        org.springframework.web.servlet.ModelAndView modelAndView48 = null;
        requestLoggerInterceptor20.postHandle(httpServletRequest41, httpServletResponse42, (java.lang.Object) image43, modelAndView48);
        userImage9.setImage(image43);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on image43, image13, and requestLoggerInterceptor20.", !(image43.equals(image13) && image13.equals(requestLoggerInterceptor20)) || image43.equals(requestLoggerInterceptor20));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test150");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection3 = collectionDAOImpl0.findAll();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test151");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.makeAdmin((long) 11004);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test152");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.UserData> list_userData3 = userController0.getEnabledUsers((int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test153");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        java.lang.String str5 = user2.getUpdatedBy();
        de.htw.sdf.photoplatform.persistence.model.User user6 = userManagerImpl0.update(user2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test154");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.getByRoleAndEnabled("null:1528137266330:9de181051f39b56aea6ebed61ac6f110", false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test155");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.find((java.lang.Integer) 1, (java.lang.Integer) 100);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test156");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.enablePhotographer((long) (short) -1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test157");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        userManagerImpl0.registerUser("/collections/{collectionId}/images/{imageId}", "null:1528137255129:74131369d5ab98a30139e53b9d69dc36", "/collections/photographers/{start}/{count}", "null:1528137265625:03bf1b2c50bffe4b6b17dad8841e9f70");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test158");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.makeAdmin((long) 11003);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test159");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category1.setDescription("obfuscate");
        category1.setDescription("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        de.htw.sdf.photoplatform.persistence.model.Category category10 = categoryManagerImpl0.update(category1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test160");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.Query query5 = collectionCategoryDAOImpl0.createQuery("/user/{name}");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test161");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userDAOImpl0.findByRoleId((java.lang.Long) 1L);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test163");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = photographerManagerImpl0.addImageToCollection((java.lang.Long) 1L, (java.lang.Long) (-1L), (java.lang.Long) 1L);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test164");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionImage> list_collectionImage1 = collectionImageDAOImpl0.findAll();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test165");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        categoryDAOImpl0.deleteById((long) (short) 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test166");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.UserData> list_userData3 = userController0.getEnabledUsers(10000, (int) (short) -1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test167");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 0L, (java.lang.Long) 0L, (java.lang.Long) 100L);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test168");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteImage((java.lang.Long) 10L, (java.lang.Long) 100L);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test169");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.Query query4 = collectionCategoryDAOImpl0.createQuery("/user/register");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test170");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.checkUserPermissions("/collections/{collectionId}/images");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test171");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user2 = collection1.getUser();
        java.lang.String str3 = collection1.getName();
        java.lang.String str4 = collection1.getName();
        photographerManagerImpl0.delete(collection1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test172");
        de.htw.sdf.photoplatform.webservice.controller.CollectionController collectionController0 = new de.htw.sdf.photoplatform.webservice.controller.CollectionController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData4 = collectionController0.getCollectionsImages((java.lang.Long) 0L, 10, 10002);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test173");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.enablePhotographer((long) 10001);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test174");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = collectionDAOImpl0.findOne(0L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test175");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) (-1L), (java.lang.Long) 100L, (java.lang.Long) 10L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test176");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionImage0.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = collectionImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.Image image7 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image7);
        image7.setCreationDate();
        java.lang.String str10 = image7.getMime();
        boolean b11 = collectionImage0.equals((java.lang.Object) str10);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on image7 and image6.", image7.equals(image6) == image6.equals(image7));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test177");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.updateCollectionsPublicValue((java.lang.Long) (-1L), (java.lang.Long) 1L, (java.lang.Boolean) true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test178");
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
        de.htw.sdf.photoplatform.persistence.model.Category category10 = collectionCategory0.getCategory();
        de.htw.sdf.photoplatform.persistence.model.Category category11 = collectionCategory0.getCategory();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory12 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection13 = null;
        collectionCategory12.setCollection(collection13);
        de.htw.sdf.photoplatform.persistence.model.Collection collection15 = null;
        collectionCategory12.setCollection(collection15);
        de.htw.sdf.photoplatform.persistence.model.Category category17 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category17.setName("/user/enablephotographer");
        category17.setName("hi!");
        java.lang.String str22 = category17.getDescription();
        java.lang.String str23 = category17.getDescription();
        collectionCategory12.setCategory(category17);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage25 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image26 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image26.setCreatedBy("");
        collectionImage25.setImage(image26);
        de.htw.sdf.photoplatform.persistence.model.Image image30 = collectionImage25.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection31 = collectionImage25.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Image image32 = collectionImage25.getImage();
        image32.setMetaData("/index.html");
        boolean b35 = category17.equals((java.lang.Object) image32);
        collectionCategory0.setCategory(category17);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on collectionCategory0, collectionCategory12, and image30.", !(collectionCategory0.equals(collectionCategory12) && collectionCategory12.equals(image30)) || collectionCategory0.equals(image30));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test179");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionDAOImpl0.findByUserAndCollectionId((long) (-1), (long) 100);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test180");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user2 = collection1.getUser();
        java.lang.String str3 = collection1.getName();
        java.lang.String str4 = collection1.getDescription();
        boolean b5 = collection1.isPublic();
        java.lang.String str6 = collection1.getName();
        collectionDAOImpl0.delete(collection1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test181");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage2 = collectionImageDAOImpl0.findOne((long) 'a');
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test182");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard5 = user1.getAuthorities();
        boolean b6 = user1.isAdmin();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage8 = userImageDAOImpl0.getPhotographImage(user1, (java.lang.Long) (-1L));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test183");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Role> list_role2 = roleDAOImpl0.findAllNotAdminRoles();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test184");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isBecomePhotographer();
        user1.setFirstName("/index.html");
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage7 = imageManagerImpl0.getPhotographImages(user1, 10001, 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test185");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        java.lang.String str3 = image1.getUpdatedBy();
        java.lang.String str4 = image1.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image1);
        boolean b6 = image1.isEnabled();
        image1.setMobileThumbPath("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        image1.setPublic(true);
        imageManagerImpl0.delete(image1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test186");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user6 = userDAOImpl0.find((java.lang.Integer) 10000, (java.lang.Integer) 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test187");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array8 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long9 = new java.util.ArrayList<java.lang.Long>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long9, long_array8);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long9);
        collectionData3.setName("/user/login");
        java.lang.String str14 = collectionData3.getDescription();
        java.util.List<java.lang.Long> list_long15 = collectionData3.getImageIds();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionImage> list_collectionImage16 = photographerManagerImpl0.addImagesToCollection((java.lang.Long) 1L, (java.lang.Long) 0L, list_long15);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test188");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user5 = userDAOImpl0.findPhotographersToActivate();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test190");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.UserData> list_userData3 = userController0.getEnabledUsers((int) ' ', 10001);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test191");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        userManagerImpl0.registerUser("/index.html", "/collections/photographers/{start}/{count}", "null:1528137271348:359dea61c52e045b1b927389910fdd93", "Image{name='null', path='null', isPublic=false, enabled=false, price=-1.0}");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test192");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user4 = userDAOImpl0.find((java.lang.Integer) 100, (java.lang.Integer) 1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test193");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.updateCollectionsPublicValue((java.lang.Long) 10L, (java.lang.Long) (-1L), (java.lang.Boolean) true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test195");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = photographerManagerImpl0.createCollection((java.lang.Long) 1L, "/collections/{collectionId}/images", "null:1528137250344:31149e863206f62132f4465a1c878d2c");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test196");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        de.htw.sdf.photoplatform.persistence.model.Category category6 = categoryManagerImpl0.update(category1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test198");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 1L, (java.lang.Long) 10L, (java.lang.Long) (-1L));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test199");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setAccountNonLocked(true);
        boolean b7 = user2.isAccountNonExpired();
        java.lang.String str8 = user2.getUsername();
        java.lang.String str9 = user2.getFirstName();
        user2.setPassword("/user/lock/{id}");
        java.lang.Boolean b12 = userManagerImpl0.isUserPhotographer(user2);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test200");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        userManagerImpl0.registerUser("Image{name='null', path='', isPublic=false, enabled=false, price=1.0}", "null:1528137255129:74131369d5ab98a30139e53b9d69dc36", "Collection{user=null, name='null'}", "/showcase");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test202");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteImage((java.lang.Long) (-1L), (java.lang.Long) 100L);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test203");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user4 = collection3.getUser();
        java.lang.String str5 = collection3.getName();
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = collectionDAOImpl0.update(collection3);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test204");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        boolean b4 = user1.isAccountNonLocked();
        boolean b5 = user1.isCredentialsNonExpired();
        boolean b6 = user1.isCredentialsNonExpired();
        java.lang.String str7 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user1);
        userDAOImpl0.create(user1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test205");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = imageManagerImpl0.findById((long) (byte) 10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test207");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        userManagerImpl0.registerUser("null:1528137271348:359dea61c52e045b1b927389910fdd93", "null:1528137269023:a165acffd0d2c313e6fa2c2dbbd2dc76", "/user/unlock/{id}", "Image{name='null', path='', isPublic=false, enabled=false, price=1.0}");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test208");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        boolean b4 = user0.isAccountNonLocked();
        boolean b5 = user0.isAdmin();
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
        de.htw.sdf.photoplatform.persistence.model.Role role16 = userRole6.getRole();
        de.htw.sdf.photoplatform.persistence.model.User user17 = null;
        userRole6.setUser(user17);
        de.htw.sdf.photoplatform.persistence.model.Role role19 = userRole6.getRole();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole20 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user21 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b22 = user21.isPhotographer();
        userRole20.setUser(user21);
        de.htw.sdf.photoplatform.persistence.model.UserRole[] userRole_array24 = new de.htw.sdf.photoplatform.persistence.model.UserRole[] { userRole6, userRole20 };
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserRole> arraylist_userRole25 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserRole>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.UserRole>) arraylist_userRole25, userRole_array24);
        user0.setUserRoles((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole>) arraylist_userRole25);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on user12 and user21.", user12.equals(user21) == user21.equals(user12));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test209");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = photographerManagerImpl0.getCollectionById((java.lang.Long) 10L);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test210");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user2 = collection1.getUser();
        java.lang.String str3 = collection1.getName();
        java.lang.String str4 = collection1.getDescription();
        boolean b5 = collection1.isPublic();
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = photographerManagerImpl0.update(collection1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test211");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole0.setRole(role2);
        de.htw.sdf.photoplatform.persistence.model.Role role4 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.User user5 = userRole0.getUser();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole6 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user7 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b8 = user7.isPhotographer();
        userRole6.setUser(user7);
        user7.setAccountNonLocked(true);
        user7.setPassword("hi!");
        userRole0.setUser(user7);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on userRole0, userRole6, and role2.", !(userRole0.equals(userRole6) && userRole6.equals(role2)) || userRole0.equals(role2));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test212");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        boolean b8 = userManagerImpl0.becomePhotographer((long) 400, "/user/register", "null:1528137279822:b6febc5d19820053275b806a60630a06", "/collections/photographers/{start}/{count}", "/user/login", "de.htw.sdf.photoplatform.persistence.model.User [ID=null]", "Image{name='null', path='null', isPublic=false, enabled=false, price=-1.0}");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test213");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.getByRoleAndEnabled("obfuscate", false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test214");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        collectionCategoryDAOImpl0.deleteById((long) (byte) 1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test216");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.isSigned("Image{name='Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}', path='null', isPublic=false, enabled=false, price=null}");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test217");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        categoryDAOImpl0.deleteById((long) '#');
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test218");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category1.setDescription("obfuscate");
        category1.setName("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        categoryManagerImpl0.create(category1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test219");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.isSigned("");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test220");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user7 = userDAOImpl0.find((java.lang.Integer) 10002, (java.lang.Integer) 1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test221");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.checkUserPermissions("/collections/{collectionId}");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test222");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category1.setName("/photographer/images/{imageId}");
        categoryManagerImpl0.create(category1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test223");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData5 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array10 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long11 = new java.util.ArrayList<java.lang.Long>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long11, long_array10);
        collectionData5.setImageIds((java.util.List<java.lang.Long>) arraylist_long11);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage14 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 1L, (java.lang.Long) (-1L), (java.util.List<java.lang.Long>) arraylist_long11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test224");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findById((long) 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test225");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        java.lang.String str3 = image1.getUpdatedBy();
        java.lang.String str4 = image1.getSmallThumbPath();
        image1.setCreatedBy("/collections/addimage");
        java.lang.String str7 = image1.toString();
        de.htw.sdf.photoplatform.persistence.model.Image image8 = imageManagerImpl0.update(image1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test227");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.checkUserPermissions("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_CUSTOMER");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test228");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category4 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category4.setName("/user/enablephotographer");
        category4.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category4.setDescription("obfuscate");
        category4.setDescription("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        category4.setName("/users/becomephotographers");
        java.lang.String str15 = category4.getName();
        categoryDAOImpl0.delete(category4);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test229");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("hi!");
        java.lang.String str6 = category1.getDescription();
        de.htw.sdf.photoplatform.persistence.model.Category category7 = categoryManagerImpl0.update(category1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test230");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = null;
        collectionImage0.setCollection(collection5);
        java.util.Date date7 = null;
        collectionImage0.setCreatedAt(date7);
        de.htw.sdf.photoplatform.persistence.model.Image image9 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str10 = image9.toString();
        image9.setThumbPath("/user/makeadmin/{id}");
        boolean b13 = image9.isEnabled();
        image9.setPublic(true);
        collectionImage0.setImage(image9);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on image9, image1, and image1.", !(image9.equals(image1) && image1.equals(image1)) || image9.equals(image1));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test231");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user6 = userDAOImpl0.findByRoleAndEnabledFilter("/user/login", false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test232");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = collectionDAOImpl0.findByUserAndCollectionId((long) 11004, (long) (short) 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test233");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user5 = userDAOImpl0.findByRoleAndEnabledFilter("/photographer/images", false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test234");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        collectionImageDAOImpl0.deleteAll();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test235");
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
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole10 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role11 = userRole10.getRole();
        de.htw.sdf.photoplatform.persistence.model.User user12 = userRole10.getUser();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole13 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role14 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role14.setName("ROLE_CUSTOMER");
        userRole13.setRole(role14);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole18 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role19 = userRole18.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role20 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole18.setRole(role20);
        de.htw.sdf.photoplatform.persistence.model.Role role22 = userRole18.getRole();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole23 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role24 = userRole23.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role25 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole23.setRole(role25);
        de.htw.sdf.photoplatform.persistence.model.User user27 = userRole23.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user28 = userRole23.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user29 = userRole23.getUser();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole30 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user31 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b32 = user31.isPhotographer();
        userRole30.setUser(user31);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole34 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        java.util.Date date35 = null;
        userRole34.setCreatedAt(date35);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole37 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user38 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b39 = user38.isPhotographer();
        userRole37.setUser(user38);
        java.lang.String str41 = userRole37.getUpdatedBy();
        de.htw.sdf.photoplatform.persistence.model.UserRole[] userRole_array42 = new de.htw.sdf.photoplatform.persistence.model.UserRole[] { userRole10, userRole13, userRole18, userRole23, userRole30, userRole34, userRole37 };
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserRole> arraylist_userRole43 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserRole>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.UserRole>) arraylist_userRole43, userRole_array42);
        user6.setUserRoles((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole>) arraylist_userRole43);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on userRole30 and userRole23.", userRole30.equals(userRole23) == userRole23.equals(userRole30));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test236");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 0L, (java.lang.Long) 100L, (java.lang.Long) 10L);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test237");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getShowcaseByUser((java.lang.Long) 100L, 10000, (int) '4');
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test239");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionDAOImpl0.getEntityManager();
        collectionDAOImpl0.deleteAll();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test240");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getUsername();
        java.lang.Boolean b5 = userManagerImpl0.isRoleIncluded(user1, "/collections/update");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test241");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.Query query2 = collectionDAOImpl0.createQuery("null:1528137271348:359dea61c52e045b1b927389910fdd93");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test242");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = collectionImageDAOImpl0.findOne(10L);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test243");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        de.htw.sdf.photoplatform.persistence.model.User user3 = userDAOImpl0.findOne((long) 10001);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test244");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard5 = user1.getAuthorities();
        boolean b6 = user1.isAdmin();
        java.lang.Boolean b7 = userManagerImpl0.isUserPhotographer(user1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test245");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteCollection((java.lang.Long) 0L, (java.lang.Long) (-1L));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test246");
        de.htw.sdf.photoplatform.webservice.controller.CollectionController collectionController0 = new de.htw.sdf.photoplatform.webservice.controller.CollectionController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData4 = collectionController0.getCollectionsImages((java.lang.Long) 10L, (int) '#', (int) (short) -1);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test247");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole2 = userRoleDAOImpl0.findOne(0L);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test248");
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
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor29 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest30 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse31 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException34 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor29.afterCompletion(httpServletRequest30, httpServletResponse31, (java.lang.Object) 10, (java.lang.Exception) notFoundException34);
        javax.servlet.http.HttpServletRequest httpServletRequest36 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse37 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage38 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView39 = null;
        requestLoggerInterceptor29.postHandle(httpServletRequest36, httpServletResponse37, (java.lang.Object) userImage38, modelAndView39);
        java.util.Date date41 = userImage38.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.User user42 = new de.htw.sdf.photoplatform.persistence.model.User();
        user42.setEnabled(false);
        userImage38.setOwner(user42);
        java.lang.String str46 = user42.getPassword();
        boolean b48 = user42.isRoleIncluded("/user/makeadmin/{id}");
        userImage9.setOwner(user42);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on userImage9, userImage38, and requestLoggerInterceptor0.", !(userImage9.equals(userImage38) && userImage38.equals(requestLoggerInterceptor0)) || userImage9.equals(requestLoggerInterceptor0));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test249");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = collectionDAOImpl0.findByUserAndCollectionId((long) (short) 1, (long) (byte) -1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test251");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setCreationDate();
        user1.setAccountNonLocked(true);
        java.lang.String str6 = user1.getUsername();
        userManagerImpl0.delete(user1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test252");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionDAOImpl0.getEntityManager();
        collectionDAOImpl0.deleteById((-1L));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test254");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        userManagerImpl0.registerUser("null:1528137271348:359dea61c52e045b1b927389910fdd93", "null:1528137255129:74131369d5ab98a30139e53b9d69dc36", "cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e", "null:1528137288660:1a2c7fbd81ed38e3fb25d5bcfea287cf");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test255");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userDAOImpl0.findByEnabled(true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test256");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        java.lang.String str3 = image1.getUpdatedBy();
        java.lang.String str4 = image1.getSmallThumbPath();
        java.lang.String str5 = image1.getUpdatedBy();
        java.lang.String str6 = image1.toString();
        image1.setName("/collections/create");
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData9 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image1);
        imageManagerImpl0.delete(image1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test258");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category2.setName("/user/enablephotographer");
        category2.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category2.setDescription("obfuscate");
        java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory9 = collectionCategoryDAOImpl0.getCollectionCategoryBy(category2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test259");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category2.setName("/user/enablephotographer");
        category2.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category2.setName("/photographer/images/{imageId}");
        java.lang.String str9 = category2.toString();
        category2.setDescription("/user/enablephotographer");
        categoryDAOImpl0.delete(category2);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test260");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.lockUser((long) (-1));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test261");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getCollectionByUser((long) 10001, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test262");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user5 = userDAOImpl0.findByRoleId((java.lang.Long) (-1L));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test264");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = userController0.getUserProfileData("/users/profile/{userId}");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test265");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userDAOImpl0.findOne((long) 11003);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test266");
        de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl collectionManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionManagerImpl0.getCollectionImages((java.lang.Long) (-1L), (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test267");
        de.htw.sdf.photoplatform.webservice.controller.CollectionController collectionController0 = new de.htw.sdf.photoplatform.webservice.controller.CollectionController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData4 = collectionController0.getCollectionsImages((java.lang.Long) 1L, (int) (short) 1, 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test268");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findById((long) 10000);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test270");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userRoleDAOImpl0.getEntityManager();
        userRoleDAOImpl0.deleteById((long) 100);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test271");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Role role4 = roleDAOImpl0.findOne(0L);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test272");
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
        java.lang.String str13 = image12.toString();
        image12.setThumbPath("/user/makeadmin/{id}");
        boolean b16 = image12.isEnabled();
        image12.setPublic(true);
        userImage9.setImage(image12);
        de.htw.sdf.photoplatform.persistence.model.Image image20 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image20.setCreatedBy("");
        image20.setThumbPath("/users/admin/{start}/{count}");
        image20.setUpdatedBy("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        userImage9.setImage(image20);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on image20, image12, and image12.", !(image20.equals(image12) && image12.equals(image12)) || image20.equals(image12));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test273");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = photographerManagerImpl0.createCollection((java.lang.Long) 10L, "", "/index.html");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test274");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image2 = imageDAOImpl0.getPublicImages();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test275");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user2 = collection1.getUser();
        java.lang.String str3 = collection1.getName();
        boolean b4 = collection1.isPublic();
        collection1.setPublic(false);
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = collectionDAOImpl0.update(collection1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test276");
        de.htw.sdf.photoplatform.webservice.controller.CollectionController collectionController0 = new de.htw.sdf.photoplatform.webservice.controller.CollectionController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData4 = collectionController0.getCollectionsImages((java.lang.Long) 0L, 10001, 10002);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test277");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        boolean b4 = user1.isAccountNonLocked();
        boolean b5 = user1.isCredentialsNonExpired();
        java.lang.String str6 = user1.getLastName();
        java.lang.String str7 = user1.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole8 = user1.getUserRoles();
        boolean b9 = user1.isPhotographer();
        de.htw.sdf.photoplatform.persistence.model.User user10 = userManagerImpl0.update(user1);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test278");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage5 = userImageDAOImpl0.getOwnerImages(10L, (java.lang.Long) 100L);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test279");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory2 = collectionCategoryDAOImpl0.findOne(1L);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test281");
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
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor15 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse17 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException20 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor15.afterCompletion(httpServletRequest16, httpServletResponse17, (java.lang.Object) 10, (java.lang.Exception) notFoundException20);
        javax.servlet.http.HttpServletRequest httpServletRequest22 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse23 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage24 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView25 = null;
        requestLoggerInterceptor15.postHandle(httpServletRequest22, httpServletResponse23, (java.lang.Object) userImage24, modelAndView25);
        de.htw.sdf.photoplatform.persistence.model.Image image27 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str28 = image27.getMime();
        java.lang.String str29 = image27.getUpdatedBy();
        java.lang.String str30 = image27.getSmallThumbPath();
        image27.setCreatedBy("/collections/addimage");
        image27.setEnabled(true);
        userImage24.setImage(image27);
        de.htw.sdf.photoplatform.persistence.model.Image image36 = userImage24.getImage();
        userImage9.setImage(image36);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on userImage9, userImage24, and requestLoggerInterceptor15.", !(userImage9.equals(userImage24) && userImage24.equals(requestLoggerInterceptor15)) || userImage9.equals(requestLoggerInterceptor15));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test282");
        de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl collectionManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionManagerImpl0.getCollectionImages((java.lang.Long) 1L, 0, (int) (byte) 100);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test283");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.Query query4 = userDAOImpl0.createQuery("null:1528137271348:359dea61c52e045b1b927389910fdd93");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test284");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findByName("null:1528137293936:a0988808b1e86f8e45491a6365ca0d34");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test285");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        user0.setLastName("/user/unlock/{id}");
        boolean b3 = user0.isPhotographer();
        java.lang.String str4 = user0.getUsername();
        boolean b5 = user0.isAdmin();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData6 = new de.htw.sdf.photoplatform.webservice.dto.UserData(user0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test286");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.getByRoleAndEnabled("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}", true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test287");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("hi!");
        category1.setName("/photographer/images");
        java.lang.String str8 = category1.getName();
        java.lang.String str9 = category1.getDescription();
        categoryManagerImpl0.create(category1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test288");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.find((java.lang.Integer) 11003, (java.lang.Integer) 10);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test289");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        boolean b2 = collection0.isPublic();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory3 = collection0.getCollectionCategories();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData4 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test290");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.Query query3 = roleDAOImpl0.createQuery("null:1528137248666:32ad08d7594d28504f1460b47d9ec391");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test292");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role2.setName("ROLE_CUSTOMER");
        userRole1.setRole(role2);
        roleDAOImpl0.create(role2);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test293");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category3 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category3.setName("/user/enablephotographer");
        category3.setName("hi!");
        category3.setDescription("/collections/{collectionId}/images");
        categoryDAOImpl0.create(category3);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test294");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getCollectionByUser(10L, 0, 11002);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test295");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user2 = collection1.getUser();
        java.lang.String str3 = collection1.getName();
        boolean b4 = collection1.isPublic();
        collection1.setPublic(false);
        photographerManagerImpl0.delete(collection1);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test296");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = userController0.getUserProfileData("f69da696e5820bcbd9fb36421272c447");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test297");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Role role3 = roleDAOImpl0.findByName("93e210c4650e33acb58f8d1cfa9bbe56");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test298");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage3 = userImageDAOImpl0.findOne((long) (byte) 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test299");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole2 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role3 = userRole2.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role4 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole2.setRole(role4);
        de.htw.sdf.photoplatform.persistence.model.User user6 = userRole2.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user7 = userRole2.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user8 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b9 = user8.isAdmin();
        java.lang.String str10 = user8.getSecToken();
        userRole2.setUser(user8);
        de.htw.sdf.photoplatform.persistence.model.Role role12 = userRole2.getRole();
        java.lang.String str13 = role12.getName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user14 = userDAOImpl0.findByRole(role12);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test300");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category1.setName("/photographer/images/{imageId}");
        java.lang.String str8 = category1.toString();
        de.htw.sdf.photoplatform.persistence.model.Category category9 = categoryDAOImpl0.update(category1);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test301");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = imageDAOImpl0.getEntityManager();
        imageDAOImpl0.deleteAll();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test302");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        userManagerImpl0.registerUser("/collections/{collectionId}/images", "Category{name='/photographer/images'}", "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0", "/collections/{collectionId}/images/{imageId}");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test303");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        java.lang.String str2 = category1.toString();
        java.lang.String str3 = category1.getName();
        de.htw.sdf.photoplatform.persistence.model.Category category4 = categoryDAOImpl0.update(category1);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test304");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category4 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category4.setName("/user/enablephotographer");
        category4.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category4.setDescription("obfuscate");
        category4.setDescription("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        java.lang.String str13 = category4.getDescription();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory14 = collectionCategoryDAOImpl0.getCollectionCategoryBy(category4);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test306");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryDAOImpl0.findOne((long) 400);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test307");
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory0 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = null;
        collectionCategory0.setCollection(collection1);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory3 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = null;
        collectionCategory3.setCollection(collection4);
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = null;
        collectionCategory3.setCollection(collection6);
        de.htw.sdf.photoplatform.persistence.model.Category category8 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category8.setName("/user/enablephotographer");
        category8.setName("hi!");
        java.lang.String str13 = category8.getDescription();
        java.lang.String str14 = category8.getDescription();
        collectionCategory3.setCategory(category8);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage16 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image17 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image17.setCreatedBy("");
        collectionImage16.setImage(image17);
        de.htw.sdf.photoplatform.persistence.model.Image image21 = collectionImage16.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection22 = collectionImage16.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Image image23 = collectionImage16.getImage();
        image23.setMetaData("/index.html");
        boolean b26 = category8.equals((java.lang.Object) image23);
        collectionCategory0.setCategory(category8);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on collectionCategory0, collectionCategory3, and collectionImage16.", !(collectionCategory0.equals(collectionCategory3) && collectionCategory3.equals(collectionImage16)) || collectionCategory0.equals(collectionImage16));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test308");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = userController0.getUserProfileData("ROLE_BECOME_PHOTOGRAPHER");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test309");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userDAOImpl0.findAllNotAdminUsers();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test310");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = photographerManagerImpl0.createCollection((java.lang.Long) 10L, "/user/login", "/users/admin/{start}/{count}");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test311");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole2 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role3 = userRole2.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role4 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole2.setRole(role4);
        de.htw.sdf.photoplatform.persistence.model.User user6 = userRole2.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user7 = userRole2.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user8 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b9 = user8.isAdmin();
        java.lang.String str10 = user8.getSecToken();
        userRole2.setUser(user8);
        de.htw.sdf.photoplatform.persistence.model.Role role12 = userRole2.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role13 = userRole2.getRole();
        role13.setName("5b077a3001f6b54eed6802448a739229");
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user16 = userDAOImpl0.findByRole(role13);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test312");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionDAOImpl0.getEntityManager();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 100L);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test314");
        de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl collectionManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionManagerImpl0.getCollectionImages((java.lang.Long) 100L, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test315");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userManagerImpl0.delete(user1);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test316");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData3 = photographerController0.getShowcase((int) (byte) 1, 1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test317");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category1.setName("/photographer/images/{imageId}");
        java.lang.String str8 = category1.toString();
        category1.setDescription("/user/enablephotographer");
        categoryManagerImpl0.create(category1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test318");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        boolean b8 = userManagerImpl0.becomePhotographer((long) 1, "/collections/create", "/collections/{collectionId}/images/{imageId}", "/user/becomePhotographer", "null:1528137264754:37059375c02a8fd63e589326ff8446ea", "obfuscate", "de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test319");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isAdmin();
        user2.setCreationDate();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage5 = userImageDAOImpl0.getPhotographImages(user2);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test320");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = userController0.getUserProfileData("/collections/photographers/{start}/{count}");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test321");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.lang.String str2 = collection0.getName();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData4 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection0, true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test322");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getShowcaseByUser((java.lang.Long) 10L, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test323");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage5 = imageManagerImpl0.getPhotographImages(user1, 404, (int) (short) 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test324");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.UserData> list_userData3 = userController0.getEnabledUsers(10002, 400);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test326");
        de.htw.sdf.photoplatform.webservice.controller.CollectionController collectionController0 = new de.htw.sdf.photoplatform.webservice.controller.CollectionController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData4 = collectionController0.getCollectionsImages((java.lang.Long) 100L, (int) (short) 100, 10000);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test327");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Category> list_category2 = categoryDAOImpl0.findAll();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test328");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.getByRoleAndEnabled("null:1528137293936:a0988808b1e86f8e45491a6365ca0d34", true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test329");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category3 = categoryDAOImpl0.findByName("null:1528137294582:dab166dacc3695a720d9c3367ef6e28e");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test331");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        java.lang.String str3 = photographerController0.deleteImageFromCollection((java.lang.Long) 100L, (java.lang.Long) (-1L));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test332");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.unlockUser(10L);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test334");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.Query query5 = imageDAOImpl0.createQuery("aa0668324371e9b034306466d6abdba5");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test335");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = userController0.getUserProfileData("c6b1a776700c142c2308d9e211ec2604d74447a464b7bd416cbd43a82f0863c6a3d248fed0cbeb045d3aadff070cb1b731612d4d3fe9f8f566131d7f92804f6c");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test336");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array8 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long9 = new java.util.ArrayList<java.lang.Long>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long9, long_array8);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long9);
        collectionData3.setId((long) (short) 1);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData14 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array19 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long20 = new java.util.ArrayList<java.lang.Long>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long20, long_array19);
        collectionData14.setImageIds((java.util.List<java.lang.Long>) arraylist_long20);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData23 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array28 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long29 = new java.util.ArrayList<java.lang.Long>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long29, long_array28);
        collectionData23.setImageIds((java.util.List<java.lang.Long>) arraylist_long29);
        collectionData14.setImageIds((java.util.List<java.lang.Long>) arraylist_long29);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long29);
        java.lang.Boolean b34 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 0L, (java.lang.Long) 100L, (java.util.List<java.lang.Long>) arraylist_long29);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test337");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.getByRoleAndEnabled("9e8062a1d79d79e31daf17f2e0544261af391092c46033dfcfa4c0391b7eeeb6a8a498016e4c6924314fa3a526f390fd48523c8a280218f2104630a210b3a469", false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test338");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category1.setName("/photographer/images/{imageId}");
        java.lang.String str8 = category1.getName();
        de.htw.sdf.photoplatform.persistence.model.Category category9 = categoryManagerImpl0.update(category1);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test339");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory4 = collectionCategoryDAOImpl0.findOne((long) 404);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test340");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteCollection((java.lang.Long) 1L, (java.lang.Long) 100L);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test341");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        boolean b4 = user1.isAccountNonLocked();
        boolean b5 = user1.isCredentialsNonExpired();
        java.lang.String str6 = user1.getLastName();
        java.lang.String str7 = user1.getFirstName();
        de.htw.sdf.photoplatform.persistence.model.User user8 = userManagerImpl0.update(user1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test342");
        de.htw.sdf.photoplatform.webservice.controller.CollectionController collectionController0 = new de.htw.sdf.photoplatform.webservice.controller.CollectionController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData4 = collectionController0.getCollectionsImages((java.lang.Long) 0L, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test343");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole4 = user1.getUserRoles();
        java.lang.Boolean b6 = userManagerImpl0.isRoleIncluded(user1, "/user/register");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test344");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = imageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Image image5 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str6 = image5.getMime();
        java.lang.String str7 = image5.getMobileThumbPath();
        image5.setPublic(true);
        de.htw.sdf.photoplatform.persistence.model.Image image10 = imageDAOImpl0.update(image5);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test346");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user5 = userDAOImpl0.findByRoleId((java.lang.Long) 100L);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test347");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = photographerManagerImpl0.createCollection((java.lang.Long) (-1L), "Image{name='null', path='null', isPublic=false, enabled=false, price=-1.0}", "93e210c4650e33acb58f8d1cfa9bbe56");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test348");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findByName("/collections/update");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test349");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        java.lang.String str2 = category1.toString();
        categoryManagerImpl0.delete(category1);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test352");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.find((java.lang.Integer) 10000, (java.lang.Integer) 1);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test354");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage2 = userImageDAOImpl0.findOne((long) 10001);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test355");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user4 = userDAOImpl0.findAllNotAdminUsers();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test356");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryManagerImpl0.findById((long) (short) 100);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test357");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole0.setRole(role2);
        de.htw.sdf.photoplatform.persistence.model.Role role4 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role5 = null;
        userRole0.setRole(role5);
        de.htw.sdf.photoplatform.persistence.model.Role role7 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role7.setName("ROLE_CUSTOMER");
        role7.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        userRole0.setRole(role7);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on role7, role2, and role4.", !(role7.equals(role2) && role2.equals(role4)) || role7.equals(role4));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test358");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        boolean b8 = userManagerImpl0.becomePhotographer((long) 100, "77ce3535f163da232981f0d31864a601ca7857e39a64df07a354c6860cf425727ccc18a2328f2e2bfe2e86f09067f3be6c7841e138ba6b4e2d0fea3d964ab0d9", "/user/enablephotographer", "/collections/{collectionId}/images", "null:1528137281269:5056f29775854522e0ebd121af608756", "null:1528137266330:9de181051f39b56aea6ebed61ac6f110", "/photographer/upload");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test360");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category1.setName("/photographer/images/{imageId}");
        de.htw.sdf.photoplatform.persistence.model.Category category8 = categoryManagerImpl0.update(category1);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test361");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setPassword("ROLE_PHOTOGRAPHER");
        boolean b6 = user1.isRoleIncluded("/user/becomePhotographer");
        boolean b7 = user1.isCredentialsNonExpired();
        de.htw.sdf.photoplatform.persistence.model.User user8 = userManagerImpl0.update(user1);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test362");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole0.setRole(role2);
        de.htw.sdf.photoplatform.persistence.model.Role role4 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role5 = null;
        userRole0.setRole(role5);
        de.htw.sdf.photoplatform.persistence.model.User user7 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b8 = user7.isAdmin();
        java.lang.String str9 = user7.getSecToken();
        boolean b10 = user7.isAccountNonLocked();
        boolean b11 = user7.isPhotographer();
        userRole0.setUser(user7);
        de.htw.sdf.photoplatform.persistence.model.Role role13 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.User user14 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b15 = user14.isAdmin();
        java.lang.String str16 = user14.getSecToken();
        boolean b17 = user14.isAccountNonLocked();
        boolean b18 = user14.isEnabled();
        userRole0.setUser(user14);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on user14, user7, and user7.", !(user14.equals(user7) && user7.equals(user7)) || user14.equals(user7));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test363");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        image1.setThumbPath("/users/admin/{start}/{count}");
        java.util.Date date6 = image1.getCreatedAt();
        java.lang.String str7 = image1.getMetaData();
        image1.setPublic(true);
        imageManagerImpl0.delete(image1);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test364");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category3 = categoryDAOImpl0.findByName("/collections/{collectionId}/images/{imageId}");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test366");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.Query query2 = collectionCategoryDAOImpl0.createQuery("9277920e18d95961691dfdc6e2623546");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test367");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole3 = userRoleDAOImpl0.findByUserAndRoleId((java.lang.Long) 0L, (java.lang.Long) 1L);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test368");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.find((java.lang.Integer) 11003, (java.lang.Integer) 35);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test370");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userDAOImpl0.findPhotographersToActivate();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test371");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.Query query4 = userDAOImpl0.createQuery("null:1528137279822:b6febc5d19820053275b806a60630a06");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test373");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        roleDAOImpl0.deleteById((long) 11004);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test374");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.unlockUser((long) 10001);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test375");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryManagerImpl0.findById((long) (byte) 10);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test376");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setPassword("ROLE_PHOTOGRAPHER");
        boolean b6 = user1.isRoleIncluded("/user/becomePhotographer");
        boolean b7 = user1.isCredentialsNonExpired();
        java.lang.String str8 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user1);
        java.lang.String str9 = user1.getPassword();
        java.lang.Boolean b10 = userManagerImpl0.isUserAdmin(user1);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test377");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = imageManagerImpl0.findById(0L);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test378");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user2 = collection1.getUser();
        java.lang.String str3 = collection1.getName();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory4 = collection1.getCollectionCategories();
        boolean b5 = collection1.isPublic();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = collection1.getThumbnail();
        photographerManagerImpl0.delete(collection1);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test379");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.lockUser((long) 35);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test382");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userRoleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole4 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isPhotographer();
        userRole4.setUser(user5);
        java.lang.String str8 = userRole4.getUpdatedBy();
        userRoleDAOImpl0.delete(userRole4);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test383");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData1 = collectionData0.getUserdata();
        java.util.List<java.lang.Long> list_long2 = collectionData0.getImageIds();
        collectionData0.setDescription("");
        java.util.List<java.lang.Long> list_long5 = collectionData0.getImageIds();
        de.htw.sdf.photoplatform.persistence.model.User user6 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b7 = user6.isAdmin();
        java.lang.String str8 = user6.getSecToken();
        boolean b9 = user6.isAccountNonLocked();
        boolean b10 = user6.isCredentialsNonExpired();
        boolean b11 = user6.isCredentialsNonExpired();
        de.htw.sdf.photoplatform.persistence.model.Collection collection12 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData0, user6);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test384");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setCreationDate();
        user1.setAccountNonLocked(true);
        java.lang.String str6 = user1.getUsername();
        java.lang.Boolean b7 = userManagerImpl0.isUserAdmin(user1);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test385");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userRole0.getUser();
        userRole0.setUpdatedBy("/photographer/images/{imageId}");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role6 = userRole5.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role7 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole5.setRole(role7);
        de.htw.sdf.photoplatform.persistence.model.User user9 = userRole5.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user10 = userRole5.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user11 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b12 = user11.isAdmin();
        java.lang.String str13 = user11.getSecToken();
        userRole5.setUser(user11);
        de.htw.sdf.photoplatform.persistence.model.User user15 = userRole5.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user16 = userRole5.getUser();
        userRole0.setUser(user16);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on userRole0, userRole5, and userRole5.", !(userRole0.equals(userRole5) && userRole5.equals(userRole5)) || userRole0.equals(userRole5));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test386");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("hi!");
        java.lang.String str6 = category1.getDescription();
        category1.setName("/api");
        categoryManagerImpl0.delete(category1);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test387");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        collectionCategoryDAOImpl0.deleteById((long) 'a');
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test388");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setUsername("/api");
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getCreatedBy();
        java.lang.String str9 = user2.getUsername();
        java.lang.Boolean b10 = userManagerImpl0.isUserAdmin(user2);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test390");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = userRole1.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role3 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole1.setRole(role3);
        de.htw.sdf.photoplatform.persistence.model.User user5 = userRole1.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user6 = userRole1.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user7 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b8 = user7.isAdmin();
        java.lang.String str9 = user7.getSecToken();
        userRole1.setUser(user7);
        de.htw.sdf.photoplatform.persistence.model.Role role11 = userRole1.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role12 = roleDAOImpl0.update(role11);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test391");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        roleDAOImpl0.deleteById((long) 'a');
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test392");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 100L, (java.lang.Long) 100L, (java.lang.Long) 10L);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test393");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setName("/photographer/upload");
        java.lang.String str4 = image1.toString();
        image1.setSmallThumbPath("ROLE_ADMIN");
        java.lang.String str7 = image1.getSmallThumbPath();
        java.lang.String str8 = image1.getName();
        java.lang.String str9 = image1.getDescription();
        de.htw.sdf.photoplatform.persistence.model.Image image10 = imageManagerImpl0.update(image1);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test394");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userRoleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole3 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role4 = userRole3.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role5 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole3.setRole(role5);
        de.htw.sdf.photoplatform.persistence.model.Role role7 = userRole3.getRole();
        de.htw.sdf.photoplatform.persistence.model.User user8 = userRole3.getUser();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole9 = userRoleDAOImpl0.update(userRole3);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test396");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage3 = userImageDAOImpl0.getOwnerImages((long) (-1), (java.lang.Long) 10L);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test397");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.makeAdmin((long) (short) 100);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test398");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionImage0.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = null;
        collectionImage0.setCollection(collection6);
        collectionImage0.setCreatedBy("/collections/{collectionId}/images");
        de.htw.sdf.photoplatform.persistence.model.Image image10 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData11 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image10);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData12 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image10);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData13 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image10);
        image10.setSmallThumbPath("/user/enablephotographer");
        collectionImage0.setImage(image10);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on image10, image1, and imageData13.", !(image10.equals(image1) && image1.equals(imageData13)) || image10.equals(imageData13));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test399");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getCollectionByUser((long) 11004, 1, 10);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test400");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = collectionDAOImpl0.findById((java.lang.Long) 100L);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test401");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 1L, (java.lang.Long) 0L, (java.lang.Long) 0L);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test402");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("hi!");
        category1.setName("/photographer/images");
        java.lang.String str8 = category1.getDescription();
        category1.setName("/user/register");
        de.htw.sdf.photoplatform.persistence.model.Category category11 = categoryManagerImpl0.update(category1);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test403");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userRoleDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole4 = userRoleDAOImpl0.findByUserId((java.lang.Long) 10L);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test405");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteCollection((java.lang.Long) 100L, (java.lang.Long) 0L);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test406");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user2 = collection1.getUser();
        java.lang.String str3 = collection1.getName();
        photographerManagerImpl0.delete(collection1);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test407");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = imageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = imageDAOImpl0.findOne((-1L));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test408");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category4 = categoryDAOImpl0.findByName("49961de64838862febaeead9e5ed74a8");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test409");
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage0 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = userImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userImage0.getOwner();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(userImage0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test410");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.Query query5 = imageDAOImpl0.createQuery("c6b1a776700c142c2308d9e211ec2604d74447a464b7bd416cbd43a82f0863c6a3d248fed0cbeb045d3aadff070cb1b731612d4d3fe9f8f566131d7f92804f6c");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test411");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userRoleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        userRoleDAOImpl0.deleteAll();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test412");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.makeAdmin((long) 0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test414");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        categoryDAOImpl0.deleteById((long) (byte) 1);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test415");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = photographerManagerImpl0.createCollection((java.lang.Long) 10L, "ROLE_BECOME_PHOTOGRAPHER", "null:1528137266330:9de181051f39b56aea6ebed61ac6f110");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test416");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.getByRoleAndEnabled("null:1528137270629:cbd34b0779b1c1d7e1215815c5bcba0d", true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test417");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        userDAOImpl0.deleteById(0L);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test418");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getCollectionByUser((long) (short) 1, 10001, 11004);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test420");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryManagerImpl0.findById((long) (short) 1);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test421");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteCollection((java.lang.Long) 1L, (java.lang.Long) 10L);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test422");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage3 = userImageDAOImpl0.findOne((long) 100);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test423");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionDAOImpl0.getEntityManager();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) (-1L));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test424");
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
        de.htw.sdf.photoplatform.persistence.model.User user25 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b26 = user25.isAdmin();
        java.lang.String str27 = user25.getSecToken();
        java.lang.String str28 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user25);
        user25.setAccountNonLocked(false);
        userImage9.setUser(user25);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on user25, user13, and image17.", !(user25.equals(user13) && user13.equals(image17)) || user25.equals(image17));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test426");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user4 = userDAOImpl0.findByRoleAndEnabledFilter("/collections/photographers/{start}/{count}", true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test427");
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
        de.htw.sdf.photoplatform.persistence.model.User user13 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b14 = user13.isAdmin();
        java.lang.String str15 = user13.getSecToken();
        boolean b16 = user13.isAccountNonLocked();
        boolean b17 = user13.isCredentialsNonExpired();
        java.lang.String str18 = user13.getLastName();
        collection0.setUser(user13);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on user13, user4, and user4.", !(user13.equals(user4) && user4.equals(user4)) || user13.equals(user4));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test428");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionDAOImpl0.findByUserAndCollectionId((long) 10002, (long) '4');
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test429");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.checkUserPermissions("/collections/create");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test430");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = userController0.getUserProfileData("/users/becomephotographers");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test431");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteImage((java.lang.Long) (-1L), (java.lang.Long) 1L);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test432");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.getByRoleAndEnabled("null:1528137269023:a165acffd0d2c313e6fa2c2dbbd2dc76", true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test433");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        java.lang.String str4 = user1.getCreatedBy();
        boolean b6 = user1.isRoleIncluded("bbd35e0331b2294504855572375f9bec");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData7 = new de.htw.sdf.photoplatform.webservice.dto.UserData(user1);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test434");
        de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl collectionManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionManagerImpl0.getCollectionImages((java.lang.Long) 0L, (-1), 404);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test435");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.lockUser((long) ' ');
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test436");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = collectionDAOImpl0.findById((java.lang.Long) (-1L));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test437");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole0.setRole(role2);
        de.htw.sdf.photoplatform.persistence.model.Role role4 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role5 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role6 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role6.setName("ROLE_CUSTOMER");
        java.lang.String str9 = role6.getName();
        role6.setName("/photographer/images");
        userRole0.setRole(role6);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on role6, role4, and role4.", !(role6.equals(role4) && role4.equals(role4)) || role6.equals(role4));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test438");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = photographerManagerImpl0.addImageToCollection((java.lang.Long) 1L, (java.lang.Long) (-1L), (java.lang.Long) 10L);
    }
}
