/**
 * TitleScreen - Main menu screen for the Mind Field game
 * 
 * Displays:
 * - Game title
 * - Start button
 * - Exit button
 */
public class TitleScreen {
    public String startButton;
    public String exitButton;

    /**
     * Constructor - Initializes the title screen
     * @param startButton Text for start button
     * @param exitButton Text for exit button
     */
    public TitleScreen(String startButton, String exitButton) {
        this.startButton = startButton;
        this.exitButton = exitButton;
    }

    /**
     * Sets the start button text
     * @param startButton New start button text
     */
    public void setStart(String startButton) {
        this.startButton = startButton;
    }

    /**
     * Sets the exit button text
     * @param exitButton New exit button text
     */
    public void setExit(String exitButton) {
        this.exitButton = exitButton;
    }

    /**
     * Gets the start button text
     * @return Start button text
     */
    public String getStart() {
        return startButton;
    }

    /**
     * Gets the exit button text
     * @return Exit button text
     */
    public String getExit() {
        return exitButton;
    }

    /**
     * Generates the title screen UI string
     * @return Formatted title screen display
     */
    @Override
    public String toString() {
        String UI = String.format(
            "|********************|\n" +
            "|      MindField     |\n" +
            "|   By Tyler Harvey  |\n" +
            "|  %s          %s|\n" +
            "|********************|", 
            startButton, exitButton
        );
        return UI;
    }
}
