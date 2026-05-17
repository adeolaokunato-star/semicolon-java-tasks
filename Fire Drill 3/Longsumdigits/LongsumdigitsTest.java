import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LongsumdigitsTest{
@Test
public void testThatgetLongsumdigits(){
long number = 12345;
long expected = 15;
long actual = Longsumdigits.sumDigits(number);
assertEquals(actual, expected);
}
}

