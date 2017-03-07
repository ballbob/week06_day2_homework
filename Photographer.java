import java.util.*;

public class Photographer {

  private String name;
  private ArrayList<Camera> cameras;

  public Photographer(String name){
    this.name = name;
    this.cameras = new ArrayList<Camera>();
  }

  public String getName(){
    return this.name;
  }

  public int camerasCount(){
    return cameras.size();
  }

  public void addCamera(Camera camera){
    cameras.add(camera);
  }

  public void removeCamera(Camera camera){
    cameras.remove(camera);
  }

}