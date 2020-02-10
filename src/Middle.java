public class Middle {
    public static String getMiddle(String word) {
        String answer;
        int middle = word.length() / 2;
        int length;
        if(word.length() % 2 == 0) {
            answer = word.substring(0, middle);
            length = 2;
       } else {
     answer = word.substring(0, 1);
       }
        return answer;

    }

}