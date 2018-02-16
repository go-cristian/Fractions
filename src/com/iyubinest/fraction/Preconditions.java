package com.iyubinest.fraction;

final class Preconditions {
  private Preconditions() {
    throw new IllegalStateException("Should not be called");
  }

  public static void check(boolean test, String message) {
    if (!test) throw new IllegalArgumentException(message);
  }
}
