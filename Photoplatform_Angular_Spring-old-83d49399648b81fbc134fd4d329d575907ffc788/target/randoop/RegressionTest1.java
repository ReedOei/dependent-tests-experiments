import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
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
        java.util.Date date16 = userImage13.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.User user17 = new de.htw.sdf.photoplatform.persistence.model.User();
        user17.setEnabled(false);
        userImage13.setOwner(user17);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage22 = userImageDAOImpl0.getPhotographImage(user17, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        boolean b6 = image0.isPublic();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage6 = userImageDAOImpl0.getOwnerImages(100L, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole4 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isPhotographer();
        userRole4.setUser(user5);
        java.lang.String str8 = userRole4.getUpdatedBy();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole9 = userRoleDAOImpl0.update(userRole4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("/photographer/images/{imageId}", errors1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        image0.setMobileThumbPath("");
        image0.setPrice((java.lang.Double) 100.0d);
        java.lang.String str6 = image0.getMime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userRole0.getUser();
        try {
            java.lang.String str3 = user2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(role1);
        org.junit.Assert.assertNull(user2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = userImageDAOImpl0.getEntityManager();
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
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage16 = userImageDAOImpl0.getPhotographImage(user11, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(role6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole4 = userRoleDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
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
        userData0.setFirstName("/api");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user8 = userDAOImpl0.findByRoleId((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors2);
        org.springframework.validation.Errors errors4 = badRequestException3.getErrors();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController0.handleBadRequestException(badRequestException3, webRequest5);
        java.lang.String str7 = badRequestException3.toString();
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER" + "'", str7.equals("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
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
        org.springframework.format.FormatterRegistry formatterRegistry11 = null;
        application0.addFormatters(formatterRegistry11);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer13 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer13);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer15 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer15);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
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
            java.lang.String str20 = photographerController0.updateCollectionShowcase("");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i14 == 10001);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
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
        de.htw.sdf.photoplatform.persistence.model.Role role16 = userRole6.getRole();
        de.htw.sdf.photoplatform.persistence.model.User user17 = null;
        userRole6.setUser(user17);
        de.htw.sdf.photoplatform.persistence.model.Role role19 = userRole6.getRole();
        try {
            userRoleDAOImpl0.create(userRole6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(role7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(role16);
        org.junit.Assert.assertNotNull(role19);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls3 = null;
        collectionCategoryDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionCategoryDAOImpl0.getEntityManager();
        try {
            collectionCategoryDAOImpl0.deleteById(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER", errors1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage6 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        try {
            collectionImageDAOImpl0.delete(collectionImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setCompany("/showcase");
        java.lang.String str5 = becomePhotographer0.getIban();
        becomePhotographer0.setPhone("/users/admin/{start}/{count}");
        java.lang.String str8 = becomePhotographer0.getPaypalID();
        java.lang.String str9 = becomePhotographer0.getPaypalID();
        becomePhotographer0.setSwift("/collections/addimage");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
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
        userData0.setIban("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.unlockUser("/user/enablephotographer");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        boolean b4 = user0.isCredentialsNonExpired();
        java.lang.String str5 = user0.getLastName();
        boolean b6 = user0.isEnabled();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
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
        de.htw.sdf.photoplatform.persistence.model.User user18 = new de.htw.sdf.photoplatform.persistence.model.User();
        user18.setEnabled(false);
        userImage14.setOwner(user18);
        java.lang.String str22 = user18.getPassword();
        java.lang.String str23 = user18.getUsername();
        user18.setLastName("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        boolean b27 = user18.isRoleIncluded("");
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage28 = userImageDAOImpl0.getPhotographImages(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getMessageSuccess();
        imageData2.setMobilePath("/users/update");
        java.lang.String str6 = imageData2.getSmallPath();
        java.lang.String str7 = imageData2.getName();
        java.lang.String str8 = imageData2.getMime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setUsername("/api");
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getCreatedBy();
        try {
            boolean b9 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("/user/register", (org.springframework.security.core.userdetails.UserDetails) user2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        try {
            imageDAOImpl0.deleteById((long) 404);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.Double d1 = image0.getPrice();
        image0.setMobileThumbPath("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        org.junit.Assert.assertNull(d1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData8 = photographerController0.getShowcase((int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController1 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException4 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors3);
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController1.handleBadRequestException(badRequestException4, webRequest5);
        org.springframework.web.context.request.WebRequest webRequest7 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError8 = authenticationController0.handleBadRequestException(badRequestException4, webRequest7);
        int i9 = responseError8.getStatus();
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
        org.junit.Assert.assertTrue(i9 == 400);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.servlet.config.annotation.ViewControllerRegistry viewControllerRegistry3 = null;
        application0.addViewControllers(viewControllerRegistry3);
        org.springframework.web.servlet.config.annotation.ViewControllerRegistry viewControllerRegistry5 = null;
        application0.addViewControllers(viewControllerRegistry5);
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry7 = null;
        try {
            application0.addInterceptors(interceptorRegistry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user5 = userDAOImpl0.findByAccountLocked(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPasswordConfirm();
        java.lang.String str4 = userPasswordChange0.getPasswordConfirm();
        userPasswordChange0.setPasswordConfirm("/user/enablephotographer");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        image0.setMobileThumbPath("");
        image0.setPrice((java.lang.Double) 100.0d);
        image0.setMime("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10000");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        try {
            javax.persistence.Query query6 = roleDAOImpl0.createQuery("/collections/{collectionId}/images/{imageId}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
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
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData11 = collectionData10.getThumbnail();
        collectionData10.setPublic((java.lang.Boolean) false);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData14 = null;
        collectionData10.setThumbnail(imageData14);
        de.htw.sdf.photoplatform.persistence.model.Image image16 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str17 = image16.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData18 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image16);
        imageData18.setMobilePath("/users/update");
        java.lang.Long long21 = imageData18.getCode();
        imageData18.setName("/users/update");
        collectionData10.setThumbnail(imageData18);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData25 = collectionData10.getThumbnail();
        org.springframework.validation.BindingResult bindingResult26 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData27 = photographerController0.updateImage(imageData25, bindingResult26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertNull(imageData11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(long21);
        org.junit.Assert.assertNotNull(imageData25);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls2 = null;
        categoryDAOImpl0.setClazz(cls2);
        try {
            categoryDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getEmail();
        userData0.setPhone("/photographer/images");
        userData0.setPhone("ec7908a224b49d37ffc84c612f320838");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister1 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister1.setLastName("/collections/addimage");
        java.lang.String str4 = userRegister1.getPassword();
        org.springframework.validation.BindingResult bindingResult5 = null;
        try {
            authenticationController0.register(userRegister1, bindingResult5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
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
        de.htw.sdf.photoplatform.persistence.model.Image image11 = collectionImage6.getImage();
        java.util.Date date12 = collectionImage6.getUpdatedAt();
        try {
            collectionImageDAOImpl0.delete(collectionImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
        org.junit.Assert.assertNotNull(image11);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
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
        imageData2.setName("/index.html");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPaypalID("/photographer/images/{imageId}");
        java.lang.String str5 = becomePhotographer0.getSwift();
        becomePhotographer0.setCompany("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        java.lang.String str8 = becomePhotographer0.getIban();
        java.lang.String str9 = becomePhotographer0.getPaypalID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "/photographer/images/{imageId}" + "'", str9.equals("/photographer/images/{imageId}"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage2 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image3.setCreatedBy("");
        collectionImage2.setImage(image3);
        de.htw.sdf.photoplatform.persistence.model.Image image7 = collectionImage2.getImage();
        java.util.Date date8 = collectionImage2.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection9 = null;
        collectionImage2.setCollection(collection9);
        try {
            collectionImageDAOImpl0.delete(collectionImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNotNull(image7);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        org.springframework.validation.Errors errors5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors5);
        int i7 = notFoundException6.getCode();
        notFoundException3.addSuppressed((java.lang.Throwable) notFoundException6);
        org.springframework.web.context.request.WebRequest webRequest9 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError10 = imageController0.handleNotFoundException(notFoundException6, webRequest9);
        int i11 = responseError10.getCode();
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertNotNull(responseError10);
        org.junit.Assert.assertTrue(i11 == 10001);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer7 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        java.lang.String str8 = becomePhotographer7.getCompany();
        org.springframework.validation.BindingResult bindingResult9 = null;
        try {
            boolean b10 = userController0.becomePhotographer(becomePhotographer7, bindingResult9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage6 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 100L, 10001, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
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
        java.lang.String str16 = imageData8.getMime();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "/showcase" + "'", str16.equals("/showcase"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData2 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData3 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str4 = userData3.getLastName();
        java.util.List<java.lang.String> list_str5 = userData3.getRoles();
        collectionData0.setUserdata(userData3);
        java.lang.String str7 = userData3.getCompany();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(list_imageData2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(list_str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        java.lang.String str1 = de.htw.sdf.photoplatform.security.TokenUtils.getUserNameFromToken("/collections/showcase");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "/collections/showcase" + "'", str1.equals("/collections/showcase"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
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
            java.lang.String str11 = photographerController0.deletePhotographersImage((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
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
            java.lang.String str11 = photographerController0.deleteCollection((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array0 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection1 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1, collection_array0);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData3 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData4 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(collection_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_collectionData3);
        org.junit.Assert.assertNotNull(list_collectionData4);
        org.junit.Assert.assertNotNull(list_collectionData6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException1 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException((int) (short) -1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
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
        try {
            collectionImageDAOImpl0.create(collectionImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(image8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister3 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister3.setLastName("/collections/addimage");
        userRegister3.setLastName("/user/becomePhotographer");
        java.lang.String str8 = userRegister3.getEmail();
        try {
            boolean b9 = requestLoggerInterceptor0.preHandle(httpServletRequest1, httpServletResponse2, (java.lang.Object) str8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        de.htw.sdf.photoplatform.persistence.model.User user4 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b5 = user4.isAdmin();
        java.lang.String str6 = user4.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData7 = null;
        user4.setPhotographerData(photographerData7);
        java.lang.String str9 = user4.toString();
        boolean b10 = user4.isAccountNonExpired();
        try {
            userDAOImpl0.create(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str9.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
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
        java.lang.String str16 = image15.getMime();
        java.lang.String str17 = image15.getUpdatedBy();
        java.lang.String str18 = image15.getSmallThumbPath();
        java.lang.String str19 = image15.getUpdatedBy();
        java.lang.String str20 = image15.toString();
        userImage11.setImage(image15);
        try {
            userImageDAOImpl0.create(userImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str20.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        try {
            userRoleDAOImpl0.deleteById((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls6 = null;
        userRoleDAOImpl0.setClazz(cls6);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole8 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role9 = userRole8.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role10 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole8.setRole(role10);
        de.htw.sdf.photoplatform.persistence.model.User user12 = userRole8.getUser();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole13 = userRoleDAOImpl0.update(userRole8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(role9);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        try {
            javax.persistence.Query query5 = collectionCategoryDAOImpl0.createQuery("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        de.htw.sdf.photoplatform.manager.impl.HashManagerImpl hashManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.HashManagerImpl();
        try {
            java.lang.String str3 = hashManagerImpl0.hash("/user/lock/{id}", "ROLE_PHOTOGRAPHER");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls4 = null;
        userDAOImpl0.setClazz(cls4);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user7 = userDAOImpl0.findByEmail("/user/enablephotographer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        try {
            userDAOImpl0.deleteById(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getMessageSuccess();
        imageData2.setMobilePath("/users/update");
        imageData2.setPrice((java.lang.Double) 100.0d);
        imageData2.setPath("/user/enablephotographer");
        java.lang.String str10 = imageData2.getMime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = null;
        collectionData0.setUserdata(userData2);
        java.lang.String str4 = collectionData0.getName();
        long long5 = collectionData0.getId();
        collectionData0.setId(1L);
        de.htw.sdf.photoplatform.persistence.model.User user8 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b9 = user8.isBecomePhotographer();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection10 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData0, user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        try {
            collectionImageDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user5 = collection4.getUser();
        java.lang.String str6 = collection4.getName();
        try {
            collectionDAOImpl0.create(collection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.Long long5 = imageData4.getId();
        java.lang.String str6 = imageData4.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory2 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = null;
        collectionCategory2.setCollection(collection3);
        de.htw.sdf.photoplatform.persistence.model.Category category5 = new de.htw.sdf.photoplatform.persistence.model.Category();
        collectionCategory2.setCategory(category5);
        try {
            categoryDAOImpl0.delete(category5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
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
        userData15.setFirstName("null:1528137248666:32ad08d7594d28504f1460b47d9ec391");
        userData15.setId((java.lang.Long) 10L);
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
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
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
        imageData15.setPath("");
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNotNull(imageData15);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls1 = null;
        collectionCategoryDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory3 = null;
        try {
            collectionCategoryDAOImpl0.create(collectionCategory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
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
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData11 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(category5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
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
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData19 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData20 = collectionData19.getThumbnail();
        collectionData19.setPublic((java.lang.Boolean) false);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData23 = null;
        collectionData19.setThumbnail(imageData23);
        de.htw.sdf.photoplatform.persistence.model.Image image25 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str26 = image25.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData27 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image25);
        imageData27.setMobilePath("/users/update");
        java.lang.Long long30 = imageData27.getCode();
        imageData27.setName("/users/update");
        collectionData19.setThumbnail(imageData27);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData34 = collectionData19.getThumbnail();
        org.springframework.validation.BindingResult bindingResult35 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData36 = photographerController0.updateCollection(collectionData19, bindingResult35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i14 == 10001);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
        org.junit.Assert.assertNull(imageData20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(long30);
        org.junit.Assert.assertNotNull(imageData34);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isBecomePhotographer();
        user1.setUsername("ROLE_BECOME_PHOTOGRAPHER");
        boolean b6 = user1.isRoleIncluded("/photographer/images");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor7 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse9 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException12 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor7.afterCompletion(httpServletRequest8, httpServletResponse9, (java.lang.Object) 10, (java.lang.Exception) notFoundException12);
        javax.servlet.http.HttpServletRequest httpServletRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage16 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView17 = null;
        requestLoggerInterceptor7.postHandle(httpServletRequest14, httpServletResponse15, (java.lang.Object) userImage16, modelAndView17);
        de.htw.sdf.photoplatform.persistence.model.Image image19 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str20 = image19.toString();
        image19.setThumbPath("/user/makeadmin/{id}");
        boolean b23 = image19.isEnabled();
        image19.setPublic(true);
        userImage16.setImage(image19);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage27 = photographerManagerImpl0.createPhotographImage(user1, image19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str20.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        try {
            javax.persistence.Query query5 = collectionDAOImpl0.createQuery("/photographer/images/{imageId}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors1);
        java.lang.String str3 = badRequestException2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_CUSTOMER" + "'", str3.equals("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_CUSTOMER"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setEnabled(false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setUsername("/api");
        java.lang.String str7 = user2.getUsername();
        try {
            boolean b8 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("/users/update", (org.springframework.security.core.userdetails.UserDetails) user2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/api" + "'", str7.equals("/api"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
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
            java.lang.String str11 = photographerController0.updateCollectionShowcase("");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        java.lang.String str2 = userRegister0.getFirstName();
        java.lang.String str3 = userRegister0.getFirstName();
        java.lang.String str4 = userRegister0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        image0.setMobileThumbPath("/photographer/upload");
        boolean b9 = image0.isEnabled();
        image0.setPrice((java.lang.Double) 1.0d);
        image0.setPath("");
        java.lang.String str14 = image0.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Image{name='null', path='', isPublic=false, enabled=false, price=1.0}" + "'", str14.equals("Image{name='null', path='', isPublic=false, enabled=false, price=1.0}"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls4 = null;
        imageDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image6.setCreatedBy("");
        image6.setPrice((java.lang.Double) 1.0d);
        java.lang.String str11 = image6.getDescription();
        java.lang.String str12 = image6.getMime();
        image6.setMobileThumbPath("/photographer/upload");
        image6.setPrice((java.lang.Double) 1.0d);
        boolean b17 = image6.isEnabled();
        try {
            imageDAOImpl0.create(image6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setThumbPath("/users/admin/{start}/{count}");
        java.util.Date date5 = image0.getCreatedAt();
        image0.setName("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
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
            java.lang.String str20 = photographerController0.deleteCollection((java.lang.Long) 1L);
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user6 = userDAOImpl0.findByRoleId((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role4 = roleDAOImpl0.findByName("/user/becomePhotographer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getSwift();
        becomePhotographer0.setIban("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str10 = becomePhotographer0.getSwift();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/users/admin/{start}/{count}" + "'", str7.equals("/users/admin/{start}/{count}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/users/admin/{start}/{count}" + "'", str10.equals("/users/admin/{start}/{count}"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.lockUser("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image4.setCreatedBy("");
        collectionImage3.setImage(image4);
        de.htw.sdf.photoplatform.persistence.model.Collection collection8 = null;
        collectionImage3.setCollection(collection8);
        java.util.Date date10 = null;
        collectionImage3.setCreatedAt(date10);
        try {
            collectionImageDAOImpl0.delete(collectionImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = collectionData0.getThumbnail();
        java.lang.Boolean b3 = collectionData0.getPublic();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(imageData2);
        org.junit.Assert.assertNull(b3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        java.lang.String str3 = becomePhotographer0.getIban();
        java.lang.String str4 = becomePhotographer0.getPaypalID();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData2 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData3 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str4 = userData3.getLastName();
        java.util.List<java.lang.String> list_str5 = userData3.getRoles();
        collectionData0.setUserdata(userData3);
        java.lang.String str7 = userData3.getIban();
        userData3.setCompany("/user/enablephotographer");
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(list_imageData2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(list_str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            org.springframework.security.core.userdetails.UserDetails userDetails5 = userDAOImpl0.loadUserByUsername("/users/update");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isBecomePhotographer();
        user0.setFirstName("/index.html");
        user0.setId((java.lang.Long) (-1L));
        java.util.Date date6 = null;
        user0.setUpdatedAt(date6);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData6 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = collectionData6.getThumbnail();
        collectionData6.setPublic((java.lang.Boolean) false);
        org.springframework.validation.BindingResult bindingResult10 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection11 = photographerController0.createCollection(collectionData6, bindingResult10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
        org.junit.Assert.assertNull(imageData7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.BindingResult bindingResult2 = null;
        try {
            java.lang.String str3 = photographerController0.addImageToCollection("null:1528137248666:32ad08d7594d28504f1460b47d9ec391", bindingResult2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
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
        user13.setPassword("/user/makeadmin/{id}");
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage2 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image3.setCreatedBy("");
        collectionImage2.setImage(image3);
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = collectionImage2.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Collection collection8 = null;
        collectionImage2.setCollection(collection8);
        collectionImage2.setCreatedBy("/collections/{collectionId}/images");
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage12 = collectionImageDAOImpl0.update(collectionImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(collection7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setName("/photographer/upload");
        java.lang.String str3 = image0.getThumbPath();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getSmallPath();
        imageData2.setMobilePath("/photographer/upload");
        imageData2.setName("/user/enablephotographer");
        java.lang.String str10 = imageData2.getThumbnailPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        de.htw.sdf.photoplatform.exception.common.InputError inputError2 = new de.htw.sdf.photoplatform.exception.common.InputError("hi!", "/api");
        java.lang.String str3 = inputError2.getFieldName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage5 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPasswordConfirm();
        userPasswordChange0.setNewPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001");
        userPasswordChange0.setNewPassword("/user/lock/{id}");
        java.lang.String str8 = userPasswordChange0.getPasswordConfirm();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
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
            userRoleDAOImpl0.delete(userRole3);
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        de.htw.sdf.photoplatform.manager.impl.HashManagerImpl hashManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.HashManagerImpl();
        java.lang.String str2 = hashManagerImpl0.hash("/user/becomePhotographer");
        java.lang.String str4 = hashManagerImpl0.hash("/collections/showcase");
        try {
            java.lang.String str7 = hashManagerImpl0.hash("/user/enablephotographer", "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c" + "'", str2.equals("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9" + "'", str4.equals("4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor3 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException8 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor3.afterCompletion(httpServletRequest4, httpServletResponse5, (java.lang.Object) 10, (java.lang.Exception) notFoundException8);
        javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse11 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage12 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView13 = null;
        requestLoggerInterceptor3.postHandle(httpServletRequest10, httpServletResponse11, (java.lang.Object) userImage12, modelAndView13);
        de.htw.sdf.photoplatform.persistence.model.Image image15 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str16 = image15.getMime();
        java.lang.String str17 = image15.getUpdatedBy();
        java.lang.String str18 = image15.getSmallThumbPath();
        image15.setCreatedBy("/collections/addimage");
        image15.setEnabled(true);
        userImage12.setImage(image15);
        try {
            userImageDAOImpl0.delete(userImage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
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
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData11 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(category5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
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
        java.lang.Boolean b17 = collectionData0.getPublic();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(b16);
        org.junit.Assert.assertNull(b17);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls3 = null;
        collectionCategoryDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionCategoryDAOImpl0.getEntityManager();
        try {
            collectionCategoryDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls4 = null;
        userDAOImpl0.setClazz(cls4);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user7 = userDAOImpl0.findByEmail("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_CUSTOMER");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setAccountNonLocked(true);
        boolean b6 = user1.isAccountNonLocked();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        try {
            imageDAOImpl0.deleteById((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole6 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole7 = userRoleDAOImpl0.update(userRole6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
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
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData12 = photographerController0.getPhotographersImages((int) 'a', 400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user6 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b7 = user6.isPhotographer();
        userRole5.setUser(user6);
        user6.setUsername("/api");
        java.lang.String str11 = user6.getFirstName();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage12 = userImageDAOImpl0.getPhotographImages(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData8 = photographerController0.getPhotographersImages((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionImageDAOImpl0.getEntityManager();
        try {
            javax.persistence.Query query7 = collectionImageDAOImpl0.createQuery("/api");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionCategoryDAOImpl0.getEntityManager();
        try {
            javax.persistence.Query query6 = collectionCategoryDAOImpl0.createQuery("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        user0.setAccountNonLocked(true);
        boolean b7 = user0.isEnabled();
        java.lang.String str8 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null:1528137263387:737fa038c16b05aadddbb7d717b9f93f" + "'", str8.equals("null:1528137263387:737fa038c16b05aadddbb7d717b9f93f"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection6 = collectionDAOImpl0.findById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getIban();
        becomePhotographer0.setSwift("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        becomePhotographer0.setPaypalID("/user/register");
        becomePhotographer0.setCompany("/showcase");
        java.lang.String str14 = becomePhotographer0.getHomepage();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setUsername("/api");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData7 = null;
        user2.setPhotographerData(photographerData7);
        try {
            java.lang.Boolean b9 = userManagerImpl0.isUserAdmin(user2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls1 = null;
        collectionCategoryDAOImpl0.setClazz(cls1);
        try {
            collectionCategoryDAOImpl0.deleteById((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        java.util.List<java.lang.String> list_str3 = userData0.getRoles();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(list_str3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        org.springframework.security.core.userdetails.UserDetailsService userDetailsService0 = null;
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer(userDetailsService0);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity2 = null;
        xAuthTokenConfigurer1.setBuilder(httpSecurity2);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity4 = null;
        xAuthTokenConfigurer1.init(httpSecurity4);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity6 = null;
        xAuthTokenConfigurer1.setBuilder(httpSecurity6);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity8 = null;
        try {
            xAuthTokenConfigurer1.configure(httpSecurity8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.persistence.model.Category category9 = new de.htw.sdf.photoplatform.persistence.model.Category();
        java.lang.String str10 = category9.toString();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController11 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors13 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException14 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors13);
        org.springframework.validation.Errors errors15 = badRequestException14.getErrors();
        org.springframework.web.context.request.WebRequest webRequest16 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError17 = photographerController11.handleBadRequestException(badRequestException14, webRequest16);
        requestLoggerInterceptor0.afterCompletion(httpServletRequest7, httpServletResponse8, (java.lang.Object) category9, (java.lang.Exception) badRequestException14);
        int i19 = badRequestException14.getCode();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Category{name='null'}" + "'", str10.equals("Category{name='null'}"));
        org.junit.Assert.assertNull(errors15);
        org.junit.Assert.assertNotNull(responseError17);
        org.junit.Assert.assertTrue(i19 == 10000);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionCategoryDAOImpl0.getEntityManager();
        try {
            collectionCategoryDAOImpl0.deleteById((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user6 = userDAOImpl0.findByRoleAndEnabledFilter("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.toString();
        java.lang.String str2 = image0.getName();
        image0.setPublic(false);
        image0.setPath("Category{name='null'}");
        java.lang.String str7 = image0.getMime();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls3 = null;
        collectionCategoryDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionCategoryDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory7 = collectionCategoryDAOImpl0.findOne((long) 404);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls3 = null;
        collectionCategoryDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory6 = collectionCategoryDAOImpl0.findOne((long) 10000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionImageDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage7 = collectionImageDAOImpl0.findOne((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        boolean b5 = image0.isEnabled();
        java.lang.String str6 = image0.getThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData7 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str8 = userData7.getLastName();
        java.util.List<java.lang.String> list_str9 = userData7.getRoles();
        java.lang.String str10 = userData7.getSwift();
        java.lang.Boolean b11 = userData7.isEnabled();
        userData7.setPhone("/collections/photographers");
        java.lang.Long long14 = userData7.getId();
        java.lang.String str15 = userData7.getPaypalID();
        boolean b16 = image0.equals((java.lang.Object) str15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setMetaData("");
        image0.setEnabled(true);
        image0.setCreatedBy("obfuscate");
        image0.setThumbPath("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role4 = roleDAOImpl0.findOne((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData0 = new de.htw.sdf.photoplatform.webservice.dto.ImageData();
        imageData0.setCode((java.lang.Long) 10L);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage5 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image6.setCreatedBy("");
        collectionImage5.setImage(image6);
        de.htw.sdf.photoplatform.persistence.model.Image image10 = collectionImage5.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection11 = null;
        collectionImage5.setCollection(collection11);
        try {
            collectionImageDAOImpl0.delete(collectionImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(image10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image4.setCreatedBy("");
        collectionImage3.setImage(image4);
        de.htw.sdf.photoplatform.persistence.model.Collection collection8 = collectionImage3.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Collection collection9 = null;
        collectionImage3.setCollection(collection9);
        collectionImage3.setCreatedBy("/collections/{collectionId}/images");
        try {
            collectionImageDAOImpl0.create(collectionImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = image0.getCreatedBy();
        image0.setThumbPath("/user/login");
        java.util.Date date5 = null;
        image0.setUpdatedAt(date5);
        java.util.Date date7 = image0.getUpdatedAt();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.Long long5 = imageData2.getCode();
        imageData2.setName("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = imageData2.getUserData();
        imageData2.setMetadata("Category{name='null'}");
        java.lang.Double d11 = imageData2.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(userData8);
        org.junit.Assert.assertNull(d11);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
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
        de.htw.sdf.photoplatform.persistence.model.Image image19 = userImage14.getImage();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage20 = userImageDAOImpl0.update(userImage14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNull(image19);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
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
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage11 = collectionImageDAOImpl0.update(collectionImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(image8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionCategoryDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory5 = collectionCategoryDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = collectionDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role6 = userRole5.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role7 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole5.setRole(role7);
        java.lang.String str9 = role7.getName();
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role10 = roleDAOImpl0.update(role7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(role6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls6 = null;
        userRoleDAOImpl0.setClazz(cls6);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole9 = userRoleDAOImpl0.findByUserId((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
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
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData12 = photographerController0.getShowcase((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.lockUser("/photographer/upload");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        java.lang.String str3 = userData0.getHomepage();
        userData0.setSecToken("/collections/addimage");
        userData0.setPaypalID("/collections/{collectionId}/images/{imageId}");
        java.lang.Long long8 = userData0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
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
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer11 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer11);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
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
        org.springframework.validation.BindingResult bindingResult20 = null;
        try {
            java.lang.String str21 = photographerController0.addImageToCollection("null:1528137250344:31149e863206f62132f4465a1c878d2c", bindingResult20);
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
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setUsername("/api");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData6 = null;
        user1.setPhotographerData(photographerData6);
        user1.setPassword("/user/register");
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData10 = new de.htw.sdf.photoplatform.webservice.dto.UserData(user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user0 = null;
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.UserData> list_userData1 = de.htw.sdf.photoplatform.webservice.util.UserUtility.convertToUserData(list_user0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user5 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image6 = imageManagerImpl0.update((java.lang.Long) 0L, "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception", (java.lang.Double) 1.0d, "ROLE_CUSTOMER", user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException1 = new de.htw.sdf.photoplatform.exception.NotFoundException("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister1 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister1.setLastName("/collections/addimage");
        java.lang.String str4 = userRegister1.getLastName();
        org.springframework.validation.BindingResult bindingResult5 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData6 = authenticationController0.login((de.htw.sdf.photoplatform.webservice.dto.UserCredential) userRegister1, bindingResult5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/collections/addimage" + "'", str4.equals("/collections/addimage"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.lockUser("de.htw.sdf.photoplatform.exception.NotFoundException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage8 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 1L, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Role role6 = null;
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user7 = userDAOImpl0.findByRole(role6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls1 = null;
        collectionCategoryDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.Category category3 = new de.htw.sdf.photoplatform.persistence.model.Category();
        java.lang.String str4 = category3.toString();
        java.lang.String str5 = category3.getName();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory6 = collectionCategoryDAOImpl0.getCollectionCategoryBy(category3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Category{name='null'}" + "'", str4.equals("Category{name='null'}"));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
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
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister23 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str24 = userRegister23.getPassword();
        userRegister23.setPassword("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        org.springframework.validation.BindingResult bindingResult27 = null;
        try {
            authenticationController0.register(userRegister23, bindingResult27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
        org.junit.Assert.assertTrue(i16 == 10001);
        org.junit.Assert.assertNotNull(responseError19);
        org.junit.Assert.assertNotNull(throwable_array20);
        org.junit.Assert.assertNotNull(responseError22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity4 = null;
        xAuthTokenConfigurer3.init(httpSecurity4);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity6 = null;
        try {
            xAuthTokenConfigurer3.configure(httpSecurity6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = null;
        try {
            imageDAOImpl0.create(image2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
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
        de.htw.sdf.photoplatform.persistence.model.Image image13 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str14 = image13.getMime();
        java.lang.String str15 = image13.getUpdatedBy();
        java.lang.String str16 = image13.getSmallThumbPath();
        image13.setCreatedBy("/collections/addimage");
        image13.setEnabled(true);
        userImage10.setImage(image13);
        try {
            imageManagerImpl0.delete(image13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry6 = null;
        application0.addResourceHandlers(resourceHandlerRegistry6);
        org.springframework.format.FormatterRegistry formatterRegistry8 = null;
        application0.addFormatters(formatterRegistry8);
        org.springframework.validation.Validator validator10 = application0.getValidator();
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNull(validator10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getIban();
        becomePhotographer0.setSwift("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        becomePhotographer0.setPaypalID("/user/register");
        becomePhotographer0.setCompany("/photographer/images");
        becomePhotographer0.setPhone("/photographer/upload");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData8.setPrice((java.lang.Double) (-1.0d));
        imageData8.setDescription("/collections/photographers/{start}/{count}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException1 = new de.htw.sdf.photoplatform.exception.BadRequestException("/collections/photographers/{start}/{count}");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userRoleDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole8 = userRoleDAOImpl0.findByUserId((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user8 = userDAOImpl0.findByRoleId((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.Boolean b1 = userData0.isAdmin();
        userData0.setSecToken("Category{name='null'}");
        org.junit.Assert.assertTrue("'" + b1 + "' != '" + false + "'", b1.equals(false));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException1 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException(100);
        java.lang.Throwable[] throwable_array2 = authorizationException1.getSuppressed();
        org.springframework.validation.Errors errors3 = authorizationException1.getErrors();
        org.junit.Assert.assertNotNull(throwable_array2);
        org.junit.Assert.assertNull(errors3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getIban();
        userData0.setAdmin(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role5 = roleDAOImpl0.getAdmin();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory4 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = null;
        collectionCategory4.setCollection(collection5);
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = null;
        collectionCategory4.setCollection(collection7);
        de.htw.sdf.photoplatform.persistence.model.Category category9 = collectionCategory4.getCategory();
        java.util.Date date10 = collectionCategory4.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection11 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user12 = collection11.getUser();
        collectionCategory4.setCollection(collection11);
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection14 = collectionDAOImpl0.update(collection11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(category9);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userRoleDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole8 = userRoleDAOImpl0.findByUserId((java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData4 = null;
        user1.setPhotographerData(photographerData4);
        java.lang.String str6 = user1.toString();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard7 = user1.getAuthorities();
        boolean b9 = user1.isRoleIncluded("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        try {
            boolean b10 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("ROLE_BECOME_PHOTOGRAPHER", (org.springframework.security.core.userdetails.UserDetails) user1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str6.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertNull(collection_wildcard7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        java.lang.String str1 = userPasswordChange0.getNewPassword();
        java.lang.String str2 = userPasswordChange0.getPasswordConfirm();
        userPasswordChange0.setNewPassword("de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors2);
        org.springframework.validation.Errors errors4 = badRequestException3.getErrors();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController0.handleBadRequestException(badRequestException3, webRequest5);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData9 = photographerController0.getCollections(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = null;
        try {
            java.lang.Boolean b3 = userManagerImpl0.isRoleIncluded(user1, "/users/admin/{start}/{count}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        try {
            collectionImageDAOImpl0.deleteById(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection4 = collectionDAOImpl0.findOne((long) 10001);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection6 = collectionDAOImpl0.findById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.Double d1 = image0.getPrice();
        image0.setName("/photographer/images/{imageId}");
        image0.setMetaData("null:1528137255129:74131369d5ab98a30139e53b9d69dc36");
        org.junit.Assert.assertNull(d1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors1);
        org.springframework.validation.Errors errors4 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors4);
        int i6 = notFoundException5.getCode();
        notFoundException2.addSuppressed((java.lang.Throwable) notFoundException5);
        java.lang.String str8 = notFoundException5.toString();
        org.junit.Assert.assertTrue(i6 == 10001);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str8.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls5 = null;
        imageDAOImpl0.setClazz(cls5);
        try {
            javax.persistence.Query query8 = imageDAOImpl0.createQuery("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setIban("obfuscate");
        java.lang.String str3 = becomePhotographer0.getSwift();
        java.lang.String str4 = becomePhotographer0.getPhone();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
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
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData19 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData20 = collectionData19.getThumbnail();
        collectionData19.setPublic((java.lang.Boolean) false);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData23 = null;
        collectionData19.setThumbnail(imageData23);
        de.htw.sdf.photoplatform.persistence.model.Image image25 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str26 = image25.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData27 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image25);
        imageData27.setMobilePath("/users/update");
        java.lang.Long long30 = imageData27.getCode();
        imageData27.setName("/users/update");
        collectionData19.setThumbnail(imageData27);
        org.springframework.validation.BindingResult bindingResult34 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection35 = photographerController0.createCollection(collectionData19, bindingResult34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i14 == 10001);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
        org.junit.Assert.assertNull(imageData20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(long30);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user5 = userDAOImpl0.findByRoleId((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionCategoryDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory6 = collectionCategoryDAOImpl0.findOne(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        de.htw.sdf.photoplatform.exception.common.WebFormException webFormException1 = new de.htw.sdf.photoplatform.exception.common.WebFormException((int) 'a');
        org.springframework.validation.Errors errors2 = webFormException1.getErrors();
        org.junit.Assert.assertNull(errors2);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getEmail();
        userData0.setCompany("/collections/{collectionId}/images");
        userData0.setBanned(false);
        java.lang.String str8 = userData0.getSecToken();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        java.lang.String str2 = photographerData0.getIban();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection3 = photographerData0.getCollections();
        java.lang.String str4 = photographerData0.getHomepage();
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(list_collection3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        java.lang.String str5 = image0.toString();
        image0.setName("/collections/create");
        java.lang.String str8 = image0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str5.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/collections/create" + "'", str8.equals("/collections/create"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = null;
        collectionImage0.setCollection(collection5);
        de.htw.sdf.photoplatform.persistence.model.Image image7 = collectionImage0.getImage();
        org.junit.Assert.assertNotNull(image7);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        photographerData0.setCompany("/collections/showcase");
        photographerData0.setSwift("/users/becomephotographers");
        org.junit.Assert.assertNull(list_collection1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        java.lang.String str1 = becomePhotographer0.getHomepage();
        java.lang.String str2 = becomePhotographer0.getCompany();
        java.lang.String str3 = becomePhotographer0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection6 = collectionDAOImpl0.findOne((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.LocaleResolver localeResolver5 = application0.localeResolver();
        org.springframework.web.servlet.config.annotation.ViewControllerRegistry viewControllerRegistry6 = null;
        application0.addViewControllers(viewControllerRegistry6);
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry8 = null;
        application0.addResourceHandlers(resourceHandlerRegistry8);
        org.junit.Assert.assertNotNull(localeResolver5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user8 = userDAOImpl0.findByRoleId((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
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
        java.lang.Boolean b10 = userData0.isEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + b10 + "' != '" + false + "'", b10.equals(false));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        try {
            roleDAOImpl0.deleteById((long) 10001);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        de.htw.sdf.photoplatform.exception.common.ManagerException managerException1 = new de.htw.sdf.photoplatform.exception.common.ManagerException(404);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        de.htw.sdf.photoplatform.manager.impl.HashManagerImpl hashManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.HashManagerImpl();
        java.lang.String str2 = hashManagerImpl0.hash("/user/becomePhotographer");
        java.lang.String str4 = hashManagerImpl0.hash("/collections/showcase");
        try {
            java.lang.String str7 = hashManagerImpl0.hash("/user/becomePhotographer", "de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c" + "'", str2.equals("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9" + "'", str4.equals("4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
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
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData21 = photographerController0.getPhotographersImages(10, 0);
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
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
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
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage21 = userImageDAOImpl0.getOwnerImages((long) (byte) 0, list_long20);
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
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls5 = null;
        imageDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.persistence.model.Image image7 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image7.setMobileThumbPath("ROLE_CUSTOMER");
        image7.setCreatedBy("/collections/photographers");
        java.util.Date date12 = null;
        image7.setUpdatedAt(date12);
        java.lang.Double d14 = image7.getPrice();
        try {
            imageDAOImpl0.create(image7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(d14);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getPath();
        java.lang.String str4 = imageData2.getMessageSuccess();
        java.lang.Double d5 = imageData2.getPrice();
        imageData2.setSmallPath("/user/login");
        imageData2.setCode((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(d5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        try {
            javax.persistence.Query query4 = collectionDAOImpl0.createQuery("null:1528137248666:32ad08d7594d28504f1460b47d9ec391");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls3 = null;
        collectionCategoryDAOImpl0.setClazz(cls3);
        try {
            javax.persistence.Query query6 = collectionCategoryDAOImpl0.createQuery("/user/becomePhotographer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
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
        de.htw.sdf.photoplatform.persistence.model.User user15 = new de.htw.sdf.photoplatform.persistence.model.User();
        user15.setEnabled(false);
        userImage11.setOwner(user15);
        java.lang.String str19 = user15.getPassword();
        java.lang.String str20 = user15.getUsername();
        user15.setLastName("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        boolean b24 = user15.isRoleIncluded("");
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage25 = userImageDAOImpl0.getUserImagesBy(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
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
        userData0.setAdmin(true);
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
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
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
            java.lang.String str20 = photographerController0.deletePhotographersImage((java.lang.Long) 1L);
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
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls4 = null;
        imageDAOImpl0.setClazz(cls4);
        try {
            imageDAOImpl0.deleteById((long) 10001);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
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
        boolean b23 = user17.isRoleIncluded("/user/makeadmin/{id}");
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage24 = userImageDAOImpl0.getUserImagesBy(user17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls6 = null;
        userRoleDAOImpl0.setClazz(cls6);
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
        de.htw.sdf.photoplatform.persistence.model.User user19 = null;
        userRole8.setUser(user19);
        de.htw.sdf.photoplatform.persistence.model.Role role21 = userRole8.getRole();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole22 = userRoleDAOImpl0.update(userRole8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(role9);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(role18);
        org.junit.Assert.assertNotNull(role21);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.User user7 = userDAOImpl0.findOne(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
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
        de.htw.sdf.photoplatform.persistence.model.Collection collection11 = null;
        collectionImage6.setCollection(collection11);
        java.util.Date date13 = null;
        collectionImage6.setCreatedAt(date13);
        try {
            collectionImageDAOImpl0.delete(collectionImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
        de.htw.sdf.photoplatform.manager.impl.HashManagerImpl hashManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.HashManagerImpl();
        java.lang.String str2 = hashManagerImpl0.hash("/user/becomePhotographer");
        try {
            java.lang.String str5 = hashManagerImpl0.hash("", "Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c" + "'", str2.equals("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionDAOImpl0.findById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.toString();
        java.lang.String str2 = image0.toString();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        image0.setPrice((java.lang.Double) 100.0d);
        image0.setMetaData("/users/profile/{userId}");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str2.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.persistence.model.Role role7 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role7.setName("ROLE_CUSTOMER");
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user10 = userDAOImpl0.findByRole(role7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
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
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl collectionManagerImpl23 = new de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl();
        try {
            boolean b24 = requestLoggerInterceptor0.preHandle(httpServletRequest21, httpServletResponse22, (java.lang.Object) collectionManagerImpl23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(localeChangeInterceptor12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
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
        org.springframework.format.FormatterRegistry formatterRegistry11 = null;
        application0.addFormatters(formatterRegistry11);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory13 = application0.servletContainer();
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry14 = null;
        try {
            application0.addInterceptors(interceptorRegistry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory13);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setName("/photographer/upload");
        java.lang.String str3 = image0.toString();
        image0.setName("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str6 = image0.getName();
        java.lang.String str7 = image0.getMetaData();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str6.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        java.lang.RuntimeException runtimeException1 = null;
        try {
            imageController0.handleBaseException(runtimeException1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage7 = collectionImageDAOImpl0.findBy((java.lang.Long) 0L, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError((int) (short) 100, 10000, "ROLE_PHOTOGRAPHER", errors3);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<java.lang.Long> list_long3 = null;
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionImage> list_collectionImage4 = photographerManagerImpl0.addImagesToCollection((java.lang.Long) 100L, (java.lang.Long) (-1L), list_long3);
            org.junit.Assert.fail("Expected exception of type de.htw.sdf.photoplatform.exception.common.ManagerException");
        } catch (de.htw.sdf.photoplatform.exception.common.ManagerException e) {
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController1 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException4 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors3);
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController1.handleBadRequestException(badRequestException4, webRequest5);
        org.springframework.web.context.request.WebRequest webRequest7 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError8 = authenticationController0.handleBadRequestException(badRequestException4, webRequest7);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user10 = authenticationController0.userByName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            boolean b8 = userController0.enablePhotographer("/users/becomephotographers");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls6 = null;
        userRoleDAOImpl0.setClazz(cls6);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole8 = userRoleDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userRoleDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole8 = userRoleDAOImpl0.findOne((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls3 = null;
        collectionCategoryDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category6 = new de.htw.sdf.photoplatform.persistence.model.Category();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory7 = collectionCategoryDAOImpl0.getCollectionCategoryBy(category6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.User user4 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b5 = user4.isAdmin();
        java.lang.String str6 = user4.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData7 = null;
        user4.setPhotographerData(photographerData7);
        java.lang.String str9 = user4.toString();
        java.lang.String str11 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user4, (long) (short) 100);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage13 = userImageDAOImpl0.getPhotographImage(user4, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str9.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ec7908a224b49d37ffc84c612f320838" + "'", str11.equals("ec7908a224b49d37ffc84c612f320838"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage2 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image3.setCreatedBy("");
        collectionImage2.setImage(image3);
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = null;
        collectionImage2.setCollection(collection7);
        de.htw.sdf.photoplatform.persistence.model.Collection collection9 = collectionImage2.getCollection();
        try {
            collectionImageDAOImpl0.create(collectionImage2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls4 = null;
        userDAOImpl0.setClazz(cls4);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user7 = userDAOImpl0.findByAccountLocked(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        org.springframework.validation.Errors errors5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors5);
        int i7 = notFoundException6.getCode();
        notFoundException3.addSuppressed((java.lang.Throwable) notFoundException6);
        org.springframework.web.context.request.WebRequest webRequest9 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError10 = imageController0.handleNotFoundException(notFoundException3, webRequest9);
        try {
            imageController0.initIt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertNotNull(responseError10);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setUsername("/api");
        java.lang.String str6 = user1.getFirstName();
        boolean b7 = user1.isEnabled();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.Boolean b4 = userData0.isEnabled();
        java.lang.String str5 = userData0.getFirstName();
        userData0.setCompany("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        java.lang.Boolean b8 = userData0.isEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError(10002, 404, "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0", errors3);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        java.util.Date date6 = collectionImage0.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = collectionImage0.getCollection();
        org.junit.Assert.assertNotNull(image5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(collection7);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getSmallThumbPath();
        image0.setName("/user/login");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
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
        collectionData6.setName("/user/login");
        java.lang.String str17 = collectionData6.getDescription();
        java.util.List<java.lang.Long> list_long18 = collectionData6.getImageIds();
        org.springframework.validation.BindingResult bindingResult19 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData20 = photographerController0.updateCollection(collectionData6, bindingResult19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
        org.junit.Assert.assertNotNull(long_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(list_long18);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        java.lang.String str3 = userData0.getHomepage();
        java.lang.String str4 = userData0.getHomepage();
        java.lang.Long long5 = userData0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isAdmin();
        java.lang.String str7 = user5.getSecToken();
        boolean b8 = user5.isAccountNonLocked();
        boolean b9 = user5.isAccountNonLocked();
        java.lang.String str10 = user5.getUsername();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage13 = userImageDAOImpl0.getPhotographImages(user5, 11003, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user7 = userDAOImpl0.findByRoleAndEnabledFilter("/collections/{collectionId}", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getMessageSuccess();
        imageData2.setMobilePath("/users/update");
        imageData2.setPrice((java.lang.Double) 100.0d);
        imageData2.setPath("/user/enablephotographer");
        java.lang.Long long10 = imageData2.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole7 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role8 = userRole7.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role9 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole7.setRole(role9);
        de.htw.sdf.photoplatform.persistence.model.User user11 = userRole7.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user12 = userRole7.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user13 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b14 = user13.isAdmin();
        java.lang.String str15 = user13.getSecToken();
        userRole7.setUser(user13);
        de.htw.sdf.photoplatform.persistence.model.Role role17 = userRole7.getRole();
        try {
            roleDAOImpl0.create(role17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(role8);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(role17);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls5 = null;
        imageDAOImpl0.setClazz(cls5);
        try {
            imageDAOImpl0.deleteById((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        int i6 = responseError5.getStatus();
        int i7 = responseError5.getCode();
        org.junit.Assert.assertNotNull(responseError5);
        org.junit.Assert.assertTrue(i6 == 400);
        org.junit.Assert.assertTrue(i7 == 10000);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        java.lang.String str5 = user0.toString();
        java.lang.String str7 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user0, (long) (short) 100);
        java.lang.Long long8 = user0.getId();
        java.lang.String str9 = user0.getLastName();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str5.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ec7908a224b49d37ffc84c612f320838" + "'", str7.equals("ec7908a224b49d37ffc84c612f320838"));
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getMetadata();
        java.lang.String str7 = imageData2.getMobilePath();
        java.lang.String str8 = imageData2.getMessageSuccess();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/users/update" + "'", str7.equals("/users/update"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        java.lang.String str5 = user0.toString();
        user0.setId((java.lang.Long) 100L);
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str5.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
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
        java.lang.String str13 = imageData4.getMessageFailed();
        java.lang.Double d14 = imageData4.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + d8 + "' != '" + 1.0d + "'", d8.equals(1.0d));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + d14 + "' != '" + 1.0d + "'", d14.equals(1.0d));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user4 = userDAOImpl0.findPhotographersToActivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setName("");
        java.lang.Double d5 = imageData2.getPrice();
        imageData2.setName("/user/enablephotographer");
        imageData2.setSmallPath("/collections/{collectionId}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(d5);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.LocaleResolver localeResolver5 = application0.localeResolver();
        org.springframework.web.servlet.config.annotation.ViewControllerRegistry viewControllerRegistry6 = null;
        application0.addViewControllers(viewControllerRegistry6);
        org.springframework.validation.Validator validator8 = application0.getValidator();
        org.junit.Assert.assertNotNull(localeResolver5);
        org.junit.Assert.assertNull(validator8);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user4 = userDAOImpl0.findById((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError((int) (byte) 1, (int) (byte) 0, "/users/admin/{start}/{count}", errors3);
        java.lang.String str5 = responseError4.getDeveloperInfo();
        java.lang.String str6 = responseError4.getDeveloperInfo();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0" + "'", str5.equals("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0" + "'", str6.equals("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        image0.setMobileThumbPath("/photographer/upload");
        boolean b9 = image0.isEnabled();
        image0.setPrice((java.lang.Double) 1.0d);
        image0.setPath("");
        java.lang.String str14 = image0.getMime();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls5 = null;
        imageDAOImpl0.setClazz(cls5);
        try {
            javax.persistence.Query query8 = imageDAOImpl0.createQuery("/photographer/upload");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getMobileThumbPath();
        java.lang.String str3 = image0.getDescription();
        java.lang.String str4 = image0.getMime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            boolean b2 = userController0.enablePhotographer("/photographer/images/{imageId}");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        java.lang.String str5 = userData0.getHomepage();
        java.lang.Boolean b6 = userData0.isBanned();
        userData0.setSwift("obfuscate");
        userData0.setPhone("ROLE_ADMIN");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
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
        java.lang.String str16 = userData7.getLastName();
        userData7.setLastName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
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
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData7 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = collectionData7.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData9 = collectionData7.getThumbnail();
        java.lang.Long[] long_array11 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long12 = new java.util.ArrayList<java.lang.Long>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long12, long_array11);
        collectionData7.setImageIds((java.util.List<java.lang.Long>) arraylist_long12);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage15 = userImageDAOImpl0.getOwnerImages((long) (byte) 100, (java.util.List<java.lang.Long>) arraylist_long12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(imageData8);
        org.junit.Assert.assertNull(imageData9);
        org.junit.Assert.assertNotNull(long_array11);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
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
        javax.servlet.http.HttpServletRequest httpServletRequest12 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse13 = null;
        de.htw.sdf.photoplatform.Application application14 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer15 = null;
        application14.configureAsyncSupport(asyncSupportConfigurer15);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer17 = null;
        application14.configureAsyncSupport(asyncSupportConfigurer17);
        org.springframework.validation.MessageCodesResolver messageCodesResolver19 = application14.getMessageCodesResolver();
        de.htw.sdf.photoplatform.Application application20 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer21 = null;
        application20.configureDefaultServletHandling(defaultServletHandlerConfigurer21);
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array23 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver24 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver24, handlerMethodArgumentResolver_array23);
        application20.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver24);
        application14.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver24);
        org.springframework.web.servlet.ModelAndView modelAndView28 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest12, httpServletResponse13, (java.lang.Object) arraylist_handlerMethodArgumentResolver24, modelAndView28);
        javax.servlet.http.HttpServletRequest httpServletRequest30 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse31 = null;
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage32 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image33 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image33.setCreatedBy("");
        collectionImage32.setImage(image33);
        de.htw.sdf.photoplatform.persistence.model.Image image37 = collectionImage32.getImage();
        image37.setPrice((java.lang.Double) 0.0d);
        try {
            boolean b40 = requestLoggerInterceptor0.preHandle(httpServletRequest30, httpServletResponse31, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(messageCodesResolver19);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(image37);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getSmallPath();
        imageData2.setPath("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.Boolean b9 = userData8.isAdmin();
        imageData2.setUserData(userData8);
        java.lang.String str11 = imageData2.getMessageSuccess();
        imageData2.setCode((java.lang.Long) 0L);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData14 = imageData2.getUserData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(userData14);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        de.htw.sdf.photoplatform.persistence.model.Role role0 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role0.setName("ROLE_CUSTOMER");
        role0.setName("/index.html");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
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
        de.htw.sdf.photoplatform.persistence.model.Image image23 = userImage9.getImage();
        image23.setPublic(false);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str18.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(image23);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException1 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException(404);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls1 = null;
        categoryDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category4 = categoryDAOImpl0.findByName("/showcase");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        userPasswordChange0.setPassword("");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isBecomePhotographer();
        user0.setFirstName("/index.html");
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole4 = user0.getUserRoles();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(list_userRole4);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setId((java.lang.Long) 0L);
        userData0.setEnabled(false);
        userData0.setPhone("4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory3 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = null;
        collectionCategory3.setCollection(collection4);
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = null;
        collectionCategory3.setCollection(collection6);
        de.htw.sdf.photoplatform.persistence.model.Category category8 = collectionCategory3.getCategory();
        java.util.Date date9 = collectionCategory3.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user11 = collection10.getUser();
        collectionCategory3.setCollection(collection10);
        java.lang.String str13 = collection10.getDescription();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection14 = collectionDAOImpl0.update(collection10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(category8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        java.lang.String str3 = becomePhotographer0.getIban();
        becomePhotographer0.setPaypalID("null:1528137255129:74131369d5ab98a30139e53b9d69dc36");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        imageData2.setMime("/showcase");
        imageData2.setMessageSuccess("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        imageData2.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        javax.persistence.EntityManager entityManager7 = roleDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Role> list_role8 = roleDAOImpl0.findAllNotAdminRoles();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager7);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("/collections/addimage");
        userRegister0.setLastName("/user/becomePhotographer");
        userRegister0.setFirstName("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10000");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
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
        org.springframework.format.FormatterRegistry formatterRegistry11 = null;
        application0.addFormatters(formatterRegistry11);
        org.springframework.web.servlet.config.annotation.ViewControllerRegistry viewControllerRegistry13 = null;
        application0.addViewControllers(viewControllerRegistry13);
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry15 = null;
        try {
            application0.addInterceptors(interceptorRegistry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole5 = userRoleDAOImpl0.findByUserId((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        java.lang.String str5 = userData0.getHomepage();
        java.lang.Boolean b6 = userData0.isBanned();
        java.util.List<java.lang.String> list_str7 = userData0.getRoles();
        java.lang.Long long8 = userData0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
        org.junit.Assert.assertNull(list_str7);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData6 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = collectionData6.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = collectionData6.getThumbnail();
        java.lang.Long[] long_array10 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long11 = new java.util.ArrayList<java.lang.Long>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long11, long_array10);
        collectionData6.setImageIds((java.util.List<java.lang.Long>) arraylist_long11);
        org.springframework.validation.BindingResult bindingResult14 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection15 = photographerController0.createCollection(collectionData6, bindingResult14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
        org.junit.Assert.assertNull(imageData7);
        org.junit.Assert.assertNull(imageData8);
        org.junit.Assert.assertNotNull(long_array10);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData8 = photographerController0.getCollections((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        collectionData0.setPublic((java.lang.Boolean) false);
        java.lang.Boolean b4 = collectionData0.getPublic();
        java.util.List<java.lang.Long> list_long5 = collectionData0.getImageIds();
        java.lang.String str6 = collectionData0.getName();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(list_long5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
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
        java.lang.String str14 = user9.getFirstName();
        try {
            userDAOImpl0.delete(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user7 = userDAOImpl0.findByRoleId((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard4 = user0.getAuthorities();
        boolean b5 = user0.isEnabled();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(collection_wildcard4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls5 = null;
        imageDAOImpl0.setClazz(cls5);
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image8 = imageDAOImpl0.findOne((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls4 = null;
        imageDAOImpl0.setClazz(cls4);
        try {
            imageDAOImpl0.deleteById((long) 11004);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection7 = collectionDAOImpl0.findByUserAndCollectionId((long) 10001, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        try {
            javax.persistence.Query query4 = collectionImageDAOImpl0.createQuery("null:1528137250344:31149e863206f62132f4465a1c878d2c");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = imageData1.getMobilePath();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
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
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole14 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user15 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b16 = user15.isPhotographer();
        userRole14.setUser(user15);
        user15.setUsername("/api");
        boolean b20 = user15.isAccountNonLocked();
        java.lang.String str21 = user15.getSecToken();
        userImage11.setUser(user15);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage25 = userImageDAOImpl0.getPhotographImages(user15, 10000, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user2 = null;
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage5 = userImageDAOImpl0.getPhotographImages(user2, (int) 'a', 10002);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test300");
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
        de.htw.sdf.photoplatform.persistence.model.User user17 = userImage9.getUser();
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            userDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test302");
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
        de.htw.sdf.photoplatform.persistence.model.User user14 = new de.htw.sdf.photoplatform.persistence.model.User();
        user14.setEnabled(false);
        userImage10.setOwner(user14);
        java.lang.String str18 = user14.getPassword();
        java.lang.String str19 = user14.getUsername();
        user14.setLastName("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        try {
            java.lang.Boolean b22 = userManagerImpl0.isUserPhotographer(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test303");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        try {
            javax.persistence.Query query4 = userDAOImpl0.createQuery("49961de64838862febaeead9e5ed74a8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test304");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        java.lang.RuntimeException runtimeException6 = null;
        try {
            photographerController0.handleBaseException(runtimeException6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.BindingResult bindingResult2 = null;
        try {
            java.lang.String str3 = photographerController0.addImageToCollection("/users/becomephotographers", bindingResult2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.toString();
        java.lang.String str2 = image0.toString();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.Double d4 = image0.getPrice();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str2.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(d4);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test307");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("/users/becomephotographers", errors1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test308");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        try {
            javax.persistence.Query query5 = collectionCategoryDAOImpl0.createQuery("/photographer/upload");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors1);
        int i3 = notFoundException2.getCode();
        java.lang.Throwable[] throwable_array4 = notFoundException2.getSuppressed();
        java.lang.String str5 = notFoundException2.toString();
        org.junit.Assert.assertTrue(i3 == 10001);
        org.junit.Assert.assertNotNull(throwable_array4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str5.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test310");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array3 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler4 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler4, handlerMethodReturnValueHandler_array3);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler4);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer7 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer7);
        org.springframework.web.servlet.config.annotation.PathMatchConfigurer pathMatchConfigurer9 = null;
        application0.configurePathMatch(pathMatchConfigurer9);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        imageData2.setMessageFailed("/showcase");
        imageData2.setId((java.lang.Long) (-1L));
        java.lang.Long long9 = imageData2.getId();
        java.lang.String str10 = imageData2.getMetadata();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9.equals((-1L)));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/photographer/upload" + "'", str10.equals("/photographer/upload"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        becomePhotographer0.setIban("/photographer/upload");
        java.lang.String str9 = becomePhotographer0.getPhone();
        java.lang.String str10 = becomePhotographer0.getPhone();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "/user/makeadmin/{id}" + "'", str9.equals("/user/makeadmin/{id}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/user/makeadmin/{id}" + "'", str10.equals("/user/makeadmin/{id}"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError(404, (int) (short) 10, "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c", errors3);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.lockUser("ROLE_CUSTOMER");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test315");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getMessageSuccess();
        imageData2.setMobilePath("/users/update");
        imageData2.setPrice((java.lang.Double) 100.0d);
        java.lang.Long long8 = imageData2.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test316");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        java.lang.String str3 = becomePhotographer0.getIban();
        becomePhotographer0.setPaypalID("ROLE_CUSTOMER");
        java.lang.String str6 = becomePhotographer0.getPhone();
        java.lang.String str7 = becomePhotographer0.getHomepage();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ROLE_ADMIN" + "'", str6.equals("ROLE_ADMIN"));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.Boolean b2 = userData0.isAdmin();
        java.lang.Boolean b3 = userData0.isEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + false + "'", b2.equals(false));
        org.junit.Assert.assertTrue("'" + b3 + "' != '" + false + "'", b3.equals(false));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test318");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls2 = null;
        categoryDAOImpl0.setClazz(cls2);
        try {
            categoryDAOImpl0.deleteById((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.Long long2 = imageData1.getCode();
        imageData1.setPrice((java.lang.Double) 1.0d);
        java.lang.Long long5 = imageData1.getId();
        imageData1.setPath("/collections/create");
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        imageData2.setMime("/showcase");
        imageData2.setMessageSuccess("49961de64838862febaeead9e5ed74a8");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity8 = null;
        try {
            xAuthTokenConfigurer7.configure(httpSecurity8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection6 = collectionDAOImpl0.findByUserAndCollectionId((long) 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test323");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls3 = null;
        collectionCategoryDAOImpl0.setClazz(cls3);
        try {
            collectionCategoryDAOImpl0.deleteById((long) 400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        java.lang.String str5 = imageData2.getMetadata();
        java.lang.String str6 = imageData2.getThumbnailPath();
        java.lang.String str7 = imageData2.getPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "/photographer/upload" + "'", str5.equals("/photographer/upload"));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user5 = userDAOImpl0.findById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls5 = null;
        collectionCategoryDAOImpl0.setClazz(cls5);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls7 = null;
        collectionCategoryDAOImpl0.setClazz(cls7);
        try {
            collectionCategoryDAOImpl0.deleteById((long) 404);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors2);
        org.springframework.validation.Errors errors4 = badRequestException3.getErrors();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController0.handleBadRequestException(badRequestException3, webRequest5);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData9 = photographerController0.getPhotographersImages((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test328");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        java.util.List<java.lang.Long> list_long7 = null;
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage8 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) (-1L), (java.lang.Long) 0L, list_long7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test329");
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
        java.lang.String str14 = role13.getName();
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role15 = roleDAOImpl0.update(role13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(role4);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(role13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test330");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ViewControllerRegistry viewControllerRegistry3 = null;
        application0.addViewControllers(viewControllerRegistry3);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        java.lang.String str3 = becomePhotographer0.getIban();
        becomePhotographer0.setPaypalID("ROLE_CUSTOMER");
        becomePhotographer0.setPhone("/user/enablephotographer");
        java.lang.String str8 = becomePhotographer0.getPhone();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/user/enablephotographer" + "'", str8.equals("/user/enablephotographer"));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test332");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        userData0.setHomepage("");
        java.util.List<java.lang.String> list_str7 = userData0.getRoles();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(list_str7);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getIban();
        java.lang.String str8 = becomePhotographer0.getIban();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setCompany("/showcase");
        java.lang.String str5 = becomePhotographer0.getIban();
        becomePhotographer0.setPhone("/users/admin/{start}/{count}");
        java.lang.String str8 = becomePhotographer0.getPaypalID();
        java.lang.String str9 = becomePhotographer0.getPaypalID();
        java.lang.String str10 = becomePhotographer0.getPaypalID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
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
        de.htw.sdf.photoplatform.persistence.model.Role role19 = userRole8.getRole();
        try {
            roleDAOImpl0.create(role19);
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
        org.junit.Assert.assertNotNull(role19);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test336");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setThumbPath("/users/admin/{start}/{count}");
        image0.setUpdatedBy("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str7 = image0.getDescription();
        java.lang.String str8 = image0.getPath();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test337");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setMobileThumbPath("ROLE_CUSTOMER");
        image0.setCreatedBy("/collections/photographers");
        image0.setName("ROLE_PHOTOGRAPHER");
        boolean b7 = image0.isEnabled();
        image0.setDescription("4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9");
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test338");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image6 = imageDAOImpl0.findOne((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getEmail();
        userData0.setCompany("/collections/{collectionId}/images");
        java.lang.String str6 = userData0.getPaypalID();
        java.lang.String str7 = userData0.getHomepage();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test340");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role4 = roleDAOImpl0.findByName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test341");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str6 = image5.getMime();
        java.lang.String str7 = image5.getMobileThumbPath();
        image5.setMetaData("/user/makeadmin/{id}");
        java.lang.String str10 = image5.toString();
        try {
            imageDAOImpl0.delete(image5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str10.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test342");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls2 = null;
        categoryDAOImpl0.setClazz(cls2);
        try {
            categoryDAOImpl0.deleteById((long) 11002);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls2 = null;
        collectionImageDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image5 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image5.setCreatedBy("");
        collectionImage4.setImage(image5);
        de.htw.sdf.photoplatform.persistence.model.Image image9 = collectionImage4.getImage();
        try {
            collectionImageDAOImpl0.delete(collectionImage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNotNull(image9);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test344");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getMetadata();
        java.lang.String str7 = imageData2.getMetadata();
        java.lang.String str8 = imageData2.getThumbnailPath();
        java.lang.String str9 = imageData2.getMessageFailed();
        java.lang.String str10 = imageData2.getMime();
        imageData2.setSmallPath("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setSwift("/photographer/images");
        java.lang.String str3 = userData0.getPaypalID();
        userData0.setHomepage("");
        userData0.setPaypalID("/user/makeadmin/{id}");
        userData0.setHomepage("");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
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
        userData0.setLastName("/collections/create");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test347");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        try {
            userDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test348");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getMessageSuccess();
        imageData2.setMobilePath("/users/update");
        java.lang.String str6 = imageData2.getSmallPath();
        imageData2.setMessageFailed("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getEmail();
        userData0.setCompany("/collections/{collectionId}/images");
        java.lang.Boolean b6 = userData0.isAdmin();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array3 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler4 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler4, handlerMethodReturnValueHandler_array3);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler4);
        de.htw.sdf.photoplatform.Application application7 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer8 = null;
        application7.configureAsyncSupport(asyncSupportConfigurer8);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer10 = null;
        application7.configureAsyncSupport(asyncSupportConfigurer10);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array12 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver13 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver13, handlerExceptionResolver_array12);
        application7.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver13);
        org.springframework.web.servlet.LocaleResolver localeResolver16 = application7.localeResolver();
        de.htw.sdf.photoplatform.Application application17 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer18 = null;
        application17.configureDefaultServletHandling(defaultServletHandlerConfigurer18);
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array20 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver21 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver21, handlerMethodArgumentResolver_array20);
        application17.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver21);
        application7.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver21);
        de.htw.sdf.photoplatform.Application application25 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer26 = null;
        application25.configureAsyncSupport(asyncSupportConfigurer26);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer28 = null;
        application25.configureContentNegotiation(contentNegotiationConfigurer28);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory30 = application25.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry31 = null;
        application25.addResourceHandlers(resourceHandlerRegistry31);
        org.springframework.web.servlet.LocaleResolver localeResolver33 = application25.localeResolver();
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array34 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver35 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver35, handlerMethodArgumentResolver_array34);
        application25.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver35);
        de.htw.sdf.photoplatform.Application application38 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer39 = null;
        application38.configureContentNegotiation(contentNegotiationConfigurer39);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array41 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler42 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler42, handlerMethodReturnValueHandler_array41);
        application38.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler42);
        org.springframework.format.FormatterRegistry formatterRegistry45 = null;
        application38.addFormatters(formatterRegistry45);
        de.htw.sdf.photoplatform.Application application47 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer48 = null;
        application47.configureAsyncSupport(asyncSupportConfigurer48);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer50 = null;
        application47.configureAsyncSupport(asyncSupportConfigurer50);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array52 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver53 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver53, handlerExceptionResolver_array52);
        application47.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver53);
        application38.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver53);
        application25.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver53);
        application7.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver53);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver53);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(localeResolver16);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory30);
        org.junit.Assert.assertNotNull(localeResolver33);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array52);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test351");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole7 = userRoleDAOImpl0.findOne((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
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
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory17 = collection16.getCollectionCategories();
        java.lang.String str18 = collection16.getName();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection19 = collectionDAOImpl0.update(collection16);
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
        org.junit.Assert.assertNull(set_collectionCategory17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection7 = collectionDAOImpl0.findCollectionsByUser(0L, (int) ' ', (int) (byte) 0, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls5 = null;
        imageDAOImpl0.setClazz(cls5);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image7 = imageDAOImpl0.getPublicImages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test355");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData6 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData7 = collectionData6.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = null;
        collectionData6.setUserdata(userData8);
        java.lang.String str10 = collectionData6.getName();
        long long11 = collectionData6.getId();
        de.htw.sdf.photoplatform.persistence.model.Image image12 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str13 = image12.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData14 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image12);
        imageData14.setMetadata("/photographer/upload");
        imageData14.setMime("/showcase");
        imageData14.setMessageSuccess("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        collectionData6.setThumbnail(imageData14);
        collectionData6.setId(0L);
        org.springframework.validation.BindingResult bindingResult24 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData25 = photographerController0.updateCollection(collectionData6, bindingResult24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
        org.junit.Assert.assertNull(list_imageData7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(long11 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        try {
            userImageDAOImpl0.deleteById((long) 11003);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        java.lang.String str3 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user0);
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getSecToken();
        boolean b6 = user0.isCredentialsNonExpired();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null:1528137271848:6816eb5a920569f38c51d1b8bbf267cc" + "'", str3.equals("null:1528137271848:6816eb5a920569f38c51d1b8bbf267cc"));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test358");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        image0.setCreatedBy("ROLE_ADMIN");
        java.lang.String str7 = image0.toString();
        image0.setId((java.lang.Long) 1L);
        java.lang.String str10 = image0.getMobileThumbPath();
        image0.setSmallThumbPath("/photographer/images");
        java.lang.String str13 = image0.getMime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str7.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
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
            java.lang.String str20 = photographerController0.updateCollectionShowcase("null:1528137263387:737fa038c16b05aadddbb7d717b9f93f");
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
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        try {
            javax.persistence.Query query4 = userRoleDAOImpl0.createQuery("Image{name='null', path='', isPublic=false, enabled=false, price=1.0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test361");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.web.multipart.MultipartFile multipartFile1 = null;
        org.springframework.web.multipart.MultipartFile[] multipartFile_array2 = new org.springframework.web.multipart.MultipartFile[] { multipartFile1 };
        try {
            java.lang.String str3 = imageController0.handleImageUpload(multipartFile_array2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(multipartFile_array2);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test362");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = null;
        try {
            imageManagerImpl0.delete(image1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        imageData2.setMime("/showcase");
        java.lang.Long long7 = imageData2.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        collectionData0.setPublic((java.lang.Boolean) false);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = null;
        collectionData0.setThumbnail(imageData4);
        collectionData0.setId((long) (byte) -1);
        java.lang.Boolean b8 = collectionData0.getPublic();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        java.lang.String str3 = becomePhotographer0.getSwift();
        java.lang.String str4 = becomePhotographer0.getPaypalID();
        becomePhotographer0.setHomepage("/users/update");
        java.lang.String str7 = becomePhotographer0.getHomepage();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/users/update" + "'", str7.equals("/users/update"));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test366");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPasswordConfirm();
        userPasswordChange0.setNewPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001");
        userPasswordChange0.setNewPassword("/user/lock/{id}");
        userPasswordChange0.setPassword("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test367");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setName("/photographer/upload");
        image0.setDescription("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test368");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls1 = null;
        categoryDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category4 = categoryDAOImpl0.findByName("39c73479cb767c5a09248b3313c03447");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test369");
        de.htw.sdf.photoplatform.exception.common.InputError inputError2 = new de.htw.sdf.photoplatform.exception.common.InputError("/collections/{collectionId}", "/photographer/upload");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test370");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setName("");
        java.lang.Double d5 = imageData2.getPrice();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData6 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str7 = userData6.getLastName();
        java.util.List<java.lang.String> list_str8 = userData6.getRoles();
        java.lang.String str9 = userData6.getSwift();
        java.lang.Boolean b10 = userData6.isEnabled();
        userData6.setPhone("/collections/photographers");
        java.lang.Long long13 = userData6.getId();
        imageData2.setUserData(userData6);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(d5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list_str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + b10 + "' != '" + false + "'", b10.equals(false));
        org.junit.Assert.assertNull(long13);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test371");
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
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer11 = null;
        application0.configureDefaultServletHandling(defaultServletHandlerConfigurer11);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(localeResolver8);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test372");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setCreationDate();
        user0.setAccountNonLocked(true);
        boolean b5 = user0.isEnabled();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test373");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        user0.setLastName("/user/unlock/{id}");
        user0.setAccountNonLocked(true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test374");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getSwift();
        java.lang.String str8 = becomePhotographer0.getSwift();
        java.lang.String str9 = becomePhotographer0.getHomepage();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/users/admin/{start}/{count}" + "'", str7.equals("/users/admin/{start}/{count}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/users/admin/{start}/{count}" + "'", str8.equals("/users/admin/{start}/{count}"));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test375");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.Long long5 = imageData4.getId();
        java.lang.Long long6 = imageData4.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test376");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionImageDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage7 = collectionImageDAOImpl0.findOne((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test377");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getCompany();
        userData0.setIban("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        userData0.setBanned(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test378");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        boolean b4 = user0.isCredentialsNonExpired();
        boolean b5 = user0.isCredentialsNonExpired();
        java.lang.String str6 = user0.getPassword();
        user0.setEnabled(false);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test379");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage8 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 10L, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test380");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        try {
            userImageDAOImpl0.deleteById((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test381");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array5 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler6 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler6, handlerMethodReturnValueHandler_array5);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler6);
        org.springframework.validation.MessageCodesResolver messageCodesResolver9 = application0.getMessageCodesResolver();
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(messageCodesResolver9);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test382");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity8 = xAuthTokenConfigurer7.and();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test383");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage7 = userImageDAOImpl0.findOne((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test384");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setMobileThumbPath("ROLE_CUSTOMER");
        image0.setSmallThumbPath("");
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData5.setPrice((java.lang.Double) 0.0d);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test385");
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
        imageData26.setPath("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
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
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test386");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = userController0.getUserProfileData("/user/enablephotographer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test387");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image4.setCreatedBy("");
        collectionImage3.setImage(image4);
        de.htw.sdf.photoplatform.persistence.model.Collection collection8 = null;
        collectionImage3.setCollection(collection8);
        java.util.Date date10 = null;
        collectionImage3.setCreatedAt(date10);
        try {
            collectionImageDAOImpl0.delete(collectionImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test388");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        java.lang.String str7 = responseError6.getDeveloperInfo();
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001" + "'", str7.equals("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001"));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test389");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls5 = null;
        imageDAOImpl0.setClazz(cls5);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image7 = imageDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test390");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        image0.setCreatedBy("ROLE_ADMIN");
        java.lang.String str7 = image0.getMetaData();
        java.lang.String str8 = image0.getUpdatedBy();
        java.lang.String str9 = image0.getCreatedBy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ROLE_ADMIN" + "'", str9.equals("ROLE_ADMIN"));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test391");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls5 = null;
        collectionImageDAOImpl0.setClazz(cls5);
        try {
            collectionImageDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test392");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory1 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = null;
        collectionCategory1.setCollection(collection2);
        de.htw.sdf.photoplatform.persistence.model.Category category4 = new de.htw.sdf.photoplatform.persistence.model.Category();
        collectionCategory1.setCategory(category4);
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category6 = categoryManagerImpl0.update(category4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test393");
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
        java.lang.String str14 = image1.getMime();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test394");
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException1 = new de.htw.sdf.photoplatform.exception.BadRequestException("/user/makeadmin/{id}");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test395");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.unlockUser("ec7908a224b49d37ffc84c612f320838");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test396");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        userData0.setHomepage("");
        java.lang.Boolean b7 = userData0.isAdmin();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + b7 + "' != '" + false + "'", b7.equals(false));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test397");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("/collections/create", errors1);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test398");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPassword();
        userPasswordChange0.setNewPassword("/photographer/images/{imageId}");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test399");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.validation.Errors errors4 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException5 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors4);
        requestLoggerInterceptor0.afterConcurrentHandlingStarted(httpServletRequest1, httpServletResponse2, (java.lang.Object) badRequestException5);
        java.lang.Throwable[] throwable_array7 = badRequestException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwable_array7);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test400");
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException1 = new de.htw.sdf.photoplatform.exception.NotFoundException("/collections/photographers/{start}/{count}");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test401");
        de.htw.sdf.photoplatform.exception.common.InputError inputError2 = new de.htw.sdf.photoplatform.exception.common.InputError("/user/enablephotographer", "/showcase");
        java.lang.String str3 = inputError2.getFieldName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "/user/enablephotographer" + "'", str3.equals("/user/enablephotographer"));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test402");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls3 = null;
        collectionCategoryDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory5 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = null;
        collectionCategory5.setCollection(collection6);
        de.htw.sdf.photoplatform.persistence.model.Category category8 = new de.htw.sdf.photoplatform.persistence.model.Category();
        collectionCategory5.setCategory(category8);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory10 = collectionCategoryDAOImpl0.getCollectionCategoryBy(category8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test403");
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
        java.lang.String str22 = photographerData0.getPhone();
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "/collections/{collectionId}/images" + "'", str22.equals("/collections/{collectionId}/images"));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test404");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData1 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array6 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long7, long_array6);
        collectionData1.setImageIds((java.util.List<java.lang.Long>) arraylist_long7);
        java.lang.String str10 = collectionData1.getName();
        org.springframework.validation.BindingResult bindingResult11 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData12 = photographerController0.updateCollection(collectionData1, bindingResult11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(long_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test405");
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
        collection0.setDescription("4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test406");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage5 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage6 = userImageDAOImpl0.update(userImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test407");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user4 = userDAOImpl0.findByAccountLocked(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test408");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer7 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer7.setPhone("ROLE_ADMIN");
        becomePhotographer7.setCompany("/showcase");
        java.lang.String str12 = becomePhotographer7.getIban();
        becomePhotographer7.setPhone("/users/admin/{start}/{count}");
        org.springframework.validation.BindingResult bindingResult15 = null;
        try {
            boolean b16 = userController0.becomePhotographer(becomePhotographer7, bindingResult15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test409");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        try {
            javax.persistence.Query query4 = userRoleDAOImpl0.createQuery("/api");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test410");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls1 = null;
        collectionCategoryDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory3 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Category category4 = null;
        collectionCategory3.setCategory(category4);
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = collectionCategory3.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Category category7 = collectionCategory3.getCategory();
        try {
            collectionCategoryDAOImpl0.delete(collectionCategory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(category7);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test411");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getDescription();
        java.lang.Long long7 = imageData2.getCode();
        java.lang.String str8 = imageData2.getMobilePath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/users/update" + "'", str8.equals("/users/update"));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test412");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity4 = null;
        xAuthTokenConfigurer3.setBuilder(httpSecurity4);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity6 = null;
        try {
            xAuthTokenConfigurer3.configure(httpSecurity6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test413");
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
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData29 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(userImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test414");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.toString();
        image0.setThumbPath("/user/makeadmin/{id}");
        boolean b4 = image0.isEnabled();
        java.util.Date date5 = image0.getCreatedAt();
        image0.setCreationDate();
        image0.setSmallThumbPath("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test415");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str7 = image0.getUpdatedBy();
        image0.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test416");
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
        try {
            userRoleDAOImpl0.delete(userRole6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(role7);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test417");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setId((java.lang.Long) 0L);
        java.lang.String str3 = userData0.getSecToken();
        java.lang.Long long4 = userData0.getId();
        userData0.setIban("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        java.util.List<java.lang.String> list_str7 = userData0.getRoles();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
        org.junit.Assert.assertNull(list_str7);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test418");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
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
        try {
            userDAOImpl0.delete(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
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
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test419");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getEmail();
        userData0.setPhone("/photographer/images");
        userData0.setPaypalID("ROLE_BECOME_PHOTOGRAPHER");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test420");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.LocaleResolver localeResolver3 = application0.localeResolver();
        org.junit.Assert.assertNotNull(localeResolver3);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test421");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        try {
            collectionImageDAOImpl0.deleteById((long) 10002);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test422");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long6 = new java.util.ArrayList<java.lang.Long>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long6, long_array5);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long6);
        collectionData0.setName("/user/login");
        java.lang.String str11 = collectionData0.getDescription();
        collectionData0.setId((long) 10001);
        org.junit.Assert.assertNotNull(long_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test423");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        java.lang.String str5 = imageData2.getMessageFailed();
        java.lang.Long long6 = imageData2.getCode();
        imageData2.setMime("/collections/{collectionId}/images/{imageId}");
        imageData2.setMetadata("ROLE_PHOTOGRAPHER");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test424");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor3 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException8 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor3.afterCompletion(httpServletRequest4, httpServletResponse5, (java.lang.Object) 10, (java.lang.Exception) notFoundException8);
        javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse11 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage12 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView13 = null;
        requestLoggerInterceptor3.postHandle(httpServletRequest10, httpServletResponse11, (java.lang.Object) userImage12, modelAndView13);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole15 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user16 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b17 = user16.isPhotographer();
        userRole15.setUser(user16);
        user16.setUsername("/api");
        boolean b21 = user16.isAccountNonLocked();
        java.lang.String str22 = user16.getSecToken();
        userImage12.setUser(user16);
        de.htw.sdf.photoplatform.persistence.model.Image image24 = userImage12.getImage();
        try {
            userImageDAOImpl0.delete(userImage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(image24);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test425");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls1 = null;
        collectionCategoryDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.Category category3 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category3.setName("/user/enablephotographer");
        category3.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category3.setDescription("obfuscate");
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory10 = collectionCategoryDAOImpl0.getCollectionCategoryBy(category3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test426");
        de.htw.sdf.photoplatform.manager.impl.HashManagerImpl hashManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.HashManagerImpl();
        java.lang.String str2 = hashManagerImpl0.hash("/user/becomePhotographer");
        try {
            java.lang.String str5 = hashManagerImpl0.hash("Image{name='null', path='null', isPublic=false, enabled=false, price=null}", "abe34aa080ac4421665a72329e218ae76e6eae82d181635ba4a5f8548e70866084fd9cd5c793d5b3a4165763081b95813d4bdb3d679b27d667fea0502caa5a9b");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c" + "'", str2.equals("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c"));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test427");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls3 = null;
        collectionCategoryDAOImpl0.setClazz(cls3);
        try {
            collectionCategoryDAOImpl0.deleteById((long) 10001);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test428");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("/collections/addimage");
        userRegister0.setLastName("/user/becomePhotographer");
        userRegister0.setLastName("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        userRegister0.setFirstName("ec7908a224b49d37ffc84c612f320838");
        userRegister0.setLastName("/users/becomephotographers");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test429");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str7 = imageData6.getMime();
        java.lang.String str8 = imageData6.getPath();
        imageData6.setThumbnailPath("/collections/addimage");
        imageData6.setMessageFailed("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test430");
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
        java.lang.String str29 = user21.getLastName();
        user21.setFirstName("/user/{name}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test431");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls6 = null;
        userRoleDAOImpl0.setClazz(cls6);
        try {
            javax.persistence.Query query9 = userRoleDAOImpl0.createQuery("null:1528137270629:cbd34b0779b1c1d7e1215815c5bcba0d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test432");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setName("/user/lock/{id}");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test433");
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException1 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException(11004);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test434");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        java.lang.String str2 = photographerData0.getIban();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection3 = photographerData0.getCollections();
        photographerData0.setPhone("abe34aa080ac4421665a72329e218ae76e6eae82d181635ba4a5f8548e70866084fd9cd5c793d5b3a4165763081b95813d4bdb3d679b27d667fea0502caa5a9b");
        photographerData0.setHomepage("77ce3535f163da232981f0d31864a601ca7857e39a64df07a354c6860cf425727ccc18a2328f2e2bfe2e86f09067f3be6c7841e138ba6b4e2d0fea3d964ab0d9");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(list_collection3);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test435");
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
        imageData26.setPath("");
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
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test436");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getIban();
        becomePhotographer0.setSwift("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        becomePhotographer0.setPaypalID("/user/register");
        becomePhotographer0.setPhone("/users/update");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test437");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.makeAdmin("/user/enablephotographer");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test438");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.UserData> list_userData9 = userController0.getEnabledUsers(11002, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test439");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = image0.getCreatedBy();
        java.util.Date date3 = null;
        image0.setUpdatedAt(date3);
        image0.setEnabled(false);
        java.lang.Double d7 = image0.getPrice();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(d7);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test440");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            javax.persistence.Query query9 = userDAOImpl0.createQuery("/collections/photographers/{start}/{count}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test441");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls3 = null;
        userImageDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage5 = null;
        try {
            userImageDAOImpl0.create(userImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test442");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry5 = null;
        application0.addResourceHandlers(resourceHandlerRegistry5);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test443");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setUsername("/api");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData7 = null;
        user2.setPhotographerData(photographerData7);
        try {
            java.lang.Boolean b10 = userManagerImpl0.isRoleIncluded(user2, "null:1528137265168:246d1b80c2f43651d8cc26e44925e89a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test444");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array3 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler4 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler4, handlerMethodReturnValueHandler_array3);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler4);
        org.springframework.validation.MessageCodesResolver messageCodesResolver7 = application0.getMessageCodesResolver();
        org.springframework.validation.Validator validator8 = application0.getValidator();
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(messageCodesResolver7);
        org.junit.Assert.assertNull(validator8);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test445");
        de.htw.sdf.photoplatform.exception.common.ManagerException managerException1 = new de.htw.sdf.photoplatform.exception.common.ManagerException((int) (short) -1);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test446");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls1 = null;
        categoryDAOImpl0.setClazz(cls1);
        try {
            categoryDAOImpl0.deleteById((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test447");
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
        collectionData6.setName("/user/login");
        java.lang.String str17 = collectionData6.getDescription();
        java.util.List<java.lang.Long> list_long18 = collectionData6.getImageIds();
        org.springframework.validation.BindingResult bindingResult19 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection20 = photographerController0.createCollection(collectionData6, bindingResult19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
        org.junit.Assert.assertNotNull(long_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(list_long18);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test448");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls7 = null;
        userImageDAOImpl0.setClazz(cls7);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole9 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user10 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b11 = user10.isPhotographer();
        userRole9.setUser(user10);
        user10.setAccountNonLocked(true);
        boolean b15 = user10.isAccountNonExpired();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage16 = userImageDAOImpl0.getUserImagesBy(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test449");
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
        java.lang.String str16 = imageData8.getDescription();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + d11 + "' != '" + (-1.0d) + "'", d11.equals((-1.0d)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test450");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str6 = image5.toString();
        java.lang.String str7 = image5.getName();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData8 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData9 = collectionData8.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData10 = collectionData8.getThumbnail();
        java.lang.Long[] long_array12 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long13, long_array12);
        collectionData8.setImageIds((java.util.List<java.lang.Long>) arraylist_long13);
        collectionData8.setId((long) (short) -1);
        java.lang.Long[] long_array19 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long20 = new java.util.ArrayList<java.lang.Long>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long20, long_array19);
        collectionData8.setImageIds((java.util.List<java.lang.Long>) arraylist_long20);
        boolean b23 = image5.equals((java.lang.Object) arraylist_long20);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage24 = userImageDAOImpl0.getOwnerImages((long) (short) 100, (java.util.List<java.lang.Long>) arraylist_long20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str6.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(imageData9);
        org.junit.Assert.assertNull(imageData10);
        org.junit.Assert.assertNotNull(long_array12);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(long_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test451");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("/collections/addimage");
        userRegister0.setLastName("/user/becomePhotographer");
        java.lang.String str5 = userRegister0.getEmail();
        java.lang.String str6 = userRegister0.getEmail();
        userRegister0.setLastName("/photographer/upload");
        userRegister0.setPassword("/api");
        userRegister0.setFirstName("null:1528137271848:6816eb5a920569f38c51d1b8bbf267cc");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test452");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.lockUser("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test453");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userRoleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager7 = userRoleDAOImpl0.getEntityManager();
        try {
            userRoleDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager7);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test454");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls3 = null;
        userImageDAOImpl0.setClazz(cls3);
        try {
            javax.persistence.Query query6 = userImageDAOImpl0.createQuery("null:1528137269023:a165acffd0d2c313e6fa2c2dbbd2dc76");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test455");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry5 = null;
        try {
            application0.addInterceptors(interceptorRegistry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test456");
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
        de.htw.sdf.photoplatform.persistence.model.Image image19 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str20 = image19.getMime();
        java.lang.String str21 = image19.getUpdatedBy();
        java.lang.String str22 = image19.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData23 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image19);
        java.lang.String str24 = imageData23.getMime();
        imageData23.setPrice((java.lang.Double) 1.0d);
        java.lang.Double d27 = imageData23.getPrice();
        imageData23.setMessageFailed("hi!");
        imageData23.setDescription("/user/login");
        java.lang.String str32 = imageData23.getMessageFailed();
        org.springframework.validation.BindingResult bindingResult33 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData34 = photographerController0.updateImage(imageData23, bindingResult33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i14 == 10001);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + d27 + "' != '" + 1.0d + "'", d27.equals(1.0d));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test457");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls4 = null;
        userDAOImpl0.setClazz(cls4);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user6 = userDAOImpl0.findPhotographersToActivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test458");
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
        java.lang.Double d23 = imageData22.getPrice();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(imageData22);
        org.junit.Assert.assertNull(d23);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test459");
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
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData21 = photographerController0.getShowcase((int) '#', 11004);
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
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test460");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        javax.persistence.EntityManager entityManager7 = roleDAOImpl0.getEntityManager();
        try {
            javax.persistence.Query query9 = roleDAOImpl0.createQuery("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager7);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test461");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer9 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer9.setPhone("ROLE_ADMIN");
        becomePhotographer9.setPhone("/user/makeadmin/{id}");
        becomePhotographer9.setSwift("/users/admin/{start}/{count}");
        becomePhotographer9.setHomepage("/users/update");
        requestLoggerInterceptor0.afterConcurrentHandlingStarted(httpServletRequest7, httpServletResponse8, (java.lang.Object) "/users/update");
        javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse20 = null;
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl21 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls22 = null;
        userRoleDAOImpl21.setClazz(cls22);
        javax.persistence.EntityManager entityManager24 = userRoleDAOImpl21.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls25 = null;
        userRoleDAOImpl21.setClazz(cls25);
        requestLoggerInterceptor0.afterConcurrentHandlingStarted(httpServletRequest19, httpServletResponse20, (java.lang.Object) cls25);
        javax.servlet.http.HttpServletRequest httpServletRequest28 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse29 = null;
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange30 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange30.setNewPassword("/showcase");
        java.lang.String str33 = userPasswordChange30.getPasswordConfirm();
        userPasswordChange30.setNewPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001");
        userPasswordChange30.setNewPassword("/user/lock/{id}");
        try {
            boolean b38 = requestLoggerInterceptor0.preHandle(httpServletRequest28, httpServletResponse29, (java.lang.Object) userPasswordChange30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager24);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test462");
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
        org.springframework.web.servlet.config.annotation.PathMatchConfigurer pathMatchConfigurer10 = null;
        application0.configurePathMatch(pathMatchConfigurer10);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory8);
        org.junit.Assert.assertNull(messageCodesResolver9);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test463");
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException1 = new de.htw.sdf.photoplatform.exception.NotFoundException("null:1528137266330:9de181051f39b56aea6ebed61ac6f110");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test464");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        java.lang.String str2 = photographerData0.getHomepage();
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test465");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
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
        java.lang.String str17 = image16.toString();
        image16.setThumbPath("/user/makeadmin/{id}");
        boolean b20 = image16.isEnabled();
        image16.setPublic(true);
        userImage13.setImage(image16);
        de.htw.sdf.photoplatform.persistence.model.User user24 = userImage13.getUser();
        de.htw.sdf.photoplatform.persistence.model.Image image25 = null;
        userImage13.setImage(image25);
        try {
            userImageDAOImpl0.delete(userImage13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str17.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(user24);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test466");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.makeAdmin("/collections/showcase");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test467");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image3);
        image3.setPublic(true);
        boolean b7 = image3.isEnabled();
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image8 = imageDAOImpl0.update(image3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(imageData4);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test468");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        try {
            collectionDAOImpl0.deleteById(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test469");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setIban("ROLE_ADMIN");
        java.lang.String str7 = becomePhotographer0.getHomepage();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test470");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setPassword("ROLE_PHOTOGRAPHER");
        boolean b4 = user0.isBecomePhotographer();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData5 = user0.getPhotographerData();
        boolean b6 = user0.isEnabled();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(photographerData5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test471");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.Double d1 = image0.getPrice();
        java.lang.String str2 = image0.getPath();
        org.junit.Assert.assertNull(d1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test472");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getIban();
        becomePhotographer0.setSwift("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        becomePhotographer0.setPaypalID("/user/register");
        becomePhotographer0.setCompany("/photographer/images");
        becomePhotographer0.setPhone("/user/register");
        becomePhotographer0.setSwift("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        java.lang.String str18 = becomePhotographer0.getPhone();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "/user/register" + "'", str18.equals("/user/register"));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test473");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        photographerData0.setCompany("/collections/{collectionId}/images");
        photographerData0.setPhone("/photographer/images");
        java.lang.String str6 = photographerData0.getPaypalID();
        photographerData0.setSwift("ec7908a224b49d37ffc84c612f320838");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test474");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setAccountNonLocked(true);
        boolean b6 = user1.isAccountNonExpired();
        java.lang.String str7 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user1);
        java.lang.String str8 = user1.toString();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null:1528137277050:ea4b11766ecf85bf46d8a52721b360a9" + "'", str7.equals("null:1528137277050:ea4b11766ecf85bf46d8a52721b360a9"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str8.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test475");
        de.htw.sdf.photoplatform.persistence.model.Role role0 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role0.setName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str3 = role0.getName();
        role0.setName("4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception" + "'", str3.equals("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception"));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test476");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = collectionData0.getThumbnail();
        collectionData0.setDescription("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(imageData2);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test477");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getMetadata();
        java.lang.String str7 = imageData2.getMobilePath();
        java.lang.String str8 = imageData2.getPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/users/update" + "'", str7.equals("/users/update"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test478");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setName("/photographer/upload");
        java.lang.String str3 = image0.toString();
        image0.setName("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str6 = image0.getSmallThumbPath();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test479");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user7 = userDAOImpl0.findPhotographersToActivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test480");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("ROLE_ADMIN", errors1);
        int i3 = notFoundException2.getCode();
        org.junit.Assert.assertTrue(i3 == 10001);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test481");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData8.setCode((java.lang.Long) 10L);
        imageData8.setDescription("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test482");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        java.lang.String str5 = imageData2.getMessageFailed();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData6 = imageData2.getUserData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(userData6);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test483");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        try {
            org.springframework.security.core.userdetails.UserDetails userDetails6 = userDAOImpl0.loadUserByUsername("null:1528137263387:737fa038c16b05aadddbb7d717b9f93f");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test484");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        user0.setSecToken("");
        boolean b6 = user0.isAccountNonLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test485");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.User user7 = userDAOImpl0.findByEmail("Category{name='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test486");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        imageData2.setMobilePath("/user/makeadmin/{id}");
        imageData2.setCode((java.lang.Long) 10L);
        imageData2.setPrice((java.lang.Double) 1.0d);
        imageData2.setName("/user/enablephotographer");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test487");
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
        imageData4.setName("Category{name='null'}");
        java.lang.String str15 = imageData4.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + d8 + "' != '" + 1.0d + "'", d8.equals(1.0d));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test488");
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
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData19 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData20 = collectionData19.getThumbnail();
        de.htw.sdf.photoplatform.persistence.model.Image image21 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str22 = image21.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData23 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image21);
        imageData23.setMobilePath("/users/update");
        java.lang.Long long26 = imageData23.getCode();
        imageData23.setName("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData29 = imageData23.getUserData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData30 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData30.setSwift("/photographer/images");
        imageData23.setUserData(userData30);
        collectionData19.setUserdata(userData30);
        org.springframework.validation.BindingResult bindingResult35 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection36 = photographerController0.createCollection(collectionData19, bindingResult35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i14 == 10001);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
        org.junit.Assert.assertNull(imageData20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long26);
        org.junit.Assert.assertNull(userData29);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test489");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        user0.setAccountNonLocked(true);
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard7 = user0.getAuthorities();
        user0.setFirstName("ROLE_PHOTOGRAPHER");
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole10 = user0.getUserRoles();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(collection_wildcard7);
        org.junit.Assert.assertNull(list_userRole10);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test490");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls5 = null;
        imageDAOImpl0.setClazz(cls5);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image7 = imageDAOImpl0.getPublicImages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test491");
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
        image13.setId((java.lang.Long) 0L);
        java.lang.String str23 = image13.getMobileThumbPath();
        boolean b24 = image13.isPublic();
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test492");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry6 = null;
        application0.addResourceHandlers(resourceHandlerRegistry6);
        org.springframework.format.FormatterRegistry formatterRegistry8 = null;
        application0.addFormatters(formatterRegistry8);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer10 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer10);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test493");
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
        de.htw.sdf.photoplatform.persistence.model.Image image16 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str17 = image16.getMime();
        java.lang.String str18 = image16.getUpdatedBy();
        java.lang.String str19 = image16.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData20 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image16);
        java.lang.String str21 = imageData20.getMime();
        java.lang.String str22 = imageData20.getMetadata();
        java.lang.Long long23 = imageData20.getId();
        org.springframework.validation.BindingResult bindingResult24 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData25 = photographerController0.updateImage(imageData20, bindingResult24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError12);
        org.junit.Assert.assertTrue(i13 == 10000);
        org.junit.Assert.assertNotNull(responseError15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(long23);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test494");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setMobileThumbPath("ROLE_CUSTOMER");
        image0.setCreatedBy("/collections/photographers");
        image0.setName("ROLE_PHOTOGRAPHER");
        boolean b7 = image0.isEnabled();
        image0.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test495");
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
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData18 = photographerController0.getCollections((int) (short) 10, (int) ' ');
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
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test496");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls4 = null;
        imageDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image6.setMobileThumbPath("ROLE_CUSTOMER");
        image6.setCreatedBy("/collections/photographers");
        java.util.Date date11 = null;
        image6.setUpdatedAt(date11);
        java.lang.Double d13 = image6.getPrice();
        try {
            imageDAOImpl0.create(image6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(d13);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test497");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls2 = null;
        collectionImageDAOImpl0.setClazz(cls2);
        try {
            collectionImageDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test498");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData1 = collectionData0.getUserdata();
        long long2 = collectionData0.getId();
        java.lang.Long[] long_array8 = new java.lang.Long[] { 10L, 1L, 100L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long9 = new java.util.ArrayList<java.lang.Long>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long9, long_array8);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long9);
        java.lang.String str12 = collectionData0.getDescription();
        org.junit.Assert.assertNull(userData1);
        org.junit.Assert.assertTrue(long2 == 0L);
        org.junit.Assert.assertNotNull(long_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test499");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getMetadata();
        java.lang.String str7 = imageData2.getMetadata();
        java.lang.String str8 = imageData2.getThumbnailPath();
        java.lang.String str9 = imageData2.getMessageFailed();
        java.lang.String str10 = imageData2.getMime();
        java.lang.String str11 = imageData2.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test500");
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
        try {
            xAuthTokenConfigurer7.configure(httpSecurity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }
}

