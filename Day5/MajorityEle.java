class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num: nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int max = 0,val=0;
        for(int key: hm.keySet())
        {
            if(hm.get(key) > max)
            {
                max = hm.get(key);
                val = key;
            }
        }
        return val;
    }
}
