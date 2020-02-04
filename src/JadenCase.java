

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