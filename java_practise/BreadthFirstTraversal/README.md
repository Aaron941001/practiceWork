we have a method breadthFirstTraversal() that takes a binary tree's root as an input. We are using a queue to keep track of the nodes that need to be visited.

We start by adding the root node to the queue. Then, while the queue is not empty, we remove the first node from the queue and process it by printing its data. We then add its left and right children to the queue if they exist.

This way, we are visiting all the nodes at the same level first and then moving on to the next level. This algorithm also known as Breadth-first search (BFS)

Note that in this example, I am assuming that you have a class Node that represents a node in the binary tree and has the data, left and right child as fields.