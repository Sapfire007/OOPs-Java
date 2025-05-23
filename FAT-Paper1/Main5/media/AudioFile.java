package media;

public class AudioFile {
    private String mediaType;
    private double fileSize;

    public AudioFile(String a, double b){
        mediaType = a;
        fileSize = b;
    }

    public void displayDetails(){
        if (fileSize > 0) {
            System.out.println("Media Type: " + mediaType + " (Audio)");
            System.out.println("File Size: " + fileSize + " MB");
        } else {
            System.out.println("Invalid file size for AudioFile.");
        }
    }
}