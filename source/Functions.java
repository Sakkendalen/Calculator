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

    /**
     * Calculates and returns number to the power of exponent.
     *
     * When exponent is positive, uses for-loop to multiply the number by
     * itself. When exponent is negative, uses the reciprocal of the
     * number. When exponent is 0, always returns 1.
     *
     * @param   number      double to multiply
     * @param   exponent    int, how many times to multiply number
     * @return  number to the power of exponent
     */
    public static double exponent(double number,int exponent) {
        double result = 1;

        if (exponent > 0) {
            for (int i = 1; i <= exponent; i++) {
                result = result * number;
            }
        } else if (exponent < 0) {
            for (int i = 1; i <= -1 * exponent; i++) {
                result = result * (1/number);
            }
        }

        // If exponent is 0, the result will always be 1.

        return result;
    }

    public static double sqrt(double number) {
        double min;
        double max;
        double root;
        boolean found = false;
        
        if (number < 0) {
            throw new ArithmeticException("You cannot get square root of a negative number.");
        } else if (number > 1) {
            min = 0;
            max = number;
            root = max/2;

            while(!found) {
                if (root*root >= number * 1.000001) {
                    max = root;
                    root = (max+min)/2;
                } else if (root*root <= number * 0.999999) {
                    min = root;
                    root = (max+min)/2;
                } else {
                    found = true;
                }
            }
        } else if (number < 1) {
            min = number;
            max = 1;
            root = (max + min) / 2;

            while(!found) {
                if (root*root >= number * 1.000001) {
                    max = root;
                    root = (max + min) / 2;
                } else if (root*root <= number * 0.999999) {
                    min = root;
                    root = (max + min) / 2;
                } else {
                    found = true;
                }
            }
        } else {
            root = 1;
        }

        return root;
    }

    public static void main(String[] args) {
        System.out.println("Exponent tests");
        System.out.println("2^2 = " + exponent(2, 2));
        System.out.println("2^-2 = " + exponent(2, -2));
        System.out.println("3^4 = " + exponent(3, 4));
        System.out.println("Squareroot tests");
        System.out.println("sqrt(16) = " + sqrt(16));
        System.out.println("sqrt(4) = " + sqrt(4));
        System.out.println("sqrt(0.25) = " + sqrt(0.25));
    }
}