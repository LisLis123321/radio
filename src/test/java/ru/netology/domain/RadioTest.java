package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    private int maxStation = 9;
    private int minStation = 0;
    private int maxSound = 10;
    private int minSound = 0;


    @Test
     void increaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getCurrentStation());
        radio.increaseCurrentStation();
        assertEquals(radio.getMinStation(), radio.getCurrentStation());


    }

    @Test
    void decreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMinStation());
        radio.decreaseCurrentStation();
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void increaseCurrentSound() {
        Radio radio = new Radio();
        radio.setCurrentSound(radio.getCurrentSound() - 1);
        radio.increaseCurrentSound();
        radio.increaseCurrentSound();
        assertEquals(radio.getMaxSound(), radio.getCurrentSound());
    }

    @Test
    void decreaseCurrentSound() {
        Radio radio = new Radio();
        radio.setCurrentSound(radio.getCurrentSound());
        radio.decreaseCurrentSound();
        assertEquals(radio.getMinSound(), radio.getCurrentSound());
    }


}



//    @Test
//    public void shouldChangeStation() {
//        Radio radio = new Radio();
//        assertEquals(0, radio.currentStation);
//        radio.currentStation = 11;
//        assertEquals(0, radio.minStation);
//
//
//    }
//
//    @Test
//    public void setMaxStation() {
//        RadioAdvanced radioAdvanced = new RadioAdvanced();
//        radioAdvanced.setMaxStation(10);
//        System.out.println(radioAdvanced.getMaxStation());
//    }
//
//
//    @Test
//    public void shouldChangeMusic() {
//        Radio radio = new Radio();
//        assertEquals(0, radio.currentStation);
//        radio.currentStation = 0;
//        assertEquals(0, radio.minStation);
//    }
//}
