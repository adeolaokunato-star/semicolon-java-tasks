import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class SmallMathAppTest{
    @Test
    public void testThatSmallMathAppExists(){
    SmallMathApp yomi = new SmallMathApp();
    yomi.operators("+");
    }
    @Test
    public void testAdditionadds(){
        SmallMathApp yomi = new SmallMathApp();
        assertEquals(12.0, yomi.operators("+"));
    }
    @Test
    public void testSubtractionsubtracts(){
        SmallMathApp yomi = new SmallMathApp();
        assertEquals(8.0, yomi.operators("-"));
    }
    @Test
    public void testMultiplicationmultiplys(){
        SmallMathApp yomi = new SmallMathApp();
        assertEquals(20.0, yomi.operators("*"));
    }
    @Test
    public void testDivisionddivides(){
        SmallMathApp yomi = new SmallMathApp();
        assertEquals(5.0, yomi.operators("/"));
    }
}
