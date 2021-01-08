package mahatimadhira;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int num,temp,rem,result=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check for Armstrong property");
        num=sc.nextInt();
        temp=num;
        while(num>0)
        {
            rem=num%10;
            num=num/10;
            result=result+(rem*rem*rem);
        }
        if(temp==result)
            System.out.println(temp + " is an Armstrong Number");
        else
            System.out.println(temp + " is not an Armstrong Number");
    }
}
