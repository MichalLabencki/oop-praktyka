package pl.jaknauczycsieprogramowania;

import pl.jaknauczycsieprogramowania.drive.HDDDrive;
import pl.jaknauczycsieprogramowania.drive.SSDDrive;
import pl.jaknauczycsieprogramowania.file.File;
import pl.jaknauczycsieprogramowania.file.imagesfile.GIFimageFile;
import pl.jaknauczycsieprogramowania.file.imagesfile.JPGimageFile;
import pl.jaknauczycsieprogramowania.file.musicfile.MP3MusicFile;
import pl.jaknauczycsieprogramowania.usbdevice.MemoryStick;
import pl.jaknauczycsieprogramowania.usbdevice.Mouse;

public class Main {

    public static void main(String[] args) {

        MP3MusicFile mp3MusicFile = new MP3MusicFile("plik.mp3", 200, "Cool Kids Of Death", "Butelki z benzyna i kamienie", 90);

        System.out.println(mp3MusicFile.getName());
    }
}
