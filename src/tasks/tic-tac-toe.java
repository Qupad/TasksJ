package tasks;

/**
 * Created by Maniak on 06.03.2017.\
 * PLAY IN SUPER FUN GAME crosses !!!!!1!!!!1
 */
import java.util.*;

        class Board {
            private int[][] board;
            public Board() {
                board = new int[][]{
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},
                };
            }
            int getCellValue(int x_index, int y_index) {
                return this.board[x_index][y_index];
            }

            void setCellValue(int x_index, int y_index, int value) {
                this.board[x_index][y_index] = value;
            }

            void printBoard() {
                    System.out.println( this.board[0][0] + "  " + this.board[0][1] + "  " + this.board[0][2]);
                    System.out.println( this.board[1][0] + "  " + this.board[1][1] + "  " + this.board[1][2]);
                    System.out.println( this.board[2][0] + "  " + this.board[2][1] + "  " + this.board[2][2]);
            }
            boolean checkLoser(){

            if (this.getCellValue(0, 0) > 10 && this.getCellValue(0, 1) > 10 && this.getCellValue(0, 2) > 10 && this.getCellValue(1, 0) > 10 && this.getCellValue(1, 1) > 10 && this.getCellValue(1, 2) > 10 && this.getCellValue(2, 0) > 10 && this.getCellValue(2, 1) > 10 && this.getCellValue(2, 2) > 10)
                return true;
            else
                return false;
            }
            boolean checkWin()
//88 is X
//79 is O
             {
        if (this.getCellValue(0,0) == this.getCellValue(1,0) && this.getCellValue(1,0) == this.getCellValue(2,0))
            return true;
            else if (this.getCellValue(0, 1) == this.getCellValue(1, 1) && this.getCellValue(1, 1) == this.getCellValue(2, 1))
                return true;
            else if (this.getCellValue(0, 2) == this.getCellValue(1, 2) && this.getCellValue(1, 2) == this.getCellValue(2, 2))
                return true;
            else if (this.getCellValue(0, 0) == this.getCellValue(0, 1) && this.getCellValue(0, 1) == this.getCellValue(0, 2))
                return true;
            else if (this.getCellValue(1, 0) == this.getCellValue(1, 1) && this.getCellValue(1, 1) == this.getCellValue(1, 2))
                return true;
            else if (this.getCellValue(2, 0) == this.getCellValue(2, 1) && this.getCellValue(2, 1) == this.getCellValue(2, 2))
                return true;
            else if (this.getCellValue(0, 0) == this.getCellValue(1, 1) && this.getCellValue(1, 1) == this.getCellValue(2, 2))
                return true;
            else if (this.getCellValue(2, 0) == this.getCellValue(1, 1) && this.getCellValue(1, 1) == this.getCellValue(0, 2))
                return true;
            else
                return false;
        }
    //return true if win
    //else return false
        }
        class cross {
            public static void main(String[] args) {
                Board b = new Board();
                char xxx = 'O';
                Scanner sc = new Scanner(System.in);
                b.printBoard();
                for (; ;) {
                    if (xxx == 'O')
                    {
                        xxx = 'X';
                    }
                    else
                    {
                        xxx = 'O';
                    }
                    System.out.print("Pls enter " + xxx + " number: ");
                    int a = sc.nextInt();
                    if (a == 1 && b.getCellValue(0,0) < 10) {
                        b.setCellValue(0, 0, xxx); b.printBoard();}
                    else if (a == 2 && b.getCellValue(0,1) < 10) {
                        b.setCellValue(0, 1, xxx); b.printBoard();}
                    else if (a == 3 && b.getCellValue(0,2) < 10){
                        b.setCellValue(0, 2, xxx); b.printBoard();}
                    else if (a == 4 && b.getCellValue(1,0) < 10){
                        b.setCellValue(1, 0, xxx); b.printBoard();}
                    else if (a == 5 && b.getCellValue(1,1) < 10){
                        b.setCellValue(1, 1, xxx); b.printBoard();}
                    else if (a == 6 && b.getCellValue(1,2) < 10){
                        b.setCellValue(1, 2, xxx); b.printBoard();}
                    else if (a == 7 && b.getCellValue(2,0) < 10){
                        b.setCellValue(2, 0, xxx); b.printBoard();}
                    else if (a == 8 && b.getCellValue(2,1) < 10){
                        b.setCellValue(2, 1, xxx); b.printBoard();}
                    else if (a == 9 && b.getCellValue(2,2) < 10){
                        b.setCellValue(2, 2, xxx); b.printBoard();
                    } else {
                        System.out.println("Fuck u.");
                    }
                        if (b.checkWin()) {
                            System.out.print(xxx+" is Winner Winner - chicken dinner!");
                            break; }
                        else if (b.checkLoser()) {
                            System.out.print("Cucked.");
                            break; }
                }
            }
        }
