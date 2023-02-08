import java.util.Scanner;

//Write a program that will count number of notes from given array
//[1000,500,200,100,50,20,10,5,2,1]
public class CountNumberOfNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] noteCounter = new int[notes.length];

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        System.out.println("Notes: ");
        for (int i = 0; i < notes.length; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + "  " + noteCounter[i]);
            }
        }
    }
}
