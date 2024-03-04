public class secondaire
{
    public static int afficherex6(int[] a)
        {
            //ecrire une methode permettant d'afficher l'indice de l'element le plus grand dans un tableau d'entiers

            int max = 0;
            for (int i = 0; i < a.length; i++)
            {
                if (a[i] > max)
                {
                    max = i;
                }
            }
            return max;
        }
        public static int afficherex2(int[] b)
        {
            //ecrire une methode permettant d'afficher l'element le plus petit dans un tableau d'entiers
            int min = b[0];
            for (int i = 0; i < b.length; i++)
            {
                if (b[i] < min)
                {
                    min = b[i];
                }
            }
            return min;
        }




}
