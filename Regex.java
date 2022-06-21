package com.bridglabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean isValidUsername(String mobileNo) {
        String regex = "^[0-9]{2}\\s[1-9]{1}[0-9]{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNo);
        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your mobile number : ");
        String str = sc.nextLine();
        System.out.println(isValidUsername(str));
    }
}
