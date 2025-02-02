import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @BeforeEach
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @AfterEach
  public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  public void testMyMethod() {
    HelloWorld.myMethod();
    assertEquals("I just got executed!\n", outContent.toString());
  }

  @Test
  public void testMain() {
    HelloWorld.main(null);
    String expectedOutput = "I just got executed!\nI just got executed!\nI just got executed!\n";
    assertEquals(expectedOutput, outContent.toString());
  }
}