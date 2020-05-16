
public class Str {
    public static void main(String[] args) {
        String str1 = "This is my simple string";

        // Strings are immutable (cannot grow)
        // when you want to make change to string you have to entirely create a new
        // string

        // two objects are created when string object is declared 1 - in heap and 1 in
        // string constant pool
        String str2 = new String("Another string");

        System.out.println("str1 " + str1);
        System.out.println("str2 " + str2);

        System.out.println("str1.charAt(3) \n" + str1.charAt(3));
        System.out.println("str1.substring(5) \n" + str1.substring(5));
        System.out.println("str1.substring(11,17) \n" + str1.substring(11, 17));
        System.out.println("str1.concat(str2) \n" + str1.concat(str2));
        System.out.println("str1 still remains same because strings are immutable \n" + str1);
        System.out.println("str1.indexOf('i') \n" + str1.indexOf("i"));
        System.out.println("str1.lastIndexOf('i') \n" + str1.lastIndexOf("i"));
        System.out.println("str1.equls('This is my simple string') \n" + str1.equals("This is my simple string"));
        System.out.println("str1.equalsIgnoreCase('this is my Simple String') \n"
                + str1.equalsIgnoreCase("this is my Simple String"));
        System.out.println("'this'.compareTo('these') \n" + "this".compareTo("these"));
        System.out.println("'this'.compareToIgnoreCase('THIS') \n" + "this".compareToIgnoreCase("THIS"));
        System.out.println("str1.toLowerCase() \n" + str1.toLowerCase());
        System.out.println("str1.toUpperCase() \n" + str1.toUpperCase());
        System.out.println("'   this    '.trim() \n" + "   this    ".trim());
        System.out.println("str1.replace('i','f') \n" + str1.replace('i', 'f'));

        for(int i = 0; i < str1.length() ; i++){
            System.out.println(str1.charAt(i));
        }
    }
}