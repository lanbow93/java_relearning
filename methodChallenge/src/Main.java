public class Main{
    public static void main(String[] args) throws Exception {
        displayHighScorePosition("Lance", calculateHighScorePosition(1500));
        displayHighScorePosition("Lance", calculateHighScorePosition(1000));
        displayHighScorePosition("Lance", calculateHighScorePosition(500));
        displayHighScorePosition("Lance", calculateHighScorePosition(100));
        displayHighScorePosition("Lance", calculateHighScorePosition(25));
    }
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        } else if(playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if(playerScore >= 100 && playerScore < 500){
            return 3;
        } else {
            return 4;
        }
    }
}
