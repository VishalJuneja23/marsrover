public class Rover {
  private int coordinateX;
  private int coordinateY;
  private char headingTowards;

  public Rover(int coordinateX, int coordinateY, char headingTowards) {
    this.coordinateX = coordinateX;
    this.coordinateY = coordinateY;
    this.headingTowards = headingTowards;
  }

  public char turn(char turnCommand) {
    if (turnCommand == 'R') {
      return turnRight90Deg();
    }
    return turnLeft90Deg();
  }

  public int[] move(char command) {
    int[] coordinates = new int[2];
    coordinates[0] = coordinateX;
    coordinates[1] = coordinateY;

    if (command == 'M') {
      if (headingTowards == 'N') {
        coordinates[1]++;
      } else if (headingTowards == 'E') {
        coordinates[0]++;
      } else if (headingTowards == 'S') {
        coordinates[1]--;
      } else if (headingTowards == 'W') {
        coordinates[0]--;
      }
    }
    return coordinates;
  }


  private char turnRight90Deg() {
    if (headingTowards == 'N') {
      return 'E';
    } else if (headingTowards == 'E') {
      return 'S';
    } else if (headingTowards == 'S') {
      return 'W';
    }
    return 'N';
  }

  private char turnLeft90Deg() {
    if (headingTowards == 'N') {
      return 'W';
    } else if (headingTowards == 'W') {
      return 'S';
    } else if (headingTowards == 'S') {
      return 'E';
    }
    return 'N';
  }
}

