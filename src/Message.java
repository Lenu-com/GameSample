public class Message {

    GameCount gameCount = new GameCount();

    void battleCountMessage() {
        System.out.print(gameCount.gameCount.number + "回戦目。1~5の数字を入力>");
        gameCount.countUp();
    }

    void playerWinMessage() {
        System.out.println("あなたの勝ち\n");
    }

    void playerLoseMessage() {
        System.out.println("あなたの負け\n");
    }

    void drawMessage() {
        System.out.println("引き分け\n");
    }

    void comNumberMessage(Number comNumber) {
        System.out.println("PCの数字:" + comNumber.number);
    }

    void lastJudgeMessage(Battle battle) {
        System.out.print(battle.playerWinCount + "対" + battle.comWinCount + "で");

        if (battle.playerWinCount > battle.comWinCount) playerWinMessage();
        if (battle.playerWinCount < battle.comWinCount) playerLoseMessage();
        if (battle.playerWinCount == battle.comWinCount) drawMessage();
    }
}
