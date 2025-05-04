package org.informatics.packaging.service.impl;

import org.informatics.packaging.Box;
import org.informatics.packaging.exception.IllegalIncreaseValueException;
import org.informatics.packaging.service.BoxService;

public class BoxServiceImpl implements BoxService {
    @Override
    public void increaseSides(Box box, double increaseValue)
    throws IllegalIncreaseValueException {
        if(increaseValue < 0){
            throw new IllegalIncreaseValueException("Increase value must be a positive number.", increaseValue, 0);
        }
        box.setSide1(box.getSide1()+increaseValue);
        box.setSide2(box.getSide2()+increaseValue);
        box.setSide3(box.getSide3()+increaseValue);

    }
}
