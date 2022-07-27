import java.io.IOException;

public class BruteForce implements Recherche {
    public static char[] element = "abcdefghijklmnopqrstuvwxyz".toCharArray();
public String chercher() throws IOException{
    Testeur test1 = new Testeur();
    int a=0,b=0,c=0;
    int d=0,e=0;
    String chaine= null;
        procedure:{
            for (a=0; a<26;a++ ){   
            chaine =  ""+element[a];

            if(test1.requete(chaine)){
                System.out.println("Le mot de passe entre est trouve"+chaine);
                break procedure;
            }
                for (b=0; b<26 ;b++ ){
                    chaine = ""+element[a]+element[b];
                    

                    if(test1.requete(chaine)){
                        System.out.println("Le mot de passe entre est trouve"+chaine);
                        break procedure;
                    }

                        for (c=0; c<26; c++){
                            chaine = ""+element[a]+element[b]+element[c];

                            if(test1.requete(chaine)){
                                System.out.println("Le mot de passe entre est trouve"+chaine);
                                break procedure;
                            }
                                for (d=0; d<26 ; d++)
                                {
                                    chaine = ""+element[a]+element[b]+element[c]+element[d];

                                    if(test1.requete(chaine)){
                                        System.out.println("Le mot de passe entre est trouve "+chaine);
                                        break procedure;
                                    }

                                    
                                    for (e=0; e<26 ; e++)
                                    {
                                        chaine = ""+element[a]+element[b]+element[c]+element[d]+element[e];
                                        if(test1.requete(chaine)){
                                            System.out.println("Le mot de passe entre est trouve "+chaine);
                                            break procedure;
                                        }
                                    }
                                    
                                }   
                        }              
                }
            }
        }
        return chaine;
        
    }
}
