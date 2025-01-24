package LPU_java;
import java.util.*;

public class Palandrome {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enbter the number : ");
            int a=sc.nextInt();
            int b=a;
            int x=0;
            while(a>0){
                int r=a%10;
                x=(x*10)+r;
                a=a/10;
            }
            if(x==b){
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }

        }
    }

