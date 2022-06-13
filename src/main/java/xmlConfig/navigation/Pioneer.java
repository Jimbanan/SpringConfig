package xmlConfig.navigation;

import xmlConfig.interfaces.NavigationSystem;

public class Pioneer implements NavigationSystem {
    public boolean createRoute() {
        System.out.println("*****************************");
        System.out.println("Route was created by Garmin");
        System.out.println("*****************************");
        return true;
    }
}
