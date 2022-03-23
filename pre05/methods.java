import java.io.*;
import java.util.*;
public class methods
{
   public static void main(String[] args)
   {
       Divisible(9,3);
   }

 // 6.2 put in Method.java

  public static boolean Divisible(int m,int n )
    {
        if((m % n) == 0) 
        return true;
        else
        return false;
    }
}