package tasks;

import java.util.LinkedList;
import java.util.Objects;

public class MyQueque {
    private LinkedList<Object> data = new LinkedList<>();

    public void enqueue(Object value){
        data.add(value);
    }

    public Object dequeue(){
        if (data.size() == 0) return null;
        Object result = data.getFirst();
        data.remove(0);
        return result;
    }

    public Object first() {
        if (data.size() == 0) return null;
        return data.getFirst();
    }

    @Override
    public String toString(){
        return data.toString();
    }
}
