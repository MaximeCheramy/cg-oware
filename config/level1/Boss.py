import random

random.seed(92387402)

# game loop
while True:
    houses = [int(i) for i in input().split()]
    need_feed = all(h == 0 for h in houses[6:])
    valid_moves = [i for i in range(6)
        if (need_feed and houses[i] > 5 - i) or (not need_feed and houses[i] > 0)]

    p = None
    for i in valid_moves:
        if 6 <= i + houses[i] < 12 and houses[i + houses[i]] in [1, 2]:
            p = i

    if p:
        print(p)
    else:
        print(random.choice(valid_moves))