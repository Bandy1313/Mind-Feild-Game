/**
 * MainHub - Main entry point and game controller for Mind Field
 * 
 * Handles:
 * - Game initialization
 * - Title screen display
 * - Game flow and level management
 */
import java.util.Scanner;

public class MainHub {
    static Scanner scan = new Scanner(System.in);
    static Level1 level1 = new Level1();

    /**
     * Loads and starts the appropriate game section
     * @param input User input from title screen
     */
    public static void loadGame(String input) {
        input = input.toLowerCase().trim();
        if (input.equals("start")) {
            System.out.println("\n=== STARTING GAME ===\n");
            level1.play();
        } else if(input.equals("exit")) {
            System.out.println("Thanks for playing Mind Field!");
            System.exit(0);
        } else {
            System.out.println("Invalid input. Please type 'start' or 'exit'");
        }
    }

    /**
     * Main method - Entry point for the game
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Display title screen
        TitleScreen titleScreen = new TitleScreen("START", "EXIT");
        System.out.println("\n");
        System.out.println(titleScreen);
        System.out.println("\nEnter 'start' to play or 'exit' to quit: ");
        
        // Get user input
        String userInput = scan.nextLine();
        loadGame(userInput);
    }
}
