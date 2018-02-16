package com.iyubinest.fraction;

final class MCD implements IntOperation {

  private final int a;
  private final int b;

  public MCD(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int value() {
    return b == 0 ? a : new MCD(b, a % b).value();
  }
}
