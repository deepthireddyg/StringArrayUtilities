package com.zipcodewilmington;
import com.sun.deploy.security.SelectableSecurityManager;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i = 0; i <= array.length;i++){
            if(array[i].equals(value)) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

      for(int i = array.length/2; i>=0;i--){
         String temp = array[i];
          array[i] = array[array.length-1-i];
          array[array.length-1-i] = temp;

          System.out.println(temp);


      }

        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            if(array[i].equals(array[array.length - 1 - i])) {
                return true;
            }
        }

        return false;
    }




    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String pan = "";
        for (String w : array) {
            pan += w.toLowerCase();
        }
        String newword=pan.replaceAll("(.)(?=.*\\1)", "").replaceAll("\\s+", "");
        if (newword.length() == 26) {
            return true;
        } else
            return false;
    }



    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int ctr =0;

        for(int i = 0; i < array.length;i++) {
            if (array[i].equals(value)) {
                ctr++;
            }
        }

        return ctr;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> myarraylist1 = new ArrayList<String>();

        for(int i = 0; i < array.length;i++){
        String temp = array[i];

        if(!(temp.equals(valueToRemove))) {
            myarraylist1.add(temp);
        }
        }
        String[] array2 = new String[myarraylist1.size()];

        for(int j=0; j < myarraylist1.size(); j++){
            array2[j] = myarraylist1.get(j);
        }


        return array2;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> al=new ArrayList<String>(Arrays.asList(array));
        ArrayList<String> result=new ArrayList<String>();
        int counter=0;
        while(counter<al.size())
        {
            if(counter<al.size()-1 && al.get(counter).equals(al.get(counter+1))) {
                counter++;
            }
            else {
                result.add(al.get(counter));
                counter++;
            }
        }
        return result.toArray(new String[0]);
    }



        /**
         * @param array array of chars
         * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
         */ // TODO
        public static String[] packConsecutiveDuplicates (String[]array){

            ArrayList<String> al = new ArrayList<String>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                if (i < array.length - 1 && array[i].equals(array[i + 1])) {
                    if (sb.length() == 0) {
                        sb.append(array[i]);
                        sb.append(array[i + 1]);
                    } else {
                        sb.append(array[i + 1]);
                    }
                } else {
                    if (sb.length() > 0) {
                        al.add(sb.toString());
                        sb.delete(0, sb.length());
                    } else {
                        al.add(array[i]);
                    }
                }
            }
            return al.toArray(new String[0]);


        }


    }
