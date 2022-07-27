<?php

  define('LOGIN','padam');  // Login correct
  define('PASSWORD','aacd');  // Mot de passe correct
  $message = '';      // Message à afficher à l'utilisateur
  $monUrl = 'http://localhost/projetPassword/main.php';
  $monUrl2 = 'http://localhost/projetPassword/bienvenue.php';
 
  if(!empty($_POST))
  {
      if(($_POST['motDePasse'] == PASSWORD) && ($_POST['login'] == LOGIN) )
    {
      header("Location: $monUrl");
      Exit();
    }
      else
    {
      header("Location: $monUrl2");
      Exit();     
    }
  }
?>
<!DOCTYPE html>
<html>
  <head>
    <title>Formulaire d'identification</title>
  </head>
  <body>
    <form action="<?php echo htmlspecialchars($_SERVER['REQUEST_URI'], ENT_QUOTES); ?>" method="post">
      <fieldset>
        <legend>Identifiant</legend>
          <p>
             <label for="login">Login :</label> 
            <input type="text" name="login" id="login" value="<?php if(!empty($_POST['login'])) { echo htmlspecialchars($_POST['login'], ENT_QUOTES); } ?>" />
          </p>
          <p>
            <label for="password">Mot de passe :</label> 
            <input type="password" name="motDePasse" id="password" value="" /> 
            <input type="submit" name="submit" value="Identification" />
          </p>
      </fieldset>
    </form>
  </body>
</html>