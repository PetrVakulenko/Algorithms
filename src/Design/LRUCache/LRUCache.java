package Design.LRUCache;

import java.util.LinkedHashMap;

class LRUCache {
    LinkedHashMap<Integer,Integer> map;
    int size = 0;

    public LRUCache(int capacity) {
        map = new LinkedHashMap<>();
        size = capacity;
    }

    public int get(int key) {
        System.out.println(map);
        if(!map.containsKey(key)) return -1;


        int val = map.getOrDefault(key,-1);
        map.remove(key);
        map.put(key, val);
        return val;
    }

    public void put(int key, int value) {
        System.out.println(map);
        if(!map.containsKey(key)){
            if(map.size() == size){
                map.remove(map.keySet().iterator().next());
            }
            map.put(key,value);
        }
        else{
            map.remove(key);
            map.put(key,value);
        }
    }
}