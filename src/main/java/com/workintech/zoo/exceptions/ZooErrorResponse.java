package com.workintech.zoo.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZooErrorResponse {  //will be used in GlobalExceptionHandler
    private Integer status;
    private String message;
    private Long timestamp;
}
