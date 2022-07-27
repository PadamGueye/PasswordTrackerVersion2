import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Testeur {
    public static void main(String[] args) throws IOException {        
       Interface myApp = new Interface();
    }

     public boolean requete(String password) throws IOException{
        URL url = new URL("http://localhost/projetPassword/bienvenue.php");
        String postData = "login=padam&motDePasse="+password;

        System.out.println(password);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("Content-Length", Integer.toString(postData.length()));
        conn.setUseCaches(false);

        try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())){
            dos.writeBytes(postData);
        }

        StringBuilder sb = new StringBuilder();
        try(BufferedReader in = new BufferedReader( new InputStreamReader(conn.getInputStream())))
            {
                String line;
                while ((line = in.readLine()) != null) {
                sb.append(line + '\n');
            }
        
        String readurl = sb.toString();
        int index = readurl.indexOf("Connexion reussie");

            if (index != -1) {
                return true;
            }
            else {
                return false;
            }        
        }    
    }
}