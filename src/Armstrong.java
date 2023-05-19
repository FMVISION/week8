public class Armstrong {
    /*
    10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
     */
int x;
int y ;
int z ;

    int power(int xx,long y) {
        if (y == 0)
            return 1;
        if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
    }
    int order(int x){
        int n = 0;
        while (x ! = 0){
            n++;
            x = x / 10;
        }
        return n;
        }

    boolean isArmstrong(int x)    // check armstrong number or not
    {
        int temp = x, sum = 0;
        while (temp ! = 0)
        {
            int r = temp % 10;
            sum = sum + power(r, new);
            temp = temp / 10;
        }
        return (sum == x);
    }

    public static void main(String[] args) {
        Armstrong ob = new Armstrong();
        int x = 153;
        System.out.println(ob.isArmstrong(x));
        x =1253;
        System.out.println(ob.isArmstrong(x));

    }

        }


