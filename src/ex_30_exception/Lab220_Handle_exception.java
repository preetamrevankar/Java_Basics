package ex_30_exception;

import java.util.Scanner;

public class Lab220_Handle_exception {
    public static void main(String[] args) {
        Scanner scanner = new scanner() ;
        int a=0 ;
        try {
            a=10/0 ;
        } catch (Exception e) {
            System.out.println("Divi by zero is not allowed");
        }

        System.out.println(a);
    }
}
