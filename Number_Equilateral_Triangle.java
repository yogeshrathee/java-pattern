import java.util.*;

public class Number_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}

//output:-

//  9

//                                              1
//                                          2       2
//                                      3       3       3
//                                  4       4       4       4
//                              5       5       5       5       5
//                          6       6       6       6       6       6
//                      7       7       7       7       7       7       7
//                  8       8       8       8       8       8       8       8
//              9       9       9       9       9       9       9       9       9
