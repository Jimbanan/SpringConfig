package xmlAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xmlConfig.car.Kia;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("xmlAutowire.xml");

        Kia kia = context.getBean(Kia.class);
        kia.move();
        kia.getAudioSystem().playCD();
        kia.getNavigationSystem().createRoute();
    }

}
