public class String_concat {
    public static void main(String[] args){
        // String Concatination 
        System.out.println();
        String s1 = "Bang";
        String s2 = "ladesh";

        // Concatenation by + (String concatenation) operator
        System.out.println(s1+s2);

        // Concatenation by concat() method
        System.out.println(s1.concat(s2));

        // Concatenation using StringBuilder class
        StringBuilder string1 = new StringBuilder("Bang");
        StringBuilder string2 = new StringBuilder("ladesh");

        System.out.println(string1.append(string2));

        // Concatenation using StringBuilder class
        StringBuffer str1 = new StringBuffer("Bang");
        
        System.out.println(str1.append("ladesh"));
    }
}
