package xmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xmlConfig.car.Audi;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("xmlConfig.xml");

        Audi audi = context.getBean(Audi.class);
        audi.move();
        audi.getAudioSystem().playCD();
        audi.getNavigationSystem().createRoute();

    }

}
