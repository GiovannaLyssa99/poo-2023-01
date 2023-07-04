package com.github.giovannalyssa99.ufg.poo.t07;

public class Permuta {

    public static void permuta(String p, String s) {
        if (s.length() == 0) {
            System.out.println(p);
        } 
        else {
            for (int i = 0; i < s.length(); i++) {
                permuta(p + s.charAt(i), s.substring(0, i) + s.substring(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        permuta("", "abc");
    }
}