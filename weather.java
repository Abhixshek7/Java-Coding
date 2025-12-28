import java.util.*;

public class weather {
    public static void main(String[] args){
        Scanner climate = new Scanner(System.in);
        System.out.println("How is the weather today ? : ");
        System.out.println("1. Sunny");
        System.out.println("2. Cloudy");
        System.out.println("3. Rainy");
        System.out.println("4. Humid");
        System.out.println("5. Cool");
        int a = climate.nextInt();
        climate.nextLine();

        if(a==1){
            System.out.print("Dont spend too much time under the sun. Otherwise there wont be a difference between you and your dick. Oh sorry I forgot you dont have one!");
        }
        else if(a==2){
            System.out.print("If the weather is cloudy then dont forget your fucking umbrella. You can trust your ex for once, but you cannot trust a cloudy day.");
        }
        else if(a==3){
            System.out.print("Finally you get to make your girlfriend wet!!!");
        }
        else if(a==4){
            System.out.print("You gonna smell much worse than your sewers so get your smelly ass and get a fucking shower!!");
        }
        else if(a==5){
            System.out.print("Just because it is cool and pleasant doesn't mean that you gonna get some bitches.");
        }
        else{
            System.out.print("You living in some other planet or what?");
        }
        
        climate.close();
    }
}
 