package com.bridglabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean isValidUsername(String upperCase) {
        String regex = "^(?=.*[A-Z])[A-Za-z]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(upperCase);
        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your password at minimum one letter in uppercase : ");
        String str = sc.nextLine();
        System.out.println(isValidUsername(str));
    }
}
