package org.thepoet.service;

import org.springframework.stereotype.Service;

/**
 * @author the Poet <dogan_oguzhan@hotmail.com>
 * @date 4.10.2017
 */
@Service
public class IdGeneratorService {
    public String generateUniqueId() {
        long currentTimeInMillis = System.currentTimeMillis();
        String id = Long.toHexString(currentTimeInMillis);
        System.out.println("L: " + currentTimeInMillis + " S: " + id);
        return id;
    }
}