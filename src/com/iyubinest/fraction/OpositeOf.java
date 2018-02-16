package com.iyubinest.fraction;

final class OpositeOf implements FractionOperation {

  private final Fraction fraction;

  public OpositeOf(Fraction fraction) {
    this.fraction = fraction;
  }

  @Override public Fraction value() {
    return new Fraction.Builder()
        .withNumerator(fraction.denominator())
        .withDenominator(fraction.numerator())
        .build();
  }
}
