public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello World");

    greeting("Mithon Islam");
    texting("Texting Message");
  }

  public static void greeting(String name) {
    System.out.println("Welcome " + name);
  }
  
  public static void texting(String message) {
    System.out.println("Welcome " + message);
  }

}