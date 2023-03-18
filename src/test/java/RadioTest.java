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
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void prev1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 29;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void next() {
        Radio radio = new Radio();
        radio.setCurrentStation(29);
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
        radio.setCurrentStation(29);
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
        radio.setCurrentStation(29);
        int expected = 29;
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
        radio.setCurrentVolume(-10);
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




