class MyHashSet {
        boolean arr[]=new boolean[1000007];
    public MyHashSet() {
        Arrays.fill(arr,false);
    }
    
    public void add(int key) {
        arr[key]=true;
    }
    
    public void remove(int key) {
        arr[key]=false;
    }
    
    public boolean contains(int key) {
        return arr[key]==true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */