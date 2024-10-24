n, m = sorted([int(input(), int(input))])

if n == m:
    result = 2 * n - 4 - n % 2
else:
    result = 4 * n - 4 - (n % 2 + m % 2 * (m < 2 * n)) * 2

print(result)