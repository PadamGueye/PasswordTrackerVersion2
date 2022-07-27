import java.io.*;
import java.util.*;

public class Dictionnaire implements Recherche {    
    public String chercher() throws IOException
    {
        Scanner scan = new Scanner(new File("dico.txt"));
        Testeur test1 = new Testeur();
        String line= null;
        search:{while(scan.hasNextLine()){
            line = scan.nextLine();
            if(test1.requete(line)){
                break search;
            }
        }
    }
        return line;
    }
}