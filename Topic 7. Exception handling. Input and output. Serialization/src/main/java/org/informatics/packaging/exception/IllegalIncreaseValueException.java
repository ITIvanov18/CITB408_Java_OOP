package org.informatics.packaging.exception;

public class IllegalIncreaseValueException extends Exception {
  private double increaseValue;
  private double minValue;

  public IllegalIncreaseValueException(String message, double increaseValue, int minValue) {
    super(message);
    this.increaseValue = increaseValue;
    this.minValue = minValue;
  }

  public double getIncreaseValue() {
    return increaseValue;
  }

  public void setIncreaseValue(double increaseValue) {
    this.increaseValue = increaseValue;
  }

  public double getMinValue() {
    return minValue;
  }

  public void setMinValue(double minValue) {
    this.minValue = minValue;
  }
}
