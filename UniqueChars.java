/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str =args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        String s1="";
        String s2="";
        int i=0;
        while(i<s.length())
        {
          boolean b1=false;
          for(int x=0;x<s1.length();x++)
          {
            if(s.charAt(i)==32){
                s2+="";

            }
           if(s.charAt(i)==s1.charAt(x))
           {
            b1=true;
           }
          }
          if(b1==false)
          {
           s2+=s.charAt(i);
           s1+=s.charAt(i);
          } 
          i++;
          
        }
        return s2;
    }
}