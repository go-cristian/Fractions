package com.iyubinest.fraction;

import java.util.Objects;

final class Fraction {

  private final int numerator;
  private final int denominator;

  private Fraction(Builder builder) {
    this(builder.numerator, builder.denominator);
  }

  private Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public int numerator() {
    return numerator;
  }

  public int denominator() {
    return denominator;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Fraction fraction = (Fraction) o;
    return numerator == fraction.numerator &&
        denominator == fraction.denominator;
  }

  @Override public int hashCode() {
    return Objects.hash(numerator, denominator);
  }

  @Override
  public String toString() {
    return String.format("%s/%s", numerator, denominator);
  }

  public static final class Builder {

    private int numerator;
    private int denominator;

    public Builder withNumerator(int numerator) {
      this.numerator = numerator;
      return this;
    }

    public Builder withDenominator(int denominator) {
      this.denominator = denominator;
      return this;
    }

    public Fraction build() {
      return new Fraction(this);
    }
  }
}
