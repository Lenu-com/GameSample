import java.util.Scanner;

public class Battle {
    int playerWinCount;
    int comWinCount;

    Message message = new Message();

    void battleJudge(Number playerNumber, Number comNumber) {
        if (playerNumber.number > comNumber.number) {
            new Message().playerWinMessage();
            playerWinCount++;
        }

        if (playerNumber.number < comNumber.number) {
            new Message().playerLoseMessage();
            comWinCount++;
        }

        if (playerNumber.number == comNumber.number) {
            new Message().drawMessage();
        }
    }

    void battle() {
        message.battleCountMessage();

        Number playerNumber = new Number(new Scanner(System.in).nextInt());
        Number comNumber = new CreateRandomNumber().randNumber;

        message.comNumberMessage(comNumber);
        battleJudge(playerNumber, comNumber);

    }
}
