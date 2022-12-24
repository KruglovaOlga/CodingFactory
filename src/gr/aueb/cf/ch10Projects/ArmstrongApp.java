package gr.aueb.cf.ch10Projects;
/*
Βρίσκει αν το άθροισμα των δυνάμεων κάθε ψηφίου εις τη (πλήθος ψηφίων)
είναι ίσο με τον ίδιο τον αριθμό. Π.Χ. το 153 = 1^3 + 5^3 + 3^3. Επομένως
το 153 είναι Armstrong number.
Επίσης, τα 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084

 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final ArrayList<Integer> digits = new ArrayList<>();
        int inputNumber, digitsCount = 0, sum = 0, num = 0, digit = 0;
        boolean isArmstrong = false;

        System.out.println("Please insert a number");
        inputNumber = in.nextInt();

        num = inputNumber;
        do {
            digitsCount++;
            digit = num % 10;
            digits.add(digit);
            num = num /10;
        } while (num != 0);

        for (int item : digits) {
            sum += Math.pow(item, digitsCount);
        }

        isArmstrong = (sum == inputNumber);
        System.out.println(inputNumber);
        System.out.println(sum);
        System.out.printf("%d is Armsrong: %s", inputNumber, (isArmstrong) ? "YES" : "FALSE");
    }
}

/************************************************************************
 * import java.lang.Math;
 * public class myClass
 * {
 *  public static void main(String[] args)
 *  {
 *   int num = 19;
 *   int copyNum = num;
 *   int digits = 0;
 *   int remainder = 0;
 *   int total = 0;
 *
 *   // find number of digits in num variable
 *   while(copyNum != 0)
 *   {
 *    digits++;
 *    copyNum = copyNum / 10;
 *   }
 *   copyNum = num;
 *
 *   // slice the numbers from last digits
 *   while(copyNum != 0)
 *   {
 *    remainder = copyNum % 10;
 *    total += (int) Math.pow(remainder, digits);
 *    copyNum = copyNum / 10;
 *   }
 *
 *   // result
 *   if(num == total)
 *    System.out.format("%d is an armstrong number", num);
 *   else
 *    System.out.format("%d is not an armstrong number", num);
 *  }
 * }
 */
