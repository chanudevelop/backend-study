package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        // 켜기
        player.on();
        // 볼륨 증가
        player.volumeUp();
        // 볼륨 증가
        player.volumeUp();
        // 볼륨 감소
        player.volumeDown();
        // 플레이어 상태
        player.showStatus();
        // 음악 플레이어 끄기
        player.off();

    }

    static void on(MusicPlayerData data){
        data.isOn =true;
        System.out.println("플레이어 시작");
    }

    static void off(MusicPlayerData data){
        data.isOn =false;
        System.out.println("플레이어를 종료");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("볼륨: " + data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("볼륨: " + data.volume);
    }

    static void showStatus(MusicPlayerData data){
        System.out.println("플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 On, 볼륨: " + data.volume);
        }else{
            System.out.println("음악 픒레이어 OFF");
        }
    }

}
