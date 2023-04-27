package com.ncc.generic;

public class DemoGeneric {
    public static void main(String[] args) {
        GenericExample<String, String> ge = new GenericExample<String, String>("language", "ngon ngu");
        String english = ge.getKey();
        String vietnamese = ge.getValue();
        System.out.println(english + ": " + vietnamese);
    }
}
