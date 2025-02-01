import java.util.Scanner;
public class Menu{
	    Cleaner cleaner = new Cleaner();
	public void rules(){
		System.out.println("Вам нужно дойти до Х ");
        System.out.println("Посмотреть управление - rules ");
        System.out.println("Обратно в меню - menu ");
        System.out.println("Выйти - exit ");
        System.out.println("level 1 - 1 ");
        System.out.println("level 2 - 2 ");
        System.out.println("level 3 - 3 ");
	}
	public void Back(){
		
		cleaner.clean();
		rules(); 
		choosedOption();
	}
	public void choosedOption(){
		Scanner scan = new Scanner(System.in);
			
		Labirint labirint = new Labirint();
		Player player = new Player();
		String option = scan.nextLine();
		switch(option){
		 case "rules"  :
		 	cleaner.clean();
		 	rules(); 
		 	System.out.println("W - вверх, S - вниз, A - влево, D - вправо");
		 	choosedOption();
		 	break;
		  case "menu"  :
		 	cleaner.clean();
		 	rules(); 
		 	choosedOption();
		 	break;
		 case "1"  : 
		 	cleaner.clean();
		 	System.out.println("либиринт");
		 	labirint.labirintPrint(labirint.getLabirint1());
		 	player.move(labirint.getLabirint1(),"level 1");
		 	
		 	player.move(labirint.getLabirint2(),"level 2");
		 	
		 	player.move(labirint.getLabirint3(),"level 3");
		 	Back();
		 	break;
		 case "2"  : 
		 	cleaner.clean();
		 	System.out.println("либиринт");
		 	labirint.labirintPrint(labirint.getLabirint2());
		 	player.move(labirint.getLabirint2(),"level 2");
		 	
		 	player.move(labirint.getLabirint3(),"level 3");
		 	Back();
		 	break;
		 case "3"  : 
		 	cleaner.clean();
		 	System.out.println("либиринт");
		 	labirint.labirintPrint(labirint.getLabirint3());
		 	player.move(labirint.getLabirint3(),"level 3");
		 	Back();
		 	break;
		 case "exit" :
		 	cleaner.clean();
		 	System.out.println("bye </3");
		 	System.exit(0);
		 default:
			cleaner.clean();
		 	rules(); 
		 	System.out.println("я тебя не понимаю( ");
		 	choosedOption();


		
		}
	}




	
}


