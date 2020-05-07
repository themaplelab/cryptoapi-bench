#############
# counts distribution 
# of hotfix types
############

echo -n "Number of NATURAL: "
grep -R "NATURAL" | wc -l
echo -n "Number of ADJUSTED: "
grep -R	"ADJUSTED" | wc	-l
echo -n "Number of VM ASSISTED: "
grep -R	"ASSISTED" | wc	-l


echo -n "Total number of classes (-1 for TestRunner): "
find . -name "*.java" | wc -l

echo -n "Total number of misuses across all classes: "
grep -R "Error" | wc -l

echo -n "Number of classes where misuses were totally removed: "
#grep "Findings" somefile | wc -l
