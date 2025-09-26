package org.example;

import java.util.HashMap;
import java.util.Map;

public class OccurancePrograms {
    public static void Occurnce(String str){
        // Every charactor Occurance
        char[] ch = str.toLowerCase().toCharArray();
        HashMap<Character,Integer> mp = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if(mp.containsKey(ch[i])){
                mp.put(ch[i],mp.get(ch[i])+1);
            }else{
                mp.put(ch[i],1);
            }
        }
        for(HashMap.Entry<Character,Integer> mp1 : mp.entrySet()){
            if(mp1.getValue()>1){
                System.out.print(mp1.getKey()+" = "+mp1.getValue()+", ");
            }
        }
        // hightest occuring character with value
        int maxCount = 0;
        char maxChar = ' ';
        for (Map.Entry<Character,Integer> mp2 : mp.entrySet()){
            if(mp2.getValue()> maxCount){
                maxCount = mp2.getValue();
                maxChar = mp2.getKey();
            }
        }
        System.out.println();
        System.out.println("Max count is : - "+maxCount);

        //first repeating character in the string
        String first = "";
        for (Map.Entry<Character,Integer> mp2 : mp.entrySet()){
            if(mp2.getValue()>1){
                first = first+mp2.getKey();
                break;
            }
        }
        System.out.println(first);
    }

    public static void main(String[] args) {
        String str = "aabbbccdddd";
        Occurnce(str);
    }
}
