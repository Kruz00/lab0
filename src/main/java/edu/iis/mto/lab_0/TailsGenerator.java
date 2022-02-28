package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> tailsArr = new ArrayList<>(value.length());
        for (int i = 0; i < value.length() + 1; i++) {
            tailsArr.add(value.substring(i));
        }
        return tailsArr;
    }

}
