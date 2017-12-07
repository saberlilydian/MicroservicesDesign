Using Jmeter to do pressure test.

master:
10.141.211.173

slave:
10.141.211.172,10.141.211.174,10.141.211.175

²âÊÔ¼Æ»®£º
²âÊÔµÇÂ¼×¢²á.jmx

slave¶Ë£º
./jmeter-server

master¶Ë£º
./jmeter -n -t ²âÊÔµÇÂ¼×¢²á.jmx -l loginRegisterSplit.jtl -R 10.141.211.172,10.141.211.174,10.141.211.175
./jmeter -n -t ²âÊÔµÇÂ¼×¢²á.jmx -l loginRegisterMerged.jtl -R 10.141.211.172,10.141.211.174,10.141.211.175

