package opdrachten.opdracht_5;

public class Methods {

    public static void main(String[] args) {

        int myFirstNumber = 17;
        int mySecondNumber = 11;

        printSum(myFirstNumber, mySecondNumber);
        printDifference(myFirstNumber, mySecondNumber);
        printProduct(myFirstNumber, mySecondNumber);
        printQuotient(myFirstNumber, mySecondNumber);
    }

    public static void printSum(int intOne, int intTwo) {
        int result = intOne + intTwo;
        System.out.println("The sum is: " + result);
    }

    public static void printDifference(int intOne, int intTwo) {
        int result = intOne - intTwo;
        System.out.println("The difference is: " + result);
    }

    public static void printProduct(int intOne, int intTwo) {
        int result = intOne * intTwo;
        System.out.println("The product is: " + result);
    }

    public static void printQuotient(int intOne, int intTwo) {
        int result = intOne / intTwo;
        System.out.println("The quotient is: " + result);
    }
}
