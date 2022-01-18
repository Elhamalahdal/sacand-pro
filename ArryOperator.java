import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 16/01/2022.
 */
public class ArryOperator {
    int x[];
    int numofELements;
    public ArryOperator(){
        x=new int[5];
        numofELements=0;
    }
    public int addElment(int e){
        if (numofELements<x.length){
            x[numofELements]=e;
            numofELements++;
            return 0;
        }
        return -1;
    }


    public static void main(String[] args) {
        ArryOperator test=new ArryOperator();
        Scanner in=new Scanner(System.in);
        System.out.println("input elements");
        for (int i = 0; i <7 ; i++) {
            if (test.addElment(in.nextInt())==0)
            System.out.println("added sucessfully");
            else
            System.out.println("arry is full");
            System.out.println(Arrays.toString(test.x));

        }

        }

    }


