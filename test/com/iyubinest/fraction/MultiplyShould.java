package com.iyubinest.fraction;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MultiplyShould {

  @Test
  public void multiplies() {
    assertThat(
        new Multiply(
            new Fraction.Builder()
                .withNumerator(3)
                .withDenominator(5)
                .build(),
            new Fraction.Builder()
                .withNumerator(5)
                .withDenominator(10)
                .build()
        ).value(),
        is(
            new Fraction.Builder()
                .withNumerator(15)
                .withDenominator(50)
                .build()
        )
    );
  }
}
