if __name__ == '__main__':
    with open("input1") as f:
        nodes = int(f.readline())
        edges = int(f.readline())
        #print(nodes, edges)
        graph = [[] for i in range(nodes)]

        for i in range(edges):
            u, v = map(int, f.readline().split())
            graph[u].append(v)
            graph[v].append(u)
        #for i in range(nodes):
            #print(i, "=>", graph[i])

        goal = int(f.readline())
        #print(goal)

        queue = [0]
        visitedlist = [False]*nodes

        distancelist = [0]*nodes

        #print(visitedlist)

        while queue:
            node = queue.pop(0)
            #print(node)
            if(node == goal):
                print(distancelist[node])

            else:

                for x in range(len(graph[node])):
                    if(visitedlist[graph[node][x]]==False):
                        visitedlist[graph[node][x]] = True
                        distancelist[graph[node][x]] = distancelist[node]+1
                        queue.append(graph[node][x])



