"""IEEE is having its AGM next week and the president wants to serve cheese prata after the meeting. 
The subcommittee members are asked to go to food connection and get P(P<=1000) pratas packed for the function. 
The stall has L cooks(L<=50) and each cook has a rank R(1<=R<=8). 
A cook with a rank R can cook 1 prata in the first R minutes 1 more prata in the next 2R minutes,
 1 more prata in 3R minutes and so on(he can only cook a complete prata) 
 ( For example if a cook is ranked 2.. he will cook one prata in 2 minutes one more prata in the next 4 mins an 
 one more in the next 6 minutes hence in total 12 minutes he cooks 3 pratas in 13 minutes also he can cook only 3 pratas 
 as he does not have enough time for the 4th prata). 
The webmaster wants to know the minimum time to get the order done. Please write a program to help him out.
"""
def how_many_parata(ranks, parata_required, mid_time):
    parata_made = 0

    for rank in ranks:
        time = rank
        r_value = 2
        while time <= mid_time:
            parata_made += 1
            time += (rank * r_value)
            r_value += 1
        if parata_made >= parata_required:
            return True
    return False
        
def minTimeRequired(ranks , parata_required):
    best_time =1 
    worst_time = 10e8
    
    while best_time < worst_time:
        mid_time = best_time + (worst_time - best_time)//2
        parata_can_be_made = how_many_parata(ranks,parata_required, mid_time)
        if parata_can_be_made is True:
            min_time = mid_time
            worst_time = mid_time-1
        else:
            best_time = mid_time + 1
    return min_time
first_parata = 10
first_chefs = [1, 2, 3, 4]
second_parata = 8
second_chefs = [1]
third_parata = 8
third_chefs = [1,1,1,1,1,1,1,1]
print(minTimeRequired(first_chefs,first_parata),"min Time")
print(minTimeRequired(second_chefs,second_parata),"min Time")
print(minTimeRequired(third_chefs,third_parata),"min Time")