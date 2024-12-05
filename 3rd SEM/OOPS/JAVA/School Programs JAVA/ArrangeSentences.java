import java.io.*;
class ArrangeSentences
{
    public static void main(String args[])
    throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.print("Enter a paragraph of text: ");
        String p = br.readLine();
        int count = 0;
        for(int i = 0; i < p.length(); i++)
        {
            char ch = p.charAt(i);
            if(ch == '.' || ch == '?' || ch == '!')
                count++;
        }
        if(count > 10){
            System.out.println("Maximum 10 sentences allowed.");
            return;
        }
        String s[] = new String[count];
        int freq[] = new int[count];
        int k = 0;
        for(int i = 1; i <= count; i++)
        {
            for(int j = 0; j < p.length(); j++)
            {
                char ch = p.charAt(j);
                if(ch == '.' || ch == '?' || ch == '!')
                {
                    s[k] = p.substring(0, p.indexOf(ch) + 1);
                    freq[k] = frequency(s[k]);
                    p = p.substring(p.indexOf(ch) + 1);
                    p = p.trim();
                    k++;
                    break;
                }
            }
        }
        for(int i = 0; i < freq.length; i++){
            for(int j = 0; j < freq.length - 1 - i; j++){
                if(freq[j] > freq[j + 1]){
                    int temp1 = freq[j];
                    freq[j] = freq[j + 1];
                    freq[j + 1] = temp1;
                    String temp2 = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp2;
                }
            }
        }
        for(int i = 0; i < freq.length; i++)
            System.out.println(s[i] + " = " + freq[i]);
    }
    public static int frequency(String s){
        int count = 0;
        if(s.length() > 0)
            count = 1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' ')
                count++;
        }
        return count;
    }
}