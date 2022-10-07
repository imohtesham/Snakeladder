public class UC2_UseOFRandom {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("DiceNumber is : " + diceNumber);
    }
}
