public class Lab5Ex2 {

    public static void main(String[] args) {

        String text = "Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";
        int length = text.length();
        System.out.println(length);

       boolean UpperandLower = text.matches("[a-zA-Z]+");
       System.out.println(UpperandLower);

       String[] text1 = text.split("\\s");
       int mijloc = text1.length /2;
       if(text1.length % 2 == 0) {
           System.out.println(text1[mijloc -1 ] + " " + text1[mijloc]);
       }
       else
       {
           System.out.println(text1[mijloc]);
       }

       StringBuilder TextInversat = new StringBuilder(text).reverse();
       System.out.println(TextInversat);

    }


    }


