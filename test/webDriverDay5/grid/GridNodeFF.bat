E:
cd "E:\Selenium Training_Grace\webdrivertraining\lib"
java ^
-Dwebdriver.gecko.driver="E:\Selenium Training_Grace\webdrivertraining\test\resources\geckodriver -64bit.exe" ^
-jar selenium-server-standalone-3.141.59.jar -role node ^
-hub http://192.168.0.111:4444/grid/register ^
-browser "browserName=firefox,maxInstances=3" ^
-maxSession 3
pause