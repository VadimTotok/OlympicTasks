n = int(input())
x = [int(input()) for i in range(n)]
h = [int(input()) for i in range(n)]
border = x[0]
i = 0

while i < n and x[i] <= border:
    border = max(border, x[i] + h[i])
    i += 1

j = n - 1
border = x[n - 1]

while j >= 0 and x[j] >= border:
    border = min(border, x[j] - h[j])
    j -= 1

print(min(n, i + (n - 1 - j)))