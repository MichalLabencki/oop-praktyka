package pl.jaknauczycsieprogramowania.usbdevice;

public interface USBDevice {

    boolean connected();
    boolean disconected();
    String getName();

}
