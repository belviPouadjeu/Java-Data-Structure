# StackLinkedList Assignment

## Objective
To implement a stack using a linked list in Java. This stack will perform the following operations:

- **Push**: Add an element to the stack.
- **Pop**: Remove and return the top element of the stack.
- **Peek**: View the top element without removing it.
- **Display**: List all elements in the stack.

---

## Part 1: Node Class

### Requirements
Create an inner class named `Node` to represent each element in the stack.

Each node should contain:
- A `data` field to store the element (e.g., a string).
- A `next` field to reference the next node in the stack.

**Constructor**:
- Initialize the `data` field with the given value.
- Set `next` to `null`.

---

## Part 2: StackLinkedList Class

### Requirements

**Attributes**:
- A `top` reference to track the top element of the stack.

**Constructor**:
- Set `top` to `null` to indicate an empty stack.

### Operations

#### Push Operation
- Create a new `Node` object with the given data.
- Set the `next` field of the new node to the current `top`.
- Update `top` to point to the new node.
- Print a confirmation message indicating the action was added.

#### Pop Operation
- Check if the stack is empty (`top == null`).
  - If empty, print an error message and return `null`.
- Otherwise:
  - Store the `data` of the `top` node.
  - Update `top` to `top.next`.
  - Print a confirmation message.
  - Return the stored `data`.

#### Peek Operation
- Check if the stack is empty.
  - If empty, print an error message and return `null`.
- Otherwise:
  - Return the `data` of the `top` node without removing it.
  - Print the value.

#### Display Operation
- Check if the stack is empty (`top == null`).
  - If empty, print a message indicating no elements to display.
- Otherwise:
  - Use a `while` loop to traverse through the stack starting from `top`.
  - Print the `data` of each node during traversal.

---

