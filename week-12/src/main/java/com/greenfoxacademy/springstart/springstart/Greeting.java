package com.greenfoxacademy.springstart.springstart;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private String content;
    private static AtomicLong greetCount = new AtomicLong(0);
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    public Greeting(String content) {
        this.content = content;
        greetCount.addAndGet(1);
    }

    public Greeting(){
        greetCount.addAndGet(1);
    }

    public String getRandomGreeting(){
        Random random = new Random();
        return hellos[random.nextInt(hellos.length)];
    }
    public AtomicLong getGreetCount(){
        return greetCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
