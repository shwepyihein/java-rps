import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random R = new Random();

        int round = 1;
        Scanner sc = new Scanner(System.in);
        int Rock = 1, Paper = 2, Scissors = 3;

        System.out.println("Let's play ROCK PAPER SISOR");
        System.out.println("Enter the Name :");
        String name = sc.nextLine();
        Player p = new Player(name);
        computer cp = new computer();
        System.out.println("welcome to game  " + name);
        System.out.println("Your hp is  100");
        System.out.println("computer Hp is  100");
        System.out.println("your have to choose one of them");
        System.out.println("ROCK :" + Rock);
        System.out.println("PAPER :" + Paper);
        System.out.println("SCISSORS:" + Scissors);
        System.out.println("CHOOSE  YOUR NUMBER: ");


        while(p.getHP()>0 && cp.getCHP()>00){
            int Computer = R.nextInt(3) + 1;

            Scanner P = new Scanner(System.in);
            int Player = P.nextInt();
            System.out.println("you choose :" + Player);
            compareResult(Player,Computer);
            round++;
            if(p.getHP()<0){
                System.out.println("Lose the game => Total round  "+ round +" round  ");
            }else if(cp.getCHP()<0){
                System.out.println("win the game => Total round  "+ round +" round  ");
            }else{
                System.out.println("Your hp is  "+p.getHP());
                System.out.println("computer Hp is  "+cp.getCHP());
                System.out.println("Round= "+round);
                System.out.println("value"+Computer);
            }
        }

    }

    public static void compareResult(int computerinput,int playerinput){

        if(playerinput==1 && computerinput==3){
            Player.lose();
            System.out.println("win");
        }
        else if(playerinput==1 && computerinput==2){
            Player.lose();
            System.out.println("lose");
        }
        else if(playerinput==2 && computerinput==1){
            computer.lose();
            System.out.println("win");
        }else if(playerinput==2 && computerinput==3){
            Player.lose();
            System.out.println("lose");
        }else if(playerinput==3 && computerinput==2){
            computer.lose();
            System.out.println("win");
        }else if(playerinput==3 && computerinput==1){
            Player.lose();
            System.out.println("lose");
        }
        else{
            System.out.println("draw");
            computer.Draw();
            Player.Draw();

        }
    }

}

