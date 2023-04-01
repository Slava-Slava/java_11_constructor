package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(0, 9);
    
    @Test
    public void selectNumberCurrentStation() {
        radio.setCurrentStationNumber(8);
        Assertions.assertEquals(8, radio.getCurrentStationNumber());
    }

    @Test
    public void nextStationAfterExceedingMaximum() {
        radio.setCurrentStationNumber(9);
        radio.pressNextStation();
        Assertions.assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    public void prevStationAfterExceedingMinimum() {
        radio.setCurrentStationNumber(0);
        radio.pressPrevStation();
        Assertions.assertEquals(9, radio.getCurrentStationNumber());

    }

    @Test
    public void nextRadioStation() {
        radio.setCurrentStationNumber(6);
        radio.pressNextStation();
        Assertions.assertEquals(7, radio.getCurrentStationNumber());
    }

    @Test
    public void prevRadioStation() {
        radio.setCurrentStationNumber(6);
        radio.pressPrevStation();
        Assertions.assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    public void exceedingMaxRadioStationsThroughRemoteControl() {
        radio.setCurrentStationNumber(11);
        Assertions.assertEquals(9, radio.getMaxRadioStation());
    }

    @Test
    public void exceedingMinRadioStationsThroughRemoteControl() {
        radio.setCurrentStationNumber(-1);
        Assertions.assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void volumeMax() {
        radio.setCurrentVolume(101);
        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void volumeMin() {
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void plusVolume() {
        radio.setCurrentVolume(41);
        radio.pressPlusVolume();
        Assertions.assertEquals(42, radio.getCurrentVolume());
    }

    @Test
    public void minusVolume() {
        radio.setCurrentVolume(41);
        radio.pressMinusVolume();
        Assertions.assertEquals(40, radio.getCurrentVolume());
    }
}
