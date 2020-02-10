public class Middle {
    public static String getMiddle(String word) {
        String answer;
        int middle = word.length() / 2;
        if(word.length() % 2 == 0) {
            answer = word.substring(0, middle);

       } else {
     answer = word.substring(0, 1);
       }
        return answer;

    }

}