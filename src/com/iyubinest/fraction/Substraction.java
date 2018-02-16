package com.iyubinest.fraction;

final class Substraction implements FractionOperation {

  private final Fraction first;
  private final Fraction second;

  public Substraction(Fraction first, Fraction second) {
    this.first = first;
    this.second = second;
  }

  @Override public Fraction value() {
    return new SumOf(first, new InverseOf(second).value()).value();
  }
}
