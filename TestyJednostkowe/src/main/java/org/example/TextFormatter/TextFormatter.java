package org.example.TextFormatter;

public class TextFormatter {
    public static String format(String text){
        if (text == null){
            return null;
        }

        String formattedText = text.replace("\n", " ").replace("\t"," ");
        formattedText = formattedText.trim().replaceAll("\\s+", " ");
        return formattedText;
    }
}
