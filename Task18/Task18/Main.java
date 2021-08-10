package com.Task18;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Check chek1 = new Check();
        try { chek1.chekValue();
        }catch (Number12Exception e){
            e.printStackTrace();
        }
    }
}
