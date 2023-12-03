public class Star2 {
    public static void main(String[] args) {

        int row=5,col=1,space=4;
       int i=1;
        while(i<=5) {
            int j = 1;

            while (j <= space) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= col) {
                System.out.print("* ");
                k++;
            }
            if (i <= 3) {
                col++;
                space--;

            } else {
                col--;
                space++;
            }

            System.out.println();
            i++;
        }

    }
}
