public class Lab5Ex1 {


    public static void main(String[] args)
    {
        String text1 = "ddd";
        boolean matches1 = text1.matches("[^abc]");
        System.out.println(matches1);

        String text2 = "a";
        boolean matches2 = text2.matches("[a-z]");
        System.out.println(matches2);

        String text3 = "A";
        boolean matches3 = text3.matches("[a-zA-Z]");
        System.out.println(matches3);

        String text4 = "aA";
        boolean matches4 = text4.matches("[a-z][A-Z]");
        System.out.println(matches4);

        String text5 = "aabbcc";
        boolean matches5 = text5.matches("[abc]+");
        System.out.println(matches5);

        String text6 = "";
        boolean matches6 = text6.matches("[abc]*");
        System.out.println(matches6);

        String text7 = "aabbc";
        boolean matches7 = text7.matches("[abc]{5}");
        System.out.println(matches7);

        String text8 = "aabbcc";
        boolean matches8 = text8.matches("[abc]{5,}");
        System.out.println(matches8);

        String text9 = "aabbcc";
        boolean matches9 = text9.matches("[abc]{5,10}");
        System.out.println(matches9);

    }


}