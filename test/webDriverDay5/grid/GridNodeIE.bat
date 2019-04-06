E:
cd "E:\Selenium Training_Grace\webdrivertraining\lib"
java ^
-Dwebdriver.ie.driver="E:\Selenium Training_Grace\webdrivertraining\test\resources\IEDriverServer.exe" ^
-jar selenium-server-standalone-3.13.0.jar -role node ^
-hub http://192.168.0.111:4444/grid/register ^
-browser "browserName=internet explorer,maxInstances=3" ^
-maxSession 4
pause