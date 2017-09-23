@echo off
set workspace=C:\Users\Diana\workspaceIWVG\IWVG.SwC.Diana.Armijo
::Las variables de entorno se pueden configurar directamente en Windows cuando se tienen los permisos necesarios

echo -----------------------------------------
echo . (C) Limpieza y test en develop
echo -----------------------------------------
echo .
echo .
cd %workspace%
echo ============ mvn clean test (profile: develop) =======================================================
echo .
call mvn clean test   -Denvironment.type=develop --settings settings.xml
pause