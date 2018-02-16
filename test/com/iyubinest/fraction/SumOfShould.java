package com.iyubinest.fraction;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SumOfShould {

  @Test
  public void sums() {
    assertThat(
        new SumOf(
            new Fraction.Builder()
                .withNumerator(1)
                .withDenominator(2)
                .build(),
            new Fraction.Builder()
                .withNumerator(1)
                .withDenominator(2)
                .build()
        ).value(),
        is(
            new Fraction.Builder()
                .withNumerator(2)
                .withDenominator(2)
                .build()
        )
    );
  }
}
