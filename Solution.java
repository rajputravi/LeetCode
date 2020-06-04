class Solution {
    public int twoCitySchedCost(int[][] costs) {
      
      int N = costs.length/2;
        int[] refund = new int[costs.length];
        int minCost = 0, index = 0;
        for(int i=0;i<costs.length;i++){
            refund[index++] = costs[i][1] - costs[i][0];
            minCost += costs[i][0];
        }
        Arrays.sort(refund);
       
        for(int i = 0; i < N; i++){
            minCost += refund[i];
             System.out.print(minCost+" ");
        }
        return minCost;
    }
}