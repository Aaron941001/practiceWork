import heapq

def dijkstra(graph, start):
    distances = {node: float('infinity') for node in graph}
    distances[start] = 0
    queue = [(0, start)]
    while queue:
        (current_distance, current_node) = heapq.heappop(queue)
        if current_distance > distances[current_node]:
            continue
        for neighbor, weight in graph[current_node].items():
            distance = current_distance + weight
            if distance < distances[neighbor]:
                distances[neighbor] = distance
                heapq.heappush(queue, (distance, neighbor))
    return distances

def get_shortest_path(graph, start, end):
    distances = dijkstra(graph, start)
    return distances[end]

if __name__ == "__main__":
    graph = {
        'A': {'B': 7, 'C': 9, 'D': 14},
        'B': {'A': 7, 'C': 10, 'D': 15},
        'C': {'A': 9, 'B': 10, 'D': 11, 'E': 2},
        'D': {'A': 14, 'B': 15, 'C': 11, 'E': 6},
        'E': {'C': 2, 'D': 6}
    }
    start = 'A'
    end = 'E'
    shortest_path = get_shortest_path(graph, start, end)
    print(f"Shortest path from node {start} to node {end}: {shortest_path}")
