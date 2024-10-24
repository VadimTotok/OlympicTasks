import sys

k = int(input())
n = int(input())
v = [int(input()) for i in range(n)]

if sum(v) < k:
    print(-1)
    sys.exit(0)

ans = 2 * k
v.sort()

while k > 0:
    k -= v[-1]
    v.pop()

    if k > 0:
        ans += 2 * k

print(ans)