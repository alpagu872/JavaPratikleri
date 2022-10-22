package ReverseWord;

public class ReverseTheString {


    public static void main(String[] args) {
        String TestString = "TERSTEN OKU ŞUNU COCA COLA";
        System.out.println(Reverse(TestString,0));

    }


    public static String Reverse(String testString, int index){
        if (index < testString.length()){
            return Reverse(testString, index +1) + testString.charAt(index);
        }else {
            return "";
        }
    }
}
