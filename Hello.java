public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello World");

    greeting("Mithon Islam");
    texting("Texting Message");
    helloWorld("Hello World...");
  }

  public static void greeting(String names) {
    System.out.println("Welcome " + names);
  }
  
  public static void texting(String message) {
    System.out.println("Welcome " + message);
  }
  public static void helloWorld(String newMessage){
    System.out.println(newMessage);
  }
}