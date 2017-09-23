@echo off
echo -----------------------------------------
echo . (C) MIW -UPM
echo -----------------------------------------
echo .
set workspace=C:\Users\Diana\workspaceIWVG\IWVG.SwC.Diana.Armijo
echo .
cd %workspace%
echo ============ mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml ... ==================
echo . Se prepara cobertura
call mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml

echo ============ mvn sonar:sonar ... =======================================================
echo . Se analiza y sube a sonar cloud
call mvn sonar:sonar -X -Dsonar.organization=dianagtf-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=36ee4c61a3790fd6a2ae502215d9c89775fead40 --settings settings.xml
pause