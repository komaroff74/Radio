import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public  class RadioTest {


    @Test
    void increase() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increase();
        int expected = 1;
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
    void prev1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
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
    void next1() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.next();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void next2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
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
        radio.setCurrentStation(-13);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
    @Test
    void setCurrentVolumeMany() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
}

