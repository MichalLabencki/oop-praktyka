package pl.jaknauczycsieprogramowania.file.imagesfile;

public class JPGimageFile extends AbstractImagesFile {
    private int compresion;



    public JPGimageFile(String name, int Size, int compresion) {
    super(name, Size);
        this.compresion = compresion;
    }

    public int getCompresion() {
        return compresion;
    }

    public void displayImage() {
        System.out.println("Displaying JPG");
    }
}
