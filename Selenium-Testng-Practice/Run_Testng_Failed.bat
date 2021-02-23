@ECHO OFF
CALL mvn test -Dsurefire.suiteXmlFiles=target/surefire-reports/testng-failed.xml
PAUSE