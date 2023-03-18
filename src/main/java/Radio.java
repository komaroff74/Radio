public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxStation;
    private int minStation;

    public void increase() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }
    public Radio(){
        maxStation = 29;
        minStation = 0;

    }
    public Radio(int maxStation){
        this.maxStation = maxStation - 1;
    }


    public void next() {
        if (currentStation != maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }

    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minStation) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }
}