import java.util.Scanner;

public class Level1 implements levels {
    private String[][] map;
    private Bomb bomb = new Bomb("B");
    private User player = new User("x");
    private PlayerControler playerControler = new PlayerControler(map, player.getPlayer(), 2, 1);
    
    @Override
    public void size(int length, int width) {
        map = new String[length][width];
    }

    @Override
    public void playerSpawn(String[][] map) {
        map[2][1] = player.getPlayer();
    }

    public void printBoard() {
        for(int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++ ) {
                System.out.print("[" + map[i][j] + "]");
            }
            System.out.println();
        }
    }

    
    public void play() {
        //sets the size of level1
        size(3,3);

        //prints the map with emty values
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                map[i][j] = " ";
            }
        }

       
        //randomly places the bombs on said map 
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                int result = bomb.explode();
                if(result <= 2) {
                    map[i][j] = bomb.getBOMB();
                }
            }
        }
        //print the board
        printBoard();

        //Game Loop
        boolean playing = true;
        while(playing) {
            printBoard();
            playerSpawn(map);
            System.out.println("Enter your move (up, down, left, right): ");
            Scanner scan = new Scanner("System.in");
            String input = scan.nextLine();
            if(input.equals("exit")) {
                System.out.println("Thanks for Playing!");
                playing = false;
            } else if(input.equals("up") || input.equals("down")||input.equals("left")||input.equals("right")) {
                playerControler.isValidPosition();
                playerControler.playerMovement(input);
                printBoard();

            }
        }

    }
}