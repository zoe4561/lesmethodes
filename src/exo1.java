import java.util.ArrayList;

public class exo1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        //find the sum of all the elements in the array
        int sum = 0;
        int max = 0;
        for (int i = 0; i < myList.size(); i++) {
            sum = sum + myList.get(i);
            if (myList.get(i) > max)
            {
                max=myList.get(i);
            }
        }
        System.out.println("The sum is: "+sum);
        System.out.println("The max is: "+max);
    }

}
