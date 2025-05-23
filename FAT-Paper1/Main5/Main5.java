import media.AudioFile;
import media.ImageFile;
import media.VideoFile;

public class Main5 {
    public static void main(String[] args) {
        AudioFile audio = new AudioFile("MP3", 5.6);
        VideoFile video = new VideoFile("MP4", 100.2);
        ImageFile image = new ImageFile("JPEG", -2.0);  // invalid case

        audio.displayDetails();
        System.out.println();

        video.displayDetails();
        System.out.println();

        image.displayDetails();  // should show error
    }
}
