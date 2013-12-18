#Make it quicker than O(n)
#Run two seperate while loops, one that checks for multiples of 3 and the other
#that checks for multiples of 5
def findNaturalNumbers(n):
	n = int(n)
	result = []
	sum = 0
	if n > 3:	
		for i in range(3, n , 3):
			result.append(i)
	if n > 5:
		for i in range(5, n, 5):
			result.append(i)

	#Remove duplicates
	result = list(set(result))
	for i in result:
		sum += i

	print sum


s = raw_input('Sum of natural numbers that are multiples of 3 and 5 under: ')
findNaturalNumbers(s)