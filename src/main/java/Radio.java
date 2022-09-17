public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation = 9;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxRadioStation() { return maxRadioStation; }


    public Radio(int amountStation){
        this.maxRadioStation = amountStation - 1;
    }

    public Radio(){
        this.maxRadioStation = maxRadioStation;
    }

    public int nextRadioStation() {
        if (currentRadioStation < maxRadioStation){
            currentRadioStation = currentRadioStation + 1;
        }
        else {
            currentRadioStation = 0;
        }
        return currentRadioStation;
    }

    public int prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation){
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 100){
            currentVolume = currentVolume + 1;
        }
        else {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume){
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

}

