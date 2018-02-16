package com.iyubinest.fraction;

class SumOf implements FractionOperation {

  private final Fraction first;
  private final Fraction second;

  public SumOf(Fraction first, Fraction second) {
    this.first = first;
    this.second = second;
  }

  @Override public Fraction value() {
    int mcm = new MCM(first.denominator(), second.denominator()).value();
    int a = (mcm / first.denominator()) * first.numerator();
    int b = (mcm / second.denominator()) * second.numerator();
    return new Fraction.Builder()
        .withNumerator(a + b)
        .withDenominator(mcm)
        .build();
  }
}
