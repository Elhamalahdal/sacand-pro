import java.util.Arrays;

/**
 * Created by user on 16/01/2022.
 */
public class RotateArry {
    public static void main(String[] args) {
        int a[]={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        System.out.println("after shift left");
        System.out.println(Arrays.toString(shiftleft(a)));

    }
    public static int[]shiftleft (int[]x)
    {
        int t =x[0];
        for (int i = 0; i < x.length; i++) {
            x[i]=x[i+1];

        }
        x[x.length-1]=t;
        return x;
    }
}
