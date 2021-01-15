package pl.jaknauczycsieprogramowania.usbdevice;

public class Mouse implements USBDevice{

    private String name;

    public Mouse(String name) {

        this.name = name;
    }

    @Override
    public boolean connected() {
        System.out.println("Mouse connected");
        return true;
    }

    @Override
    public boolean disconected() {
        System.out.println("Mouse disconected");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
