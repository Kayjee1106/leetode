class MyHashMap {
    private int[]v=new int[1000001];
    public MyHashMap() {
        for(int i=0;i<1000001;i++){
            v[i]=-1;
        }
    }
    
    public void put(int key, int value) {
        v[key]=value;
    }
    
    public int get(int key) {
        return v[key];
    }
    
    public void remove(int key) {
        v[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */