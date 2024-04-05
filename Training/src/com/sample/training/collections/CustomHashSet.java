package com.sample.training.collections;

import java.util.HashMap;

public class CustomHashSet<E> {
    private HashMap<E, Object> map;
    

    // Dummy value to associate with each key in the map
    private static final Object PRESENT = new Object();

    public CustomHashSet() {
        map = new HashMap<>();
    }
    
    

    public boolean add(E element) {
        return map.put(element, PRESENT) == null;
    }

    public boolean remove(E element) {
        return map.remove(element) == PRESENT;
    }

    public boolean contains(E element) {
        return map.containsKey(element);
    }

    public int size() {
        return map.size();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public void clear() {
        map.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (E element : map.keySet()) {
            sb.append(element).append(", ");
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2); // Remove trailing comma and space
        }
        sb.append("]");
        return sb.toString();
    }

    
}

