@echo off

rem �����⨬ �롮� ��㣨
echo ���� �롮� ��㣨

java -cp dist/QSystem.jar ru.apertum.qsystem.client.forms.FWelcome -sport 3128 -cport 3129 -s localhost  debug tach med1 info1

pause