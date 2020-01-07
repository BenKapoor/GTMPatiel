mkdir C:\GTMPatiel
cd C:\GTMPatiel
:: Copie le projet
call mvn scm:checkout  -DconnectionUrl=scm:git:https://github.com/BenKapoor/GTMPatiel.git 

cd target\checkout\GTMPatiel

:: build
call mvn clean package

:: deploie
copy C:\GTMPatiel\target\checkout\CliniqueMaven\GTMPatielPRESENTATION\target\GTMPatielPRESENTATION.war

:: call Mettre le chemin de tomcat/startup.bat

start chrome http://localhost:8080/GTMPatiel/
