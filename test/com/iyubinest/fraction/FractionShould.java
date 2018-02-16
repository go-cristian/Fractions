package com.iyubinest.fraction;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FractionShould {

  @Test
  public void represents() {
    assertThat(
        new Fraction.Builder()
            .withNumerator(1)
            .withDenominator(2)
            .build()
            .toString(),
        is("1/2")
    );
  }

  @Test(expected = IllegalArgumentException.class)
  public void notAllowZeroDenominator() {
    new Fraction.Builder()
        .withNumerator(1)
        .withDenominator(0)
        .build();
  }
}
