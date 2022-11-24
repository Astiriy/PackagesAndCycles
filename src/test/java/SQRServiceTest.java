import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();
        int expected = 6;
        int actual = service.calcSQR(10, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInExact() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calcSQR(99, 100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcOutExact() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSQR(0, 0);

        Assertions.assertEquals(expected, actual);
    }
}
