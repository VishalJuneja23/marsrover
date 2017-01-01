import org.junit.Test;

import static org.junit.Assert.*;

public class RoverTest {


@Test
  public void expectPositionX1Y3HNWhenStartingPositionIsX1Y2HN(){
  Rover rover = new Rover(1, 2, 'N');
  String expected = "1 3 N";
  assertEquals(expected, rover.commands("LMLMLMLMM"));
}

@Test
public void expectPositionX5Y1HEWhenStartingPositionIsX3Y3HE(){
  Rover rover = new Rover(3, 3, 'E');
  String expected = "5 1 E";
  assertEquals(expected, rover.commands("MMRMMRMRRM"));
}

}