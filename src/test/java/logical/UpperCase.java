package logical;

public class UpperCase 
{
    public static void main(String[] args) 
    {
        String txt= "hEllo' worldZ";
        char [] ch = txt.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            if((int)ch[i]>96)
            {
                ch[i]= (char)((int)ch[i]-32);
            }
        }
        for (char c : ch)
        {
            System.out.print(c);
        }
    }
    
}