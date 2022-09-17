import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation6() {
        Radio radioStation = new Radio(15);

        radioStation.setCurrentRadioStation(6);

        int expected = 6;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetRadioStationNegativeNumber() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(5);
        radioStation.setCurrentRadioStation(-1);

        int expected = 5;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationNull() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(5);
        radioStation.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetRadioStationMaxNumberPlusOne() {
        Radio radioStation = new Radio(15);

        radioStation.setCurrentRadioStation(7);
        radioStation.setCurrentRadioStation(15);

        int expected = 7;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetRadioStationOverNumber() {
        Radio radioStation = new Radio(12);

        radioStation.setCurrentRadioStation(6);
        radioStation.setCurrentRadioStation(20);

        int expected = 6;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


        @Test
    public void nextRadioStation() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(7);

        int expected = 8;
        int actual = radioStation.nextRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextRadioStationEnd_Start() {
        Radio radioStation = new Radio(16);
        int endRadioStation = radioStation.getMaxRadioStation();

        radioStation.setCurrentRadioStation(endRadioStation);

        int expected = 0;
        int actual = radioStation.nextRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevRadioStation() {
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(7);

        int expected = 6;
        int actual = radioStation.prevRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevRadioStationStart_End() {
        Radio radioStation = new Radio(20);

        radioStation.setCurrentRadioStation(0);

        int expected = radioStation.getMaxRadioStation();
        int actual = radioStation.prevRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeNegativeNumber() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(5);
        radioStation.setCurrentVolume(-1);

        int expected = 5;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeOverNumber() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(5);
        radioStation.setCurrentVolume(105);

        int expected = 5;
        int actual = radioStation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextVolumeNormal() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(2);

        int expected = 3;
        int actual = radioStation.increaseVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevVolumeNormal() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(5);

        int expected = 4;
        int actual = radioStation.decreaseVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextVolume100() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(100);

        int expected = 100;
        int actual = radioStation.increaseVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevVolume0() {
        Radio radioStation = new Radio();

        radioStation.setCurrentVolume(0);

        int expected = 0;
        int actual = radioStation.decreaseVolume();

        Assertions.assertEquals(expected, actual);

    }

}
