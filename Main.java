/*Rock Paper Scissors
* Masroor Ahmad
*Apr 3, 2022
*/ 

// Importing Java Utilitys package
import java.util.*;

class Main {
  public static void main(String[] args) throws InterruptedException {
  	Scanner sc = new Scanner (System.in);

		//Getting Random Number for the computer's decision
		int Computer = (int)(Math.random()*3)+1;
		System.out.println("");
		System.out.println("");
		
		//Displays Cool tittle with a small delay between lines 
		System.out.println("░██╗░░░░░░░██╗███████╗██╗░░░░░░█████╗░░█████╗░███╗░░░███╗███████╗");
		Thread.sleep(550);
		System.out.println("░██║░░██╗░░██║██╔════╝██║░░░░░██╔══██╗██╔══██╗████╗░████║██╔════╝");
		Thread.sleep(550);
		System.out.println("░╚██╗████╗██╔╝█████╗░░██║░░░░░██║░░╚═╝██║░░██║██╔████╔██║█████╗░░");
		Thread.sleep(550);
		System.out.println("░░████╔═████║░██╔══╝░░██║░░░░░██║░░██╗██║░░██║██║╚██╔╝██║██╔══╝░░");
		Thread.sleep(550);
		System.out.println("░░╚██╔╝░╚██╔╝░███████╗███████╗╚█████╔╝╚█████╔╝██║░╚═╝░██║███████╗");
		Thread.sleep(750);
		
		System.out.println("");
		System.out.println("");
		System.out.println("████████╗░█████╗░");
		Thread.sleep(550);
		System.out.println("╚══██╔══╝██╔══██╗");
		Thread.sleep(550);
		System.out.println("░░░██║░░░██║░░██║");
		Thread.sleep(550);
		System.out.println("░░░██║░░░██║░░██║");
		Thread.sleep(550);
		System.out.println("░░░██║░░░╚█████╔╝");
		Thread.sleep(550);
		System.out.println("░░░╚═╝░░░░╚════╝░");
		Thread.sleep(750);

		System.out.println("");
		System.out.println("");
		System.out.println("██████╗░░█████╗░░█████╗░██╗░░██╗");
		Thread.sleep(550);
		System.out.println("██╔══██╗██╔══██╗██╔══██╗██║░██╔╝");
		Thread.sleep(550);
		System.out.println("██████╔╝██║░░██║██║░░╚═╝█████═╝░");
		Thread.sleep(550);
		System.out.println("██╔══██╗██║░░██║██║░░██╗██╔═██╗░");
		Thread.sleep(550);
		System.out.println("██║░░██║╚█████╔╝╚█████╔╝██║░╚██╗");
		Thread.sleep(550);
		System.out.println("╚═╝░░╚═╝░╚════╝░░╚════╝░╚═╝░░╚═╝");
		Thread.sleep(750);

		System.out.println("");
		System.out.println("");
		System.out.println("██████╗░░█████╗░██████╗░███████╗██████╗░");
		Thread.sleep(550);
		System.out.println("██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗");
		Thread.sleep(550);
		System.out.println("██████╔╝███████║██████╔╝█████╗░░██████╔╝");
		Thread.sleep(550);
		System.out.println("██╔═══╝░██╔══██║██╔═══╝░██╔══╝░░██╔══██╗");
		Thread.sleep(550);
		System.out.println("██║░░░░░██║░░██║██║░░░░░███████╗██║░░██║");
		Thread.sleep(550);
		System.out.println("╚═╝░░░░░╚═╝░░╚═╝╚═╝░░░░░╚══════╝╚═╝░░╚═╝");
		Thread.sleep(750);

		System.out.println("");
		System.out.println("");
		System.out.println("░██████╗░█████╗░██╗░██████╗░██████╗░█████╗░██████╗░░██████╗");
		Thread.sleep(550);
		System.out.println("██╔════╝██╔══██╗██║██╔════╝██╔════╝██╔══██╗██╔══██╗██╔════╝");
		Thread.sleep(550);
		System.out.println("╚█████╗░██║░░╚═╝██║╚█████╗░╚█████╗░██║░░██║██████╔╝╚█████╗░");
		Thread.sleep(550);
		System.out.println("░╚═══██╗██║░░██╗██║░╚═══██╗░╚═══██╗██║░░██║██╔══██╗░╚═══██╗");
		Thread.sleep(550);
		System.out.println("██████╔╝╚█████╔╝██║██████╔╝██████╔╝╚█████╔╝██║░░██║██████╔╝");
		Thread.sleep(550);
		System.out.println("╚═════╝░░╚════╝░╚═╝╚═════╝░╚═════╝░░╚════╝░╚═╝░░╚═╝╚═════╝░");
		Thread.sleep(1500);
		
		System.out.println("");
		System.out.println("");
		System.out.println("🇷​​​​​🇺​​​​​🇱​​​​​🇪​​​​​🇸​​​​​");
		Thread.sleep(1000);
		System.out.println("1) select a virtual hand sign to play against the computer's.");
		Thread.sleep(1000);
		System.out.println("2)  Once you select a sign the computer will tell you what it picked and if what you picked beats it, loses to it, or ties to it.");
		Thread.sleep(1500);
		System.out.println("3) No changing the code so you always win");
		Thread.sleep(2000);

		System.out.println();
		System.out.println();
		//Askking player for  their move
		System.out.println("Press:");
		System.out.println("R for  Rock \nP for Paper \nS for  Scissors \nQ to Quit");
		//Player selects next move 
		String Player = sc.next();
		int games = 0;
		int wins = 0;
		int Losses = 0;
		int ties = 0;
		
		//Checking if the player wants to play or to Quit the game
		while(Player.equalsIgnoreCase("Q")==false){
		 
			//Tie conditions
			if (Computer == 1 & Player.equalsIgnoreCase("R")){
				System.out.println("👊 \n👊");
				Thread.sleep(500);
				System.out.println("That was a draw You both picked Rock");
				ties ++;
				}
			else if (Computer == 2 & Player.equalsIgnoreCase("P")){
				System.out.println("📄 \n📄");
				Thread.sleep(500);
				System.out.println("That was a draw You both picked Paper");
				ties ++;
		}
			else if (Computer == 3 & Player.equalsIgnoreCase("S")){
				System.out.println("✂️\n✂️");
				Thread.sleep(500);
				System.out.println("That was a draw You both picked Rock");
				ties ++;
  }

			//Wining conditions 
			else if (Computer == 2 & Player.equalsIgnoreCase("S")){
				System.out.println("✂️\n📄");
				Thread.sleep(500);
				System.out.println("You Win the Computer picked Paper");
				wins ++;
			}
			else if (Computer == 3 & Player.equalsIgnoreCase("R")){
				System.out.println("👊\n✂️\n");
				Thread.sleep(500);
				System.out.println("You Win the Computer picked Scissors");
				wins ++;
			}
			else if (Computer == 1 & Player.equalsIgnoreCase("P")){
				System.out.println("📄\n👊\n");
				Thread.sleep(500);
				System.out.println("You Win the Computer picked Rock");
				wins ++;
			}

			//Losing conditions 
			else if (Computer == 1 & Player.equalsIgnoreCase("S")){
				System.out.println("✂️\n👊\n");
				Thread.sleep(500);
				System.out.println("You lose the Computer picked Rock");
				Losses ++;
			}
			else if (Computer == 2 & Player.equalsIgnoreCase("R")){
				System.out.println("👊\n📄\n");
				Thread.sleep(500);
				System.out.println("You lose the Computer picked Paper");
				Losses ++;
			}
			else if (Computer ==3 & Player.equalsIgnoreCase("P")){
				System.out.println("📄\n✂️");
				Thread.sleep(500);
				System.out.println("You lose the Computer picked Scissors");
				Losses += 1;
					}

			else{
				System.out.println();
				System.out.println("Invalid Response \n");
			}
			Thread.sleep(1000);
			
			// Askes player for  their next move 
			System.out.println();
			System.out.println("Press:");
			System.out.println("R for  Rock \nP for Paper \nS for  Scissors \nQ to Quit");
			
			//Player selects next move 
			Player = sc.next();
			Computer = (int)(Math.random()*3)+1;	
			games += 1;
			Thread.sleep(500);
			}
		
		System.out.println();
		System.out.println();
		System.out.println("Thanks for  playing");
		Thread.sleep(1000);
		System.out.println("You played " + games + " games");
		Thread.sleep(1000);
		System.out.println("You won " + wins + " game(s)");
		Thread.sleep(1000);
		System.out.println("You lost " + Losses + " game(s)");
		Thread.sleep(1000);
		System.out.println("You tied " + ties + " game(s)");
		}
	}