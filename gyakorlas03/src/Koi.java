public class Koi extends Fish {

  public Koi(String name, int weight, String colour) {
    super(name, weight, colour);
  }

  @Override
  public void feed() {
    setWeight(getWeight()+2);
  }
}