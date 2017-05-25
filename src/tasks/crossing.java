package tasks;

/**
 * Created by Maniak on 25.05.2017.
 * 2 circles - 1 distance, u can check if they cross.
 */
public class crossing {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        int r = 2;
        int x2 = 1;
        int y2 = 3;
        int r2 = 2;
        System.out.print(calculate(x,y,r,x2,y2,r2));
    }
    static boolean calculate(int x, int y, int r, int x2, int y2, int r2){
        double distance = ((Math.pow(x,2)-(2*x*y)+Math.pow(y,2))+(Math.pow(x2,2)-(2*x2*y2)+Math.pow(y2,2)));
        return r+r2 >= (int) Math.sqrt(distance);
    }
}

