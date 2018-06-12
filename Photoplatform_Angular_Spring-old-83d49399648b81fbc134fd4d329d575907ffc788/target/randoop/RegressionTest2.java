import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getEmail();
        userData0.setCompany("/collections/{collectionId}/images");
        userData0.setIban("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        userData0.setBanned(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        java.lang.String str2 = photographerData0.getIban();
        java.lang.String str3 = photographerData0.getCompany();
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls3 = null;
        collectionCategoryDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory6 = collectionCategoryDAOImpl0.findOne((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
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
        user20.setUsername("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str18.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getEmail();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionCategoryDAOImpl0.getEntityManager();
        try {
            collectionCategoryDAOImpl0.deleteById((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setPasswordConfirm("/collections/{collectionId}/images");
        userRegister0.setPassword("");
        java.lang.String str5 = userRegister0.getPasswordConfirm();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "/collections/{collectionId}/images" + "'", str5.equals("/collections/{collectionId}/images"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = userImageDAOImpl0.getEntityManager();
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
        de.htw.sdf.photoplatform.persistence.model.User user18 = userImage14.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user19 = userImage14.getUser();
        try {
            userImageDAOImpl0.create(userImage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
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
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer13 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer13);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array15 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver16 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver16, handlerExceptionResolver_array15);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver16);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(localeResolver8);
        org.junit.Assert.assertNull(messageCodesResolver11);
        org.junit.Assert.assertNotNull(localeChangeInterceptor12);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userDAOImpl0.getEntityManager();
        try {
            userDAOImpl0.deleteById((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image4 = imageDAOImpl0.getPublicImages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        boolean b4 = user1.isAccountNonLocked();
        boolean b5 = user1.isCredentialsNonExpired();
        boolean b6 = user1.isCredentialsNonExpired();
        java.lang.String str7 = user1.getPassword();
        boolean b8 = user1.isEnabled();
        java.lang.String str9 = user1.getPassword();
        try {
            boolean b10 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_CUSTOMER", (org.springframework.security.core.userdetails.UserDetails) user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls5 = null;
        imageDAOImpl0.setClazz(cls5);
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image8 = imageDAOImpl0.findOne((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole0.setRole(role2);
        role2.setName("/collections/create");
        java.lang.String str6 = role2.getName();
        org.junit.Assert.assertNull(role1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "/collections/create" + "'", str6.equals("/collections/create"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls2 = null;
        userRoleDAOImpl0.setClazz(cls2);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole6 = userRoleDAOImpl0.findByUserAndRoleId((java.lang.Long) 1L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setSwift("/photographer/images");
        java.lang.Boolean b3 = userData0.isBanned();
        userData0.setBanned(false);
        org.junit.Assert.assertTrue("'" + b3 + "' != '" + false + "'", b3.equals(false));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls5 = null;
        imageDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.persistence.model.Image image7 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str8 = image7.getMime();
        java.lang.String str9 = image7.getUpdatedBy();
        java.lang.String str10 = image7.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData11 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image7);
        boolean b12 = image7.isEnabled();
        image7.setPath("ROLE_ADMIN");
        image7.setPrice((java.lang.Double) 10.0d);
        try {
            imageDAOImpl0.create(image7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
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
        de.htw.sdf.photoplatform.persistence.model.User user10 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b11 = user10.isAdmin();
        java.lang.String str12 = user10.getSecToken();
        boolean b13 = user10.isAccountNonLocked();
        boolean b14 = user10.isAccountNonLocked();
        java.lang.String str15 = user10.getUsername();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage16 = userImageDAOImpl0.getPhotographImages(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
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
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer11 = null;
        application10.configureDefaultServletHandling(defaultServletHandlerConfigurer11);
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array13 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver14 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver14, handlerMethodArgumentResolver_array13);
        application10.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver14);
        application0.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver14);
        de.htw.sdf.photoplatform.Application application18 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer19 = null;
        application18.configureAsyncSupport(asyncSupportConfigurer19);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer21 = null;
        application18.configureContentNegotiation(contentNegotiationConfigurer21);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory23 = application18.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry24 = null;
        application18.addResourceHandlers(resourceHandlerRegistry24);
        org.springframework.web.servlet.LocaleResolver localeResolver26 = application18.localeResolver();
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array27 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver28 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver28, handlerMethodArgumentResolver_array27);
        application18.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver28);
        de.htw.sdf.photoplatform.Application application31 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer32 = null;
        application31.configureContentNegotiation(contentNegotiationConfigurer32);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array34 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler35 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler35, handlerMethodReturnValueHandler_array34);
        application31.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler35);
        org.springframework.format.FormatterRegistry formatterRegistry38 = null;
        application31.addFormatters(formatterRegistry38);
        de.htw.sdf.photoplatform.Application application40 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer41 = null;
        application40.configureAsyncSupport(asyncSupportConfigurer41);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer43 = null;
        application40.configureAsyncSupport(asyncSupportConfigurer43);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array45 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver46 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver46, handlerExceptionResolver_array45);
        application40.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver46);
        application31.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver46);
        application18.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver46);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver46);
        javax.servlet.MultipartConfigElement multipartConfigElement52 = application0.multipartConfigElement();
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(localeResolver9);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory23);
        org.junit.Assert.assertNotNull(localeResolver26);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(multipartConfigElement52);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
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
        java.lang.String str16 = userData7.getPaypalID();
        org.springframework.validation.BindingResult bindingResult17 = null;
        try {
            userController0.updateUser(userData7, bindingResult17);
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData8.setPrice((java.lang.Double) (-1.0d));
        java.lang.Double d11 = imageData8.getPrice();
        java.lang.String str12 = imageData8.getName();
        java.lang.String str13 = imageData8.getMime();
        java.lang.String str14 = imageData8.getPath();
        imageData8.setPath("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_CUSTOMER");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + d11 + "' != '" + (-1.0d) + "'", d11.equals((-1.0d)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user10 = userDAOImpl0.find((java.lang.Integer) 400, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData2 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData3 = collectionData0.getUserdata();
        java.util.List<java.lang.Long> list_long4 = collectionData0.getImageIds();
        de.htw.sdf.photoplatform.persistence.model.User user5 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData0, user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(list_imageData2);
        org.junit.Assert.assertNull(userData3);
        org.junit.Assert.assertNull(list_long4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
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
        int i23 = responseError22.getCode();
        int i24 = responseError22.getStatus();
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
        org.junit.Assert.assertTrue(i16 == 10001);
        org.junit.Assert.assertNotNull(responseError19);
        org.junit.Assert.assertNotNull(throwable_array20);
        org.junit.Assert.assertNotNull(responseError22);
        org.junit.Assert.assertTrue(i23 == 10001);
        org.junit.Assert.assertTrue(i24 == 404);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        de.htw.sdf.photoplatform.exception.common.ManagerException managerException1 = new de.htw.sdf.photoplatform.exception.common.ManagerException((-1));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection6 = collectionDAOImpl0.findById((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
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
        boolean b25 = image17.isPublic();
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str22.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = userRoleDAOImpl0.findOne((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection7 = collectionDAOImpl0.findByUserAndCollectionId((long) 11004, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        try {
            collectionDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = roleDAOImpl0.getEntityManager();
        try {
            roleDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError(10002, 404, "ROLE_PHOTOGRAPHER", errors3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
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
        long long16 = collectionData0.getId();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(long16 == 0L);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        image0.setCreatedBy("ROLE_ADMIN");
        java.lang.String str7 = image0.getMetaData();
        java.lang.String str8 = image0.getUpdatedBy();
        java.lang.String str9 = image0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard4 = user0.getAuthorities();
        boolean b5 = user0.isAdmin();
        boolean b6 = user0.isEnabled();
        user0.setFirstName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(collection_wildcard4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData2 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData3 = collectionData0.getUserdata();
        java.util.List<java.lang.Long> list_long4 = collectionData0.getImageIds();
        java.lang.String str5 = collectionData0.getDescription();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(list_imageData2);
        org.junit.Assert.assertNull(userData3);
        org.junit.Assert.assertNull(list_long4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user8 = userDAOImpl0.findPhotographersToActivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            boolean b8 = userController0.enablePhotographer("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10000");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
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
        java.lang.String str19 = notFoundException13.toString();
        int i20 = notFoundException13.getCode();
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException22 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException(10000);
        java.lang.String str23 = authorizationException22.toString();
        org.springframework.validation.Errors errors24 = authorizationException22.getErrors();
        notFoundException13.addSuppressed((java.lang.Throwable) authorizationException22);
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i14 == 10001);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str19.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
        org.junit.Assert.assertTrue(i20 == 10001);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception" + "'", str23.equals("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception"));
        org.junit.Assert.assertNull(errors24);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls4 = null;
        userDAOImpl0.setClazz(cls4);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user8 = userDAOImpl0.find((java.lang.Integer) 1, (java.lang.Integer) 11004);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls5 = null;
        imageDAOImpl0.setClazz(cls5);
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image8 = imageDAOImpl0.findOne((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls3 = null;
        userImageDAOImpl0.setClazz(cls3);
        try {
            javax.persistence.Query query6 = userImageDAOImpl0.createQuery("null:1528137264754:37059375c02a8fd63e589326ff8446ea");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage6 = userImageDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
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
        java.util.Date date16 = userImage13.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.User user17 = new de.htw.sdf.photoplatform.persistence.model.User();
        user17.setEnabled(false);
        userImage13.setOwner(user17);
        java.lang.String str21 = user17.getPassword();
        java.lang.String str22 = user17.getUsername();
        user17.setLastName("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        boolean b26 = user17.isRoleIncluded("");
        try {
            userDAOImpl0.create(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user4 = collection3.getUser();
        java.lang.String str5 = collection3.getName();
        java.lang.String str6 = collection3.toString();
        try {
            collectionDAOImpl0.delete(collection3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Collection{user=null, name='null'}" + "'", str6.equals("Collection{user=null, name='null'}"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        image0.setMetaData("/photographer/images");
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNotNull(imageData3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
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
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData16 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array21 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long22 = new java.util.ArrayList<java.lang.Long>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long22, long_array21);
        collectionData16.setImageIds((java.util.List<java.lang.Long>) arraylist_long22);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData25 = collectionData16.getImages();
        de.htw.sdf.photoplatform.persistence.model.Image image26 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str27 = image26.getMime();
        java.lang.String str28 = image26.getUpdatedBy();
        java.lang.String str29 = image26.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData30 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image26);
        java.lang.Long long31 = imageData30.getId();
        collectionData16.setThumbnail(imageData30);
        collectionData16.setPublic((java.lang.Boolean) true);
        collectionData16.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        org.springframework.validation.BindingResult bindingResult37 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection38 = photographerController0.createCollection(collectionData16, bindingResult37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError12);
        org.junit.Assert.assertTrue(i13 == 10000);
        org.junit.Assert.assertNotNull(responseError15);
        org.junit.Assert.assertNotNull(long_array21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(list_imageData25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(long31);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity8 = null;
        xAuthTokenConfigurer7.init(httpSecurity8);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity10 = null;
        xAuthTokenConfigurer7.setBuilder(httpSecurity10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.User user7 = userDAOImpl0.findById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setId((java.lang.Long) 0L);
        java.lang.String str3 = userData0.getSecToken();
        java.lang.Long long4 = userData0.getId();
        userData0.setIban("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        java.lang.Boolean b7 = userData0.isEnabled();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
        org.junit.Assert.assertTrue("'" + b7 + "' != '" + false + "'", b7.equals(false));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setName("/photographer/upload");
        java.lang.String str3 = image0.toString();
        image0.setSmallThumbPath("ROLE_ADMIN");
        image0.setMetaData("ROLE_CUSTOMER");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
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
        photographerData0.setIban("/collections/create");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Role> list_role7 = roleDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setIban("obfuscate");
        java.lang.String str3 = becomePhotographer0.getSwift();
        becomePhotographer0.setHomepage("null:1528137277050:ea4b11766ecf85bf46d8a52721b360a9");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
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
        collectionData0.setName("/users/admin/{start}/{count}");
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNotNull(imageData15);
        org.junit.Assert.assertNull(userData16);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        imageData2.setMessageFailed("/showcase");
        imageData2.setId((java.lang.Long) (-1L));
        java.lang.String str9 = imageData2.getMetadata();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "/photographer/upload" + "'", str9.equals("/photographer/upload"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
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
        org.springframework.validation.Errors errors25 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException26 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors25);
        int i27 = notFoundException26.getCode();
        notFoundException19.addSuppressed((java.lang.Throwable) notFoundException26);
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError12);
        org.junit.Assert.assertTrue(i13 == 10000);
        org.junit.Assert.assertNotNull(responseError15);
        org.junit.Assert.assertNotNull(responseError21);
        org.junit.Assert.assertNotNull(responseError23);
        org.junit.Assert.assertTrue(i27 == 10001);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
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
        photographerData0.setPaypalID("/user/makeadmin/{id}");
        photographerData0.setPaypalID("Category{name='null'}");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
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
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData26 = photographerController0.getCollections(404, (int) (short) -1);
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        image0.setCreatedBy("/collections/showcase");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
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
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData28 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(set_collectionImage14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Collection{user=null, name='null'}" + "'", str15.equals("Collection{user=null, name='null'}"));
        org.junit.Assert.assertNull(category21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(collectionCategory_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(user27);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = collectionDAOImpl0.getEntityManager();
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage5 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setName("");
        imageData2.setThumbnailPath("4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
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
        photographerData0.setIban("/users/update");
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection16 = photographerData0.getCollections();
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(list_collection16);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls7 = null;
        userImageDAOImpl0.setClazz(cls7);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage10 = userImageDAOImpl0.findOne((long) 11002);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
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
        java.lang.String str15 = badRequestException12.toString();
        java.lang.Throwable throwable16 = null;
        try {
            badRequestException12.addSuppressed(throwable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertNotNull(responseError10);
        org.junit.Assert.assertNotNull(responseError14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER" + "'", str15.equals("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getSwift();
        becomePhotographer0.setCompany("/photographer/images");
        becomePhotographer0.setSwift("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10000");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/users/admin/{start}/{count}" + "'", str7.equals("/users/admin/{start}/{count}"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getName();
        image0.setMime("/users/profile/{userId}");
        image0.setMetaData("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001");
        java.lang.Double d11 = image0.getPrice();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + d11 + "' != '" + 1.0d + "'", d11.equals(1.0d));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData1 = collectionData0.getUserdata();
        java.util.List<java.lang.Long> list_long2 = collectionData0.getImageIds();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str4 = image3.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image3);
        imageData5.setMetadata("/photographer/upload");
        java.lang.String str8 = imageData5.getMessageFailed();
        java.lang.Long long9 = imageData5.getCode();
        imageData5.setMessageSuccess("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        collectionData0.setThumbnail(imageData5);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData13 = null;
        collectionData0.setThumbnail(imageData13);
        org.junit.Assert.assertNull(userData1);
        org.junit.Assert.assertNull(list_long2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = userController0.getUserProfileData("5b077a3001f6b54eed6802448a739229");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.Double d1 = image0.getPrice();
        java.lang.String str2 = image0.getName();
        image0.setChangeDate();
        org.junit.Assert.assertNull(d1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors1);
        org.springframework.validation.Errors errors3 = badRequestException2.getErrors();
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException5 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException(100);
        java.lang.Throwable[] throwable_array6 = authorizationException5.getSuppressed();
        badRequestException2.addSuppressed((java.lang.Throwable) authorizationException5);
        org.springframework.validation.Errors errors8 = badRequestException2.getErrors();
        org.junit.Assert.assertNull(errors3);
        org.junit.Assert.assertNotNull(throwable_array6);
        org.junit.Assert.assertNull(errors8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isBecomePhotographer();
        user1.setUsername("ROLE_BECOME_PHOTOGRAPHER");
        boolean b6 = user1.isRoleIncluded("/photographer/images");
        boolean b7 = user1.isAccountNonLocked();
        try {
            boolean b8 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("/collections/showcase", (org.springframework.security.core.userdetails.UserDetails) user1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls1 = null;
        categoryDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor3 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException8 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor3.afterCompletion(httpServletRequest4, httpServletResponse5, (java.lang.Object) 10, (java.lang.Exception) notFoundException8);
        javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse11 = null;
        de.htw.sdf.photoplatform.persistence.model.Category category12 = new de.htw.sdf.photoplatform.persistence.model.Category();
        java.lang.String str13 = category12.toString();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController14 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors16 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException17 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors16);
        org.springframework.validation.Errors errors18 = badRequestException17.getErrors();
        org.springframework.web.context.request.WebRequest webRequest19 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError20 = photographerController14.handleBadRequestException(badRequestException17, webRequest19);
        requestLoggerInterceptor3.afterCompletion(httpServletRequest10, httpServletResponse11, (java.lang.Object) category12, (java.lang.Exception) badRequestException17);
        try {
            categoryDAOImpl0.delete(category12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Category{name='null'}" + "'", str13.equals("Category{name='null'}"));
        org.junit.Assert.assertNull(errors18);
        org.junit.Assert.assertNotNull(responseError20);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
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
        try {
            de.htw.sdf.photoplatform.persistence.model.User user34 = authenticationController0.userByName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
        org.junit.Assert.assertTrue(i16 == 10001);
        org.junit.Assert.assertNotNull(responseError19);
        org.junit.Assert.assertNotNull(throwable_array20);
        org.junit.Assert.assertNotNull(responseError22);
        org.junit.Assert.assertTrue(i29 == 10001);
        org.junit.Assert.assertNotNull(responseError32);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
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
        java.lang.String str23 = userData15.getIban();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(imageData2);
        org.junit.Assert.assertNotNull(long_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(long_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(list_str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + b19 + "' != '" + false + "'", b19.equals(false));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
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
        image13.setCreatedBy("");
        image13.setPrice((java.lang.Double) 1.0d);
        java.lang.String str18 = image13.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData19 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image13);
        userImage9.setImage(image13);
        java.lang.String str21 = image13.getUpdatedBy();
        image13.setEnabled(false);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.lang.String str2 = collection0.getName();
        java.lang.String str3 = collection0.getDescription();
        boolean b4 = collection0.isPublic();
        de.htw.sdf.photoplatform.persistence.model.User user5 = collection0.getUser();
        org.junit.Assert.assertNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        java.lang.String str1 = userPasswordChange0.getNewPassword();
        userPasswordChange0.setPassword("/users/profile/{userId}");
        userPasswordChange0.setPasswordConfirm("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_CUSTOMER");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setName("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        image0.setPath("/collections/{collectionId}/images");
        java.lang.String str8 = image0.getThumbPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userRoleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager7 = userRoleDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole10 = userRoleDAOImpl0.findByUserAndRoleId((java.lang.Long) 10L, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
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
        userData0.setAdmin(true);
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
            System.out.format("%n%s%n", "RegressionTest2.test083");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user9 = userDAOImpl0.findByAccountLocked(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        java.lang.String str5 = imageData2.getMetadata();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData6 = imageData2.getUserData();
        imageData2.setDescription("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "/photographer/upload" + "'", str5.equals("/photographer/upload"));
        org.junit.Assert.assertNull(userData6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("/collections/create", errors1);
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController3 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController4 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors6 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException7 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors6);
        org.springframework.web.context.request.WebRequest webRequest8 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError9 = photographerController4.handleBadRequestException(badRequestException7, webRequest8);
        org.springframework.web.context.request.WebRequest webRequest10 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError11 = authenticationController3.handleBadRequestException(badRequestException7, webRequest10);
        notFoundException2.addSuppressed((java.lang.Throwable) badRequestException7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertNotNull(responseError11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData1 = collectionData0.getUserdata();
        java.util.List<java.lang.Long> list_long2 = collectionData0.getImageIds();
        collectionData0.setDescription("");
        java.util.List<java.lang.Long> list_long5 = collectionData0.getImageIds();
        java.lang.String str6 = collectionData0.getName();
        org.junit.Assert.assertNull(userData1);
        org.junit.Assert.assertNull(list_long2);
        org.junit.Assert.assertNull(list_long5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user6 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b7 = user6.isPhotographer();
        userRole5.setUser(user6);
        java.lang.String str9 = user6.getSecToken();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage12 = userImageDAOImpl0.getPhotographImages(user6, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
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
            java.lang.String str17 = photographerController0.deletePhotographersImage((java.lang.Long) 1L);
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
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
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
        java.lang.String str15 = userPasswordChange12.getPassword();
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(localeChangeInterceptor9);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionDAOImpl0.findById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
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
        photographerData0.setPaypalID("/photographer/images");
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
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls3 = null;
        collectionCategoryDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory5 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = null;
        collectionCategory5.setCollection(collection6);
        de.htw.sdf.photoplatform.persistence.model.Collection collection8 = null;
        collectionCategory5.setCollection(collection8);
        de.htw.sdf.photoplatform.persistence.model.Category category10 = collectionCategory5.getCategory();
        java.util.Date date11 = collectionCategory5.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection12 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user13 = collection12.getUser();
        collectionCategory5.setCollection(collection12);
        de.htw.sdf.photoplatform.persistence.model.Category category15 = collectionCategory5.getCategory();
        try {
            collectionCategoryDAOImpl0.create(collectionCategory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(category10);
        org.junit.Assert.assertNull(date11);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(category15);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array0 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection1 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1, collection_array0);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData3 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData4 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData5 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData8 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1, (java.lang.Boolean) false);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData9 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData10 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        org.junit.Assert.assertNotNull(collection_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_collectionData3);
        org.junit.Assert.assertNotNull(list_collectionData4);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData8);
        org.junit.Assert.assertNotNull(list_collectionData9);
        org.junit.Assert.assertNotNull(list_collectionData10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
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
            userImageDAOImpl0.deleteById((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
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
            java.lang.String str25 = photographerController0.deletePhotographersImage((java.lang.Long) 10L);
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
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        image1.setMobileThumbPath("");
        image1.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long7 = image1.getId();
        de.htw.sdf.photoplatform.persistence.model.User user8 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage9 = imageManagerImpl0.addOwnerToImage(image1, user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array3 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver4 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver4, handlerExceptionResolver_array3);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver4);
        org.springframework.validation.MessageCodesResolver messageCodesResolver7 = application0.getMessageCodesResolver();
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(messageCodesResolver7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = userController0.getUserProfileData("Collection{user=de.htw.sdf.photoplatform.persistence.model.User [ID=null], name='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionImageDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionImage> list_collectionImage6 = collectionImageDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        java.lang.String str3 = becomePhotographer0.getSwift();
        java.lang.String str4 = becomePhotographer0.getCompany();
        becomePhotographer0.setHomepage("Category{name='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.validation.Errors errors4 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException5 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors4);
        requestLoggerInterceptor0.afterConcurrentHandlingStarted(httpServletRequest1, httpServletResponse2, (java.lang.Object) badRequestException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage9 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image10 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image10.setCreatedBy("");
        collectionImage9.setImage(image10);
        de.htw.sdf.photoplatform.persistence.model.Image image14 = collectionImage9.getImage();
        java.util.Date date15 = collectionImage9.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection16 = null;
        collectionImage9.setCollection(collection16);
        de.htw.sdf.photoplatform.persistence.model.Image image18 = collectionImage9.getImage();
        try {
            boolean b19 = requestLoggerInterceptor0.preHandle(httpServletRequest7, httpServletResponse8, (java.lang.Object) collectionImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(image14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(image18);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        de.htw.sdf.photoplatform.manager.impl.HashManagerImpl hashManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.HashManagerImpl();
        java.lang.String str2 = hashManagerImpl0.hash("/user/becomePhotographer");
        java.lang.String str4 = hashManagerImpl0.hash("null:1528137263387:737fa038c16b05aadddbb7d717b9f93f");
        try {
            java.lang.String str7 = hashManagerImpl0.hash("/user/login", "/user/makeadmin/{id}");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c" + "'", str2.equals("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "abe34aa080ac4421665a72329e218ae76e6eae82d181635ba4a5f8548e70866084fd9cd5c793d5b3a4165763081b95813d4bdb3d679b27d667fea0502caa5a9b" + "'", str4.equals("abe34aa080ac4421665a72329e218ae76e6eae82d181635ba4a5f8548e70866084fd9cd5c793d5b3a4165763081b95813d4bdb3d679b27d667fea0502caa5a9b"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls2 = null;
        userRoleDAOImpl0.setClazz(cls2);
        try {
            javax.persistence.Query query5 = userRoleDAOImpl0.createQuery("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        image0.setPublic(true);
        image0.setCreationDate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
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
        imageData15.setMessageFailed("ROLE_BECOME_PHOTOGRAPHER");
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNotNull(imageData15);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = collectionImageDAOImpl0.getEntityManager();
        try {
            collectionImageDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        de.htw.sdf.photoplatform.persistence.model.Role role0 = new de.htw.sdf.photoplatform.persistence.model.Role();
        java.lang.String str1 = role0.getName();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister1 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister1.setLastName("/collections/addimage");
        userRegister1.setPasswordConfirm("/collections/{collectionId}");
        org.springframework.validation.BindingResult bindingResult6 = null;
        try {
            authenticationController0.register(userRegister1, bindingResult6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getSwift();
        java.lang.String str8 = becomePhotographer0.getIban();
        java.lang.String str9 = becomePhotographer0.getSwift();
        java.lang.String str10 = becomePhotographer0.getPhone();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/users/admin/{start}/{count}" + "'", str7.equals("/users/admin/{start}/{count}"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "/users/admin/{start}/{count}" + "'", str9.equals("/users/admin/{start}/{count}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/user/makeadmin/{id}" + "'", str10.equals("/user/makeadmin/{id}"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData8.setPath("de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = collectionDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionDAOImpl0.findOne((long) 10000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        boolean b4 = user0.isAccountNonLocked();
        java.lang.String str5 = user0.getUsername();
        user0.setAccountNonLocked(true);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls4 = null;
        collectionCategoryDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory6 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Category category7 = null;
        collectionCategory6.setCategory(category7);
        de.htw.sdf.photoplatform.persistence.model.Collection collection9 = collectionCategory6.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Category category10 = collectionCategory6.getCategory();
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory11 = collectionCategoryDAOImpl0.update(collectionCategory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(category10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
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
        collectionData0.setPublic((java.lang.Boolean) true);
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(imageData2);
        org.junit.Assert.assertNotNull(long_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(long_array11);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getSmallThumbPath();
        java.lang.String str3 = image0.toString();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData4.setDescription("/users/update");
        imageData4.setDescription("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.lang.Long long9 = imageData4.getCode();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData10 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str11 = userData10.getLastName();
        java.util.List<java.lang.String> list_str12 = userData10.getRoles();
        java.lang.String str13 = userData10.getEmail();
        userData10.setCompany("/collections/{collectionId}/images");
        java.lang.Long long16 = userData10.getId();
        imageData4.setUserData(userData10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(list_str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(long16);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        user0.setAccountNonLocked(true);
        boolean b7 = user0.isEnabled();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard8 = user0.getAuthorities();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(collection_wildcard8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        java.lang.String str3 = userData0.getPaypalID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER");
        org.springframework.web.context.request.WebRequest webRequest3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = photographerController0.handleBadRequestException(badRequestException2, webRequest3);
        try {
            java.lang.String str7 = photographerController0.deleteImageFromCollection((java.lang.Long) 0L, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str7 = image0.getUpdatedBy();
        java.lang.String str8 = image0.getCreatedBy();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.unlockUser("null:1528137264754:37059375c02a8fd63e589326ff8446ea");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls7 = null;
        userImageDAOImpl0.setClazz(cls7);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage9 = userImageDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        userData0.setHomepage("");
        userData0.setEnabled(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long6 = new java.util.ArrayList<java.lang.Long>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long6, long_array5);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long6);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData9 = collectionData0.getImages();
        java.lang.String str10 = collectionData0.getDescription();
        collectionData0.setDescription("obfuscate");
        java.lang.String str13 = collectionData0.getDescription();
        org.junit.Assert.assertNotNull(long_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(list_imageData9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "obfuscate" + "'", str13.equals("obfuscate"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls3 = null;
        userRoleDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role6 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role6.setName("ROLE_CUSTOMER");
        userRole5.setRole(role6);
        try {
            userRoleDAOImpl0.create(userRole5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        de.htw.sdf.photoplatform.exception.common.ManagerException managerException1 = new de.htw.sdf.photoplatform.exception.common.ManagerException(11002);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        boolean b2 = collection0.isPublic();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str4 = image3.getMime();
        java.lang.String str5 = image3.getUpdatedBy();
        java.lang.String str6 = image3.getSmallThumbPath();
        java.lang.String str7 = image3.getUpdatedBy();
        image3.setCreatedBy("ROLE_ADMIN");
        java.lang.String str10 = image3.toString();
        image3.setId((java.lang.Long) 1L);
        collection0.setThumbnail(image3);
        org.junit.Assert.assertNull(user1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str10.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        java.lang.String str5 = userData0.getHomepage();
        java.lang.Boolean b6 = userData0.isBanned();
        userData0.setSwift("obfuscate");
        userData0.setLastName("/collections/addimage");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getSmallThumbPath();
        java.lang.String str3 = image0.toString();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData4.setId((java.lang.Long) 100L);
        imageData4.setId((java.lang.Long) 10L);
        imageData4.setCode((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
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
        java.lang.String str23 = collectionData0.getDescription();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(imageData2);
        org.junit.Assert.assertNotNull(long_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(long_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(list_str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + b19 + "' != '" + false + "'", b19.equals(false));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory1 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = null;
        collectionCategory1.setCollection(collection2);
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = null;
        collectionCategory1.setCollection(collection4);
        de.htw.sdf.photoplatform.persistence.model.Category category6 = collectionCategory1.getCategory();
        java.util.Date date7 = collectionCategory1.getUpdatedAt();
        try {
            collectionCategoryDAOImpl0.delete(collectionCategory1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(category6);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
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
        photographerData0.setCompany("/collections/{collectionId}/images");
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
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setName("");
        imageData2.setPrice((java.lang.Double) 100.0d);
        java.lang.String str7 = imageData2.getPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.persistence.model.Role role7 = null;
        try {
            roleDAOImpl0.delete(role7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
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
        imageData3.setThumbnailPath("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list_str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection3 = collectionDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        java.lang.String str2 = photographerData0.getIban();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection3 = photographerData0.getCollections();
        photographerData0.setIban("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER");
        photographerData0.setSwift("ROLE_BECOME_PHOTOGRAPHER");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(list_collection3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors1);
        int i3 = notFoundException2.getCode();
        int i4 = notFoundException2.getCode();
        org.junit.Assert.assertTrue(i3 == 10001);
        org.junit.Assert.assertTrue(i4 == 10001);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry6 = null;
        application0.addResourceHandlers(resourceHandlerRegistry6);
        org.springframework.web.servlet.LocaleResolver localeResolver8 = application0.localeResolver();
        de.htw.sdf.photoplatform.Application application9 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer10 = null;
        application9.configureContentNegotiation(contentNegotiationConfigurer10);
        de.htw.sdf.photoplatform.Application application12 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer13 = null;
        application12.configureContentNegotiation(contentNegotiationConfigurer13);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array15 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler16 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler16, handlerMethodReturnValueHandler_array15);
        application12.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler16);
        application9.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler16);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler16);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(localeResolver8);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
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
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole12 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user13 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b14 = user13.isPhotographer();
        userRole12.setUser(user13);
        user13.setUsername("/api");
        boolean b18 = user13.isAccountNonLocked();
        java.lang.String str19 = user13.getSecToken();
        userImage9.setUser(user13);
        de.htw.sdf.photoplatform.persistence.model.User user21 = userImage9.getUser();
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(user21);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        photographerData0.setCompany("/collections/{collectionId}/images");
        photographerData0.setPhone("/photographer/images");
        java.lang.String str6 = photographerData0.getPhone();
        photographerData0.setIban("/collections/photographers/{start}/{count}");
        photographerData0.setHomepage("Collection{user=de.htw.sdf.photoplatform.persistence.model.User [ID=null], name='null'}");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "/photographer/images" + "'", str6.equals("/photographer/images"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        de.htw.sdf.photoplatform.exception.common.ManagerException managerException1 = new de.htw.sdf.photoplatform.exception.common.ManagerException(10000);
        org.springframework.validation.Errors errors2 = managerException1.getErrors();
        int i3 = managerException1.getCode();
        org.springframework.validation.Errors errors4 = managerException1.getErrors();
        org.junit.Assert.assertNull(errors2);
        org.junit.Assert.assertTrue(i3 == 10000);
        org.junit.Assert.assertNull(errors4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user7 = userDAOImpl0.find((java.lang.Integer) 11002, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException1 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException((int) (short) 0);
        java.lang.String str2 = authorizationException1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception" + "'", str2.equals("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole4 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role5 = userRole4.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role6 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole4.setRole(role6);
        de.htw.sdf.photoplatform.persistence.model.Role role8 = userRole4.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role9 = userRole4.getRole();
        role9.setName("/collections/photographers");
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user12 = userDAOImpl0.findByRole(role9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(role5);
        org.junit.Assert.assertNotNull(role8);
        org.junit.Assert.assertNotNull(role9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        de.htw.sdf.photoplatform.persistence.model.Category category0 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category0.setName("/user/enablephotographer");
        category0.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category0.setName("/photographer/images/{imageId}");
        java.lang.String str7 = category0.getName();
        java.lang.String str8 = category0.getDescription();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/photographer/images/{imageId}" + "'", str7.equals("/photographer/images/{imageId}"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = image0.getCreatedBy();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData3.setMobilePath("/collections/create");
        java.lang.String str6 = imageData3.getName();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage0 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = userImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.User user2 = null;
        userImage0.setUser(user2);
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str5 = image4.getMime();
        java.lang.String str6 = image4.getUpdatedBy();
        java.lang.String str7 = image4.getSmallThumbPath();
        java.lang.String str8 = image4.getUpdatedBy();
        java.util.Date date9 = image4.getUpdatedAt();
        image4.setMime("Category{name='null'}");
        userImage0.setImage(image4);
        org.junit.Assert.assertNull(image1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setName("");
        imageData2.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long7 = imageData2.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str5 = imageData4.getMime();
        imageData4.setPrice((java.lang.Double) 1.0d);
        java.lang.Double d8 = imageData4.getPrice();
        imageData4.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + d8 + "' != '" + 1.0d + "'", d8.equals(1.0d));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        image0.setCreatedBy("ROLE_ADMIN");
        java.lang.String str7 = image0.toString();
        java.lang.String str8 = image0.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData9 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str7.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(imageData9);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        userData0.setHomepage("");
        userData0.setSecToken("/photographer/images/{imageId}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0", errors1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
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
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData16 = collectionData0.getThumbnail();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(userData10);
        org.junit.Assert.assertNull(imageData16);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        try {
            roleDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
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
        java.lang.String[] str_array55 = new java.lang.String[] { "/user/{name}", "77ce3535f163da232981f0d31864a601ca7857e39a64df07a354c6860cf425727ccc18a2328f2e2bfe2e86f09067f3be6c7841e138ba6b4e2d0fea3d964ab0d9", "null:1528137264754:37059375c02a8fd63e589326ff8446ea", "49961de64838862febaeead9e5ed74a8", "5b077a3001f6b54eed6802448a739229", "39c73479cb767c5a09248b3313c03447", "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10000", "", "Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}", "/collections/photographers", "49961de64838862febaeead9e5ed74a8", "/users/update", "Image{name='null', path='', isPublic=false, enabled=false, price=1.0}", "/collections/update", "5b077a3001f6b54eed6802448a739229", "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0", "/collections/{collectionId}/images/{imageId}", "/user/lock/{id}", "/user/login", "/users/becomephotographers", "Image{name='null', path='', isPublic=false, enabled=false, price=1.0}", "de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER", "/users/becomephotographers", "/collections/create", "Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}", "/user/makeadmin/{id}", "null:1528137265168:246d1b80c2f43651d8cc26e44925e89a", "Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}", "5b077a3001f6b54eed6802448a739229", "/collections/showcase", "/photographer/images/{imageId}", "de.htw.sdf.photoplatform.persistence.model.User [ID=null]", "null:1528137265168:246d1b80c2f43651d8cc26e44925e89a", "/user/{name}", "/user/enablephotographer", "77ce3535f163da232981f0d31864a601ca7857e39a64df07a354c6860cf425727ccc18a2328f2e2bfe2e86f09067f3be6c7841e138ba6b4e2d0fea3d964ab0d9", "/collections/{collectionId}", "77ce3535f163da232981f0d31864a601ca7857e39a64df07a354c6860cf425727ccc18a2328f2e2bfe2e86f09067f3be6c7841e138ba6b4e2d0fea3d964ab0d9", "/collections/{collectionId}", "/users/admin/{start}/{count}", "null:1528137270629:cbd34b0779b1c1d7e1215815c5bcba0d", "null:1528137265625:03bf1b2c50bffe4b6b17dad8841e9f70", "/collections/create" };
        java.util.ArrayList<java.lang.String> arraylist_str56 = new java.util.ArrayList<java.lang.String>();
        boolean b57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str56, str_array55);
        userData0.setRoles((java.util.List<java.lang.String>) arraylist_str56);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(str_array55);
        org.junit.Assert.assertTrue(b57 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setUsername("/api");
        java.lang.String str6 = user1.getFirstName();
        java.lang.String str7 = user1.getCreatedBy();
        java.lang.String str8 = user1.getUsername();
        java.lang.String str9 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/api" + "'", str8.equals("/api"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "/api:1528137282451:b663d46b647142ba0b5f5a8d1cd8d8fe" + "'", str9.equals("/api:1528137282451:b663d46b647142ba0b5f5a8d1cd8d8fe"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
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
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer13 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        java.lang.String str14 = becomePhotographer13.getCompany();
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException16 = new de.htw.sdf.photoplatform.exception.NotFoundException("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        localeChangeInterceptor10.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) str14, (java.lang.Exception) notFoundException16);
        javax.servlet.http.HttpServletRequest httpServletRequest18 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse19 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image20 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str21 = image20.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData22 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image20);
        imageData22.setMobilePath("/users/update");
        java.lang.String str25 = imageData22.getDescription();
        java.lang.String str26 = imageData22.getMetadata();
        localeChangeInterceptor10.afterConcurrentHandlingStarted(httpServletRequest18, httpServletResponse19, (java.lang.Object) imageData22);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(localeResolver9);
        org.junit.Assert.assertNotNull(localeChangeInterceptor10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userImageDAOImpl0.getEntityManager();
        try {
            userImageDAOImpl0.deleteById((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isBecomePhotographer();
        user0.setFirstName("/index.html");
        boolean b4 = user0.isAccountNonExpired();
        boolean b5 = user0.isAdmin();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException1 = new de.htw.sdf.photoplatform.exception.BadRequestException("/users/profile/{userId}");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls4 = null;
        collectionDAOImpl0.setClazz(cls4);
        try {
            collectionDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
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
        java.lang.String str23 = responseError22.getDeveloperInfo();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str24 = responseError22.getErrors();
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertNotNull(responseError10);
        org.junit.Assert.assertTrue(i17 == 10001);
        org.junit.Assert.assertNotNull(throwable_array18);
        org.junit.Assert.assertNull(errors20);
        org.junit.Assert.assertNotNull(responseError22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10000" + "'", str23.equals("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10000"));
        org.junit.Assert.assertNotNull(map_str_list_str24);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController1 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException4 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors3);
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController1.handleBadRequestException(badRequestException4, webRequest5);
        org.springframework.web.context.request.WebRequest webRequest7 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError8 = authenticationController0.handleBadRequestException(badRequestException4, webRequest7);
        java.lang.RuntimeException runtimeException9 = null;
        try {
            authenticationController0.handleBaseException(runtimeException9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry6 = null;
        application0.addResourceHandlers(resourceHandlerRegistry6);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory8 = application0.servletContainer();
        org.springframework.validation.MessageCodesResolver messageCodesResolver9 = application0.getMessageCodesResolver();
        org.springframework.validation.MessageCodesResolver messageCodesResolver10 = application0.getMessageCodesResolver();
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory8);
        org.junit.Assert.assertNull(messageCodesResolver9);
        org.junit.Assert.assertNull(messageCodesResolver10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.Boolean b4 = userData0.isEnabled();
        java.lang.String str5 = userData0.getFirstName();
        java.lang.String str6 = userData0.getHomepage();
        java.lang.String str7 = userData0.getEmail();
        userData0.setEmail("/user/makeadmin/{id}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls5 = null;
        collectionImageDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage7 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image8 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image8.setCreatedBy("");
        collectionImage7.setImage(image8);
        de.htw.sdf.photoplatform.persistence.model.Image image12 = collectionImage7.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection13 = null;
        collectionImage7.setCollection(collection13);
        de.htw.sdf.photoplatform.persistence.model.Image image15 = collectionImage7.getImage();
        de.htw.sdf.photoplatform.persistence.model.Image image16 = collectionImage7.getImage();
        try {
            collectionImageDAOImpl0.create(collectionImage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(image12);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNotNull(image16);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long6 = new java.util.ArrayList<java.lang.Long>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long6, long_array5);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long6);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData9 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array14 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long15 = new java.util.ArrayList<java.lang.Long>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long15, long_array14);
        collectionData9.setImageIds((java.util.List<java.lang.Long>) arraylist_long15);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long15);
        collectionData0.setId((long) 400);
        org.junit.Assert.assertNotNull(long_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(long_array14);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = collectionImageDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage5 = collectionImageDAOImpl0.findOne(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
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
        java.lang.String str19 = notFoundException13.toString();
        int i20 = notFoundException13.getCode();
        de.htw.sdf.photoplatform.exception.common.ManagerException managerException22 = new de.htw.sdf.photoplatform.exception.common.ManagerException(11004);
        notFoundException13.addSuppressed((java.lang.Throwable) managerException22);
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i14 == 10001);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str19.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
        org.junit.Assert.assertTrue(i20 == 10001);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
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
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister40 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str41 = userRegister40.getPassword();
        java.lang.String str42 = userRegister40.getFirstName();
        org.springframework.validation.BindingResult bindingResult43 = null;
        try {
            authenticationController0.register(userRegister40, bindingResult43);
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
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
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
        java.lang.String str13 = userData9.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(userData8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.lockUser("/users/becomephotographers");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionDAOImpl0.findById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls3 = null;
        userRoleDAOImpl0.setClazz(cls3);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole5 = userRoleDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage6 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image7 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image7.setCreatedBy("");
        collectionImage6.setImage(image7);
        de.htw.sdf.photoplatform.persistence.model.Collection collection11 = collectionImage6.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Collection collection12 = collectionImage6.getCollection();
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage13 = collectionImageDAOImpl0.update(collectionImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertNull(collection12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userImageDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage7 = userImageDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test177");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = null;
        collectionData0.setUserdata(userData2);
        java.lang.String str4 = collectionData0.getName();
        long long5 = collectionData0.getId();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData6 = collectionData0.getImages();
        de.htw.sdf.photoplatform.persistence.model.User user7 = new de.htw.sdf.photoplatform.persistence.model.User();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData8 = null;
        user7.setPhotographerData(photographerData8);
        user7.setAccountNonLocked(false);
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection12 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData0, user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(list_imageData6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
        org.springframework.security.core.userdetails.UserDetails userDetails1 = null;
        try {
            boolean b2 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("null:1528137269023:a165acffd0d2c313e6fa2c2dbbd2dc76", userDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test179");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("/collections/addimage");
        userRegister0.setLastName("/user/becomePhotographer");
        userRegister0.setPassword("/collections/create");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test180");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        java.lang.String str3 = userData0.getHomepage();
        java.lang.String str4 = userData0.getHomepage();
        userData0.setAdmin(false);
        userData0.setEmail("/user/enablephotographer");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image1);
        java.lang.String str3 = image1.getCreatedBy();
        java.util.Date date4 = null;
        image1.setUpdatedAt(date4);
        image1.setEnabled(false);
        try {
            imageManagerImpl0.create(image1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(imageData2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test182");
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
        java.lang.String str19 = user14.getUsername();
        boolean b20 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("null:1528137248666:32ad08d7594d28504f1460b47d9ec391", (org.springframework.security.core.userdetails.UserDetails) user14);
        java.lang.String str21 = user14.getFirstName();
        user14.setEnabled(false);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test183");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData8.setPrice((java.lang.Double) (-1.0d));
        java.lang.Double d11 = imageData8.getPrice();
        java.lang.String str12 = imageData8.getName();
        java.lang.String str13 = imageData8.getMime();
        imageData8.setMetadata("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + d11 + "' != '" + (-1.0d) + "'", d11.equals((-1.0d)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setId((java.lang.Long) 0L);
        userData0.setEnabled(false);
        userData0.setAdmin(false);
        java.lang.String str7 = userData0.getCompany();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test185");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user6 = collection5.getUser();
        try {
            collectionDAOImpl0.delete(collection5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
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
            java.lang.String str25 = hashManagerImpl20.hash("null:1528137271848:6816eb5a920569f38c51d1b8bbf267cc", "null:1528137277050:ea4b11766ecf85bf46d8a52721b360a9");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.toString();
        java.lang.String str2 = image0.getName();
        image0.setPublic(false);
        java.lang.String str5 = image0.getMetaData();
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister6 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister6.setLastName("/collections/addimage");
        userRegister6.setLastName("/user/becomePhotographer");
        userRegister6.setLastName("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        boolean b13 = image0.equals((java.lang.Object) "null:1528137250344:31149e863206f62132f4465a1c878d2c");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
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
        de.htw.sdf.photoplatform.persistence.model.User user24 = userImage10.getUser();
        boolean b25 = user24.isAccountNonLocked();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole26 = user24.getUserRoles();
        java.lang.String str27 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user24);
        try {
            java.lang.Boolean b28 = userManagerImpl0.isUserPhotographer(user24);
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
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(list_userRole26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "null:1528137283870:475944c0210e64f113b486a13a5d5d42" + "'", str27.equals("null:1528137283870:475944c0210e64f113b486a13a5d5d42"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
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
        java.util.Date date21 = userImage18.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.User user22 = userImage18.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user23 = userImage18.getUser();
        de.htw.sdf.photoplatform.persistence.model.Image image24 = userImage18.getImage();
        try {
            userImageDAOImpl0.create(userImage18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertNull(user23);
        org.junit.Assert.assertNull(image24);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor1 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest2 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse3 = null;
        org.springframework.validation.Errors errors5 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException6 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors5);
        requestLoggerInterceptor1.afterConcurrentHandlingStarted(httpServletRequest2, httpServletResponse3, (java.lang.Object) badRequestException6);
        org.springframework.web.context.request.WebRequest webRequest8 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError9 = photographerController0.handleBadRequestException(badRequestException6, webRequest8);
        try {
            java.lang.String str11 = photographerController0.updateCollectionShowcase("ec7908a224b49d37ffc84c612f320838");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertNotNull(responseError9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test191");
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
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData18 = photographerController0.getPhotographersImages(0, (int) '#');
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
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setId((java.lang.Long) 0L);
        userData0.setEnabled(false);
        userData0.setAdmin(false);
        userData0.setEnabled(true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor2 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest3 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse4 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException7 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor2.afterCompletion(httpServletRequest3, httpServletResponse4, (java.lang.Object) 10, (java.lang.Exception) notFoundException7);
        javax.servlet.http.HttpServletRequest httpServletRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage11 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView12 = null;
        requestLoggerInterceptor2.postHandle(httpServletRequest9, httpServletResponse10, (java.lang.Object) userImage11, modelAndView12);
        java.util.Date date14 = userImage11.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Image image15 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image15.setMobileThumbPath("ROLE_CUSTOMER");
        userImage11.setImage(image15);
        de.htw.sdf.photoplatform.persistence.model.User user19 = userImage11.getOwner();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage20 = userImageDAOImpl0.update(userImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test194");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls3 = null;
        userRoleDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole6 = userRoleDAOImpl0.findOne((long) 11004);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test195");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer1 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer1.setPhone("ROLE_ADMIN");
        becomePhotographer1.setCompany("/showcase");
        java.lang.String str6 = becomePhotographer1.getIban();
        becomePhotographer1.setPhone("/users/admin/{start}/{count}");
        java.lang.String str9 = becomePhotographer1.getPaypalID();
        becomePhotographer1.setSwift("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str12 = becomePhotographer1.getIban();
        org.springframework.validation.BindingResult bindingResult13 = null;
        try {
            boolean b14 = userController0.becomePhotographer(becomePhotographer1, bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        java.lang.String str2 = photographerData0.getIban();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection3 = photographerData0.getCollections();
        photographerData0.setPhone("abe34aa080ac4421665a72329e218ae76e6eae82d181635ba4a5f8548e70866084fd9cd5c793d5b3a4165763081b95813d4bdb3d679b27d667fea0502caa5a9b");
        java.lang.String str6 = photographerData0.getPhone();
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(list_collection3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "abe34aa080ac4421665a72329e218ae76e6eae82d181635ba4a5f8548e70866084fd9cd5c793d5b3a4165763081b95813d4bdb3d679b27d667fea0502caa5a9b" + "'", str6.equals("abe34aa080ac4421665a72329e218ae76e6eae82d181635ba4a5f8548e70866084fd9cd5c793d5b3a4165763081b95813d4bdb3d679b27d667fea0502caa5a9b"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.toString();
        image0.setThumbPath("/user/makeadmin/{id}");
        java.util.Date date4 = null;
        image0.setUpdatedAt(date4);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test198");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user4 = userDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test199");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        userData0.setFirstName("obfuscate");
        java.lang.Boolean b5 = userData0.isAdmin();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
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
        de.htw.sdf.photoplatform.persistence.model.User user11 = userRole6.getUser();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole12 = userRoleDAOImpl0.update(userRole6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(role7);
        org.junit.Assert.assertNotNull(role10);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
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
        de.htw.sdf.photoplatform.persistence.model.Role role15 = userRole5.getRole();
        de.htw.sdf.photoplatform.persistence.model.User user16 = null;
        userRole5.setUser(user16);
        de.htw.sdf.photoplatform.persistence.model.Role role18 = userRole5.getRole();
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role19 = roleDAOImpl0.update(role18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(role6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(role15);
        org.junit.Assert.assertNotNull(role18);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str5 = imageData4.getMime();
        imageData4.setPrice((java.lang.Double) 1.0d);
        java.lang.Double d8 = imageData4.getPrice();
        imageData4.setMessageFailed("hi!");
        imageData4.setMetadata("Category{name='null'}");
        java.lang.Long long13 = imageData4.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + d8 + "' != '" + 1.0d + "'", d8.equals(1.0d));
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setPassword("");
        userPasswordChange0.setPasswordConfirm("ec7908a224b49d37ffc84c612f320838");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userRoleDAOImpl0.getEntityManager();
        try {
            javax.persistence.Query query8 = userRoleDAOImpl0.createQuery("null:1528137271348:359dea61c52e045b1b927389910fdd93");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        java.lang.String str2 = collectionData0.getDescription();
        de.htw.sdf.photoplatform.persistence.model.UserImage[] userImage_array3 = new de.htw.sdf.photoplatform.persistence.model.UserImage[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserImage> arraylist_userImage4 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserImage>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage4, userImage_array3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage4);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData7 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage4);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData8 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage4);
        collectionData0.setImages(list_imageData8);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData10 = null;
        collectionData0.setUserdata(userData10);
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(userImage_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(list_imageData6);
        org.junit.Assert.assertNotNull(list_imageData7);
        org.junit.Assert.assertNotNull(list_imageData8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData7 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str8 = userData7.getLastName();
        java.lang.String str9 = userData7.getEmail();
        org.springframework.validation.BindingResult bindingResult10 = null;
        try {
            userController0.updateUser(userData7, bindingResult10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError((int) (byte) 0, (int) (short) 100, "/users/profile/{userId}", errors3);
        int i5 = responseError4.getStatus();
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getSecToken();
        java.lang.Boolean b5 = userData0.isAdmin();
        userData0.setId((java.lang.Long) 1L);
        userData0.setCompany("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER");
        userData0.setHomepage("null:1528137281269:5056f29775854522e0ebd121af608756");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user8 = userDAOImpl0.findByRoleId((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
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
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData15 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(userImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls4 = null;
        userDAOImpl0.setClazz(cls4);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user8 = userDAOImpl0.find((java.lang.Integer) 10, (java.lang.Integer) 400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image5 = imageDAOImpl0.getPublicImages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        try {
            javax.persistence.Query query7 = userRoleDAOImpl0.createQuery("ROLE_ADMIN");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException1 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER");
        java.lang.String str2 = badRequestException1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER" + "'", str2.equals("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
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
            java.lang.String str18 = photographerController0.addImageToCollection("/collections/{collectionId}", bindingResult17);
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
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.controller.UserController userController1 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException4 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors3);
        int i5 = notFoundException4.getCode();
        org.springframework.web.context.request.WebRequest webRequest6 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError7 = userController1.handleNotFoundException(notFoundException4, webRequest6);
        org.springframework.web.context.request.WebRequest webRequest8 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError9 = photographerController0.handleNotFoundException(notFoundException4, webRequest8);
        try {
            java.lang.String str12 = photographerController0.deleteImageFromCollection((java.lang.Long) 1L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage5 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image6.setCreatedBy("");
        collectionImage5.setImage(image6);
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = null;
        collectionImage5.setCollection(collection10);
        try {
            collectionImageDAOImpl0.delete(collectionImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage7 = collectionImageDAOImpl0.findBy((java.lang.Long) 0L, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        java.lang.String str2 = userRegister0.getFirstName();
        java.lang.String str3 = userRegister0.getFirstName();
        userRegister0.setFirstName("null:1528137277050:ea4b11766ecf85bf46d8a52721b360a9");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
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
        userImage9.setUpdatedBy("ROLE_ADMIN");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException1 = new de.htw.sdf.photoplatform.exception.BadRequestException("null:1528137255129:74131369d5ab98a30139e53b9d69dc36");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData7 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str8 = userData7.getLastName();
        java.util.List<java.lang.String> list_str9 = userData7.getRoles();
        java.lang.String str10 = userData7.getEmail();
        userData7.setPaypalID("/users/admin/{start}/{count}");
        userData7.setBanned(true);
        java.lang.Long long15 = userData7.getId();
        java.lang.String str16 = userData7.getHomepage();
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
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getMessageSuccess();
        imageData2.setMobilePath("/users/update");
        java.lang.String str6 = imageData2.getSmallPath();
        java.lang.String str7 = imageData2.getName();
        imageData2.setSmallPath("/user/login");
        imageData2.setCode((java.lang.Long) 10L);
        imageData2.setPath("/users/becomephotographers");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getMobileThumbPath();
        image0.setMetaData("/user/makeadmin/{id}");
        java.lang.String str5 = image0.getCreatedBy();
        image0.setChangeDate();
        image0.setPublic(false);
        image0.setThumbPath("");
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData11 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(imageData11);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        try {
            userRoleDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        de.htw.sdf.photoplatform.exception.common.ManagerException managerException1 = new de.htw.sdf.photoplatform.exception.common.ManagerException((int) (byte) 100);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
        de.htw.sdf.photoplatform.persistence.model.Role role0 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role0.setName("ROLE_CUSTOMER");
        java.lang.String str3 = role0.getName();
        role0.setName("/api:1528137282451:b663d46b647142ba0b5f5a8d1cd8d8fe");
        role0.setName("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ROLE_CUSTOMER" + "'", str3.equals("ROLE_CUSTOMER"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        javax.servlet.MultipartConfigElement multipartConfigElement6 = application0.multipartConfigElement();
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(multipartConfigElement6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user8 = userDAOImpl0.find((java.lang.Integer) 11004, (java.lang.Integer) 400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls3 = null;
        categoryDAOImpl0.setClazz(cls3);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Category> list_category5 = categoryDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError(10001, 10000, "", errors3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array3 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler4 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler4, handlerMethodReturnValueHandler_array3);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler4);
        org.springframework.format.FormatterRegistry formatterRegistry7 = null;
        application0.addFormatters(formatterRegistry7);
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer9 = null;
        application0.configureDefaultServletHandling(defaultServletHandlerConfigurer9);
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer11 = null;
        application0.configureDefaultServletHandling(defaultServletHandlerConfigurer11);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
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
        java.util.Date date25 = userImage9.getUpdatedAt();
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str22.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(date25);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
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
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor10 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse12 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException15 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor10.afterCompletion(httpServletRequest11, httpServletResponse12, (java.lang.Object) 10, (java.lang.Exception) notFoundException15);
        javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse18 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage19 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView20 = null;
        requestLoggerInterceptor10.postHandle(httpServletRequest17, httpServletResponse18, (java.lang.Object) userImage19, modelAndView20);
        java.util.Date date22 = userImage19.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.User user23 = new de.htw.sdf.photoplatform.persistence.model.User();
        user23.setEnabled(false);
        userImage19.setOwner(user23);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage27 = userImageDAOImpl0.update(userImage19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager9);
        org.junit.Assert.assertNull(date22);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        java.lang.String str1 = userPasswordChange0.getNewPassword();
        userPasswordChange0.setPassword("/users/profile/{userId}");
        userPasswordChange0.setNewPassword("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        java.lang.String str5 = user0.toString();
        java.lang.String str7 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user0, (long) (short) 100);
        java.lang.Long long8 = user0.getId();
        boolean b9 = user0.isCredentialsNonExpired();
        boolean b11 = user0.isRoleIncluded("/api:1528137282451:b663d46b647142ba0b5f5a8d1cd8d8fe");
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str5.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ec7908a224b49d37ffc84c612f320838" + "'", str7.equals("ec7908a224b49d37ffc84c612f320838"));
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage7 = collectionImageDAOImpl0.findBy((java.lang.Long) 0L, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager4 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isBecomePhotographer();
        user5.setUsername("ROLE_BECOME_PHOTOGRAPHER");
        boolean b10 = user5.isRoleIncluded("/photographer/images");
        try {
            de.htw.sdf.photoplatform.persistence.model.User user11 = userDAOImpl0.update(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        java.lang.String str5 = imageData2.getMessageFailed();
        java.lang.Long long6 = imageData2.getCode();
        imageData2.setMessageSuccess("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.lang.String str9 = imageData2.getMobilePath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getIban();
        becomePhotographer0.setSwift("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        becomePhotographer0.setPaypalID("/user/register");
        becomePhotographer0.setCompany("/showcase");
        becomePhotographer0.setIban("/collections/{collectionId}/images/{imageId}");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
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
        collectionData0.setName("/collections/addimage");
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNotNull(imageData15);
        org.junit.Assert.assertNull(userData16);
        org.junit.Assert.assertNotNull(imageData17);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
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
        org.springframework.web.multipart.MultipartFile[] multipartFile_array15 = new org.springframework.web.multipart.MultipartFile[] {};
        try {
            java.lang.String str16 = imageController0.handleImageUpload(multipartFile_array15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertNotNull(responseError10);
        org.junit.Assert.assertNotNull(responseError14);
        org.junit.Assert.assertNotNull(multipartFile_array15);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
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
            collectionCategoryDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("/collections/addimage");
        userRegister0.setLastName("/user/becomePhotographer");
        java.lang.String str5 = userRegister0.getEmail();
        java.lang.String str6 = userRegister0.getEmail();
        userRegister0.setLastName("/photographer/upload");
        userRegister0.setPassword("/api");
        java.lang.String str11 = userRegister0.getEmail();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isBecomePhotographer();
        user0.setFirstName("/index.html");
        user0.setId((java.lang.Long) (-1L));
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData6 = user0.getPhotographerData();
        java.lang.String str7 = user0.getUsername();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(photographerData6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        photographerData0.setCompany("/collections/{collectionId}/images");
        photographerData0.setPhone("/photographer/images");
        java.lang.String str6 = photographerData0.getPhone();
        photographerData0.setIban("/collections/photographers/{start}/{count}");
        java.lang.String str9 = photographerData0.getSwift();
        photographerData0.setIban("Collection{user=de.htw.sdf.photoplatform.persistence.model.User [ID=null], name='null'}");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "/photographer/images" + "'", str6.equals("/photographer/images"));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPasswordConfirm();
        userPasswordChange0.setPasswordConfirm("Collection{user=null, name='null'}");
        userPasswordChange0.setPasswordConfirm("/user/register");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = userImageDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage7 = userImageDAOImpl0.getOwnerImages((long) 11004, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole4 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isPhotographer();
        userRole4.setUser(user5);
        try {
            userDAOImpl0.delete(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData4 = null;
        user1.setPhotographerData(photographerData4);
        try {
            boolean b6 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("39c73479cb767c5a09248b3313c03447", (org.springframework.security.core.userdetails.UserDetails) user1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test251");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER");
        org.springframework.web.context.request.WebRequest webRequest3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = photographerController0.handleBadRequestException(badRequestException2, webRequest3);
        try {
            java.lang.String str6 = photographerController0.updateCollectionShowcase("/user/becomePhotographer");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertNotNull(responseError4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls3 = null;
        categoryDAOImpl0.setClazz(cls3);
        try {
            categoryDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.Boolean b4 = userData0.isBanned();
        java.lang.String str5 = userData0.getIban();
        userData0.setPhone("null:1528137248666:32ad08d7594d28504f1460b47d9ec391");
        userData0.setHomepage("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData10 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str11 = userData10.getLastName();
        java.util.List<java.lang.String> list_str12 = userData10.getRoles();
        java.lang.String str13 = userData10.getSwift();
        java.lang.Boolean b14 = userData10.isEnabled();
        userData10.setId((java.lang.Long) 1L);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData17 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str18 = userData17.getLastName();
        java.util.List<java.lang.String> list_str19 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData17.setRoles(list_str19);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData21 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str22 = userData21.getLastName();
        java.util.List<java.lang.String> list_str23 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData21.setRoles(list_str23);
        userData17.setRoles(list_str23);
        userData10.setRoles(list_str23);
        userData0.setRoles(list_str23);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(list_str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + b14 + "' != '" + false + "'", b14.equals(false));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(list_str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(list_str23);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image4 = imageDAOImpl0.findOne((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test255");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        boolean b4 = user0.isPhotographer();
        java.lang.String str5 = user0.getFirstName();
        boolean b6 = user0.isEnabled();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test256");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user6 = userDAOImpl0.findById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        try {
            imageDAOImpl0.deleteById((long) 400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array3 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler4 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler4, handlerMethodReturnValueHandler_array3);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler4);
        org.springframework.format.FormatterRegistry formatterRegistry7 = null;
        application0.addFormatters(formatterRegistry7);
        de.htw.sdf.photoplatform.Application application9 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer10 = null;
        application9.configureAsyncSupport(asyncSupportConfigurer10);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer12 = null;
        application9.configureAsyncSupport(asyncSupportConfigurer12);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array14 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver15 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver15, handlerExceptionResolver_array14);
        application9.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver15);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver15);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer19 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer19);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test259");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getSmallPath();
        imageData2.setPath("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.Boolean b9 = userData8.isAdmin();
        imageData2.setUserData(userData8);
        java.lang.String str11 = imageData2.getMetadata();
        java.lang.Long long12 = imageData2.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(long12);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getSmallThumbPath();
        java.lang.String str3 = image0.toString();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData4.setDescription("/users/update");
        imageData4.setDescription("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.lang.Long long9 = imageData4.getCode();
        java.lang.Long long10 = imageData4.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
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
        java.util.List<java.lang.String> list_str13 = userData0.getRoles();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list_str13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            boolean b2 = userController0.enablePhotographer("/api:1528137282451:b663d46b647142ba0b5f5a8d1cd8d8fe");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test263");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData4 = null;
        user1.setPhotographerData(photographerData4);
        java.lang.String str6 = user1.toString();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard7 = user1.getAuthorities();
        boolean b9 = user1.isRoleIncluded("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        user1.setSecToken("Category{name='null'}");
        try {
            java.lang.Boolean b13 = userManagerImpl0.isRoleIncluded(user1, "null:1528137265168:246d1b80c2f43651d8cc26e44925e89a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str6.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertNull(collection_wildcard7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        userData0.setIban("/collections/{collectionId}");
        java.lang.Boolean b5 = userData0.isEnabled();
        userData0.setPhone("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER");
        userData0.setEnabled(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test265");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = image0.getCreatedBy();
        image0.setThumbPath("/user/login");
        image0.setChangeDate();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test266");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER");
        org.springframework.web.context.request.WebRequest webRequest3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = photographerController0.handleBadRequestException(badRequestException2, webRequest3);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData5 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array10 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long11 = new java.util.ArrayList<java.lang.Long>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long11, long_array10);
        collectionData5.setImageIds((java.util.List<java.lang.Long>) arraylist_long11);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData14 = collectionData5.getImages();
        org.springframework.validation.BindingResult bindingResult15 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData16 = photographerController0.updateCollection(collectionData5, bindingResult15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError4);
        org.junit.Assert.assertNotNull(long_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(list_imageData14);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPassword();
        java.lang.String str4 = userPasswordChange0.getPasswordConfirm();
        userPasswordChange0.setNewPassword("null:1528137271348:359dea61c52e045b1b927389910fdd93");
        java.lang.String str7 = userPasswordChange0.getPasswordConfirm();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls2 = null;
        collectionImageDAOImpl0.setClazz(cls2);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage6 = collectionImageDAOImpl0.findBy((java.lang.Long) 0L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test269");
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
        java.lang.Boolean b19 = collectionData0.getPublic();
        java.lang.String str20 = collectionData0.getDescription();
        org.junit.Assert.assertNotNull(long_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(list_imageData9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertTrue("'" + b19 + "' != '" + true + "'", b19.equals(true));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData5 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = collectionData5.getThumbnail();
        collectionData5.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b9 = collectionData5.getPublic();
        de.htw.sdf.photoplatform.persistence.model.User user10 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b11 = user10.isAdmin();
        java.lang.String str12 = user10.getSecToken();
        boolean b13 = user10.isAccountNonLocked();
        boolean b14 = user10.isCredentialsNonExpired();
        java.lang.String str15 = user10.getLastName();
        java.lang.String str16 = user10.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole17 = user10.getUserRoles();
        de.htw.sdf.photoplatform.persistence.model.Collection collection18 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData5, user10);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage19 = collection18.getCollectionImages();
        de.htw.sdf.photoplatform.persistence.model.Image image20 = collection18.getThumbnail();
        try {
            collectionDAOImpl0.delete(collection18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(imageData6);
        org.junit.Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(list_userRole17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(set_collectionImage19);
        org.junit.Assert.assertNull(image20);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test271");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager4 = userDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user5 = userDAOImpl0.findAllNotAdminUsers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test272");
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
        int i16 = responseError15.getCode();
        int i17 = responseError15.getCode();
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError12);
        org.junit.Assert.assertTrue(i13 == 10000);
        org.junit.Assert.assertNotNull(responseError15);
        org.junit.Assert.assertTrue(i16 == 10000);
        org.junit.Assert.assertTrue(i17 == 10000);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test273");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        java.lang.String str5 = userData0.getHomepage();
        userData0.setPaypalID("/users/changepassword");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity8 = null;
        xAuthTokenConfigurer7.setBuilder(httpSecurity8);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test275");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getSmallThumbPath();
        java.lang.String str3 = image0.toString();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData4.setDescription("/users/update");
        imageData4.setDescription("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        imageData4.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard4 = user0.getAuthorities();
        boolean b6 = user0.isRoleIncluded("");
        boolean b7 = user0.isAdmin();
        boolean b8 = user0.isEnabled();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(collection_wildcard4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getMetadata();
        java.lang.String str7 = imageData2.getMobilePath();
        imageData2.setMessageFailed("/api");
        imageData2.setPath("77ce3535f163da232981f0d31864a601ca7857e39a64df07a354c6860cf425727ccc18a2328f2e2bfe2e86f09067f3be6c7841e138ba6b4e2d0fea3d964ab0d9");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/users/update" + "'", str7.equals("/users/update"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls2 = null;
        categoryDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.Category category4 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category4.setName("/user/enablephotographer");
        category4.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category4.setDescription("obfuscate");
        category4.setDescription("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        java.lang.String str13 = category4.getDescription();
        try {
            categoryDAOImpl0.delete(category4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str13.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        boolean b5 = image0.isEnabled();
        image0.setPath("ROLE_ADMIN");
        image0.setPrice((java.lang.Double) 10.0d);
        boolean b10 = image0.isEnabled();
        image0.setMobileThumbPath("/index.html");
        image0.setThumbPath("ec7908a224b49d37ffc84c612f320838");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test280");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str5 = imageData4.getMime();
        imageData4.setPrice((java.lang.Double) 1.0d);
        java.lang.Double d8 = imageData4.getPrice();
        imageData4.setMessageFailed("hi!");
        imageData4.setMobilePath("/photographer/upload");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + d8 + "' != '" + 1.0d + "'", d8.equals(1.0d));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test281");
        de.htw.sdf.photoplatform.persistence.model.Category category0 = new de.htw.sdf.photoplatform.persistence.model.Category();
        java.lang.String str1 = category0.toString();
        category0.setName("null:1528137255129:74131369d5ab98a30139e53b9d69dc36");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Category{name='null'}" + "'", str1.equals("Category{name='null'}"));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test282");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setName("");
        java.lang.Double d5 = imageData2.getPrice();
        imageData2.setPrice((java.lang.Double) 100.0d);
        java.lang.String str8 = imageData2.getThumbnailPath();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData9 = imageData2.getUserData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(d5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(userData9);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test283");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("/collections/{collectionId}");
        org.springframework.web.context.request.WebRequest webRequest3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = imageController0.handleNotFoundException(notFoundException2, webRequest3);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user5 = imageController0.getAuthenticatedUser();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError4);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test284");
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
        java.lang.RuntimeException runtimeException23 = null;
        try {
            imageController0.handleBaseException(runtimeException23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertNotNull(responseError10);
        org.junit.Assert.assertTrue(i17 == 10001);
        org.junit.Assert.assertNotNull(throwable_array18);
        org.junit.Assert.assertNull(errors20);
        org.junit.Assert.assertNotNull(responseError22);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test285");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setThumbPath("/users/admin/{start}/{count}");
        image0.setMime("/users/admin/{start}/{count}");
        java.lang.String str7 = image0.getMime();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/users/admin/{start}/{count}" + "'", str7.equals("/users/admin/{start}/{count}"));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test286");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        image0.setSmallThumbPath("/photographer/upload");
        java.lang.Double d4 = image0.getPrice();
        image0.setName("Category{name='null'}");
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(d4);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test287");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        java.lang.Double d6 = image5.getPrice();
        java.lang.String str7 = image5.getThumbPath();
        org.junit.Assert.assertNotNull(image5);
        org.junit.Assert.assertNull(d6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test288");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        java.lang.String str5 = imageData2.getMessageFailed();
        java.lang.String str6 = imageData2.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test289");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setCompany("/showcase");
        becomePhotographer0.setHomepage("/collections/photographers");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test290");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.Boolean b1 = userData0.isAdmin();
        userData0.setEnabled(true);
        userData0.setEnabled(false);
        userData0.setSwift("null:1528137264754:37059375c02a8fd63e589326ff8446ea");
        java.lang.String str8 = userData0.getIban();
        org.junit.Assert.assertTrue("'" + b1 + "' != '" + false + "'", b1.equals(false));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test291");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        try {
            collectionCategoryDAOImpl0.deleteById((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test292");
        org.springframework.security.core.userdetails.UserDetailsService userDetailsService0 = null;
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer(userDetailsService0);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity2 = null;
        xAuthTokenConfigurer1.setBuilder(httpSecurity2);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity4 = null;
        xAuthTokenConfigurer1.setBuilder(httpSecurity4);
        try {
            org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity6 = xAuthTokenConfigurer1.and();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test293");
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
            java.lang.String str13 = photographerController0.updateCollectionShowcase("null:1528137281269:5056f29775854522e0ebd121af608756");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str9.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
        org.junit.Assert.assertNotNull(responseError11);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test294");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer5 = null;
        application0.configureDefaultServletHandling(defaultServletHandlerConfigurer5);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test295");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("/api:1528137282451:b663d46b647142ba0b5f5a8d1cd8d8fe", errors1);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test296");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = image0.getCreatedBy();
        image0.setMime("ROLE_CUSTOMER");
        java.lang.Double d5 = image0.getPrice();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(d5);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test297");
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
        collectionData0.setDescription("/users/admin/{start}/{count}");
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNotNull(imageData15);
        org.junit.Assert.assertNull(userData16);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test298");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager4 = userDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user6 = userDAOImpl0.findByAccountLocked(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test299");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData8.setPrice((java.lang.Double) (-1.0d));
        java.lang.Double d11 = imageData8.getPrice();
        java.lang.String str12 = imageData8.getName();
        java.lang.String str13 = imageData8.getMime();
        java.lang.String str14 = imageData8.getPath();
        imageData8.setCode((java.lang.Long) 100L);
        imageData8.setMessageFailed("/users/update");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + d11 + "' != '" + (-1.0d) + "'", d11.equals((-1.0d)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test300");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionCategoryDAOImpl0.getEntityManager();
        try {
            collectionCategoryDAOImpl0.deleteById((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test301");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            org.springframework.security.core.userdetails.UserDetails userDetails9 = userDAOImpl0.loadUserByUsername("/collections/photographers");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test302");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = null;
        collectionData0.setUserdata(userData2);
        java.lang.String str4 = collectionData0.getName();
        long long5 = collectionData0.getId();
        java.util.List<java.lang.Long> list_long6 = collectionData0.getImageIds();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(list_long6);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test303");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = roleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole4 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role5 = userRole4.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role6 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole4.setRole(role6);
        try {
            roleDAOImpl0.create(role6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(role5);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test304");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getIban();
        java.lang.String str8 = becomePhotographer0.getHomepage();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test305");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        java.lang.String str3 = becomePhotographer0.getIban();
        becomePhotographer0.setCompany("/user/lock/{id}");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test306");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionImageDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage8 = collectionImageDAOImpl0.findBy((java.lang.Long) 10L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test307");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setCreatedBy("/collections/addimage");
        image0.setDescription("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        java.lang.Double d8 = image0.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(d8);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test308");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPasswordConfirm();
        userPasswordChange0.setNewPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001");
        java.lang.String str6 = userPasswordChange0.getPasswordConfirm();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test309");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        userPasswordChange0.setPasswordConfirm("/collections/{collectionId}/images");
        userPasswordChange0.setPasswordConfirm("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        java.lang.String str7 = userPasswordChange0.getPasswordConfirm();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str7.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test310");
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
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer52 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer52);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(messageCodesResolver32);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array47);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test311");
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
        de.htw.sdf.photoplatform.webservice.dto.UserData userData11 = collectionData10.getUserdata();
        java.util.List<java.lang.Long> list_long12 = collectionData10.getImageIds();
        collectionData10.setDescription("");
        collectionData10.setId((long) 11004);
        org.springframework.validation.BindingResult bindingResult17 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection18 = photographerController0.createCollection(collectionData10, bindingResult17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertNull(userData11);
        org.junit.Assert.assertNull(list_long12);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test312");
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
        java.lang.Long[] long_array12 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long13, long_array12);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage15 = userImageDAOImpl0.getOwnerImages(1L, (java.util.List<java.lang.Long>) arraylist_long13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager9);
        org.junit.Assert.assertNotNull(long_array12);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test313");
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException1 = new de.htw.sdf.photoplatform.exception.BadRequestException("/collections/create");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test314");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls4 = null;
        collectionDAOImpl0.setClazz(cls4);
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection7 = collectionDAOImpl0.findById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test315");
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
        org.springframework.validation.BindingResult bindingResult13 = null;
        try {
            java.lang.String str14 = photographerController0.addImageToCollection("obfuscate", bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str9.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
        org.junit.Assert.assertNotNull(responseError11);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test316");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData8.setPrice((java.lang.Double) (-1.0d));
        java.lang.Double d11 = imageData8.getPrice();
        java.lang.String str12 = imageData8.getName();
        java.lang.String str13 = imageData8.getMime();
        java.lang.String str14 = imageData8.getPath();
        java.lang.Long long15 = imageData8.getId();
        imageData8.setName("39c73479cb767c5a09248b3313c03447");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + d11 + "' != '" + (-1.0d) + "'", d11.equals((-1.0d)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(long15);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test317");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = null;
        collectionImage0.setCollection(collection6);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData8 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData9 = collectionData8.getThumbnail();
        collectionData8.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b12 = collectionData8.getPublic();
        de.htw.sdf.photoplatform.persistence.model.User user13 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b14 = user13.isAdmin();
        java.lang.String str15 = user13.getSecToken();
        boolean b16 = user13.isAccountNonLocked();
        boolean b17 = user13.isCredentialsNonExpired();
        java.lang.String str18 = user13.getLastName();
        java.lang.String str19 = user13.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole20 = user13.getUserRoles();
        de.htw.sdf.photoplatform.persistence.model.Collection collection21 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData8, user13);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage22 = collection21.getCollectionImages();
        de.htw.sdf.photoplatform.persistence.model.Image image23 = collection21.getThumbnail();
        collectionImage0.setCollection(collection21);
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData26 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(image5);
        org.junit.Assert.assertNull(imageData9);
        org.junit.Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(list_userRole20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(set_collectionImage22);
        org.junit.Assert.assertNull(image23);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test318");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setAccountNonLocked(true);
        boolean b6 = user1.isAccountNonExpired();
        java.lang.String str7 = user1.getUsername();
        java.lang.String str8 = user1.getFirstName();
        boolean b9 = user1.isAccountNonExpired();
        user1.setLastName("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test319");
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
        java.lang.String str25 = userData15.getFirstName();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test320");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user8 = userDAOImpl0.findByRoleAndEnabledFilter("null:1528137265168:246d1b80c2f43651d8cc26e44925e89a", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test321");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
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
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category16 = categoryDAOImpl0.update(category8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test322");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str7 = image0.getUpdatedBy();
        image0.setUpdatedBy("/collections/{collectionId}/images");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test323");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls3 = null;
        userRoleDAOImpl0.setClazz(cls3);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole6 = userRoleDAOImpl0.findByUserId((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test324");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister1 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str2 = userRegister1.getPassword();
        java.lang.String str3 = userRegister1.getFirstName();
        java.lang.String str4 = userRegister1.getFirstName();
        org.springframework.validation.BindingResult bindingResult5 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData6 = authenticationController0.login((de.htw.sdf.photoplatform.webservice.dto.UserCredential) userRegister1, bindingResult5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test325");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("null:1528137265625:03bf1b2c50bffe4b6b17dad8841e9f70", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = imageController0.handleNotFoundException(notFoundException3, webRequest4);
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController6 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException8 = new de.htw.sdf.photoplatform.exception.NotFoundException("/collections/{collectionId}");
        org.springframework.web.context.request.WebRequest webRequest9 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError10 = imageController6.handleNotFoundException(notFoundException8, webRequest9);
        org.springframework.web.context.request.WebRequest webRequest11 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError12 = imageController0.handleNotFoundException(notFoundException8, webRequest11);
        try {
            imageController0.initIt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
        org.junit.Assert.assertNotNull(responseError10);
        org.junit.Assert.assertNotNull(responseError12);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test326");
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
        org.springframework.validation.MessageCodesResolver messageCodesResolver17 = application0.getMessageCodesResolver();
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory8);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(messageCodesResolver17);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test327");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = userController0.getUserProfileData("/users/changepassword");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test328");
        de.htw.sdf.photoplatform.manager.impl.HashManagerImpl hashManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.HashManagerImpl();
        java.lang.String str2 = hashManagerImpl0.hash("/user/becomePhotographer");
        java.lang.String str4 = hashManagerImpl0.hash("/collections/showcase");
        java.lang.String str6 = hashManagerImpl0.hash("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c" + "'", str2.equals("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9" + "'", str4.equals("4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "9e8062a1d79d79e31daf17f2e0544261af391092c46033dfcfa4c0391b7eeeb6a8a498016e4c6924314fa3a526f390fd48523c8a280218f2104630a210b3a469" + "'", str6.equals("9e8062a1d79d79e31daf17f2e0544261af391092c46033dfcfa4c0391b7eeeb6a8a498016e4c6924314fa3a526f390fd48523c8a280218f2104630a210b3a469"));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test329");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = collectionImageDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage5 = collectionImageDAOImpl0.findOne((long) 10002);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test330");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        image5.setPrice((java.lang.Double) 0.0d);
        java.lang.String str8 = image5.getSmallThumbPath();
        image5.setEnabled(false);
        org.junit.Assert.assertNotNull(image5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test331");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setPassword("ROLE_PHOTOGRAPHER");
        boolean b5 = user0.isRoleIncluded("/user/becomePhotographer");
        boolean b6 = user0.isEnabled();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test332");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.web.servlet.ModelAndView modelAndView4 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest1, httpServletResponse2, (java.lang.Object) "/user/makeadmin/{id}", modelAndView4);
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        de.htw.sdf.photoplatform.persistence.model.User user8 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b9 = user8.isAdmin();
        java.lang.String str10 = user8.getSecToken();
        boolean b11 = user8.isAccountNonLocked();
        boolean b12 = user8.isAccountNonLocked();
        boolean b13 = user8.isAdmin();
        try {
            boolean b14 = requestLoggerInterceptor0.preHandle(httpServletRequest6, httpServletResponse7, (java.lang.Object) user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test333");
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
        userData16.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(list_str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test334");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls3 = null;
        userImageDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage5 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = userImage5.getImage();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage7 = userImageDAOImpl0.update(userImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(image6);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test335");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData6 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData7 = collectionData6.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = null;
        collectionData6.setUserdata(userData8);
        java.lang.Long[] long_array11 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long12, long_array11);
        collectionData6.setImageIds((java.util.List<java.lang.Long>) arraylist_long12);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage15 = userImageDAOImpl0.getOwnerImages((long) (short) 100, (java.util.List<java.lang.Long>) arraylist_long12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(list_imageData7);
        org.junit.Assert.assertNotNull(long_array11);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test336");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        photographerData0.setCompany("/collections/{collectionId}/images");
        photographerData0.setHomepage("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str6 = photographerData0.getHomepage();
        photographerData0.setPhone("/user/lock/{id}");
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array9 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection10 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection10, collection_array9);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData12 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection10);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData14 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection10, (java.lang.Boolean) false);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection10);
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str6.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNotNull(collection_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_collectionData12);
        org.junit.Assert.assertNotNull(list_collectionData14);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test337");
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
            de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory13 = collectionCategoryDAOImpl0.update(collectionCategory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test338");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getEmail();
        userData0.setCompany("/collections/{collectionId}/images");
        userData0.setIban("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        java.util.List<java.lang.String> list_str8 = userData0.getRoles();
        java.lang.String str9 = userData0.getHomepage();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(list_str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test339");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController1 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException4 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors3);
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController1.handleBadRequestException(badRequestException4, webRequest5);
        org.springframework.web.context.request.WebRequest webRequest7 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError8 = authenticationController0.handleBadRequestException(badRequestException4, webRequest7);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user9 = authenticationController0.getAuthenticatedUser();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test340");
        de.htw.sdf.photoplatform.exception.common.InputError inputError2 = new de.htw.sdf.photoplatform.exception.common.InputError("/collections/photographers/{start}/{count}", "49961de64838862febaeead9e5ed74a8");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test341");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("5b077a3001f6b54eed6802448a739229", errors1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test342");
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
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user11 = userDAOImpl0.findByRoleAndEnabledFilter("5b077a3001f6b54eed6802448a739229", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test343");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setCompany("/showcase");
        java.lang.String str5 = becomePhotographer0.getIban();
        becomePhotographer0.setPhone("/users/admin/{start}/{count}");
        java.lang.String str8 = becomePhotographer0.getPaypalID();
        becomePhotographer0.setSwift("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str11 = becomePhotographer0.getSwift();
        becomePhotographer0.setSwift("null:1528137269023:a165acffd0d2c313e6fa2c2dbbd2dc76");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str11.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test344");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.Long long2 = imageData1.getCode();
        imageData1.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test345");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        int i6 = responseError5.getStatus();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str7 = responseError5.getErrors();
        org.junit.Assert.assertNotNull(responseError5);
        org.junit.Assert.assertTrue(i6 == 400);
        org.junit.Assert.assertNotNull(map_str_list_str7);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test346");
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
        java.lang.String str17 = photographerData0.getPhone();
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "/collections/{collectionId}/images" + "'", str17.equals("/collections/{collectionId}/images"));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test347");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role6 = userRole5.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role7 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole5.setRole(role7);
        de.htw.sdf.photoplatform.persistence.model.Role role9 = userRole5.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role10 = userRole5.getRole();
        try {
            roleDAOImpl0.create(role10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(role6);
        org.junit.Assert.assertNotNull(role9);
        org.junit.Assert.assertNotNull(role10);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test348");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setName("/photographer/upload");
        java.lang.String str3 = image0.toString();
        image0.setSmallThumbPath("ROLE_ADMIN");
        java.lang.String str6 = image0.getSmallThumbPath();
        java.lang.Double d7 = image0.getPrice();
        image0.setMime("/users/profile/{userId}");
        image0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ROLE_ADMIN" + "'", str6.equals("ROLE_ADMIN"));
        org.junit.Assert.assertNull(d7);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test349");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = collectionDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionDAOImpl0.findById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test350");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getSecToken();
        java.lang.Boolean b5 = userData0.isAdmin();
        userData0.setId((java.lang.Long) 1L);
        java.lang.String str8 = userData0.getPaypalID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test351");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER");
        org.springframework.web.context.request.WebRequest webRequest3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = photographerController0.handleBadRequestException(badRequestException2, webRequest3);
        int i5 = responseError4.getCode();
        org.junit.Assert.assertNotNull(responseError4);
        org.junit.Assert.assertTrue(i5 == 10000);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test352");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.toString();
        image0.setThumbPath("/user/makeadmin/{id}");
        image0.setMobileThumbPath("/user/makeadmin/{id}");
        boolean b6 = image0.isPublic();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str8 = image0.getThumbPath();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(imageData7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/user/makeadmin/{id}" + "'", str8.equals("/user/makeadmin/{id}"));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test353");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setCreationDate();
        boolean b3 = user0.isPhotographer();
        java.lang.String str4 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData5 = user0.getPhotographerData();
        user0.setEnabled(false);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(photographerData5);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test354");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.Boolean b4 = userData0.isEnabled();
        userData0.setPhone("/collections/photographers");
        userData0.setLastName("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        java.util.List<java.lang.String> list_str9 = userData0.getRoles();
        userData0.setSwift("null:1528137271348:359dea61c52e045b1b927389910fdd93");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(list_str9);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test355");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.Long long5 = imageData2.getCode();
        imageData2.setName("/users/update");
        java.lang.String str8 = imageData2.getMessageSuccess();
        imageData2.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test356");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        try {
            roleDAOImpl0.deleteById((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test357");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage2 = collection0.getCollectionImages();
        org.junit.Assert.assertNull(user1);
        org.junit.Assert.assertNull(set_collectionImage2);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test358");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("/user/login");
        userRegister0.setEmail("/users/profile/{userId}");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test359");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.lockUser("Category{name='/photographer/images/{imageId}'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test360");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage6 = collectionImageDAOImpl0.findOne((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test361");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getMessageSuccess();
        imageData2.setMobilePath("/users/update");
        java.lang.String str6 = imageData2.getSmallPath();
        java.lang.String str7 = imageData2.getMetadata();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test362");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls3 = null;
        userRoleDAOImpl0.setClazz(cls3);
        try {
            userRoleDAOImpl0.deleteById(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test363");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.Long long5 = imageData4.getId();
        imageData4.setMetadata("Collection{user=de.htw.sdf.photoplatform.persistence.model.User [ID=null], name='null'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test364");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        java.lang.String str4 = user1.getUpdatedBy();
        java.lang.String str6 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user1, (long) 10001);
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData7 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection8 = photographerData7.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array9 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection10 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection10, collection_array9);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData12 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection10);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData13 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection10);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData14 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection10);
        photographerData7.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection10);
        java.lang.String str16 = photographerData7.getPhone();
        photographerData7.setPhone("/collections/{collectionId}/images");
        java.lang.String str19 = photographerData7.getIban();
        photographerData7.setPaypalID("obfuscate");
        photographerData7.setIban("/collections/photographers/{start}/{count}");
        user1.setPhotographerData(photographerData7);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5b077a3001f6b54eed6802448a739229" + "'", str6.equals("5b077a3001f6b54eed6802448a739229"));
        org.junit.Assert.assertNull(list_collection8);
        org.junit.Assert.assertNotNull(collection_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(list_collectionData12);
        org.junit.Assert.assertNotNull(list_collectionData13);
        org.junit.Assert.assertNotNull(list_collectionData14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test365");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getSecToken();
        java.lang.Boolean b5 = userData0.isAdmin();
        java.lang.Boolean b6 = userData0.isBanned();
        java.lang.String str7 = userData0.getFirstName();
        java.lang.String str8 = userData0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test366");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity5 = xAuthTokenConfigurer4.and();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test367");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        try {
            javax.persistence.Query query5 = userImageDAOImpl0.createQuery("/user/makeadmin/{id}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test368");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.lang.String str2 = collection0.getName();
        java.lang.String str3 = collection0.getDescription();
        boolean b4 = collection0.isPublic();
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
        de.htw.sdf.photoplatform.persistence.model.Image image17 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image17.setCreatedBy("");
        image17.setPrice((java.lang.Double) 1.0d);
        java.lang.String str22 = image17.getThumbPath();
        image17.setThumbPath("ROLE_ADMIN");
        userImage14.setImage(image17);
        collection0.setThumbnail(image17);
        org.junit.Assert.assertNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test369");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user5 = userDAOImpl0.findByRoleAndEnabledFilter("/user/{name}", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test370");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        java.lang.String str2 = userRegister0.getFirstName();
        java.lang.String str3 = userRegister0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test371");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.validation.Errors errors4 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException5 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors4);
        requestLoggerInterceptor0.afterConcurrentHandlingStarted(httpServletRequest1, httpServletResponse2, (java.lang.Object) badRequestException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.Application application9 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer10 = null;
        application9.configureAsyncSupport(asyncSupportConfigurer10);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer12 = null;
        application9.configureContentNegotiation(contentNegotiationConfigurer12);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory14 = application9.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry15 = null;
        application9.addResourceHandlers(resourceHandlerRegistry15);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory17 = application9.servletContainer();
        requestLoggerInterceptor0.afterConcurrentHandlingStarted(httpServletRequest7, httpServletResponse8, (java.lang.Object) embeddedServletContainerFactory17);
        javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse20 = null;
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer21 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer21.setPhone("ROLE_ADMIN");
        becomePhotographer21.setCompany("/showcase");
        java.lang.String str26 = becomePhotographer21.getIban();
        becomePhotographer21.setPhone("/users/admin/{start}/{count}");
        java.lang.String str29 = becomePhotographer21.getPaypalID();
        becomePhotographer21.setSwift("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        org.springframework.web.servlet.ModelAndView modelAndView32 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest19, httpServletResponse20, (java.lang.Object) "Image{name='null', path='null', isPublic=false, enabled=false, price=null}", modelAndView32);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory14);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory17);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test372");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        boolean b4 = user0.isCredentialsNonExpired();
        user0.setSecToken("/user/unlock/{id}");
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test373");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setIban("obfuscate");
        java.lang.String str3 = becomePhotographer0.getSwift();
        becomePhotographer0.setPhone("/collections/photographers");
        java.lang.String str6 = becomePhotographer0.getSwift();
        becomePhotographer0.setHomepage("39c73479cb767c5a09248b3313c03447");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test374");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        imageData1.setMessageFailed("/user/register");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = imageData1.getUserData();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(userData4);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test375");
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
        userData0.setPaypalID("/user/makeadmin/{id}");
        userData0.setEmail("/user/unlock/{id}");
        java.util.List<java.lang.String> list_str17 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData0.setRoles(list_str17);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list_str12);
        org.junit.Assert.assertNotNull(list_str17);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test376");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        try {
            collectionImageDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test377");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getDescription();
        java.lang.Long long7 = imageData2.getCode();
        java.lang.String str8 = imageData2.getSmallPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test378");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor5 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException10 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor5.afterCompletion(httpServletRequest6, httpServletResponse7, (java.lang.Object) 10, (java.lang.Exception) notFoundException10);
        javax.servlet.http.HttpServletRequest httpServletRequest12 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse13 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image14 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str15 = image14.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData16 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image14);
        imageData16.setName("");
        java.lang.Double d19 = imageData16.getPrice();
        imageData16.setName("/user/enablephotographer");
        org.springframework.web.servlet.ModelAndView modelAndView22 = null;
        requestLoggerInterceptor5.postHandle(httpServletRequest12, httpServletResponse13, (java.lang.Object) "/user/enablephotographer", modelAndView22);
        javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse25 = null;
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole26 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role27 = userRole26.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role28 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole26.setRole(role28);
        de.htw.sdf.photoplatform.persistence.model.User user30 = userRole26.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user31 = userRole26.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user32 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b33 = user32.isAdmin();
        java.lang.String str34 = user32.getSecToken();
        userRole26.setUser(user32);
        de.htw.sdf.photoplatform.persistence.model.Role role36 = userRole26.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role37 = userRole26.getRole();
        org.springframework.validation.Errors errors39 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException40 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors39);
        org.springframework.validation.Errors errors42 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException43 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors42);
        int i44 = notFoundException43.getCode();
        notFoundException40.addSuppressed((java.lang.Throwable) notFoundException43);
        requestLoggerInterceptor5.afterCompletion(httpServletRequest24, httpServletResponse25, (java.lang.Object) userRole26, (java.lang.Exception) notFoundException43);
        de.htw.sdf.photoplatform.persistence.model.User user47 = userRole26.getUser();
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image48 = imageManagerImpl0.update((java.lang.Long) 10L, "null:1528137264754:37059375c02a8fd63e589326ff8446ea", (java.lang.Double) 10.0d, "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001", user47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(d19);
        org.junit.Assert.assertNull(role27);
        org.junit.Assert.assertNull(user30);
        org.junit.Assert.assertNull(user31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(role36);
        org.junit.Assert.assertNotNull(role37);
        org.junit.Assert.assertTrue(i44 == 10001);
        org.junit.Assert.assertNotNull(user47);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test379");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.servlet.config.annotation.ViewControllerRegistry viewControllerRegistry3 = null;
        application0.addViewControllers(viewControllerRegistry3);
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry5 = null;
        application0.addResourceHandlers(resourceHandlerRegistry5);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test380");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole2 = null;
        try {
            userRoleDAOImpl0.delete(userRole2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test381");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls4 = null;
        collectionCategoryDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory6 = null;
        try {
            collectionCategoryDAOImpl0.delete(collectionCategory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test382");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls5 = null;
        collectionCategoryDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory7 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        try {
            collectionCategoryDAOImpl0.create(collectionCategory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test383");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.lang.String str1 = photographerData0.getCompany();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test384");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        java.lang.String str2 = photographerData0.getIban();
        java.lang.String str3 = photographerData0.getPaypalID();
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test385");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        photographerData0.setCompany("/collections/{collectionId}/images");
        photographerData0.setPhone("/photographer/images");
        java.lang.String str6 = photographerData0.getPhone();
        photographerData0.setIban("/collections/photographers/{start}/{count}");
        photographerData0.setPhone("/user/register");
        photographerData0.setHomepage("/collections/create");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "/photographer/images" + "'", str6.equals("/photographer/images"));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test386");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry6 = null;
        application0.addResourceHandlers(resourceHandlerRegistry6);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory8 = application0.servletContainer();
        org.springframework.format.FormatterRegistry formatterRegistry9 = null;
        application0.addFormatters(formatterRegistry9);
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry11 = null;
        try {
            application0.addInterceptors(interceptorRegistry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory8);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test387");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        boolean b4 = user0.isCredentialsNonExpired();
        boolean b5 = user0.isCredentialsNonExpired();
        java.lang.String str6 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user0);
        boolean b8 = user0.isRoleIncluded("/collections/{collectionId}");
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null:1528137288598:ad8bd3d70b0b05c981518fa0961e2c2d" + "'", str6.equals("null:1528137288598:ad8bd3d70b0b05c981518fa0961e2c2d"));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test388");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        user0.setSecToken("");
        user0.setLastName("null:1528137281269:5056f29775854522e0ebd121af608756");
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test389");
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
        java.lang.String str12 = image0.getThumbPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test390");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setAccountNonLocked(true);
        boolean b6 = user1.isAccountNonExpired();
        java.lang.String str7 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user1);
        boolean b8 = user1.isAccountNonExpired();
        java.lang.String str9 = user1.getCreatedBy();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null:1528137288660:1a2c7fbd81ed38e3fb25d5bcfea287cf" + "'", str7.equals("null:1528137288660:1a2c7fbd81ed38e3fb25d5bcfea287cf"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test391");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.Boolean b4 = userData0.isEnabled();
        userData0.setId((java.lang.Long) 1L);
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
        java.lang.String str17 = userData0.getSwift();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list_str13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test392");
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
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory11 = collectionCategoryDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test393");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData6 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array11 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long12, long_array11);
        collectionData6.setImageIds((java.util.List<java.lang.Long>) arraylist_long12);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData15 = collectionData6.getImages();
        de.htw.sdf.photoplatform.persistence.model.Image image16 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str17 = image16.getMime();
        java.lang.String str18 = image16.getUpdatedBy();
        java.lang.String str19 = image16.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData20 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image16);
        java.lang.Long long21 = imageData20.getId();
        collectionData6.setThumbnail(imageData20);
        java.lang.String str23 = collectionData6.getName();
        org.springframework.validation.BindingResult bindingResult24 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData25 = photographerController0.updateCollection(collectionData6, bindingResult24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
        org.junit.Assert.assertNotNull(long_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(list_imageData15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test394");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.Application application3 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer4 = null;
        application3.configureAsyncSupport(asyncSupportConfigurer4);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer6 = null;
        application3.configureAsyncSupport(asyncSupportConfigurer6);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array8 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver9 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver9, handlerExceptionResolver_array8);
        application3.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver9);
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor12 = application3.localeChangeInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse14 = null;
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange15 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        org.springframework.web.servlet.ModelAndView modelAndView16 = null;
        localeChangeInterceptor12.postHandle(httpServletRequest13, httpServletResponse14, (java.lang.Object) userPasswordChange15, modelAndView16);
        de.htw.sdf.photoplatform.exception.common.WebFormException webFormException19 = new de.htw.sdf.photoplatform.exception.common.WebFormException(11004);
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) localeChangeInterceptor12, (java.lang.Exception) webFormException19);
        org.springframework.validation.Errors errors22 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException23 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors22);
        org.springframework.validation.Errors errors24 = notFoundException23.getErrors();
        webFormException19.addSuppressed((java.lang.Throwable) notFoundException23);
        java.lang.Throwable[] throwable_array26 = webFormException19.getSuppressed();
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(localeChangeInterceptor12);
        org.junit.Assert.assertNull(errors24);
        org.junit.Assert.assertNotNull(throwable_array26);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test395");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("/user/{name}", errors1);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test396");
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
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData13 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection14 = photographerData13.getCollections();
        user4.setPhotographerData(photographerData13);
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
        org.junit.Assert.assertNull(list_collection14);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test397");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls4 = null;
        collectionCategoryDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory6 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Category category7 = null;
        collectionCategory6.setCategory(category7);
        de.htw.sdf.photoplatform.persistence.model.Collection collection9 = collectionCategory6.getCollection();
        try {
            collectionCategoryDAOImpl0.create(collectionCategory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test398");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long6 = new java.util.ArrayList<java.lang.Long>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long6, long_array5);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long6);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData9 = collectionData0.getImages();
        java.lang.String str10 = collectionData0.getName();
        java.lang.String str11 = collectionData0.getDescription();
        org.junit.Assert.assertNotNull(long_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(list_imageData9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test399");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setSwift("/photographer/images");
        userData0.setSwift("null:1528137271848:6816eb5a920569f38c51d1b8bbf267cc");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test400");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        image0.setCreatedBy("ROLE_ADMIN");
        java.lang.String str7 = image0.toString();
        image0.setId((java.lang.Long) 1L);
        image0.setDescription("49961de64838862febaeead9e5ed74a8");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str7.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test401");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str9 = image0.getSmallThumbPath();
        image0.setMime("/users/becomephotographers");
        image0.setThumbPath("null:1528137271848:6816eb5a920569f38c51d1b8bbf267cc");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test402");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity5 = null;
        try {
            xAuthTokenConfigurer4.configure(httpSecurity5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test403");
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
        image13.setCreatedBy("");
        image13.setPrice((java.lang.Double) 1.0d);
        java.lang.String str18 = image13.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData19 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image13);
        userImage9.setImage(image13);
        de.htw.sdf.photoplatform.persistence.model.User user21 = userImage9.getOwner();
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test404");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str7 = imageData6.getMime();
        java.lang.String str8 = imageData6.getPath();
        imageData6.setThumbnailPath("/collections/addimage");
        java.lang.String str11 = imageData6.getSmallPath();
        java.lang.String str12 = imageData6.getMime();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test405");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        userData0.setIban("/collections/{collectionId}");
        java.lang.Boolean b5 = userData0.isEnabled();
        java.util.List<java.lang.String> list_str6 = userData0.getRoles();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(list_str6);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test406");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.Boolean b4 = userData0.isEnabled();
        java.lang.String str5 = userData0.getFirstName();
        userData0.setPaypalID("Category{name='null'}");
        userData0.setBanned(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test407");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory1 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = null;
        collectionCategory1.setCollection(collection2);
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = null;
        collectionCategory1.setCollection(collection4);
        de.htw.sdf.photoplatform.persistence.model.Category category6 = collectionCategory1.getCategory();
        java.util.Date date7 = collectionCategory1.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection8 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user9 = collection8.getUser();
        collectionCategory1.setCollection(collection8);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory11 = collectionCategoryDAOImpl0.update(collectionCategory1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(category6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test408");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        java.lang.Long long4 = collectionImage3.getId();
        de.htw.sdf.photoplatform.persistence.model.Image image5 = null;
        collectionImage3.setImage(image5);
        try {
            collectionImageDAOImpl0.delete(collectionImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test409");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError((int) (byte) 1, (int) (byte) 0, "/users/admin/{start}/{count}", errors3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str5 = responseError4.getErrors();
        java.lang.String str6 = responseError4.getDeveloperInfo();
        org.junit.Assert.assertNotNull(map_str_list_str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0" + "'", str6.equals("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0"));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test410");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user8 = userDAOImpl0.findByAccountLocked(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test411");
        de.htw.sdf.photoplatform.exception.common.ManagerException managerException1 = new de.htw.sdf.photoplatform.exception.common.ManagerException(0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test412");
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
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData21 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(userImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test413");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("/collections/{collectionId}");
        org.springframework.web.context.request.WebRequest webRequest3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = imageController0.handleNotFoundException(notFoundException2, webRequest3);
        int i5 = responseError4.getStatus();
        org.junit.Assert.assertNotNull(responseError4);
        org.junit.Assert.assertTrue(i5 == 404);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test414");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage5 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test415");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role4 = roleDAOImpl0.findOne((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test416");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        java.lang.String str5 = becomePhotographer0.getCompany();
        java.lang.String str6 = becomePhotographer0.getHomepage();
        becomePhotographer0.setPhone("/showcase");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test417");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        javax.persistence.EntityManager entityManager7 = roleDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role9 = roleDAOImpl0.findOne((long) 11003);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager7);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test418");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getMetadata();
        java.lang.String str7 = imageData2.getMetadata();
        java.lang.String str8 = imageData2.getSmallPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test419");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("/photographer/images/{imageId}", errors1);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test420");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getSmallPath();
        imageData2.setMobilePath("/photographer/upload");
        java.lang.String str8 = imageData2.getMime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test421");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls5 = null;
        imageDAOImpl0.setClazz(cls5);
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image8 = imageDAOImpl0.findOne((long) 11002);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test422");
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
        role10.setName("/user/register");
        org.junit.Assert.assertNull(role1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(role10);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test423");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls2 = null;
        userRoleDAOImpl0.setClazz(cls2);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole4 = userRoleDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test424");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        java.lang.Long long4 = collectionImage3.getId();
        de.htw.sdf.photoplatform.persistence.model.Image image5 = null;
        collectionImage3.setImage(image5);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage7 = collectionImageDAOImpl0.update(collectionImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test425");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        javax.persistence.EntityManager entityManager7 = userDAOImpl0.getEntityManager();
        try {
            javax.persistence.Query query9 = userDAOImpl0.createQuery("/user/makeadmin/{id}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager7);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test426");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.Boolean b1 = userData0.isAdmin();
        userData0.setEnabled(true);
        userData0.setEnabled(false);
        userData0.setSwift("null:1528137264754:37059375c02a8fd63e589326ff8446ea");
        java.lang.Boolean b8 = userData0.isAdmin();
        org.junit.Assert.assertTrue("'" + b1 + "' != '" + false + "'", b1.equals(false));
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test427");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        java.lang.String str5 = imageData2.getMetadata();
        java.lang.String str6 = imageData2.getThumbnailPath();
        imageData2.setMessageSuccess("/collections/{collectionId}/images/{imageId}");
        java.lang.String str9 = imageData2.getName();
        imageData2.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "/photographer/upload" + "'", str5.equals("/photographer/upload"));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test428");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls1 = null;
        categoryDAOImpl0.setClazz(cls1);
        try {
            categoryDAOImpl0.deleteById(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test429");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setSwift("/photographer/images");
        java.lang.String str3 = userData0.getPaypalID();
        java.lang.Boolean b4 = userData0.isEnabled();
        java.lang.Boolean b5 = userData0.isAdmin();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test430");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData1 = null;
        user0.setPhotographerData(photographerData1);
        java.util.Date date3 = null;
        user0.setUpdatedAt(date3);
        boolean b6 = user0.isRoleIncluded("/collections/update");
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test431");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("null:1528137279822:b6febc5d19820053275b806a60630a06", errors1);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test432");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor1 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest2 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse3 = null;
        org.springframework.validation.Errors errors5 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException6 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors5);
        requestLoggerInterceptor1.afterConcurrentHandlingStarted(httpServletRequest2, httpServletResponse3, (java.lang.Object) badRequestException6);
        org.springframework.web.context.request.WebRequest webRequest8 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError9 = photographerController0.handleBadRequestException(badRequestException6, webRequest8);
        de.htw.sdf.photoplatform.persistence.model.Image image10 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str11 = image10.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData12 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image10);
        java.lang.String str13 = imageData12.getMessageSuccess();
        imageData12.setMessageSuccess("");
        imageData12.setPrice((java.lang.Double) 1.0d);
        org.springframework.validation.BindingResult bindingResult18 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData19 = photographerController0.updateImage(imageData12, bindingResult18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test433");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory2 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = null;
        collectionCategory2.setCollection(collection3);
        java.util.Date date5 = collectionCategory2.getUpdatedAt();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData6 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = collectionData6.getThumbnail();
        collectionData6.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b10 = collectionData6.getPublic();
        de.htw.sdf.photoplatform.persistence.model.User user11 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b12 = user11.isAdmin();
        java.lang.String str13 = user11.getSecToken();
        boolean b14 = user11.isAccountNonLocked();
        boolean b15 = user11.isCredentialsNonExpired();
        java.lang.String str16 = user11.getLastName();
        java.lang.String str17 = user11.getFirstName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole18 = user11.getUserRoles();
        de.htw.sdf.photoplatform.persistence.model.Collection collection19 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData6, user11);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage20 = collection19.getCollectionImages();
        collectionCategory2.setCollection(collection19);
        de.htw.sdf.photoplatform.persistence.model.Category category22 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category22.setName("/user/enablephotographer");
        category22.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category22.setDescription("obfuscate");
        category22.setDescription("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        collectionCategory2.setCategory(category22);
        try {
            categoryDAOImpl0.create(category22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(imageData7);
        org.junit.Assert.assertTrue("'" + b10 + "' != '" + false + "'", b10.equals(false));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(list_userRole18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(set_collectionImage20);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test434");
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
        imageData2.setSmallPath("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
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
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test435");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.unlockUser("ROLE_BECOME_PHOTOGRAPHER");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test436");
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
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user10 = userDAOImpl0.findByAccountLocked(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test437");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        photographerData0.setCompany("/collections/{collectionId}/images");
        photographerData0.setHomepage("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        photographerData0.setIban("null:1528137288660:1a2c7fbd81ed38e3fb25d5bcfea287cf");
        org.junit.Assert.assertNull(list_collection1);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test438");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image4.setCreatedBy("");
        collectionImage3.setImage(image4);
        de.htw.sdf.photoplatform.persistence.model.Image image8 = collectionImage3.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection9 = null;
        collectionImage3.setCollection(collection9);
        de.htw.sdf.photoplatform.persistence.model.Image image11 = collectionImage3.getImage();
        de.htw.sdf.photoplatform.persistence.model.Image image12 = collectionImage3.getImage();
        de.htw.sdf.photoplatform.persistence.model.Image image13 = collectionImage3.getImage();
        try {
            collectionImageDAOImpl0.delete(collectionImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNotNull(image8);
        org.junit.Assert.assertNotNull(image11);
        org.junit.Assert.assertNotNull(image12);
        org.junit.Assert.assertNotNull(image13);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test439");
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
        collection0.setCreatedBy("/collections/{collectionId}/images");
        boolean b29 = collection0.isPublic();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(set_collectionImage14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Collection{user=null, name='null'}" + "'", str15.equals("Collection{user=null, name='null'}"));
        org.junit.Assert.assertNull(category21);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(collectionCategory_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test440");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setIban("obfuscate");
        java.lang.String str3 = becomePhotographer0.getPhone();
        becomePhotographer0.setIban("null:1528137255129:74131369d5ab98a30139e53b9d69dc36");
        java.lang.String str6 = becomePhotographer0.getIban();
        becomePhotographer0.setPaypalID("/user/{name}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null:1528137255129:74131369d5ab98a30139e53b9d69dc36" + "'", str6.equals("null:1528137255129:74131369d5ab98a30139e53b9d69dc36"));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test441");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setThumbPath("/users/admin/{start}/{count}");
        image0.setUpdatedBy("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        image0.setId((java.lang.Long) 1L);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData9 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test442");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        image0.setPrice((java.lang.Double) 100.0d);
        java.util.Date date5 = image0.getUpdatedAt();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test443");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        java.lang.String str5 = image0.toString();
        image0.setName("/collections/create");
        java.lang.String str8 = image0.getUpdatedBy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str5.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test444");
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
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user11 = userDAOImpl0.findByRoleAndEnabledFilter("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_CUSTOMER", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test445");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setUsername("/api");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData6 = null;
        user1.setPhotographerData(photographerData6);
        user1.setPassword("/user/register");
        boolean b10 = user1.isAccountNonLocked();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test446");
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
        userData11.setEnabled(false);
        java.lang.String str18 = userData11.getFirstName();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(userData10);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test447");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPassword();
        userPasswordChange0.setNewPassword("49961de64838862febaeead9e5ed74a8");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test448");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        user0.setEnabled(false);
        user0.setUsername("ROLE_CUSTOMER");
        java.lang.String str6 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user0, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "bbd35e0331b2294504855572375f9bec" + "'", str6.equals("bbd35e0331b2294504855572375f9bec"));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test449");
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
        de.htw.sdf.photoplatform.persistence.model.Image image25 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str26 = image25.getMime();
        java.lang.String str27 = image25.getUpdatedBy();
        java.lang.String str28 = image25.getSmallThumbPath();
        java.lang.String str29 = image25.getUpdatedBy();
        java.lang.String str30 = image25.toString();
        userImage21.setImage(image25);
        de.htw.sdf.photoplatform.persistence.model.User user32 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b33 = user32.isPhotographer();
        userImage21.setUser(user32);
        de.htw.sdf.photoplatform.persistence.model.Image image35 = userImage21.getImage();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage36 = userImageDAOImpl0.update(userImage21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager9);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str30.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(image35);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test450");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole4 = user1.getUserRoles();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(list_userRole4);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test451");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection7 = collectionDAOImpl0.findByUserAndCollectionId((long) 404, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test452");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        collectionData0.setPublic((java.lang.Boolean) false);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = collectionData0.getUserdata();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData5 = collectionData0.getImages();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(userData4);
        org.junit.Assert.assertNull(list_imageData5);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test453");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.lang.String str2 = collection0.getName();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory3 = collection0.getCollectionCategories();
        boolean b4 = collection0.isPublic();
        de.htw.sdf.photoplatform.persistence.model.Image image5 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str6 = image5.getMime();
        java.lang.String str7 = image5.getUpdatedBy();
        java.lang.String str8 = image5.getSmallThumbPath();
        java.lang.String str9 = image5.getUpdatedBy();
        image5.setCreatedBy("ROLE_ADMIN");
        java.lang.String str12 = image5.toString();
        image5.setId((java.lang.Long) 1L);
        java.lang.String str15 = image5.getMobileThumbPath();
        image5.setSmallThumbPath("/photographer/images");
        collection0.setThumbnail(image5);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage19 = collection0.getCollectionImages();
        org.junit.Assert.assertNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(set_collectionCategory3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str12.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(set_collectionImage19);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test454");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        image0.setMobileThumbPath("/photographer/upload");
        boolean b9 = image0.isPublic();
        image0.setThumbPath("");
        image0.setMetaData("Image{name='null', path='', isPublic=false, enabled=false, price=1.0}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test455");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole4 = userRoleDAOImpl0.findByUserId((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test456");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("/collections/addimage");
        java.lang.String str3 = userRegister0.getPassword();
        userRegister0.setFirstName("/user/enablephotographer");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test457");
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
        de.htw.sdf.photoplatform.persistence.model.User user42 = userRole21.getUser();
        de.htw.sdf.photoplatform.persistence.model.Role role43 = userRole21.getRole();
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
        org.junit.Assert.assertNotNull(user42);
        org.junit.Assert.assertNotNull(role43);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test458");
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
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData12 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData13 = collectionData12.getThumbnail();
        collectionData12.setPublic((java.lang.Boolean) false);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData16 = null;
        collectionData12.setThumbnail(imageData16);
        de.htw.sdf.photoplatform.persistence.model.Image image18 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str19 = image18.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData20 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image18);
        imageData20.setMobilePath("/users/update");
        java.lang.Long long23 = imageData20.getCode();
        imageData20.setName("/users/update");
        collectionData12.setThumbnail(imageData20);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData27 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData27.setId((java.lang.Long) 0L);
        userData27.setEnabled(false);
        userData27.setAdmin(false);
        userData27.setId((java.lang.Long) 100L);
        collectionData12.setUserdata(userData27);
        collectionData12.setId((long) (-1));
        org.springframework.validation.BindingResult bindingResult39 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection40 = photographerController0.createCollection(collectionData12, bindingResult39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str9.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
        org.junit.Assert.assertNotNull(responseError11);
        org.junit.Assert.assertNull(imageData13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(long23);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test459");
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
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard17 = user13.getAuthorities();
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(collection_wildcard17);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test460");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls5 = null;
        collectionCategoryDAOImpl0.setClazz(cls5);
        try {
            collectionCategoryDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test461");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.toString();
        java.lang.String str2 = image0.getName();
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
        boolean b18 = image0.equals((java.lang.Object) arraylist_long15);
        java.util.Date date19 = image0.getUpdatedAt();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(imageData4);
        org.junit.Assert.assertNull(imageData5);
        org.junit.Assert.assertNotNull(long_array7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(long_array14);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test462");
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
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData17 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection13);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData18 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection13);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData20 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection13, (java.lang.Boolean) false);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection13);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData22 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection13);
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
        org.junit.Assert.assertNotNull(list_collectionData17);
        org.junit.Assert.assertNotNull(list_collectionData18);
        org.junit.Assert.assertNotNull(list_collectionData20);
        org.junit.Assert.assertNotNull(list_collectionData22);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test463");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user9 = userDAOImpl0.findByAccountLocked(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test464");
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
        java.lang.String str42 = photographerData27.getPhone();
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
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "/collections/{collectionId}/images" + "'", str42.equals("/collections/{collectionId}/images"));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test465");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getIban();
        becomePhotographer0.setSwift("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str10 = becomePhotographer0.getPaypalID();
        java.lang.String str11 = becomePhotographer0.getPaypalID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test466");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        boolean b4 = user0.isCredentialsNonExpired();
        boolean b5 = user0.isCredentialsNonExpired();
        java.lang.String str6 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user0);
        user0.setAccountNonLocked(false);
        java.lang.String str9 = user0.getSecToken();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null:1528137290244:943874d4d401ee35c1fdddc6428199d7" + "'", str6.equals("null:1528137290244:943874d4d401ee35c1fdddc6428199d7"));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test467");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getMetadata();
        java.lang.String str7 = imageData2.getMetadata();
        imageData2.setPath("Category{name='null'}");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData10 = imageData2.getUserData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData11 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str12 = userData11.getLastName();
        java.util.List<java.lang.String> list_str13 = userData11.getRoles();
        java.lang.String str14 = userData11.getSecToken();
        java.lang.String str15 = userData11.getLastName();
        java.lang.String str16 = userData11.getHomepage();
        java.lang.Boolean b17 = userData11.isBanned();
        userData11.setSwift("obfuscate");
        java.lang.String str20 = userData11.getLastName();
        imageData2.setUserData(userData11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(userData10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(list_str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + b17 + "' != '" + false + "'", b17.equals(false));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test468");
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
        java.lang.String str21 = user13.getLastName();
        java.lang.String str22 = user13.getSecToken();
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str21.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test469");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole8 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user9 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b10 = user9.isPhotographer();
        userRole8.setUser(user9);
        user9.setUsername("/api");
        user9.setUsername("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        user9.setLastName("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_CUSTOMER");
        try {
            userDAOImpl0.create(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test470");
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
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage15 = collection0.getCollectionImages();
        de.htw.sdf.photoplatform.persistence.model.User user16 = collection0.getUser();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(set_collectionImage15);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test471");
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
        de.htw.sdf.photoplatform.persistence.model.User user12 = userRole0.getUser();
        org.junit.Assert.assertNull(role1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(role10);
        org.junit.Assert.assertNotNull(role11);
        org.junit.Assert.assertNotNull(user12);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test472");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setCreationDate();
        boolean b3 = user0.isPhotographer();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole4 = null;
        user0.setUserRoles(list_userRole4);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test473");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.validation.MessageCodesResolver messageCodesResolver5 = application0.getMessageCodesResolver();
        org.springframework.validation.Validator validator6 = application0.getValidator();
        org.junit.Assert.assertNull(messageCodesResolver5);
        org.junit.Assert.assertNull(validator6);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test474");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls2 = null;
        collectionImageDAOImpl0.setClazz(cls2);
        try {
            javax.persistence.Query query5 = collectionImageDAOImpl0.createQuery("/users/profile/{userId}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test475");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData4 = null;
        user1.setPhotographerData(photographerData4);
        user1.setAccountNonLocked(true);
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard8 = user1.getAuthorities();
        user1.setFirstName("ROLE_PHOTOGRAPHER");
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage11 = userImageDAOImpl0.getUserImagesBy(user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(collection_wildcard8);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test476");
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
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory16 = collection0.getCollectionCategories();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(set_collectionImage14);
        org.junit.Assert.assertNotNull(image15);
        org.junit.Assert.assertNull(set_collectionCategory16);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test477");
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
        image13.setMetaData("/collections/photographers");
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str18.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test478");
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
        de.htw.sdf.photoplatform.Application application45 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer46 = null;
        application45.configureAsyncSupport(asyncSupportConfigurer46);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer48 = null;
        application45.configureAsyncSupport(asyncSupportConfigurer48);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array50 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver51 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver51, handlerExceptionResolver_array50);
        application45.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver51);
        org.springframework.web.servlet.LocaleResolver localeResolver54 = application45.localeResolver();
        de.htw.sdf.photoplatform.Application application55 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer56 = null;
        application55.configureAsyncSupport(asyncSupportConfigurer56);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer58 = null;
        application55.configureContentNegotiation(contentNegotiationConfigurer58);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory60 = application55.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry61 = null;
        application55.addResourceHandlers(resourceHandlerRegistry61);
        org.springframework.web.servlet.LocaleResolver localeResolver63 = application55.localeResolver();
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array64 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver65 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver65, handlerMethodArgumentResolver_array64);
        application55.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver65);
        de.htw.sdf.photoplatform.Application application68 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer69 = null;
        application68.configureContentNegotiation(contentNegotiationConfigurer69);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array71 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler72 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b73 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler72, handlerMethodReturnValueHandler_array71);
        application68.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler72);
        org.springframework.format.FormatterRegistry formatterRegistry75 = null;
        application68.addFormatters(formatterRegistry75);
        de.htw.sdf.photoplatform.Application application77 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer78 = null;
        application77.configureAsyncSupport(asyncSupportConfigurer78);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer80 = null;
        application77.configureAsyncSupport(asyncSupportConfigurer80);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array82 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver83 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b84 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver83, handlerExceptionResolver_array82);
        application77.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver83);
        application68.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver83);
        application55.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver83);
        application45.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver83);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver83);
        javax.servlet.MultipartConfigElement multipartConfigElement90 = application0.multipartConfigElement();
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
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(localeResolver54);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory60);
        org.junit.Assert.assertNotNull(localeResolver63);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array82);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(multipartConfigElement90);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test479");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.toString();
        image0.setThumbPath("/user/makeadmin/{id}");
        image0.setMobileThumbPath("/user/makeadmin/{id}");
        boolean b6 = image0.isPublic();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str8 = imageData7.getMime();
        imageData7.setThumbnailPath("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(imageData7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test480");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls2 = null;
        collectionImageDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image5 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image5.setCreatedBy("");
        collectionImage4.setImage(image5);
        de.htw.sdf.photoplatform.persistence.model.Image image9 = collectionImage4.getImage();
        java.util.Date date10 = collectionImage4.getUpdatedAt();
        try {
            collectionImageDAOImpl0.delete(collectionImage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNotNull(image9);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test481");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPasswordConfirm();
        userPasswordChange0.setNewPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001");
        userPasswordChange0.setPasswordConfirm("/user/lock/{id}");
        java.lang.String str8 = userPasswordChange0.getNewPassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001" + "'", str8.equals("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001"));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test482");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage5 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image6.setCreatedBy("");
        collectionImage5.setImage(image6);
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = null;
        collectionImage5.setCollection(collection10);
        java.util.Date date12 = null;
        collectionImage5.setCreatedAt(date12);
        try {
            collectionImageDAOImpl0.delete(collectionImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test483");
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
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry12 = null;
        try {
            application0.addInterceptors(interceptorRegistry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(localeResolver8);
        org.junit.Assert.assertNull(messageCodesResolver11);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test484");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getIban();
        java.lang.String str5 = userData0.getIban();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test485");
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
            categoryManagerImpl0.delete(category5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Category{name='null'}" + "'", str6.equals("Category{name='null'}"));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test486");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.UserData> list_userData9 = userController0.getEnabledUsers((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test487");
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
        java.lang.String str14 = imageData4.getMessageFailed();
        java.lang.String str15 = imageData4.getMime();
        imageData4.setDescription("/users/update");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + d8 + "' != '" + 1.0d + "'", d8.equals(1.0d));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test488");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage5 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image6.setCreatedBy("");
        collectionImage5.setImage(image6);
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = null;
        collectionImage5.setCollection(collection10);
        java.util.Date date12 = null;
        collectionImage5.setCreatedAt(date12);
        try {
            collectionImageDAOImpl0.delete(collectionImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test489");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = null;
        try {
            collectionImageDAOImpl0.create(collectionImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test490");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        boolean b2 = collection0.isPublic();
        de.htw.sdf.photoplatform.persistence.model.User user3 = collection0.getUser();
        org.junit.Assert.assertNull(user1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test491");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("null:1528137265625:03bf1b2c50bffe4b6b17dad8841e9f70", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = imageController0.handleNotFoundException(notFoundException3, webRequest4);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user6 = imageController0.getAuthenticatedUser();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test492");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        userRegister0.setEmail("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        userRegister0.setPassword("/user/lock/{id}");
        userRegister0.setPasswordConfirm("hi!");
        userRegister0.setEmail("obfuscate");
        java.lang.String str10 = userRegister0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/user/lock/{id}" + "'", str10.equals("/user/lock/{id}"));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test493");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setIban("obfuscate");
        java.lang.String str3 = becomePhotographer0.getSwift();
        becomePhotographer0.setPhone("/collections/photographers");
        java.lang.String str6 = becomePhotographer0.getSwift();
        java.lang.String str7 = becomePhotographer0.getPhone();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/collections/photographers" + "'", str7.equals("/collections/photographers"));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test494");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setAccountNonLocked(true);
        boolean b6 = user1.isAccountNonExpired();
        java.lang.String str7 = user1.getUsername();
        user1.setEnabled(true);
        java.lang.String str10 = user1.getLastName();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test495");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
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
        try {
            collectionDAOImpl0.create(collection3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test496");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.toString();
        java.lang.String str2 = image0.getName();
        image0.setName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str5 = image0.getThumbPath();
        java.lang.String str6 = image0.getSmallThumbPath();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test497");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.Double d6 = image5.getPrice();
        image5.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str9 = image5.getUpdatedBy();
        image5.setEnabled(false);
        try {
            imageDAOImpl0.delete(image5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(d6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test498");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        imageData2.setMime("/showcase");
        imageData2.setCode((java.lang.Long) 10L);
        imageData2.setThumbnailPath("Category{name='null'}");
        imageData2.setMessageFailed("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test499");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData5 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = collectionData5.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = collectionData5.getThumbnail();
        java.lang.Long[] long_array9 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long10, long_array9);
        collectionData5.setImageIds((java.util.List<java.lang.Long>) arraylist_long10);
        collectionData5.setId((long) (short) -1);
        java.lang.Long[] long_array16 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long17 = new java.util.ArrayList<java.lang.Long>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long17, long_array16);
        collectionData5.setImageIds((java.util.List<java.lang.Long>) arraylist_long17);
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage20 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 10L, (java.lang.Long) 10L, (java.util.List<java.lang.Long>) arraylist_long17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(imageData6);
        org.junit.Assert.assertNull(imageData7);
        org.junit.Assert.assertNotNull(long_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(long_array16);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test500");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry6 = null;
        application0.addResourceHandlers(resourceHandlerRegistry6);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory8 = application0.servletContainer();
        org.springframework.format.FormatterRegistry formatterRegistry9 = null;
        application0.addFormatters(formatterRegistry9);
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry11 = null;
        application0.addResourceHandlers(resourceHandlerRegistry11);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory8);
    }
}

