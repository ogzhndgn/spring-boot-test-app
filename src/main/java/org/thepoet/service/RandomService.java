package org.thepoet.service;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 9.07.2017
 */
@Service
public class RandomService {

    public int getRandomInt() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
