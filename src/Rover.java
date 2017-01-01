public class Rover {
  private int coordinateX;
  private int coordinateY;
  private char headingTowards;

  public Rover(int coordinateX, int coordinateY, char headingTowards) {
    this.coordinateX = coordinateX;
    this.coordinateY = coordinateY;
    this.headingTowards = headingTowards;
  }


  public String commands(String input) {
    char[] inputCharacterArray = input.toCharArray();
    StringBuilder finalPositionAndDirection = new StringBuilder();
    for (int i = 0; i < inputCharacterArray.length; i++) {
      if (inputCharacterArray[i] != 'M') {
        turn(inputCharacterArray[i]);
      } else if (inputCharacterArray[i] == 'M') {
         move();
      }
    }

    return finalPosition(finalPositionAndDirection);
  }

  private String finalPosition(StringBuilder finalPositionAndDirection) {
    finalPositionAndDirection.append(coordinateX);
    finalPositionAndDirection.append(" ");
    finalPositionAndDirection.append(coordinateY);
    finalPositionAndDirection.append(" ");
    finalPositionAndDirection.append(headingTowards);
    return finalPositionAndDirection.toString();
  }


  private void turn(char turnCommand) {
    if (turnCommand == 'R') {
      turnRight90Deg();
    }
    else if (turnCommand == 'L'){
      turnLeft90Deg();
    }
  }

  private void move() {
      if (headingTowards == 'N') {
        coordinateY++;
      } else if (headingTowards == 'E') {
        coordinateX++;
      } else if (headingTowards == 'S') {
        coordinateY--;
      } else if (headingTowards == 'W') {
        coordinateX--;
      }
    }



  private void turnRight90Deg() {
    if (headingTowards == 'N') {
      headingTowards = 'E';
    } else if (headingTowards == 'E') {
      headingTowards = 'S';
    } else if (headingTowards == 'S') {
      headingTowards ='W';
    } else if(headingTowards == 'W'){
      headingTowards = 'N';
    }
  }

  private void turnLeft90Deg() {
    if (headingTowards == 'N') {
      this.headingTowards = 'W';
    } else if (headingTowards == 'W') {
      this.headingTowards ='S';
    } else if (headingTowards == 'S') {
      this.headingTowards = 'E';
    }else if(headingTowards == 'E') {
      this.headingTowards = 'N';
    }
  }
}

