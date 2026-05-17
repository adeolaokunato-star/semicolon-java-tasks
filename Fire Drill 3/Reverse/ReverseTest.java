import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ReverseTest{
@Test
public void testThatgetReverse(){
int number = 123;
int expected = 321;
int actual = Reverse.reserve(number);
assertEquals(actual, expected);
}
}

