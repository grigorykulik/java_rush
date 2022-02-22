package com.javarush.task.task26.task2609;

/* 
Распределение элементов по корзинам с собственным локом
*/

public class Solution {
    private static final int NUMBER_LOCKS = 12;
    private final com.javarush.task.task26.task2609.Solution.Node[] buckets;
    private final Object[] locks;

    static class Node {
        public com.javarush.task.task26.task2609.Solution.Node next;
        public Object key;
        public Object value;
    }

    public Solution(int numberBuckets) {
        buckets = new com.javarush.task.task26.task2609.Solution.Node[numberBuckets];
        locks = new Object[NUMBER_LOCKS];
        for (int i = 0; i < NUMBER_LOCKS; i++) {
            locks[i] = new Object();
        }
    }

    private final int hash(Object key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    public Object get(Object key) {
        int hash = hash(key);
        synchronized (locks[hash % NUMBER_LOCKS]) {
            for (com.javarush.task.task26.task2609.Solution.Node m = buckets[hash]; m != null; m = m.next) {
                if (m.key.equals(key)) return m.value;
            }
        }
        return null;
    }

    public void clear() {
        for (int i = 0; i < buckets.length; i++) {
            synchronized (locks[i % NUMBER_LOCKS]) {
                buckets[i] = null;
            }
        }
    }

    public static void main(String[] args) {

    }
}
