import java.util.*;
public class Main

{

public static void main(String[] args)

{

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a paragraph with only 2 sentences : ");

    String P = sc.nextLine();

    P = P.toUpperCase();

    StringTokenizer St = new StringTokenizer(P , ".?!");

    int c = St.countTokens();

    if(c == 2)

    {

        String S[] = new String[c];

        for(int i = 0 ; i < c ; i++)

        {

            S[i] = St.nextToken();

        }

        S[0] = S[0].trim();

        S[1] = S[1].trim();

        String[] A = S[0].split(" ");

        System.out.println("Number of words in sentence 1 : " + A.length);

        String[] B = S[1].split(" ");

        System.out.println("Number of words in sentence 2 : " + B.length);

        for(int i = 0 ; i < A.length ; i++)

        {

            int count = 0;

            String W = A[i];

            for(int j = 0 ; j < B.length ; j++)

            {

                if(W.equals(B[j]) == true && B[j].equals("") != true)

                {

                    count++;

                }

            }

            if(count != 0)

            {

                for(int k = 0 ; k < A.length ; k++)

                {

                    if(W.equals(A[k]) && A[k].equals("") != true)

                    {

                        count++;

                        A[k] = "";

                    }

                }

                System.out.println(W+"\t"+count);

            }

        }

    }

    else

    {

        System.out.print("The paragraph does not contain exactly two sentences.");

    }

}
}


