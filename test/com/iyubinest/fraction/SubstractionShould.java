package com.iyubinest.fraction;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SubstractionShould {

  @Test
  public void substracts() {
    assertThat(
        new Substraction(
            new Fraction.Builder()
                .withNumerator(7)
                .withDenominator(5)
                .build(),
            new Fraction.Builder()
                .withNumerator(2)
                .withDenominator(5)
                .build()
        ).value(),
        is(
            new Fraction.Builder()
                .withNumerator(5)
                .withDenominator(5)
                .build()
        )
    );
  }

  @Test
  public void substractIsZero() {
    assertThat(
        new Substraction(
            new Fraction.Builder()
                .withNumerator(1)
                .withDenominator(5)
                .build(),
            new Fraction.Builder()
                .withNumerator(1)
                .withDenominator(5)
                .build()
        ).value(),
        is(
            new Fraction.Builder()
                .withNumerator(0)
                .withDenominator(5)
                .build()
        )
    );
  }

  @Test
  public void substractsResultNegative() {
    assertThat(
        new Substraction(
            new Fraction.Builder()
                .withNumerator(1)
                .withDenominator(5)
                .build(),
            new Fraction.Builder()
                .withNumerator(2)
                .withDenominator(5)
                .build()
        ).value(),
        is(
            new Fraction.Builder()
                .withNumerator(-1)
                .withDenominator(5)
                .build()
        )
    );
  }
}
