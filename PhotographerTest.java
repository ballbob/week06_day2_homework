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
}