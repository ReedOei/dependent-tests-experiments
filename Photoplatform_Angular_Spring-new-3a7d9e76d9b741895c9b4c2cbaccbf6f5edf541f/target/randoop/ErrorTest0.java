import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 10L, (java.lang.Long) 1L, (java.lang.Long) 10L);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        categoryDAOImpl0.deleteById((long) 'a');
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = photographerManagerImpl0.createCollection((java.lang.Long) 100L, "", "/showcase");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getShowcaseByUser((java.lang.Long) (-1L), 0, 1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        imageDAOImpl0.delete(image1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        imageDAOImpl0.deleteAll();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteCollection((java.lang.Long) 1L, (java.lang.Long) 0L);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        imageDAOImpl0.deleteById((long) ' ');
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Long[] long_array4 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> arraylist_long5 = new java.util.ArrayList<java.lang.Long>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long5, long_array4);
        java.lang.Boolean b7 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) (-1L), (java.lang.Long) 0L, (java.util.List<java.lang.Long>) arraylist_long5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = photographerManagerImpl0.addImageToCollection((java.lang.Long) (-1L), (java.lang.Long) 100L, (java.lang.Long) 1L);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        collectionImageDAOImpl0.deleteById((long) (byte) 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory1 = collectionCategoryDAOImpl0.findAll();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = collectionImageDAOImpl0.findBy((java.lang.Long) 0L, (java.lang.Long) (-1L));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteImage((java.lang.Long) (-1L), (java.lang.Long) 10L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        java.lang.String str3 = image1.getUpdatedBy();
        java.lang.String str4 = image1.getSmallThumbPath();
        imageDAOImpl0.delete(image1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getCollectionByUser((long) 'a', 100, (int) (byte) -1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image1 = imageDAOImpl0.getPublicImages();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        categoryDAOImpl0.deleteById((long) 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage1 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        collectionImageDAOImpl0.create(collectionImage1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.Query query3 = userImageDAOImpl0.createQuery("/users/update");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        collectionCategoryDAOImpl0.deleteAll();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteCollection((java.lang.Long) 10L, (java.lang.Long) 1L);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = photographerManagerImpl0.createCollection((java.lang.Long) 100L, "/user/enablephotographer", "hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage2 = collectionImageDAOImpl0.findOne(10L);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user1 = userManagerImpl0.findAll();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        imageDAOImpl0.deleteById((long) (short) 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.makeAdmin((long) '#');
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = imageDAOImpl0.findOne((long) ' ');
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl collectionManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionManagerImpl0.getCollectionImages((java.lang.Long) 0L, 0, (int) (byte) 1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        photographerManagerImpl0.deleteAllCollections();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole3 = userRoleDAOImpl0.findByUserAndRoleId((java.lang.Long) 10L, (java.lang.Long) 0L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findByName("/collections/{collectionId}/images");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = userRole1.getRole();
        userRoleDAOImpl0.create(userRole1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole1 = userRoleDAOImpl0.findAll();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Category> list_category1 = categoryManagerImpl0.findAll();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.Query query2 = userImageDAOImpl0.createQuery("/user/login");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerManagerImpl0.getAllCollection();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        collectionCategoryDAOImpl0.deleteById((long) (byte) 100);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory2 = collectionCategoryDAOImpl0.findOne((long) (short) 10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole2 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role3 = userRole2.getRole();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole4 = userRoleDAOImpl0.update(userRole2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.UserData> list_userData3 = userController0.getEnabledUsers((int) '#', 10000);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        categoryDAOImpl0.deleteAll();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteCollection((java.lang.Long) 0L, (java.lang.Long) 0L);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = photographerManagerImpl0.getCollectionById((long) (short) 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage1 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image2.setCreatedBy("");
        collectionImage1.setImage(image2);
        collectionImage0.setImage(image2);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on collectionImage0, collectionImage1, and collectionImage1.", !(collectionImage0.equals(collectionImage1) && collectionImage1.equals(collectionImage1)) || collectionImage0.equals(collectionImage1));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.UserData> list_userData3 = userController0.getEnabledUsers((-1), 10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user1 = userManagerImpl0.getPhotographersToActivate();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage3 = userImageDAOImpl0.findOne((long) (short) -1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteImage((java.lang.Long) 0L, (java.lang.Long) 1L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findByName("/user/login");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        categoryDAOImpl0.deleteAll();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = imageManagerImpl0.findById((long) 11002);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage2 = userImageDAOImpl0.findOne(1L);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteImage((java.lang.Long) 1L, (java.lang.Long) 10L);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.lang.Long[] long_array5 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> arraylist_long6 = new java.util.ArrayList<java.lang.Long>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long6, long_array5);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage8 = userImageDAOImpl0.getOwnerImages((long) 404, (java.util.List<java.lang.Long>) arraylist_long6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        imageDAOImpl0.deleteById(1L);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.UserData> list_userData1 = userController0.getBecomePhotographers();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl collectionManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionManagerImpl0.getCollectionImages((java.lang.Long) 0L, 11003, 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image2.setMetaData("");
        image2.setEnabled(true);
        de.htw.sdf.photoplatform.persistence.model.Image image7 = imageDAOImpl0.update(image2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        collectionCategoryDAOImpl0.deleteById((long) 11004);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage2 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image3.setCreatedBy("");
        collectionImage2.setImage(image3);
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage7 = collectionImageDAOImpl0.update(collectionImage2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = photographerManagerImpl0.createCollection((java.lang.Long) 100L, "", "/user/{name}");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.Query query2 = categoryDAOImpl0.createQuery("/collections/{collectionId}/images");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole3 = userRoleDAOImpl0.findByUserId((java.lang.Long) 100L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage1 = userImageDAOImpl0.findAll();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        java.lang.String str3 = image1.getUpdatedBy();
        java.lang.String str4 = image1.getSmallThumbPath();
        java.lang.String str5 = image1.getUpdatedBy();
        image1.setCreatedBy("ROLE_ADMIN");
        java.lang.String str8 = image1.toString();
        de.htw.sdf.photoplatform.persistence.model.Image image9 = imageManagerImpl0.update(image1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getShowcaseByUser((java.lang.Long) (-1L), 10, (int) 'a');
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        imageController0.initIt();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteImage((java.lang.Long) (-1L), (java.lang.Long) 0L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setName("/photographer/upload");
        java.lang.String str4 = image1.toString();
        image1.setSmallThumbPath("ROLE_ADMIN");
        java.lang.String str7 = image1.getSmallThumbPath();
        imageManagerImpl0.delete(image1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        userManagerImpl0.deleteAll();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = photographerManagerImpl0.createCollection((java.lang.Long) (-1L), "/users/admin/{start}/{count}", "Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage0 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(userImage0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage2 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image3.setCreatedBy("");
        collectionImage2.setImage(image3);
        collectionImageDAOImpl0.delete(collectionImage2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory2 = collectionCategoryDAOImpl0.findAll();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image1 = imageManagerImpl0.findAll();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image4 = imageManagerImpl0.update(image1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteCollection((java.lang.Long) (-1L), (java.lang.Long) 100L);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image1 = imageDAOImpl0.findAll();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = collectionDAOImpl0.findById((java.lang.Long) 10L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage2 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        userImageDAOImpl0.delete(userImage2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = collectionDAOImpl0.findAll();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.lockUser((long) (short) 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.Query query3 = imageDAOImpl0.createQuery("/users/admin/{start}/{count}");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory2 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        collectionCategoryDAOImpl0.create(collectionCategory2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.update(user1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = collectionImageDAOImpl0.findBy((java.lang.Long) 100L, (java.lang.Long) 0L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage3 = userImageDAOImpl0.getPhotographImages(user1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage6 = userImageDAOImpl0.getPhotographImages(user2, (int) (byte) 0, 10000);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        imageManagerImpl0.deleteAll();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getShowcaseByUser((java.lang.Long) 10L, 0, (int) (byte) 100);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        java.lang.String str3 = image1.getMobileThumbPath();
        imageManagerImpl0.create(image1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage5 = userImageDAOImpl0.getPhotographImage(user1, (java.lang.Long) (-1L));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory2 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        collectionCategoryDAOImpl0.delete(collectionCategory2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage1 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image2.setCreatedBy("");
        collectionImage1.setImage(image2);
        de.htw.sdf.photoplatform.persistence.model.Image image6 = collectionImage1.getImage();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage7 = collectionImageDAOImpl0.update(collectionImage1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage5 = userImageDAOImpl0.getPhotographImage(user1, (java.lang.Long) 1L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Category> list_category1 = categoryDAOImpl0.findAll();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array8 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long9 = new java.util.ArrayList<java.lang.Long>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long9, long_array8);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long9);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionImage> list_collectionImage12 = photographerManagerImpl0.addImagesToCollection((java.lang.Long) (-1L), (java.lang.Long) (-1L), (java.util.List<java.lang.Long>) arraylist_long9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        java.lang.String str3 = image1.getMobileThumbPath();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = imageManagerImpl0.update(image1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.makeAdmin((-1L));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = imageManagerImpl0.findById((long) (short) 100);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteImage((java.lang.Long) 10L, (java.lang.Long) 0L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Long[] long_array6 = new java.lang.Long[] { (-1L), 10L, 10L };
        java.util.ArrayList<java.lang.Long> arraylist_long7 = new java.util.ArrayList<java.lang.Long>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long7, long_array6);
        java.lang.Boolean b9 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 1L, (java.lang.Long) 1L, (java.util.List<java.lang.Long>) arraylist_long7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.persistence.model.User user1 = userController0.getAuthenticatedUser();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        user0.setEnabled(false);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole3 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role4 = userRole3.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role5 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole3.setRole(role5);
        de.htw.sdf.photoplatform.persistence.model.User user7 = userRole3.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user8 = userRole3.getUser();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole9 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role10 = userRole9.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role11 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole9.setRole(role11);
        de.htw.sdf.photoplatform.persistence.model.User user13 = userRole9.getUser();
        de.htw.sdf.photoplatform.persistence.model.User user14 = userRole9.getUser();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole15 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role16 = userRole15.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role17 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole15.setRole(role17);
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole19 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role20 = userRole19.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role21 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole19.setRole(role21);
        de.htw.sdf.photoplatform.persistence.model.UserRole[] userRole_array23 = new de.htw.sdf.photoplatform.persistence.model.UserRole[] { userRole3, userRole9, userRole15, userRole19 };
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserRole> arraylist_userRole24 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.UserRole>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.UserRole>) arraylist_userRole24, userRole_array23);
        user0.setUserRoles((java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole>) arraylist_userRole24);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on userRole9 and userRole3.", userRole9.equals(userRole3) == userRole3.equals(userRole9));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl collectionManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionManagerImpl0.getCollectionImages((java.lang.Long) 0L, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        boolean b4 = user1.isAccountNonLocked();
        java.lang.Boolean b5 = userManagerImpl0.isUserAdmin(user1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        categoryDAOImpl0.deleteById((long) (byte) -1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.Query query3 = collectionImageDAOImpl0.createQuery("/photographer/upload");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = collectionDAOImpl0.findById((java.lang.Long) 1L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole2 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        userRoleDAOImpl0.delete(userRole2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        collectionDAOImpl0.deleteAll();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        categoryManagerImpl0.deleteAll();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        collectionCategoryDAOImpl0.deleteAll();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        de.htw.sdf.photoplatform.persistence.model.User user5 = userManagerImpl0.update(user2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection5 = collectionDAOImpl0.findCollectionsByUser((long) 10001, (int) (short) -1, 10000, (java.lang.Boolean) false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        java.lang.String str3 = image1.getMobileThumbPath();
        image1.setMetaData("/user/makeadmin/{id}");
        java.lang.String str6 = image1.getCreatedBy();
        imageDAOImpl0.create(image1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        java.lang.String str3 = photographerController0.deleteImageFromCollection((java.lang.Long) 10L, (java.lang.Long) (-1L));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole3 = userRoleDAOImpl0.findByUserAndRoleId((java.lang.Long) 100L, (java.lang.Long) 10L);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = userRole1.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role3 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole1.setRole(role3);
        de.htw.sdf.photoplatform.persistence.model.User user5 = userRole1.getUser();
        userRoleDAOImpl0.create(userRole1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        boolean b8 = userManagerImpl0.becomePhotographer((long) 1, "/user/login", "/photographer/images", "/user/becomePhotographer", "/users/admin/{start}/{count}", "ROLE_BECOME_PHOTOGRAPHER", "/collections/{collectionId}");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.lockUser(100L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        userRoleDAOImpl0.delete(userRole1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage2 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image3.setCreatedBy("");
        collectionImage2.setImage(image3);
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = collectionImage2.getCollection();
        collectionImageDAOImpl0.create(collectionImage2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.find((java.lang.Integer) 0, (java.lang.Integer) 100);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        java.lang.String str4 = image1.toString();
        de.htw.sdf.photoplatform.persistence.model.Image image5 = imageManagerImpl0.update(image1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        boolean b4 = user1.isAccountNonLocked();
        java.lang.Boolean b6 = userManagerImpl0.isRoleIncluded(user1, "/collections/photographers/{start}/{count}");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage3 = userImageDAOImpl0.findOne(100L);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage2 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image3.setCreatedBy("");
        collectionImage2.setImage(image3);
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = collectionImage2.getCollection();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage8 = collectionImageDAOImpl0.update(collectionImage2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = roleDAOImpl0.findByName("/photographer/upload");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        de.htw.sdf.photoplatform.webservice.controller.ImageController imageController0 = new de.htw.sdf.photoplatform.webservice.controller.ImageController();
        org.springframework.web.multipart.MultipartFile[] multipartFile_array1 = new org.springframework.web.multipart.MultipartFile[] {};
        java.lang.String str2 = imageController0.handleImageUpload(multipartFile_array1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        roleDAOImpl0.deleteById((long) (short) 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.enablePhotographer((long) 10000);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) (-1L), 404, (int) (byte) 100);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        userImageDAOImpl0.deleteById((long) 10001);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory1 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        collectionCategoryDAOImpl0.delete(collectionCategory1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionImage0.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Image image6 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str7 = image6.toString();
        java.lang.String str8 = image6.toString();
        collectionImage0.setImage(image6);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on image6, image1, and image1.", !(image6.equals(image1) && image1.equals(image1)) || image6.equals(image1));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole0.setRole(role2);
        de.htw.sdf.photoplatform.persistence.model.User user4 = userRole0.getUser();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role6 = userRole5.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role7 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole5.setRole(role7);
        userRole0.setRole(role7);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on role7, role2, and role2.", !(role7.equals(role2) && role2.equals(role2)) || role7.equals(role2));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        collectionDAOImpl0.deleteById(0L);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        user0.setPassword("ROLE_PHOTOGRAPHER");
        boolean b5 = user0.isRoleIncluded("/user/becomePhotographer");
        de.htw.sdf.photoplatform.persistence.model.User user6 = new de.htw.sdf.photoplatform.persistence.model.User();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole7 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user8 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b9 = user8.isPhotographer();
        userRole7.setUser(user8);
        user8.setUsername("/api");
        boolean b13 = user8.isAccountNonLocked();
        de.htw.sdf.photoplatform.persistence.model.User[] user_array14 = new de.htw.sdf.photoplatform.persistence.model.User[] { user0, user6, user8 };
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.User> arraylist_user15 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.User>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.User>) arraylist_user15, user_array14);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.UserData> list_userData17 = de.htw.sdf.photoplatform.webservice.util.UserUtility.convertToUserData((java.util.List<de.htw.sdf.photoplatform.persistence.model.User>) arraylist_user15);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        userRoleDAOImpl0.deleteById((long) 10000);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage5 = userImageDAOImpl0.getPhotographImages(user1, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setUsername("/api");
        boolean b7 = user2.isAccountNonLocked();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage8 = userImageDAOImpl0.getPhotographImages(user2);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.find((java.lang.Integer) 11002, (java.lang.Integer) 10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Role> list_role1 = roleDAOImpl0.findAll();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        java.lang.Boolean b5 = userManagerImpl0.isUserAdmin(user2);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findByName("/users/becomephotographers");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection5 = collectionDAOImpl0.findCollectionsByUser((long) (short) 1, 11002, 100, (java.lang.Boolean) true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        java.lang.String str2 = photographerController0.deleteCollection((java.lang.Long) 1L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection5 = collectionDAOImpl0.findCollectionsByUser((long) 'a', (int) ' ', (int) (byte) 1, (java.lang.Boolean) true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role1.setName("ROLE_CUSTOMER");
        de.htw.sdf.photoplatform.persistence.model.Role role4 = roleDAOImpl0.update(role1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        java.lang.String str3 = photographerController0.deleteImageFromCollection((java.lang.Long) 1L, (java.lang.Long) 10L);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage7 = imageManagerImpl0.getPhotographImages(user1, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findById((long) (short) 10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Role> list_role3 = roleDAOImpl0.findAll();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.checkUserPermissions("/users/changepassword");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        boolean b4 = user0.isCredentialsNonExpired();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData5 = new de.htw.sdf.photoplatform.webservice.dto.UserData(user0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = photographerManagerImpl0.getCollectionById(0L);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.getByRoleAndEnabled("ROLE_ADMIN", true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        roleDAOImpl0.deleteAll();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole2 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role3 = userRole2.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role4 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole2.setRole(role4);
        de.htw.sdf.photoplatform.persistence.model.Role role6 = roleDAOImpl0.update(role4);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Role> list_role2 = roleDAOImpl0.findAll();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage3 = userImageDAOImpl0.getOwnerImages((long) (-1), (java.lang.Long) 1L);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.Query query3 = collectionCategoryDAOImpl0.createQuery("/showcase");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        userRoleDAOImpl0.deleteById(100L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        userImageDAOImpl0.deleteById((long) 'a');
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = imageManagerImpl0.findById((long) '#');
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.isSigned("/users/update");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.Boolean b3 = userManagerImpl0.isUserAdmin(user1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = new de.htw.sdf.photoplatform.webservice.dto.UserData(user0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage5 = userImageDAOImpl0.getOwnerImages(0L, (java.lang.Long) 100L);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.makeAdmin((long) (short) 1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image2 = imageDAOImpl0.findAll();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.Query query3 = categoryDAOImpl0.createQuery("/user/unlock/{id}");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category4 = categoryDAOImpl0.findOne(100L);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Role> list_role3 = roleDAOImpl0.findAllNotAdminRoles();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteImage((java.lang.Long) 100L, (java.lang.Long) 10L);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.Query query2 = userImageDAOImpl0.createQuery("/collections/{collectionId}/images/{imageId}");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = collectionImageDAOImpl0.findOne((long) (byte) 1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.updateCollectionsPublicValue((java.lang.Long) 100L, (java.lang.Long) 10L, (java.lang.Boolean) true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        java.lang.Boolean b6 = userManagerImpl0.isRoleIncluded(user1, "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        userImageDAOImpl0.deleteById((long) 404);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array8 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long9 = new java.util.ArrayList<java.lang.Long>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long9, long_array8);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long9);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionImage> list_collectionImage12 = photographerManagerImpl0.addImagesToCollection((java.lang.Long) 10L, (java.lang.Long) (-1L), (java.util.List<java.lang.Long>) arraylist_long9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryManagerImpl0.findById((long) (byte) 100);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.Query query2 = userImageDAOImpl0.createQuery("/users/update");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = roleDAOImpl0.findByName("");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.getByRoleAndEnabled("/collections/{collectionId}/images", false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        categoryManagerImpl0.create(category1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.Query query3 = categoryDAOImpl0.createQuery("obfuscate");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getCollectionByUser((long) (short) -1, 1, 11003);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        java.lang.String str3 = photographerController0.deleteImageFromCollection((java.lang.Long) (-1L), (java.lang.Long) (-1L));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        categoryManagerImpl0.delete(category1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.Query query2 = categoryDAOImpl0.createQuery("");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage5 = userImageDAOImpl0.getOwnerImages((long) (short) -1, (java.lang.Long) 100L);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findByName("/collections/{collectionId}/images/{imageId}");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findByName("/users/profile/{userId}");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection5 = collectionDAOImpl0.findCollectionsByUser((long) (short) 10, (int) 'a', (int) (byte) 100, (java.lang.Boolean) true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        de.htw.sdf.photoplatform.persistence.model.Category category4 = categoryManagerImpl0.update(category1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category3 = categoryDAOImpl0.findOne((long) 11002);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory3 = collectionCategoryDAOImpl0.findOne((long) '4');
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage2 = userImageDAOImpl0.findOne(10L);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = photographerManagerImpl0.addImageToCollection((java.lang.Long) (-1L), (java.lang.Long) 0L, (java.lang.Long) 1L);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        collectionDAOImpl0.deleteById((long) 1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.Query query3 = categoryDAOImpl0.createQuery("/collections/create");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection5 = collectionDAOImpl0.findCollectionsByUser((long) 400, (int) (byte) -1, 0, (java.lang.Boolean) true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteCollection((java.lang.Long) 10L, (java.lang.Long) 0L);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole4 = userRoleDAOImpl0.findByUserAndRoleId((java.lang.Long) (-1L), (java.lang.Long) 10L);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.checkUserPermissions("/user/enablephotographer");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage2 = collectionImageDAOImpl0.findOne((long) (short) 100);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.find((java.lang.Integer) 400, (java.lang.Integer) 10001);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        categoryDAOImpl0.deleteById((long) 11004);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user2 = userDAOImpl0.findByAccountLocked(false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        categoryDAOImpl0.deleteById((long) 100);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.Query query2 = userImageDAOImpl0.createQuery("/showcase");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.lockUser((long) (short) 100);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        javax.persistence.Query query2 = userDAOImpl0.createQuery("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = photographerManagerImpl0.getCollectionById((java.lang.Long) 0L);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.Query query4 = collectionCategoryDAOImpl0.createQuery("/users/changepassword");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category4 = categoryDAOImpl0.findByName("/photographer/images/{imageId}");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryManagerImpl0.findById(0L);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        java.lang.String str5 = user2.getSecToken();
        java.lang.Boolean b7 = userManagerImpl0.isRoleIncluded(user2, "/users/update");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryManagerImpl0.findById((long) 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.isSigned("/photographer/images/{imageId}");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category3 = categoryDAOImpl0.findOne((long) '4');
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = photographerManagerImpl0.createCollection((java.lang.Long) (-1L), "/photographer/images/{imageId}", "/user/lock/{id}");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getShowcaseByUser((java.lang.Long) 1L, (int) '4', 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteImage((java.lang.Long) 100L, (java.lang.Long) 0L);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        categoryDAOImpl0.deleteById(100L);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userDAOImpl0.findByEmail("/collections/addimage");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getCollectionByUser((long) (byte) 0, 0, (int) (short) 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        userImageDAOImpl0.deleteAll();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setPassword("ROLE_PHOTOGRAPHER");
        boolean b6 = user1.isRoleIncluded("/user/becomePhotographer");
        boolean b7 = user1.isCredentialsNonExpired();
        de.htw.sdf.photoplatform.persistence.model.Image image8 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData9 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image8);
        image8.setSmallThumbPath("/photographer/upload");
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage12 = photographerManagerImpl0.createPhotographImage(user1, image8);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage5 = userImageDAOImpl0.findOne((long) 10000);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.unlockUser((long) (byte) 0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = roleDAOImpl0.findOne(0L);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user1 = userDAOImpl0.findAllNotAdminUsers();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection3 = collectionDAOImpl0.findByUserAndCollectionId((long) ' ', (long) 10001);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category2.setName("/user/enablephotographer");
        category2.setName("hi!");
        categoryDAOImpl0.create(category2);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = roleDAOImpl0.findByName("ROLE_BECOME_PHOTOGRAPHER");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.checkUserPermissions("de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        userImageDAOImpl0.deleteById((long) (short) 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userDAOImpl0.findById((java.lang.Long) (-1L));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getShowcaseByUser((java.lang.Long) 100L, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Category> list_category3 = categoryDAOImpl0.findAll();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        de.htw.sdf.photoplatform.webservice.controller.CollectionController collectionController0 = new de.htw.sdf.photoplatform.webservice.controller.CollectionController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData4 = collectionController0.getCollectionsImages((java.lang.Long) 0L, 404, (int) (byte) 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = imageManagerImpl0.findById((long) (byte) 100);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        de.htw.sdf.photoplatform.webservice.controller.CollectionController collectionController0 = new de.htw.sdf.photoplatform.webservice.controller.CollectionController();
        de.htw.sdf.photoplatform.persistence.model.User user1 = collectionController0.getAuthenticatedUser();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
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
        de.htw.sdf.photoplatform.persistence.model.User user11 = null;
        userRole0.setUser(user11);
        de.htw.sdf.photoplatform.persistence.model.User user13 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b14 = user13.isAdmin();
        user13.setPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        userRole0.setUser(user13);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on user13, user6, and user6.", !(user13.equals(user6) && user6.equals(user6)) || user13.equals(user6));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
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
        de.htw.sdf.photoplatform.persistence.model.User user11 = null;
        userRole0.setUser(user11);
        de.htw.sdf.photoplatform.persistence.model.Role role13 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.User user14 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b15 = user14.isAdmin();
        java.lang.String str16 = user14.getSecToken();
        boolean b17 = user14.isAccountNonLocked();
        boolean b18 = user14.isCredentialsNonExpired();
        boolean b19 = user14.isCredentialsNonExpired();
        userRole0.setUser(user14);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on user14, user6, and user6.", !(user14.equals(user6) && user6.equals(user6)) || user14.equals(user6));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.find((java.lang.Integer) (-1), (java.lang.Integer) 100);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Role role4 = roleDAOImpl0.findOne(100L);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = imageManagerImpl0.findById((long) ' ');
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.unlockUser((long) '#');
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteCollection((java.lang.Long) 10L, (java.lang.Long) (-1L));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteImage((java.lang.Long) 0L, (java.lang.Long) (-1L));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData2 = userController0.getUserProfileData("/user/becomePhotographer");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setPassword("ROLE_PHOTOGRAPHER");
        java.lang.Boolean b6 = userManagerImpl0.isRoleIncluded(user1, "null:1528137250344:31149e863206f62132f4465a1c878d2c");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userImageDAOImpl0.getEntityManager();
        userImageDAOImpl0.deleteAll();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category2.setName("/user/enablephotographer");
        category2.setName("hi!");
        de.htw.sdf.photoplatform.persistence.model.Category category7 = categoryDAOImpl0.update(category2);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 100L, (java.lang.Long) (-1L), (java.lang.Long) 100L);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        userImageDAOImpl0.deleteAll();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userImageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage4 = userImageDAOImpl0.findAll();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = collectionImageDAOImpl0.findBy((java.lang.Long) 10L, (java.lang.Long) 10L);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage3 = userImageDAOImpl0.findOne(0L);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.lockUser((long) 100);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage2 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) (-1L));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        java.lang.String str3 = user1.getSecToken();
        boolean b4 = user1.isAccountNonLocked();
        boolean b5 = user1.isCredentialsNonExpired();
        boolean b6 = user1.isCredentialsNonExpired();
        java.lang.String str7 = user1.getPassword();
        boolean b8 = user1.isEnabled();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage11 = imageManagerImpl0.getPhotographImages(user1, 1, 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryDAOImpl0.findOne((-1L));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage2 = userImageDAOImpl0.findAll();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        de.htw.sdf.photoplatform.persistence.model.User user1 = authorizationController0.getAuthenticatedUser();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.Query query2 = imageDAOImpl0.createQuery("de.htw.sdf.photoplatform.persistence.model.User [ID=null]");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setAccountNonLocked(true);
        java.lang.Boolean b8 = userManagerImpl0.isRoleIncluded(user2, "ROLE_CUSTOMER");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        collectionImageDAOImpl0.deleteById((long) 10002);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionImage> list_collectionImage3 = collectionImageDAOImpl0.findAll();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteCollection((java.lang.Long) 0L, (java.lang.Long) 10L);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryManagerImpl0.update(category1);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> list_collectionCategory3 = collectionCategoryDAOImpl0.findAll();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        java.lang.String str2 = photographerController0.deleteCollection((java.lang.Long) 0L);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        roleDAOImpl0.deleteById((long) (short) 1);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage5 = collectionImageDAOImpl0.findBy((java.lang.Long) 100L, (java.lang.Long) 1L);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userDAOImpl0.findByRoleAndEnabledFilter("/user/login", true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        roleDAOImpl0.deleteById((long) (byte) 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        java.lang.String str3 = image1.getSmallThumbPath();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = imageManagerImpl0.update(image1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image4.setCreatedBy("");
        collectionImage3.setImage(image4);
        de.htw.sdf.photoplatform.persistence.model.Image image8 = collectionImage3.getImage();
        java.util.Date date9 = collectionImage3.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage10 = collectionImageDAOImpl0.update(collectionImage3);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = collectionImageDAOImpl0.findOne(0L);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
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
        java.lang.String str12 = role11.getName();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user13 = userDAOImpl0.findByRole(role11);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = photographerManagerImpl0.getCollectionById((java.lang.Long) 1L);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category4 = categoryDAOImpl0.findOne((long) (byte) 10);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = userRole0.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole0.setRole(role2);
        de.htw.sdf.photoplatform.persistence.model.User user4 = userRole0.getUser();
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
        userRole0.setRole(role15);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on role15 and role2.", role15.equals(role2) == role2.equals(role15));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        roleDAOImpl0.deleteById((long) (byte) 1);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage4 = photographerManagerImpl0.addImageToCollection((java.lang.Long) 100L, (java.lang.Long) 0L, (java.lang.Long) 0L);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        categoryDAOImpl0.deleteById((long) (short) 10);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.checkUserPermissions("");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setMobileThumbPath("ROLE_CUSTOMER");
        image1.setCreatedBy("/collections/photographers");
        imageManagerImpl0.create(image1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.unlockUser((long) (short) -1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Image image5 = collectionImage0.getImage();
        java.util.Date date6 = collectionImage0.getUpdatedAt();
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = null;
        collectionImage0.setCollection(collection7);
        de.htw.sdf.photoplatform.persistence.model.Image image9 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str10 = image9.toString();
        java.lang.String str11 = image9.getName();
        collectionImage0.setImage(image9);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on image9, image5, and image5.", !(image9.equals(image5) && image5.equals(image5)) || image9.equals(image5));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory4 = collectionCategoryDAOImpl0.findOne((long) 11004);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection2 = collectionDAOImpl0.findOne(0L);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl collectionManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionManagerImpl0.getCollectionImages((java.lang.Long) 10L, 400, 10000);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        categoryDAOImpl0.deleteById((long) 10000);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryDAOImpl0.findByName("Category{name='/photographer/images/{imageId}'}");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.checkUserPermissions("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        javax.persistence.Query query2 = userDAOImpl0.createQuery("hi!");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        boolean b8 = userManagerImpl0.becomePhotographer((long) 100, "/user/lock/{id}", "/collections/addimage", "Category{name='/photographer/images/{imageId}'}", "Category{name='/photographer/images/{imageId}'}", "/collections/photographers/{start}/{count}", "obfuscate");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        boolean b8 = userManagerImpl0.becomePhotographer((long) (byte) -1, "Image{name='null', path='null', isPublic=false, enabled=false, price=null}", "de.htw.sdf.photoplatform.persistence.model.User [ID=null]", "de.htw.sdf.photoplatform.exception.NotFoundException: ", "obfuscate", "/collections/create", "/collections/update");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setPassword("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/0");
        de.htw.sdf.photoplatform.persistence.model.User user5 = userManagerImpl0.update(user1);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image3 = imageDAOImpl0.findAll();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setUsername("/api");
        java.lang.Boolean b7 = userManagerImpl0.isUserPhotographer(user2);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setName("/photographer/upload");
        de.htw.sdf.photoplatform.persistence.model.User user4 = new de.htw.sdf.photoplatform.persistence.model.User();
        user4.setLastName("/user/unlock/{id}");
        boolean b7 = user4.isPhotographer();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage8 = imageManagerImpl0.addOwnerToImage(image1, user4);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        de.htw.sdf.photoplatform.webservice.controller.UserController userController0 = new de.htw.sdf.photoplatform.webservice.controller.UserController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.UserData> list_userData3 = userController0.getEnabledUsers(404, 100);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole2 = userRoleDAOImpl0.findAll();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole2 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role3 = userRole2.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role4 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole2.setRole(role4);
        roleDAOImpl0.create(role4);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category2.setName("/user/enablephotographer");
        category2.setName("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        categoryDAOImpl0.delete(category2);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        boolean b8 = userManagerImpl0.becomePhotographer(100L, "obfuscate", "de.htw.sdf.photoplatform.exception.NotFoundException: ", "", "/collections/addimage", "/user/makeadmin/{id}", "/collections/{collectionId}/images");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage2 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image3.setCreatedBy("");
        collectionImage2.setImage(image3);
        de.htw.sdf.photoplatform.persistence.model.Image image7 = collectionImage2.getImage();
        collectionImageDAOImpl0.delete(collectionImage2);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory3 = collectionCategoryDAOImpl0.findOne((long) (byte) 10);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        java.lang.String str3 = photographerController0.deleteImageFromCollection((java.lang.Long) 0L, (java.lang.Long) 10L);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setCreationDate();
        user1.setAccountNonLocked(true);
        userDAOImpl0.delete(user1);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryManagerImpl0.findById((long) 11002);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findById((long) 11004);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        collectionCategoryDAOImpl0.deleteById((long) (byte) 10);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user2 = userDAOImpl0.findAll();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Role role1 = roleDAOImpl0.getAdmin();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
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
        de.htw.sdf.photoplatform.security.RequestLoggerInterceptor requestLoggerInterceptor14 = new de.htw.sdf.photoplatform.security.RequestLoggerInterceptor();
        javax.servlet.http.HttpServletRequest httpServletRequest15 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse16 = null;
        de.htw.sdf.photoplatform.exception.NotFoundException notFoundException19 = new de.htw.sdf.photoplatform.exception.NotFoundException("/showcase");
        requestLoggerInterceptor14.afterCompletion(httpServletRequest15, httpServletResponse16, (java.lang.Object) 10, (java.lang.Exception) notFoundException19);
        javax.servlet.http.HttpServletRequest httpServletRequest21 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse22 = null;
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage23 = new de.htw.sdf.photoplatform.persistence.model.UserImage();
        org.springframework.web.servlet.ModelAndView modelAndView24 = null;
        requestLoggerInterceptor14.postHandle(httpServletRequest21, httpServletResponse22, (java.lang.Object) userImage23, modelAndView24);
        de.htw.sdf.photoplatform.persistence.model.Image image26 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str27 = image26.getMime();
        java.lang.String str28 = image26.getUpdatedBy();
        java.lang.String str29 = image26.getSmallThumbPath();
        image26.setCreatedBy("/collections/addimage");
        image26.setEnabled(true);
        userImage23.setImage(image26);
        de.htw.sdf.photoplatform.persistence.model.User user35 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b36 = user35.isAdmin();
        user35.setPassword("ROLE_PHOTOGRAPHER");
        boolean b40 = user35.isRoleIncluded("/user/becomePhotographer");
        boolean b41 = user35.isCredentialsNonExpired();
        userImage23.setUser(user35);
        java.lang.String str43 = user35.getLastName();
        userImage9.setUser(user35);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on userImage9, userImage23, and userImage23.", !(userImage9.equals(userImage23) && userImage23.equals(userImage23)) || userImage9.equals(userImage23));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setAccountNonLocked(true);
        boolean b7 = user2.isAccountNonExpired();
        java.lang.String str8 = de.htw.sdf.photoplatform.security.TokenUtils.createToken((org.springframework.security.core.userdetails.UserDetails) user2);
        de.htw.sdf.photoplatform.persistence.model.Image image9 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData10 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image9);
        image9.setCreationDate();
        java.lang.String str12 = image9.getMime();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage13 = photographerManagerImpl0.createPhotographImage(user2, image9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str5 = image4.getMime();
        java.lang.String str6 = image4.getUpdatedBy();
        java.lang.String str7 = image4.getSmallThumbPath();
        image4.setMetaData("/user/becomePhotographer");
        java.lang.String str10 = image4.getUpdatedBy();
        de.htw.sdf.photoplatform.persistence.model.Image image11 = imageDAOImpl0.update(image4);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteImage((java.lang.Long) 0L, (java.lang.Long) 0L);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = roleDAOImpl0.findByName("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("hi!");
        java.lang.String str6 = category1.getDescription();
        categoryManagerImpl0.create(category1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.Query query3 = imageDAOImpl0.createQuery("de.htw.sdf.photoplatform.exception.common.AuthorizationException: Authorization Exception");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.find((java.lang.Integer) 10002, (java.lang.Integer) 0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setPassword("ROLE_PHOTOGRAPHER");
        boolean b6 = user1.isRoleIncluded("/user/becomePhotographer");
        boolean b7 = user1.isCredentialsNonExpired();
        java.lang.Boolean b8 = userManagerImpl0.isUserPhotographer(user1);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image4.setCreatedBy("");
        collectionImage3.setImage(image4);
        de.htw.sdf.photoplatform.persistence.model.Image image8 = collectionImage3.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection9 = collectionImage3.getCollection();
        collectionImageDAOImpl0.delete(collectionImage3);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Role role2 = roleDAOImpl0.getAdmin();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user2 = userDAOImpl0.findByRoleId((java.lang.Long) (-1L));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isAdmin();
        java.lang.String str4 = user2.getSecToken();
        boolean b5 = user2.isAccountNonLocked();
        user2.setSecToken("");
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage8 = userImageDAOImpl0.getUserImagesBy(user2);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteCollection((java.lang.Long) (-1L), (java.lang.Long) (-1L));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        java.lang.String str3 = image1.getUpdatedBy();
        java.lang.String str4 = image1.getSmallThumbPath();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData5 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image1);
        image1.setPublic(true);
        imageManagerImpl0.delete(image1);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        userDAOImpl0.deleteAll();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str2 = image1.getMime();
        imageManagerImpl0.delete(image1);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isBecomePhotographer();
        user1.setFirstName("/index.html");
        boolean b5 = user1.isAccountNonLocked();
        userManagerImpl0.delete(user1);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData3 = photographerController0.getCollections(10001, 400);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user4 = userDAOImpl0.findOne(0L);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.Query query2 = imageDAOImpl0.createQuery("/collections/photographers");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        image1.setThumbPath("/users/admin/{start}/{count}");
        image1.setUpdatedBy("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        java.lang.String str8 = image1.getDescription();
        imageDAOImpl0.delete(image1);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userImageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage6 = userImageDAOImpl0.getOwnerImages((long) 0, (java.lang.Long) 10L);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getShowcaseByUser((java.lang.Long) 0L, 100, (int) '4');
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array8 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long9 = new java.util.ArrayList<java.lang.Long>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long9, long_array8);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long9);
        collectionData3.setName("/user/login");
        java.lang.String str14 = collectionData3.getDescription();
        java.util.List<java.lang.Long> list_long15 = collectionData3.getImageIds();
        java.lang.Boolean b16 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 10L, (java.lang.Long) 0L, list_long15);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage0 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setCreatedBy("");
        collectionImage0.setImage(image1);
        de.htw.sdf.photoplatform.persistence.model.Collection collection5 = collectionImage0.getCollection();
        de.htw.sdf.photoplatform.persistence.model.Collection collection6 = null;
        collectionImage0.setCollection(collection6);
        de.htw.sdf.photoplatform.persistence.model.Image image8 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str9 = image8.toString();
        image8.setThumbPath("/user/makeadmin/{id}");
        boolean b12 = image8.isEnabled();
        collectionImage0.setImage(image8);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on image8, image1, and image1.", !(image8.equals(image1) && image1.equals(image1)) || image8.equals(image1));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData3 = photographerController0.getCollections((int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        de.htw.sdf.photoplatform.persistence.model.Collection collection0 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array2 = new de.htw.sdf.photoplatform.persistence.model.Collection[] { collection0, collection1 };
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection3 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3, collection_array2);
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.CollectionData> list_collectionData6 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToCollectionData((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection3, (java.lang.Boolean) true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        de.htw.sdf.photoplatform.webservice.controller.PhotographerController photographerController0 = new de.htw.sdf.photoplatform.webservice.controller.PhotographerController();
        de.htw.sdf.photoplatform.persistence.model.User user1 = photographerController0.getAuthenticatedUser();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.updateCollectionsPublicValue((java.lang.Long) (-1L), (java.lang.Long) 100L, (java.lang.Boolean) false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        userManagerImpl0.registerUser("Category{name='/photographer/images/{imageId}'}", "/user/{name}", "/user/unlock/{id}", "");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array8 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long9 = new java.util.ArrayList<java.lang.Long>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long9, long_array8);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long9);
        java.lang.Boolean b12 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 1L, (java.lang.Long) 0L, (java.util.List<java.lang.Long>) arraylist_long9);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteCollection((java.lang.Long) (-1L), (java.lang.Long) 10L);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getShowcaseByUser((java.lang.Long) 0L, (int) '#', 0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.find((java.lang.Integer) 10002, (java.lang.Integer) 100);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage3 = userImageDAOImpl0.findAll();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        org.springframework.security.core.userdetails.UserDetails userDetails3 = userDAOImpl0.loadUserByUsername("Category{name='null'}");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.isSigned("/user/unlock/{id}");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.getByRoleAndEnabled("/user/{name}", true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.Query query2 = userImageDAOImpl0.createQuery("/user/lock/{id}");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category1 = new de.htw.sdf.photoplatform.persistence.model.Category();
        category1.setName("/user/enablephotographer");
        category1.setName("hi!");
        categoryManagerImpl0.create(category1);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setUsername("/api");
        java.lang.String str7 = user2.getFirstName();
        java.lang.Boolean b9 = userManagerImpl0.isRoleIncluded(user2, "/user/{name}");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user4 = userDAOImpl0.findByEnabled(true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.find((java.lang.Integer) 404, (java.lang.Integer) (-1));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage5 = imageManagerImpl0.getPhotographImages(user1, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getCollectionByUser((long) 11004, (int) ' ', (int) ' ');
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData1 = new de.htw.sdf.photoplatform.webservice.dto.UserData(user0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionCategoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionCategoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory4 = collectionCategoryDAOImpl0.findOne((long) '#');
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isEnabled();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage5 = imageManagerImpl0.getPhotographImages(user1, 404, 11004);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isAdmin();
        java.lang.String str2 = user0.getSecToken();
        boolean b3 = user0.isAccountNonLocked();
        boolean b4 = user0.isAccountNonLocked();
        de.htw.sdf.photoplatform.webservice.dto.UserData userData5 = new de.htw.sdf.photoplatform.webservice.dto.UserData(user0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = imageDAOImpl0.getEntityManager();
        imageDAOImpl0.deleteById((long) 10002);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        de.htw.sdf.photoplatform.persistence.model.PhotographerData photographerData0 = new de.htw.sdf.photoplatform.persistence.model.PhotographerData();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection1 = photographerData0.getCollections();
        photographerData0.setCompany("/collections/showcase");
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user5 = collection4.getUser();
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
        de.htw.sdf.photoplatform.persistence.model.Collection[] collection_array16 = new de.htw.sdf.photoplatform.persistence.model.Collection[] { collection4, collection13 };
        java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection> arraylist_collection17 = new java.util.ArrayList<de.htw.sdf.photoplatform.persistence.model.Collection>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection17, collection_array16);
        photographerData0.setCollections((java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection>) arraylist_collection17);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection4 and collection13.", collection4.equals(collection13) == collection13.equals(collection4));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        userDAOImpl0.deleteAll();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category3 = categoryDAOImpl0.findByName("null:1528137248666:32ad08d7594d28504f1460b47d9ec391");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole0 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        userRole0.setUser(user1);
        java.lang.String str4 = userRole0.getUpdatedBy();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole5 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.Role role6 = userRole5.getRole();
        de.htw.sdf.photoplatform.persistence.model.Role role7 = new de.htw.sdf.photoplatform.persistence.model.Role();
        userRole5.setRole(role7);
        de.htw.sdf.photoplatform.persistence.model.Role role9 = userRole5.getRole();
        userRole0.setRole(role9);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on userRole0, userRole5, and userRole5.", !(userRole0.equals(userRole5) && userRole5.equals(userRole5)) || userRole0.equals(userRole5));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 10L, (int) ' ', 10);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        javax.persistence.Query query4 = userImageDAOImpl0.createQuery("/users/update");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        boolean b8 = userManagerImpl0.becomePhotographer((long) 11004, "", "/photographer/images/{imageId}", "/user/becomePhotographer", "/collections/{collectionId}/images", "/collections/photographers/{start}/{count}", "39c73479cb767c5a09248b3313c03447");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.isSigned("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage4 = userImageDAOImpl0.getOwnerImages((long) 11002, (java.lang.Long) 100L);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
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
        de.htw.sdf.photoplatform.persistence.model.Role role12 = userRole1.getRole();
        userRoleDAOImpl0.delete(userRole1);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.getByRoleAndEnabled("Category{name='/photographer/images/{imageId}'}", false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        userImageDAOImpl0.deleteAll();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user2 = collection1.getUser();
        java.lang.String str3 = collection1.getName();
        de.htw.sdf.photoplatform.persistence.model.Collection collection4 = photographerManagerImpl0.update(collection1);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        de.htw.sdf.photoplatform.persistence.model.User user3 = userDAOImpl0.findById((java.lang.Long) 0L);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image1 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image1.setMobileThumbPath("ROLE_CUSTOMER");
        image1.setSmallThumbPath("");
        imageManagerImpl0.delete(image1);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user4 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b5 = user4.isAdmin();
        java.lang.String str6 = user4.getSecToken();
        boolean b7 = user4.isAccountNonLocked();
        boolean b8 = user4.isCredentialsNonExpired();
        de.htw.sdf.photoplatform.persistence.model.User user9 = userDAOImpl0.update(user4);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 100L, (java.lang.Long) 0L, (java.lang.Long) 1L);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryManagerImpl0.findById((long) ' ');
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
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
        roleDAOImpl0.create(role13);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getShowcaseByUser((java.lang.Long) 0L, (int) 'a', 0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category3 = categoryDAOImpl0.findOne(1L);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage3 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 0L);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findById((long) ' ');
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isAdmin();
        user1.setCreationDate();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserRole> list_userRole4 = user1.getUserRoles();
        java.lang.Boolean b5 = userManagerImpl0.isUserPhotographer(user1);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.Query query6 = userDAOImpl0.createQuery("/collections/showcase");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user3 = userManagerImpl0.getByRoleAndEnabled("hi!", true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = categoryDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category5 = categoryDAOImpl0.findOne((long) (short) 1);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage3 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 100L);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl collectionCategoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionCategoryDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory1 = new de.htw.sdf.photoplatform.persistence.model.CollectionCategory();
        de.htw.sdf.photoplatform.persistence.model.CollectionCategory collectionCategory2 = collectionCategoryDAOImpl0.update(collectionCategory1);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        javax.persistence.Query query4 = roleDAOImpl0.createQuery("/user/{name}");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b2 = user1.isPhotographer();
        java.lang.Boolean b4 = userManagerImpl0.isRoleIncluded(user1, "/photographer/images");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl categoryManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CategoryManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = categoryManagerImpl0.findById((-1L));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.isSigned("More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10001");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        de.htw.sdf.photoplatform.persistence.model.User user0 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b1 = user0.isBecomePhotographer();
        user0.setUsername("ROLE_BECOME_PHOTOGRAPHER");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData4 = new de.htw.sdf.photoplatform.webservice.dto.UserData(user0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl userRoleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserRoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = userRoleDAOImpl0.getEntityManager();
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
        userRoleDAOImpl0.create(userRole2);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Role role3 = new de.htw.sdf.photoplatform.persistence.model.Role();
        role3.setName("ROLE_CUSTOMER");
        java.lang.String str6 = role3.getName();
        roleDAOImpl0.create(role3);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.updateCollectionsPublicValue((java.lang.Long) 10L, (java.lang.Long) (-1L), (java.lang.Boolean) false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole1 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user2 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b3 = user2.isPhotographer();
        userRole1.setUser(user2);
        user2.setUsername("/api");
        user2.setUsername("726c6482531e2ac940aeb747a2e71a43a398a298aca499f8fec2de6e9bdff4c14edee17da84394b17d4bfcee458d9a0ceb25db7ce578bc41cf91a12d2b8e443c");
        boolean b9 = user2.isPhotographer();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.UserImage> list_userImage12 = imageManagerImpl0.getPhotographImages(user2, 10001, (int) (byte) 10);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        userManagerImpl0.registerUser("/user/makeadmin/{id}", "ROLE_BECOME_PHOTOGRAPHER", "More info: http://wiki-sdf.f4.htw-berlin.de/wiki/API/10000", "/user/lock/{id}");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) (-1L), (java.lang.Long) 1L, (java.lang.Long) 10L);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl collectionManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionManagerImpl0.getCollectionImages((java.lang.Long) (-1L), (int) '#', 10001);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.updateCollectionsPublicValue((java.lang.Long) (-1L), (java.lang.Long) 0L, (java.lang.Boolean) true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Collection collection1 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        de.htw.sdf.photoplatform.persistence.model.User user2 = collection1.getUser();
        boolean b3 = collection1.isPublic();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory4 = collection1.getCollectionCategories();
        photographerManagerImpl0.delete(collection1);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user2 = userDAOImpl0.findAllNotAdminUsers();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.unlockUser((long) (short) 0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findById((long) 10);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl collectionManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.CollectionManagerImpl();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage4 = collectionManagerImpl0.getCollectionImages((java.lang.Long) (-1L), 10000, (int) '4');
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.Query query5 = imageDAOImpl0.createQuery("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_CUSTOMER");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        userDAOImpl0.deleteAll();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.updateCollectionsPublicValue((java.lang.Long) 0L, (java.lang.Long) (-1L), (java.lang.Boolean) false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.User user4 = userDAOImpl0.findOne((long) 100);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        collectionImageDAOImpl0.deleteById(0L);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.findById(10L);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.enablePhotographer((long) (short) 100);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.lockUser((long) (short) 10);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        imageDAOImpl0.deleteAll();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user6 = userDAOImpl0.findByRoleId((java.lang.Long) 0L);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Collection> list_collection4 = photographerManagerImpl0.getCollectionByUser((long) (-1), 10000, (int) (byte) 10);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user1 = new de.htw.sdf.photoplatform.persistence.model.User();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str3 = image2.getMime();
        java.lang.String str4 = image2.getMobileThumbPath();
        image2.setMetaData("/user/makeadmin/{id}");
        java.lang.String str7 = image2.toString();
        java.lang.String str8 = image2.getName();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage9 = photographerManagerImpl0.createPhotographImage(user1, image2);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionDAOImpl0.getEntityManager();
        javax.persistence.Query query4 = collectionDAOImpl0.createQuery("null:1528137250344:31149e863206f62132f4465a1c878d2c");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        javax.persistence.EntityManager entityManager1 = categoryDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.Category category2 = new de.htw.sdf.photoplatform.persistence.model.Category();
        java.lang.String str3 = category2.toString();
        java.lang.String str4 = category2.getName();
        categoryDAOImpl0.delete(category2);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
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
        de.htw.sdf.photoplatform.persistence.model.Image image20 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str21 = image20.getMime();
        java.lang.String str22 = image20.getUpdatedBy();
        java.lang.String str23 = image20.getSmallThumbPath();
        image20.setCreatedBy("/collections/addimage");
        java.lang.Long long26 = image20.getId();
        image20.setMobileThumbPath("/collections/{collectionId}");
        org.springframework.web.servlet.ModelAndView modelAndView29 = null;
        requestLoggerInterceptor0.postHandle(httpServletRequest18, httpServletResponse19, (java.lang.Object) "/collections/{collectionId}", modelAndView29);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on image10 and image20.", image10.equals(image20) == image20.equals(image10));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl categoryDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CategoryDAOImpl();
        categoryDAOImpl0.deleteById((long) 1);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl roleDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.RoleDAOImpl();
        javax.persistence.EntityManager entityManager1 = roleDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = roleDAOImpl0.getEntityManager();
        roleDAOImpl0.deleteAll();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl imageManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.ImageManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = imageManagerImpl0.findById(1L);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = imageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image5 = imageDAOImpl0.findAll();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        de.htw.sdf.photoplatform.manager.impl.UserManagerImpl userManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.UserManagerImpl();
        de.htw.sdf.photoplatform.persistence.model.User user2 = userManagerImpl0.enablePhotographer((long) (byte) 1);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserRole userRole3 = new de.htw.sdf.photoplatform.persistence.model.UserRole();
        de.htw.sdf.photoplatform.persistence.model.User user4 = new de.htw.sdf.photoplatform.persistence.model.User();
        boolean b5 = user4.isPhotographer();
        userRole3.setUser(user4);
        user4.setAccountNonLocked(true);
        user4.setPassword("hi!");
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage12 = userImageDAOImpl0.getPhotographImage(user4, (java.lang.Long) 100L);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b4 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 10L, (java.lang.Long) 100L, (java.lang.Long) 0L);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        java.util.List<de.htw.sdf.photoplatform.persistence.model.Image> list_image4 = imageDAOImpl0.findAll();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage5 = collectionImageDAOImpl0.findBy((java.lang.Long) 1L, (java.lang.Long) 0L);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl imageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.ImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = imageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager4 = imageDAOImpl0.getEntityManager();
        javax.persistence.Query query6 = imageDAOImpl0.createQuery("de.htw.sdf.photoplatform.exception.BadRequestException: ROLE_CUSTOMER");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage2 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image3 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image3.setCreatedBy("");
        collectionImage2.setImage(image3);
        de.htw.sdf.photoplatform.persistence.model.Image image7 = collectionImage2.getImage();
        java.util.Date date8 = collectionImage2.getUpdatedAt();
        collectionImageDAOImpl0.delete(collectionImage2);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = collectionImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage3 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image4.setCreatedBy("");
        image4.setThumbPath("/users/admin/{start}/{count}");
        image4.setUpdatedBy("Image{name='null', path='null', isPublic=false, enabled=false, price=null}");
        collectionImage3.setImage(image4);
        collectionImageDAOImpl0.create(collectionImage3);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.persistence.model.UserImage userImage3 = userImageDAOImpl0.findOne((long) ' ');
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        java.util.List<de.htw.sdf.photoplatform.persistence.model.User> list_user6 = userDAOImpl0.findByEnabled(false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        de.htw.sdf.photoplatform.repository.impl.UserDAOImpl userDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserDAOImpl();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer1 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        javax.persistence.EntityManager entityManager2 = userDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager3 = userDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.security.XAuthTokenConfigurer xAuthTokenConfigurer4 = new de.htw.sdf.photoplatform.security.XAuthTokenConfigurer((org.springframework.security.core.userdetails.UserDetailsService) userDAOImpl0);
        de.htw.sdf.photoplatform.persistence.model.User user6 = userDAOImpl0.findOne((long) 400);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        de.htw.sdf.photoplatform.webservice.controller.CollectionController collectionController0 = new de.htw.sdf.photoplatform.webservice.controller.CollectionController();
        java.util.List<de.htw.sdf.photoplatform.webservice.dto.ImageData> list_imageData4 = collectionController0.getCollectionsImages((java.lang.Long) 1L, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        de.htw.sdf.photoplatform.persistence.model.Image image0 = new de.htw.sdf.photoplatform.persistence.model.Image();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData1 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData2 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image0);
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData3 = de.htw.sdf.photoplatform.webservice.util.ResourceUtility.convertToImageData(image0);
        de.htw.sdf.photoplatform.persistence.model.Image image4 = new de.htw.sdf.photoplatform.persistence.model.Image();
        java.lang.String str5 = image4.getMime();
        de.htw.sdf.photoplatform.webservice.dto.ImageData imageData6 = new de.htw.sdf.photoplatform.webservice.dto.ImageData(image4);
        imageData6.setMobilePath("/users/update");
        java.lang.String str9 = imageData6.getSmallPath();
        imageData6.setPath("/users/update");
        de.htw.sdf.photoplatform.webservice.dto.UserData userData12 = new de.htw.sdf.photoplatform.webservice.dto.UserData();
        java.lang.Boolean b13 = userData12.isAdmin();
        imageData6.setUserData(userData12);
        java.lang.Long long15 = userData12.getId();
        imageData3.setUserData(userData12);
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on image0 and image4.", image0.equals(image4) == image4.equals(image0));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
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
        de.htw.sdf.photoplatform.persistence.model.Collection collection10 = new de.htw.sdf.photoplatform.persistence.model.Collection();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionCategory> set_collectionCategory11 = null;
        collection10.setCollectionCategories(set_collectionCategory11);
        collectionCategory0.setCollection(collection10);
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on collection10, collection7, and collection7.", !(collection10.equals(collection7) && collection7.equals(collection7)) || collection10.equals(collection7));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl collectionDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionDAOImpl();
        javax.persistence.EntityManager entityManager1 = collectionDAOImpl0.getEntityManager();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData4 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array9 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long10, long_array9);
        collectionData4.setImageIds((java.util.List<java.lang.Long>) arraylist_long10);
        collectionData4.setName("/user/login");
        java.lang.String str15 = collectionData4.getDescription();
        java.util.List<java.lang.Long> list_long16 = collectionData4.getImageIds();
        java.util.Set<de.htw.sdf.photoplatform.persistence.model.CollectionImage> set_collectionImage17 = collectionDAOImpl0.findCollectionImagesBy((java.lang.Long) 10L, (java.lang.Long) 100L, list_long16);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        java.lang.Boolean b3 = photographerManagerImpl0.deleteImage((java.lang.Long) 100L, (java.lang.Long) (-1L));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl userImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.UserImageDAOImpl();
        javax.persistence.EntityManager entityManager1 = userImageDAOImpl0.getEntityManager();
        javax.persistence.EntityManager entityManager2 = userImageDAOImpl0.getEntityManager();
        userImageDAOImpl0.deleteById((long) 10000);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl photographerManagerImpl0 = new de.htw.sdf.photoplatform.manager.impl.PhotographerManagerImpl();
        de.htw.sdf.photoplatform.webservice.dto.CollectionData collectionData3 = new de.htw.sdf.photoplatform.webservice.dto.CollectionData();
        java.lang.Long[] long_array8 = new java.lang.Long[] { (-1L), 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> arraylist_long9 = new java.util.ArrayList<java.lang.Long>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) arraylist_long9, long_array8);
        collectionData3.setImageIds((java.util.List<java.lang.Long>) arraylist_long9);
        java.lang.Boolean b12 = photographerManagerImpl0.deleteImagesFromCollection((java.lang.Long) 100L, (java.lang.Long) 100L, (java.util.List<java.lang.Long>) arraylist_long9);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        de.htw.sdf.photoplatform.webservice.controller.AuthorizationController authorizationController0 = new de.htw.sdf.photoplatform.webservice.controller.AuthorizationController();
        authorizationController0.isSigned("null:1528137250344:31149e863206f62132f4465a1c878d2c");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl collectionImageDAOImpl0 = new de.htw.sdf.photoplatform.repository.impl.CollectionImageDAOImpl();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage1 = new de.htw.sdf.photoplatform.persistence.model.CollectionImage();
        de.htw.sdf.photoplatform.persistence.model.Image image2 = new de.htw.sdf.photoplatform.persistence.model.Image();
        image2.setCreatedBy("");
        collectionImage1.setImage(image2);
        de.htw.sdf.photoplatform.persistence.model.Image image6 = collectionImage1.getImage();
        de.htw.sdf.photoplatform.persistence.model.Collection collection7 = collectionImage1.getCollection();
        de.htw.sdf.photoplatform.persistence.model.CollectionImage collectionImage8 = collectionImageDAOImpl0.update(collectionImage1);
    }
}
