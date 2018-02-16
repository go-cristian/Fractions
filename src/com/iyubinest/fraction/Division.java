package com.iyubinest.fraction;

final class Division implements FractionOperation {

  private final Fraction first;
  private final Fraction second;

  public Division(Fraction first, Fraction second) {
    this.first = first;
    this.second = second;
  }

  @Override public Fraction value() {
    return new Multiply(first, new OpositeOf(second).value()).value();
  }
}
