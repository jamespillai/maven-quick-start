package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;



public class Application {
    
	
	public int countWordsInString(String words){
		String[] seperatewords = StringUtils.split(words, ' ');
		
		return (seperatewords == null )? 0: seperatewords.length;
		  
	}
	   
    public Application() {
        System.out.println ("Inside Application");
    }   
	
	public void countWords(String words){
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		System.out.println();
		
		for(String greet : greetings){System.out.println("Greeting: "+greet);}
		
	}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.countWords("This is james here.");
	
	int i= app.countWordsInString("This is james here. Hello");
	System.out.println("Count: "+ i);
    }
}