
import java.util.*;
public class Main {
    public static void main(String[] args) {
//        generating random numbers
        Random rand  = new Random();
        int comp = (rand.nextInt(3) + 1);
        System.out.println();
        System.out.println("Welcome to the rock, paper, scissor game!!");


        String computerChoice = compChoice(comp);
        String usersChoice = userChoice();

        System.out.println("Your Computer Chooses " + computerChoice);
        System.out.println();
        System.out.println("But You Chose " + usersChoice);
        System.out.println();
        String answer = judgement(computerChoice, usersChoice);
        if (answer.equals("equal") || answer.equals("-1")){
            System.out.println("fair judgement, please play game again");
        }else if(answer.equals("A won")){
            System.out.println(answer);
        }



    }

    public static String compChoice(int comp){
        if(comp == 1){

            return "rock";
        }else if(comp == 2){

            return "paper";
        } else if (comp == 3) {

            return "scissors";
        }else {
            return "incorrect choice";
        }
    }

    public static String userChoice(){
       Scanner in = new Scanner(System.in);
        System.out.println("Please input your choice of either \"rock\", \"paper\" or \"scissors\" (note!! all in smaller cases)");
        return in.next();
    }
    public static String judgement(String comp, String user){
        if(comp.equals(user)){
            return "equal";
        }else if(comp.equals("rock") && user.equals("scissors")){
            return "Computer won";
        }else if (comp.equals("scissors") && user.equals("paper") ){
            return "Computer won";
        }else if (comp.equals("paper")  && user.equals("rock")){
            return "Computer won";
        }else if(comp.equals("paper") && user.equals("scissors")){
            return "you won";
        }else if(comp.equals("scissors") && user.equals("rock")){
            return "you won";
        }else if(comp.equals("rock") && user.equals("paper")){
            return "you won";
        }else {
            return "-1";
        }
    }



}