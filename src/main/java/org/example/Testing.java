package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class Testing {
    public static void upperLower(String str){
       StringBuffer newStr = new StringBuffer();
        char[] ch =str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(Character.isUpperCase(ch[i]))
            {
                newStr.append(Character.toLowerCase(ch[i]));
            }
            else {
                if(Character.isLowerCase(ch[i]))
                {
                    newStr.append(Character.toUpperCase(ch[i]));
                }
                else {
                    newStr.append(" ");
                }
            }
        }
        System.out.println(newStr);
    }

    public static void reverse(String str)
    {
      String[] str1 = str.split(" ");
    StringBuilder sb = new StringBuilder();
    for(String strnew : str1)
    {
        StringBuilder sb1 = new StringBuilder(strnew);
        sb.append(sb1.reverse().append(" "));
    }
    System.out.println(sb);
    }

    public  static void largestNum (int[] largenum)
    {
        int temp = 0;
        for (int i = 0; i < largenum.length; i++) {
            if(largenum[i]> temp)
            {
                temp = largenum[i];
            }
        }System.out.println(temp);
    }

    public static void secondLargestNumber(int[] secondlarge)
    {
        int firstLarge = 0;
        int secLarge = 0;
        int thirdLarge = 0;
        for(int num : secondlarge)
        {
            if(num>firstLarge)
            {
                secLarge = firstLarge;
                firstLarge=num;
               // thirdLarge = num;
            } else if (num > secLarge && firstLarge != num) {
                secLarge = num;
            }
        }
        System.out.println(secLarge);
    }

    public static void palindrome(String str)
    {
        String reverse = "";
        char[] ch = str.toCharArray();
        for (int i = ch.length-1; i >= 0 ; i--) {
            reverse = reverse+ch[i];
        }
        System.out.println(reverse);
        reverse.trim();
        if(str.equalsIgnoreCase(reverse))
        {
            System.out.println("Palindrome hai");
        }
    }
    public static void vovelContraind(String str)
    {
        int vovels = 0;
        int contraint = 0;
        char [] ch = str.toLowerCase().toCharArray();
        for(char c:ch)
        {
            if(("aeiou").indexOf(c)==-1)
            {
                vovels++;
            }
            else
            {
                contraint++;
            }
        }
        System.out.println(vovels+" "+contraint);
    }
    public static void Occurance(String str)
    {
        String lowerstring = str.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < lowerstring.length(); i++)
        {
        char ch = lowerstring.toLowerCase().charAt(i);
        if(map.containsKey(ch))
        {
            map.put(ch,map.get(ch)+1);
        }
        else
        {
            map.put(ch,1);
        }
        }
        for(char c : map.keySet())
        {
            if(map.get(c) == 1)
            {
                System.out.print(" "+c);
            }
        }
    }

    public static void removeDuplicate(String str)
    {
        String result = "";
       for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(result.indexOf(c)==-1)
            {
                result= result+c;
            }
        }
       System.out.println(" "+result);
    }
public static void firstcharUpper(String str)
{
  String[] words = str.split(" ");
  StringBuilder capitalfirst = new StringBuilder();
    for (int i = 0; i < words.length; i++)
    {
        if(!words[i].isEmpty())
        {
            char ch = Character.toUpperCase(words[i].charAt(0));
            String rest = words[i].substring(1);
            capitalfirst.append(ch).append(rest).append(" ");
        }
    }
    System.out.println("Capital first letter "+capitalfirst);
}
public static void Duplicates(int[] arr){
    HashSet<Integer> Duplicate = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if(arr[i]==arr[j]){
                Duplicate.add(arr[j]);
                break;
            }
        }
    }
    System.out.println("Duplicate numbers: " + Duplicate);
}
    public static void main(String[] args) {
        String name = "satish dipke";
        upperLower(name);
        reverse(name);
        int[] arr = {2,455,675,886,75};
        largestNum(arr);
        secondLargestNumber(arr);
        String palindrome = "Mom";
        palindrome(palindrome);
        vovelContraind(name);
        Occurance(name);
        removeDuplicate(name);
        firstcharUpper(name);
        int[] numbers = {1, 2, 3, 4, 5, 2, 6, 4, 7, 8, 3};
        Duplicates(numbers);
    }
}
