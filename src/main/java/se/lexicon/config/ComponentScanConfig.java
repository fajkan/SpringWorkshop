package se.lexicon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import se.lexicon.models.Student;
import se.lexicon.util.ScannerInputService;

import java.util.Scanner;

@Configuration
@ComponentScan("se.lexicon.*")
public class ComponentScanConfig {

    @Bean
    public Scanner scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

   /*
    @Bean
    public ScannerInputService scannerInputService() {
        return new ScannerInputService();
    }
    */



}
