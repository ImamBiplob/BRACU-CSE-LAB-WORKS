import random

MAX, MIN = 1000, -1000


def minimax(currentdepth, nodeIndex, maximizingPlayer,
            values, alpha, beta):

    global nodecount
    if currentdepth == depth:
        return values[nodeIndex]

    if maximizingPlayer:

        best = MIN

        for i in range(branch):

            val = minimax(currentdepth + 1, nodeIndex * branch + i,
                          False, values, alpha, beta)
            best = max(best, val)
            alpha = max(alpha, best)

            if beta <= alpha:
                nodecount += 1
                break

        return best

    else:
        best = MAX

        for i in range(branch):

            val = minimax(currentdepth + 1, nodeIndex * branch + i,
                          True, values, alpha, beta)
            best = min(best, val)
            beta = min(beta, best)

            if beta <= alpha:
                nodecount += 1
                break

        return best


if __name__ == "__main__":

    turn = int(input())
    branch = int(input())
    x, y = map(int, input().split())
    depth = turn * 2
    values = [0]*branch ** depth
    for i in range(branch ** depth):
        values[i] = random.randint(x, y)
    #values = random.sample(range(x, y), branch ** depth)
    print(values)
    nodecount = 0
    print("Depth:", depth)
    print("Branch:", branch)
    print("Terminal States:", branch ** depth)

    print("Maximum amount:", minimax(0, 0, True, values, MIN, MAX))

    print("Comparisons:", branch ** depth)
    #print(nodecount)
    print("Comparisons:", branch ** depth - nodecount)


