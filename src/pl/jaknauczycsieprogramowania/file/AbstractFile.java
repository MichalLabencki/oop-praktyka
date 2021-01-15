package pl.jaknauczycsieprogramowania.file;

public abstract class AbstractFile implements File{

    protected String name;
    protected int Size;

    protected AbstractFile(String name, int Size) {
        this.name = name;
        this.Size = Size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.Size;
    }
}
