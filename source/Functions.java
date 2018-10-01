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

    /**
     * Multiplies given doubles together.
     *
     * @param   numbers     array of doubles
     * @return  product of all the numbers
     */
    public static double multiply(double... numbers) {
        double product = 1;

        for (double n : numbers) {
            product = product * n;
        }

        return product;
    }

    /**
     * Substract numbers from an original number.
     *
     * @param   originalNumber  original double to substract from
     * @param   numbers         array of doubles
     * @return  difference of originalNumber and numbers
     */
    public static double substract(double originalNumber, double... numbers) {
        double difference = originalNumber;

        for (double n : numbers) {
            difference = difference - n;
        }

        return difference;
    }

    /**
     * Divides first double with the second one.
     *
     * @param   number      double to be divided
     * @param   dividor     double to divide with
     * @return  the quotient
     */
    public static double divide(double number, double dividor) {
        if (dividor == 0) {
            throw new ArithmeticException("You cannot divide with number 0");
        }
        
        double quotient = number / dividor;

        return quotient;
    }

    public static void main(String[] args) {
        System.out.println("test add");
        System.out.println(add(1.35, 0.32));
        System.out.println(add(3, 6, 1, 3, 8, 9));
        System.out.println(add(3.21, 4));
        System.out.println("test multiply");
        System.out.println(multiply(4, 5));
        System.out.println(multiply(3, 5.4, 8, -1.23));
        System.out.println(multiply(5, 8, 0));
        System.out.println("test substract");
        System.out.println(substract(10, 2));
        System.out.println(substract(200, 10, 10, 13));
        System.out.println(substract(0, 3, 5));
        System.out.println("test divide");
        System.out.println(divide(4,2));
        System.out.println(divide(13,7));
        System.out.println(divide(9,3));
    }
}