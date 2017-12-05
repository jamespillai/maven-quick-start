package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }
	
	public void countWords(String words){
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		
		for(String greet : greetings){System.out.println("Greeting: "+greet);}
		
	}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.countWords("This is james here.");
    }
}