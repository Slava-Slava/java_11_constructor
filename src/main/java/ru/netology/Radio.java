package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentStationNumber;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int quantity;

    public Radio() {
    }

    public Radio(int maxRadioStation, int minRadioStation, int currentStationNumber, int maxVolume, int minVolume, int currentVolume, int quantity) {
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
        this.currentStationNumber = currentStationNumber;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
        this.quantity = quantity;
    }
}
