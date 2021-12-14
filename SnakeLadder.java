import java.util.Scanner;
public class Snake{
	public static void main (String[] args) {
		start();
	}
	public static void start() {
		Scanner sc=new Scanner(System.in);
		int position =1;  //initail position is 1 because game starts from 1 on board
                int prev_position;
		int dice=roll();
		System.out.println("Your number is "+dice);
		System.out.println("choose option");
			String option = sc.next();
			switch(option) {
				case "S": //for snake
					System.out.println("You have choosed snake");
					counter+=1;
					position+=dice;
 					if(position>100) {
					position=prev_position;
					}
					System.out.println("New position is "+position);
					report.put(counter, position);
					break;
				case "L": //for ladder
					System.out.println("You have choosed ladder");
					counter+=1;
					position-=dice;
					System.out.println("New position is "+position);
                                        if(position<0) {
					start();
				        }

					report.put(counter, position);
					break;
				default: //for no play
					System.out.println("You have choosed no play");
					counter+=1;
					System.out.println("New position is "+position);
					report.put(counter, position);

			}
	}
	public static int roll() {

		return (int)Math.floor(Math.random()*(6-1+1)+1);

	}
}
