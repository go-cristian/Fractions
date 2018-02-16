package com.iyubinest.fraction;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MultiplyShould {

  @Test
  public void multiplies() {
    assertThat(
        new Multiply(
            Fraction.of(2, 4),
            Fraction.of(2, 4)
        ).value(),
        is(
            Fraction.of(4, 16)
        )
    );
  }
}
