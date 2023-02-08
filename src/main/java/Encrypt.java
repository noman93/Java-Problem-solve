//Encrypt word when A=F
import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        System.out.println("Input Word");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        char [] chars = word.toCharArray();
        for(char c : chars){
            c+=5;
            System.out.print(c);
        }

    }
}
