package others;

import java.util.Scanner;

public class MostLettersPrefix {

    public static void main(String[] args)
    {
        String input;
        int rightMost = 0;

        Scanner in = new Scanner(System.in);
        input = in.nextLine();

        if (input == null)
        {
            System.out.println("Empty input!");
            return;
        }

        for (int i = input.length() - 1; i > rightMost; i--)
        {
            char c = input.charAt(i);
            for (int r = 0; r <= i; r++)
            {
                if (c == input.charAt(r))
                {
                    rightMost = r > rightMost ? r: rightMost;
                    break;
                }
            }
        }

        String prefix = input.substring(0, rightMost + 1);
        System.out.println(prefix);
    }
}
