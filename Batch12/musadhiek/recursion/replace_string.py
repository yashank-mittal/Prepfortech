"""
# Given string str of size N. The task is to write a recursive function to replace all occurrences of pi 
# with 3.14 in the given string and print the modified string.
Examples:
Input : str = “pippppiiiipi”
Output : 3.14ppp3.14iii3.14
Input : str = “pip”
Output : 3.14p
Input : str = “xpix”
Output : x3.14x
"""
def replace_string(string=None):
    if len(string)>=2:
        if string[0]=="p" and string[1]=="i":
            string.replace("pi","3.14",1)
            replace_string(string[2:])
        else:
            string[0:1]+replace_string(string[1: ])
    return print(string,"string")
replace_string("pipe")