package com.access;

public class Animal {
    private String privateField = "Private field";
    String defaultField = "Default field";
    protected String protectedField = "Protected field";
    public String publicField = "Public field";

    private void privateMethod() {
        System.out.println("Private method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    public void publicMethod() {
        System.out.println("Public method");
    }
}