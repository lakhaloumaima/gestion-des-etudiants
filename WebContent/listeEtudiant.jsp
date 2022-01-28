 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head> <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
 crossorigin="anonymous"> 
    <title>Gestion des étudiants</title>
</head>

<body>
<div class="row">
    <div class="col-md-6 col-md-offset-3" id="login">
        <form action="listeServlet" method="POST">
        	<br>
        	<div class="form-group">
               <button type="submit"  ><a class="text-danger" href="Connexion.jsp"> Déconnexion</a></button>
            </div>
            
            <h1 class="text-danger" ><center> GESTION ETUDIANTS </center> </h1>
           <table style="width:100%">
            <tr>
                <th>ID</th>
                <th>Nom</th>
                <th>Prenom</th>
                <th>Classe</th>
            </tr>
            <c:forEach items="${etudiants}" var="etudiant">
                <tr>
                    <td>${etudiant.id}</td>
                    <td>${etudiant.nom}</td>
                    <td>${etudiant.prenom}</td>
                    <td>${etudiant.classe}</td>
                </tr>
            </c:forEach>
            			</table>

            <br> <br>
            <div class="form-group">
            <center>
                <button type="submit"  ><a class="text-danger" href="ajouterEtudiant.jsp"> ajouter</a></button>
                </center>
            </div>
             <div class="form-group">
            <center>
                <button type="submit"  ><a class="text-danger" href="suppEtudiant.jsp"> supprimer</a></button>
                </center>
            </div>
            <div class="form-group">
            <center>
               <button type="submit"  ><a class="text-danger" href="modifEtudiant.jsp">mise a jour</a></button>
                </center>
            </div>

        </form>
</body>
</html>