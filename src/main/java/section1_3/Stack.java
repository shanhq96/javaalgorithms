package section1_3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Author: shanhongqiang
 * DateTime: 2017/9/20 16:57
 * Description:please write the usage of this file.
 */
public class Stack<T> implements Iterable<T>{
    private Node first;// 栈顶(最近添加的元素)
    private int count;// 元素数量
    private class Node{
        // 定义了结点的嵌套类
        T item;
        Node next;
    }
    public boolean isEmpty(){
        return first == null;// 或 count == 0
    }

    public int size(){
        return count;
    }

    public void push(T item){
        //  向栈顶添加元素
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        count++;
    }

    public T pop(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        // 从栈顶删除元素
        T item = first.item;
        first = first.next;
        count--;
        return item;
    }

    public T peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return first.item;
    }

    public Iterator<T> iterator(){
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T>{
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            T item = current.item;
            current = current.next;
            return item;
        }
    }


}
