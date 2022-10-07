public class UC3_CheckForOption {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int Position = 0;
        int DiceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("Dice Number is: " + DiceNumber);

        int option = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println("Selected Player Option : " + option);

        switch (option) {
            case 1:
                Position = DiceNumber + Position;
                System.out.println("Position For The Player After The Ladder Is : " + Position);
                break;

            case 2:
                Position = Position - DiceNumber;
                System.out.println("Position For The Player After The Snake Is : " + Position);
                break;
            default:
                System.out.println("No play");
        }

    }
}