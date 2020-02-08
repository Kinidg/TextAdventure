import java.util.Scanner;
import java.util.ArrayList;

class TextAdventure1{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		ArrayList <String> bag = new ArrayList <String>();
		while(!quit){
System.out.println("Welcome to the school of Horrors!!");
System.out.println("Choose to go out the door(d) or stay(s)?");
String q1 = scanner.next();
if(q1.equals("d")){//if q1
System.out.println("You are in the hallway.\nThere is a blob to the right");
System.out.println("Explore the blob(b) or return to your classroom(q)?");
String q2 = scanner.next();
	if(q2.equals("b")){//if q2
System.out.println("You see a shiny key in the hands of the blob");
System.out.println("Fight the blob(f) or look around(l)?");
String q3 = scanner.next();
		if(q3.equals("f")){//if q3
System.out.println("You decided to fight!");
			if(Math.random()<0.5){//inner if q3
System.out.println("Sorry, you died");
quit = true;
			}//end inner if q3
				else{//inner else if q3
System.out.println("Yay, you won! You get a shiny key.");
bag.add("key");
System.out.println("There is a locked box in front of you");
System.out.println("Do you want to open it(y/n)?");
String q4 = scanner.next();
		if(q4.equals("y")){//if q4
			for(String item: bag){//for each
				if(item.equals("key")){//inner if q4
					System.out.println("You found the treasure!");
					System.out.println("You win the game!");
					quit = true;
				}//end inner if q4
				else{
					System.out.println("You tried to open the box without a key..");
					System.out.println("You died...");
					quit = true;
				}//end else inner if q4
			}//end for each
		}//end if q4
else{//if q4 else
System.out.println("Your lack of curiosity is astonishing. Good Bye!");
quit = true;
}//end else q4
		}//end inner else if q3
		}//end q3 if
		else{
			System.out.println("There is a locked box in front of you.");
			bag.add("");
			System.out.println("Do you want to open it?(y/n)");
			String q5 = scanner.next();
			if(q5.equals("y")){//if q5
				for(String item:bag){//for each
					if(item.equals("key")){//inner if q5
						System.out.println("You found the treasure!");
						System.out.println("You won the game!!");
						quit = true;
					}//end inner if q5
					else{//else inner q5
						System.out.println("You tried to open the box without the key!");
						System.out.println("You died...");
						quit = true;
					}//end else inner q5
				}//end for each
			}//end if q5
			else{
				System.out.println("Your lack of curiosity is astonishing. Good Bye!");
				quit = true;
			}//end else q5
		}//end else q3
	}//end if q2
	else{
		System.out.println("Your lack of curiosity is astonishing. Good Bye!");
		quit = true;
	}//end else q2
}//end if q1
else{//else q1
	System.out.println("Your lack of curiosity is astonishing. Good Bye!");
	quit = true;
			}//end else q1
		}//end while
	}// end main
}//end class
