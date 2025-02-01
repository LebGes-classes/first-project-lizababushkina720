import java.util.Scanner;
public class Player {
	
	
	public void move(char [][] setka, String level){
	Scanner scan = new Scanner(System.in);
	Cleaner cleaner = new Cleaner();
	Labirint labirint = new Labirint();
	Menu menu = new Menu();
	int playerY = 0;
	int playerX=1;			
	
	while ( (playerY !=(labirint.getLabirintY()-1)) || (playerX!=(labirint.getLabirintX()-1)) ){
		String letter = scan.nextLine();
		switch (letter){
			case "s":  
				if((playerY+1) <=(labirint.getLabirintY()-1)){
					if(setka[playerY+1][playerX]!= 'H'){
						setka[playerY][playerX]= '.';
						setka[playerY+1][playerX]= '@';
						playerY = playerY+1;
						cleaner.clean();
					} else{
						cleaner.clean();
						System.out.println("бо-бо");
					}
				} else{
					cleaner.clean();
				    System.out.println("куда собрался?");
				}
				System.out.println(level);
				labirint.labirintPrint(setka);			
				break;
			case "w":  
				if((playerY-1) >=0){
					if(setka[playerY-1][playerX]!= 'H'){
						setka[playerY][playerX]= '.';
						setka[playerY-1][playerX]= '@';
						playerY = playerY-1;
						cleaner.clean();
					} else{
						cleaner.clean();
						System.out.println("бо-бо");
					}
				} else{
					cleaner.clean();
				    System.out.println("куда собрался?");
				}
				System.out.println(level);
				labirint.labirintPrint(setka);				
				break;
			case "d":  
				if((playerX+1) <=(labirint.getLabirintX()-1)){
					if(setka[playerY][playerX+1]!= 'H'){
						setka[playerY][playerX]= '.';
						setka[playerY][playerX+1]= '@';
						playerX = playerX+1;
						cleaner.clean();
					} else{
						cleaner.clean();
						System.out.println("бо-бо");
					}
				} else{
					cleaner.clean();
				    System.out.println("куда собрался?");
				}
				System.out.println(level);
				labirint.labirintPrint(setka);				
				break;
			case "a":  
				if((playerX-1) >=0){
					if(setka[playerY][playerX-1]!= 'H'){
						setka[playerY][playerX]= '.';
						setka[playerY][playerX-1]= '@';
						playerX = playerX-1;
						cleaner.clean();
					} else{
						cleaner.clean();
						System.out.println("бо-бо");
					}
				} else{
					cleaner.clean();
				    System.out.println("куда собрался?");
				}
				System.out.println(level);
				labirint.labirintPrint(setka);				
				break;
			case "m"  :
		 	    cleaner.clean();
		 	    menu.rules(); 
		 	    menu.choosedOption();
		 	    break;
		 	case "exit" :
		 	    cleaner.clean();
		 	    System.out.println("bye </3");
		 	    System.exit(0);
			default: 
				cleaner.clean();
				System.out.println("я тебя не понимаю(");
				System.out.println(level);
				labirint.labirintPrint(setka);	
		} 
	

	} 
	System.out.println("CONGRATS<3");

    


}}


		


	
		




