package edu.lmu.cmsi.mike;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.lmu.cmsi.mike.integerdoubler.iface.IntegerDoubler;
import edu.lmu.cmsi.mike.integerdoubler.impl.AdditionDoubler;
import edu.lmu.cmsi.mike.integerdoubler.impl.BitShiftDoubler;
import edu.lmu.cmsi.mike.integerdoubler.impl.MultiplicationDoubler;

public class TestDoubler {
  @Test
  public void additionDoubler() {
    IntegerDoubler doubler = new AdditionDoubler();

    assertEquals(10, doubler.doDouble(5));
    assertEquals(20, doubler.doDouble(10));
  }

  @Test
  public void multiplicationDoubler() {
    IntegerDoubler doubler = new MultiplicationDoubler();

    assertEquals(10, doubler.doDouble(5));
    assertEquals(20, doubler.doDouble(10));
  }

  @Test
  public void bitshiftDoubler() {
    IntegerDoubler doubler = new BitShiftDoubler();

    assertEquals(10, doubler.doDouble(5));
    assertEquals(20, doubler.doDouble(10));
  }
}