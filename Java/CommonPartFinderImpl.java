package ru.ncedu.java.tasks;

import com.education.task1_2.CommonPartFinder;
/**
 * Created by Dima on 25.11.2016.
 */
public class CommonPartFinderImpl implements CommonPartFinder{
    @Override
    public String getMaxLengthCommonPrefix(String[] strings) {
        int length = strings.length;
        String commonPrefix =null;
        Boolean flag =true;
        if (length == 0){
            return null;
        }
        for (int i = 0; i< strings[0].length() && flag;i++){
            for (int j=1;j<length && flag;j++) {
                if (strings[0].charAt(i) != strings[j].charAt(i)) {
                    flag = false;
                }
            }
                if (flag ==true){
                    commonPrefix = strings[0].substring(0,i+1);
            }




        }
        return commonPrefix;
    }

    @Override
    public String getMaxLengthCommonPart(String[] strings) {
        int length = strings.length;
        if (length == 0) {
            return null;
        }
        Boolean flag = true;
        Boolean mainFlag =true;
        String commonPart = null;
        for (int i=strings[0].length();i>0 && mainFlag;i--){
            for (int j=0;j<strings[0].length()-i+1 && mainFlag;j++){
                commonPart = strings[0].substring(j,j+i);
                for(int k=1;k<length && flag;k++){
                    if (!strings[k].contains(commonPart)){
                        flag = false;
                    }
                }
                if (flag == true ){
                    mainFlag = false;
                }else{flag =true;}
            }
        }

        return commonPart;
    }
    }


