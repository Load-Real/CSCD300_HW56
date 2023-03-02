import java.util.Scanner;

public class Tester {
	
	public static void main(String args[]) {
      Scanner kb = new Scanner(System.in);
      
		System.out.print("Please enter the infix expression to process: ");
      String infixExpression = kb.nextLine();
      
      String postfixExpression = LinkedStack.infixToPostfix(infixExpression);
      System.out.println("The postfix expression for the input infix is: " + postfixExpression);
      
      int valueOfPostfix = LinkedStack.postfixEvaluation(postfixExpression);
      System.out.println("The final result after evaluating the postfix is: " + valueOfPostfix);
	}
}