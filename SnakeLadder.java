public class Snake{
	public static void main (String[] args) {
		start();
	}
	public static void start() {
		int position =1;  //initail position is 1 because game starts from 1 on board
		int dice=roll();
		System.out.println("Your number is "+dice);
	}
	public static int roll() {

		return (int)Math.floor(Math.random()*(6-1+1)+1);

	}
}
