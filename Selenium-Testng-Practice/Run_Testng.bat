@ECHO OFF
CALL mvn clean test -Dsurefire.suiteXmlFiles=testng.xml
PAUSE
