package com.codedifferently.problems;

import java.util.ArrayList;

public class Problem02 {
    public static Integer cousinTag(ArrayList<String> cousins, Integer startIndex, String targetName){
        int indexOfTarget = cousins.indexOf(targetName);
        int wrapped = startIndex - cousins.size();
        int regularDifference = Math.abs(startIndex - indexOfTarget);
        int wrappedDifference = Math.abs(indexOfTarget - wrapped);
        return Math.min(regularDifference, wrappedDifference);
    }
}
