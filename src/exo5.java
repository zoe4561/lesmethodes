import java.util.ArrayList;

public class exo5
{
    public static void main(String[] args)
        {
            ArrayList<Integer> myList = new ArrayList<Integer>();
            myList.add(1);
            myList.add(24);
            myList.add(53);
            myList.add(12);
            //bubble sort
            for(int i=0; i<myList.size()-1; i++)
            {
                for(int j=0; j<myList.size()-i-1; j++)
                {
                    if(myList.get(j)>myList.get(j+1))
                    {
                        int temp = myList.get(j);
                        myList.set(j, myList.get(j+1));
                        myList.set(j+1, temp);
                    }
                }
            }
            for(int i=0; i<myList.size(); i++)
            {
                System.out.print(myList.get(i) + " ");
            }
            System.out.println();
        }
}

