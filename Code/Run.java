package lab1;
import java.io.StringReader;
public class Run {
	public static int check=0;
	public static String input;

	Run(String s) {
	  this.input=s;
	}
  public static void main(String args[]) throws ParseException {
  
		try {
			StringReader in = new StringReader(input);
			grammar g=new grammar(in);
	    	g.Input();
	    	System.out.println("Syntax is okay\n");
	    	check=1;
	    }
	    catch(Throwable e) {
            // Catching Throwable is ugly but JavaCC throws Error objects!
            System.out.println("Syntax check failed\n");
            check=0;
        }
   
  }

}
