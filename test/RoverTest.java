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

  @Test
  public void expectX2Y1ForStartingCoordinatesX1Y1FacingEAndTurnCommandIsM() {
    Rover rover = new Rover(1, 1, 'E');
    int[] expectedResult = new int[2];
    expectedResult[0] = 2;
    expectedResult[1] = 1;
    assertArrayEquals(expectedResult,rover.move('M'));
  }
  @Test
  public void expectX2Y2ForStartingCoordinatesX2Y1FacingNAndTurnCommandIsM() {
    Rover rover = new Rover(2, 1, 'N');
    int[] expectedResult = new int[2];
    expectedResult[0] = 2;
    expectedResult[1] = 2;
    assertArrayEquals(expectedResult,rover.move('M'));
  }

  @Test
  public void expectX0Y1ForStartingCoordinatesX1Y1FacingWAndTurnCommandIsM() {
    Rover rover = new Rover(1, 1, 'W');
    int[] expectedResult = new int[2];
    expectedResult[0] = 0;
    expectedResult[1] = 1;
    assertArrayEquals(expectedResult,rover.move('M'));
  }

  @Test
  public void expectX3Y2ForStartingCoordinatesX3Y3FacingSAndTurnCommandIsM() {
    Rover rover = new Rover(3, 3, 'S');
    int[] expectedResult = new int[2];
    expectedResult[0] = 3;
    expectedResult[1] = 2;
    assertArrayEquals(expectedResult,rover.move('M'));
  }


}