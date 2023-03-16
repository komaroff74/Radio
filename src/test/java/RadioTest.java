import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void increase() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);
        radio.increase();
        int expected = 56;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
    @Test
    void increaseMany() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increase();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
    @Test
    void prev() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.prev();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void next() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
    @Test
    void setCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void setCurrentStationBad() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
    @Test
    void setCurrentStationGood() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
    @Test
    void setCurrentStationMany() {
        Radio radio = new Radio();
        radio.setCurrentStation(33);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
}

