package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker1 = new Speaker(90);
        speaker1.showVolume();


        speaker1.volumeUp();
        speaker1.showVolume();
        speaker1.volumeUp();
        speaker1.showVolume();

        // 필드에 직접 접근
        System.out.println("필드 직접접근해서 수정");
//        speaker1.volume = 2000;
        speaker1.showVolume();
    }
}
