<html>
<head> <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
 crossorigin="anonymous"> 
    <title>supprimer</title>
</head>

<body>
<div class="row">
    <div class="col-md-6 col-md-offset-3" id="login">
        <form action="suppServlet" method="POST">
        	<br>
            <h1 class="text-danger" ><center> supprimer un etudiant </center> </h1>
            
            <div class="form-group">
                <label  class="text-danger" >ID : </label>
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                    <input type="text" class="form-control" id="id" name="id" placeholder="Entrer ID">
                </div>
            </div>
             <br>
             
            <div class="form-group">
            <center>
                <input type="submit"  value="supprimer"  class="text-danger" >
                </center>
            </div>

        </form>
</body>
</html>