package pl.jaknauczycsieprogramowania.file.imagesfile;

import pl.jaknauczycsieprogramowania.file.AbstractFile;
import pl.jaknauczycsieprogramowania.file.FileType;

public abstract class AbstractImagesFile  extends AbstractFile {

    public AbstractImagesFile(String name, int size) {
        super(name, size);
    }
    @Override
    public FileType getType() {
        return FileType.IMAGES;
    }
}
