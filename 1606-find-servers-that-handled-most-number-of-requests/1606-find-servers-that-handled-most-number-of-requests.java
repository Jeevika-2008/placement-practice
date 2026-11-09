class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {

        int n = arrival.length;
        int[] count = new int[k];

        TreeSet<Integer> set = new TreeSet<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);

        for(int i=0; i<k; i++)
            set.add(i);

        for(int i=0; i<n; i++) {

            while(!pq.isEmpty() && pq.peek()[0] <= arrival[i]) {
                set.add(pq.poll()[1]);
            }

            if(set.isEmpty())
                continue;

            Integer s = set.ceiling(i % k);

            if(s == null)
                s = set.first();

            set.remove(s);

            count[s]++;

            pq.add(new int[]{arrival[i]+load[i], s});
        }

        int max = 0;

        for(int i=0; i<k; i++)
            max = Math.max(max, count[i]);

        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<k; i++) {
            if(count[i] == max)
                ans.add(i);
        }

        return ans;
    }
}