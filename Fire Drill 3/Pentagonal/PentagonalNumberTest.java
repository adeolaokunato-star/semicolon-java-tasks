import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PentagonalNumberTest{
@Test
public void testThatgetPentagonalNumber(){
int number = 10;
int expect = 145;
int actual = PentagonalNumber.getPentagonalNumber(number);
assertEquals(actual, expect);
}
}
