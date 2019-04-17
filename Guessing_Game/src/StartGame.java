import java.util.Scanner;

public class StartGame
{
    private int totalGuess=10;
    private int wrongGuess=1;
    int l = Logic.canvasTemp.length;
    char ch;

    void startGame() throws  Exception
    {
        Scanner sc = new Scanner(System.in);
        Utilities util = new Utilities();
        Logic logic = new Logic();

        String pickedName = util.readFile();
        logic.createName(pickedName);

        System.out.printf("Guess the word\n");
        System.out.println( logic.canvas);

        for(int i=1; i<totalGuess+l; i++)
        {
            if(wrongGuess==10)
            {
                System.out.printf("Noobshit! You failed!\n");
                System.exit(-1);
            }
            if(logic.checkIfComplete())
            {
                System.out.printf("Success! Congrats!\n");
                System.out.printf("********************");
                System.exit(0);
            }

            System.out.printf("Enter character : \n");

            ch = sc.nextLine().charAt(0);

            if(logic.applyLogic(ch))
            {
                System.out.printf("Good job! keep on going!\n");
                util.showName(logic.canvas);
            }
            else
            {
                System.out.println("Fool! You have " + (totalGuess-wrongGuess) + " more left!");
                wrongGuess++;

            }


        }

    }



}
