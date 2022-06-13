package xmlAndJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {

    private int id;
    private String name;
    private String surname;
    private int age;

    @Autowired
    public Person(@Value("10") int id, @Value("Николай") String name) {
        this.id = id;
        this.name = name;
    }

    @Autowired
    @Value("Козьяков")
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @PostConstruct
    public void setAgeInit() {
        this.age = 20;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
