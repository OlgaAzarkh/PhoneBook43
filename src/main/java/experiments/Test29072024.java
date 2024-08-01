package experiments;

import com.sun.net.httpserver.Authenticator;
import helpers.RetryAnalyzer;
import org.apache.poi.ss.formula.functions.Today;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.SecureRandom;
import java.sql.SQLOutput;

public class Test29072024 {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void generateRandomStringTestPositive(){
        Assert.assertEquals(generateRandomString(10).length(),12);
    }




    public static void main(String[] args) {
        DayOfWeek today=DayOfWeek.FRIDAY;
        //System.out.println("Today is "+ today);
        switch (today)
        {
            case MONDAY:
                System.out.println("Today is monday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("something went wrong");
                break;



        }


        /*
        System.out.println(generateRandomString(1));

        /*
        int [] numbers={1,2,3,4,5,6,7,8,};
*/

        dayPicker(1);
    System.out.println("My \u001B[31mfirst test!");
        /*for (int i=0; i<10; i++)
        {
            System.out.println("Number "+i);
        }*/

/* byte b1= -127;
short s=-32768;
int i=76538653;

boolean t=true;
char a='a';
char b='b';
*/

    }
    public static String generateRandomString(int length)
    {
        if(length<=0){
            throw new IllegalArgumentException("");
        }
        String characters="PVPVPVPVPVPVPVPV";
        StringBuilder randomString=new StringBuilder(length);
        SecureRandom random   =new SecureRandom();

        for (int i=0; i<length; i++){
            int randomIndex=random.nextInt(characters.length());
            randomString.append(characters.charAt(randomIndex));
        }
return randomString.toString();
    }

    public static int add(int a, int b)
    {
        return a+b;
    }
    public static double add(double a, double b)
    {
        return a+b;
    }
//My comment

    /**
     * The method
     * @param a my first param
     * @param b my second param
     */

    public static void myMethod(int a, int b)
    {
        int res=a+b;
    }
public static void theMethodGenerate (int a, int b)
{
    int res=a+b;
}
public static void dayPicker(int day)
{
    switch(day){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
        case 3:
            System.out.println("Wednesday");
            break;
        default:
            System.out.println("Invalid data");
            break;
    }
}

}
