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
    public static void checkIfExists(Map<Integer, Kangaroo> kangaroos, Integer id, boolean exists) {
        if(exists) {
            if(!kangaroos.containsKey(id)) {
                throw new ZooException("record does not exists", HttpStatus.NOT_FOUND );
            }
        } else {
            if(kangaroos.containsKey(id)) {
                throw new ZooException("record already  exists", HttpStatus.BAD_REQUEST);
            }
        }

    }

    public static void checkWeight(Double weight) {
        if (weight == null || weight <= 0) {
            throw new ZooException("Weight can't be null or less than zero", HttpStatus.BAD_REQUEST);
        }
    }
}
