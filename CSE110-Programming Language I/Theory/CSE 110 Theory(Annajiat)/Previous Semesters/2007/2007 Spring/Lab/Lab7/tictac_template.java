public class tictac{
  //Stores the Tic-Tac-Toe board in an one dimensional character array
  static char Board[] = {' ','1','2','3', '4', '5','6','7','8','9'};

  //Prints the board as shown in the problem description
  static void PrintBoard(){

  }
  
  
  //Code for the user move: A loop that keeps running until a valid move is given
  //A valid move would be a number between 1 & 9 and and also that location
  // will not have any X or O 
  static void UserMove(){
  }
  
  

  //Code for Computer Move: You can make it as intelligent as you want 
  //But at least the dumbest CompMove would be - a loop that runs from 1 to 9
  // and checks if cell is empty on the board. If it is empty then it makes the 
  // move there
  static void CompMove(){
    
  }

  //Code for checking a winning situation: The parameter ch would be passed as 
  // either 'O' (For user Winning) or 'X' (For Computer Winning)
  // There will be 8 conditions in this code that will check if there are 
  // 3 contiguous spaces with all of them 'O'(For user winning) or 'O' (for Computer)
  static int CheckWin(char ch){
  

  }


  public static void main(String args[]){
    int MoveCount = 0;
    PrintBoard();

    while (true){
      UserMove(); //Calls the user move code
      MoveCount++; //Increases MoveCount
      if (CheckWin('O')==1){ //Checks if the user Won
        System.out.println("Congrats!!! You Won");
        break;
      }
      if (MoveCount==9) {   //Checks if there is already 9 move (Tie check)
        System.out.println("Game over: It is a TIE");
        break;
      }
      
      CompMove();  //Calls the computer move
      MoveCount++;  //Increases the MoveCount
      if (CheckWin('X')==1){ //Checks if the computer won
        System.out.println("You Lost & Computer Won");
        break;
      }

    } //End of While Loop

  } // End of main() method

} //End of Class