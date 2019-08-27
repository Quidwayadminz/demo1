package cn.zsq.util;

import java.util.Random;

public class CodeUtil {
    static Random random = new Random();
    public static String getCode(){
        StringBuilder stringBuilder = new StringBuilder();
       for(int i = 1;i<=4;){
           int j =  random.nextInt('z'+1);
           if(j>='0' && j<='9'){
                stringBuilder.append((char) j);
                i++;
           }else if(j>='A' && j<='Z'){
                stringBuilder.append((char) j);
                i++;
           }else if(j>='a' && j<='z'){
                stringBuilder.append((char) j);
                i++;
           }
       }
       return stringBuilder.toString();
    }
}
