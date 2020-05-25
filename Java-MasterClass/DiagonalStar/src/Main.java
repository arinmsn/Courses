public class Main {
    public static void main(String[] args) {
        printSquareStar(10);
    }

    //public class DiagonalStar{}
    public static void printSquareStar(int number){
        String star = "*";
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= number; row++){
                for (int column = 1; column <= number; column++){

                    // first or last row
                    if (row == 1 || row == number){
                        System.out.print(star);
                    }
                    // first or last column
                    else if (column == 1 || column == number){
                        System.out.print(star);
                    }
                    else if (row == column){
                        System.out.print(star);
                    }
                    // when currentRow is current row #
                    else if (column == number - row + 1) {
                        System.out.print(star);
                    }
                    else System.out.print(" ");
                }
                // End of line
                System.out.println();
            }
        }
    }
}
