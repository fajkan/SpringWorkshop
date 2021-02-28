package se.lexicon.util;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;



@Component
public class ScannerInputService implements UserInputService{

    @Bean
    public Scanner scannerObj() {
        Scanner scanObj = new Scanner(System.in);
        return scanObj;
    }



    @Override
    public String getString() {
        return null;
    }

    @Override
    public int getInt() {
        return 0;
    }
}
