package ru.netology.domain;

public class Radio {

    private String name;
    private int maxStation;
    private int minStation;
    private int currentStation;
    private boolean on;
    private int maxSound;
    private int minSound;
    private int currentSound;
    private int increaseStation;
    private int decreaseStation;
    private int increaseSound;
    private int decreaseSound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getMaxSound() {
        return maxSound;
    }

    public void setMaxSound(int maxSound) {
        this.maxSound = maxSound;
    }

    public int getMinSound() {
        return minSound;
    }

    public void setMinSound(int minSound) {
        this.minSound = minSound;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentSound(int currentSound) {
        if (currentSound > maxSound) {
            return;
        }
        if (currentSound < minSound) {
            return;
        }
        this.currentSound = currentSound;

    }

    public void increaseCurrentStation() {
        int increaseStation = getCurrentStation() + 1;
        setCurrentStation((increaseStation));
    }

    public void decreaseCurrentStation() {
        int decreaseStation = getCurrentStation() - 1;
        setCurrentStation((decreaseStation));
    }

    public void increaseCurrentSound() {
        int increaseSound = getCurrentSound() + 1;
        setCurrentSound((increaseSound));
    }

    public void decreaseCurrentSound() {
        int decreaseSound = getCurrentSound() - 1;
        setCurrentSound((decreaseSound));
    }
}








