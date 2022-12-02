package com.example.daily.code.buffer.questions.core.concepts.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CatServiceImpl implements AnimalService {
    @Override
    public void makeSound() {

    }

    @Override
    public boolean canRun() {
        return false;
    }
}
