public class TitalScrean {
    public String startButton;
    public String exitButton;

    public TitalScrean( String startButton, String exitButton) {
        this.startButton = startButton;
        this.exitButton = exitButton;
    }

    public void setStart(String startButton) {
        this.startButton = startButton;
    }

     public void setExit(String exitButton) {
        this.exitButton = exitButton;
    }

    public String getStart() {
        return startButton;
    }

    public String getExit() {
        return exitButton;
    }

    public String toString() {
        String UI = String.format("|********************|\n|       MindFeild    |\n|    By Tyler Harvey |\n|  %s          %s|\n|********************|", startButton, exitButton);
        return UI;
    }
}
