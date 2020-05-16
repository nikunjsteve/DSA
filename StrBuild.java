
public class StrBuild {
    public static void main(String[] args) {
        // mutable sequence of charachters
        // it does not guarennte for synchronization but StringBuffer

        StringBuilder str = new StringBuilder("Welcome");
        System.out.println("str.length() " + str.length());
        System.out.println("str.capacity() " + str.capacity());
        str.append(" HumbleFool");
        System.out.println(str.toString());
        System.out.println("str.appendCodePoint() " + str.appendCodePoint(1000));// this method appends the ascii
                                                                                 // charachter to the end of code
        System.out.println("str.capacity() " + str.capacity());
        System.out.println("str.length() " + str.length());
        System.out.println("str.reverse() " + str.reverse());
    }
}