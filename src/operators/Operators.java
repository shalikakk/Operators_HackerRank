
package operators;

import java.util.Scanner;

/**
 *
 * @author Shalika
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        //catculation
        double tip=(meal_cost*tip_percent)/100;
        double tax=(meal_cost*tax_percent)/100;
        double total=meal_cost+tip+tax;
        //total
           System.out.println("The total meal cost is "+Math.round(total)+" dollars.");
        
    }
    
}
