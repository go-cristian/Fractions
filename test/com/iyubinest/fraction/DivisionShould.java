package com.iyubinest.fraction;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DivisionShould {

  @Test
  public void divides() {
    assertThat(
        new Division(
            Fraction.of(2, 4),
            Fraction.of(2, 4)
        ).value(),
        is(
            Fraction.of(8, 8)
        )
    );
  }
}
