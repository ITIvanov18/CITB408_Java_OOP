package org.informatics.packaging.service;

import org.informatics.packaging.Box;
import org.informatics.packaging.exception.IllegalIncreaseValueException;

public interface BoxService {
    void increaseSides(Box box, double increaseValue)
            throws IllegalIncreaseValueException;
}
