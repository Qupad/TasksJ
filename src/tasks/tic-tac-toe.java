package tasks;

/**
 * Created by Maniak on 06.03.2017.\
 * PLAY IN SUPER FUN GAME crosses !!!!!1!!!!1
 */
import java.util.*;

        class Board {
            private char[][] board;
            public Board() {
                board = new char[][]{
                        {49, 50, 51},
                        {52, 53, 54},
                        {55, 56, 57},
                };
            }

            int getCellValue(int x_index, int y_index) {
                return this.board[x_index][y_index];
            }

            void setCellValue(int x_index, int y_index, int value) {
                this.board[x_index][y_index] = (char) value;
            }

            void printBoard() {
                for (int i = 0; i < board.length;i++ ) {
                    for (int j = 0; j < board.length; j++) {
                        System.out.print(this.board[i][j] + "  ");
                    }
                    System.out.println();
                }
            }

            boolean resetBoard() {
                if (checkWin() || checkLoser()) {
                    setCellValue(0, 0, 49);
                    setCellValue(0, 1, 50);
                    setCellValue(0, 2, 51);
                    setCellValue(1, 0, 52);
                    setCellValue(1, 1, 53);
                    setCellValue(1, 2, 54);
                    setCellValue(2, 0, 55);
                    setCellValue(2, 1, 56);
                    setCellValue(2, 2, 57);
                    printBoard();
                    return true;
                }
                else
                    return false;
            }

            boolean checkLoser(){

            if (this.getCellValue(0, 0) > 58 && this.getCellValue(0, 1) > 58 && this.getCellValue(0, 2) > 58 && this.getCellValue(1, 0) > 58 && this.getCellValue(1, 1) > 58 && this.getCellValue(1, 2) > 58 && this.getCellValue(2, 0) > 58 && this.getCellValue(2, 1) > 58 && this.getCellValue(2, 2) > 58)
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
                    if (a == 1 && b.getCellValue(0,0) < 58) {
                        b.setCellValue(0, 0, xxx); b.printBoard();}
                    else if (a == 2 && b.getCellValue(0,1) < 58) {
                        b.setCellValue(0, 1, xxx); b.printBoard();}
                    else if (a == 3 && b.getCellValue(0,2) < 58){
                        b.setCellValue(0, 2, xxx); b.printBoard();}
                    else if (a == 4 && b.getCellValue(1,0) < 58){
                        b.setCellValue(1, 0, xxx); b.printBoard();}
                    else if (a == 5 && b.getCellValue(1,1) < 58){
                        b.setCellValue(1, 1, xxx); b.printBoard();}
                    else if (a == 6 && b.getCellValue(1,2) < 58){
                        b.setCellValue(1, 2, xxx); b.printBoard();}
                    else if (a == 7 && b.getCellValue(2,0) < 58){
                        b.setCellValue(2, 0, xxx); b.printBoard();}
                    else if (a == 8 && b.getCellValue(2,1) < 58){
                        b.setCellValue(2, 1, xxx); b.printBoard();}
                    else if (a == 9 && b.getCellValue(2,2) < 58){
                        b.setCellValue(2, 2, xxx); b.printBoard();
                    } else {
                        System.out.println("Fuck u.");
                    }
                        if (b.checkWin()) {
                            System.out.println("\t\t\t\t"+xxx+" is Winner Winner - chicken dinner!");
                            b.resetBoard();
                            continue;}
                        else if (b.checkLoser()) {
                            System.out.println("\t\t\t\tCucked.");
                            b.resetBoard();
                            continue; }
                }
            }
        }
