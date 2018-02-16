package com.iyubinest.fraction;

final class Simplified implements FractionOperation {

  private final Fraction fraction;

  public Simplified(Fraction fraction) {
    int mcd = new MCD(fraction.numerator(), fraction.denominator()).value();
    this.fraction = new Fraction.Builder()
        .withNumerator(fraction.numerator() / mcd)
        .withDenominator(fraction.denominator() / mcd)
        .build();
  }

  public Fraction value() {
    return fraction;
  }
}
