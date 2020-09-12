package com.greenfox.lightning.lombokdemo;

import com.greenfox.lightning.lombokdemo.model.Alien;
import com.greenfox.lightning.lombokdemo.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LombokdemoApplication.class, args);
        Person p = new Person("Mike", "USA", 33, true);
        System.out.println(p);

        Alien a = new Alien("Gorpgorp", "Klippodon", 22, true);
        a.setName("GG");
        a.setAge(999);
        System.out.println(a);


    }

}
