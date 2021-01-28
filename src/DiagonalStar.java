public class DiagonalStar {
    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        } else {
            int row; //rows
            int col; //cols

            for (row = 0; row < number; row++){
                for (col = 0; col < number; col++){
                    if (row == 0 || row == number - 1 || col == 0|| col == number - 1 || col == row || col == number - 1 - row){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }


    }
}
