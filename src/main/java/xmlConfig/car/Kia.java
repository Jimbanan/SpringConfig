package xmlConfig.car;

import xmlConfig.interfaces.AudioSystem;
import xmlConfig.interfaces.Car;
import xmlConfig.interfaces.NavigationSystem;

public class Kia implements Car {
    private AudioSystem audioSystem;
    private NavigationSystem navigationSystem;

    public Kia() {
    }

    public Kia(AudioSystem audioSystem, NavigationSystem navigationSystem) {
        this.audioSystem = audioSystem;
        this.navigationSystem = navigationSystem;
    }

    public void move() {
        System.out.println("*****************************");
        System.out.println("KIA in action");
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
