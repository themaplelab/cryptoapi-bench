
count=0
mkdir patch
while read p; do

	echo "--------------"
	echo $p
    count=$((count+1))
#	echo $p | cut -d / -f -4
	var="$(echo $p | cut -d / -f -4)"
	class="$(echo $p | cut -d / -f 5-)"
	last="$(echo $p | sed 's/org\/cryptoapi\/bench\///g' | cut -d / -f -1)"
	echo "this is last path part: $last"
#	echo "making dir: patch/$var"
	echo "--------------"
	mkdir patch/misuse$count patch/misuse$count/org patch/misuse$count/org/cryptoapi patch/misuse$count/org/cryptoapi/bench patch/misuse$count/org/cryptoapi/bench/$last
	
		find src -name $class.java | xargs cp -t patch/misuse$count/$var/
		touch patch/misuse$count/expectations
done <cryptoGuardMisuses.txt  
