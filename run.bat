﻿set projectLocation=D:\Navya testing\NEW ECLIPSE\Framework
cd %projectLocation%
set classpath=%projectLocation%\bin;projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\TESTng.xml
Timeout 90