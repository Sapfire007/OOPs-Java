package media;

public class VideoFile {
    private String mediaType;
    private double fileSize;

    public VideoFile(String a, double b){
        mediaType = a;
        fileSize = b;
    }

    public void displayDetails(){
        if (fileSize > 0) {
            System.out.println("Media Type: " + mediaType + " (Video)");
            System.out.println("File Size: " + fileSize + " MB");
        } else {
            System.out.println("Invalid file size for VideoFile.");
        }
    }
}