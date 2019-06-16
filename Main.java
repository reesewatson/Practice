package com.zipcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    //First Problem
    public static Integer[] incrementOddDecrementEven(Integer[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i]++; }
                else {
                    intArray[i]--;}}
                return intArray;
    }

    //Second Problem
    public static Integer[] add(Integer[] intArray, Integer elementToBeAdd) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
        intList.add(elementToBeAdd);
        return intList.toArray(new Integer[0]);
    }

    //Third Problem
    public static Integer[] replace(Integer[] intArray, int index, Integer element) {
        intArray[index] = element;
        return intArray;
    }

    //Fourth Problem
    public static String[] subArray(String[] originalArray, int start, int end) {
        return Arrays.copyOfRange(originalArray, start, end);
    }

    //Fifth Problem
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    //Sixth Problem
    public static String remove(String str, String characters) {
//        String result = "";
//        String[] chars = characters.split(" ");
//        List<String> list = Arrays.asList(chars);
//        for (int i = 0; i < str.length(); i++) {
//            if(!(list.contains(String.valueOf(str.charAt(i))))) {
//                result += str.charAt(i);
//            }
//        }
//        return result;
        return str.replaceAll(String.format("[%s]", characters), "");
    }

    //Seventh Problem
    public static Boolean beginsWithCap(String str) {
//        char c = str.charAt(0);
//        if(Character.isUpperCase(c)){
//            return true; }
//        return false;
//        }
        return Character.isUpperCase(str.charAt(0)); }

    //Eight Problem
    public static Boolean isMultipleOf5(Integer number) {
        return number % 5 == 0;
    }

    //Ninth Problem
    public static Boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ("1234567890".contains(Character.valueOf(str.charAt(i)).toString())) {
                continue;
            } else {
                return false;
            }
        } return true;
    }

//        or return str.matches("[0-9]+");

    //Tenth Problem
    public static String padToRight(String str, int amountOfPad) {
        return String.format("%-" + amountOfPad + "s", str);
    }


    //Practice
    public static void main(String[] args) {

    }
}
