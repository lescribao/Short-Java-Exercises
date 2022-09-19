class Solution {
    public boolean canReach(int[] arr, int start) {
        
        //first time using BFS and queues/linkedLists in this context, struggled but I managed to figure it out
        
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(start);
        boolean[] visited =new boolean[arr.length];
        
        
        while(!queue.isEmpty()){
            
            int index= queue.poll();
            
            if(arr[index]==0) return true;
            
            if(visited[index]) continue;
            
            visited[index]=true;
            
            if(index+arr[index]<arr.length){
                queue.offer(index+arr[index]);
            }
            if(index-arr[index]>=0){
                queue.offer(index-arr[index]);
            }
        }
        
        return false;
    }
}
