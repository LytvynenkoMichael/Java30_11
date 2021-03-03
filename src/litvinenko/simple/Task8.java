/**
 * Michael Litvinenko
 */
package litvinenko.simple;

//Напишите программу которая определяет какое из чисел больше


import litvinenko.simple.operator.ReadInteger;

public class Task8 {
    public static void whatNumberBigger(int first, int second) {
        if (first > second) {
            System.out.println(first + " --> " + second);
        } else if (first < second) {
            System.out.println(second + " <-- " + first);
        } else {
            System.out.println("They are equal");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter two numbers for compare");
        whatNumberBigger(ReadInteger.read(), ReadInteger.read());
    }
}