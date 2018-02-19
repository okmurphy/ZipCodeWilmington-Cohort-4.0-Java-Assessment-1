package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        StringBuilder sb = new StringBuilder(str);

                return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {


        StringBuilder sb = new StringBuilder(str) ;

        return sb.reverse().toString();

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
                StringBuilder sb = new StringBuilder(str);

          return sb.reverse().toString().substring(0, str.length()).toUpperCase();



    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
                StringBuilder sb = new StringBuilder(str);

                return str.substring(1, str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str)
    {
               char[] chars = str.toCharArray();
               for(int i = 0; i < chars.length; i++)
               {
                  char c = chars[i];
                  if(Character.isUpperCase(c))
                  {
                      chars[i] = Character.toLowerCase(c);
                  }
                  else if (Character.isLowerCase(c))
                  {
                      chars[i] = Character.toUpperCase(c);
                  }
               }
        return new String(chars);
    }

}
