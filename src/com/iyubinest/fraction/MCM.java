package com.iyubinest.fraction;

final class MCM implements IntOperation {

  private final int a;
  private final int b;

  public MCM(int a, int b) {
    this.a = a;
    this.b = b;
  }

  @Override public int value() {
    return (a * b) / new MCD(a, b).value();
  }
}
