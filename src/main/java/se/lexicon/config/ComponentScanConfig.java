package se.lexicon.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import se.lexicon.models.Student;

@Configuration
@ComponentScan("se.lexicon.*")
public class ComponentScanConfig {
    int id;
    Student student = new Student();
    public int getId() {
        return id++;
    }


}
