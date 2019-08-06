package hbcu.stay.ready.algor;

import java.util.LinkedList;

public class Solution {
    String noteText = "this is a note for you from a secret admirer";

    public boolean harmlessRansomNote(String meesage, String magazineText) {

        String text = "puerto rico is a great place you must hike far from town to find a secret " +
                "waterfall that i am an admirer of but note that it is not as hard as it seems " +
                "this is my advice for you";

        LinkedList<String> object = new LinkedList<String>();

        object.add(text);

        for (String x : object) {

            if (x == noteText) {
                

            }

            System.out.println(object);
        }







        return true;
    }
}
