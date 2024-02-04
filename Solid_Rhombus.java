import java.util.*;

public class Solid_Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            //space
            for(int j=1;j<=num-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//output:-

//10
//
//                                    * * * * * * * * * *
//                                  * * * * * * * * * *
//                                * * * * * * * * * *
//                              * * * * * * * * * *
//                            * * * * * * * * * *
//                          * * * * * * * * * *
//                        * * * * * * * * * *
//                      * * * * * * * * * *
//                    * * * * * * * * * *
//                  * * * * * * * * * *

