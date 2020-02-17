import org.w3c.dom.ls.LSOutput;

public class Accumul {


    public static String accum(String s) {
       String upperCase = s.substring(0, 1).toUpperCase() + s.substring(1);
        String bucket = upperCase.replace("", " ").trim();
    for(int i = 0; i < s.length(); i++) {

    }


    return bucket;
    }
    public static void ok() {
        String s = "abc";
        String result = "";
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            result = result + c + c;
            i++;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        ok();
        System.out.println(accum("based"));
    }


}