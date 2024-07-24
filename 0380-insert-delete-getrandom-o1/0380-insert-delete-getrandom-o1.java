class RandomizedSet {
    private List<Integer> set;
    private HashMap<Integer,Integer> mp;
    private Random random;
    public RandomizedSet() {
        set=new ArrayList<>();
        mp=new HashMap<>();
        random =new Random();
    }
    
    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }
        set.add(val);
        mp.put(val,set.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!mp.containsKey(val)){
            return false;
        }
        int idx=mp.get(val);
        int last=set.get(set.size()-1);
        set.set(idx,last);
        mp.put(last,idx);
        set.remove(set.size()-1);
        mp.remove(val);
        return true;
    }
    
    public int getRandom() {
        int idx = random.nextInt(set.size());
        return set.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */