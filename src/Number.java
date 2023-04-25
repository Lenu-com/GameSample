public class Number {
    static final int MIN = 1;
    static final int MAX = 5;

    int number;

    Number(int number) {
        if (number < MIN || number > MAX) throw new IllegalArgumentException("入力された値が不正です。1~5の数字を入力してください。");
        this.number = number;
    }
}
