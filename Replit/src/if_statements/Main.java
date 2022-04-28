package if_statements;

class Main {
    public static void main(String[] args) {
        // please write and run at least 3 unique if statements below
        int i = 10;
        if (i < 20){
            System.out.println("i is less than 20!");
        }

        if (i == 20){
            System.out.println("i is NOT equal to 20!");
        }

        if (i <= 20){
            System.out.println("i is less than or equal to 20!");
        }
        // please write and run at least 2 unique if/else-if/else ladders below

        if(i >= 20){
            System.out.println("i is greater than or equal to 20!");
        } else {
            System.out.println("i is NOT greater than or equal to 20!");
        }

        if (i > 10){
            System.out.println("i is greater than 10");
        } else if (i < 10) {
            System.out.println("i is less than 10");
        } else {
            System.out.println("i is equal to 10");
        }


    }
}
