import java.util.Random;
import java.util.Scanner;

/**
 * Created by 192.168.3.8 on 2016-07-17.
 */
public class RandomNumberGenerator {
    Random rand = new Random();
    Scanner scan=new Scanner(System.in);


int max=10;
    int min=1;
    static int lives=3;
    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    public void rndNum(){

        System.out.println("Enter Your Guess");
        int guess=scan.nextInt();
        System.out.println("");

    int randomNum = rand.nextInt((max - min) + 1) + min;

        if(guess==randomNum){
            System.out.println("You Won random number is "+randomNum);
            lives++;
            System.out.println("\t\t\t\t\t\tRemaining lives "+lives);
            rndNum();
        }else {
            System.out.println("You are wrong random number is "+randomNum);
            lives--;
            if(lives!=0){
                System.out.println("\t\t\t\t\t\tRemaining lives "+lives);
                rndNum();

            }else{
                Scanner scn=new Scanner(System.in);
                System.out.println("Your credit is empty if you want to play more press Y and N to exit");
              String flag=scn.nextLine();
                if(flag.matches("y")){
                    System.out.println("Enter Credit You want");
                int crdit=scan.nextInt();
                lives=crdit;
                    System.out.println("\t\t\t\t\t\tYour have "+lives+" lives" );
                rndNum();
                }

            }
        }

    }
    public static void main(String[] args){
        RandomNumberGenerator obj=new RandomNumberGenerator();
        Scanner scan=new Scanner(System.in);
        System.out.println("Press Y for start guessing");
        String click_start=scan.nextLine();
        if(click_start.matches("y")){

        obj.rndNum();
        }}
}
