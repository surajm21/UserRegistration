package com.bridglabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean isValidUsername(String fname) {
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fname);
        return m.matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name : ");
        String str = sc.nextLine();
        System.out.println(isValidUsername(str));
    }
}
