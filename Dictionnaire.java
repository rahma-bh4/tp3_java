public class Dictionnaire 
{
    private int nb_mots;
    private Mot_dict[] Dict;
    private String nom;
    private int taille;
    public Dictionnaire(int n,String ch)
    {
        
        taille=n;
        Dict=new Mot_dict[taille]
        Nom=ch;
    }
    public Dictionnaire(int n)
    {
        taille=n;
        Dict=new Mot_dict[taille];
    }
    public void Ajouter_Mot(Mot_dict m)
    {
        int n=0;
      if(taille==nb_mots)
      {
        System.out.println("toute les cases du tableau sont rempli !!");
      }
     else {
        int i=nb_mots
        while(i>0 && Dict[i].compareTo(m.mot)>0)
        {
            Dict[i+1]=Dict[i];
            i--;
        }
        Dict[i]=m;
      }
    }
    public void trier()
    {
         String temp;
        // Parcourir tous les éléments du tableau
        for (int i = 0; i < n - 1; i++) {
            // Derniers i éléments sont déjà en place
            for (int j = 0; j < n - i - 1; j++) {
                // Comparer les chaînes de caractères
                if (tableau[j].compareTo(tableau[j + 1]) > 0) {
                    // Échanger si nécessaire
                    temp = tableau[j];
                    tableau[j] = tableau[j + 1];
                    tableau[j + 1] = temp;
                }
            }
        }
    }
}