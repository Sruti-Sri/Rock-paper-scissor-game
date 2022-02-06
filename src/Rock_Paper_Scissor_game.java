import java.util.Random;
import java .util.Scanner;
public class Rock_Paper_Scissor_game {
    public static void main(String[] args) {
        //0 for rock
        //1 for paper
        //2 for scissors

        Scanner sc = new Scanner(System.in);
        System.out.println("Press 0 for rock, 1 for paper, 2 for scissors: ");
        int userInput=sc.nextInt();

        Random random=new Random();
        int computerInput=random.nextInt(3);
        if(userInput==computerInput)
        {
            System.out.println("Game is Draw");
        }
        else if (userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1)
        {
            System.out.println("Player wins");
        }
        else{
            System.out.println("Computer Wins");
        }

        if(computerInput==0)
        {
            System.out.println("Computer choice: Rock ");
        }
        else if(computerInput==1)
        {
            System.out.println("Computer choice: Paper");
        }
        else if(computerInput==2)
        {
            System.out.println("Computer choice: Scissors");
        }
    }
}
