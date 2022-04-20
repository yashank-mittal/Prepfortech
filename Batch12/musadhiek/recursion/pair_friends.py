"""
# Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. 
# Find out the total number of ways in which friends can remain single or can be paired up.
"""

# this solution is giving an error "unsupported operand type(s) for +: 'NoneType' and 'int'", when n is 2 or more, at somepoint it
# is pair_friends out put is None.couldnt identify the case.
def pair_friends(n):
    if n <= 0:
        return 1
    return pair_friends(n-1) + ( n-1 ) * pair_friends(n-2)

pair_friends(2)