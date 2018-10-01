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

    public static double exponent(double number, double exponent) {
        return 0;
    }

    public static void main(String[] args) {

    }
}