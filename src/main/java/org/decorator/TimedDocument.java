package org.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TimedDocument implements Document{
    private String path;
    @Override
    public String parse() {
        long startTime = System.currentTimeMillis();
        String text = new SmartDocument(path).parse();
        return "It took " + (System.currentTimeMillis() - startTime) + " milliseconds to get the following text\n" + text;
    }
}
