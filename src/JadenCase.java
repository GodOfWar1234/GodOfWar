import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public static String toJadenCase(String phrase) {
        if (isEmpty(phrase))
           return null;

        return Arrays.stream(phrase.split(" "))
                .map(JadenCase::capitalizeWord)
                .collect(Collectors.joining(" "));
    }

    public static String capitalizeWord(String word) {
        if (isEmpty(word))
            return null;

        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }


}


//    public class Dinglemouse {
//      int rider = 1, miles = 0;
//            for(int distToNextStation : stations) {
//            if (miles + distToNextStation > 100) {
//                rider++;
//                miles = 0;
//            }
//            miles += distToNextStation;
//        }
//            return rider;
//    }


