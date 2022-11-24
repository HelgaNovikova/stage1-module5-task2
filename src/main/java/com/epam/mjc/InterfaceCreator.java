package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (initialList) -> {
            List<Integer> newL = new ArrayList<>();
            for (int item:initialList){
                newL.add(item/divider);
            }
            return newL;
        };
    }
}
