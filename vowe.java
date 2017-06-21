import java.io.*;
import java.util.*;
class vowe
{
public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
 String a=s.next();
 char letter=a.charAt(0);
 if(Character.isLetter(letter))
 {
 if((letter=='a')||(letter=='e')||(letter=='i')||(letter=='o')||(letter=='u'))
 {
 System.out.println("VOWEL");
  }
 else
 System.out.println("CONSONANTS");
 }
 }
 }
