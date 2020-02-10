public class Middle {
    public static String getMiddle(String word) {
        int middle;
        int length;
        if(word.length() % 2 == 0) {
           middle = word.length() / 2 - 1;
           length = 2;
       } else {
     middle = word.length() / 2;
     length = 1;
       }
        return word.substring(middle, middle + length);

    }

}