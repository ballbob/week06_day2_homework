import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  Camera camera;

    @Before
    public void before() {
      photographer = new Photographer("Kevin");
      camera = new Camera();
    }

    @Test 
    public void getName(){
    assertEquals("Kevin", photographer.getName());
    }

    @Test
    public void camerasStartsEmpty(){
      assertEquals(0,photographer.camerasCount());
    }

    @Test
    public void canAddCameras(){
     photographer.addCamera(camera);
     assertEquals(1, photographer.camerasCount());
    }

    @Test
    public void canRemoveCameras(){
      photographer.addCamera(camera);
      photographer.removeCamera(camera);
      assertEquals(0,photographer.camerasCount());
    }
}