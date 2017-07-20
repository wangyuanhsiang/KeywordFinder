/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keywordfinder;

import java.util.Scanner;

/**
 *
 * @author Shawn
 */
public  class KeywordFinder {

  
    private static String value;
    private static String str2;
    
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a text");
//        String text = scanner.next();
//        System.out.println("enter a paragraph");
//         String paragraph  = scanner.next();
//        
////        readMethod("emily", 
////                "abshawlajhdbfgeknnmicdnegilncdefe"
////              + "milyghmilysshawniangshawngmilykaanssj"
////              + "kakjkldgn.//.j,x,aaakkaakshawnemilykakakaakka");
//         
//          readMethod(text, paragraph);
//        
//        System.out.println(str2);
//    }

    public static void readMethod(String text, String literals) {
//        int count =0;
          String str1;
        StringBuilder sb = new StringBuilder(literals); 
        enterPage enterpage = new enterPage();
        for (int i = 0; i < sb.length(); i++) {
            try{
            value = sb.substring(i, i + inputMethod(text)); // substried value from sb as long as text
            if(value.equals(text))
            {
//                System.out.println(value);
                str1 = sb.toString();
                str2 =  str1.replaceAll(value, "[ "+value+" ]");// macked keywords in the literals
            }
            }catch(StringIndexOutOfBoundsException e){
//                System.out.println("End");
                break;
//                 System.exit(0);
            }
        }
    }

    public static int inputMethod(String s) {  // get text's length
      return s.length();
    }

    public static String getValue() {
        return value;
    }

    public static String getStr2() {
        return str2;
    }

}
