n, s = int(input()), 0

for _ in range(int(input())):
    s += int(input()) * n
    n //= 2

print(s)
