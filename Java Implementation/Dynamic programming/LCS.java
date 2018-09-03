public class LCS
{
public static void main(String args[])
{
String X=args[0];
String Y=args[1];
int m=X.length();
int n=Y.length();

int lcs[][]=new int[m+1][n+1];
for(int i=0;i<=m;i++)
{
        for(int j=0;j<=n;j++)
         {
                if(i==0 || j==0)
                {
                    lcs[i][j]=0;
                }
               else if(X.charAt(i-1)==Y.charAt(j-1))
                {
                    lcs[i][j]=1+lcs[i-1][j-1];
                }
               else
               {
                    lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
               }
          }
}

//printing LCS table
for(int i=0;i<=m;i++)
{
        for(int j=0;j<=n;j++)
            {
               System.out.print("  "+lcs[i][j]);
            }
         System.out.println();
}

System.out.println("LONGEST COMMON SUBSEQUENCE IS OF LENGTH "+lcs[m][n]);
}
}