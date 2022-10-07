public class UC4_WinningPositionHundred {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int startPosition = 0;
        System.out.println("Player staring position is : " + startPosition);
        int position = 0;
        while (position < 100) {
            int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("diceNumber is : " + diceNumber);
            int option = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("selected player option : " + option);
            switch (option) {
                case 1:
                    position = diceNumber + position;
                    System.out.println("position for the player after the ladder is : " + position);
                    break;
                case 2:
                    position = position - diceNumber;
                    if(position < 0) {
                        position = 0;
                        System.out.println("position for the player after the Snake is : " + position);
                        break;
                    }
            }
        }
    }
}