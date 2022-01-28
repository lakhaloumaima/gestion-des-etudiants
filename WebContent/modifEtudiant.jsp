<html>
<head> <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
 crossorigin="anonymous"> 
    <title>mise a jour</title>
</head>

<body>
<div class="row">
    <div class="col-md-6 col-md-offset-3" id="login">
        <form action="modifServlet" method="POST">
        	<br>
            <h1 class="text-danger" ><center> mettre a jour un etudiant </center> </h1>
            <div class="form-group">
                <label  class="text-danger" >ID : </label>
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                    <input type="text" class="form-control" id="id" name="id" placeholder="Entrer ID">
                </div>
            </div>
             <br>
            
            
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
                <label  class="text-danger" >classe : </label>
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                    <input type="text" class="form-control" id="classe" name="classe" placeholder="Entrer le classe">
                </div>
            </div>

            

            <div class="form-group">
            <center>
                <input type="submit"  value="mise a jour"  class="text-danger" >
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