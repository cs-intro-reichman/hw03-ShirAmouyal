/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        // Replace the following statement with your code
        int i=0;
        String s1="";
        boolean b1;
        while(i<s.length())
        {
            b1=false;
            for(int x=65;x<=90;x++)
            {
             if((char)s.charAt(i)==x)
             {
                s1+=(char)(s.charAt(i)+32); 
                b1=true;
             }
            }
            if(b1==false)
            {
            s1+=(char)s.charAt(i);
            }
            i++;
        }
        return s1;
    }
}