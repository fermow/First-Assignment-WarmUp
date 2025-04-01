import java.util.Scanner;

public class Exercises
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.println("Your Number Is Prime");
        } else {
            System.out.println("Your Number Is Not Prime");
        }
        long m = scanner.nextLong();
        System.out.println(fibonacciIndex(m));
        int y = scanner.nextInt();
        char[][] cha = generateTriangle(y);
    
        for(int i = 0 ; i < y ; i++)
        {
            for(int j = 0 ; j < y ; j++ )
            {
                System.out.print(cha[i][j]);
            }
            System.out.println();
        }

    }


    /*
        complete this function to check if the input number is prime or not
     */
        public static boolean isPrime ( long n)
        {
            if(n==1)
            {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(n); i++)
            {
                if (n % i == 0)
                {
                    return false;
                }

            }
            return true;

        }



    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
        */

    public static long fibonacciIndex(long n) 
    {
        long a = 0; 
        long b = 1;
        long index = 0;
        long temp;

        while(a <= n) 
        {
            if(a == n || b == n) 
            {
                return index;
            }
            temp = a;
            a = a + b;
            b = temp;
            index++;
            
        }
        return -1;

    }


     /* 


        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!

        */
        
    

    public static char[][] generateTriangle(int n) {
        char[][] ch = new char[n][n];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                ch[i][j]= ' ';
            }
        }
    
        for(int i = 0 ; i < n  ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(i==0)
                {
                    ch[i][0] = '*';
                }
                else if(i == 1 )
                {
                    ch[i][0] = '*';
                    ch[i][1] = '*';
                }
                else if((i+1) == n )
                {
                    for(int c = 0 ; c < n ; c++)
                    {
                        ch[i][c] = '*';
                    }
                }
                else
                {
                    for(int m = 0; m <= i ; m++)
                    {
                        if(m == i  && i != 0 )
                        {
                            ch[i][m]= '*';
                            ch[i][0]= '*';
                        }
                        else
                        {
                            ch[i][m]=' ';
                        }
                    
                    }
                    
                }

            }
            

        }
            
        return ch;
        //return null;
    }

}


