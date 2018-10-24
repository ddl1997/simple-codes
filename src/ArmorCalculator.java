import java.util.Scanner;

public class ArmorCalculator {

    private final static double BASE_ARMOR = 50;

    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);

        System.out.print("Type: ");
        String type = in.next();

        while (!type.equals("q"))
        {
            switch (type)
            {
                case "atd" :
                    System.out.print("Please input the armor: ");
                    int armor = in.nextInt();
                    System.out.println("Damage reduce: " + ArmorToDamageReduce(armor));
                    break;
                case "dta" :
                    System.out.print("Please input the damage reduce rate: ");
                    int reduce = in.nextInt();
                    System.out.println("Armor: " + DamageReduceToArmor(reduce));
                    break;
            }
            System.out.println("\nType: ");
            type = in.next();
        }

        in.close();

    }

    public static double ArmorToDamageReduce(int armor)
    {
        return armor / (armor + BASE_ARMOR);
    }

    public static double DamageReduceToArmor(double reduce)
    {
        if (reduce >= 1 || reduce <= 0)
            return -1;
        return (BASE_ARMOR * reduce) / (1 - reduce);
    }
}
