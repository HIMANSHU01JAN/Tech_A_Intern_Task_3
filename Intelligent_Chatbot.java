import java.util.Scanner;

public class Intelligent_Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! How can I assist you today?");

        while (true) {
            String userInput = scanner.nextLine();
            String response = generateResponse(userInput);
            System.out.println("Chatbot: " + response);
        }
    }

    public static String generateResponse(String userInput) {
        // Implement your logic to generate responses based on user input
        // You can use if-else statements, switch cases, or any other method you prefer
        // For this example, let's keep it simple with a few predefined responses

        if (userInput.contains("hello")) {
            return "Hi there! How can I help you?";
        } else if (userInput.contains("bye")) {
            return "Goodbye! Have a great day!";
        } else {
            return "I'm sorry, I didn't understand that.";
        }
    }
}
