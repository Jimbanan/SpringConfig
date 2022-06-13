package xmlAndJava;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xmlAndJava.xml");

        Person person = context.getBean("person", Person.class);

        System.out.println(person);
    }

}
