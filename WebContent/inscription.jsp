<html>
<head> <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
 crossorigin="anonymous"> 
    <title>inscription</title>
</head>

<body>
<div class="row">
    <div class="col-md-6 col-md-offset-3" id="login">
        <form action="inscriServlet" method="POST">
        	<br>
            <h1 class="text-danger" ><center>  INSCRIPTION </center> </h1>
            
            <div class="form-group">
                <label  class="text-danger" >Nom : </label>
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                    <input type="text" class="form-control" id="nom" name="nom" placeholder="Entrer le nom">
                </div>
            </div>
             <br>
             
             <div class="form-group">
                <label  class="text-danger" >Prenom : </label>
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                    <input type="text" class="form-control" id="prenom" name="prenom" placeholder="Entrer le prenom">
                </div>
            </div>
             <br>
            
            <div class="form-group">
                <label  class="text-danger" >Login: </label>
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                    <input type="text" class="form-control" id="user" name="login" placeholder="Entrer identifiant">
                </div>
            </div>

            <div class="form-group">
                <label  class="text-danger" >Mot de passe: </label>
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                    <input type="password" class="form-control" id="password" name="password" placeholder="Entrer mot de passe">
                </div>
            </div>
             <br>

            <div class="form-group">
            <center>
                <input type="submit"  value="connexion"  class="text-danger" >
                </center>
            </div>
            <div class="form-group">
            <center>
                <input type="reset"  value="effacer"  class="text-danger" >
                </center>
            </div>

        </form>
</body>
</html>