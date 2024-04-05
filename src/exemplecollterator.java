import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class exemplecollterator
{
    public static void main(String[] args)
    {
        //Creating an ArrayList
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        //utiliser iterator
        Iterator<String> iterator = list.iterator();
        System.out.println("Parcourir avec iterator: ");
        while (iterator.hasNext())
        {
            String element = iterator.next();
            System.out.println(element + " ");
        }
        System.out.println();
        //Modifier pendant le parcours
        iterator = list.iterator();
        System.out.println("Modification: ");
        while (iterator.hasNext())
        {
            String element = iterator.next();
            if(element.equals("B"))
            {
                iterator.remove(); //Enleve B de la liste
            }
            System.out.println(element + " ");
        }
        System.out.println();
        //Imprimer
        System.out.println("Apres avoir modifie en enlevant 'B' " + list);
    }
}
