import java.util.ArrayList;
import java.util.List;

public class exemplecoll
{
    public static void main(String[] args)
    {
        //Creating an ArrayList
        List<String> list = new ArrayList<>();

        //Ajouter des elements
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Avec les elements ajoutes: "+list);

        //Enlever des elements
        list.remove("B");
        System.out.println("Apres avoir enleve B: "+list);

        //Access aux elements
        String element = list.get(0);
        System.out.println("Element a l'indice 0: " + element);

        //Parcourir une collection
        System.out.print("Parcourir la collection: ");
        for (String str : list) {
            System.out.print(str+" ");
        }
        System.out.println();

        //Grandeur (size)
        int size=list.size();
        System.out.println("Grandeur de list: " +size);

        //Verifier si une collection est vide
        boolean isEmpty = list.isEmpty();
        System.out.println("Est vide? "+ isEmpty);

        //former une collection
        list.clear();
        System.out.println("apres avoir efface la liste: " +list);

        //Ajout de tous les elements venant d'une autre collection
        List<String> newList = new ArrayList<>();
        newList.add("X");
        newList.add("Y");
        newList.add("Z");
        list.addAll(newList);
        System.out.println("Apres ajout des elements d'une autre collection " + list);

    }
}
