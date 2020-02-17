public class Accumul {


    public static String accum(String s) {
    for(int i = 0; i < s.length(); i++) {
       String upperCase = s.substring(0, 1).toUpperCase() + s.substring(1);
       upperCase.replace("", " ").trim();
    }

    return
    }

    public static void main(String[] args) {
        System.out.println(accum("based"));
    }


}