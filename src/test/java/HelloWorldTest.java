import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    void testGreet() {
        HelloWorld hello = new HelloWorld();
        assertEquals("Hello, John!", hello.greet("John"));
    }
}
