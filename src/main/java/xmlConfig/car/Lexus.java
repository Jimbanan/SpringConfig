package xmlConfig.car;

import xmlConfig.interfaces.AudioSystem;
import xmlConfig.interfaces.Car;
import xmlConfig.interfaces.NavigationSystem;

public class Lexus implements Car {
    private AudioSystem audioSystem;
    private NavigationSystem navigationSystem;

    public Lexus() {
    }

    public Lexus(AudioSystem audioSystem, NavigationSystem navigationSystem) {
        this.audioSystem = audioSystem;
        this.navigationSystem = navigationSystem;
    }

    public void move() {
        System.out.println("*****************************");
        System.out.println("Lexus in action");
        System.out.println("*****************************");
    }

    public AudioSystem getAudioSystem() {
        return audioSystem;
    }

    public void setAudioSystem(AudioSystem audioSystem) {
        this.audioSystem = audioSystem;
    }

    public NavigationSystem getNavigationSystem() {
        return navigationSystem;
    }

    public void setNavigationSystem(NavigationSystem navigationSystem) {
        this.navigationSystem = navigationSystem;
    }


}
