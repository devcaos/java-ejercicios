@echo off
chcp 65001 >nul
cd /d "%~dp0"
echo === Subiendo ejercicios a GitHub (devcaos/java-ejercicios) ===
echo.
if exist .git (
  echo Esta carpeta ya es un repositorio Git. No hago nada para no romper nada.
  pause
  exit /b
)
git init
git add .
git commit -m "Ejercicios ej1-ej80"
git branch -M main
git remote add origin https://github.com/devcaos/java-ejercicios.git
git push -u origin main
echo.
if errorlevel 1 (
  echo *** Algo ha fallado. Haz una captura de esta ventana y mandasela a Claude. ***
) else (
  echo *** Listo. Mira https://github.com/devcaos/java-ejercicios ***
)
pause
