package org.decorator;

public class Main {
    public static void main(String[] args) {
        Document document = new SmartDocument("gs://ooptrashbox/Screenshot 2022-12-01 at 11.11.08.png");
//        document = TimedDocument(document);
//        document = CashedDocument(document);
        System.out.println(document.parse());


    }
}
