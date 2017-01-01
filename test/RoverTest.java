import org.junit.Test;

import static org.junit.Assert.*;

public class RoverTest {

  @Test
  public void expectEForStartingHeadPositionNAndTurnCommandIsR() {
    Rover rover = new Rover(0, 0, 'N');
    char expectedResult = 'E';
    assertEquals(expectedResult, rover.turn('R'));
  }

  @Test
  public void expectSForStartingHeadPositionEAndTurnCommandIsR() {
    Rover rover = new Rover(0, 0, 'E');
    char expectedResult = 'S';
    assertEquals(expectedResult, rover.turn('R'));
  }

  @Test
  public void expectWForStartingHeadPositionSAndTurnCommandIsR() {
    Rover rover = new Rover(0, 0, 'S');
    char expectedResult = 'W';
    assertEquals(expectedResult, rover.turn('R'));
  }

  @Test
  public void expectNForStartingHeadPositionWAndTurnCommandIsR() {
    Rover rover = new Rover(0, 0, 'W');
    char expectedResult = 'N';
    assertEquals(expectedResult, rover.turn('R'));
  }

  @Test
  public void expectNForStartingHeadPositionEAndTurnCommandIsL() {
    Rover rover = new Rover(0, 0, 'E');
    char expectedResult = 'N';
    assertEquals(expectedResult, rover.turn('L'));
  }
  @Test
  public void expectEForStartingHeadPositionSAndTurnCommandIsL() {
    Rover rover = new Rover(0, 0, 'S');
    char expectedResult = 'E';
    assertEquals(expectedResult, rover.turn('L'));
  }

  @Test
  public void expectWForStartingHeadPositionNAndTurnCommandIsL() {
    Rover rover = new Rover(0, 0, 'N');
    char expectedResult = 'W';
    assertEquals(expectedResult, rover.turn('L'));
  }

  @Test
  public void expectSForStartingHeadPositionWAndTurnCommandIsL() {
    Rover rover = new Rover(0, 0, 'W');
    char expectedResult = 'S';
    assertEquals(expectedResult, rover.turn('L'));
  }

}