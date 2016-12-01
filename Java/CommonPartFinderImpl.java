package ru.ncedu.java.tasks;

import com.education.task1_2.CommonPartFinder;
import java.util.regex.*;
/**
 * Created by Dima on 25.11.2016.
 */
public class CommonPartFinderImpl implements CommonPartFinder{
    @Override
    public String getMaxLengthCommonPrefix(String[] strings) {
        int length = strings.length;
        String commonPrefix ="";
        int key=1;
        if (length == 0){
            return null;
        }
        for (int i = 0; i< strings[0].length()-1;i++){
            for (int j=1;j<length;j++) {
                if (strings[0].charAt(i) != strings[j].charAt(i)) {
                    key = 0;
                }
            }
                if (key == 1){
                    commonPrefix+=strings[0].charAt(i);
                }
                else {
                    break;
                }


        }
        return commonPrefix;
    }

    @Override
    public String getMaxLengthCommonPart(String[] strings) {
        int length = strings.length;
        if (length == 0){
            return null;
        }
        String temp = null;
        String commonPart = strings[0];
            for (int i = 1; i<length; i++){
                temp = commonPart;
            commonPart = getCommonPart(commonPart,strings[i]);
                for (int j=i+1;j<length;j++){
                    if (!strings[j].contains(commonPart)){
                        commonPart =temp;
                        break;
                    }
                }
            }
        return  commonPart;
    }

   public String getCommonPart(String string1,String string2){
        String commonPart = null;
        String maxCommonPart = "";
        for (int i=0;i<string1.length();i++){
            for (int j=i+1;j<string1.length()+1;j++){
                commonPart = string1.substring(i,j);
                if (string2.contains(commonPart) && commonPart.length()>maxCommonPart.length()){
                    maxCommonPart = commonPart;
                }

            }


        }
        return maxCommonPart;
    }

}

