package ReverseWord;


import java.lang.reflect.Array;

public class ReverseTheString {
    private static String reverseString = "";

    public static void main(String[] args) {


    }


    public static void makeReverse(char[] word){
        if (word.length > 0){
            reverseString += word[word.length -1];
        }

    }
}
