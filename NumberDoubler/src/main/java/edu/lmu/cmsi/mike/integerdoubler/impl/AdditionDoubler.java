package edu.lmu.cmsi.mike.integerdoubler.impl;

import edu.lmu.cmsi.mike.integerdoubler.iface.IntegerDoubler;

public class AdditionDoubler implements IntegerDoubler {

  @Override
  public long doDouble(int i) {
    return i + i;
  }
}

