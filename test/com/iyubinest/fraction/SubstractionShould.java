package com.iyubinest.fraction;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SubstractionShould {

  @Test
  public void substracts() {
    assertThat(
        new Substraction(
            Fraction.of(3, 2),
            Fraction.of(1, 2)
        ).value(),
        is(
            Fraction.of(2, 2)
        )
    );
  }

  @Test
  public void substractIsZero() {
    assertThat(
        new Substraction(
            Fraction.of(1, 2),
            Fraction.of(1, 2)
        ).value(),
        is(
            Fraction.of(0, 2)
        )
    );
  }

  @Test
  public void substractsResultNegative() {
    assertThat(
        new Substraction(
            Fraction.of(1, 2),
            Fraction.of(2, 2)
        ).value(),
        is(
            Fraction.of(-1, 2)
        )
    );
  }
}
