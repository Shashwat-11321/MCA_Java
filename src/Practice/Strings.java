package Practice;

public class Strings {
    public static void main(String[] args) {
        String s="hello";
        System.out.println(s);
        s.concat(" Java");
        System.out.println(s);

        char chars[]={'h','e','l','l','o'};
        String str=new String(chars);
        System.out.println(str);

        System.out.println(str.length());
        System.out.println(str.concat("h"));
        System.out.println(str.contains("h"));

    }
}
