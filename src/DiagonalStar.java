public class DiagonalStar {
    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        }

        int row; //rows
        int col; //cols

        for (row = 0; row < number; row++){
            for (col = 0; col < number; col++){
                if (row == 0 || row == number - 1){
                    System.out.print("1");
                }else if (col == 0){
                    System.out.print("2");
                }else if (col == number - 1){
                    System.out.print("3");
                }else if (col == row){
                    System.out.print("4");
                }else if (col == number - 1 - row){
                    System.out.print("5");
                }else {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }
}
