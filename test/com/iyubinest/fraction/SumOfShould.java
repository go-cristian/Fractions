package com.iyubinest.fraction;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SumOfShould {

  @Test
  public void sums() {
    assertThat(
        new SumOf(
            Fraction.of(1, 2),
            Fraction.of(2, 2)
        ).value(),
        is(
            Fraction.of(3, 2)
        )
    );
  }
}
