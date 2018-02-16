package com.iyubinest.fraction;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SimplifiedShould {

  @Test
  public void simplifies() {
    assertThat(
        new Simplified(
            Fraction.of(2, 4)
        ).value(),
        is(
            Fraction.of(1, 2)
        )
    );
  }
}
