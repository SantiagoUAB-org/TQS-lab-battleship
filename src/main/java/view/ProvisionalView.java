package view;

import model.Board;
import model.Coordinate;
import model.State;

public class ProvisionalView {

  public static  void printBoard(Board board){

    Coordinate[][] matrix = board.getMatrix();
    State state;

    System.out.print("     ");
    for(int i=1;i<=board.getSizeRow();i++) {
      System.out.print(i+"  ");
    }
    System.out.println();
    for (int i = 0; i < board.getSizeRow(); i++){
      if(i == board.getSizeRow()-1) {
        System.out.print(i + 1 + " ");
      }else{
        System.out.print(i+1+"  ");
      }
      for (int j = 0; j < board.getSizeCol(); j++) {
        System.out.print("  ");
        state = matrix[i][j].getState();
        if (state == State.EMPTY){
          System.out.print('~');
        } else if(state == State.HIT){
          System.out.print('X');
        } else{
          System.out.print('O');
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    Board board = new Board();

    Coordinate hit = new Coordinate(5,5);
    Coordinate ship = new Coordinate(10, 10);

    board.getCord(hit).setState(State.HIT);
    board.getCord(ship).setState(State.SHIP);
    printBoard(board);

  }

}
