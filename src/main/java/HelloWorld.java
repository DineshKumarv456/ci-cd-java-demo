public class HelloWorld {
    public String greet(String name) {
        return "Hi, " + name + "!";
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        System.out.println(hello.greet("Dinesh kumar"));
    }
}
