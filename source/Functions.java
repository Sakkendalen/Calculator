/**
 * @author      Essi Supponen <essi.supponen@cs.tamk.fi>
 * @version     2018-0927
 * @since       2018-0927
 */
public class Functions {

    /**
     * Adds given doubles together.
     *
     * @param   numbers     array of numbers
     * @return  sum of all the numbers
     */
    public static double add(double... numbers) {
        double sum = 0;

        for (double n : numbers) {
            sum = sum + n;
        }

        return sum;
    }

    public static double multiply(double... numbers) {
        double product = 0;

        return product;
    }

    public static double substract(double originalNumber, double... numbers) {
        double difference = originalNumber;

        return difference;
    }

    public static double divide(double number, double dividor) {
        double quotient = number;

        return quotient;
    }

    public static void main(String[] args) {
        System.out.println("test add");
        System.out.println(add(1.35, 0.32));
        System.out.println(add(3, 6, 1, 3, 8, 9));
        System.out.println(add(3.21, 4));
    }
}