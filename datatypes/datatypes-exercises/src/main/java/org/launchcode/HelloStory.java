package org.launchcode;
import java.util.Scanner;
public class HelloStory {
    public static void main(String[] args) {
        String story = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);
        System.out.println("Select a term to search for in the verse: ");
        String search = input.nextLine();
        boolean textFind = story.toLowerCase().contains(search.toLowerCase());

        if (textFind) {
            int index = story.indexOf(search.toLowerCase());
            int length = search.length();
            System.out.println("Your search term first appears at Index " + index +
                    ". Your term is " + length + " characters long");

            String modifiedStory = story.replace(search, "");
            System.out.println(modifiedStory);
        } else {
            System.out.println("False");
        }
    }
}
