
package edu.lmu.cmsi.mike.mavenperson.person.parts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FootTest {

  @Test
  public void getSizeTest() {
    Foot foot = new Foot(10, true);
    assertEquals("failure - size didn't match", 10, foot.getSize());
  }

  @Test
  public void getLiftedTest() {
    Foot foot = new Foot(10, true);
    assertEquals("failure - lifted didn't match", true, foot.isLifted());
  }

  @Test
  public void updateLiftedTest() {
    Foot foot = new Foot(10, true);
    foot.setLifted(false);
    assertEquals("failure - lifted didn't match", false, foot.isLifted());
  }

}
