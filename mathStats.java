import java.util.Scanner;
import java.util.InputMismatchException;
public class mathStats
    //(',')
{
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        double[] userDouble = new double [5];
        double total =0;
        double average =0;
        double percentage20=0;
        double maximum;
        double minimum;
        int i=0;
        while(i<5)
        {
           
                try
                {
                      System.out.println("Please enter a floating number.");
                     userDouble[i] = scanner.nextDouble();
                     i++;
                   
                }
                catch (InputMismatchException e)
                {
                    
                     System.out.println("Please enter a number that has increments passed the decimal place. "+e.getMessage());
                    scanner.next();
                   
                }
           
            
   
        }
         scanner.close();
        
        maximum = userDouble[0];
        minimum = userDouble[0];

        for (int j = 0;j < 5; j++)
            {
            total += userDouble[j];
            }
        average = total /5;
        percentage20 = total * .2;

        for(int k = 0; k < 5; k++)
        {
            if(maximum < userDouble[k])
            { maximum = userDouble[k];}
             if (minimum > userDouble[k])
             {minimum = userDouble[k];}
        }
        System.out.println("The total of your doubles are : " + total);
        System.out.println("The average of your doubles are : " + average);
        System.out.println("20 % of your doubles are : " + percentage20);
        System.out.println("The maximum of your doubles are : " + maximum);
        System.out.println("The minimum of your doubles are : " + minimum);
        
    }

}
