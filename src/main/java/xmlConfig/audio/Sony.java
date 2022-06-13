package xmlConfig.audio;

import xmlConfig.interfaces.AudioSystem;

public class Sony implements AudioSystem {
    public void playCD() {
        System.out.println("*****************************");
        System.out.println("Music from alpine CD");
        System.out.println("*****************************");
    }

    public void playRadio() {
        System.out.println("*****************************");
        System.out.println("Music from alpine Radio");
        System.out.println("*****************************");
    }
}
