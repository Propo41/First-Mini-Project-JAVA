import java.io.FileReader;
import java.util.Scanner;
import java.lang.String;


public class Utilities
{
    private String[] movieNames = new String[100];
    public static  int l;
    private int i;


    public String readFile() throws Exception
    {

        FileReader fr = new FileReader("MovieNames.txt");
        Scanner sc = new Scanner(fr);

        i = 0;
        while (sc.hasNextLine())
        {
           movieNames[i] =  sc.nextLine();
           i++;
        }

        l = movieNames.length;

        String str = pickName();

       return str;

    }


    public void showName(char array[])
    {

            System.out.println(array);

    }

    public String pickName()
    {

        int r = ( (int)(  Math.random()*100  ) + 1 ) % 25;


        String pickedName = movieNames[r];
      //  System.out.println(pickedName);

        return pickedName;

    }


}
