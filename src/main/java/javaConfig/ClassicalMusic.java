package javaConfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("singleton")
@Scope("prototype")
public class ClassicalMusic implements Music {

    private ClassicalMusic() {

    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian";
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy");
    }
}
