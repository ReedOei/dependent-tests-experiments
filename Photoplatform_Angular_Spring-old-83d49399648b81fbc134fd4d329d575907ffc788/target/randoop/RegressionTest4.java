import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test001");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setCreatedBy("/collections/addimage");
        image0.setEnabled(true);
        java.lang.String str8 = image0.getUpdatedBy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test002");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.servlet.config.annotation.ViewControllerRegistry viewControllerRegistry3 = null;
        application0.addViewControllers(viewControllerRegistry3);
        org.springframework.web.servlet.config.annotation.PathMatchConfigurer pathMatchConfigurer5 = null;
        application0.configurePathMatch(pathMatchConfigurer5);
        javax.servlet.MultipartConfigElement multipartConfigElement7 = application0.multipartConfigElement();
        org.junit.Assert.assertNotNull(multipartConfigElement7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test003");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userRoleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole7 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        java.util.Date date8 = null;
        userRole7.setCreatedAt(date8);
        try {
            userRoleDAOImpl0.delete(userRole7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test004");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("/collections/addimage");
        userRegister0.setLastName("/user/becomePhotographer");
        java.lang.String str5 = userRegister0.getEmail();
        java.lang.String str6 = userRegister0.getEmail();
        userRegister0.setLastName("/photographer/upload");
        java.lang.String str9 = userRegister0.getLastName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "/photographer/upload" + "'", str9.equals("/photographer/upload"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test005");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerData3.getCollections();
        photographerData3.setCompany("/collections/showcase");
        user0.setPhotographerData(photographerData3);
        photographerData3.setHomepage("Category{name='null'}");
        java.lang.String str10 = photographerData3.getCompany();
        photographerData3.setPaypalID("/api");
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(list_collection4);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "/collections/showcase" + "'", str10.equals("/collections/showcase"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test006");
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
        java.lang.String str17 = collectionData0.getDescription();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(userData10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test007");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isBecomePhotographer();
        boolean b2 = user0.isAccountNonExpired();
        java.lang.String str4 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user0, (long) 11004);
        boolean b5 = user0.isEnabled();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "39c73479cb767c5a09248b3313c03447" + "'", str4.equals("39c73479cb767c5a09248b3313c03447"));
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test008");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.controller.UserController userController1 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException4 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors3);
        int i5 = notFoundException4.getCode();
        org.springframework.web.context.request.WebRequest webRequest6 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError7 = userController1.handleNotFoundException(notFoundException4, webRequest6);
        org.springframework.web.context.request.WebRequest webRequest8 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError9 = photographerController0.handleNotFoundException(notFoundException4, webRequest8);
        org.springframework.validation.Errors errors11 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException12 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors11);
        org.springframework.web.context.request.WebRequest webRequest13 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError14 = photographerController0.handleBadRequestException(badRequestException12, webRequest13);
        java.lang.RuntimeException runtimeException15 = null;
        try {
            photographerController0.handleBaseException(runtimeException15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertNotNull(responseError14);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test009");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        java.lang.String str1 = userPasswordChange0.getNewPassword();
        java.lang.String str2 = userPasswordChange0.getPasswordConfirm();
        java.lang.String str3 = userPasswordChange0.getNewPassword();
        userPasswordChange0.setPasswordConfirm("Image{name='null', path='null', isPublic=false, enabled=false, price=-1.0}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test010");
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
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister30 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str31 = userRegister30.getPassword();
        userRegister30.setPasswordConfirm("de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
        org.springframework.validation.BindingResult bindingResult34 = null;
        try {
            authenticationController0.register(userRegister30, bindingResult34);
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
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test011");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setName("");
        java.lang.Double d5 = imageData2.getPrice();
        imageData2.setPrice((java.lang.Double) 100.0d);
        java.lang.String str8 = imageData2.getPath();
        imageData2.setPath("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(d5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test012");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer1 = null;
        application0.configureDefaultServletHandling(defaultServletHandlerConfigurer1);
        de.htw.sdf.photoplatform.Application application3 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer4 = null;
        application3.configureContentNegotiation(contentNegotiationConfigurer4);
        de.htw.sdf.photoplatform.Application application6 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer7 = null;
        application6.configureContentNegotiation(contentNegotiationConfigurer7);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array9 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler10 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler10, handlerMethodReturnValueHandler_array9);
        application6.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler10);
        application3.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler10);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler10);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer15 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer15);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer17 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer17);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test013");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getMobileThumbPath();
        image0.setPublic(true);
        image0.setMobileThumbPath("/collections/photographers/{start}/{count}");
        java.lang.String str7 = image0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test014");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str9 = image0.getSmallThumbPath();
        image0.setThumbPath("obfuscate");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test015");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        boolean b5 = user1.isRoleIncluded("39c73479cb767c5a09248b3313c03447");
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard6 = user1.getAuthorities();
        boolean b7 = user1.isBecomePhotographer();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(collection_wildcard6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test016");
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
        collection16.setDescription("ROLE_BECOME_PHOTOGRAPHER");
        de.htw.sdf.photoplatform.persistence.model.User user19 = collection16.getUser();
        try {
            collectionDAOImpl0.create(collection16);
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
        org.junit.Assert.assertNotNull(user19);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test017");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userImageDAOImpl0.getEntityManager();
        try {
            userImageDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test018");
        de.htw.sdf.photoplatform.exception.common.WebFormException webFormException1 = new de.htw.sdf.photoplatform.exception.common.WebFormException(11003);
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController2 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException4 = new de.htw.sdf.photoplatform.exception.NotFoundException("/collections/{collectionId}");
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = imageController2.handleNotFoundException(notFoundException4, webRequest5);
        webFormException1.addSuppressed((java.lang.Throwable) notFoundException4);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test019");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getUsername();
        user0.setLastName("/collections/create");
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test020");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        java.lang.String str8 = image0.getMime();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test021");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        image0.setCreatedBy("ROLE_ADMIN");
        java.lang.String str7 = image0.toString();
        java.lang.String str8 = image0.getDescription();
        image0.setEnabled(false);
        image0.setThumbPath("c18adf3e6684fc8f2606e13da230b0c8c917a59e137641a907750738357c63953b78e49d28b55aac397b8e9803482afc7f6207bb5836f5a1bc28d6adbc31995f");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str7.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test022");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls3 = null;
        userRoleDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userRoleDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole6 = userRoleDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test023");
        de.htw.sdf.photoplatform.exception.common.InputError inputError2 = new de.htw.sdf.photoplatform.exception.common.InputError("Category{name='/photographer/images/{imageId}'}", "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str3 = inputError2.getFieldName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Category{name='/photographer/images/{imageId}'}" + "'", str3.equals("Category{name='/photographer/images/{imageId}'}"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test024");
        de.htw.sdf.photoplatform.persistence.model.Role role0 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role0.setName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str3 = role0.getName();
        java.lang.String str4 = role0.getName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception" + "'", str3.equals("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception" + "'", str4.equals("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test025");
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
        int i11 = responseError9.getStatus();
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i10 == 10001);
        org.junit.Assert.assertTrue(i11 == 404);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test026");
        de.htw.sdf.photoplatform.persistence.model.Category category0 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category0.setName("/user/enablephotographer");
        category0.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category0.setDescription("obfuscate");
        category0.setName("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        java.lang.String str9 = category0.toString();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Category{name='null:1528137250344:31149e863206f62132f4465a1c878d2c'}" + "'", str9.equals("Category{name='null:1528137250344:31149e863206f62132f4465a1c878d2c'}"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test027");
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
        java.lang.String str22 = photographerData0.getPaypalID();
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test028");
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
        javax.persistence.EntityManager entityManager10 = userImageDAOImpl0.getEntityManager();
        try {
            userImageDAOImpl0.deleteById(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager9);
        org.junit.Assert.assertNull(entityManager10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test029");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError((int) (byte) -1, (int) '4', "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001", errors3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test030");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.LocaleResolver localeResolver5 = application0.localeResolver();
        javax.servlet.MultipartConfigElement multipartConfigElement6 = application0.multipartConfigElement();
        org.junit.Assert.assertNotNull(localeResolver5);
        org.junit.Assert.assertNotNull(multipartConfigElement6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test031");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        image1.setThumbPath("/users/admin/{start}/{count}");
        image1.setUpdatedBy("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection9 = collectionImage0.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user11 = collection10.getUser();
        java.lang.String str12 = collection10.getName();
        java.lang.String str13 = collection10.getDescription();
        boolean b14 = collection10.isPublic();
        java.lang.String str15 = collection10.getName();
        collectionImage0.setCollection(collection10);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test032");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        try {
            java.lang.String str2 = photographerController0.updateCollectionShowcase("/showcase");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test033");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setIban("obfuscate");
        java.lang.String str3 = becomePhotographer0.getPhone();
        java.lang.String str4 = becomePhotographer0.getPaypalID();
        java.lang.String str5 = becomePhotographer0.getHomepage();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test034");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.toString();
        image0.setThumbPath("/user/makeadmin/{id}");
        image0.setMobileThumbPath("/user/makeadmin/{id}");
        boolean b6 = image0.isPublic();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        image0.setMobileThumbPath("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10000");
        image0.setCreatedBy("/user/login");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(imageData7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test035");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.Role role3 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role3.setName("ROLE_CUSTOMER");
        java.lang.String str6 = role3.getName();
        role3.setName("/api:1528137282451:b663d46b647142ba0b5f5a8d1cd8d8fe");
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user9 = userDAOImpl0.findByRole(role3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ROLE_CUSTOMER" + "'", str6.equals("ROLE_CUSTOMER"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test036");
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage0 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = userImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isBecomePhotographer();
        boolean b4 = user2.isAccountNonExpired();
        user2.setAccountNonLocked(true);
        boolean b7 = user2.isAccountNonLocked();
        userImage0.setOwner(user2);
        java.util.Date date9 = null;
        userImage0.setUpdatedAt(date9);
        org.junit.Assert.assertNull(image1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test037");
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
        imageData8.setName("/api");
        imageData8.setCode((java.lang.Long) 1L);
        java.lang.String str19 = imageData8.getThumbnailPath();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test038");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError(0, (int) (short) 100, "/photographer/images", errors3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test039");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("/collections/addimage");
        java.lang.String str3 = userRegister0.getPassword();
        java.lang.String str4 = userRegister0.getLastName();
        userRegister0.setLastName("/users/changepassword");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "/collections/addimage" + "'", str4.equals("/collections/addimage"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test040");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls5 = null;
        collectionDAOImpl0.setClazz(cls5);
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection8 = collectionDAOImpl0.findById((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test041");
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
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array19 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler20 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler20, handlerMethodReturnValueHandler_array19);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler20);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array19);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test042");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.web.servlet.LocaleResolver localeResolver5 = application0.localeResolver();
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory6 = application0.servletContainer();
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor7 = application0.localeChangeInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse9 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image10 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str11 = image10.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData12 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image10);
        java.lang.String str13 = imageData12.getMessageSuccess();
        imageData12.setMobilePath("/users/update");
        imageData12.setPrice((java.lang.Double) 100.0d);
        imageData12.setPath("/user/enablephotographer");
        java.lang.String str20 = imageData12.getPath();
        localeChangeInterceptor7.afterConcurrentHandlingStarted(httpServletRequest8, httpServletResponse9, (java.lang.Object) str20);
        org.junit.Assert.assertNotNull(localeResolver5);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(localeChangeInterceptor7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "/user/enablephotographer" + "'", str20.equals("/user/enablephotographer"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test043");
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
        java.lang.Boolean b15 = userData13.isEnabled();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(userData13);
        org.junit.Assert.assertNull(long14);
        org.junit.Assert.assertTrue("'" + b15 + "' != '" + false + "'", b15.equals(false));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test044");
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
        java.lang.String str19 = collectionData0.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData20 = collectionData0.getUserdata();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNotNull(imageData15);
        org.junit.Assert.assertNull(userData16);
        org.junit.Assert.assertNotNull(imageData17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(userData20);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test045");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.validation.MessageCodesResolver messageCodesResolver1 = application0.getMessageCodesResolver();
        de.htw.sdf.photoplatform.Application application2 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application2.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer5 = null;
        application2.configureContentNegotiation(contentNegotiationConfigurer5);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory7 = application2.servletContainer();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry8 = null;
        application2.addResourceHandlers(resourceHandlerRegistry8);
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
        application2.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver38);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver38);
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry45 = null;
        try {
            application0.addInterceptors(interceptorRegistry45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(messageCodesResolver1);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory15);
        org.junit.Assert.assertNotNull(localeResolver18);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array37);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test046");
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
        imageData4.setName("/showcase");
        java.lang.Long long16 = imageData4.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + d8 + "' != '" + 1.0d + "'", d8.equals(1.0d));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(long16);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test047");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        java.lang.String str3 = becomePhotographer0.getIban();
        becomePhotographer0.setPaypalID("ROLE_CUSTOMER");
        becomePhotographer0.setCompany("ec7908a224b49d37ffc84c612f320838");
        becomePhotographer0.setCompany("/collections/create");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test048");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setUsername("/api");
        java.lang.String str6 = user1.getFirstName();
        user1.setPassword("/collections/showcase");
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
        photographerData9.setPhone("/users/admin/{start}/{count}");
        user1.setPhotographerData(photographerData9);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(list_collection10);
        org.junit.Assert.assertNotNull(collection_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(list_collectionData14);
        org.junit.Assert.assertNotNull(list_collectionData15);
        org.junit.Assert.assertNotNull(list_collectionData16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test049");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        imageData2.setMessageFailed("/showcase");
        java.lang.String str7 = imageData2.getMime();
        java.lang.String str8 = imageData2.getMime();
        java.lang.String str9 = imageData2.getPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test050");
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
        collectionData0.setName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData25 = collectionData0.getUserdata();
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
        org.junit.Assert.assertNotNull(userData25);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test051");
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException1 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException((int) (byte) 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test052");
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
        de.htw.sdf.photoplatform.persistence.model.User user11 = userRole0.getUser();
        org.junit.Assert.assertNull(role1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(role10);
        org.junit.Assert.assertNotNull(user11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test053");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getCompany();
        userData0.setIban("/photographer/upload");
        java.lang.Boolean b5 = userData0.isEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test054");
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
        java.lang.String str13 = userData9.getEmail();
        userData9.setIban("null:1528137269023:a165acffd0d2c313e6fa2c2dbbd2dc76");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(userData8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test055");
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
        java.lang.String str22 = photographerData0.getIban();
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test056");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getMessageSuccess();
        imageData2.setMessageSuccess("");
        imageData2.setPrice((java.lang.Double) 1.0d);
        java.lang.Long long8 = imageData2.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test057");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage6 = collectionImageDAOImpl0.findOne((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test058");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls2 = null;
        categoryDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls4 = null;
        categoryDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory6 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = null;
        collectionCategory6.setCollection(collection7);
        java.util.Date date9 = collectionCategory6.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Category category10 = new de.htw.sdf.photoplatform.persistence.model.Category();
        java.lang.String str11 = category10.toString();
        java.lang.String str12 = category10.getName();
        collectionCategory6.setCategory(category10);
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category14 = categoryDAOImpl0.update(category10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Category{name='null'}" + "'", str11.equals("Category{name='null'}"));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test059");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        java.lang.String str5 = imageData2.getMetadata();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData6 = imageData2.getUserData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData7 = imageData2.getUserData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "/photographer/upload" + "'", str5.equals("/photographer/upload"));
        org.junit.Assert.assertNull(userData6);
        org.junit.Assert.assertNull(userData7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test060");
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
        java.lang.String str13 = photographerData0.getSwift();
        java.lang.String str14 = photographerData0.getSwift();
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test061");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = null;
        collectionData0.setUserdata(userData2);
        java.lang.String str4 = collectionData0.getName();
        long long5 = collectionData0.getId();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData6 = collectionData0.getImages();
        java.util.List<java.lang.Long> list_long7 = collectionData0.getImageIds();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(list_imageData6);
        org.junit.Assert.assertNull(list_long7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test062");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setUsername("/api");
        java.lang.String str6 = user1.getFirstName();
        java.lang.String str7 = user1.toString();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str7.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test063");
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
        imageData8.setDescription("/user/login");
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test064");
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
            javax.persistence.Query query10 = roleDAOImpl0.createQuery("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test065");
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
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer47 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer47);
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
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test066");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls3 = null;
        userImageDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userImageDAOImpl0.getEntityManager();
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test067");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userRoleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager7 = userRoleDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole9 = userRoleDAOImpl0.findByUserId((java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test068");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str3 = userRegister0.getPasswordConfirm();
        userRegister0.setPasswordConfirm("ec7908a224b49d37ffc84c612f320838");
        userRegister0.setPassword("/collections/update");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test069");
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
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry29 = null;
        try {
            application0.addInterceptors(interceptorRegistry29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(localeResolver7);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(localeResolver18);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array22);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test070");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage8 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 10L, 400, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test071");
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
        java.lang.Boolean b13 = userData0.isAdmin();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertTrue("'" + b13 + "' != '" + false + "'", b13.equals(false));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test072");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole4 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isPhotographer();
        userRole4.setUser(user5);
        java.lang.String str8 = user5.getSecToken();
        java.lang.Long long9 = user5.getId();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage12 = userImageDAOImpl0.getPhotographImages(user5, (-1), 11003);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test073");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls4 = null;
        userDAOImpl0.setClazz(cls4);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user6 = userDAOImpl0.findAllNotAdminUsers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test074");
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
        org.springframework.web.servlet.LocaleResolver localeResolver18 = application0.localeResolver();
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(localeResolver9);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(localeResolver18);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test075");
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
        try {
            de.htw.sdf.photoplatform.persistence.model.User user15 = imageController0.getAuthenticatedUser();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertNotNull(responseError10);
        org.junit.Assert.assertNotNull(responseError14);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test076");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user9 = userDAOImpl0.findByRoleId((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test077");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        boolean b4 = user0.isPhotographer();
        java.lang.String str5 = user0.getFirstName();
        boolean b6 = user0.isPhotographer();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test078");
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
        javax.persistence.EntityManager entityManager12 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user13 = null;
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage16 = userImageDAOImpl0.getPhotographImages(user13, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager9);
        org.junit.Assert.assertNull(entityManager12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test079");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str3 = userRegister0.getLastName();
        java.lang.String str4 = userRegister0.getFirstName();
        java.lang.String str5 = userRegister0.getPassword();
        java.lang.String str6 = userRegister0.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception" + "'", str3.equals("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception"));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test080");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPasswordConfirm();
        userPasswordChange0.setNewPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001");
        userPasswordChange0.setNewPassword("/user/register");
        userPasswordChange0.setPassword("de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test081");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPasswordConfirm();
        java.lang.String str4 = userPasswordChange0.getPassword();
        java.lang.String str5 = userPasswordChange0.getPasswordConfirm();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test082");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData4 = null;
        user1.setPhotographerData(photographerData4);
        java.lang.String str6 = user1.toString();
        java.lang.String str7 = user1.getUsername();
        user1.setLastName("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        try {
            java.lang.Boolean b11 = userManagerImpl0.isRoleIncluded(user1, "null:1528137265625:03bf1b2c50bffe4b6b17dad8841e9f70");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str6.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test083");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionImageDAOImpl0.getEntityManager();
        try {
            javax.persistence.Query query7 = collectionImageDAOImpl0.createQuery("/user/enablephotographer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test084");
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
            java.lang.String str25 = hashManagerImpl20.hash("/user/lock/{id}", "ROLE_BECOME_PHOTOGRAPHER");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test085");
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
        de.htw.sdf.photoplatform.persistence.model.Image image15 = userImage9.getImage();
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData16 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(userImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(image15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test086");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.web.servlet.LocaleResolver localeResolver5 = application0.localeResolver();
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array6 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver7 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver7, handlerExceptionResolver_array6);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver7);
        org.junit.Assert.assertNotNull(localeResolver5);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test087");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.lang.String str1 = photographerData0.getHomepage();
        java.lang.String str2 = photographerData0.getIban();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test088");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls3 = null;
        categoryDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category6 = categoryDAOImpl0.findOne((long) 11002);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test089");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        java.lang.String str5 = becomePhotographer0.getCompany();
        becomePhotographer0.setIban("/collections/addimage");
        java.lang.String str8 = becomePhotographer0.getHomepage();
        becomePhotographer0.setCompany("/user/login");
        becomePhotographer0.setCompany("/collections/{collectionId}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test090");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array2 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection3 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3, collection_array2);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData5 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData7 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.lang.String str9 = photographerData0.getCompany();
        photographerData0.setPhone("/users/admin/{start}/{count}");
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection12 = photographerData0.getCollections();
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list_collection12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test091");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls4 = null;
        collectionCategoryDAOImpl0.setClazz(cls4);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls6 = null;
        collectionCategoryDAOImpl0.setClazz(cls6);
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test092");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setSwift("/photographer/images");
        java.lang.Boolean b3 = userData0.isAdmin();
        java.lang.String str4 = userData0.getLastName();
        java.util.List<java.lang.String> list_str5 = userData0.getRoles();
        java.util.List<java.lang.String> list_str6 = userData0.getRoles();
        org.junit.Assert.assertTrue("'" + b3 + "' != '" + false + "'", b3.equals(false));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(list_str5);
        org.junit.Assert.assertNull(list_str6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test093");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("/collections/addimage");
        userRegister0.setLastName("/user/becomePhotographer");
        java.lang.String str5 = userRegister0.getEmail();
        java.lang.String str6 = userRegister0.getPasswordConfirm();
        java.lang.String str7 = userRegister0.getPassword();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test094");
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
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData21 = photographerController0.getPhotographersImages((int) (byte) 0, (int) '4');
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
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test095");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getSwift();
        becomePhotographer0.setPhone("null:1528137265625:03bf1b2c50bffe4b6b17dad8841e9f70");
        becomePhotographer0.setIban("Category{name='null:1528137250344:31149e863206f62132f4465a1c878d2c'}");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/users/admin/{start}/{count}" + "'", str7.equals("/users/admin/{start}/{count}"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test096");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setCompany("/showcase");
        java.lang.String str5 = becomePhotographer0.getIban();
        becomePhotographer0.setPhone("/users/admin/{start}/{count}");
        java.lang.String str8 = becomePhotographer0.getHomepage();
        java.lang.String str9 = becomePhotographer0.getPhone();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "/users/admin/{start}/{count}" + "'", str9.equals("/users/admin/{start}/{count}"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test097");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("/collections/addimage");
        userRegister0.setLastName("/user/becomePhotographer");
        java.lang.String str5 = userRegister0.getEmail();
        java.lang.String str6 = userRegister0.getPasswordConfirm();
        java.lang.String str7 = userRegister0.getFirstName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test098");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        try {
            collectionImageDAOImpl0.deleteById((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test099");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        photographerData0.setCompany("/collections/{collectionId}/images");
        photographerData0.setPhone("/photographer/images");
        java.lang.String str6 = photographerData0.getPaypalID();
        photographerData0.setPaypalID("/collections/addimage");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test100");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setCreationDate();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole3 = user0.getUserRoles();
        user0.setId((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(list_userRole3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test101");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        java.lang.Long long1 = collectionImage0.getId();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user3 = collection2.getUser();
        java.lang.String str4 = collection2.getName();
        boolean b5 = collection2.isPublic();
        collection2.setPublic(false);
        collection2.setName("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        collectionImage0.setCollection(collection2);
        java.lang.String str11 = collection2.getDescription();
        collection2.setPublic(true);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test102");
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
        java.lang.String str16 = collection13.getDescription();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "ROLE_BECOME_PHOTOGRAPHER" + "'", str16.equals("ROLE_BECOME_PHOTOGRAPHER"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test103");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setAccountNonLocked(true);
        boolean b6 = user1.isAccountNonExpired();
        java.lang.String str7 = user1.getUsername();
        user1.setEnabled(true);
        java.lang.String str10 = user1.getUsername();
        boolean b12 = user1.isRoleIncluded("null:1528137270629:cbd34b0779b1c1d7e1215815c5bcba0d");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test104");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getSmallPath();
        imageData2.setPrice((java.lang.Double) 1.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test105");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
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
        boolean b21 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("null:1528137248666:32ad08d7594d28504f1460b47d9ec391", (org.springframework.security.core.userdetails.UserDetails) user15);
        java.lang.String str22 = user15.getFirstName();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard23 = user15.getAuthorities();
        java.lang.String str25 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user15, (long) 10);
        de.htw.sdf.photoplatform.persistence.model.Image image26 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str27 = image26.toString();
        java.lang.String str28 = image26.toString();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData29 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image26);
        java.lang.String str30 = image26.getMetaData();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage31 = photographerManagerImpl0.createPhotographImage(user15, image26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(collection_wildcard23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "9277920e18d95961691dfdc6e2623546" + "'", str25.equals("9277920e18d95961691dfdc6e2623546"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str27.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str28.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test106");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer5 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test107");
        de.htw.sdf.photoplatform.manager.impl.HashManagerImpl hashManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.HashManagerImpl();
        java.lang.String str2 = hashManagerImpl0.hash("/user/becomePhotographer");
        java.lang.String str4 = hashManagerImpl0.hash("");
        try {
            java.lang.String str7 = hashManagerImpl0.hash("null:1528137265625:03bf1b2c50bffe4b6b17dad8841e9f70", "/photographer/images/{imageId}");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c" + "'", str2.equals("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e" + "'", str4.equals("cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test108");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array5 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler6 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler6, handlerMethodReturnValueHandler_array5);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler6);
        javax.servlet.MultipartConfigElement multipartConfigElement9 = application0.multipartConfigElement();
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(multipartConfigElement9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test109");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls4 = null;
        userDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole6 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user7 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b8 = user7.isPhotographer();
        userRole6.setUser(user7);
        user7.setUsername("/api");
        java.lang.String str12 = user7.getUsername();
        boolean b13 = user7.isCredentialsNonExpired();
        java.lang.String str14 = user7.getPassword();
        try {
            userDAOImpl0.delete(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "/api" + "'", str12.equals("/api"));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test110");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        boolean b5 = image0.isEnabled();
        image0.setPath("ROLE_ADMIN");
        image0.setPrice((java.lang.Double) 10.0d);
        boolean b10 = image0.isEnabled();
        java.lang.Long long11 = image0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(long11);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test111");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.Double d1 = image0.getPrice();
        image0.setPrice((java.lang.Double) (-1.0d));
        image0.setChangeDate();
        org.junit.Assert.assertNull(d1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test112");
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
        org.springframework.validation.BindingResult bindingResult20 = null;
        try {
            java.lang.String str21 = photographerController0.addImageToCollection("cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e", bindingResult20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str9.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
        org.junit.Assert.assertNotNull(responseError11);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test113");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        java.lang.String str5 = image0.toString();
        image0.setName("/collections/create");
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str9 = imageData8.getMime();
        imageData8.setThumbnailPath("/collections/{collectionId}/images/{imageId}");
        imageData8.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str5.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNotNull(imageData8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test114");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.User user3 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b4 = user3.isAdmin();
        java.lang.String str5 = user3.getSecToken();
        boolean b6 = user3.isAccountNonLocked();
        try {
            userDAOImpl0.create(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test115");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer1 = null;
        application0.configureDefaultServletHandling(defaultServletHandlerConfigurer1);
        de.htw.sdf.photoplatform.Application application3 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer4 = null;
        application3.configureContentNegotiation(contentNegotiationConfigurer4);
        de.htw.sdf.photoplatform.Application application6 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer7 = null;
        application6.configureContentNegotiation(contentNegotiationConfigurer7);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array9 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler10 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler10, handlerMethodReturnValueHandler_array9);
        application6.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler10);
        application3.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler10);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler10);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer15 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer15);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer17 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer17);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test116");
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
        try {
            java.lang.String str20 = photographerController0.deleteCollection((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str9.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
        org.junit.Assert.assertNotNull(responseError11);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test117");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        java.lang.String str5 = userData0.getHomepage();
        userData0.setCompany("/collections/create");
        java.lang.String str8 = userData0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test118");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer1 = null;
        application0.configureDefaultServletHandling(defaultServletHandlerConfigurer1);
        de.htw.sdf.photoplatform.Application application3 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer4 = null;
        application3.configureContentNegotiation(contentNegotiationConfigurer4);
        de.htw.sdf.photoplatform.Application application6 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer7 = null;
        application6.configureContentNegotiation(contentNegotiationConfigurer7);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array9 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler10 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler10, handlerMethodReturnValueHandler_array9);
        application6.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler10);
        application3.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler10);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler10);
        org.springframework.format.FormatterRegistry formatterRegistry15 = null;
        application0.addFormatters(formatterRegistry15);
        org.springframework.web.servlet.LocaleResolver localeResolver17 = application0.localeResolver();
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(localeResolver17);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test119");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        becomePhotographer0.setHomepage("/users/update");
        becomePhotographer0.setSwift("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test120");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        boolean b5 = image0.isEnabled();
        java.lang.String str6 = image0.getPath();
        image0.setPath("Category{name='null:1528137250344:31149e863206f62132f4465a1c878d2c'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test121");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls2 = null;
        collectionImageDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage5 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        java.lang.Long long6 = collectionImage5.getId();
        de.htw.sdf.photoplatform.persistence.model.Image image7 = null;
        collectionImage5.setImage(image7);
        de.htw.sdf.photoplatform.persistence.model.Collection collection9 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.Image image10 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image10.setCreatedBy("");
        image10.setPrice((java.lang.Double) 1.0d);
        java.lang.String str15 = image10.getDescription();
        java.lang.String str16 = image10.getMime();
        image10.setMobileThumbPath("/photographer/upload");
        boolean b19 = image10.isEnabled();
        image10.setPrice((java.lang.Double) 1.0d);
        collection9.setThumbnail(image10);
        java.lang.String str23 = collection9.getDescription();
        collectionImage5.setCollection(collection9);
        try {
            collectionImageDAOImpl0.delete(collectionImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test122");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setName("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        image0.setPath("/collections/{collectionId}/images");
        image0.setDescription("/index.html");
        image0.setEnabled(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test123");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("null:1528137265625:03bf1b2c50bffe4b6b17dad8841e9f70", errors1);
        de.htw.sdf.photoplatform.exception.common.WebFormException webFormException4 = new de.htw.sdf.photoplatform.exception.common.WebFormException(11003);
        notFoundException2.addSuppressed((java.lang.Throwable) webFormException4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test124");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.lang.String str2 = collection0.getName();
        java.lang.String str3 = collection0.getDescription();
        boolean b4 = collection0.isPublic();
        java.lang.String str5 = collection0.getDescription();
        org.junit.Assert.assertNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test125");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole6 = userRoleDAOImpl0.findByUserAndRoleId((java.lang.Long) 10L, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test126");
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
        org.springframework.validation.MessageCodesResolver messageCodesResolver10 = application0.getMessageCodesResolver();
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNull(messageCodesResolver10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test127");
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
        de.htw.sdf.photoplatform.exception.common.ManagerException managerException24 = new de.htw.sdf.photoplatform.exception.common.ManagerException(10000);
        org.springframework.validation.Errors errors25 = managerException24.getErrors();
        org.springframework.web.servlet.ModelAndView modelAndView26 = null;
        localeChangeInterceptor12.postHandle(httpServletRequest21, httpServletResponse22, (java.lang.Object) managerException24, modelAndView26);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(localeChangeInterceptor12);
        org.junit.Assert.assertNull(errors25);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test128");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setMobileThumbPath("ROLE_CUSTOMER");
        image0.setSmallThumbPath("");
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        boolean b6 = image0.isPublic();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test129");
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
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData22 = null;
        user21.setPhotographerData(photographerData22);
        userImage9.setUser(user21);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test130");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getCompany();
        java.lang.String str3 = userData0.getPaypalID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test131");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.Boolean b4 = userData0.isEnabled();
        userData0.setPhone("/collections/photographers");
        userData0.setLastName("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        userData0.setBanned(true);
        userData0.setLastName("/user/makeadmin/{id}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test132");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.toString();
        java.lang.String str2 = image0.getName();
        image0.setName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str5 = image0.getMobileThumbPath();
        image0.setMime("/user/login");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test133");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setPassword("");
        java.lang.String str3 = userPasswordChange0.getPassword();
        userPasswordChange0.setPasswordConfirm("/collections/showcase");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test134");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setPassword("");
        java.lang.String str3 = userPasswordChange0.getPassword();
        java.lang.String str4 = userPasswordChange0.getPasswordConfirm();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test135");
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
            java.lang.String str25 = hashManagerImpl20.hash("/collections/addimage", "93e210c4650e33acb58f8d1cfa9bbe56");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test136");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getPaypalID();
        java.lang.String str8 = becomePhotographer0.getIban();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test137");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str3 = userRegister0.getPasswordConfirm();
        userRegister0.setPasswordConfirm("ec7908a224b49d37ffc84c612f320838");
        java.lang.String str6 = userRegister0.getLastName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception" + "'", str6.equals("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test138");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        int i7 = responseError6.getStatus();
        int i8 = responseError6.getStatus();
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertTrue(i7 == 404);
        org.junit.Assert.assertTrue(i8 == 404);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test139");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        java.lang.String str3 = image1.getUpdatedBy();
        java.lang.String str4 = image1.getSmallThumbPath();
        image1.setCreatedBy("/collections/addimage");
        java.lang.Long long7 = image1.getId();
        image1.setMobileThumbPath("/collections/{collectionId}");
        de.htw.sdf.photoplatform.persistence.model.User user10 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage11 = imageManagerImpl0.addOwnerToImage(image1, user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test140");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = image0.getCreatedBy();
        image0.setThumbPath("/user/login");
        java.util.Date date5 = null;
        image0.setUpdatedAt(date5);
        image0.setId((java.lang.Long) 1L);
        java.lang.String str9 = image0.getDescription();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test141");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls1 = null;
        categoryDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category4 = categoryDAOImpl0.findByName("null:1528137255129:74131369d5ab98a30139e53b9d69dc36");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test142");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getSmallThumbPath();
        java.lang.String str3 = image0.toString();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        image0.setMime("");
        java.lang.String str7 = image0.getThumbPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test143");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls4 = null;
        userDAOImpl0.setClazz(cls4);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user7 = userDAOImpl0.findOne((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test144");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = userImageDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage5 = userImageDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test145");
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
        java.lang.String str17 = imageData14.getThumbnailPath();
        java.lang.String str18 = imageData14.getPath();
        java.lang.String str19 = imageData14.getName();
        imageData14.setDescription("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str22 = imageData14.getMessageFailed();
        java.lang.String str23 = imageData14.getName();
        org.junit.Assert.assertNotNull(long_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(list_imageData9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test146");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setSwift("/photographer/images");
        java.lang.Boolean b3 = userData0.isAdmin();
        java.lang.String str4 = userData0.getLastName();
        java.util.List<java.lang.String> list_str5 = userData0.getRoles();
        java.lang.String str6 = userData0.getIban();
        org.junit.Assert.assertTrue("'" + b3 + "' != '" + false + "'", b3.equals(false));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(list_str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test147");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        userData0.setIban("/collections/{collectionId}");
        java.lang.Boolean b5 = userData0.isEnabled();
        java.lang.String str6 = userData0.getEmail();
        userData0.setSecToken("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test148");
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
        image13.setPath("null:1528137288660:1a2c7fbd81ed38e3fb25d5bcfea287cf");
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test149");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        image0.setMobileThumbPath("");
        image0.setPrice((java.lang.Double) 100.0d);
        boolean b6 = image0.isEnabled();
        image0.setPrice((java.lang.Double) 0.0d);
        image0.setChangeDate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test150");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls1 = null;
        collectionCategoryDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls3 = null;
        collectionCategoryDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory6 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = null;
        collectionCategory6.setCollection(collection7);
        de.htw.sdf.photoplatform.persistence.model.Collection collection9 = null;
        collectionCategory6.setCollection(collection9);
        de.htw.sdf.photoplatform.persistence.model.Category category11 = collectionCategory6.getCategory();
        java.util.Date date12 = collectionCategory6.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection13 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user14 = collection13.getUser();
        collectionCategory6.setCollection(collection13);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory16 = collectionCategoryDAOImpl0.update(collectionCategory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
        org.junit.Assert.assertNull(category11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test151");
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
            java.lang.String str26 = photographerController0.deleteImageFromCollection((java.lang.Long) 0L, (java.lang.Long) 1L);
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
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test152");
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
        java.lang.String str16 = photographerData0.getHomepage();
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list_collection15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test153");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getName();
        imageData2.setMessageSuccess("39c73479cb767c5a09248b3313c03447");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test154");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls7 = null;
        roleDAOImpl0.setClazz(cls7);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls9 = null;
        roleDAOImpl0.setClazz(cls9);
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test155");
        de.htw.sdf.photoplatform.persistence.model.Category category0 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category0.setName("/user/enablephotographer");
        category0.setName("hi!");
        category0.setName("/photographer/images");
        java.lang.String str7 = category0.getDescription();
        java.lang.String str8 = category0.toString();
        category0.setName("");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Category{name='/photographer/images'}" + "'", str8.equals("Category{name='/photographer/images'}"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test156");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.Boolean b1 = userData0.isBanned();
        org.junit.Assert.assertTrue("'" + b1 + "' != '" + false + "'", b1.equals(false));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test157");
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
        java.lang.String str10 = photographerData0.getIban();
        photographerData0.setCompany("f69da696e5820bcbd9fb36421272c447");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test158");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        image0.setMime("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test159");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setPasswordConfirm("/collections/{collectionId}/images");
        userRegister0.setPassword("null:1528137275958:f851f7955c556afa6678bd624fd107e4");
        java.lang.String str5 = userRegister0.getPassword();
        java.lang.String str6 = userRegister0.getPassword();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null:1528137275958:f851f7955c556afa6678bd624fd107e4" + "'", str5.equals("null:1528137275958:f851f7955c556afa6678bd624fd107e4"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null:1528137275958:f851f7955c556afa6678bd624fd107e4" + "'", str6.equals("null:1528137275958:f851f7955c556afa6678bd624fd107e4"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test160");
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
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage10 = userImageDAOImpl0.findOne((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test161");
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
            java.lang.String str18 = photographerController0.addImageToCollection("/api", bindingResult17);
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
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test162");
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
        de.htw.sdf.photoplatform.persistence.model.Image image15 = userImage9.getImage();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole16 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user17 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b18 = user17.isPhotographer();
        userRole16.setUser(user17);
        user17.setAccountNonLocked(true);
        boolean b22 = user17.isAccountNonExpired();
        java.lang.String str23 = user17.getUsername();
        user17.setEnabled(true);
        userImage9.setOwner(user17);
        java.lang.Long long27 = user17.getId();
        java.lang.String str28 = user17.getLastName();
        boolean b30 = user17.isRoleIncluded("null:1528137294610:43443b4d31d40fe9ba18ff14b1e6cb37");
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(long27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test163");
        de.htw.sdf.photoplatform.persistence.model.Category category0 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category0.setName("/user/enablephotographer");
        category0.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category0.setName("/photographer/images/{imageId}");
        java.lang.String str7 = category0.toString();
        java.lang.String str8 = category0.getDescription();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Category{name='/photographer/images/{imageId}'}" + "'", str7.equals("Category{name='/photographer/images/{imageId}'}"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test164");
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
        photographerData0.setSwift("/collections/photographers/{start}/{count}");
        java.lang.String str17 = photographerData0.getSwift();
        photographerData0.setHomepage("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "/collections/photographers/{start}/{count}" + "'", str17.equals("/collections/photographers/{start}/{count}"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test165");
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
        java.lang.String str13 = photographerData0.getSwift();
        java.lang.String str14 = photographerData0.getCompany();
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test166");
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
        java.lang.String str17 = imageData14.getThumbnailPath();
        java.lang.String str18 = imageData14.getPath();
        java.lang.String str19 = imageData14.getName();
        imageData14.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(long_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(list_imageData9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(long15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test167");
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
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException34 = new de.htw.sdf.photoplatform.exception.BadRequestException("null:1528137263387:737fa038c16b05aadddbb7d717b9f93f");
        org.springframework.web.context.request.WebRequest webRequest35 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError36 = authenticationController0.handleBadRequestException(badRequestException34, webRequest35);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user38 = authenticationController0.userByName("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
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
        org.junit.Assert.assertNotNull(responseError36);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test168");
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
        javax.persistence.EntityManager entityManager10 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage11 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        de.htw.sdf.photoplatform.persistence.model.Image image12 = userImage11.getImage();
        de.htw.sdf.photoplatform.persistence.model.User user13 = userImage11.getOwner();
        de.htw.sdf.photoplatform.persistence.model.Image image14 = userImage11.getImage();
        try {
            userImageDAOImpl0.create(userImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager9);
        org.junit.Assert.assertNull(entityManager10);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(image14);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test169");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = null;
        collectionImage0.setCollection(collection5);
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user8 = collection7.getUser();
        collectionImage0.setCollection(collection7);
        java.lang.String str10 = collection7.getName();
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test170");
        de.htw.sdf.photoplatform.persistence.model.Category category0 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category0.setName("/user/enablephotographer");
        category0.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category0.setDescription("obfuscate");
        category0.setDescription("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        java.lang.String str9 = category0.getName();
        category0.setUpdatedBy("Image{name='Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}', path='null', isPublic=false, enabled=false, price=null}");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c" + "'", str9.equals("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test171");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array2 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection3 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3, collection_array2);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData5 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData7 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData9 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3);
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNotNull(collection_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_collectionData5);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData7);
        org.junit.Assert.assertNotNull(list_collectionData9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test172");
        de.htw.sdf.photoplatform.persistence.model.Category category0 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category0.setName("/user/enablephotographer");
        category0.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category0.setDescription("obfuscate");
        java.lang.String str7 = category0.getName();
        java.lang.String str8 = category0.getName();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c" + "'", str7.equals("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c" + "'", str8.equals("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test173");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        userData0.setIban("/collections/{collectionId}");
        java.lang.Boolean b5 = userData0.isEnabled();
        java.lang.Boolean b6 = userData0.isEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test174");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.makeAdmin("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test175");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
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
        de.htw.sdf.photoplatform.persistence.model.Collection collection11 = collectionCategory1.getCollection();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection12 = photographerManagerImpl0.update(collection11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(category6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test176");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        userRegister0.setEmail("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        userRegister0.setPassword("/user/lock/{id}");
        java.lang.String str6 = userRegister0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "/user/lock/{id}" + "'", str6.equals("/user/lock/{id}"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test177");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory3 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = null;
        collectionCategory3.setCollection(collection4);
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = null;
        collectionCategory3.setCollection(collection6);
        de.htw.sdf.photoplatform.persistence.model.Category category8 = collectionCategory3.getCategory();
        java.util.Date date9 = collectionCategory3.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = collectionCategory3.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Category category11 = collectionCategory3.getCategory();
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory12 = collectionCategoryDAOImpl0.update(collectionCategory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(category8);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertNull(category11);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test178");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls5 = null;
        collectionCategoryDAOImpl0.setClazz(cls5);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls7 = null;
        collectionCategoryDAOImpl0.setClazz(cls7);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory9 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Category category10 = null;
        collectionCategory9.setCategory(category10);
        de.htw.sdf.photoplatform.persistence.model.Collection collection12 = collectionCategory9.getCollection();
        try {
            collectionCategoryDAOImpl0.delete(collectionCategory9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(collection12);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test179");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        javax.persistence.EntityManager entityManager7 = userDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user8 = userDAOImpl0.findPhotographersToActivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test180");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setCreatedBy("/collections/addimage");
        java.lang.Long long6 = image0.getId();
        image0.setUpdatedBy("null:1528137277050:ea4b11766ecf85bf46d8a52721b360a9");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test181");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userRole0.getUser();
        userRole0.setUpdatedBy("/photographer/images/{imageId}");
        de.htw.sdf.photoplatform.persistence.model.Role role5 = userRole0.getRole();
        java.util.Date date6 = userRole0.getUpdatedAt();
        org.junit.Assert.assertNull(role1);
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(role5);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test182");
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
        userRole0.setCreatedBy("ROLE_PHOTOGRAPHER");
        org.junit.Assert.assertNull(role1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(role10);
        org.junit.Assert.assertNotNull(role11);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test183");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls1 = null;
        collectionCategoryDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls3 = null;
        collectionCategoryDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory6 = collectionCategoryDAOImpl0.findOne((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test184");
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
        photographerData27.setIban("ROLE_PHOTOGRAPHER");
        photographerData27.setSwift("null:1528137271348:359dea61c52e045b1b927389910fdd93");
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
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test185");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        userData0.setIban("/collections/{collectionId}");
        java.lang.String str5 = userData0.getCompany();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test186");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.Long long5 = imageData4.getId();
        imageData4.setMessageFailed("");
        imageData4.setMetadata("/photographer/images");
        java.lang.String str10 = imageData4.getSmallPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test187");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionImage0.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = null;
        collectionImage0.setCollection(collection6);
        collectionImage0.setCreatedBy("/collections/{collectionId}/images");
        de.htw.sdf.photoplatform.persistence.model.Image image10 = collectionImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection11 = collectionImage0.getCollection();
        org.junit.Assert.assertNull(collection5);
        org.junit.Assert.assertNotNull(image10);
        org.junit.Assert.assertNull(collection11);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test188");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setId((java.lang.Long) 0L);
        userData0.setPhone("/users/becomephotographers");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test189");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user9 = userDAOImpl0.findByRoleId((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test190");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionImage0.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = collectionImage0.getImage();
        image6.setId((java.lang.Long) 100L);
        image6.setPublic(false);
        org.junit.Assert.assertNull(collection5);
        org.junit.Assert.assertNotNull(image6);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test191");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        java.lang.String str4 = user1.getUpdatedBy();
        user1.setFirstName("");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test192");
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
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory25 = collection21.getCollectionCategories();
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
        org.junit.Assert.assertNull(set_collectionCategory25);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test193");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        java.lang.String str2 = photographerData0.getIban();
        java.lang.String str3 = photographerData0.getPhone();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData4 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection5 = photographerData4.getCollections();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array6 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection7 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection7, collection_array6);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData9 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection7);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData10 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection7);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData11 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection7);
        photographerData4.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection7);
        java.lang.String str13 = photographerData4.getPhone();
        photographerData4.setPhone("/collections/{collectionId}/images");
        java.lang.String str16 = photographerData4.getHomepage();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection17 = photographerData4.getCollections();
        photographerData0.setCollections(list_collection17);
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(list_collection5);
        org.junit.Assert.assertNotNull(collection_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_collectionData9);
        org.junit.Assert.assertNotNull(list_collectionData10);
        org.junit.Assert.assertNotNull(list_collectionData11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list_collection17);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test194");
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
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user9 = userDAOImpl0.findAllNotAdminUsers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test195");
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
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister30 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str31 = userRegister30.getPassword();
        userRegister30.setLastName("/photographer/images");
        userRegister30.setLastName("null:1528137265625:03bf1b2c50bffe4b6b17dad8841e9f70");
        org.springframework.validation.BindingResult bindingResult36 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData37 = authenticationController0.login((de.htw.sdf.photoplatform.webservice.dto.UserCredential) userRegister30, bindingResult36);
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
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test196");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls2 = null;
        collectionImageDAOImpl0.setClazz(cls2);
        try {
            javax.persistence.Query query5 = collectionImageDAOImpl0.createQuery("null:1528137277050:ea4b11766ecf85bf46d8a52721b360a9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test197");
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
        java.lang.String str26 = userData15.getEmail();
        java.lang.Boolean b27 = userData15.isBanned();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + b25 + "' != '" + false + "'", b25.equals(false));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + b27 + "' != '" + false + "'", b27.equals(false));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test198");
        de.htw.sdf.photoplatform.persistence.model.Category category0 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category0.setName("/user/enablephotographer");
        category0.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category0.setName("/photographer/images/{imageId}");
        java.lang.String str7 = category0.getDescription();
        category0.setDescription("ROLE_CUSTOMER");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test199");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getPath();
        java.lang.String str2 = image0.getSmallThumbPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test200");
        de.htw.sdf.photoplatform.persistence.model.Category category0 = new de.htw.sdf.photoplatform.persistence.model.Category();
        java.lang.String str1 = category0.toString();
        java.lang.String str2 = category0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Category{name='null'}" + "'", str1.equals("Category{name='null'}"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Category{name='null'}" + "'", str2.equals("Category{name='null'}"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test201");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        try {
            org.springframework.security.core.userdetails.UserDetails userDetails6 = userDAOImpl0.loadUserByUsername("Category{name='/photographer/images/{imageId}'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test202");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            boolean b8 = userController0.enablePhotographer("f69da696e5820bcbd9fb36421272c447");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test203");
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
        de.htw.sdf.photoplatform.persistence.model.Image image12 = userImage9.getImage();
        org.junit.Assert.assertNull(image12);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test204");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setMobileThumbPath("ROLE_CUSTOMER");
        image0.setCreatedBy("/collections/photographers");
        java.lang.String str5 = image0.getUpdatedBy();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test205");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        image0.setMobileThumbPath("");
        image0.setPrice((java.lang.Double) 100.0d);
        boolean b6 = image0.isEnabled();
        image0.setPrice((java.lang.Double) 0.0d);
        image0.setPublic(true);
        image0.setSmallThumbPath("null:1528137294582:dab166dacc3695a720d9c3367ef6e28e");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test206");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        userRegister0.setEmail("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        userRegister0.setPassword("/user/lock/{id}");
        userRegister0.setPasswordConfirm("hi!");
        userRegister0.setPassword("Image{name='null', path='null', isPublic=false, enabled=false, price=-1.0}");
        userRegister0.setPasswordConfirm("f69da696e5820bcbd9fb36421272c447");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test207");
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
        de.htw.sdf.photoplatform.persistence.model.User user24 = userImage9.getOwner();
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData25 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(userImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str18.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNull(user24);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test208");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = image0.getCreatedBy();
        image0.setThumbPath("/user/login");
        java.lang.String str5 = image0.getCreatedBy();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(imageData6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test209");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection4 = collectionDAOImpl0.findById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test210");
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
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController30 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors32 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException33 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors32);
        org.springframework.web.context.request.WebRequest webRequest34 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError35 = photographerController30.handleBadRequestException(badRequestException33, webRequest34);
        org.springframework.web.context.request.WebRequest webRequest36 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError37 = authenticationController0.handleBadRequestException(badRequestException33, webRequest36);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
        org.junit.Assert.assertTrue(i16 == 10001);
        org.junit.Assert.assertNotNull(responseError19);
        org.junit.Assert.assertNotNull(throwable_array20);
        org.junit.Assert.assertNotNull(responseError22);
        org.junit.Assert.assertNotNull(responseError27);
        org.junit.Assert.assertNotNull(responseError29);
        org.junit.Assert.assertNotNull(responseError35);
        org.junit.Assert.assertNotNull(responseError37);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test211");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.lockUser("cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test212");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        boolean b5 = image0.isEnabled();
        image0.setMobileThumbPath("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        image0.setPublic(true);
        java.lang.String str10 = image0.getMobileThumbPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str10.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test213");
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
        java.util.List<java.lang.Long> list_long27 = collectionData0.getImageIds();
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
        org.junit.Assert.assertNotNull(list_long27);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test214");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls4 = null;
        userDAOImpl0.setClazz(cls4);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user7 = userDAOImpl0.findById((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test215");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test216");
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
        collection0.setName("null:1528137277050:ea4b11766ecf85bf46d8a52721b360a9");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test217");
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
        java.lang.String str12 = userData11.getEmail();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(userData11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test218");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setName("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str6 = image0.toString();
        image0.setEnabled(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Image{name='Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}', path='null', isPublic=false, enabled=false, price=null}" + "'", str6.equals("Image{name='Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test219");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls3 = null;
        userRoleDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userRoleDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole7 = userRoleDAOImpl0.findOne(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test220");
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
        java.lang.String str16 = responseError15.getDeveloperInfo();
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError12);
        org.junit.Assert.assertTrue(i13 == 10000);
        org.junit.Assert.assertNotNull(responseError15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10000" + "'", str16.equals("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10000"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test221");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER");
        org.springframework.web.context.request.WebRequest webRequest3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = photographerController0.handleBadRequestException(badRequestException2, webRequest3);
        try {
            java.lang.String str6 = photographerController0.deleteCollection((java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test222");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setMobileThumbPath("ROLE_CUSTOMER");
        image0.setSmallThumbPath("");
        java.lang.String str5 = image0.getMobileThumbPath();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ROLE_CUSTOMER" + "'", str5.equals("ROLE_CUSTOMER"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test223");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.web.servlet.LocaleResolver localeResolver5 = application0.localeResolver();
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory6 = application0.servletContainer();
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor7 = application0.localeChangeInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest8 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse9 = null;
        de.htw.sdf.photoplatform.Application application10 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer11 = null;
        application10.configureContentNegotiation(contentNegotiationConfigurer11);
        de.htw.sdf.photoplatform.Application application13 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer14 = null;
        application13.configureContentNegotiation(contentNegotiationConfigurer14);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array16 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler17 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler17, handlerMethodReturnValueHandler_array16);
        application13.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler17);
        application10.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler17);
        org.springframework.format.FormatterRegistry formatterRegistry21 = null;
        application10.addFormatters(formatterRegistry21);
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry23 = null;
        application10.addResourceHandlers(resourceHandlerRegistry23);
        de.htw.sdf.photoplatform.Application application25 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer26 = null;
        application25.configureContentNegotiation(contentNegotiationConfigurer26);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array28 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler29 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler29, handlerMethodReturnValueHandler_array28);
        application25.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler29);
        application10.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler29);
        localeChangeInterceptor7.afterConcurrentHandlingStarted(httpServletRequest8, httpServletResponse9, (java.lang.Object) arraylist_handlerMethodReturnValueHandler29);
        org.junit.Assert.assertNotNull(localeResolver5);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory6);
        org.junit.Assert.assertNotNull(localeChangeInterceptor7);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array28);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test224");
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
        imageData15.setPrice((java.lang.Double) 10.0d);
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNotNull(imageData15);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test225");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getPath();
        imageData2.setDescription("null:1528137248666:32ad08d7594d28504f1460b47d9ec391");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData6 = imageData2.getUserData();
        java.lang.String str7 = imageData2.getMobilePath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(userData6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test226");
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
        userData4.setPaypalID("Image{name='null', path='', isPublic=false, enabled=false, price=1.0}");
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list_str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test227");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        try {
            roleDAOImpl0.deleteById(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test228");
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
        image13.setPath("cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e");
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str18.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test229");
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException1 = new de.htw.sdf.photoplatform.exception.NotFoundException("cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test230");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        userRegister0.setPasswordConfirm("de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
        userRegister0.setPassword("/users/profile/{userId}");
        userRegister0.setLastName("bbd35e0331b2294504855572375f9bec");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test231");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        javax.persistence.EntityManager entityManager7 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls8 = null;
        roleDAOImpl0.setClazz(cls8);
        try {
            roleDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager7);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test232");
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
        javax.persistence.EntityManager entityManager10 = userImageDAOImpl0.getEntityManager();
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
        java.lang.String str29 = user25.getPassword();
        java.lang.String str30 = user25.getUsername();
        boolean b31 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("null:1528137248666:32ad08d7594d28504f1460b47d9ec391", (org.springframework.security.core.userdetails.UserDetails) user25);
        java.lang.String str32 = user25.getFirstName();
        boolean b33 = user25.isPhotographer();
        java.lang.String str34 = user25.getUsername();
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
        java.lang.String str47 = photographerData35.getIban();
        photographerData35.setPaypalID("obfuscate");
        photographerData35.setIban("/collections/photographers/{start}/{count}");
        photographerData35.setPaypalID("null:1528137290306:359bf08f2d461e07611e727909d973a0");
        user25.setPhotographerData(photographerData35);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage55 = userImageDAOImpl0.getUserImagesBy(user25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager9);
        org.junit.Assert.assertNull(entityManager10);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(list_collection36);
        org.junit.Assert.assertNotNull(collection_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(list_collectionData40);
        org.junit.Assert.assertNotNull(list_collectionData41);
        org.junit.Assert.assertNotNull(list_collectionData42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test233");
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
        int i21 = responseError20.getStatus();
        int i22 = responseError20.getCode();
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError12);
        org.junit.Assert.assertTrue(i13 == 10000);
        org.junit.Assert.assertNotNull(responseError15);
        org.junit.Assert.assertNotNull(responseError20);
        org.junit.Assert.assertTrue(i21 == 404);
        org.junit.Assert.assertTrue(i22 == 10001);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test234");
        de.htw.sdf.photoplatform.persistence.model.Category category0 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category0.setName("/user/enablephotographer");
        category0.setName("hi!");
        java.lang.String str5 = category0.getDescription();
        java.lang.String str6 = category0.getDescription();
        java.lang.String str7 = category0.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Category{name='hi!'}" + "'", str7.equals("Category{name='hi!'}"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test235");
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage0 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image1);
        userImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.User user5 = userImage0.getUser();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole6 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user7 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b8 = user7.isPhotographer();
        userRole6.setUser(user7);
        user7.setAccountNonLocked(true);
        boolean b12 = user7.isAccountNonExpired();
        java.lang.String str13 = user7.getUsername();
        user7.setEnabled(true);
        userImage0.setOwner(user7);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test236");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError((int) (byte) 1, (int) (byte) 0, "/users/admin/{start}/{count}", errors3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str5 = responseError4.getErrors();
        int i6 = responseError4.getStatus();
        org.junit.Assert.assertNotNull(map_str_list_str5);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test237");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category5 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category5.setName("/user/enablephotographer");
        category5.setName("hi!");
        category5.setName("/photographer/images");
        java.lang.String str12 = category5.getDescription();
        category5.setName("/user/register");
        java.lang.String str15 = category5.getName();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory16 = collectionCategoryDAOImpl0.getCollectionCategoryBy(category5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "/user/register" + "'", str15.equals("/user/register"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test238");
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
        imageData8.setName("/api");
        imageData8.setCode((java.lang.Long) 1L);
        java.lang.String str19 = imageData8.getMobilePath();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "/users/update" + "'", str19.equals("/users/update"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test239");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        userPasswordChange0.setPasswordConfirm("/collections/{collectionId}/images");
        userPasswordChange0.setNewPassword("/users/admin/{start}/{count}");
        java.lang.String str7 = userPasswordChange0.getPasswordConfirm();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/collections/{collectionId}/images" + "'", str7.equals("/collections/{collectionId}/images"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test240");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange7 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange7.setNewPassword("/showcase");
        java.lang.String str10 = userPasswordChange7.getPasswordConfirm();
        java.lang.String str11 = userPasswordChange7.getPassword();
        org.springframework.validation.BindingResult bindingResult12 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData13 = userController0.changePassword(userPasswordChange7, bindingResult12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test241");
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
        de.htw.sdf.photoplatform.webservice.dto.UserData userData14 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str15 = userData14.getLastName();
        java.lang.String str16 = userData14.getEmail();
        java.lang.String str17 = userData14.getHomepage();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData18 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str19 = userData18.getLastName();
        java.util.List<java.lang.String> list_str20 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData18.setRoles(list_str20);
        userData14.setRoles(list_str20);
        java.lang.String str23 = userData14.getLastName();
        userData14.setLastName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        java.util.List<java.lang.String> list_str26 = userData14.getRoles();
        userData0.setRoles(list_str26);
        userData0.setHomepage("null:1528137294610:43443b4d31d40fe9ba18ff14b1e6cb37");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list_str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(list_str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(list_str26);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test242");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setName("");
        java.lang.String str5 = imageData2.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test243");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData1 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = collectionData1.getThumbnail();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str4 = image3.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image3);
        imageData5.setMobilePath("/users/update");
        java.lang.Long long8 = imageData5.getCode();
        imageData5.setName("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData11 = imageData5.getUserData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData12 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData12.setSwift("/photographer/images");
        imageData5.setUserData(userData12);
        collectionData1.setUserdata(userData12);
        org.springframework.validation.BindingResult bindingResult17 = null;
        try {
            userController0.updateUser(userData12, bindingResult17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(imageData2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertNull(userData11);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test244");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = null;
        userRole0.setUser(user2);
        de.htw.sdf.photoplatform.persistence.model.User user4 = userRole0.getUser();
        org.junit.Assert.assertNull(role1);
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test245");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage7 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 0L, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test246");
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
        java.lang.String str12 = imageData2.getThumbnailPath();
        imageData2.setMessageSuccess("39c73479cb767c5a09248b3313c03447");
        imageData2.setName("null:1528137271348:359dea61c52e045b1b927389910fdd93");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test247");
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException1 = new de.htw.sdf.photoplatform.exception.NotFoundException("/collections/{collectionId}/images/{imageId}");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test248");
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
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer17 = null;
        application0.configureDefaultServletHandling(defaultServletHandlerConfigurer17);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test249");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        java.lang.String str5 = userData0.getHomepage();
        userData0.setCompany("/collections/create");
        userData0.setBanned(false);
        java.lang.String str10 = userData0.getPhone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test250");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setCreationDate();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole3 = user0.getUserRoles();
        user0.setFirstName("/users/profile/{userId}");
        user0.setAccountNonLocked(true);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(list_userRole3);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test251");
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException1 = new de.htw.sdf.photoplatform.exception.BadRequestException("Category{name='/photographer/images'}");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test252");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        boolean b5 = image0.isEnabled();
        image0.setMobileThumbPath("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        java.lang.String str8 = image0.getMetaData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test253");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.lang.String str2 = collection0.getName();
        java.lang.String str3 = collection0.getName();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str5 = image4.toString();
        java.lang.String str6 = image4.getName();
        image4.setId((java.lang.Long) 0L);
        collection0.setThumbnail(image4);
        boolean b10 = collection0.isPublic();
        org.junit.Assert.assertNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str5.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test254");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        try {
            javax.persistence.Query query4 = userRoleDAOImpl0.createQuery("null:1528137265168:246d1b80c2f43651d8cc26e44925e89a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test255");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.LocaleResolver localeResolver5 = application0.localeResolver();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer6 = null;
        application0.configureDefaultServletHandling(defaultServletHandlerConfigurer6);
        org.junit.Assert.assertNotNull(localeResolver5);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test256");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        java.lang.String str1 = userRegister0.getPassword();
        userRegister0.setEmail("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        userRegister0.setPassword("/user/lock/{id}");
        userRegister0.setPasswordConfirm("hi!");
        userRegister0.setPasswordConfirm("null:1528137290244:943874d4d401ee35c1fdddc6428199d7");
        java.lang.String str10 = userRegister0.getPasswordConfirm();
        userRegister0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null:1528137290244:943874d4d401ee35c1fdddc6428199d7" + "'", str10.equals("null:1528137290244:943874d4d401ee35c1fdddc6428199d7"));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test257");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage5 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str7 = image6.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image6);
        userImage5.setImage(image6);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage10 = userImageDAOImpl0.update(userImage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test258");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        java.lang.String str2 = photographerData0.getIban();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection3 = photographerData0.getCollections();
        photographerData0.setIban("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_PHOTOGRAPHER");
        photographerData0.setHomepage("5466ee41bed5654e4115c42a3a83695ca4116b0fb962fb91947017276c09124bb3c17abbb2199e1cb0917457cd1ad525f8bedf7a627e026584a96766ac42d85e");
        org.junit.Assert.assertNull(list_collection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(list_collection3);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test259");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setPassword("ROLE_PHOTOGRAPHER");
        boolean b5 = user0.isRoleIncluded("/user/becomePhotographer");
        boolean b6 = user0.isCredentialsNonExpired();
        java.lang.String str7 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user0);
        java.lang.String str8 = user0.getPassword();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData9 = user0.getPhotographerData();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null:1528137308088:b4ba63b2db64282835336bc46b057cd4" + "'", str7.equals("null:1528137308088:b4ba63b2db64282835336bc46b057cd4"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ROLE_PHOTOGRAPHER" + "'", str8.equals("ROLE_PHOTOGRAPHER"));
        org.junit.Assert.assertNull(photographerData9);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test260");
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
        de.htw.sdf.photoplatform.persistence.model.User user15 = collection0.getUser();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(set_collectionImage14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test261");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        image0.setPrice((java.lang.Double) (-1.0d));
        image0.setPrice((java.lang.Double) 100.0d);
        java.lang.String str9 = image0.getThumbPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test262");
        de.htw.sdf.photoplatform.persistence.model.Category category0 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category0.setName("/user/enablephotographer");
        category0.setName("hi!");
        category0.setName("/photographer/images");
        java.lang.String str7 = category0.getDescription();
        category0.setName("/user/register");
        category0.setDescription("null:1528137290244:943874d4d401ee35c1fdddc6428199d7");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test263");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        java.util.Date date6 = collectionImage0.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Image image7 = collectionImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection8 = collectionImage0.getCollection();
        org.junit.Assert.assertNotNull(image5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(image7);
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test264");
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
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry42 = null;
        try {
            application0.addInterceptors(interceptorRegistry42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
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
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test265");
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
        de.htw.sdf.photoplatform.persistence.model.Image image21 = userImage9.getImage();
        de.htw.sdf.photoplatform.persistence.model.User user22 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b23 = user22.isBecomePhotographer();
        user22.setFirstName("/index.html");
        user22.setId((java.lang.Long) (-1L));
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData28 = user22.getPhotographerData();
        userImage9.setOwner(user22);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(photographerData28);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test266");
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
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData21 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array26 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long27, long_array26);
        collectionData21.setImageIds((java.util.List<java.lang.Long>) arraylist_long27);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData30 = collectionData21.getImages();
        de.htw.sdf.photoplatform.persistence.model.Image image31 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str32 = image31.getMime();
        java.lang.String str33 = image31.getUpdatedBy();
        java.lang.String str34 = image31.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData35 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image31);
        java.lang.Long long36 = imageData35.getId();
        collectionData21.setThumbnail(imageData35);
        collectionData21.setPublic((java.lang.Boolean) true);
        collectionData21.setName("93e210c4650e33acb58f8d1cfa9bbe56");
        org.springframework.validation.BindingResult bindingResult42 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData43 = photographerController0.updateCollection(collectionData21, bindingResult42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError12);
        org.junit.Assert.assertTrue(i13 == 10000);
        org.junit.Assert.assertNotNull(responseError15);
        org.junit.Assert.assertNotNull(responseError20);
        org.junit.Assert.assertNotNull(long_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(list_imageData30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(long36);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test267");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user9 = userDAOImpl0.find((java.lang.Integer) 35, (java.lang.Integer) 400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test268");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.lang.String str2 = collection0.getName();
        collection0.setDescription("cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e");
        org.junit.Assert.assertNull(user1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test269");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setCompany("/showcase");
        java.lang.String str5 = becomePhotographer0.getIban();
        becomePhotographer0.setPhone("/users/admin/{start}/{count}");
        java.lang.String str8 = becomePhotographer0.getPaypalID();
        java.lang.String str9 = becomePhotographer0.getIban();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test270");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setId((java.lang.Long) 0L);
        userData0.setEnabled(false);
        userData0.setAdmin(false);
        userData0.setId((java.lang.Long) 100L);
        userData0.setId((java.lang.Long) (-1L));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test271");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        java.lang.String str3 = image0.toString();
        java.lang.String str4 = image0.getMobileThumbPath();
        java.lang.String str5 = image0.getDescription();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test272");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = roleDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Role> list_role4 = roleDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test273");
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory0 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = null;
        collectionCategory0.setCollection(collection1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = null;
        collectionCategory0.setCollection(collection3);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user6 = collection5.getUser();
        java.lang.String str7 = collection5.getName();
        collectionCategory0.setCollection(collection5);
        de.htw.sdf.photoplatform.persistence.model.Category category9 = collectionCategory0.getCategory();
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(category9);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test274");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str5 = imageData4.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test275");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.lang.String str2 = collection0.getName();
        java.lang.String str3 = collection0.getDescription();
        boolean b4 = collection0.isPublic();
        java.lang.String str5 = collection0.getName();
        java.lang.String str6 = collection0.toString();
        org.junit.Assert.assertNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Collection{user=null, name='null'}" + "'", str6.equals("Collection{user=null, name='null'}"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test276");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getSwift();
        java.lang.String str8 = becomePhotographer0.getIban();
        java.lang.String str9 = becomePhotographer0.getCompany();
        becomePhotographer0.setPhone("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/users/admin/{start}/{count}" + "'", str7.equals("/users/admin/{start}/{count}"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test277");
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
        de.htw.sdf.photoplatform.persistence.model.User user15 = userImage11.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user16 = userImage11.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user17 = userImage11.getOwner();
        try {
            userImageDAOImpl0.delete(userImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test278");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array5 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler6 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler6, handlerMethodReturnValueHandler_array5);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler6);
        org.springframework.format.FormatterRegistry formatterRegistry9 = null;
        application0.addFormatters(formatterRegistry9);
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry11 = null;
        try {
            application0.addInterceptors(interceptorRegistry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test279");
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
        java.lang.String str16 = userData11.getIban();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long7);
        org.junit.Assert.assertNull(userData10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test280");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError((int) 'a', 100, "/photographer/images/{imageId}", errors3);
        int i5 = responseError4.getCode();
        org.junit.Assert.assertTrue(i5 == 100);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test281");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        try {
            userDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test282");
        de.htw.sdf.photoplatform.exception.common.WebFormException webFormException1 = new de.htw.sdf.photoplatform.exception.common.WebFormException(11002);
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController2 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors4 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException5 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors4);
        org.springframework.web.context.request.WebRequest webRequest6 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError7 = photographerController2.handleBadRequestException(badRequestException5, webRequest6);
        webFormException1.addSuppressed((java.lang.Throwable) badRequestException5);
        org.junit.Assert.assertNotNull(responseError7);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test283");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls1 = null;
        collectionCategoryDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls3 = null;
        collectionCategoryDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager6 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls7 = null;
        collectionCategoryDAOImpl0.setClazz(cls7);
        org.junit.Assert.assertNull(entityManager5);
        org.junit.Assert.assertNull(entityManager6);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test284");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer7 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user9 = userDAOImpl0.findOne((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test285");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls3 = null;
        userRoleDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userRoleDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole8 = userRoleDAOImpl0.findByUserAndRoleId((java.lang.Long) (-1L), (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test286");
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
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard22 = user14.getAuthorities();
        boolean b23 = user14.isCredentialsNonExpired();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData24 = user14.getPhotographerData();
        user14.setAccountNonLocked(true);
        user14.setPassword("/api");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(collection_wildcard22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(photographerData24);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test287");
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
        javax.persistence.EntityManager entityManager10 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user11 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b12 = user11.isBecomePhotographer();
        boolean b13 = user11.isAccountNonLocked();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage14 = userImageDAOImpl0.getUserImagesBy(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager9);
        org.junit.Assert.assertNull(entityManager10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test288");
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
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard22 = user14.getAuthorities();
        boolean b23 = user14.isCredentialsNonExpired();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData24 = user14.getPhotographerData();
        user14.setAccountNonLocked(true);
        user14.setEnabled(false);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(collection_wildcard22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(photographerData24);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test289");
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
        boolean b13 = user4.isPhotographer();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard14 = user4.getAuthorities();
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
        org.junit.Assert.assertNull(collection_wildcard14);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test290");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls5 = null;
        collectionImageDAOImpl0.setClazz(cls5);
        javax.persistence.EntityManager entityManager7 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls8 = null;
        collectionImageDAOImpl0.setClazz(cls8);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage11 = collectionImageDAOImpl0.findOne((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager7);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test291");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.makeAdmin("null:1528137290244:943874d4d401ee35c1fdddc6428199d7");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test292");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData2 = collectionData0.getImages();
        java.util.List<java.lang.Long> list_long3 = collectionData0.getImageIds();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(list_imageData2);
        org.junit.Assert.assertNull(list_long3);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test293");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = null;
        collectionImage0.setCollection(collection6);
        de.htw.sdf.photoplatform.persistence.model.Image image8 = collectionImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.Image image9 = collectionImage0.getImage();
        de.htw.sdf.photoplatform.persistence.model.Image image10 = collectionImage0.getImage();
        java.lang.String str11 = image10.getMime();
        org.junit.Assert.assertNotNull(image5);
        org.junit.Assert.assertNotNull(image8);
        org.junit.Assert.assertNotNull(image9);
        org.junit.Assert.assertNotNull(image10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test294");
        de.htw.sdf.photoplatform.manager.impl.HashManagerImpl hashManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.HashManagerImpl();
        java.lang.String str2 = hashManagerImpl0.hash("/user/becomePhotographer");
        java.lang.String str4 = hashManagerImpl0.hash("abe34aa080ac4421665a72329e218ae76e6eae82d181635ba4a5f8548e70866084fd9cd5c793d5b3a4165763081b95813d4bdb3d679b27d667fea0502caa5a9b");
        try {
            java.lang.String str7 = hashManagerImpl0.hash("Collection{user=de.htw.sdf.photoplatform.persistence.model.User [ID=null], name='null'}", "ROLE_ADMIN");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c" + "'", str2.equals("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5466ee41bed5654e4115c42a3a83695ca4116b0fb962fb91947017276c09124bb3c17abbb2199e1cb0917457cd1ad525f8bedf7a627e026584a96766ac42d85e" + "'", str4.equals("5466ee41bed5654e4115c42a3a83695ca4116b0fb962fb91947017276c09124bb3c17abbb2199e1cb0917457cd1ad525f8bedf7a627e026584a96766ac42d85e"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test295");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        java.lang.Long long4 = collectionImage3.getId();
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user6 = collection5.getUser();
        java.lang.String str7 = collection5.getName();
        boolean b8 = collection5.isPublic();
        collection5.setPublic(false);
        collection5.setName("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        collectionImage3.setCollection(collection5);
        java.lang.String str14 = collection5.getDescription();
        try {
            collectionDAOImpl0.create(collection5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(long4);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test296");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        try {
            userRoleDAOImpl0.deleteById((long) 404);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test297");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        image0.setCreatedBy("ROLE_ADMIN");
        java.lang.String str7 = image0.getMetaData();
        java.lang.String str8 = image0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test298");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.Boolean b4 = userData0.isEnabled();
        userData0.setId((java.lang.Long) 1L);
        java.lang.String str7 = userData0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test299");
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
        image15.setCreationDate();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(set_collectionImage14);
        org.junit.Assert.assertNotNull(image15);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test300");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setCreatedBy("/collections/addimage");
        java.lang.Long long6 = image0.getId();
        image0.setMobileThumbPath("/collections/{collectionId}");
        java.lang.String str9 = image0.getSmallThumbPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(long6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test301");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setAccountNonLocked(true);
        boolean b6 = user1.isAccountNonExpired();
        java.lang.String str7 = user1.getUsername();
        java.lang.String str8 = user1.getFirstName();
        boolean b9 = user1.isAccountNonExpired();
        java.lang.String str10 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user1);
        user1.setAccountNonLocked(false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null:1528137308679:e9098789ef61345276dd5540e6cced03" + "'", str10.equals("null:1528137308679:e9098789ef61345276dd5540e6cced03"));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test302");
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
        java.lang.String str13 = collectionData0.getName();
        collectionData0.setName("/user/enablephotographer");
        org.junit.Assert.assertNull(userData1);
        org.junit.Assert.assertNull(list_long2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(long9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test303");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData8 = photographerController0.getShowcase((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test304");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = image0.getCreatedBy();
        image0.setThumbPath("/user/login");
        java.util.Date date5 = null;
        image0.setUpdatedAt(date5);
        image0.setId((java.lang.Long) 1L);
        java.lang.String str9 = image0.getUpdatedBy();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test305");
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
        userRegister40.setLastName("/photographer/images");
        userRegister40.setLastName("null:1528137265625:03bf1b2c50bffe4b6b17dad8841e9f70");
        userRegister40.setPassword("obfuscate");
        userRegister40.setPassword("ROLE_ADMIN");
        userRegister40.setFirstName("null:1528137277050:ea4b11766ecf85bf46d8a52721b360a9");
        java.lang.String str52 = userRegister40.getPassword();
        org.springframework.validation.BindingResult bindingResult53 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData54 = authenticationController0.login((de.htw.sdf.photoplatform.webservice.dto.UserCredential) userRegister40, bindingResult53);
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
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "ROLE_ADMIN" + "'", str52.equals("ROLE_ADMIN"));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test306");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setIban("ROLE_ADMIN");
        java.lang.String str7 = becomePhotographer0.getPhone();
        java.lang.String str8 = becomePhotographer0.getPaypalID();
        java.lang.String str9 = becomePhotographer0.getCompany();
        becomePhotographer0.setPaypalID("Category{name='null:1528137250344:31149e863206f62132f4465a1c878d2c'}");
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/user/makeadmin/{id}" + "'", str7.equals("/user/makeadmin/{id}"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test307");
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
        de.htw.sdf.photoplatform.Application application10 = new de.htw.sdf.photoplatform.Application();
        de.htw.sdf.photoplatform.Application application11 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer12 = null;
        application11.configureAsyncSupport(asyncSupportConfigurer12);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer14 = null;
        application11.configureAsyncSupport(asyncSupportConfigurer14);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array16 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver17 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver17, handlerExceptionResolver_array16);
        application11.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver17);
        org.springframework.web.servlet.LocaleResolver localeResolver20 = application11.localeResolver();
        de.htw.sdf.photoplatform.Application application21 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer22 = null;
        application21.configureDefaultServletHandling(defaultServletHandlerConfigurer22);
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array24 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver25 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver25, handlerMethodArgumentResolver_array24);
        application21.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver25);
        application11.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver25);
        application10.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver25);
        application0.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver25);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(messageCodesResolver7);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(localeResolver20);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array24);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test308");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getMetadata();
        imageData2.setPrice((java.lang.Double) (-1.0d));
        imageData2.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test309");
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
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister30 = null;
        org.springframework.validation.BindingResult bindingResult31 = null;
        try {
            authenticationController0.register(userRegister30, bindingResult31);
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
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test310");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls3 = null;
        categoryDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = categoryDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Category> list_category6 = categoryDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test311");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls3 = null;
        imageDAOImpl0.setClazz(cls3);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image5 = imageDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test312");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
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
        de.htw.sdf.photoplatform.persistence.model.User user14 = null;
        userRole3.setUser(user14);
        de.htw.sdf.photoplatform.persistence.model.Role role16 = userRole3.getRole();
        try {
            roleDAOImpl0.delete(role16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(role4);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(role13);
        org.junit.Assert.assertNotNull(role16);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test313");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        user0.setEnabled(true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test314");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls6 = null;
        userImageDAOImpl0.setClazz(cls6);
        de.htw.sdf.photoplatform.persistence.model.User user8 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b9 = user8.isAdmin();
        java.lang.String str10 = user8.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData11 = null;
        user8.setPhotographerData(photographerData11);
        java.lang.String str13 = user8.toString();
        java.lang.String str14 = user8.getUsername();
        user8.setLastName("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        boolean b17 = user8.isEnabled();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage20 = userImageDAOImpl0.getPhotographImages(user8, 10002, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str13.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test315");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls2 = null;
        collectionImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls4 = null;
        collectionImageDAOImpl0.setClazz(cls4);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage7 = collectionImageDAOImpl0.findOne((long) 11003);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test316");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        java.util.Date date6 = collectionImage0.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = null;
        collectionImage0.setCollection(collection7);
        de.htw.sdf.photoplatform.persistence.model.Collection collection9 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user10 = collection9.getUser();
        boolean b11 = collection9.isPublic();
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
        java.lang.String str29 = user25.getPassword();
        java.lang.String str30 = user25.getUsername();
        user25.setLastName("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        java.lang.String str33 = user25.getLastName();
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard34 = user25.getAuthorities();
        collection9.setUser(user25);
        de.htw.sdf.photoplatform.persistence.model.User user36 = collection9.getUser();
        collectionImage0.setCollection(collection9);
        org.junit.Assert.assertNotNull(image5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str33.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
        org.junit.Assert.assertNull(collection_wildcard34);
        org.junit.Assert.assertNotNull(user36);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test317");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData3 = null;
        user0.setPhotographerData(photographerData3);
        java.lang.String str5 = user0.toString();
        boolean b6 = user0.isAccountNonExpired();
        user0.setAccountNonLocked(false);
        user0.setCreationDate();
        java.util.Date date10 = null;
        user0.setUpdatedAt(date10);
        boolean b12 = user0.isEnabled();
        boolean b13 = user0.isAccountNonLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "de.htw.sdf.photoplatform.persistence.model.User [ID=null]" + "'", str5.equals("de.htw.sdf.photoplatform.persistence.model.User [ID=null]"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test318");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str3 = userRegister0.getFirstName();
        userRegister0.setPasswordConfirm("/api");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test319");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.Boolean b4 = userData0.isBanned();
        userData0.setAdmin(false);
        userData0.setPhone("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test320");
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
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard22 = user14.getAuthorities();
        boolean b23 = user14.isCredentialsNonExpired();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData24 = user14.getPhotographerData();
        java.lang.String str25 = user14.getPassword();
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(collection_wildcard22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(photographerData24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test321");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER");
        org.springframework.web.context.request.WebRequest webRequest3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = photographerController0.handleBadRequestException(badRequestException2, webRequest3);
        try {
            java.lang.String str6 = photographerController0.deletePhotographersImage((java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError4);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test322");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setPasswordConfirm("/collections/{collectionId}/images");
        java.lang.String str3 = userRegister0.getLastName();
        userRegister0.setLastName("null:1528137255129:74131369d5ab98a30139e53b9d69dc36");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test323");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls4 = null;
        collectionCategoryDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory6 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = null;
        collectionCategory6.setCollection(collection7);
        de.htw.sdf.photoplatform.persistence.model.Category category9 = collectionCategory6.getCategory();
        de.htw.sdf.photoplatform.persistence.model.Category category10 = collectionCategory6.getCategory();
        try {
            collectionCategoryDAOImpl0.create(collectionCategory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(category9);
        org.junit.Assert.assertNull(category10);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test324");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setMobileThumbPath("ROLE_CUSTOMER");
        image0.setSmallThumbPath("");
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        boolean b6 = image0.isPublic();
        java.lang.String str7 = image0.getSmallThumbPath();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test325");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        imageData2.setMime("/showcase");
        imageData2.setCode((java.lang.Long) 10L);
        imageData2.setId((java.lang.Long) 0L);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test326");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection8 = collectionDAOImpl0.findCollectionsByUser((long) (short) -1, 11002, (int) 'a', (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test327");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        userData0.setIban("/collections/{collectionId}");
        userData0.setLastName("93e210c4650e33acb58f8d1cfa9bbe56");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test328");
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
            userRoleDAOImpl0.deleteById((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager8);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test329");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getDescription();
        imageData2.setMessageFailed("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        java.lang.String str9 = imageData2.getMetadata();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test330");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image6.setCreatedBy("");
        image6.setPrice((java.lang.Double) 1.0d);
        java.lang.String str11 = image6.getDescription();
        java.lang.String str12 = image6.getMime();
        image6.setMobileThumbPath("/photographer/upload");
        boolean b15 = image6.isEnabled();
        image6.setPrice((java.lang.Double) 1.0d);
        collection5.setThumbnail(image6);
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage19 = collection5.getCollectionImages();
        de.htw.sdf.photoplatform.persistence.model.Image image20 = collection5.getThumbnail();
        java.lang.String str21 = collection5.getName();
        java.lang.String str22 = collection5.toString();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection23 = collectionDAOImpl0.update(collection5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(set_collectionImage19);
        org.junit.Assert.assertNotNull(image20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Collection{user=null, name='null'}" + "'", str22.equals("Collection{user=null, name='null'}"));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test331");
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
        boolean b22 = user14.isPhotographer();
        java.lang.String str23 = user14.getUsername();
        java.lang.String str24 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user14);
        boolean b25 = user14.isPhotographer();
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "null:1528137309202:ffc03685c0d05d7e62c276b5110a61fd" + "'", str24.equals("null:1528137309202:ffc03685c0d05d7e62c276b5110a61fd"));
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test332");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        boolean b4 = user0.isCredentialsNonExpired();
        user0.setSecToken("Category{name='null'}");
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test333");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole6 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole7 = userRoleDAOImpl0.update(userRole6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test334");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.Double d1 = image0.getPrice();
        image0.setPrice((java.lang.Double) (-1.0d));
        java.lang.String str4 = image0.getMetaData();
        image0.setPrice((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNull(d1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test335");
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
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry13 = null;
        application0.addResourceHandlers(resourceHandlerRegistry13);
        de.htw.sdf.photoplatform.Application application15 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer16 = null;
        application15.configureContentNegotiation(contentNegotiationConfigurer16);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array18 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler19 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler19, handlerMethodReturnValueHandler_array18);
        application15.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler19);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler19);
        org.springframework.format.FormatterRegistry formatterRegistry23 = null;
        application0.addFormatters(formatterRegistry23);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array18);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test336");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        user1.setUsername("/api");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData6 = null;
        user1.setPhotographerData(photographerData6);
        user1.setPassword("/user/register");
        user1.setLastName("/users/becomephotographers");
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test337");
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
        user23.setUsername("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        boolean b27 = user23.isAdmin();
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str18.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test338");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        userData0.setBanned(false);
        java.lang.String str5 = userData0.getIban();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test339");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        image0.setCreationDate();
        image0.setPath("null:1528137293936:a0988808b1e86f8e45491a6365ca0d34");
        java.lang.String str5 = image0.getThumbPath();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test340");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        imageData1.setMessageFailed("/user/register");
        imageData1.setCode((java.lang.Long) 100L);
        imageData1.setDescription("/collections/photographers/{start}/{count}");
        java.lang.Long long8 = imageData1.getCode();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8.equals(100L));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test341");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = image0.getCreatedBy();
        java.util.Date date3 = null;
        image0.setUpdatedAt(date3);
        image0.setEnabled(false);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test342");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array5 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver6 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver6, handlerExceptionResolver_array5);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver6);
        org.springframework.validation.MessageCodesResolver messageCodesResolver9 = application0.getMessageCodesResolver();
        org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry resourceHandlerRegistry10 = null;
        application0.addResourceHandlers(resourceHandlerRegistry10);
        org.springframework.web.servlet.LocaleResolver localeResolver12 = application0.localeResolver();
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(messageCodesResolver9);
        org.junit.Assert.assertNotNull(localeResolver12);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test343");
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array0 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection1 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1, collection_array0);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData3 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData4 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData5 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData8 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1, (java.lang.Boolean) false);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData9 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData11 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1, (java.lang.Boolean) false);
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
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test344");
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory0 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = null;
        collectionCategory0.setCollection(collection1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = null;
        collectionCategory0.setCollection(collection3);
        de.htw.sdf.photoplatform.persistence.model.Category category5 = collectionCategory0.getCategory();
        java.util.Date date6 = collectionCategory0.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = collectionCategory0.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Category category8 = collectionCategory0.getCategory();
        de.htw.sdf.photoplatform.persistence.model.Category category9 = collectionCategory0.getCategory();
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
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory24 = collection23.getCollectionCategories();
        java.lang.String str25 = collection23.getName();
        collectionCategory0.setCollection(collection23);
        java.lang.String str27 = collection23.getCreatedBy();
        org.junit.Assert.assertNull(category5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertNull(category8);
        org.junit.Assert.assertNull(category9);
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
        org.junit.Assert.assertNull(set_collectionCategory24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test345");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls4 = null;
        collectionCategoryDAOImpl0.setClazz(cls4);
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test346");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.web.servlet.LocaleResolver localeResolver5 = application0.localeResolver();
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor6 = application0.localeChangeInterceptor();
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory7 = application0.servletContainer();
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor8 = application0.localeChangeInterceptor();
        org.springframework.web.servlet.config.annotation.PathMatchConfigurer pathMatchConfigurer9 = null;
        application0.configurePathMatch(pathMatchConfigurer9);
        org.junit.Assert.assertNotNull(localeResolver5);
        org.junit.Assert.assertNotNull(localeChangeInterceptor6);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory7);
        org.junit.Assert.assertNotNull(localeChangeInterceptor8);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test347");
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
        java.lang.String str27 = collection0.getName();
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData29 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection0, false);
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
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test348");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData2 = user0.getPhotographerData();
        java.lang.String str3 = user0.getUsername();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(photographerData2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test349");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard4 = user0.getAuthorities();
        boolean b5 = user0.isAdmin();
        java.lang.String str6 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(collection_wildcard4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null:1528137309578:d36e945f75d5f51e8b82ef4fcf9ad27b" + "'", str6.equals("null:1528137309578:d36e945f75d5f51e8b82ef4fcf9ad27b"));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test350");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        image0.setCreatedBy("ROLE_ADMIN");
        java.lang.String str7 = image0.toString();
        java.lang.String str8 = image0.getDescription();
        image0.setEnabled(false);
        java.lang.String str11 = image0.getMime();
        image0.setSmallThumbPath("/collections/{collectionId}/images/{imageId}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str7.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test351");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setName("/photographer/upload");
        java.lang.String str3 = image0.toString();
        image0.setSmallThumbPath("ROLE_ADMIN");
        java.lang.String str6 = image0.getSmallThumbPath();
        java.lang.Double d7 = image0.getPrice();
        image0.setMime("/users/profile/{userId}");
        image0.setCreationDate();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ROLE_ADMIN" + "'", str6.equals("ROLE_ADMIN"));
        org.junit.Assert.assertNull(d7);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test352");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setName("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str6 = image0.getPath();
        java.lang.Double d7 = image0.getPrice();
        image0.setPrice((java.lang.Double) 0.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(d7);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test353");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getMetadata();
        java.lang.String str7 = imageData2.getMetadata();
        imageData2.setMessageSuccess("/photographer/upload");
        imageData2.setMessageSuccess("/photographer/images");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test354");
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
        java.lang.String str23 = userData15.getPaypalID();
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
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test355");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getCompany();
        userData0.setIban("/photographer/upload");
        java.lang.String str5 = userData0.getPaypalID();
        java.util.List<java.lang.String> list_str6 = userData0.getRoles();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(list_str6);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test356");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collection0.getUser();
        java.lang.String str2 = collection0.getName();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory3 = collection0.getCollectionCategories();
        boolean b4 = collection0.isPublic();
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collection0.getThumbnail();
        collection0.setDescription("/photographer/upload");
        org.junit.Assert.assertNull(user1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(set_collectionCategory3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(image5);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test357");
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
        java.lang.Boolean b11 = collectionData0.getPublic();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b11);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test358");
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
            javax.persistence.Query query11 = userImageDAOImpl0.createQuery("ROLE_ADMIN");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager9);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test359");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        de.htw.sdf.photoplatform.persistence.model.Role role7 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role7.setName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        java.lang.String str10 = role7.getName();
        role7.setName("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        try {
            roleDAOImpl0.delete(role7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception" + "'", str10.equals("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception"));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test360");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setCreationDate();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole3 = user0.getUserRoles();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole4 = user0.getUserRoles();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(list_userRole3);
        org.junit.Assert.assertNull(list_userRole4);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test361");
        org.springframework.security.core.userdetails.UserDetailsService userDetailsService0 = null;
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer(userDetailsService0);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity2 = null;
        xAuthTokenConfigurer1.setBuilder(httpSecurity2);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity4 = null;
        xAuthTokenConfigurer1.setBuilder(httpSecurity4);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity6 = null;
        xAuthTokenConfigurer1.setBuilder(httpSecurity6);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity8 = null;
        xAuthTokenConfigurer1.setBuilder(httpSecurity8);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity10 = null;
        xAuthTokenConfigurer1.init(httpSecurity10);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test362");
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
        try {
            de.htw.sdf.photoplatform.persistence.model.User user31 = authenticationController0.userByName("null:1528137263387:737fa038c16b05aadddbb7d717b9f93f");
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
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test363");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls5 = null;
        roleDAOImpl0.setClazz(cls5);
        javax.persistence.EntityManager entityManager7 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager8 = roleDAOImpl0.getEntityManager();
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager7);
        org.junit.Assert.assertNull(entityManager8);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test364");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        imageData1.setMessageFailed("/user/register");
        imageData1.setCode((java.lang.Long) 100L);
        java.lang.Double d6 = imageData1.getPrice();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(d6);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test365");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData1 = collectionData0.getUserdata();
        java.util.List<java.lang.Long> list_long2 = collectionData0.getImageIds();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str4 = image3.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image3);
        imageData5.setMetadata("/photographer/upload");
        imageData5.setMessageFailed("/showcase");
        imageData5.setId((java.lang.Long) (-1L));
        collectionData0.setThumbnail(imageData5);
        java.lang.Double d13 = imageData5.getPrice();
        org.junit.Assert.assertNull(userData1);
        org.junit.Assert.assertNull(list_long2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(d13);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test366");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setCreatedBy("/collections/addimage");
        image0.setDescription("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        image0.setEnabled(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test367");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setId((java.lang.Long) 0L);
        java.lang.String str3 = userData0.getSecToken();
        userData0.setId((java.lang.Long) 100L);
        java.lang.String str6 = userData0.getPaypalID();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test368");
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
        de.htw.sdf.photoplatform.persistence.model.User user12 = userImage9.getUser();
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test369");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getMetadata();
        java.lang.String str7 = imageData2.getMobilePath();
        imageData2.setMessageFailed("/api");
        java.lang.String str10 = imageData2.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/users/update" + "'", str7.equals("/users/update"));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test370");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls5 = null;
        collectionDAOImpl0.setClazz(cls5);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection11 = collectionDAOImpl0.findCollectionsByUser((long) (short) 1, (-1), 0, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test371");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity4 = null;
        xAuthTokenConfigurer3.init(httpSecurity4);
        try {
            org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity6 = xAuthTokenConfigurer3.and();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test372");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        try {
            imageDAOImpl0.deleteById((long) 10002);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test373");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getMessageSuccess();
        imageData2.setMobilePath("/users/update");
        java.lang.String str6 = imageData2.getSmallPath();
        java.lang.String str7 = imageData2.getName();
        imageData2.setSmallPath("/user/login");
        java.lang.Long long10 = imageData2.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long10);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test374");
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister0 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister0.setLastName("/collections/addimage");
        userRegister0.setLastName("/user/becomePhotographer");
        java.lang.String str5 = userRegister0.getEmail();
        userRegister0.setPasswordConfirm("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001");
        java.lang.String str8 = userRegister0.getFirstName();
        java.lang.String str9 = userRegister0.getPasswordConfirm();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001" + "'", str9.equals("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001"));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test375");
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
        boolean b17 = user16.isBecomePhotographer();
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
        org.junit.Assert.assertTrue(b17 == false);
    }
}

