import java.util.*;

// Ivy Yip

public class Main
{
  // There are no instance variables for this assignment
   
  // Remember that static methods are loaded into
  // RAM memory at the start of a run.  The 1 and
  // only 1 method is in RAM memory from start to
  // stop.
  
  // They are not stored in the object.

  // DO NOT USE THE BUILT IN METHODS
  // USE LOOPS AND/OR IF STATEMENTS

  public static boolean isDigit(char ch)
  {
    if (ch >= 48 && ch <= 57) {
      return true;
    }
    else {
      return false;
    }
  }
   

  public static boolean isLowerCase(char ch)
  {
    if (ch >= 97 && ch <= 122) {
      return true;
    }
    else {
      return false;
    }
  }


  public static boolean isUpperCase(char ch)
  {
    if (ch >= 65 && ch <= 90) {
      return true;
    }
    else {
      return false;
    }
  }

  public static boolean isLetter(char ch)
  {
    if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
      return true;
    }
    else {
      return false;
    }
  }
   
  public static boolean isVowel(char ch)
  {
    char [] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
   
    for (int i = 0; i < vowels.length; i++) {
      if (ch == vowels[i]) {
        return true;
      }
    }

    return false;
  }

   
  public static int countDigits(char [] ray)
  {
    int numDigits = 0;

    for (char ch : ray) {
      if (ch >= 48 && ch <= 57) {
        numDigits++;
      }
    }

    return numDigits;
  }


  public static int countLetters(char [] ray)
  {
    int numLetters = 0;

    for (char ch : ray) {
      if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
        numLetters++;
      }
    }

    return numLetters;
  } 


  public static int countCapLetters(char [] ray)
  {
    int numCapLetters = 0;

    for (char ch : ray) {
      if (ch >= 65 && ch <= 90) {
        numCapLetters++;
      }
    }

    return numCapLetters;
  }


  public static int countLowerLetters(char [] ray)
  {
    int numLowerLetters = 0;

    for (char ch : ray) {
      if (ch >= 97 && ch <= 122) {
        numLowerLetters++;
      }
    }

    return numLowerLetters;
  }


  public static int CountVowels(char [] ray)
  {
    int numVowels = 0;
    char [] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

    for (char ch : ray) {
      for (int i = 0; i < vowels.length; i++) {
        if (ch == vowels[i]) {
          numVowels++;
        }
      }
    }

    return numVowels;
  }




  public static void main(String [] args)
  {
    char [] array1 = {'A', '0', 'B', '1', 'c', '.', 'd', 'a', 'e'};


    int elements = 0;
       
    // Remember that an Array does NOT have any methods (although it 
    // does inheritant a few).  It does have a length public variable.
    char [] array2 = new char[100];
    array2[0] = 'X';
    array2[1] = 'Y';
    array2[2] = 'Z';
    array2[3] = 'e';
    array2[4] = '0';
    array2[5] = '8';
    array2[6] = '9';
    for (int i=7; i<array2.length; i++)
    {
      array2[i] = '.';
    }
       
       
    System.out.println("ArraysReview1");
    System.out.println();
    System.out.println();

    // isDigit?  
    System.out.println("Is '5' a digit? "+ isDigit('5'));          
    System.out.println("Is 'A' a digit? "+ isDigit('A'));   

    // isLowerCase?
    System.out.println("Is 'a' lower case? "+ isLowerCase('a'));
    System.out.println("Is 'A' lower case "+ isLowerCase('A'));   

    // isUpperCase?
    System.out.println("Is 'a' upper case? "+ isUpperCase('a'));    
    System.out.println("Is 'A' upper case "+ isUpperCase('A'));   

    // isUpperCase?
    System.out.println("Is 'a' letter? "+ isLetter('a'));    
    System.out.println("Is '.' a letter "+ isLetter('.'));   

    // isVowel?
    System.out.println("Is 'a' a vowel? "+ isVowel('a'));        
    System.out.println("Is 'B' a vowel "+ isVowel('B'));   

    // Count the Digits
    System.out.println("Digits in array1? "+ countDigits(array1)); 
    System.out.println("Digits in array2? "+ countDigits(array2)); 

    // Count the Letters
    System.out.println("Letters in array1? "+ countLetters(array1)); 
    System.out.println("Letters in array2? "+ countLetters(array2)); 

    // Count the Capital letters
    System.out.println("Cap Letters in array1? "+ countCapLetters(array1)); 
    System.out.println("CapLetters in array2? "+ countCapLetters(array2)); 

    // Count the Lower letters
    System.out.println("Lower Letters in array1? "+ countLowerLetters(array1)); 
    System.out.println("Lower Letters in array2? "+ countLowerLetters(array2)); 

    // Count the vowels 
    System.out.println("Lower Letters in array1? "+ countLowerLetters(array1)); 
    System.out.println("Lower Letters in array2? "+ countLowerLetters(array2)); 

  } // end of method main


} // end of class Main
