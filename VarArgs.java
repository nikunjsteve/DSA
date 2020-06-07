//Vararg methods can also be overloaded but overloading may lead to ambiguity.
//Only one variable argument in a method
//Variable Argument(vararg) must be the last argument.
public class VarArgs {
    public static void main(String[] args) {
        printArgs(1, 2, 3, 4, 5, 6);
    }

    public static void printArgs(int... n) {
        System.out.println("Number of arguments: " + n.length);
        for (int i : n)
            System.out.print(i + " ");
        System.out.println();
    }
}