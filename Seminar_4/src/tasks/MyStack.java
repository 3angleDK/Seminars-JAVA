package tasks;

import java.util.Arrays;

public class MyStack {

    private int capacity = 4;
    private int size = 0;
    public MyStack(){

    }

    public int getSize() {
        return size;
    }

    private Object[] data = new Object[capacity];
    private void increaseCapacity(){
        Object[] tmp = data;
        data = new Object[capacity * 2];
        System.arraycopy(tmp, 0, data, 0, capacity);
        capacity *= 2;
        tmp = null;
    }

    public void empty(){
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public void push(Object value){
        if (size == capacity) increaseCapacity();
        data[size] = value;
        size++;
    }

    public Object peek(){
        return data[size - 1];
    }

    public Object pop(){
        size--;
        Object tmp = data[size];
        data[size] = null;
        return tmp;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            res.append(data[i].toString());
            res.append(",");
        }
        if (size > 0)
            res.append(data[size - 1].toString());
        res.append("]");
        return res.toString();
    }

}
