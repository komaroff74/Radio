public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxStation;

    public Radio(){
        maxStation = 9;

    }
    public Radio (int stationsCount){
        maxStation= stationsCount - 1;

    }


    public void increase() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }

    }
    public void prev() {
        if (currentStation != 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
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
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }
}

