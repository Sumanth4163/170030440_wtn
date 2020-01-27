public class A{
    public static void main(String args[]) {
        try{
            int n=3;
            int a[][]=new int[n][n];
            int t=0;
            if(args.length<9)
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
            int max =0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(a[i][j]>max)
                    max=a[i][j];
                }
            }
            System.out.println("The biggest number in the given array is "+max);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}