import java.util.Arrays;

public class Logic
{

    public static char[] canvas = new char[25];
    public static char[] canvasTemp = new char[25];
    public int guessLeft = 10;
    private int i,l;

    void createName(String str)
    {
        l = str.length();
        for( i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==' ')
            {
                canvas[i]=' ';

            }

            else
            {
                canvas[i]='_';

            }

        }
        canvasTemp = str.toCharArray();


    }

    public boolean applyLogic(char ch)
    {
        Boolean found = false;

        for(int i=0; i<canvasTemp.length; i++) //checks if the pickedname contains the char ch
        {
            if(canvasTemp[i]==ch)
            {
                canvas[i]=ch;
                canvasTemp[i]='_';
                found = true;

                 return true;
            }
        }
        return false;

    }

    boolean checkIfComplete()
    {

        for(int i=0; i<l; i++)
        {
            if(canvas[i]=='_')
            {

                return false;

            }
        }
        return true;

    }


}
