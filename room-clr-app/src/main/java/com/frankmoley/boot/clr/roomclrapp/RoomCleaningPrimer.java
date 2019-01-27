package com.frankmoley.boot.clr.roomclrapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class RoomCleaningPrimer implements CommandLineRunner{

    private RestTemplate restTemplate;

    public RoomCleaningPrimer(){
        super();
        this.restTemplate = new RestTemplate();
    }
    @Override
    public void run(String... strings) throws Exception {
        String url = "http://localhost:9090/api/rooms";
        Arrays.asList(this.restTemplate.getForObject(url, Room[].class)).forEach((s) -> System.out.println("Just get name ... "+s.getName()));
        Arrays.asList(this.restTemplate.getForObject(url, Room[].class)).forEach(System.out::println);
    }
}
