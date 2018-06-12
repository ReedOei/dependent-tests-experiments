import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String str0 = de.htw.sdf.photoplatform.persistence.model.Role.ADMIN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ROLE_ADMIN" + "'", str0.equals("ROLE_ADMIN"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image2.setCreatedBy("");
        image2.setPrice((java.lang.Double) 1.0d);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage7 = photographerManagerImpl0.createPhotographImage(user1, image2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.SHOWCASE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/showcase" + "'", str0.equals("/showcase"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int i0 = de.htw.sdf.photoplatform.exception.common.AbstractBaseException.USER_EMAIL_EXISTS;
        org.junit.Assert.assertTrue(i0 == 11002);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.USER_MAKE_ADMIN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/user/makeadmin/{id}" + "'", str0.equals("/user/makeadmin/{id}"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int i0 = de.htw.sdf.photoplatform.exception.common.AbstractBaseException.PARAM_IS_NOT_VALID;
        org.junit.Assert.assertTrue(i0 == 11004);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException1 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException(0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData1 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image2);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage4 = photographerManagerImpl0.createPhotographImage(user1, image2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(imageData3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.springframework.security.core.userdetails.UserDetails userDetails1 = null;
        try {
            boolean b2 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("ROLE_ADMIN", userDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        de.htw.sdf.photoplatform.persistence.model.User user0 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData1 = new de.htw.sdf.photoplatform.webservice.dto.UserData(user0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = null;
        try {
            categoryDAOImpl0.delete(category1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.USER_ENABLE_PHOTOGRAPHER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/user/enablephotographer" + "'", str0.equals("/user/enablephotographer"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        de.htw.sdf.photoplatform.manager.common.DAOReferenceCollector dAOReferenceCollector0 = new de.htw.sdf.photoplatform.manager.common.DAOReferenceCollector();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.USERS_UPDATE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/users/update" + "'", str0.equals("/users/update"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String[] str_array0 = de.htw.sdf.photoplatform.webservice.Endpoints.securedPhotographEndpoints();
        org.junit.Assert.assertNotNull(str_array0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData2 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.COLLECTIONS_ADD_IMAGE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/collections/addimage" + "'", str0.equals("/collections/addimage"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.springframework.security.core.userdetails.UserDetails userDetails1 = null;
        try {
            boolean b2 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("/users/update", userDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.PHOTOGRAPHER_UPLOAD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/photographer/upload" + "'", str0.equals("/photographer/upload"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String[] str_array0 = de.htw.sdf.photoplatform.webservice.Endpoints.securedAdminEndpoints();
        org.junit.Assert.assertNotNull(str_array0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.COLLECTIONS_ID_IMAGES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/collections/{collectionId}/images" + "'", str0.equals("/collections/{collectionId}/images"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.springframework.security.core.userdetails.UserDetails userDetails0 = null;
        try {
            java.lang.String str1 = de.htw.sdf.photoplatform.security.TokenUtils.createToken(userDetails0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = null;
        try {
            categoryDAOImpl0.create(category1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory1 = null;
        try {
            collectionCategoryDAOImpl0.delete(collectionCategory1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.springframework.security.core.userdetails.UserDetails userDetails1 = null;
        try {
            boolean b2 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("/photographer/upload", userDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        image0.setPath("/user/makeadmin/{id}");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData1 = null;
        org.springframework.validation.BindingResult bindingResult2 = null;
        try {
            userController0.updateUser(userData1, bindingResult2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory1 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory2 = collectionCategoryDAOImpl0.update(collectionCategory1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.springframework.security.core.userdetails.UserDetailsService userDetailsService0 = null;
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer(userDetailsService0);
        try {
            org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity2 = xAuthTokenConfigurer1.and();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.String[] str_array0 = de.htw.sdf.photoplatform.webservice.Endpoints.securedUserEndpoints();
        org.junit.Assert.assertNotNull(str_array0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String str0 = de.htw.sdf.photoplatform.persistence.model.Role.CUSTOMER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ROLE_CUSTOMER" + "'", str0.equals("ROLE_CUSTOMER"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.lockUser("/collections/{collectionId}/images");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.makeAdmin("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.USERS_START_COUNT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/users/admin/{start}/{count}" + "'", str0.equals("/users/admin/{start}/{count}"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage1 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage2 = userImageDAOImpl0.update(userImage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str3 = image2.getMime();
        image2.setMobileThumbPath("");
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image6.setCreatedBy("");
        image6.setPrice((java.lang.Double) 1.0d);
        de.htw.sdf.photoplatform.persistence.model.Image image11 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData12 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image11);
        java.lang.String str13 = image11.getCreatedBy();
        de.htw.sdf.photoplatform.persistence.model.Image image14 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image14.setCreatedBy("");
        image14.setPrice((java.lang.Double) 1.0d);
        java.lang.String str19 = image14.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData20 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image14);
        de.htw.sdf.photoplatform.persistence.model.Image image21 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str22 = image21.toString();
        java.lang.String str23 = image21.getName();
        de.htw.sdf.photoplatform.persistence.model.Image image24 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData25 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image24);
        java.lang.String str26 = image24.getCreatedBy();
        de.htw.sdf.photoplatform.persistence.model.Image image27 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData28 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image27);
        de.htw.sdf.photoplatform.persistence.model.Image[] image_array29 = new de.htw.sdf.photoplatform.persistence.model.Image[] { image2, image6, image11, image14, image21, image24, image27 };
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Image> arraylist_image30 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Image>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Image>) arraylist_image30, image_array29);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage32 = photographerManagerImpl0.createPhotographImage(user1, (java.util.List<de.htw.sdf.photoplatform.persistence.model.Image>) arraylist_image30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(imageData12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str22.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(imageData25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(imageData28);
        org.junit.Assert.assertNotNull(image_array29);
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int i0 = de.htw.sdf.photoplatform.exception.common.AbstractBaseException.NOT_FOUND;
        org.junit.Assert.assertTrue(i0 == 10001);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.COLLECTIONS_CREATE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/collections/create" + "'", str0.equals("/collections/create"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("/users/update", errors1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.USERS_BECOME_PHOTOGRAPHERS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/users/becomephotographers" + "'", str0.equals("/users/becomephotographers"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.unlockUser("/users/becomephotographers");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = null;
        try {
            java.lang.Boolean b2 = userManagerImpl0.isUserAdmin(user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.USER_BECOME_PHOTOGRAPHER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/user/becomePhotographer" + "'", str0.equals("/user/becomePhotographer"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category3 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category4 = categoryDAOImpl0.update(category3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        de.htw.sdf.photoplatform.webservice.dto.ResponseMessageData responseMessageData0 = new de.htw.sdf.photoplatform.webservice.dto.ResponseMessageData();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.COLLECTIONS_PHOTOGRAPHERS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/collections/photographers" + "'", str0.equals("/collections/photographers"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister1 = null;
        org.springframework.validation.BindingResult bindingResult2 = null;
        try {
            authenticationController0.register(userRegister1, bindingResult2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = null;
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory2 = collectionCategoryDAOImpl0.getCollectionCategoryBy(category1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image3 = imageDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str0 = de.htw.sdf.photoplatform.persistence.model.Role.PHOTOGRAPHER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ROLE_PHOTOGRAPHER" + "'", str0.equals("ROLE_PHOTOGRAPHER"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange7 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        org.springframework.validation.BindingResult bindingResult8 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData9 = userController0.changePassword(userPasswordChange7, bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int i0 = de.htw.sdf.photoplatform.exception.common.AbstractBaseException.BAD_REQUEST;
        org.junit.Assert.assertTrue(i0 == 10000);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.USER_LOGIN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/user/login" + "'", str0.equals("/user/login"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData1 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        org.springframework.validation.BindingResult bindingResult2 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = photographerController0.updateCollection(collectionData1, bindingResult2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.API_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/api" + "'", str0.equals("/api"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user2 = null;
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage5 = userImageDAOImpl0.getPhotographImages(user2, (int) (short) 10, 11004);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.springframework.security.core.userdetails.UserDetails userDetails1 = null;
        try {
            boolean b2 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("/api", userDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        try {
            collectionImageDAOImpl0.create(collectionImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        image0.setSmallThumbPath("ROLE_PHOTOGRAPHER");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = collectionImageDAOImpl0.findOne((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = userController0.getUserProfileData("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.unlockUser("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = imageData1.getName();
        java.lang.String str3 = imageData1.getMessageSuccess();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.springframework.security.core.userdetails.UserDetails userDetails0 = null;
        try {
            java.lang.String str2 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature(userDetails0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        try {
            imageDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = null;
        try {
            userManagerImpl0.delete(user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData1 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = collectionData1.getThumbnail();
        org.springframework.validation.BindingResult bindingResult3 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData4 = photographerController0.updateCollection(collectionData1, bindingResult3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(imageData2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError((int) (short) 0, (int) (short) 10, "/users/becomephotographers", errors3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.springframework.context.ConfigurableApplicationContext configurableApplicationContext0 = de.htw.sdf.photoplatform.Application.getContext();
        org.junit.Assert.assertNull(configurableApplicationContext0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.toString();
        java.lang.String str2 = image0.getName();
        image0.setDescription("/photographer/upload");
        java.lang.String str5 = image0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str5.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionImage> list_collectionImage3 = collectionImageDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        try {
            java.lang.String str2 = photographerController0.updateCollectionShowcase("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.BindingResult bindingResult2 = null;
        try {
            java.lang.String str3 = photographerController0.addImageToCollection("ROLE_ADMIN", bindingResult2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = null;
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage4 = imageManagerImpl0.getPhotographImages(user1, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.USER_BY_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/user/{name}" + "'", str0.equals("/user/{name}"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage0 = null;
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(list_userImage0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryDAOImpl0.update(category1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setMetaData("");
        de.htw.sdf.photoplatform.persistence.model.User user4 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage5 = imageManagerImpl0.addOwnerToImage(image1, user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.USER_UNLOCK;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/user/unlock/{id}" + "'", str0.equals("/user/unlock/{id}"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        try {
            java.lang.String str2 = photographerController0.updateCollectionShowcase("/user/becomePhotographer");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = null;
        try {
            categoryManagerImpl0.delete(category1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage1 = null;
        try {
            userImageDAOImpl0.delete(userImage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        int i0 = de.htw.sdf.photoplatform.exception.common.AbstractBaseException.COLLECTION_ID_NOT_VALID;
        org.junit.Assert.assertTrue(i0 == 11003);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category3 = null;
        try {
            categoryDAOImpl0.delete(category3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.COLLECTIONS_PHOTOGRAPHERS_START_COUNT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/collections/photographers/{start}/{count}" + "'", str0.equals("/collections/photographers/{start}/{count}"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData1 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData2 = collectionData1.getImages();
        org.springframework.validation.BindingResult bindingResult3 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData4 = photographerController0.updateCollection(collectionData1, bindingResult3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_imageData2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = null;
        try {
            photographerManagerImpl0.delete(collection1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData2 = collectionData0.getImages();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(list_imageData2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            boolean b8 = userController0.enablePhotographer("/collections/addimage");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image4 = imageDAOImpl0.findOne((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.springframework.security.core.userdetails.UserDetailsService userDetailsService0 = null;
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer(userDetailsService0);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity2 = null;
        try {
            xAuthTokenConfigurer1.configure(httpSecurity2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Long long0 = de.htw.sdf.photoplatform.persistence.model.Role.ADMIN_ID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0.equals(1L));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.springframework.security.core.userdetails.UserDetails userDetails1 = null;
        try {
            boolean b2 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("/collections/addimage", userDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.String str0 = de.htw.sdf.photoplatform.persistence.model.Role.BECOME_PHOTOGRAPHER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ROLE_BECOME_PHOTOGRAPHER" + "'", str0.equals("ROLE_BECOME_PHOTOGRAPHER"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        de.htw.sdf.photoplatform.exception.common.InputError inputError2 = new de.htw.sdf.photoplatform.exception.common.InputError("hi!", "hi!");
        java.lang.String str3 = inputError2.getFieldName();
        java.lang.String str4 = inputError2.getFieldName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.USER_REGISTER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/user/register" + "'", str0.equals("/user/register"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.PHOTOGRAPHERS_IMAGES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/photographer/images" + "'", str0.equals("/photographer/images"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image4.setCreatedBy("");
        collectionImage3.setImage(image4);
        de.htw.sdf.photoplatform.persistence.model.Collection collection8 = collectionImage3.getCollection();
        try {
            collectionImageDAOImpl0.create(collectionImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory2 = null;
        try {
            collectionCategoryDAOImpl0.delete(collectionCategory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage6 = collectionImageDAOImpl0.findOne((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = null;
        try {
            java.lang.Boolean b3 = userManagerImpl0.isRoleIncluded(user1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        int i0 = de.htw.sdf.photoplatform.exception.common.AbstractBaseException.AUTHORIZATION_NOT_VALID;
        org.junit.Assert.assertTrue(i0 == 10002);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
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
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData12 = photographerController0.getShowcase((int) 'a', 10000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = null;
        try {
            java.lang.Boolean b3 = userManagerImpl0.isRoleIncluded(user1, "/showcase");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer3 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        try {
            boolean b4 = requestLoggerInterceptor0.preHandle(httpServletRequest1, httpServletResponse2, (java.lang.Object) becomePhotographer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole3 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role4 = userRole3.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role5 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole3.setRole(role5);
        try {
            userRoleDAOImpl0.delete(userRole3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(role4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("/user/register", errors1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image1);
        java.lang.String str4 = imageData3.getPath();
        java.lang.String str5 = imageData3.getMessageSuccess();
        org.springframework.validation.BindingResult bindingResult6 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData7 = photographerController0.updateImage(imageData3, bindingResult6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole2 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole3 = userRoleDAOImpl0.update(userRole2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection2 = photographerManagerImpl0.update(collection1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.toString();
        java.lang.String str2 = image0.toString();
        image0.setThumbPath("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str1.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str2.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage0 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(userImage0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.controller.UserController userController1 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException4 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors3);
        int i5 = notFoundException4.getCode();
        org.springframework.web.context.request.WebRequest webRequest6 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError7 = userController1.handleNotFoundException(notFoundException4, webRequest6);
        org.springframework.web.context.request.WebRequest webRequest8 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError9 = photographerController0.handleNotFoundException(notFoundException4, webRequest8);
        de.htw.sdf.photoplatform.persistence.model.Image image10 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData11 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image10);
        org.springframework.validation.BindingResult bindingResult12 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData13 = photographerController0.updateImage(imageData11, bindingResult12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertNotNull(imageData11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole3 = userRoleDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
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
            java.lang.String str12 = photographerController0.deleteImageFromCollection((java.lang.Long) 100L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData1 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData2 = collectionData1.getImages();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData3 = collectionData1.getImages();
        org.springframework.validation.BindingResult bindingResult4 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData5 = photographerController0.updateCollection(collectionData1, bindingResult4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_imageData2);
        org.junit.Assert.assertNull(list_imageData3);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = null;
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage2 = userImageDAOImpl0.getUserImagesBy(user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.springframework.security.core.userdetails.UserDetails userDetails1 = null;
        try {
            boolean b2 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("/collections/{collectionId}/images", userDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData1 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData2 = collectionData1.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData3 = null;
        collectionData1.setUserdata(userData3);
        java.lang.String str5 = collectionData1.getName();
        long long6 = collectionData1.getId();
        collectionData1.setId(1L);
        org.springframework.validation.BindingResult bindingResult9 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection10 = photographerController0.createCollection(collectionData1, bindingResult9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_imageData2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(long6 == 0L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException1 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException((int) (byte) 100);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = null;
        try {
            java.lang.Boolean b2 = userManagerImpl0.isUserPhotographer(user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData(collection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str5 = image4.getMime();
        java.lang.String str6 = image4.getMobileThumbPath();
        image4.setMetaData("/user/makeadmin/{id}");
        java.lang.String str9 = image4.getCreatedBy();
        try {
            imageDAOImpl0.create(image4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        try {
            boolean b3 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("/user/{name}", (org.springframework.security.core.userdetails.UserDetails) user1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        try {
            userRoleDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange1 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange1.setNewPassword("/showcase");
        java.lang.String str4 = userPasswordChange1.getPasswordConfirm();
        org.springframework.validation.BindingResult bindingResult5 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData6 = userController0.changePassword(userPasswordChange1, bindingResult5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
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
        de.htw.sdf.photoplatform.persistence.model.UserImage[] userImage_array12 = new de.htw.sdf.photoplatform.persistence.model.UserImage[] { userImage9 };
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserImage> arraylist_userImage13 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserImage>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage13, userImage_array12);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData15 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage>) arraylist_userImage13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(userImage_array12);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls2 = null;
        categoryDAOImpl0.setClazz(cls2);
        try {
            categoryDAOImpl0.deleteById((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image4.setCreatedBy("");
        collectionImage3.setImage(image4);
        de.htw.sdf.photoplatform.persistence.model.Collection collection8 = collectionImage3.getCollection();
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage9 = collectionImageDAOImpl0.update(collectionImage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.UserData> list_userData7 = userController0.getBecomePhotographers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        java.util.List<java.lang.Long> list_long2 = collectionData0.getImageIds();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(list_long2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getSmallPath();
        imageData2.setMetadata("/collections/addimage");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError(10001, (int) (short) 10, "Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}", errors3);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.String str0 = de.htw.sdf.photoplatform.security.TokenUtils.MAGIC_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "obfuscate" + "'", str0.equals("obfuscate"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        java.lang.String str3 = becomePhotographer0.getSwift();
        java.lang.String str4 = becomePhotographer0.getPaypalID();
        becomePhotographer0.setCompany("ROLE_BECOME_PHOTOGRAPHER");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.USERS_PROFILE_BY_USER_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/users/profile/{userId}" + "'", str0.equals("/users/profile/{userId}"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setCompany("/showcase");
        java.lang.String str5 = becomePhotographer0.getIban();
        becomePhotographer0.setPhone("/users/admin/{start}/{count}");
        java.lang.String str8 = becomePhotographer0.getCompany();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/showcase" + "'", str8.equals("/showcase"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
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
            java.lang.String str21 = photographerController0.deleteImageFromCollection((java.lang.Long) 0L, (java.lang.Long) 0L);
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
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = null;
        try {
            categoryManagerImpl0.create(category1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryManagerImpl0.update(category1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
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
        try {
            userImageDAOImpl0.create(userImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.COLLECTIONS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/collections/{collectionId}" + "'", str0.equals("/collections/{collectionId}"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setHomepage("de.htw.sdf.photoplatform.exception.NotFoundException: ");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        try {
            java.lang.String str2 = photographerController0.updateCollectionShowcase("/collections/addimage");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData8 = photographerController0.getPhotographersImages((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
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
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage19 = userImageDAOImpl0.getUserImagesBy(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = null;
        try {
            collectionDAOImpl0.create(collection1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
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
        collectionData6.setId((long) (short) -1);
        org.springframework.validation.BindingResult bindingResult16 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection17 = photographerController0.createCollection(collectionData6, bindingResult16);
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
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("/user/login", errors1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData8 = photographerController0.getShowcase((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array3 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver4 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver4, handlerMethodArgumentResolver_array3);
        application0.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver4);
        org.springframework.validation.MessageCodesResolver messageCodesResolver7 = application0.getMessageCodesResolver();
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry8 = null;
        try {
            application0.addInterceptors(interceptorRegistry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(messageCodesResolver7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory4 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Category category5 = null;
        collectionCategory4.setCategory(category5);
        try {
            collectionCategoryDAOImpl0.create(collectionCategory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.dto.UserCredential userCredential1 = null;
        org.springframework.validation.BindingResult bindingResult2 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData3 = authenticationController0.login(userCredential1, bindingResult2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.util.Date date2 = image0.getUpdatedAt();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str5 = image4.toString();
        image4.setThumbPath("/user/makeadmin/{id}");
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image8 = imageDAOImpl0.update(image4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str5.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.webservice.controller.UserController userController1 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException4 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors3);
        int i5 = notFoundException4.getCode();
        org.springframework.web.context.request.WebRequest webRequest6 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError7 = userController1.handleNotFoundException(notFoundException4, webRequest6);
        org.springframework.web.context.request.WebRequest webRequest8 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError9 = photographerController0.handleNotFoundException(notFoundException4, webRequest8);
        java.lang.RuntimeException runtimeException10 = null;
        try {
            photographerController0.handleBaseException(runtimeException10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole4 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isPhotographer();
        userRole4.setUser(user5);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole8 = userRoleDAOImpl0.update(userRole4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        org.springframework.validation.Errors errors5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors5);
        int i7 = notFoundException6.getCode();
        notFoundException3.addSuppressed((java.lang.Throwable) notFoundException6);
        org.springframework.web.context.request.WebRequest webRequest9 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError10 = imageController0.handleNotFoundException(notFoundException6, webRequest9);
        org.springframework.web.multipart.MultipartFile multipartFile11 = null;
        org.springframework.web.multipart.MultipartFile[] multipartFile_array12 = new org.springframework.web.multipart.MultipartFile[] { multipartFile11 };
        try {
            java.lang.String str13 = imageController0.handleImageUpload(multipartFile_array12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertNotNull(responseError10);
        org.junit.Assert.assertNotNull(multipartFile_array12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        org.springframework.validation.Errors errors5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors5);
        int i7 = notFoundException6.getCode();
        notFoundException3.addSuppressed((java.lang.Throwable) notFoundException6);
        org.springframework.web.context.request.WebRequest webRequest9 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError10 = imageController0.handleNotFoundException(notFoundException6, webRequest9);
        try {
            imageController0.initIt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertNotNull(responseError10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        de.htw.sdf.photoplatform.exception.common.ManagerException managerException1 = new de.htw.sdf.photoplatform.exception.common.ManagerException(10001);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole3 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user4 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b5 = user4.isPhotographer();
        userRole3.setUser(user4);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole7 = userRoleDAOImpl0.update(userRole3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer7 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer7.setPhone("ROLE_ADMIN");
        org.springframework.validation.BindingResult bindingResult10 = null;
        try {
            boolean b11 = userController0.becomePhotographer(becomePhotographer7, bindingResult10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls2 = null;
        categoryDAOImpl0.setClazz(cls2);
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category5 = categoryDAOImpl0.findByName("/collections/create");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory4 = collectionCategoryDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        try {
            boolean b3 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("/user/unlock/{id}", (org.springframework.security.core.userdetails.UserDetails) user1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData21 = collectionData19.getThumbnail();
        java.lang.Long[] long_array23 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long24 = new java.util.ArrayList<java.lang.Long>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long24, long_array23);
        collectionData19.setImageIds((java.util.List<java.lang.Long>) arraylist_long24);
        collectionData19.setId((long) (short) -1);
        org.springframework.validation.BindingResult bindingResult29 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData30 = photographerController0.updateCollection(collectionData19, bindingResult29);
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
        org.junit.Assert.assertNull(imageData21);
        org.junit.Assert.assertNotNull(long_array23);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image4 = imageDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
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
            java.lang.String str11 = photographerController0.updateCollectionShowcase("/showcase");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
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
        try {
            userImageDAOImpl0.delete(userImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.USERS_CHANGE_PASSWORD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/users/changepassword" + "'", str0.equals("/users/changepassword"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
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
        de.htw.sdf.photoplatform.persistence.model.Image image17 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image17.setCreatedBy("");
        image17.setPrice((java.lang.Double) 1.0d);
        java.lang.String str22 = image17.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData23 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image17);
        userImage13.setImage(image17);
        java.lang.String str25 = image17.getUpdatedBy();
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image26 = imageDAOImpl0.update(image17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = null;
        collectionData0.setUserdata(userData2);
        java.lang.String str4 = collectionData0.getName();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user6 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b7 = user6.isPhotographer();
        userRole5.setUser(user6);
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection9 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollection(collectionData0, user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = userController0.getUserProfileData("ROLE_BECOME_PHOTOGRAPHER");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        de.htw.sdf.photoplatform.common.Messages messages0 = new de.htw.sdf.photoplatform.common.Messages();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userRoleDAOImpl0.getEntityManager();
        try {
            userRoleDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole5 = userRoleDAOImpl0.findByUserAndRoleId((java.lang.Long) 1L, (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setName("");
        java.lang.Double d5 = imageData2.getPrice();
        java.lang.Double d6 = imageData2.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(d5);
        org.junit.Assert.assertNull(d6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.Role role3 = new de.htw.sdf.photoplatform.persistence.model.Role();
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role4 = roleDAOImpl0.update(role3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData7 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData7.setSwift("/photographer/images");
        java.lang.String str10 = userData7.getPaypalID();
        userData7.setHomepage("");
        org.springframework.validation.BindingResult bindingResult13 = null;
        try {
            userController0.updateUser(userData7, bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            boolean b8 = userController0.enablePhotographer("/photographer/images");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData8 = photographerController0.getPhotographersImages((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        image0.setName("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str6 = image0.getThumbPath();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array7 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection8 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection8, collection_array7);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData10 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection8);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData11 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection8);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData12 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection8);
        boolean b13 = image0.equals((java.lang.Object) list_collectionData12);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(collection_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_collectionData10);
        org.junit.Assert.assertNotNull(list_collectionData11);
        org.junit.Assert.assertNotNull(list_collectionData12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls2 = null;
        collectionImageDAOImpl0.setClazz(cls2);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionImage> list_collectionImage4 = collectionImageDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls2 = null;
        collectionImageDAOImpl0.setClazz(cls2);
        try {
            javax.persistence.Query query5 = collectionImageDAOImpl0.createQuery("ROLE_BECOME_PHOTOGRAPHER");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.update(user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
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
        try {
            java.lang.Boolean b19 = userManagerImpl0.isRoleIncluded(user14, "de.htw.sdf.photoplatform.exception.NotFoundException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.lockUser("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getMobileThumbPath();
        image0.setMetaData("/user/makeadmin/{id}");
        java.lang.String str5 = image0.toString();
        java.lang.String str6 = image0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str5.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str6.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        de.htw.sdf.photoplatform.security.UnauthorizedEntryPoint unauthorizedEntryPoint0 = new de.htw.sdf.photoplatform.security.UnauthorizedEntryPoint();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        org.springframework.security.core.AuthenticationException authenticationException3 = null;
        try {
            unauthorizedEntryPoint0.commence(httpServletRequest1, httpServletResponse2, authenticationException3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls2 = null;
        collectionImageDAOImpl0.setClazz(cls2);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage5 = collectionImageDAOImpl0.findOne(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError(11002, (int) (byte) 100, "/showcase", errors3);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData2 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData(collection0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
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
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData21 = photographerController0.getPhotographersImages((int) (byte) -1, 0);
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.springframework.security.core.userdetails.UserDetailsService userDetailsService0 = null;
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer(userDetailsService0);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity2 = null;
        xAuthTokenConfigurer1.setBuilder(httpSecurity2);
        org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity4 = null;
        xAuthTokenConfigurer1.init(httpSecurity4);
        try {
            org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity6 = xAuthTokenConfigurer1.and();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("/user/makeadmin/{id}", errors1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory4 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        try {
            collectionCategoryDAOImpl0.delete(collectionCategory4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls2 = null;
        categoryDAOImpl0.setClazz(cls2);
        try {
            categoryDAOImpl0.deleteById(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        try {
            collectionCategoryDAOImpl0.deleteById((long) 11004);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData0.setRoles(list_str2);
        java.lang.Boolean b4 = userData0.isEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.COLLECTIONS_DELETE_IMAGE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/collections/{collectionId}/images/{imageId}" + "'", str0.equals("/collections/{collectionId}/images/{imageId}"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.PHOTOGRAPHERS_IMAGES_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/photographer/images/{imageId}" + "'", str0.equals("/photographer/images/{imageId}"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls2 = null;
        categoryDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.Category category4 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category5 = categoryDAOImpl0.update(category4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
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
        javax.servlet.MultipartConfigElement multipartConfigElement10 = application0.multipartConfigElement();
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(localeChangeInterceptor9);
        org.junit.Assert.assertNotNull(multipartConfigElement10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange1 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange1.setPassword("");
        org.springframework.validation.BindingResult bindingResult4 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData5 = userController0.changePassword(userPasswordChange1, bindingResult4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
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
            java.lang.String str11 = photographerController0.deletePhotographersImage((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls2 = null;
        categoryDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.Category category4 = new de.htw.sdf.photoplatform.persistence.model.Category();
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category5 = categoryDAOImpl0.update(category4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
        java.lang.Long[] long_array15 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long16, long_array15);
        collectionData10.setImageIds((java.util.List<java.lang.Long>) arraylist_long16);
        collectionData10.setName("/user/login");
        org.springframework.validation.BindingResult bindingResult21 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection22 = photographerController0.createCollection(collectionData10, bindingResult21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertNotNull(long_array15);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData2 = null;
        user1.setPhotographerData(photographerData2);
        try {
            boolean b4 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("", (org.springframework.security.core.userdetails.UserDetails) user1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer1 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer1.setPhone("ROLE_ADMIN");
        becomePhotographer1.setPhone("/user/makeadmin/{id}");
        becomePhotographer1.setSwift("/users/admin/{start}/{count}");
        becomePhotographer1.setIban("/photographer/upload");
        org.springframework.validation.BindingResult bindingResult10 = null;
        try {
            boolean b11 = userController0.becomePhotographer(becomePhotographer1, bindingResult10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
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
            userRoleDAOImpl0.delete(userRole8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(role9);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.util.Date date4 = null;
        image0.setUpdatedAt(date4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<java.lang.Long> list_long3 = null;
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionImage> list_collectionImage4 = photographerManagerImpl0.addImagesToCollection((java.lang.Long) 0L, (java.lang.Long) 0L, list_long3);
            org.junit.Assert.fail("Expected exception of type de.htw.sdf.photoplatform.exception.common.ManagerException");
        } catch (de.htw.sdf.photoplatform.exception.common.ManagerException e) {
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.USER_LOCK;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/user/lock/{id}" + "'", str0.equals("/user/lock/{id}"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Role> list_role3 = roleDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        try {
            java.lang.String str7 = photographerController0.deleteCollection((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image4 = imageDAOImpl0.findOne((long) 10002);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        de.htw.sdf.photoplatform.exception.common.ManagerException managerException1 = new de.htw.sdf.photoplatform.exception.common.ManagerException((int) (byte) -1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
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
        java.util.Date date15 = userImage12.getUpdatedAt();
        try {
            userImageDAOImpl0.create(userImage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setSwift("/photographer/images");
        java.lang.Boolean b3 = userData0.isBanned();
        java.lang.String str4 = userData0.getHomepage();
        org.junit.Assert.assertTrue("'" + b3 + "' != '" + false + "'", b3.equals(false));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.lang.String str1 = de.htw.sdf.photoplatform.security.TokenUtils.getUserNameFromToken("/photographer/upload");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "/photographer/upload" + "'", str1.equals("/photographer/upload"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
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
        try {
            userImageDAOImpl0.delete(userImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
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
        java.lang.String str15 = becomePhotographer7.getPaypalID();
        becomePhotographer7.setSwift("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        org.springframework.validation.BindingResult bindingResult18 = null;
        try {
            boolean b19 = userController0.becomePhotographer(becomePhotographer7, bindingResult18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError((int) (short) -1, 10000, "/users/admin/{start}/{count}", errors3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole4 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = userRoleDAOImpl0.update(userRole4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
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
        try {
            userImageDAOImpl0.delete(userImage13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        try {
            java.lang.String str7 = photographerController0.updateCollectionShowcase("ROLE_ADMIN");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setId((java.lang.Long) 0L);
        java.lang.String str3 = userData0.getSecToken();
        userData0.setId((java.lang.Long) 100L);
        java.util.List<java.lang.String> list_str6 = userData0.getRoles();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(list_str6);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getEmail();
        java.lang.String str4 = userData0.getIban();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            boolean b8 = userController0.enablePhotographer("/user/enablephotographer");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = null;
        try {
            collectionDAOImpl0.delete(collection1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        try {
            imageDAOImpl0.deleteById((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        image0.setMobileThumbPath("");
        image0.setPrice((java.lang.Double) 100.0d);
        boolean b6 = image0.isEnabled();
        image0.setSmallThumbPath("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors1);
        org.springframework.validation.Errors errors3 = badRequestException2.getErrors();
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException5 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException(100);
        java.lang.Throwable[] throwable_array6 = authorizationException5.getSuppressed();
        badRequestException2.addSuppressed((java.lang.Throwable) authorizationException5);
        java.lang.String str8 = authorizationException5.toString();
        org.junit.Assert.assertNull(errors3);
        org.junit.Assert.assertNotNull(throwable_array6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception" + "'", str8.equals("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer3 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setSwift("/photographer/images");
        java.lang.Boolean b3 = userData0.isBanned();
        userData0.setSwift("/user/becomePhotographer");
        org.junit.Assert.assertTrue("'" + b3 + "' != '" + false + "'", b3.equals(false));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
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
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData21 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(userImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        java.lang.RuntimeException runtimeException1 = null;
        try {
            userController0.handleBaseException(runtimeException1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        java.lang.RuntimeException runtimeException1 = null;
        try {
            authenticationController0.handleBaseException(runtimeException1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getMetadata();
        imageData2.setSmallPath("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        de.htw.sdf.photoplatform.security.TokenUtils tokenUtils0 = new de.htw.sdf.photoplatform.security.TokenUtils();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            boolean b2 = userController0.enablePhotographer("/user/lock/{id}");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException1 = new de.htw.sdf.photoplatform.exception.NotFoundException("/users/changepassword");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection2 = collectionDAOImpl0.update(collection1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.method.support.HandlerMethodReturnValueHandler[] handlerMethodReturnValueHandler_array3 = new org.springframework.web.method.support.HandlerMethodReturnValueHandler[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler> arraylist_handlerMethodReturnValueHandler4 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodReturnValueHandler>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler4, handlerMethodReturnValueHandler_array3);
        application0.addReturnValueHandlers((java.util.List<org.springframework.web.method.support.HandlerMethodReturnValueHandler>) arraylist_handlerMethodReturnValueHandler4);
        org.springframework.format.FormatterRegistry formatterRegistry7 = null;
        application0.addFormatters(formatterRegistry7);
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry9 = null;
        try {
            application0.addInterceptors(interceptorRegistry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(handlerMethodReturnValueHandler_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
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
        try {
            java.lang.Boolean b20 = userManagerImpl0.isRoleIncluded(user14, "/user/enablephotographer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData8 = photographerController0.getShowcase(10001, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData8.setPrice((java.lang.Double) (-1.0d));
        imageData8.setId((java.lang.Long) 10L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        try {
            javax.persistence.Query query4 = imageDAOImpl0.createQuery("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setCreationDate();
        user0.setFirstName("/users/profile/{userId}");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        de.htw.sdf.photoplatform.exception.common.WebFormException webFormException1 = new de.htw.sdf.photoplatform.exception.common.WebFormException((int) ' ');
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
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
        try {
            roleDAOImpl0.delete(role13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(role4);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(role13);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection7 = collectionDAOImpl0.findCollectionsByUser((long) (short) 10, (int) (byte) 0, 0, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = null;
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str3 = image2.getMime();
        java.lang.String str4 = image2.getMobileThumbPath();
        image2.setPublic(true);
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage7 = photographerManagerImpl0.createPhotographImage(user1, image2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        try {
            collectionCategoryDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getIban();
        becomePhotographer0.setSwift("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str10 = becomePhotographer0.getCompany();
        java.lang.String str11 = becomePhotographer0.getIban();
        java.lang.String str12 = becomePhotographer0.getSwift();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str12.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        requestLoggerInterceptor0.afterConcurrentHandlingStarted(httpServletRequest7, httpServletResponse8, (java.lang.Object) "/user/unlock/{id}");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> cls2 = null;
        collectionCategoryDAOImpl0.setClazz(cls2);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory5 = collectionCategoryDAOImpl0.findOne((long) 10000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        imageData2.setMobilePath("/user/makeadmin/{id}");
        imageData2.setMobilePath("de.htw.sdf.photoplatform.exception.NotFoundException: ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.lockUser("/showcase");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException5 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor0.afterCompletion(httpServletRequest1, httpServletResponse2, (java.lang.Object) 10, (java.lang.Exception) notFoundException5);
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole9 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user10 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b11 = user10.isPhotographer();
        userRole9.setUser(user10);
        user10.setUsername("/api");
        boolean b15 = user10.isAccountNonLocked();
        try {
            boolean b16 = requestLoggerInterceptor0.preHandle(httpServletRequest7, httpServletResponse8, (java.lang.Object) user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isAdmin();
        java.lang.String str7 = user5.getSecToken();
        boolean b8 = user5.isAccountNonLocked();
        boolean b9 = user5.isPhotographer();
        try {
            userDAOImpl0.delete(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setName("");
        java.lang.Double d5 = imageData2.getPrice();
        java.lang.String str6 = imageData2.getMessageFailed();
        java.lang.String str7 = imageData2.getMessageFailed();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(d5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.unlockUser("ROLE_PHOTOGRAPHER");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setCreationDate();
        try {
            boolean b4 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("/user/makeadmin/{id}", (org.springframework.security.core.userdetails.UserDetails) user1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.makeAdmin("null:1528137248666:32ad08d7594d28504f1460b47d9ec391");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData0 = new de.htw.sdf.photoplatform.webservice.dto.ImageData();
        imageData0.setCode((java.lang.Long) 1L);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user6 = userDAOImpl0.findByEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        try {
            collectionDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        java.lang.String str5 = image0.toString();
        image0.setName("");
        image0.setDescription("/collections/{collectionId}/images");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str5.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls2 = null;
        categoryDAOImpl0.setClazz(cls2);
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category5 = categoryDAOImpl0.findByName("Image{name='/photographer/upload', path='null', isPublic=false, enabled=false, price=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user5 = userDAOImpl0.findByEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
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
            de.htw.sdf.photoplatform.persistence.model.User user19 = photographerController0.getAuthenticatedUser();
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
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        java.lang.String str6 = image5.getThumbPath();
        org.junit.Assert.assertNotNull(image5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
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
            java.lang.String str21 = photographerController0.addImageToCollection("/photographer/images/{imageId}", bindingResult20);
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
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        java.lang.String str3 = becomePhotographer0.getSwift();
        java.lang.String str4 = becomePhotographer0.getCompany();
        becomePhotographer0.setSwift("/collections/create");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.makeAdmin("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.unlockUser("/user/login");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        try {
            userDAOImpl0.deleteById((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str4 = image3.toString();
        java.lang.String str5 = image3.getName();
        image3.setDescription("/photographer/upload");
        try {
            imageDAOImpl0.create(image3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str4.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData1 = collectionData0.getUserdata();
        long long2 = collectionData0.getId();
        java.lang.Long[] long_array8 = new java.lang.Long[] { 10L, 1L, 100L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long9 = new java.util.ArrayList<java.lang.Long>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long9, long_array8);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long9);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData12 = collectionData0.getUserdata();
        org.junit.Assert.assertNull(userData1);
        org.junit.Assert.assertTrue(long2 == 0L);
        org.junit.Assert.assertNotNull(long_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(userData12);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user5 = userDAOImpl0.findByRoleId((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
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
            java.lang.String str20 = photographerController0.updateCollectionShowcase("/collections/{collectionId}/images");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i14 == 10001);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
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
        java.lang.String str15 = becomePhotographer7.getPaypalID();
        java.lang.String str16 = becomePhotographer7.getPaypalID();
        org.springframework.validation.BindingResult bindingResult17 = null;
        try {
            boolean b18 = userController0.becomePhotographer(becomePhotographer7, bindingResult17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.Long long5 = imageData2.getCode();
        imageData2.setName("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = imageData2.getUserData();
        imageData2.setName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(userData8);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        imageData2.setMobilePath("/user/makeadmin/{id}");
        java.lang.String str7 = imageData2.getMetadata();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/photographer/upload" + "'", str7.equals("/photographer/upload"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        de.htw.sdf.photoplatform.webservice.BaseAPIController baseAPIController0 = new de.htw.sdf.photoplatform.webservice.BaseAPIController();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls1 = null;
        categoryDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category4 = categoryDAOImpl0.findByName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
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
        collectionData10.setId(1L);
        org.springframework.validation.BindingResult bindingResult18 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData19 = photographerController0.updateCollection(collectionData10, bindingResult18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertNull(list_imageData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(long15 == 0L);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
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
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData21 = photographerController0.getCollections((int) '4', (int) '#');
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
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        imageData2.setMobilePath("/user/makeadmin/{id}");
        imageData2.setPrice((java.lang.Double) 100.0d);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        java.lang.String str5 = userData0.getHomepage();
        java.lang.Long long6 = userData0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(long6);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
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
        java.lang.Long long15 = imageData8.getId();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(long11);
        org.junit.Assert.assertNull(long15);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole5 = userRoleDAOImpl0.findByUserAndRoleId((java.lang.Long) 0L, (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSecToken();
        java.lang.String str4 = userData0.getLastName();
        java.lang.Long long5 = userData0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer1 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer1);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array3 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver4 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver4, handlerExceptionResolver_array3);
        application0.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver4);
        de.htw.sdf.photoplatform.Application application7 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer8 = null;
        application7.configureAsyncSupport(asyncSupportConfigurer8);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer10 = null;
        application7.configureContentNegotiation(contentNegotiationConfigurer10);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory12 = application7.servletContainer();
        de.htw.sdf.photoplatform.Application application13 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer14 = null;
        application13.configureDefaultServletHandling(defaultServletHandlerConfigurer14);
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array16 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver17 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver17, handlerMethodArgumentResolver_array16);
        application13.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver17);
        application7.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver17);
        application0.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver17);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory12);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str3 = imageData2.getPath();
        imageData2.setId((java.lang.Long) 1L);
        java.lang.String str6 = imageData2.getMessageSuccess();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getSmallThumbPath();
        java.lang.String str3 = image0.toString();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData4.setMobilePath("ROLE_PHOTOGRAPHER");
        imageData4.setMime("/index.html");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = imageData1.getName();
        java.lang.String str3 = imageData1.getName();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userDAOImpl0.getEntityManager();
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
        try {
            de.htw.sdf.photoplatform.persistence.model.User user16 = userDAOImpl0.update(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
        org.junit.Assert.assertNull(role7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
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
        org.springframework.validation.BindingResult bindingResult15 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData16 = photographerController0.updateCollection(collectionData10, bindingResult15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertNull(list_imageData11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        java.lang.String str4 = image0.getUpdatedBy();
        image0.setCreatedBy("ROLE_ADMIN");
        java.lang.String str7 = image0.getCreatedBy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ROLE_ADMIN" + "'", str7.equals("ROLE_ADMIN"));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        try {
            userDAOImpl0.deleteById((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userDAOImpl0.getEntityManager();
        try {
            userDAOImpl0.deleteById((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getName();
        image0.setMime("/users/profile/{userId}");
        image0.setMetaData("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image3 = imageDAOImpl0.getPublicImages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData5 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData6 = collectionData5.getUserdata();
        long long7 = collectionData5.getId();
        java.lang.Long[] long_array13 = new java.lang.Long[] { 10L, 1L, 100L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long14 = new java.util.ArrayList<java.lang.Long>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long14, long_array13);
        collectionData5.setImageIds((java.util.List<java.lang.Long>) arraylist_long14);
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage17 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 10L, (java.lang.Long) 100L, (java.util.List<java.lang.Long>) arraylist_long14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(userData6);
        org.junit.Assert.assertTrue(long7 == 0L);
        org.junit.Assert.assertNotNull(long_array13);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        try {
            org.springframework.security.core.userdetails.UserDetails userDetails4 = userDAOImpl0.loadUserByUsername("/photographer/upload");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
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
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData21 = photographerController0.getShowcase((-1), 400);
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
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
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
        de.htw.sdf.photoplatform.persistence.model.Collection collection13 = null;
        collectionImage6.setCollection(collection13);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage15 = collectionImageDAOImpl0.update(collectionImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
        org.junit.Assert.assertNotNull(image11);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        try {
            javax.persistence.Query query4 = collectionDAOImpl0.createQuery("/users/changepassword");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getEmail();
        userData0.setPhone("/photographer/images");
        java.util.List<java.lang.String> list_str6 = userData0.getRoles();
        userData0.setCompany("/users/update");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(list_str6);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
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
        java.lang.String str21 = image13.getPath();
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData0.setRoles(list_str2);
        java.lang.String str4 = userData0.getHomepage();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        user1.setLastName("/user/unlock/{id}");
        boolean b4 = user1.isPhotographer();
        try {
            boolean b5 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("/collections/photographers/{start}/{count}", (org.springframework.security.core.userdetails.UserDetails) user1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user5 = userDAOImpl0.find((java.lang.Integer) 400, (java.lang.Integer) 404);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
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
        de.htw.sdf.photoplatform.webservice.dto.UserData userData13 = imageData4.getUserData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + d8 + "' != '" + 1.0d + "'", d8.equals(1.0d));
        org.junit.Assert.assertNull(userData13);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
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
        java.lang.Boolean b23 = userData16.isEnabled();
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(list_str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + b23 + "' != '" + false + "'", b23.equals(false));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls1 = null;
        collectionDAOImpl0.setClazz(cls1);
        try {
            collectionDAOImpl0.deleteById((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        de.htw.sdf.photoplatform.Application application7 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer8 = null;
        application7.configureAsyncSupport(asyncSupportConfigurer8);
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer10 = null;
        application7.configureAsyncSupport(asyncSupportConfigurer10);
        org.springframework.web.servlet.HandlerExceptionResolver[] handlerExceptionResolver_array12 = new org.springframework.web.servlet.HandlerExceptionResolver[] {};
        java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver> arraylist_handlerExceptionResolver13 = new java.util.ArrayList<org.springframework.web.servlet.HandlerExceptionResolver>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver13, handlerExceptionResolver_array12);
        application7.configureHandlerExceptionResolvers((java.util.List<org.springframework.web.servlet.HandlerExceptionResolver>) arraylist_handlerExceptionResolver13);
        org.springframework.web.servlet.i18n.LocaleChangeInterceptor localeChangeInterceptor16 = application7.localeChangeInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest17 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse18 = null;
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange19 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        org.springframework.web.servlet.ModelAndView modelAndView20 = null;
        localeChangeInterceptor16.postHandle(httpServletRequest17, httpServletResponse18, (java.lang.Object) userPasswordChange19, modelAndView20);
        org.springframework.validation.BindingResult bindingResult22 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData23 = userController0.changePassword(userPasswordChange19, bindingResult22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(localeChangeInterceptor16);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
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
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry11 = null;
        try {
            application0.addInterceptors(interceptorRegistry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(handlerExceptionResolver_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(localeResolver9);
        org.junit.Assert.assertNotNull(localeChangeInterceptor10);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getMobileThumbPath();
        image0.setPublic(true);
        image0.setMobileThumbPath("/collections/photographers/{start}/{count}");
        java.util.Date date7 = image0.getCreatedAt();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user7 = userDAOImpl0.findByEnabled(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMetadata("/photographer/upload");
        java.lang.String str5 = imageData2.getMessageFailed();
        java.lang.Double d6 = imageData2.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(d6);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError4 = new de.htw.sdf.photoplatform.exception.common.ResponseError((int) (short) 1, (int) (short) 1, "/user/login", errors3);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
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
        de.htw.sdf.photoplatform.persistence.model.Image image30 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str31 = image30.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData32 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image30);
        imageData32.setMobilePath("/users/update");
        java.lang.String str35 = imageData32.getDescription();
        java.lang.String str36 = imageData32.getMetadata();
        java.lang.String str37 = imageData32.getMetadata();
        requestLoggerInterceptor0.afterConcurrentHandlingStarted(httpServletRequest28, httpServletResponse29, (java.lang.Object) imageData32);
        org.junit.Assert.assertNull(entityManager24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        try {
            userController0.unlockUser("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userRoleDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole8 = userRoleDAOImpl0.findOne((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage6 = collectionImageDAOImpl0.findOne((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
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
        try {
            userImageDAOImpl0.create(userImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
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
        userData0.setPaypalID("/photographer/upload");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(list_str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_str6);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        java.lang.String str1 = becomePhotographer0.getCompany();
        java.lang.String str2 = becomePhotographer0.getHomepage();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors1);
        int i3 = notFoundException2.getCode();
        java.lang.Throwable[] throwable_array4 = notFoundException2.getSuppressed();
        java.lang.Throwable[] throwable_array5 = notFoundException2.getSuppressed();
        org.junit.Assert.assertTrue(i3 == 10001);
        org.junit.Assert.assertNotNull(throwable_array4);
        org.junit.Assert.assertNotNull(throwable_array5);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
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
        imageData11.setMetadata("/photographer/upload");
        imageData11.setMessageFailed("/showcase");
        try {
            boolean b16 = requestLoggerInterceptor0.preHandle(httpServletRequest7, httpServletResponse8, (java.lang.Object) "/showcase");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        de.htw.sdf.photoplatform.persistence.model.Role role4 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role4.setName("ROLE_CUSTOMER");
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user7 = userDAOImpl0.findByRole(role4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setMobileThumbPath("ROLE_CUSTOMER");
        image0.setSmallThumbPath("");
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str6 = imageData5.getName();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        de.htw.sdf.photoplatform.exception.common.WebFormException webFormException1 = new de.htw.sdf.photoplatform.exception.common.WebFormException((int) (short) 1);
        java.lang.Throwable[] throwable_array2 = webFormException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwable_array2);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection3 = collectionDAOImpl0.update(collection2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.COLLECTIONS_UPDATE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/collections/update" + "'", str0.equals("/collections/update"));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister1 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister1.setLastName("/collections/addimage");
        org.springframework.validation.BindingResult bindingResult4 = null;
        try {
            authenticationController0.register(userRegister1, bindingResult4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole6 = userRoleDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
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
        java.lang.String str14 = imageData2.getMetadata();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "/photographer/upload" + "'", str14.equals("/photographer/upload"));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        java.lang.String str3 = becomePhotographer0.getIban();
        becomePhotographer0.setSwift("/user/enablephotographer");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user6 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b7 = user6.isPhotographer();
        userRole5.setUser(user6);
        try {
            userDAOImpl0.create(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        java.lang.String str3 = becomePhotographer0.getPaypalID();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array5 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long6 = new java.util.ArrayList<java.lang.Long>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long6, long_array5);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long6);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData9 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData10 = collectionData0.getUserdata();
        org.junit.Assert.assertNotNull(long_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(list_imageData9);
        org.junit.Assert.assertNull(userData10);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.lang.String str1 = de.htw.sdf.photoplatform.security.TokenUtils.getUserNameFromToken("/user/unlock/{id}");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "/user/unlock/{id}" + "'", str1.equals("/user/unlock/{id}"));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        de.htw.sdf.photoplatform.exception.common.InputError inputError2 = new de.htw.sdf.photoplatform.exception.common.InputError("ROLE_PHOTOGRAPHER", "/user/unlock/{id}");
        java.lang.String str3 = inputError2.getFieldName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ROLE_PHOTOGRAPHER" + "'", str3.equals("ROLE_PHOTOGRAPHER"));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.lang.String str0 = de.htw.sdf.photoplatform.webservice.Endpoints.COLLECTIONS_SHOWCASE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/collections/showcase" + "'", str0.equals("/collections/showcase"));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException1 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException((int) '#');
        java.lang.Throwable[] throwable_array2 = authorizationException1.getSuppressed();
        org.springframework.validation.Errors errors3 = authorizationException1.getErrors();
        org.junit.Assert.assertNotNull(throwable_array2);
        org.junit.Assert.assertNull(errors3);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            javax.persistence.Query query5 = userDAOImpl0.createQuery("/collections/{collectionId}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory3 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory4 = collectionCategoryDAOImpl0.update(collectionCategory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister1 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister1.setLastName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
        org.springframework.validation.BindingResult bindingResult4 = null;
        try {
            authenticationController0.register(userRegister1, bindingResult4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getSmallThumbPath();
        image0.setThumbPath("/photographer/images");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
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
        java.lang.String str13 = imageData8.getPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + d11 + "' != '" + (-1.0d) + "'", d11.equals((-1.0d)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors2);
        org.springframework.validation.Errors errors4 = badRequestException3.getErrors();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController0.handleBadRequestException(badRequestException3, webRequest5);
        try {
            java.lang.String str9 = photographerController0.deleteImageFromCollection((java.lang.Long) 10L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister1 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister1.setLastName("/collections/addimage");
        org.springframework.validation.BindingResult bindingResult4 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData5 = authenticationController0.login((de.htw.sdf.photoplatform.webservice.dto.UserCredential) userRegister1, bindingResult4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.Boolean b3 = userData0.isBanned();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertTrue("'" + b3 + "' != '" + false + "'", b3.equals(false));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        userData0.setSwift("/photographer/images");
        java.lang.String str3 = userData0.getPaypalID();
        userData0.setHomepage("");
        userData0.setPaypalID("/user/makeadmin/{id}");
        java.lang.String str8 = userData0.getSwift();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/photographer/images" + "'", str8.equals("/photographer/images"));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData8 = photographerController0.getPhotographersImages((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
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
        org.springframework.validation.BindingResult bindingResult21 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData22 = photographerController0.updateCollection(collectionData19, bindingResult21);
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
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
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
            java.lang.String str20 = photographerController0.updateCollectionShowcase("/user/lock/{id}");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i14 == 10001);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException2 = new de.htw.sdf.photoplatform.exception.NotFoundException("/users/profile/{userId}", errors1);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.makeAdmin("/showcase");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        java.lang.String str5 = becomePhotographer0.getCompany();
        becomePhotographer0.setIban("/collections/addimage");
        becomePhotographer0.setIban("/collections/addimage");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setThumbPath("/users/admin/{start}/{count}");
        java.util.Date date5 = image0.getCreatedAt();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(imageData6);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role14 = roleDAOImpl0.update(role13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(role4);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(role13);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage6 = collectionImageDAOImpl0.findOne((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage6 = userImageDAOImpl0.getOwnerImages((long) (short) 1, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        java.lang.String str3 = userData0.getHomepage();
        userData0.setId((java.lang.Long) (-1L));
        java.lang.Boolean b6 = userData0.isBanned();
        java.lang.String str7 = userData0.getSecToken();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getIban();
        becomePhotographer0.setSwift("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        becomePhotographer0.setPaypalID("/user/register");
        becomePhotographer0.setCompany("/showcase");
        java.lang.String str14 = becomePhotographer0.getPaypalID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "/user/register" + "'", str14.equals("/user/register"));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = collectionData0.getThumbnail();
        java.lang.Long[] long_array4 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long5, long_array4);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long5);
        java.lang.String str8 = collectionData0.getDescription();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(imageData2);
        org.junit.Assert.assertNotNull(long_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer3 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user5 = userDAOImpl0.findOne((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = null;
        try {
            userDAOImpl0.delete(user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
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
        org.springframework.validation.Errors errors20 = notFoundException13.getErrors();
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i14 == 10001);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "de.htw.sdf.photoplatform.exception.NotFoundException: " + "'", str19.equals("de.htw.sdf.photoplatform.exception.NotFoundException: "));
        org.junit.Assert.assertNull(errors20);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = de.htw.sdf.photoplatform.persistence.model.Role.DEFAULT_ROLES;
        userData0.setRoles(list_str2);
        userData0.setIban("/user/becomePhotographer");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(list_str2);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userDAOImpl0.getEntityManager();
        try {
            userDAOImpl0.deleteById((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        java.lang.String str3 = image0.toString();
        boolean b4 = image0.isEnabled();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        org.springframework.validation.Errors errors5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors5);
        int i7 = notFoundException6.getCode();
        notFoundException3.addSuppressed((java.lang.Throwable) notFoundException6);
        org.springframework.web.context.request.WebRequest webRequest9 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError10 = imageController0.handleNotFoundException(notFoundException3, webRequest9);
        org.springframework.web.multipart.MultipartFile multipartFile11 = null;
        org.springframework.web.multipart.MultipartFile[] multipartFile_array12 = new org.springframework.web.multipart.MultipartFile[] { multipartFile11 };
        try {
            java.lang.String str13 = imageController0.handleImageUpload(multipartFile_array12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertNotNull(responseError10);
        org.junit.Assert.assertNotNull(multipartFile_array12);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Role> list_role3 = roleDAOImpl0.findAllNotAdminRoles();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
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
        try {
            userDAOImpl0.create(user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
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
        java.lang.String str19 = collectionData0.getName();
        org.junit.Assert.assertNotNull(long_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(long_array14);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
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
            userImageDAOImpl0.create(userImage12);
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
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        try {
            java.lang.String str7 = photographerController0.updateCollectionShowcase("/users/changepassword");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userDAOImpl0.findPhotographersToActivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str4 = image3.getMime();
        java.lang.String str5 = image3.getMobileThumbPath();
        image3.setMetaData("/user/makeadmin/{id}");
        java.lang.String str8 = image3.getCreatedBy();
        image3.setChangeDate();
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image10 = imageDAOImpl0.update(image3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls2 = null;
        categoryDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.Category category4 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category4.setName("/user/enablephotographer");
        category4.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        category4.setName("/photographer/images/{imageId}");
        try {
            categoryDAOImpl0.create(category4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls2 = null;
        categoryDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.Category category4 = new de.htw.sdf.photoplatform.persistence.model.Category();
        java.lang.String str5 = category4.toString();
        try {
            categoryDAOImpl0.create(category4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Category{name='null'}" + "'", str5.equals("Category{name='null'}"));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage6 = userImageDAOImpl0.getOwnerImages((long) 10, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        try {
            userImageDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
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
        org.springframework.validation.BindingResult bindingResult16 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData17 = photographerController0.updateCollection(collectionData6, bindingResult16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
        org.junit.Assert.assertNotNull(long_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(list_imageData15);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor0 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse2 = null;
        de.htw.sdf.photoplatform.webservice.dto.UserData userData3 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str4 = userData3.getLastName();
        java.util.List<java.lang.String> list_str5 = userData3.getRoles();
        java.lang.String str6 = userData3.getSwift();
        java.lang.Boolean b7 = userData3.isEnabled();
        userData3.setId((java.lang.Long) 1L);
        try {
            boolean b10 = requestLoggerInterceptor0.preHandle(httpServletRequest1, httpServletResponse2, (java.lang.Object) userData3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(list_str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + b7 + "' != '" + false + "'", b7.equals(false));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        image0.setCreationDate();
        java.lang.String str3 = image0.getMime();
        java.lang.String str4 = image0.getMime();
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user5 = userDAOImpl0.findAllNotAdminUsers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
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
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData12 = photographerController0.getCollections((int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        int i4 = notFoundException3.getCode();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = userController0.handleNotFoundException(notFoundException3, webRequest5);
        int i7 = responseError6.getCode();
        java.lang.String str8 = responseError6.getDeveloperInfo();
        org.junit.Assert.assertTrue(i4 == 10001);
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001" + "'", str8.equals("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001"));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        de.htw.sdf.photoplatform.manager.impl.HashManagerImpl hashManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.HashManagerImpl();
        try {
            java.lang.String str3 = hashManagerImpl0.hash("de.htw.sdf.photoplatform.exception.NotFoundException: ", "/collections/photographers");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user6 = userDAOImpl0.findByEmail("Category{name='/photographer/images/{imageId}'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = null;
        try {
            collectionDAOImpl0.delete(collection2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls1 = null;
        categoryDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category4 = categoryDAOImpl0.findByName("ROLE_BECOME_PHOTOGRAPHER");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user6 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b7 = user6.isPhotographer();
        userRole5.setUser(user6);
        user6.setAccountNonLocked(true);
        boolean b11 = user6.isAccountNonExpired();
        java.lang.String str12 = user6.getUsername();
        try {
            de.htw.sdf.photoplatform.persistence.model.User user13 = userDAOImpl0.update(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionImage0.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = null;
        collectionImage0.setCollection(collection6);
        collectionImage0.setCreatedBy("/collections/{collectionId}/images");
        collectionImage0.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNull(collection5);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData1 = collectionData0.getImages();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData2 = collectionData0.getImages();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData3 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str4 = userData3.getLastName();
        java.util.List<java.lang.String> list_str5 = userData3.getRoles();
        collectionData0.setUserdata(userData3);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData7 = null;
        collectionData0.setImages(list_imageData7);
        org.junit.Assert.assertNull(list_imageData1);
        org.junit.Assert.assertNull(list_imageData2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(list_str5);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        image0.setMobileThumbPath("");
        image0.setPrice((java.lang.Double) 100.0d);
        java.lang.String str6 = image0.getMetaData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> collection_wildcard4 = user0.getAuthorities();
        de.htw.sdf.photoplatform.persistence.model.User user5 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b6 = user5.isEnabled();
        de.htw.sdf.photoplatform.persistence.model.User user7 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b8 = user7.isAdmin();
        java.lang.String str9 = user7.getSecToken();
        boolean b10 = user7.isAccountNonLocked();
        boolean b11 = user7.isCredentialsNonExpired();
        java.lang.String str12 = user7.getLastName();
        java.lang.String str13 = user7.getFirstName();
        de.htw.sdf.photoplatform.persistence.model.User user14 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b15 = user14.isAdmin();
        java.lang.String str16 = user14.getSecToken();
        boolean b17 = user14.isAccountNonLocked();
        boolean b18 = user14.isCredentialsNonExpired();
        boolean b19 = user14.isCredentialsNonExpired();
        java.lang.String str20 = user14.getPassword();
        boolean b21 = user14.isEnabled();
        java.lang.String str22 = user14.getPassword();
        de.htw.sdf.photoplatform.persistence.model.User user23 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b24 = user23.isAdmin();
        user23.setCreationDate();
        de.htw.sdf.photoplatform.persistence.model.User user26 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b27 = user26.isAdmin();
        user26.setCreationDate();
        user26.setAccountNonLocked(true);
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor31 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse33 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException36 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor31.afterCompletion(httpServletRequest32, httpServletResponse33, (java.lang.Object) 10, (java.lang.Exception) notFoundException36);
        javax.servlet.http.HttpServletRequest httpServletRequest38 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse39 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage40 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView41 = null;
        requestLoggerInterceptor31.postHandle(httpServletRequest38, httpServletResponse39, (java.lang.Object) userImage40, modelAndView41);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole43 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user44 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b45 = user44.isPhotographer();
        userRole43.setUser(user44);
        user44.setUsername("/api");
        boolean b49 = user44.isAccountNonLocked();
        java.lang.String str50 = user44.getSecToken();
        userImage40.setUser(user44);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole52 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user53 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b54 = user53.isPhotographer();
        userRole52.setUser(user53);
        java.lang.String str56 = user53.getUpdatedBy();
        de.htw.sdf.photoplatform.persistence.model.User user57 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b58 = user57.isAdmin();
        user57.setPassword("ROLE_PHOTOGRAPHER");
        boolean b62 = user57.isRoleIncluded("/user/becomePhotographer");
        boolean b63 = user57.isCredentialsNonExpired();
        de.htw.sdf.photoplatform.persistence.model.User user64 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b65 = user64.isAdmin();
        java.lang.String str66 = user64.getSecToken();
        boolean b67 = user64.isAccountNonLocked();
        boolean b68 = user64.isCredentialsNonExpired();
        boolean b69 = user64.isCredentialsNonExpired();
        java.lang.String str70 = user64.getPassword();
        boolean b71 = user64.isEnabled();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole72 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user73 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b74 = user73.isPhotographer();
        userRole72.setUser(user73);
        user73.setAccountNonLocked(true);
        boolean b78 = user73.isAccountNonExpired();
        de.htw.sdf.photoplatform.persistence.model.User user79 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b80 = user79.isAdmin();
        de.htw.sdf.photoplatform.persistence.model.User[] user_array81 = new de.htw.sdf.photoplatform.persistence.model.User[] { user0, user5, user7, user14, user23, user26, user44, user53, user57, user64, user73, user79 };
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.User> arraylist_user82 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.User>();
        boolean b83 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.User>) arraylist_user82, user_array81);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.UserData> list_userData84 = de.htw.sdf.photoplatform.webservice.util.UserUtility.convertToUserData((java.util.List<de.htw.sdf.photoplatform.persistence.model.User>) arraylist_user82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(collection_wildcard4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(user_array81);
        org.junit.Assert.assertTrue(b83 == true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        userData0.setIban("/collections/{collectionId}");
        java.lang.String str4 = userData0.getSecToken();
        userData0.setBanned(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        try {
            userController0.lockUser("/photographer/images");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors2);
        org.springframework.web.context.request.WebRequest webRequest4 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError5 = photographerController0.handleBadRequestException(badRequestException3, webRequest4);
        try {
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData8 = photographerController0.getPhotographersImages((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
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
        try {
            de.htw.sdf.photoplatform.persistence.model.UserImage userImage25 = userImageDAOImpl0.update(userImage10);
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
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
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
        java.lang.String str24 = imageData22.getMime();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(imageData22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
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
        de.htw.sdf.photoplatform.persistence.model.Collection collection13 = null;
        collectionImage6.setCollection(collection13);
        try {
            collectionImageDAOImpl0.create(collectionImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
        org.junit.Assert.assertNotNull(image11);
        org.junit.Assert.assertNull(date12);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        org.springframework.validation.Errors errors5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors5);
        int i7 = notFoundException6.getCode();
        notFoundException3.addSuppressed((java.lang.Throwable) notFoundException6);
        org.springframework.web.context.request.WebRequest webRequest9 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError10 = imageController0.handleNotFoundException(notFoundException3, webRequest9);
        int i11 = responseError10.getCode();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str12 = responseError10.getErrors();
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertNotNull(responseError10);
        org.junit.Assert.assertTrue(i11 == 10001);
        org.junit.Assert.assertNotNull(map_str_list_str12);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
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
            java.lang.String str20 = photographerController0.updateCollectionShowcase("/users/update");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i14 == 10001);
        org.junit.Assert.assertNotNull(responseError16);
        org.junit.Assert.assertNotNull(responseError18);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory2 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = null;
        collectionCategory2.setCollection(collection3);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = null;
        collectionCategory2.setCollection(collection5);
        try {
            collectionCategoryDAOImpl0.delete(collectionCategory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = null;
        try {
            collectionDAOImpl0.create(collection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        de.htw.sdf.photoplatform.Application application0 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer asyncSupportConfigurer1 = null;
        application0.configureAsyncSupport(asyncSupportConfigurer1);
        org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer contentNegotiationConfigurer3 = null;
        application0.configureContentNegotiation(contentNegotiationConfigurer3);
        org.springframework.boot.context.embedded.EmbeddedServletContainerFactory embeddedServletContainerFactory5 = application0.servletContainer();
        de.htw.sdf.photoplatform.Application application6 = new de.htw.sdf.photoplatform.Application();
        org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer defaultServletHandlerConfigurer7 = null;
        application6.configureDefaultServletHandling(defaultServletHandlerConfigurer7);
        org.springframework.web.method.support.HandlerMethodArgumentResolver[] handlerMethodArgumentResolver_array9 = new org.springframework.web.method.support.HandlerMethodArgumentResolver[] {};
        java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver> arraylist_handlerMethodArgumentResolver10 = new java.util.ArrayList<org.springframework.web.method.support.HandlerMethodArgumentResolver>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver10, handlerMethodArgumentResolver_array9);
        application6.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver10);
        application0.addArgumentResolvers((java.util.List<org.springframework.web.method.support.HandlerMethodArgumentResolver>) arraylist_handlerMethodArgumentResolver10);
        org.springframework.web.servlet.config.annotation.InterceptorRegistry interceptorRegistry14 = null;
        try {
            application0.addInterceptors(interceptorRegistry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(embeddedServletContainerFactory5);
        org.junit.Assert.assertNotNull(handlerMethodArgumentResolver_array9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = userDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user7 = userDAOImpl0.findByAccountLocked(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
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
        try {
            userManagerImpl0.delete(user22);
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
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        de.htw.sdf.photoplatform.webservice.controller.AuthenticationController authenticationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthenticationController();
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController1 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors3 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException4 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_CUSTOMER", errors3);
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController1.handleBadRequestException(badRequestException4, webRequest5);
        org.springframework.web.context.request.WebRequest webRequest7 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError8 = authenticationController0.handleBadRequestException(badRequestException4, webRequest7);
        de.htw.sdf.photoplatform.webservice.dto.UserRegister userRegister9 = new de.htw.sdf.photoplatform.webservice.dto.UserRegister();
        userRegister9.setLastName("/collections/addimage");
        java.lang.String str12 = userRegister9.getLastName();
        org.springframework.validation.BindingResult bindingResult13 = null;
        try {
            authenticationController0.register(userRegister9, bindingResult13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError6);
        org.junit.Assert.assertNotNull(responseError8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "/collections/addimage" + "'", str12.equals("/collections/addimage"));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user6 = userDAOImpl0.findByEmail("/user/enablephotographer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls1 = null;
        categoryDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Category category4 = categoryDAOImpl0.findByName("ROLE_ADMIN");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getEmail();
        userData0.setPaypalID("/users/admin/{start}/{count}");
        java.lang.Boolean b6 = userData0.isEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        try {
            userDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection5 = collectionDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
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
        long long23 = collectionData19.getId();
        org.springframework.validation.BindingResult bindingResult24 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData25 = photographerController0.updateCollection(collectionData19, bindingResult24);
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
        org.junit.Assert.assertTrue(long23 == 0L);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        try {
            org.springframework.security.config.annotation.web.builders.HttpSecurity httpSecurity2 = xAuthTokenConfigurer1.and();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException3 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors2);
        org.springframework.validation.Errors errors4 = badRequestException3.getErrors();
        org.springframework.web.context.request.WebRequest webRequest5 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError6 = photographerController0.handleBadRequestException(badRequestException3, webRequest5);
        org.springframework.validation.BindingResult bindingResult8 = null;
        try {
            java.lang.String str9 = photographerController0.addImageToCollection("", bindingResult8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(errors4);
        org.junit.Assert.assertNotNull(responseError6);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image1);
        java.lang.String str3 = image1.getCreatedBy();
        java.util.Date date4 = null;
        image1.setUpdatedAt(date4);
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image6 = imageManagerImpl0.update(image1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(imageData2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
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
        java.lang.RuntimeException runtimeException19 = null;
        try {
            photographerController0.handleBaseException(runtimeException19);
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
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
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
        try {
            userRoleDAOImpl0.create(userRole3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(role4);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(role13);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        userPasswordChange0.setNewPassword("/showcase");
        java.lang.String str3 = userPasswordChange0.getPasswordConfirm();
        userPasswordChange0.setPasswordConfirm("");
        userPasswordChange0.setNewPassword("ROLE_PHOTOGRAPHER");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        de.htw.sdf.photoplatform.exception.common.ManagerException managerException1 = new de.htw.sdf.photoplatform.exception.common.ManagerException(10002);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        javax.persistence.EntityManager entityManager5 = collectionImageDAOImpl0.getEntityManager();
        try {
            javax.persistence.Query query7 = collectionImageDAOImpl0.createQuery("/user/becomePhotographer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager5);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array0 = new de.htw.sdf.photoplatform.persistence.model.Collection[] {};
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection1 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1, collection_array0);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData3 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData4 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1, (java.lang.Boolean) true);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData8 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1, (java.lang.Boolean) true);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData9 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection1);
        org.junit.Assert.assertNotNull(collection_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_collectionData3);
        org.junit.Assert.assertNotNull(list_collectionData4);
        org.junit.Assert.assertNotNull(list_collectionData6);
        org.junit.Assert.assertNotNull(list_collectionData8);
        org.junit.Assert.assertNotNull(list_collectionData9);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setIban("ROLE_ADMIN");
        java.lang.String str7 = becomePhotographer0.getPhone();
        java.lang.String str8 = becomePhotographer0.getPhone();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "/user/makeadmin/{id}" + "'", str7.equals("/user/makeadmin/{id}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/user/makeadmin/{id}" + "'", str8.equals("/user/makeadmin/{id}"));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        de.htw.sdf.photoplatform.exception.common.InputError inputError2 = new de.htw.sdf.photoplatform.exception.common.InputError("ec7908a224b49d37ffc84c612f320838", "/showcase");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Category> cls2 = null;
        categoryDAOImpl0.setClazz(cls2);
        try {
            javax.persistence.Query query5 = categoryDAOImpl0.createQuery("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionDAOImpl0.update(collection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Role> list_role5 = roleDAOImpl0.findAllNotAdminRoles();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = userImageDAOImpl0.getEntityManager();
        try {
            userImageDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        try {
            java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage7 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 0L, 10001, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole4 = userRoleDAOImpl0.findByUserId((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
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
        de.htw.sdf.photoplatform.exception.common.WebFormException webFormException16 = new de.htw.sdf.photoplatform.exception.common.WebFormException(11002);
        requestLoggerInterceptor0.afterCompletion(httpServletRequest12, httpServletResponse13, (java.lang.Object) "/photographer/images", (java.lang.Exception) webFormException16);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = null;
        try {
            collectionDAOImpl0.create(collection2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
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
        userRegister23.setLastName("/collections/addimage");
        userRegister23.setLastName("/user/becomePhotographer");
        userRegister23.setLastName("null:1528137250344:31149e863206f62132f4465a1c878d2c");
        org.springframework.validation.BindingResult bindingResult30 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.UserData userData31 = authenticationController0.login((de.htw.sdf.photoplatform.webservice.dto.UserCredential) userRegister23, bindingResult30);
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
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.String str5 = imageData2.getDescription();
        java.lang.String str6 = imageData2.getMetadata();
        imageData2.setMessageSuccess("/showcase");
        imageData2.setMime("/users/update");
        java.lang.String str11 = imageData2.getSmallPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.springframework.validation.Errors errors1 = null;
        de.htw.sdf.photoplatform.exception.BadRequestException badRequestException2 = new de.htw.sdf.photoplatform.exception.BadRequestException("ROLE_PHOTOGRAPHER", errors1);
        org.springframework.validation.Errors errors3 = badRequestException2.getErrors();
        de.htw.sdf.photoplatform.exception.common.AuthorizationException authorizationException5 = new de.htw.sdf.photoplatform.exception.common.AuthorizationException(100);
        java.lang.Throwable[] throwable_array6 = authorizationException5.getSuppressed();
        badRequestException2.addSuppressed((java.lang.Throwable) authorizationException5);
        java.lang.Throwable[] throwable_array8 = authorizationException5.getSuppressed();
        org.junit.Assert.assertNull(errors3);
        org.junit.Assert.assertNotNull(throwable_array6);
        org.junit.Assert.assertNotNull(throwable_array8);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
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
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image22 = imageManagerImpl0.update((java.lang.Long) 1L, "", (java.lang.Double) 0.0d, "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c", user18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setMobileThumbPath("ROLE_CUSTOMER");
        image0.setCreatedBy("/collections/photographers");
        java.util.Date date5 = null;
        image0.setUpdatedAt(date5);
        java.lang.Double d7 = image0.getPrice();
        java.lang.String str8 = image0.toString();
        org.junit.Assert.assertNull(d7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str8.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setMobileThumbPath("ROLE_CUSTOMER");
        image0.setSmallThumbPath("");
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData5.setPrice((java.lang.Double) 100.0d);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls1 = null;
        collectionImageDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.CollectionImage> cls3 = null;
        collectionImageDAOImpl0.setClazz(cls3);
        try {
            de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage7 = collectionImageDAOImpl0.findBy((java.lang.Long) 10L, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
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
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData18 = photographerController0.updateCollection(collectionData10, bindingResult17);
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
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData8.setMessageSuccess("/user/enablephotographer");
        imageData8.setPath("de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.validation.Errors errors2 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException3 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors2);
        org.springframework.validation.Errors errors5 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException6 = new de.htw.sdf.photoplatform.exception.NotFoundException("", errors5);
        int i7 = notFoundException6.getCode();
        notFoundException3.addSuppressed((java.lang.Throwable) notFoundException6);
        org.springframework.web.context.request.WebRequest webRequest9 = null;
        de.htw.sdf.photoplatform.exception.common.ResponseError responseError10 = imageController0.handleNotFoundException(notFoundException3, webRequest9);
        java.lang.RuntimeException runtimeException11 = null;
        try {
            imageController0.handleBaseException(runtimeException11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i7 == 10001);
        org.junit.Assert.assertNotNull(responseError10);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData0 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = collectionData0.getThumbnail();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = collectionData0.getThumbnail();
        java.lang.Long[] long_array4 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long5, long_array4);
        collectionData0.setImageIds((java.util.List<java.lang.Long>) arraylist_long5);
        collectionData0.setId((long) (short) -1);
        long long10 = collectionData0.getId();
        org.junit.Assert.assertNull(imageData1);
        org.junit.Assert.assertNull(imageData2);
        org.junit.Assert.assertNotNull(long_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(long10 == (-1L));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setSwift("/users/changepassword");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
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
        de.htw.sdf.photoplatform.persistence.model.Image image18 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str19 = image18.getMime();
        java.lang.String str20 = image18.getMobileThumbPath();
        image18.setMetaData("/user/makeadmin/{id}");
        java.lang.String str23 = image18.toString();
        java.lang.String str24 = image18.getName();
        userImage10.setImage(image18);
        try {
            userImageDAOImpl0.create(userImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str23.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        de.htw.sdf.photoplatform.manager.impl.HashManagerImpl hashManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.HashManagerImpl();
        java.lang.String str2 = hashManagerImpl0.hash("/user/becomePhotographer");
        java.lang.String str4 = hashManagerImpl0.hash("/collections/showcase");
        try {
            java.lang.String str7 = hashManagerImpl0.hash("obfuscate", "ec7908a224b49d37ffc84c612f320838");
            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException");
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c" + "'", str2.equals("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9" + "'", str4.equals("4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9"));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
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
        java.lang.String str12 = responseError9.getDeveloperInfo();
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertTrue(i10 == 10001);
        org.junit.Assert.assertNotNull(map_str_list_str11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001" + "'", str12.equals("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        java.lang.Double d6 = image5.getPrice();
        image5.setPath("null:1528137248666:32ad08d7594d28504f1460b47d9ec391");
        java.lang.String str9 = image5.getDescription();
        org.junit.Assert.assertNotNull(image5);
        org.junit.Assert.assertNull(d6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user7 = userDAOImpl0.findByRoleAndEnabledFilter("Category{name='/photographer/images/{imageId}'}", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Image> cls1 = null;
        imageDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        try {
            de.htw.sdf.photoplatform.persistence.model.Image image5 = imageDAOImpl0.findOne((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData8.setPrice((java.lang.Double) (-1.0d));
        java.lang.Double d11 = imageData8.getPrice();
        imageData8.setPath("/collections/update");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + d11 + "' != '" + (-1.0d) + "'", d11.equals((-1.0d)));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        try {
            roleDAOImpl0.deleteAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
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
        de.htw.sdf.photoplatform.persistence.model.Image image14 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str15 = image14.getMime();
        java.lang.String str16 = image14.getUpdatedBy();
        java.lang.String str17 = image14.getSmallThumbPath();
        image14.setCreatedBy("/collections/addimage");
        image14.setEnabled(true);
        userImage11.setImage(image14);
        de.htw.sdf.photoplatform.persistence.model.User user23 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b24 = user23.isAdmin();
        user23.setPassword("ROLE_PHOTOGRAPHER");
        boolean b28 = user23.isRoleIncluded("/user/becomePhotographer");
        boolean b29 = user23.isCredentialsNonExpired();
        userImage11.setUser(user23);
        try {
            userImageDAOImpl0.create(userImage11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user4 = userDAOImpl0.findPhotographersToActivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole6 = userRoleDAOImpl0.findByUserAndRoleId((java.lang.Long) 0L, (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        becomePhotographer0.setPhone("/user/makeadmin/{id}");
        becomePhotographer0.setSwift("/users/admin/{start}/{count}");
        java.lang.String str7 = becomePhotographer0.getIban();
        becomePhotographer0.setSwift("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        becomePhotographer0.setPaypalID("/user/register");
        becomePhotographer0.setCompany("/photographer/images");
        becomePhotographer0.setPhone("4fba34a2d1a9ca6d365afda926e32f8c0013d70320fe7fa4b94e95fa4f5d7e75fbe82d0b0da641c6d8dcf08f1f582859ff36da90f7ee8dcbcaa04016cadf91a9");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
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
        java.lang.Long long24 = imageData23.getId();
        org.springframework.validation.BindingResult bindingResult25 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.ImageData imageData26 = photographerController0.updateImage(imageData23, bindingResult25);
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
        org.junit.Assert.assertNull(long24);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionDAOImpl0.update(collection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        try {
            collectionDAOImpl0.deleteById((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getName();
        image0.setMime("/users/profile/{userId}");
        image0.setMetaData("/user/enablephotographer");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.util.List<java.lang.String> list_str2 = userData0.getRoles();
        java.lang.String str3 = userData0.getSwift();
        java.lang.String str4 = userData0.getSecToken();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
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
        de.htw.sdf.photoplatform.persistence.model.User user12 = userRole8.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user13 = userRole8.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user14 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b15 = user14.isAdmin();
        java.lang.String str16 = user14.getSecToken();
        userRole8.setUser(user14);
        de.htw.sdf.photoplatform.persistence.model.Role role18 = userRole8.getRole();
        de.htw.sdf.photoplatform.persistence.model.User user19 = null;
        userRole8.setUser(user19);
        try {
            userRoleDAOImpl0.delete(userRole8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager7);
        org.junit.Assert.assertNull(role9);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(role18);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange userPasswordChange0 = new de.htw.sdf.photoplatform.webservice.dto.UserPasswordChange();
        java.lang.String str1 = userPasswordChange0.getPasswordConfirm();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls2 = null;
        userDAOImpl0.setClazz(cls2);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user6 = userDAOImpl0.find((java.lang.Integer) 10, (java.lang.Integer) 10000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        java.lang.String str2 = imageData1.getName();
        java.lang.String str3 = imageData1.getSmallPath();
        imageData1.setCode((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(imageData1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
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
        de.htw.sdf.photoplatform.persistence.model.Category category10 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category10.setName("/user/enablephotographer");
        category10.setName("hi!");
        java.lang.String str15 = category10.getDescription();
        java.lang.String str16 = category10.getDescription();
        collectionCategory5.setCategory(category10);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory18 = collectionCategoryDAOImpl0.getCollectionCategoryBy(category10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
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
        collectionData6.setId(1L);
        de.htw.sdf.photoplatform.webservice.dto.UserData userData14 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str15 = userData14.getLastName();
        collectionData6.setUserdata(userData14);
        de.htw.sdf.photoplatform.persistence.model.Image image17 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str18 = image17.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData19 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image17);
        imageData19.setMetadata("/photographer/upload");
        imageData19.setMobilePath("/user/makeadmin/{id}");
        collectionData6.setThumbnail(imageData19);
        org.springframework.validation.BindingResult bindingResult25 = null;
        try {
            de.htw.sdf.photoplatform.persistence.model.Collection collection26 = photographerController0.createCollection(collectionData6, bindingResult25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(responseError5);
        org.junit.Assert.assertNull(list_imageData7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(long11 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        boolean b5 = image0.isEnabled();
        image0.setMobileThumbPath("ROLE_ADMIN");
        java.lang.Double d8 = image0.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(d8);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image0.setCreatedBy("");
        image0.setPrice((java.lang.Double) 1.0d);
        java.lang.String str5 = image0.getDescription();
        java.lang.String str6 = image0.getMime();
        boolean b7 = image0.isEnabled();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData8 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        java.lang.String str9 = image0.getSmallThumbPath();
        java.lang.String str10 = image0.getSmallThumbPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getSmallThumbPath();
        java.lang.String str3 = image0.toString();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData4.setDescription("/users/update");
        imageData4.setDescription("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.lang.String str9 = imageData4.getThumbnailPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Image{name='null', path='null', isPublic=false, enabled=false, price=null}" + "'", str3.equals("Image{name='null', path='null', isPublic=false, enabled=false, price=null}"));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
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
        collectionData10.setPublic((java.lang.Boolean) true);
        org.springframework.validation.BindingResult bindingResult14 = null;
        try {
            de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData15 = photographerController0.updateCollection(collectionData10, bindingResult14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
        org.junit.Assert.assertNull(userData11);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setCreationDate();
        user0.setAccountNonLocked(true);
        boolean b5 = user0.isAccountNonLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        java.lang.String str2 = image0.getUpdatedBy();
        java.lang.String str3 = image0.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData4 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        boolean b5 = image0.isEnabled();
        image0.setMobileThumbPath("ROLE_ADMIN");
        java.lang.String str8 = image0.getThumbPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
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
        de.htw.sdf.photoplatform.persistence.model.User user13 = userRole8.getUser();
        try {
            de.htw.sdf.photoplatform.persistence.model.UserRole userRole14 = userRoleDAOImpl0.update(userRole8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertNull(entityManager7);
        org.junit.Assert.assertNull(role9);
        org.junit.Assert.assertNotNull(role12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setAccountNonLocked(true);
        boolean b7 = user2.isAccountNonExpired();
        java.lang.String str8 = user2.getUsername();
        try {
            boolean b9 = de.htw.sdf.photoplatform.security.TokenUtils.validateToken("/users/update", (org.springframework.security.core.userdetails.UserDetails) user2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls1 = null;
        userRoleDAOImpl0.setClazz(cls1);
        javax.persistence.EntityManager entityManager3 = userRoleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserRole> cls4 = null;
        userRoleDAOImpl0.setClazz(cls4);
        javax.persistence.EntityManager entityManager6 = userRoleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole7 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user8 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b9 = user8.isPhotographer();
        userRole7.setUser(user8);
        java.lang.String str11 = userRole7.getUpdatedBy();
        try {
            userRoleDAOImpl0.delete(userRole7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertNull(entityManager6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls2 = null;
        userImageDAOImpl0.setClazz(cls2);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.UserImage> cls4 = null;
        userImageDAOImpl0.setClazz(cls4);
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor6 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException11 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor6.afterCompletion(httpServletRequest7, httpServletResponse8, (java.lang.Object) 10, (java.lang.Exception) notFoundException11);
        javax.servlet.http.HttpServletRequest httpServletRequest13 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse14 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage15 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView16 = null;
        requestLoggerInterceptor6.postHandle(httpServletRequest13, httpServletResponse14, (java.lang.Object) userImage15, modelAndView16);
        java.util.Date date18 = userImage15.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Image image19 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image19.setCreatedBy("");
        image19.setPrice((java.lang.Double) 1.0d);
        java.lang.String str24 = image19.getDescription();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData25 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image19);
        userImage15.setImage(image19);
        try {
            userImageDAOImpl0.delete(userImage15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str1 = image0.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        imageData2.setMobilePath("/users/update");
        java.lang.Long long5 = imageData2.getCode();
        imageData2.setName("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData8 = imageData2.getUserData();
        imageData2.setMetadata("Category{name='null'}");
        imageData2.setName("/users/update");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(userData8);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Collection> cls2 = null;
        collectionDAOImpl0.setClazz(cls2);
        javax.persistence.EntityManager entityManager4 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user6 = collection5.getUser();
        try {
            collectionDAOImpl0.create(collection5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager4);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
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
            java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData12 = photographerController0.getShowcase(0, 10000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 10001);
        org.junit.Assert.assertNotNull(responseError7);
        org.junit.Assert.assertNotNull(responseError9);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer becomePhotographer0 = new de.htw.sdf.photoplatform.webservice.dto.BecomePhotographer();
        becomePhotographer0.setPhone("ROLE_ADMIN");
        java.lang.String str3 = becomePhotographer0.getSwift();
        java.lang.String str4 = becomePhotographer0.getIban();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls1 = null;
        userDAOImpl0.setClazz(cls1);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls3 = null;
        userDAOImpl0.setClazz(cls3);
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.User> cls5 = null;
        userDAOImpl0.setClazz(cls5);
        try {
            de.htw.sdf.photoplatform.persistence.model.User user8 = userDAOImpl0.findById((java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData0 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.String str1 = userData0.getLastName();
        java.lang.String str2 = userData0.getEmail();
        java.lang.String str3 = userData0.getHomepage();
        userData0.setId((java.lang.Long) (-1L));
        java.lang.Boolean b6 = userData0.isBanned();
        userData0.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls3 = null;
        roleDAOImpl0.setClazz(cls3);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.Role> list_role5 = roleDAOImpl0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user4 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b5 = user4.isBecomePhotographer();
        boolean b6 = user4.isAccountNonExpired();
        java.lang.String str8 = de.htw.sdf.photoplatform.security.TokenUtils.computeSignature((org.springframework.security.core.userdetails.UserDetails) user4, (long) 11004);
        java.util.Date date9 = null;
        user4.setUpdatedAt(date9);
        try {
            java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage13 = userImageDAOImpl0.getPhotographImages(user4, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(entityManager1);
        org.junit.Assert.assertNull(entityManager2);
        org.junit.Assert.assertNull(entityManager3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "39c73479cb767c5a09248b3313c03447" + "'", str8.equals("39c73479cb767c5a09248b3313c03447"));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.lang.Class<de.htw.sdf.photoplatform.persistence.model.Role> cls1 = null;
        roleDAOImpl0.setClazz(cls1);
        try {
            de.htw.sdf.photoplatform.persistence.model.Role role4 = roleDAOImpl0.findByName("/collections/addimage");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }
}

