public class B {
    public static void main(String args[]) {
        try{
            int n=2;
            int a[][]=new int[n][n];
            int t=0;
            if(args.length<4)
            {
               System.out.println("Please enter"+n*n+"integer numbers ")   ; 
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    
                        a[i][j]=Integer.parseInt(args[t]);
                        t++;
                }
            }
            int temp[][]=new int[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    temp[i][j]=a[n-i-1][n-j-1];
                }
            }
            
              for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(temp[i][j]+" ");
                }
                System.out.println();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}