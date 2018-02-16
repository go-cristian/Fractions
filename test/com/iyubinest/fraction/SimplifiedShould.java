package com.iyubinest.fraction;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SimplifiedShould {

  @Test
  public void simplifies() {
    assertThat(
        new Simplified(
            new Fraction.Builder()
                .withNumerator(2)
                .withDenominator(4)
                .build()
        ).value(),
        is(
            new Fraction.Builder()
                .withNumerator(1)
                .withDenominator(2)
                .build()
        )
    );
  }
}
