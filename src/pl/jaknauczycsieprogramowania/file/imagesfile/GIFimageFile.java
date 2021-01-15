package pl.jaknauczycsieprogramowania.file.imagesfile;

public class GIFimageFile extends AbstractImagesFile {


    public GIFimageFile(String name, int Size) {
        super(name, Size);
    }




    public void showAnimation() {
        System.out.println("Showing funny GIF");
    }
}
