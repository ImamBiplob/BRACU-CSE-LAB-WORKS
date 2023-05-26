import random
# Initial values of Aplha and Beta
MAX, MIN = 1000, -1000


# Returns optimal value for current player
# (Initially called for root and maximizer)
def minimax(currentdepth, nodeIndex, maximizingPlayer,
            values, alpha, beta):
    # Terminating condition. i.e
    # leaf node is reached
    global nodecounter
    if currentdepth == depth:
        return values[nodeIndex]

    if maximizingPlayer:

        best = MIN

        # Recur for left and right children
        for i in range(branch):

            val = minimax(currentdepth + 1, nodeIndex * branch + i,
                          False, values, alpha, beta)
            best = max(best, val)
            alpha = max(alpha, best)

            # Alpha Beta Pruning
            if beta <= alpha:
                nodecounter += 1
                break

        return best

    else:
        best = MAX

        # Recur for left and
        # right children
        for i in range(branch):

            val = minimax(currentdepth + 1, nodeIndex * branch + i,
                          True, values, alpha, beta)
            best = min(best, val)
            beta = min(beta, best)

            # Alpha Beta Pruning
            if beta <= alpha:
                nodecounter += 1
                break

        return best


# Driver Code
if __name__ == "__main__":
    turn = int(input())
    branch = int(input())
    x, y = map(int, input().split())
    depth = turn * 2
    values = random.sample(range(x, y), branch ** depth)
    print(values)
    nodecounter = 0
    print("Depth:", depth)
    print("Branch:", branch)
    print("Terminal States:", branch ** depth)

    print("Maximum amount:", minimax(0, 0, True, values, MIN, MAX))

    print("Comparisons:", branch ** depth)

    print("Comparisons:", branch ** depth - nodecounter)


