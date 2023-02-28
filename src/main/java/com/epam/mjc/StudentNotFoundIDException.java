package com.epam.mjc;

public class StudentNotFoundIDException extends IllegalArgumentException {
    public StudentNotFoundIDException (String message){
        super(message);
    }

}
