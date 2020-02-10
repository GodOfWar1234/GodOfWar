public class Middle {
    public static String getMiddle(String word) {
        StringBuilder sb = new StringBuilder(word);
        if(word.length() % 2 != 0)
            sb.deleteCharAt(word.length()/2);
        else{
            int middle = word.length()/2 - 1;
            sb.deleteCharAt(middle);
            sb.deleteCharAt(middle);
        }
        word = sb.toString();
        return word;
    }

}