import java.util.Stack;

public class QueueusingTwoStacks<E> {
    Stack<E> newElements;
    Stack<E> oldElements;
    public QueueusingTwoStacks() {
        newElements = new Stack();
        oldElements = new Stack();
    }

    public int size() {
        return newElements.size() + oldElements.size();
    }

    public void add(E e) {
        newElements.push(e);
    }

    public E remove() {
        shiftStacks();
        return oldElements.pop();

    }

    public E peek() {
        shiftStacks();
        return oldElements.peek();
    }

    public boolean isEmpty() {
        if(oldElements.isEmpty() && newElements.isEmpty()) {
            return true;
        }
        return false;
    }

    public void shiftStacks() {
        if(oldElements.isEmpty()) {
            while(!newElements.isEmpty()) {
                oldElements.push(newElements.pop());
            }
        }
    }








}
