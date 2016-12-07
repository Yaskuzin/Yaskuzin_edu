package com.education.task3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.*;

/**
 * Created by Dima on 04.12.2016.
 */
public class TheBiggestIntervalSearchableImpl implements TheBiggestIntervalSearchable {
    @Override
    public int[] getTheBiggestInterval(List list) {
        if (list == null || list.size() == 0){
            return null;
        }
        int number = 0;
        int maxBeginInterval =0;
        int maxEndInterval = 0;
        int []beginInterval = new int[list.size()];
        int []endInterval = new int[list.size()];
            for (int i=0;i<list.size();i++) {

                beginInterval[i] = (int) list.get(i);
                endInterval[i] = (int) list.get(i);
                while (list.contains(beginInterval[i]-1) ) {
                    beginInterval[i]--;
                }
                while (list.contains(endInterval[i]+1)) {
                    endInterval[i]++;

                }
                if (endInterval[i]-beginInterval[i]> maxEndInterval - maxBeginInterval){
                    maxBeginInterval = beginInterval[i];
                    maxEndInterval = endInterval[i];
                }
            }


        return new int[]{maxBeginInterval,maxEndInterval};
    }


}
