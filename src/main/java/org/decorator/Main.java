package org.decorator;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Document document = new SmartDocument("gs://ooptrashbox/Screenshot 2022-12-01 at 11.11.08.png");
        TimedDocument timedDocument = new TimedDocument("gs://ooptrashbox/Screenshot 2022-12-01 at 11.11.08.png");
//        document = CashedDocument(document);
        System.out.println(document.parse());
        System.out.println(timedDocument.parse());


    }
}
