import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Snake{
	public static void main (String[] args) {
		start();
	}
	public static void start() {
		Map<Integer, Integer> report=new HashMap<>(); //to store position after every dice roll
		int counter=0; //to count the no of dice roll
		Scanner sc=new Scanner(System.in);
		int position =1;  //initail position is 1 because game starts from 1 on board
                int prev_position;
		while(position!=100) {
                        System.out.println("Your position is "+position);
			prev_position=position;
			int dice=roll();
			System.out.println("Your number is "+dice);
			System.out.println("choose option");
			String option = sc.next();
			switch(option) {
				case "S": //for snake
					System.out.println("You have choosed snake");
					counter+=1;
	/*				position+=dice;
 	  usecase5			if(position>100) {
	*/				position=prev_position;
					}
					System.out.println("New position is "+position);
					report.put(counter, position);
					break;
				case "L": //for ladder
					System.out.println("You have choosed ladder");
					counter+=1;
					position-=dice;
					System.out.println("New position is "+position);
              /*               		if(position<0) {
		usecase4 		start();
		*/		        }

					report.put(counter, position);
					break;
				default: //for no play
					System.out.println("You have choosed no play");
					counter+=1;
					System.out.println("New position is "+position);
					report.put(counter, position);

			}
		}
		System.out.println("you have won");
		System.out.println(report); //to return the no of dice was played to win the game and position after every dice roll
	}
	public static int roll() {

		return (int)Math.floor(Math.random()*(6-1+1)+1);

	}
}
