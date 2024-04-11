import java.util.ArrayList;

public class exo2
{
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("John");
        myList.add("Zoe");
        myList.add("Shelley");
        myList.add("Emmeline");
    }
    public static int find(ArrayList<String> myList)
    {

        int find=0;
        for(int i=0;i<myList.size();i++)
        {
            if(myList.get(i).equals("Zoe"))
            {
                find=i;
            }
        }
        return -1;
    }
}
