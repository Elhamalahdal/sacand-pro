import java.util.Arrays;

/**
 * Created by user on 16/01/2022.
 */
public class RoterArry {
    public static void main(String[] args) {
        int a[]={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        System.out.println("after shift right");
        System.out.println(Arrays.toString(shiftright(a)));

    }
    public static int[]shiftright (int[]y)
    {
       int t=y[y.length-1];
        for (int i =  y.length; i>0; i++) {
            y[i]=y[i-1];

        }
        y[0]=t;
        return y;
    }
}
