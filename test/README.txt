Using Jmeter to do pressure test.

master:
10.141.211.173

slave:
10.141.211.172,10.141.211.174,10.141.211.175

���Լƻ���
���Ե�¼ע��.jmx

slave�ˣ�
./jmeter-server

master�ˣ�
./jmeter -n -t ���Ե�¼ע��.jmx -R -l loginRegisterSplit.jtl 10.141.211.172,10.141.211.174,10.141.211.175
./jmeter -n -t ���Ե�¼ע��.jmx -R -l loginRegisterMerged.jtl 10.141.211.172,10.141.211.174,10.141.211.175

