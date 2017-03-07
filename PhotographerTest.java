import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  DigitalCamera digitalcamera;
  AnalogueCamera analoguecamera;

    @Before
    public void before() {
      photographer = new Photographer("Kevin");
      digitalcamera = new DigitalCamera();
      analoguecamera = new AnalogueCamera();
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
     photographer.addCamera(digitalcamera);
     assertEquals(1, photographer.camerasCount());
    }

    @Test
    public void canRemoveCameras(){
      photographer.addCamera(digitalcamera);
      photographer.removeCamera(digitalcamera);
      assertEquals(0,photographer.camerasCount());
    }

}