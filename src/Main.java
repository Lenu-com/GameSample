class Main {
    static final int MAX_BATTLE_TIME = 5;

    public static void main(String[] args) {
        Battle battle = new Battle();

        for (int i = 0; i < MAX_BATTLE_TIME; i++) {
            battle.battle();
        }

        new Message().lastJudgeMessage(battle);
    }
}