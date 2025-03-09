public class Cat
{
    public static final int MAX_LIVES = 9;

    private static int CatCount = 0;
    String name;
    int age;
    int livesRemaining;
public void meow(){
    System.out.println("Meow");
  }
  public Cat(){
    CatCount++;
    livesRemaining = MAX_LIVES;
  }

  public static int getCatCount() {
    return CatCount;
  }
}
