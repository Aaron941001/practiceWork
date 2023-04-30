created a generic class Stack that takes a type parameter T. We are using an array stack to hold the elements of the stack and an integer variable top to keep track of the index of the top element in the stack.

The push() method adds an element to the top of the stack. It first checks if the stack is full and throws an exception if it is. Otherwise, it increments the top variable and assigns the new element to the stack at the new top index.

The pop() method removes and returns the top element from the stack. It first checks if the stack is empty and throws an exception if it is. Otherwise, it decrements the top variable and returns the element at the new top index.

The peek() method returns the top element of the stack without removing it. It first checks if the stack is empty and throws an exception