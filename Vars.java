class Vars {
    public static void main(String args[]) {
        boolean b = true; // true or false
        byte by = 10; // 8 bits signed 2's complement integer -128 to 127
        short sh = 30000; // 16 bits signed 2's complement integer -32,768 to 32,767
        int i = -234567; // 32 bits signed 2's complement integer
        long l = -123456789; // 64 bits signed 2's complement integer
        float f = 1.2f; // 32 bits upto 7 decimal places
        double d = 10.3; // 64 bits upto 16 decimal places
        char c = 'C'; // 16 bits unicode character

        System.out.println("boolean " + b);
        System.out.println("byte " + by);
        System.out.println("short " + sh);
        System.out.println("int " + i);
        System.out.println("long " + l);
        System.out.println("float " + f);
        System.out.println("double " + d);
        System.out.println("char " + c);
    }
}