import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test001");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image2.setCreatedBy("");
        image2.setPrice((java.lang.Double) 1.0d);
        java.lang.String str7 = image2.getDescription();
        java.lang.String str8 = image2.getMime();
        image2.setMobileThumbPath("/photographer/upload");
        image2.setUpdatedBy("/photographer/upload");
        de.htw.sdf.photoplatform.persistence.model.Image image13 = imageDAOImpl0.update(image2);
    }

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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test006");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str5 = image4.getMime();
        image4.setMobileThumbPath("");
        image4.setPrice((java.lang.Double) 100.0d);
        boolean b10 = image4.isEnabled();
        image4.setPrice((java.lang.Double) 0.0d);
        java.lang.String str13 = image4.getMobileThumbPath();
        image4.setThumbPath("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        de.htw.sdf.photoplatform.persistence.model.Image image16 = imageDAOImpl0.update(image4);
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test016");
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
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData16 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection13);
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test020");
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
        de.htw.sdf.photoplatform.webservice.dto.UserData userData15 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str16 = userData15.getLastName();
        java.util.List<java.lang.String> list_str17 = userData15.getRoles();
        java.lang.String str18 = userData15.getSwift();
        java.lang.Boolean b19 = userData15.isEnabled();
        userData15.setPhone("/collections/photographers");
        collectionData0.setUserdata(userData15);
        de.htw.sdf.photoplatform.persistence.model.User user23 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b24 = user23.isBecomePhotographer();
        boolean b25 = user23.isAccountNonLocked();
        de.htw.sdf.photoplatform.persistence.model.Collection collection26 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData0, user23);
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test031");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user6 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b7 = user6.isPhotographer();
        userRole5.setUser(user6);
        boolean b10 = user6.isRoleIncluded("39c73479cb767c5a09248b3313c03447");
        de.htw.sdf.photoplatform.persistence.model.Image image11 = imageManagerImpl0.update((java.lang.Long) 10L, "/photographer/images/{imageId}", (java.lang.Double) (-1.0d), "/api", user6);
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test043");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        image1.setPrice((java.lang.Double) 1.0d);
        java.lang.String str6 = image1.getDescription();
        java.lang.String str7 = image1.getMime();
        image1.setMobileThumbPath("/photographer/upload");
        image1.setUpdatedBy("/photographer/upload");
        de.htw.sdf.photoplatform.persistence.model.User user12 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b13 = user12.isAdmin();
        user12.setPassword("ROLE_PHOTOGRAPHER");
        boolean b16 = user12.isBecomePhotographer();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage17 = imageManagerImpl0.addOwnerToImage(image1, user12);
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
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test055");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user3 = collection2.getUser();
        java.lang.String str4 = collection2.getName();
        boolean b5 = collection2.isPublic();
        collection2.setPublic(false);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory8 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection9 = null;
        collectionCategory8.setCollection(collection9);
        de.htw.sdf.photoplatform.persistence.model.Collection collection11 = null;
        collectionCategory8.setCollection(collection11);
        de.htw.sdf.photoplatform.persistence.model.Category category13 = collectionCategory8.getCategory();
        java.util.Date date14 = collectionCategory8.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection15 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user16 = collection15.getUser();
        collectionCategory8.setCollection(collection15);
        java.lang.String str18 = collection15.getDescription();
        de.htw.sdf.photoplatform.persistence.model.Collection collection19 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.Image image20 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image20.setCreatedBy("");
        image20.setPrice((java.lang.Double) 1.0d);
        java.lang.String str25 = image20.getDescription();
        java.lang.String str26 = image20.getMime();
        image20.setMobileThumbPath("/photographer/upload");
        boolean b29 = image20.isEnabled();
        image20.setPrice((java.lang.Double) 1.0d);
        collection19.setThumbnail(image20);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage33 = collection19.getCollectionImages();
        de.htw.sdf.photoplatform.persistence.model.Collection collection34 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user35 = collection34.getUser();
        java.lang.String str36 = collection34.getName();
        java.lang.String str37 = collection34.getDescription();
        de.htw.sdf.photoplatform.persistence.model.User user38 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b39 = user38.isAdmin();
        java.lang.String str40 = user38.getSecToken();
        boolean b41 = user38.isAccountNonLocked();
        boolean b42 = user38.isCredentialsNonExpired();
        java.lang.String str43 = user38.getLastName();
        java.lang.String str44 = user38.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole45 = user38.getUserRoles();
        collection34.setUser(user38);
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array47 = new de.htw.sdf.photoplatform.persistence.model.Collection[] { collection2, collection15, collection19, collection34 };
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection48 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection48, collection_array47);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection48);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection34 and collection19.", collection34.equals(collection19) == collection19.equals(collection34));
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test072");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str4 = image3.toString();
        java.lang.String str5 = image3.getName();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData6 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = collectionData6.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = collectionData6.getThumbnail();
        java.lang.Long[] long_array10 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long11 = new java.util.ArrayList<java.lang.Long>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long11, long_array10);
        collectionData6.setImageIds((java.util.List<java.lang.Long>) arraylist_long11);
        collectionData6.setId((long) (short) -1);
        java.lang.Long[] long_array17 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long18 = new java.util.ArrayList<java.lang.Long>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long18, long_array17);
        collectionData6.setImageIds((java.util.List<java.lang.Long>) arraylist_long18);
        boolean b21 = image3.equals((java.lang.Object) arraylist_long18);
        java.lang.Boolean b22 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 10L, (java.lang.Long) 10L, (java.util.List<java.lang.Long>) arraylist_long18);
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test078");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        image1.setPrice((java.lang.Double) 1.0d);
        java.lang.String str6 = image1.getDescription();
        java.lang.String str7 = image1.getMime();
        imageManagerImpl0.delete(image1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test079");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getCollectionByUser((long) 10001, 100, (int) '#');
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test080");
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
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData16 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection13, true);
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
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test082");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image4.setCreatedBy("");
        image4.setPrice((java.lang.Double) 1.0d);
        java.lang.String str9 = image4.getDescription();
        java.lang.String str10 = image4.getMime();
        image4.setMobileThumbPath("/photographer/upload");
        boolean b13 = image4.isEnabled();
        image4.setPrice((java.lang.Double) 1.0d);
        collection3.setThumbnail(image4);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage17 = collection3.getCollectionImages();
        de.htw.sdf.photoplatform.persistence.model.Collection collection18 = collectionDAOImpl0.update(collection3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test083");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.enablePhotographer((long) 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test084");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        image1.setPrice((java.lang.Double) 1.0d);
        java.lang.String str6 = image1.getDescription();
        java.lang.String str7 = image1.getMime();
        image1.setMobileThumbPath("/photographer/upload");
        boolean b10 = image1.isEnabled();
        image1.setPrice((java.lang.Double) 1.0d);
        image1.setPath("");
        imageManagerImpl0.delete(image1);
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test087");
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
        de.htw.sdf.photoplatform.persistence.model.Image image26 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str27 = image26.toString();
        java.lang.String str28 = image26.getName();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData29 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData30 = collectionData29.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData31 = collectionData29.getThumbnail();
        java.lang.Long[] long_array33 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long34 = new java.util.ArrayList<java.lang.Long>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long34, long_array33);
        collectionData29.setImageIds((java.util.List<java.lang.Long>) arraylist_long34);
        collectionData29.setId((long) (short) -1);
        java.lang.Long[] long_array40 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long41 = new java.util.ArrayList<java.lang.Long>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long41, long_array40);
        collectionData29.setImageIds((java.util.List<java.lang.Long>) arraylist_long41);
        boolean b44 = image26.equals((java.lang.Object) arraylist_long41);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long41);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on image26 and image10.", image26.equals(image10) == image10.equals(image26));
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test108");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isAdmin();
        java.lang.String str7 = user5.getSecToken();
        boolean b8 = user5.isAccountNonLocked();
        boolean b9 = user5.isPhotographer();
        de.htw.sdf.photoplatform.persistence.model.Image image10 = imageManagerImpl0.update((java.lang.Long) (-1L), "null:1528137265168:246d1b80c2f43651d8cc26e44925e89a", (java.lang.Double) 10.0d, "hi!", user5);
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
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test118");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
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
        collectionDAOImpl0.delete(collection1);
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
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test122");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.persistence.model.User user2 = authenticationController0.userByName("/index.html");
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
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test133");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        image1.setMobileThumbPath("");
        image1.setPrice((java.lang.Double) 100.0d);
        boolean b7 = image1.isEnabled();
        de.htw.sdf.photoplatform.persistence.model.User user8 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b9 = user8.isAdmin();
        java.lang.String str10 = user8.getSecToken();
        boolean b11 = user8.isAccountNonLocked();
        boolean b12 = user8.isCredentialsNonExpired();
        boolean b13 = user8.isCredentialsNonExpired();
        java.lang.String str14 = user8.getPassword();
        boolean b15 = user8.isEnabled();
        java.lang.String str16 = user8.getPassword();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage17 = imageManagerImpl0.addOwnerToImage(image1, user8);
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
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test135");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str3 = image2.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image2);
        imageData4.setMobilePath("/users/update");
        java.lang.Long long7 = imageData4.getCode();
        imageData4.setName("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData10 = imageData4.getUserData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData11 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData11.setSwift("/photographer/images");
        imageData4.setUserData(userData11);
        collectionData0.setUserdata(userData11);
        de.htw.sdf.photoplatform.persistence.model.Image image16 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str17 = image16.toString();
        java.lang.String str18 = image16.getName();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData19 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData20 = collectionData19.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData21 = collectionData19.getThumbnail();
        java.lang.Long[] long_array23 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long24 = new java.util.ArrayList<java.lang.Long>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long24, long_array23);
        collectionData19.setImageIds((java.util.List<java.lang.Long>) arraylist_long24);
        collectionData19.setId((long) (short) -1);
        java.lang.Long[] long_array30 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long31 = new java.util.ArrayList<java.lang.Long>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long31, long_array30);
        collectionData19.setImageIds((java.util.List<java.lang.Long>) arraylist_long31);
        boolean b34 = image16.equals((java.lang.Object) arraylist_long31);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long31);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on image2 and image16.", image2.equals(image16) == image16.equals(image2));
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
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test140");
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
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage14 = collection13.getCollectionImages();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData16 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection13, false);
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
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test145");
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
        javax.servlet.http.HttpServletRequest httpServletRequest42 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse43 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException45 = new de.htw.sdf.photoplatform.exception.NotFoundException("ROLE_BECOME_PHOTOGRAPHER");
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException47 = new de.htw.sdf.photoplatform.exception.NotFoundException("/collections/{collectionId}");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest42, httpServletResponse43, (java.lang.Object) "ROLE_BECOME_PHOTOGRAPHER", (java.lang.Exception) notFoundException47);
        javax.servlet.http.HttpServletRequest httpServletRequest49 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse50 = null;
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData51 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData52 = collectionData51.getThumbnail();
        collectionData51.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b55 = collectionData51.getPublic();
        de.htw.sdf.photoplatform.persistence.model.User user56 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b57 = user56.isAdmin();
        java.lang.String str58 = user56.getSecToken();
        boolean b59 = user56.isAccountNonLocked();
        boolean b60 = user56.isCredentialsNonExpired();
        java.lang.String str61 = user56.getLastName();
        java.lang.String str62 = user56.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole63 = user56.getUserRoles();
        de.htw.sdf.photoplatform.persistence.model.Collection collection64 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData51, user56);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage65 = collection64.getCollectionImages();
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException67 = new de.htw.sdf.photoplatform.exception.NotFoundException("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest49, httpServletResponse50, (java.lang.Object) collection64, (java.lang.Exception) notFoundException67);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on user56 and user27.", user56.equals(user27) == user27.equals(user56));
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
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test162");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str4 = image3.toString();
        java.lang.String str5 = image3.getName();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData6 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = collectionData6.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = collectionData6.getThumbnail();
        java.lang.Long[] long_array10 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long11 = new java.util.ArrayList<java.lang.Long>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long11, long_array10);
        collectionData6.setImageIds((java.util.List<java.lang.Long>) arraylist_long11);
        collectionData6.setId((long) (short) -1);
        java.lang.Long[] long_array17 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long18 = new java.util.ArrayList<java.lang.Long>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long18, long_array17);
        collectionData6.setImageIds((java.util.List<java.lang.Long>) arraylist_long18);
        boolean b21 = image3.equals((java.lang.Object) arraylist_long18);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionImage> list_collectionImage22 = photographerManagerImpl0.addImagesToCollection((java.lang.Long) 1L, (java.lang.Long) 100L, (java.util.List<java.lang.Long>) arraylist_long18);
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
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test189");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = collectionData3.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = collectionData3.getThumbnail();
        java.lang.Long[] long_array7 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long8, long_array7);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long8);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionImage> list_collectionImage11 = photographerManagerImpl0.addImagesToCollection((java.lang.Long) 1L, (java.lang.Long) (-1L), (java.util.List<java.lang.Long>) arraylist_long8);
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
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test194");
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
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData15 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData(collection0);
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test197");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = collectionData3.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = collectionData3.getThumbnail();
        java.lang.Long[] long_array7 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long8, long_array7);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long8);
        collectionData3.setId((long) (short) -1);
        java.lang.Long[] long_array14 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long15 = new java.util.ArrayList<java.lang.Long>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long15, long_array14);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long15);
        java.lang.Boolean b18 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 0L, (java.lang.Long) 10L, (java.util.List<java.lang.Long>) arraylist_long15);
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
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test201");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str3 = image2.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image2);
        imageData4.setMobilePath("/users/update");
        java.lang.Long long7 = imageData4.getCode();
        imageData4.setName("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData10 = imageData4.getUserData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData11 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData11.setSwift("/photographer/images");
        imageData4.setUserData(userData11);
        collectionData0.setUserdata(userData11);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData16 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData17 = collectionData16.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData18 = null;
        collectionData16.setUserdata(userData18);
        java.lang.String str20 = collectionData16.getName();
        long long21 = collectionData16.getId();
        de.htw.sdf.photoplatform.persistence.model.Image image22 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str23 = image22.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData24 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image22);
        imageData24.setMetadata("/photographer/upload");
        imageData24.setMime("/showcase");
        imageData24.setMessageSuccess("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        collectionData16.setThumbnail(imageData24);
        collectionData0.setThumbnail(imageData24);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on image2 and image22.", image2.equals(image22) == image22.equals(image2));
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
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test206");
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
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData19 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData20 = collectionData19.getThumbnail();
        collectionData19.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b23 = collectionData19.getPublic();
        de.htw.sdf.photoplatform.persistence.model.User user24 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b25 = user24.isAdmin();
        java.lang.String str26 = user24.getSecToken();
        boolean b27 = user24.isAccountNonLocked();
        boolean b28 = user24.isCredentialsNonExpired();
        java.lang.String str29 = user24.getLastName();
        java.lang.String str30 = user24.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole31 = user24.getUserRoles();
        de.htw.sdf.photoplatform.persistence.model.Collection collection32 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData19, user24);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory33 = collection32.getCollectionCategories();
        java.lang.String str34 = collection32.getName();
        collectionImage0.setCollection(collection32);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on collection14, collection32, and collectionCategory9.", !(collection14.equals(collection32) && collection32.equals(collectionCategory9)) || collection14.equals(collectionCategory9));
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
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test215");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData4 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = collectionData4.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = collectionData4.getThumbnail();
        java.lang.Long[] long_array8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long9 = new java.util.ArrayList<java.lang.Long>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long9, long_array8);
        collectionData4.setImageIds((java.util.List<java.lang.Long>) arraylist_long9);
        collectionData4.setId((long) (short) -1);
        java.lang.Long[] long_array15 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long16, long_array15);
        collectionData4.setImageIds((java.util.List<java.lang.Long>) arraylist_long16);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage19 = userImageDAOImpl0.getOwnerImages((long) (short) 1, (java.util.List<java.lang.Long>) arraylist_long16);
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
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test226");
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
        java.lang.String str15 = collection0.toString();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory16 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection17 = null;
        collectionCategory16.setCollection(collection17);
        de.htw.sdf.photoplatform.persistence.model.Collection collection19 = null;
        collectionCategory16.setCollection(collection19);
        de.htw.sdf.photoplatform.persistence.model.Category category21 = collectionCategory16.getCategory();
        java.util.Date date22 = collectionCategory16.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory[] collectionCategory_array23 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory[] { collectionCategory16 };
        java.util.LinkedHashSet<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> linkedhashset_collectionCategory24 = new java.util.LinkedHashSet<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>) linkedhashset_collectionCategory24, collectionCategory_array23);
        collection0.setCollectionCategories((java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>) linkedhashset_collectionCategory24);
        de.htw.sdf.photoplatform.persistence.model.User user27 = collection0.getUser();
        de.htw.sdf.photoplatform.persistence.model.Image image28 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str29 = image28.getMime();
        java.lang.String str30 = image28.getUpdatedBy();
        java.lang.String str31 = image28.getSmallThumbPath();
        java.lang.String str32 = image28.getUpdatedBy();
        java.lang.String str33 = image28.toString();
        collection0.setThumbnail(image28);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on image28, image1, and collectionCategory_array23.", !(image28.equals(image1) && image1.equals(collectionCategory_array23)) || image28.equals(collectionCategory_array23));
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
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test238");
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
        boolean b15 = collection0.isPublic();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage16 = collection0.getCollectionImages();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData18 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection0, false);
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
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test250");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str3 = image2.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image2);
        imageData4.setMobilePath("/users/update");
        java.lang.Long long7 = imageData4.getCode();
        imageData4.setName("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData10 = imageData4.getUserData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData11 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData11.setSwift("/photographer/images");
        imageData4.setUserData(userData11);
        collectionData0.setUserdata(userData11);
        java.lang.String str16 = collectionData0.getName();
        de.htw.sdf.photoplatform.persistence.model.Image image17 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image17.setCreatedBy("");
        image17.setPrice((java.lang.Double) 1.0d);
        java.lang.String str22 = image17.getDescription();
        java.lang.String str23 = image17.getMime();
        boolean b24 = image17.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData25 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image17);
        imageData25.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str28 = imageData25.getMobilePath();
        imageData25.setName("Category{name='null'}");
        collectionData0.setThumbnail(imageData25);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on image2 and image17.", image2.equals(image17) == image17.equals(image2));
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
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test253");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        image1.setPrice((java.lang.Double) 1.0d);
        java.lang.String str6 = image1.getDescription();
        java.lang.String str7 = image1.getMime();
        image1.setMobileThumbPath("/photographer/upload");
        boolean b10 = image1.isEnabled();
        image1.setPrice((java.lang.Double) 1.0d);
        image1.setPath("");
        de.htw.sdf.photoplatform.persistence.model.Image image15 = imageManagerImpl0.update(image1);
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
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test257");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image4.setCreatedBy("");
        image4.setPrice((java.lang.Double) 1.0d);
        java.lang.String str9 = image4.getDescription();
        java.lang.String str10 = image4.getMime();
        image4.setMobileThumbPath("/photographer/upload");
        boolean b13 = image4.isEnabled();
        image4.setPrice((java.lang.Double) 1.0d);
        collection3.setThumbnail(image4);
        java.lang.String str17 = collection3.getDescription();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage18 = collection3.getCollectionImages();
        de.htw.sdf.photoplatform.persistence.model.Collection collection19 = collectionDAOImpl0.update(collection3);
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
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test263");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = collectionData3.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = collectionData3.getThumbnail();
        java.lang.Long[] long_array7 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long8, long_array7);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long8);
        java.lang.Boolean b11 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 1L, (java.lang.Long) 100L, (java.util.List<java.lang.Long>) arraylist_long8);
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
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test269");
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
        java.lang.String str16 = collection0.toString();
        de.htw.sdf.photoplatform.persistence.model.User user17 = collection0.getUser();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData18 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData(collection0);
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
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test280");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        image0.setDescription("/collections/{collectionId}/images/{imageId}");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor6 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException11 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor6.afterCompletion(httpServletRequest7, httpServletResponse8, (java.lang.Object) 10, (java.lang.Exception) notFoundException11);
        javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse14 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image15 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str16 = image15.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData17 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image15);
        imageData17.setName("");
        java.lang.Double d20 = imageData17.getPrice();
        imageData17.setName("/user/enablephotographer");
        org.springframework.web.servlet.ModelAndView modelAndView23 = null;
        requestLoggerInterceptor6.postHandle(httpServletRequest13, httpServletResponse14, (java.lang.Object) "/user/enablephotographer", modelAndView23);
        javax.servlet.http.HttpServletRequest httpServletRequest25 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse26 = null;
        org.springframework.validation.Errors errors30 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError31 = new de.htw.sdf.photoplatform.exception.common.ResponseError((int) (byte) 1, (int) (byte) 0, "/users/admin/{start}/{count}", errors30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str32 = responseError31.getErrors();
        requestLoggerInterceptor6.afterConcurrentHandlingStarted(httpServletRequest25, httpServletResponse26, (java.lang.Object) map_str_list_str32);
        boolean b34 = image0.equals((java.lang.Object) map_str_list_str32);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on image0, image15, and imageData3.", !(image0.equals(image15) && image15.equals(imageData3)) || image0.equals(imageData3));
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
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test291");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user6 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b7 = user6.isPhotographer();
        userRole5.setUser(user6);
        java.lang.String str9 = user6.getSecToken();
        java.lang.String str10 = user6.getUsername();
        de.htw.sdf.photoplatform.persistence.model.Image image11 = imageManagerImpl0.update((java.lang.Long) 10L, "/api:1528137282451:b663d46b647142ba0b5f5a8d1cd8d8fe", (java.lang.Double) 0.0d, "/collections/{collectionId}/images", user6);
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
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test305");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData4 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = collectionData4.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = collectionData4.getThumbnail();
        java.lang.Long[] long_array8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long9 = new java.util.ArrayList<java.lang.Long>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long9, long_array8);
        collectionData4.setImageIds((java.util.List<java.lang.Long>) arraylist_long9);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage12 = userImageDAOImpl0.getOwnerImages((long) (short) 100, (java.util.List<java.lang.Long>) arraylist_long9);
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
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test313");
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
        de.htw.sdf.photoplatform.Application application21 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer22 = null;
        application21.configureContentNegotiation(contentNegotiationConfigurer22);
        org.springframework.web.servlet.config.annotation.ViewControllerRegistry viewControllerRegistry24 = null;
        application21.addViewControllers(viewControllerRegistry24);
        org.springframework.web.servlet.config.annotation.ViewControllerRegistry viewControllerRegistry26 = null;
        application21.addViewControllers(viewControllerRegistry26);
        org.springframework.web.servlet.LocaleResolver localeResolver28 = application21.localeResolver();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController29 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.controller.UserController userController30 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors32 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException33 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors32);
        int i34 = notFoundException33.getCode();
        org.springframework.web.context.request.WebRequest webRequest35 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError36 = userController30.handleNotFoundException(notFoundException33, webRequest35);
        org.springframework.web.context.request.WebRequest webRequest37 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError38 = photographerController29.handleNotFoundException(notFoundException33, webRequest37);
        de.htw.sdf.photoplatform.webservice.controller.UserController userController39 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors41 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException42 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors41);
        int i43 = notFoundException42.getCode();
        org.springframework.web.context.request.WebRequest webRequest44 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError45 = userController39.handleNotFoundException(notFoundException42, webRequest44);
        org.springframework.web.context.request.WebRequest webRequest46 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError47 = photographerController29.handleNotFoundException(notFoundException42, webRequest46);
        java.lang.String str48 = notFoundException42.toString();
        int i49 = notFoundException42.getCode();
        requestLoggerInterceptor0.afterCompletion(httpServletRequest19, httpServletResponse20, (java.lang.Object) application21, (java.lang.Exception) notFoundException42);
        javax.servlet.http.HttpServletRequest httpServletRequest51 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse52 = null;
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor53 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest54 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse55 = null;
        de.htw.sdf.photoplatform.Application application56 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer57 = null;
        application56.configureAsyncSupport(asyncSupportConfigurer57);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer59 = null;
        application56.configureAsyncSupport(asyncSupportConfigurer59);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array61 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver62 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver62, handlerExceptionResolver_array61);
        application56.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver62);
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor65 = application56.localeChangeInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest66 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse67 = null;
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange68 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        org.springframework.web.servlet.ModelAndView modelAndView69 = null;
        localeChangeInterceptor65.postHandle(httpServletRequest66, httpServletResponse67, (java.lang.Object) userPasswordChange68, modelAndView69);
        de.htw.sdf.photoplatform.exception.common.WebFormException webFormException72 = new de.htw.sdf.photoplatform.exception.common.WebFormException(11004);
        requestLoggerInterceptor53.afterCompletion(httpServletRequest54, httpServletResponse55, (java.lang.Object) localeChangeInterceptor65, (java.lang.Exception) webFormException72);
        javax.servlet.http.HttpServletRequest httpServletRequest74 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse75 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image76 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str77 = image76.toString();
        java.lang.String str78 = image76.getName();
        image76.setDescription("/photographer/upload");
        org.springframework.web.servlet.ModelAndView modelAndView81 = null;
        requestLoggerInterceptor53.postHandle(httpServletRequest74, httpServletResponse75, (java.lang.Object) image76, modelAndView81);
        java.lang.String str83 = image76.getCreatedBy();
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException85 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException(400);
        requestLoggerInterceptor0.afterCompletion(httpServletRequest51, httpServletResponse52, (java.lang.Object) image76, (java.lang.Exception) authorizationException85);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on image76, image9, and notFoundException33.", !(image76.equals(image9) && image9.equals(notFoundException33)) || image76.equals(notFoundException33));
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
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test325");
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
        de.htw.sdf.photoplatform.persistence.model.Collection collection14 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.Image image15 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image15.setCreatedBy("");
        image15.setPrice((java.lang.Double) 1.0d);
        java.lang.String str20 = image15.getDescription();
        java.lang.String str21 = image15.getMime();
        image15.setMobileThumbPath("/photographer/upload");
        boolean b24 = image15.isEnabled();
        image15.setPrice((java.lang.Double) 1.0d);
        collection14.setThumbnail(image15);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage28 = collection14.getCollectionImages();
        java.lang.String str29 = collection14.toString();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory30 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection31 = null;
        collectionCategory30.setCollection(collection31);
        de.htw.sdf.photoplatform.persistence.model.Collection collection33 = null;
        collectionCategory30.setCollection(collection33);
        de.htw.sdf.photoplatform.persistence.model.Category category35 = collectionCategory30.getCategory();
        java.util.Date date36 = collectionCategory30.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory[] collectionCategory_array37 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory[] { collectionCategory30 };
        java.util.LinkedHashSet<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> linkedhashset_collectionCategory38 = new java.util.LinkedHashSet<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>) linkedhashset_collectionCategory38, collectionCategory_array37);
        collection14.setCollectionCategories((java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>) linkedhashset_collectionCategory38);
        collection0.setCollectionCategories((java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>) linkedhashset_collectionCategory38);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on collection0, collection14, and collection14.", !(collection0.equals(collection14) && collection14.equals(collection14)) || collection0.equals(collection14));
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
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test330");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.toString();
        java.lang.String str3 = image1.getName();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData4 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = collectionData4.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = collectionData4.getThumbnail();
        java.lang.Long[] long_array8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long9 = new java.util.ArrayList<java.lang.Long>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long9, long_array8);
        collectionData4.setImageIds((java.util.List<java.lang.Long>) arraylist_long9);
        collectionData4.setId((long) (short) -1);
        java.lang.Long[] long_array15 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long16, long_array15);
        collectionData4.setImageIds((java.util.List<java.lang.Long>) arraylist_long16);
        boolean b19 = image1.equals((java.lang.Object) arraylist_long16);
        imageManagerImpl0.create(image1);
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
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test333");
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
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = collectionCategory0.getCollection();
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
        collectionCategory0.setCollection(collection34);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on collection7, collection34, and b25.", !(collection7.equals(collection34) && collection34.equals(b25)) || collection7.equals(b25));
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
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test345");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = collectionData3.getUserdata();
        collectionData3.setPublic((java.lang.Boolean) true);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData7 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = collectionData7.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData9 = collectionData7.getThumbnail();
        java.lang.Long[] long_array11 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long12, long_array11);
        collectionData7.setImageIds((java.util.List<java.lang.Long>) arraylist_long12);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long12);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionImage> list_collectionImage16 = photographerManagerImpl0.addImagesToCollection((java.lang.Long) 10L, (java.lang.Long) 10L, (java.util.List<java.lang.Long>) arraylist_long12);
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
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test350");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole0.setRole(role2);
        de.htw.sdf.photoplatform.persistence.model.User user4 = userRole0.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user5 = userRole0.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user6 = userRole0.getUser();
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor7 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse9 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException12 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor7.afterCompletion(httpServletRequest8, httpServletResponse9, (java.lang.Object) 10, (java.lang.Exception) notFoundException12);
        javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image16 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str17 = image16.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData18 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image16);
        imageData18.setName("");
        java.lang.Double d21 = imageData18.getPrice();
        imageData18.setName("/user/enablephotographer");
        org.springframework.web.servlet.ModelAndView modelAndView24 = null;
        requestLoggerInterceptor7.postHandle(httpServletRequest14, httpServletResponse15, (java.lang.Object) "/user/enablephotographer", modelAndView24);
        javax.servlet.http.HttpServletRequest httpServletRequest26 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse27 = null;
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole28 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role29 = userRole28.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role30 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole28.setRole(role30);
        de.htw.sdf.photoplatform.persistence.model.User user32 = userRole28.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user33 = userRole28.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user34 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b35 = user34.isAdmin();
        java.lang.String str36 = user34.getSecToken();
        userRole28.setUser(user34);
        de.htw.sdf.photoplatform.persistence.model.Role role38 = userRole28.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role39 = userRole28.getRole();
        org.springframework.validation.Errors errors41 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException42 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors41);
        org.springframework.validation.Errors errors44 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException45 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors44);
        int i46 = notFoundException45.getCode();
        notFoundException42.addSuppressed((java.lang.Throwable) notFoundException45);
        requestLoggerInterceptor7.afterCompletion(httpServletRequest26, httpServletResponse27, (java.lang.Object) userRole28, (java.lang.Exception) notFoundException45);
        de.htw.sdf.photoplatform.persistence.model.User user49 = userRole28.getUser();
        user49.setFirstName("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        userRole0.setUser(user49);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on role2 and role39.", role2.equals(role39) == role39.equals(role2));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test351");
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
        de.htw.sdf.photoplatform.persistence.model.Image image19 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image19.setCreatedBy("");
        image19.setPrice((java.lang.Double) 1.0d);
        java.lang.String str24 = image19.getThumbPath();
        collection14.setThumbnail(image19);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on image19, image1, and image1.", !(image19.equals(image1) && image1.equals(image1)) || image19.equals(image1));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test352");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.find((java.lang.Integer) 10000, (java.lang.Integer) 1);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test353");
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
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = collectionCategory0.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Collection collection11 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.Image image12 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image12.setCreatedBy("");
        image12.setPrice((java.lang.Double) 1.0d);
        java.lang.String str17 = image12.getDescription();
        java.lang.String str18 = image12.getMime();
        image12.setMobileThumbPath("/photographer/upload");
        boolean b21 = image12.isEnabled();
        image12.setPrice((java.lang.Double) 1.0d);
        collection11.setThumbnail(image12);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage25 = collection11.getCollectionImages();
        java.lang.String str26 = collection11.toString();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory27 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection28 = null;
        collectionCategory27.setCollection(collection28);
        de.htw.sdf.photoplatform.persistence.model.Collection collection30 = null;
        collectionCategory27.setCollection(collection30);
        de.htw.sdf.photoplatform.persistence.model.Category category32 = collectionCategory27.getCategory();
        java.util.Date date33 = collectionCategory27.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory[] collectionCategory_array34 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory[] { collectionCategory27 };
        java.util.LinkedHashSet<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> linkedhashset_collectionCategory35 = new java.util.LinkedHashSet<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>) linkedhashset_collectionCategory35, collectionCategory_array34);
        collection11.setCollectionCategories((java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>) linkedhashset_collectionCategory35);
        collection10.setCollectionCategories((java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>) linkedhashset_collectionCategory35);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collectionCategory0 and collectionCategory27.", collectionCategory0.equals(collectionCategory27) == collectionCategory27.equals(collectionCategory0));
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
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test359");
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
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor19 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest20 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse21 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException24 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor19.afterCompletion(httpServletRequest20, httpServletResponse21, (java.lang.Object) 10, (java.lang.Exception) notFoundException24);
        javax.servlet.http.HttpServletRequest httpServletRequest26 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse27 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage28 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        requestLoggerInterceptor19.postHandle(httpServletRequest26, httpServletResponse27, (java.lang.Object) userImage28, modelAndView29);
        java.util.Date date31 = userImage28.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Image image32 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image32.setCreatedBy("");
        image32.setPrice((java.lang.Double) 1.0d);
        java.lang.String str37 = image32.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData38 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image32);
        userImage28.setImage(image32);
        image32.setId((java.lang.Long) 0L);
        collectionImage0.setImage(image32);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on image1, image32, and notFoundException24.", !(image1.equals(image32) && image32.equals(notFoundException24)) || image1.equals(notFoundException24));
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
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test365");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = null;
        collectionImage0.setCollection(collection6);
        de.htw.sdf.photoplatform.persistence.model.Collection collection8 = collectionImage0.getCollection();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory9 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = null;
        collectionCategory9.setCollection(collection10);
        de.htw.sdf.photoplatform.persistence.model.Collection collection12 = null;
        collectionCategory9.setCollection(collection12);
        de.htw.sdf.photoplatform.persistence.model.Category category14 = collectionCategory9.getCategory();
        java.util.Date date15 = collectionCategory9.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection16 = collectionCategory9.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Category category17 = collectionCategory9.getCategory();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData18 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData19 = collectionData18.getThumbnail();
        collectionData18.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b22 = collectionData18.getPublic();
        de.htw.sdf.photoplatform.persistence.model.User user23 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b24 = user23.isAdmin();
        java.lang.String str25 = user23.getSecToken();
        boolean b26 = user23.isAccountNonLocked();
        boolean b27 = user23.isCredentialsNonExpired();
        java.lang.String str28 = user23.getLastName();
        java.lang.String str29 = user23.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole30 = user23.getUserRoles();
        de.htw.sdf.photoplatform.persistence.model.Collection collection31 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData18, user23);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage32 = collection31.getCollectionImages();
        java.lang.String str33 = collection31.toString();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage34 = collection31.getCollectionImages();
        de.htw.sdf.photoplatform.persistence.model.Image image35 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.Double d36 = image35.getPrice();
        image35.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str39 = image35.getUpdatedBy();
        collection31.setThumbnail(image35);
        collectionCategory9.setCollection(collection31);
        collectionImage0.setCollection(collection31);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on image35 and image5.", image35.equals(image5) == image5.equals(image35));
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
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test369");
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
        java.lang.String str31 = image30.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData32 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image30);
        imageData32.setMobilePath("/users/update");
        java.lang.Long long35 = imageData32.getCode();
        org.springframework.web.servlet.ModelAndView modelAndView36 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest28, httpServletResponse29, (java.lang.Object) imageData32, modelAndView36);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on image9 and image30.", image9.equals(image30) == image30.equals(image9));
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
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test372");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = collectionData3.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = collectionData3.getThumbnail();
        java.lang.Long[] long_array7 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long8, long_array7);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long8);
        collectionData3.setId((long) (short) -1);
        java.lang.Long[] long_array14 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long15 = new java.util.ArrayList<java.lang.Long>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long15, long_array14);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long15);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage18 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 0L, (java.lang.Long) 1L, (java.util.List<java.lang.Long>) arraylist_long15);
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
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test380");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isAdmin();
        java.lang.String str7 = user5.getSecToken();
        boolean b8 = user5.isAccountNonLocked();
        boolean b9 = user5.isPhotographer();
        de.htw.sdf.photoplatform.persistence.model.Image image10 = imageManagerImpl0.update((java.lang.Long) (-1L), "cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e", (java.lang.Double) 100.0d, "9277920e18d95961691dfdc6e2623546", user5);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test381");
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
        java.lang.String str15 = collection1.getDescription();
        boolean b16 = collection1.isPublic();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage17 = collection1.getCollectionImages();
        de.htw.sdf.photoplatform.persistence.model.Collection collection18 = photographerManagerImpl0.update(collection1);
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
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test389");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.toString();
        java.lang.String str3 = image1.getName();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData4 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = collectionData4.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = collectionData4.getThumbnail();
        java.lang.Long[] long_array8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long9 = new java.util.ArrayList<java.lang.Long>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long9, long_array8);
        collectionData4.setImageIds((java.util.List<java.lang.Long>) arraylist_long9);
        collectionData4.setId((long) (short) -1);
        java.lang.Long[] long_array15 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long16, long_array15);
        collectionData4.setImageIds((java.util.List<java.lang.Long>) arraylist_long16);
        boolean b19 = image1.equals((java.lang.Object) arraylist_long16);
        de.htw.sdf.photoplatform.persistence.model.User user20 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b21 = user20.isBecomePhotographer();
        user20.setFirstName("/index.html");
        boolean b24 = user20.isAccountNonExpired();
        boolean b25 = user20.isPhotographer();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage26 = imageManagerImpl0.addOwnerToImage(image1, user20);
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
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test395");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array8 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long9 = new java.util.ArrayList<java.lang.Long>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long9, long_array8);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long9);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData12 = collectionData3.getImages();
        de.htw.sdf.photoplatform.persistence.model.Image image13 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str14 = image13.getMime();
        java.lang.String str15 = image13.getUpdatedBy();
        java.lang.String str16 = image13.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData17 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image13);
        java.lang.Long long18 = imageData17.getId();
        collectionData3.setThumbnail(imageData17);
        collectionData3.setPublic((java.lang.Boolean) true);
        collectionData3.setDescription("hi!");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData24 = collectionData3.getUserdata();
        java.lang.Long[] long_array26 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long27, long_array26);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long27);
        java.lang.Boolean b30 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.util.List<java.lang.Long>) arraylist_long27);
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
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test404");
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
        javax.servlet.http.HttpServletRequest httpServletRequest23 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse24 = null;
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange25 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange25.setNewPassword("/showcase");
        java.lang.String str28 = userPasswordChange25.getPassword();
        userPasswordChange25.setPasswordConfirm("/collections/showcase");
        requestLoggerInterceptor0.afterConcurrentHandlingStarted(httpServletRequest23, httpServletResponse24, (java.lang.Object) userPasswordChange25);
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse33 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image34 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str35 = image34.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData36 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image34);
        imageData36.setMobilePath("/users/update");
        java.lang.String str39 = imageData36.getMime();
        imageData36.setPrice((java.lang.Double) 1.0d);
        java.lang.String str42 = imageData36.getMobilePath();
        de.htw.sdf.photoplatform.exception.common.WebFormException webFormException44 = new de.htw.sdf.photoplatform.exception.common.WebFormException(10000);
        requestLoggerInterceptor0.afterCompletion(httpServletRequest32, httpServletResponse33, (java.lang.Object) imageData36, (java.lang.Exception) webFormException44);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on image10 and image34.", image10.equals(image34) == image34.equals(image10));
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
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test413");
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
        java.lang.String str15 = collection1.getDescription();
        photographerManagerImpl0.delete(collection1);
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
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test419");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData2 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = collectionData2.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = collectionData2.getThumbnail();
        java.lang.Long[] long_array6 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long7, long_array6);
        collectionData2.setImageIds((java.util.List<java.lang.Long>) arraylist_long7);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage10 = userImageDAOImpl0.getOwnerImages((long) (short) 1, (java.util.List<java.lang.Long>) arraylist_long7);
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
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test425");
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
        java.lang.String str15 = collection0.toString();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory16 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection17 = null;
        collectionCategory16.setCollection(collection17);
        de.htw.sdf.photoplatform.persistence.model.Collection collection19 = null;
        collectionCategory16.setCollection(collection19);
        de.htw.sdf.photoplatform.persistence.model.Category category21 = collectionCategory16.getCategory();
        java.util.Date date22 = collectionCategory16.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory[] collectionCategory_array23 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory[] { collectionCategory16 };
        java.util.LinkedHashSet<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> linkedhashset_collectionCategory24 = new java.util.LinkedHashSet<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>) linkedhashset_collectionCategory24, collectionCategory_array23);
        collection0.setCollectionCategories((java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory>) linkedhashset_collectionCategory24);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage27 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image28 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image28.setCreatedBy("");
        collectionImage27.setImage(image28);
        de.htw.sdf.photoplatform.persistence.model.Collection collection32 = collectionImage27.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Collection collection33 = null;
        collectionImage27.setCollection(collection33);
        de.htw.sdf.photoplatform.persistence.model.Image image35 = collectionImage27.getImage();
        collection0.setThumbnail(image35);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on image1 and image28.", image1.equals(image28) == image28.equals(image1));
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

