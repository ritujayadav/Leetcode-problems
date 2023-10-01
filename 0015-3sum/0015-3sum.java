class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n=arr.length;
      Set<List<Integer>> s=new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> h= new HashSet<>();
            for (int j=i+1; j<n;j++) {
                int t=-(arr[i] + arr[j]);
                if (h.contains(t)) {
                    List<Integer>tx=Arrays.asList(arr[i],arr[j],t);
                    tx.sort(null);
                    s.add(tx);
                }
                h.add(arr[j]);
            }
        }

        List<List<Integer>>a=new ArrayList<>(s);
        return a;
    }
        
    }    
    
    
   
