package TheGardenApplication;

public class Plants {
  private String color;
  private int waterLevel;
  private boolean isTree;
  private boolean isThursty;

  Plants(){
  }

  Plants(String color){
    this.color = color;
    this.waterLevel = 10;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(int waterLevel) {
    this.waterLevel = waterLevel;
  }

  public void setPlantsType(boolean isTree) {
    this.isTree = isTree;
  }

  public boolean isTree() {
    return isTree;
  }


  public boolean isThursty() {
    return isThursty;
  }

  public void setThursty(boolean thursty) {
    isThursty = thursty;
  }
}
