package media;

public class ImageFile {
    private String mediaType;
    private double fileSize;

    public ImageFile(String a, double b){
        mediaType = a;
        fileSize = b;
    }

    public void displayDetails(){
        if (fileSize > 0) {
            System.out.println("Media Type: " + mediaType + " (Image)");
            System.out.println("File Size: " + fileSize + " MB");
        } else {
            System.out.println("Invalid file size for ImageFile.");
        }
    }
}