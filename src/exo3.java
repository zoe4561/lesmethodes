import java.util.ArrayList;

public class exo3

{
    public static void main(String[] args) {
        //create a list of integers
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        //find the sum of all the elements in the array
        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            sum = sum + myList.get(i);
        }
        System.out.println(sum);
        //find the average of all elements in the list
        int average = 0;
        for (int i = 0; i < myList.size(); i++) {
            average = average + myList.get(i);
        }
        average = average / myList.size();
        System.out.println(average);

        //find and remove all even numbers from the list
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                myList.remove(i);
            }
        }
        System.out.println(myList);

    }
}