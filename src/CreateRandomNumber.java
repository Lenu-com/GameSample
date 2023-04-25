import java.util.Random;

public class CreateRandomNumber {
    Number randNumber;

    CreateRandomNumber() {
        randNumber = new Number(new Random().nextInt(1, 5));
    }
}
