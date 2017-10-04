package org.thepoet.service;

import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Service;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.UUID;

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