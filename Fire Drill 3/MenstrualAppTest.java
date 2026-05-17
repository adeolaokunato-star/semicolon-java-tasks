import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MenstrualAppTest {
@Test
public void testasiko(){
int[] result = MenstrualApp.asiko("2026 05 03");
assertEquals(2026, result[0]);
assertEquals(5, result[1]);
assertEquals(3, result[2]);
}
@Test
public void testAnotherasiko() {
    int[] result = MenstrualApp.asiko("2025 12 25");
    assertEquals(2025, result[0]);
    assertEquals(12, result[1]);
    assertEquals(25, result[2]);
}
}

