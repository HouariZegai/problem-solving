""" Asked by: Uber

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?

"""

in_array =  [3, 2, 1]
out_array = []
for i in range(len(in_array)):
	res = 1
	for j in range(len(in_array)):
		if j != i:
			res *= in_array[j]
	out_array.append(res)

print(out_array)