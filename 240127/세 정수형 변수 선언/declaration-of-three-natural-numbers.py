'''
a = 5
print("A is %d" % a)

b = "apple"
print("B is %s" % b)

print("A is {0} and B is {1}".format(a, b))
print("A is {new_a} and B is {new_b}".format(new_a=a, new_b=b))
print("B is {1} and A is {0}".format(a, b))
print("B is {new_b} and A is {new_a}".format(new_a=a, new_b=b))

print(f"A is {a} and B is {b}")
'''

a, b, c = 7, 23, 30
print(f"{a} + {b} = {c}")