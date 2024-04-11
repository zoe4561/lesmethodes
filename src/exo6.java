import java.util.ArrayList;

public class exo6
{
    public static void main(String[] args)
        {
            ArrayList<Integer> myList = new ArrayList<Integer>();
            myList.add(1);
            myList.add(2);
            myList.add(3);
            //find the sum of all the elements in the array
            int sum = 0;
            for (int i = 0; i < myList.size(); i++)
            {
                sum = sum + myList.get(i);
            }
            System.out.println(sum);
            //find the max element in the array
            int max = 0;
            for (int i = 0; i < myList.size(); i++)
            {
                if (myList.get(i) > max)
                {
                    max = myList.get(i);
                }
            }
            System.out.println(max);
        }
}