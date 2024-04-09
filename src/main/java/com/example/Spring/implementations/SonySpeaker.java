package com.example.Spring.implementations;

import com.example.Spring.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("sonySpeaker")
@Primary
public class SonySpeaker implements Speakers {
    @Override
    public String makeSound() {
        return "Sony Speaker";
    }
}
