package org.example;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Document doc = new SmartDocument("/Users/shumskyjury/Desktop/aaaa.png");
        String result = doc.parse();
        System.out.println(result);
    }
}