public class MethodDemo {
    public static void main(String[] args){
	greet(); //calls the greet method and runs the program inside it
	printMessage("This is my message!"); //calls the printMessage method and runs the program inside it
	}

	public static void greet() {
	    System.out.println("Hello from the greet method!"); //displays this output when the method is called
	}

	public static void printMessage(String message) {
	    System.out.println(message); //displays the message inside the method when it is called
	}
}
