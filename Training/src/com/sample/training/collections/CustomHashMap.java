package com.sample.training.collections;

import java.util.ArrayList;

public class CustomHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private ArrayList<Entry<K, V>>[] buckets;
    private int size;

    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public CustomHashMap() {
        this(DEFAULT_CAPACITY);
    }

    public CustomHashMap(int capacity) {
        this.buckets = new ArrayList[capacity];
        this.size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    public void put(K key, V value) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new ArrayList<>();
        }
        // Check if key already exists, if yes, update the value
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        // Key does not exist, add a new entry
        buckets[index].add(new Entry<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        if (buckets[index] != null) {
            for (Entry<K, V> entry : buckets[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (ArrayList<Entry<K, V>> bucket : buckets) {
            if (bucket != null) {
                for (Entry<K, V> entry : bucket) {
                    sb.append(entry.key).append("=").append(entry.value).append(", ");
                }
            }
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2); // Remove trailing comma and space
        }
        sb.append("}");
        return sb.toString();
    }

   
}

