while read p; do

	var="$(echo $p | cut -d / -f -4)"
	class="$(echo $p | cut -d / -f 5-)"
	echo "moving $class into /root/crypto-bench-patched/$var"

	find . -name $class.java | xargs cp -t /root/crypto-bench-patched/src/main/java/$var

	done </root/eval/cryptoapi-bench/cryptoGuardMisuseExtras.txt


	
