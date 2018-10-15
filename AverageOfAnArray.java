import java.util.Scanner;

class AverageOfAnArray
{
  public static void main(String args[])
  {
        Scanner s= new Scanner(System.in);
        //get number of numbers
        int n = s.nextInt();
        
        //get numbers
        double[] array = new double[n];
        for(int i=0;i<array.length;i++)
        {
            array[i]=s.nextDouble();
        }
        double sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        System.out.println("The average of given numbers = "+(sum/n));
    }
}
