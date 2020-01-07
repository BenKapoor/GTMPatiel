<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Authentification</title>
        <link type="text/css" rel="stylesheet" />
    </head>
    <body>
        <form method="post" action="authentification">
	    <fieldset>
                <legend>Authentification</legend>
                <p>Vous pouvez vous authentifier via ce formulaire.</p>

                <label for="email">Adresse email <span class="requis">*</span></label>
                <input type="email" id="email" name="email" value="" size="20" maxlength="60" />
                <span class="erreur">${erreurs['email']}</span>
                <br />

                <label for="password">Mot de passe <span class="requis">*</span></label>
                <input type="password" id="password" name="password" value="" size="20" maxlength="20" />
                <span class="erreur">${erreurs['password']}</span>
                <br />

                <input type="submit" value="Authentification" class="sansLabel" />
                <br />
            </fieldset>
        </form>
    </body>
</html>