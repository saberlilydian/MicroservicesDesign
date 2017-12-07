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
./jmeter -n -t ²âÊÔµÇÂ¼×¢²á.jmx -R -l loginRegisterSplit.jtl 10.141.211.172,10.141.211.174,10.141.211.175
./jmeter -n -t ²âÊÔµÇÂ¼×¢²á.jmx -R -l loginRegisterMerged.jtl 10.141.211.172,10.141.211.174,10.141.211.175

