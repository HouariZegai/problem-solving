""" Asked by: Amazon [Easy]

Run-length encoding is a fast and simple method of encoding strings.
The basic idea is to represent repeated successive characters as a single count and character.
For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".

Implement run-length encoding and decoding.
You can assume the string to be encoded have no digits and consists solely of alphabetic characters.
You can assume the string to be decoded is valid.

"""

def encode_str(string):
	# pre condition
	if len(string) == 0:
		return ""
	if len(string) == 1:
		return "1" + string

	result =  ""
	count = 1
	for i in range(1, len(string)):
		if string[i - 1] == string[i]:
			count += 1
		else:
			result = result + str(count) + string[i - 1]
			count = 1

	if len(result) == 0:
		result = result + str(count) + string[0]

	if  result[len(result) -1] != string[len(string) - 1]:
		result = result + str(count) + string[len(string) - 1]

	return result

def decode_str(string):
	if len(string) == 0:
		return ""

	result = ""
	for i in range(1, len(string), 2):
		result = result + generate_chars(string[i], int(string[i - 1]))

	return result

def generate_chars(c, num): # generate characters
	result = ""
	for i in range(num):
		result = result + c
	return result

print("--------- encode samples ---------")
print(encode_str("AAAABBBCCDAA")) # output: 4A3B2C1D2A
print(encode_str("Z")) # output: 1Z
print(encode_str("")) # output: 

print("--------- decode samples ---------")
print(decode_str("4A3B2C1D2A")) # output: AAAABBBCCDAA
print(decode_str("6Z")) # output: ZZZZZZ
print(decode_str("")) # output: 