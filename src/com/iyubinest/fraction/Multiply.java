package com.iyubinest.fraction;

class Multiply implements FractionOperation {

  private final Fraction[] fractions;

  public Multiply(Fraction... fractions) {
    this.fractions = fractions;
  }

  @Override public Fraction value() {
    int numerator = 1;
    int denominator = 1;
    for (Fraction fraction : fractions) {
      numerator = numerator * fraction.numerator();
      denominator = denominator * fraction.denominator();
    }
    return new Fraction.Builder()
        .withNumerator(numerator)
        .withDenominator(denominator)
        .build();
  }
}
