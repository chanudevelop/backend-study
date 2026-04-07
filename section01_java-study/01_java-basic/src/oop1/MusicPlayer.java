package oop1;

public class MusicPlayer {

    int volume;
    boolean isOn;

    void on(){
        isOn = true;
        System.out.println("플레이어 실행");
    }

    void off() {
        isOn = false;
        System.out.println("플레이어 종료");
    }

    void volumeUp() {
        volume++;
        System.out.println("볼륨 업 volume: " + volume);
    }
    void volumeDown() {
        volume--;
        System.out.println("볼륨 업 volume: " + volume);
    }

    void showStatus(){
        if(isOn){
            System.out.println("음악 플레이어 On, 볼류: " + volume);
        }
        else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}
