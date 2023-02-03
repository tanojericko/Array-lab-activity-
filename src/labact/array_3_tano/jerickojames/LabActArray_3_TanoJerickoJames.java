/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labact.array_3_tano.jerickojames;
import java.util.Scanner;

/**
 *
 * @author Jericko James Tano
 */
public class LabActArray_3_TanoJerickoJames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        System.out.print("Enter how many numbers you wish to input: ");
        int n = myScan.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = myScan.nextInt();
        }

        System.out.println();
        System.out.println("The numbers you entered, and their factorial values are:");
        for (int x = 0; x < n; x++) {
            int factorial = 1;
            int a;
            
            for (a = numbers[x]; a > 0; a--) factorial *= a;
            System.out.println(numbers[x] + "! = " + factorial);
            
        }
    myScan.close();
    }
  
}
