package com.workintech.zoo.validations;

import com.workintech.zoo.entity.Kangaroo;
import com.workintech.zoo.exceptions.ZooException;
import org.springframework.http.HttpStatus;

import java.util.Map;

public class ZooKangarooValidation {
    //STATIC
    public static void isIdValid(Integer id) {
        if (id == null || id < 0) {
            throw new ZooException("id is not valid", HttpStatus.BAD_REQUEST);

        }
    }
    public static void checkIfExists(Map<Integer, Kangaroo> kangaroos, Integer id, boolean exists) {}
}
