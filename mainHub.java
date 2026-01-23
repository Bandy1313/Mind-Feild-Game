import java.util.Scanner; 

public class mainHub {
    static Scanner scan = new Scanner(System.in);
    static Player player = new Player("x");
    static Level1 level1 = new Level1(player);


    public static void loadGame(String input) {
        if (input.equals("start")) {
            level1.play();
        } else if(input.equals("exit")) {
            System.exit(1);
        }
    }
    public static void main(String args[]) {
        TitalScrean titalScrean = new TitalScrean("start", "end");
        System.out.println(titalScrean);
        
        String userInput1 = scan.nextLine();
        loadGame(userInput1);
        
        //step 3 user is promted to to click begin
        //step 4 3x3 map is generated, bombs are randomly placed

    }
}