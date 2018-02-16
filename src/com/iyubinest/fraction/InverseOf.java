package com.iyubinest.fraction;

final class InverseOf implements FractionOperation {

  private final Fraction fraction;

  public InverseOf(Fraction fraction) {
    this.fraction = fraction;
  }

  @Override public Fraction value() {
    return new Fraction.Builder()
        .withNumerator(-fraction.numerator())
        .withDenominator(fraction.denominator())
        .build();
  }
}
