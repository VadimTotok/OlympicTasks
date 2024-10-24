a = int(input())
b = int(input())
d = int(b)

if b > 1:
    b = b ** 2
    c = (a ** 2 // b) - 1
    c = c * d
else:
    b = b ** 2
    c = (a ** 2 // b) - 1

print(c)