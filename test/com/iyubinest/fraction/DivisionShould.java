package com.iyubinest.fraction;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DivisionShould {

  @Test
  public void divides() {
    assertThat(
        new Division(
            new Fraction.Builder()
                .withNumerator(4)
                .withDenominator(5)
                .build(),
            new Fraction.Builder()
                .withNumerator(3)
                .withDenominator(9)
                .build()
        ).value(),
        is(
            new Fraction.Builder()
                .withNumerator(36)
                .withDenominator(15)
                .build()
        )
    );
  }
}
