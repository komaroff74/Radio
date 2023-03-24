import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTests {
    @Test
    public void test(){
        Radio radio = new Radio(10);
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

}
