import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String username = new String();
        char ch;

        System.out.println("Do you want to start the game?");
        ch = sc.nextLine().charAt(0);
        if (ch == 'Y' || ch == 'y') {
            StartGame p = new StartGame();
            p.startGame();

        } else {
            System.out.println("what the fuck you doing here then??");
            System.exit(1);
        }

    }


}
