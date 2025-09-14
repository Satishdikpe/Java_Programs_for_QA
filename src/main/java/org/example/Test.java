package org.example;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import static org.example.Testing.upperLower;

public class Test {
    public static void upperLower(String name)
    {
        String newstr = "";
        for (int i = 0; i < name.length(); i++)
        {
            char ch = name.charAt(i);
            if(Character.isUpperCase(ch))
            {
               ch = Character.toLowerCase(ch);
               newstr = newstr+ch;
            }else if(Character.isLowerCase(ch))
            {
                ch = Character.toUpperCase(ch);
                newstr = newstr+ch;
            } else {
                newstr = newstr+ch;
            }
        }
        System.out.println(newstr);
        }
        public static void reversearr(int[] arr)
        {
            if(arr == null)
            {
                System.out.println("Input string is null.");
                return;
            }
            int temp;
            int start = 0;
            int end = arr.length-1;
            while (start < end)
            {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            System.out.println("Reverse integer array : - "+Arrays.toString(arr));
        }

        public static void reversechar(String name)
        {
            if (name == null)
            {
                System.out.println("Input string is null.");
                return;
            }
            char[] ch = name.toCharArray();
            int start = 0;
            int end = ch.length-1;
            while(start < end)
            {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
            System.out.println(Arrays.toString(ch));
        }

        public static void occurnce(String name)
        {
            char [] ch = name.toLowerCase().toCharArray();
            HashMap<Character,Integer> mp = new HashMap<>();
            for (int i = 0; i < ch.length-1; i++)
            {
                if(mp.containsKey(ch[i]))
                {
                    mp.put(ch[i],mp.get(ch[i])+1);
                }else
                {
                    mp.put(ch[i],1);
                }
            }
            for(char c : mp.keySet())
            {
                if(mp.get(c)>1)
                {
                    System.out.println(mp.entrySet());
                    break;
                }
            }
        }

        public static void palindrome(String name)
        {
           String str = name.toLowerCase();
            String reverse= "";
            for (int i = str.length()-1; i >= 0; i--) {
                reverse = reverse+str.charAt(i);
            }
            String newString = reverse.trim();
            System.out.println(newString);
            if (newString.equals(str))
            {
                System.out.println("Plindrome");
            }
            else
            {
                System.out.println("not palindrome");
            }
        }

        public static void vovelContrint(String name){
        int vovels= 0;
        int contraint = 0;
        char[] ch =name.toLowerCase().toCharArray();
            for(char c: ch)
            {
                if("aeiou".indexOf(c)==-1)
                {
                    vovels++;
                }else{
                    contraint++;
                }
            }
            System.out.println(vovels + " " + contraint);
        }

    public static void removeDuplicate(String str) {
        String duplicate = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (duplicate.indexOf(ch) == -1)
                {
                    duplicate = duplicate + ch;
                }
            }
            System.out.println("single charactor are "+ duplicate);
        }
        public static void firstCapsOn(String name)
        {
            String[] newstring = name.split(" ");
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < newstring.length; i++) {
               char ch = Character.toUpperCase(newstring[i].charAt(0));
                String rest = newstring[i].substring(1);
                sb.append(ch).append(rest).append(" ");
            }
            System.out.println(sb);
        }
        public static void firstLargestNum(int[] num)
        {
            int temp =0;
            for (int i = 0; i < num.length; i++) {
                if(num[i] > temp)
                {
                    temp = num[i];
                }
            }
            System.out.println(temp);
        }
        public static void secondLarge(int[] arr)
        {
         int first = 0;
         int second = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>first){
                    arr[first] = arr[second];
                    arr[second]= arr[first];
                }
            }
            System.out.println(arr[second]);
        }
        public static void SpecialCharCount(String name){
        int aplhabate = 0;
        int specialChar = 0;
        int Digits = 0;
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                if(Character.isDigit(ch)){
                    Digits++;
                }else if(Character.isAlphabetic(ch)){
                    aplhabate++;
                }else {
                    specialChar++;
                }
            }
            System.out.println(Digits+" "+aplhabate+" "+specialChar);
        }
        public static void RemoveSpecialChar(String str){
        String newStr = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(newStr);
        }
        public static void shifting(int[] arr){
        int[] newarr = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
                if(arr[i]!=0){
                    newarr[index] = arr[i];
                    index++;
                }

            }
        System.out.println("New array created : - "+Arrays.toString(newarr));
        }
        public static void peakElement(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if((i==0||arr[i-1][j]<=arr[i][j])&&
                            (i==rows-1||arr[i+1][j]<=arr[i][j])&&
                            (j==0||arr[i][j-1]<=arr[i][j])&&
                            (j==cols-1||arr[i][j+1]<=arr[i][j])){
                        System.out.println("rows : -"+i+"cols : -"+j+" : - "+arr[i][j]);
                    }

                }
            }
        }
            public static void replace(String name){
            String [] words = name.split("[^a-zA-Z0-9]+");
            String[] special = name.replaceAll("[^a-zA-Z0-9]","").split("");
            int j = words.length-1;
            StringBuilder sb = new StringBuilder();
                for (int i = 0; i < special.length && j>=0 ; i++) {
                    sb.append(words[j--]);
                    sb.append(special[i]);
                }
                if(j>=0){
                sb.append(words[j]);}
                System.out.println(sb);
            }
            public static void findlastrepeatingChar(String str){
            char[] ch = str.toCharArray();
            Character c1 = ' ';
            HashMap<Character,Integer> mp =new HashMap<>();
            for(char c : ch){
                if(mp.containsKey(c)){
                    mp.put(c,mp.get(c)+1);
                }else{
                    mp.put(c,1);
                }
            }
                for (int i = ch.length-1; i >= 0 ; i--) {
                    if(mp.get(ch[i])>1){
                        c1 =ch[i];
                    }
                }
                System.out.println("last repeating char is : - "+c1);
            }
    public static void main(String[] args) {
        String name = "satish dipke";
        upperLower(name);
        int[] arr = {23,456,0,786,89,12,0,0};
        shifting(arr);
        reversearr(arr);
        reversechar(name);
        occurnce(name);
        String palindrome = "Mom";
        palindrome(palindrome);
        vovelContrint(name);
        removeDuplicate(name);
        firstCapsOn(name);
        firstLargestNum(arr);
        secondLarge(arr);
        String input = "Hello@123!";
        SpecialCharCount(input);
        RemoveSpecialChar(input);
        int[][] arr1 = {
                        {1, 4, 3},
                        {6, 7, 8},
                        {5, 2, 9}
                };
        peakElement(arr1);
        String input1 = "hello@world#java";
        replace(input1);
        String str2 = "abcbad";
        findlastrepeatingChar(str2);
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8};
        int[] c = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length+i]  =b[i];
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
    }


