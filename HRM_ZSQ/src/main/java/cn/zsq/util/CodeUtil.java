package cn.zsq.util;

import java.util.Random;

public class CodeUtil {
    static Random random = new Random();
    public static String getCode(int len){
        StringBuilder stringBuilder = new StringBuilder();
       for(int i = 1;i<=len;){
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
    public static String getAccount(String phone){
       char c1 = (char) (random.nextInt('z'-'a'+1)+'a');
       char c2 = (char) (random.nextInt('z'-'a'+1)+'a');
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append(c1);
       stringBuilder.append(c2);
       stringBuilder.append(phone, 0, 1);
       for(int i = 0;i<4;i++){
          stringBuilder.append(random.nextInt(10));
       }
       stringBuilder.append(phone, 1, 2);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String ad = "123456789";
        System.out.println(ad.substring(ad.length()-2));

    }
}
