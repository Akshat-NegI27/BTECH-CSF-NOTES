public class Identity_Matrix     
{
    public static void main(String[] args) 
    {
        int rows, cols;
        boolean flag = true;
        int a[][] = 
        {
        {1, 0, 0},
        {0, 1, 0},
        {0, 0, 1}
        };
        rows = a.length;
        cols = a[0].length;
        if(rows != cols)
        {
            System.out.println("Matrix should be a Square Matrix");            
        }
        else 
        {
            for(int i = 0; i < rows; i++)
            {
                for(int j = 0; j < cols; j++)
                {
                    if(i == j && a[i][j] != 1)
                    {
                        flag = false;
                        break;
                    }
                    if(i != j && a[i][j] != 0)
                    {
                        flag = false;
                        break;
                    }       
                }        
            }
            if(flag)
            System.out.println("Given matrix is an Identity Matrix.");
            else
            System.out.println("Given matrix is not an Identity Matrix.");
        } 
    } 
}          
