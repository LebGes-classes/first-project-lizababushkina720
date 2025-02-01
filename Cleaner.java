public class Cleaner{
	public void clean(){
	try {
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
} 
    catch (Exception E) {
    System.out.println(E);
}
}}