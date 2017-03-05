package tasks;

/**
 * Created by Maniak on 05.03.2017.
 */
public class lines {
    public static void main(String[] args) {
      String eight = " 8 8 8 8 8 8 8 8 8 8";
      System.out.println(eight);

        
        for (int i = 0; i < 10; i++) {
          System.out.print(8);
            for (int c = 0; c < 19;c++) {
              System.out.print(" ");
            }
          System.out.println(8);
        }
      System.out.println(eight);
  }
}
