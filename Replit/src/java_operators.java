public class java_operators {
    public static void main(String[] args) {

        // please demonstrate the use of all 5 arithmetic operators below (+, -, *, /, %)
        int c = 3 + 5;
        int d = 6 - 4;
        int e = 4 * 5;
        int f = 9 / 3;
        int g =  5 % 3;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);


        // please dmonstrate the use of off 5 relational operators below - we'll cover "if-statements" shortly so I'll give you a hint here
        int a = 10;
        int b = 11;
        if (a < b){
            System.out.println("a is less than b");
        }

        // now your turn :)

        if (a <= b) {
            System.out.println("a is less than or equal to b");
        }

        if (a > b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is greater than b");
        }

        if (a >= b) {
            System.out.println("a is greater than or equal to b");
        } else {
            System.out.println("a is NOT greater than or equal to b");
        }

        if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is NOT equal to b");
        }

        if (a != b) {
            System.out.println("a is NOT equal to b");
        } else {
            System.out.println("a is equal to b");
        }

        // please demonstrate the use of all 4 logical operators below (AND, short-circuit AND, OR, short-circuit OR, XOR (exclusive or), and NOT )
        if (a < 20 & b < 20){
            System.out.println("both a & b are less than 20");
        }

        if (a < 20 && b < 20){
            System.out.println("both a & b are less than 20");
        }

        // now your turn :)

        if (a < 20 | b < 20) {
            System.out.println("a OR b are less than 20");
        }

        if (a < 20 ^ b < 20) {
            System.out.println("either a or b are greater than 20");
        } else {
            System.out.println("either a or b are less than 20");
        }


    }
}


