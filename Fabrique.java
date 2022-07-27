public class Fabrique {
	
        public Recherche getchercher(int chercheType){	
           if(chercheType==1){
              return new BruteForce();
              
           } else if(chercheType==2){
              return new Dictionnaire();
              
           } 
           return null;
        }
}