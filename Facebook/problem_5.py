""" Asked by: Facebook [Easy].

Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).

For example, given the string "([])[]({})", you should return true.

Given the string "([)]" or "((()", you should return false

"""

def is_well_formed(string):
	flage_remove_formed = True
	while flage_remove_formed:
		flage_remove_formed = False
		if "()" in string:
			string = string.replace("()", "")
			flage_remove_formed = True
		
		if "{}" in string:
			string = string.replace("{}", "")
			flage_remove_formed = True

		if "[]" in string:
			string = string.replace("[]", "")
			flage_remove_formed = True

	return string == ""

# Test solution (test samples)
str1 = "([])[]({})"
print(str1, " = ", is_well_formed(str1))
str2 = "([)]"
print(str2, " = ", is_well_formed(str2))
str3 = "((()"
print(str3, " = ", is_well_formed(str3))
	