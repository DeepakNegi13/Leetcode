class Solution {
    public int findKthLargest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int elem : arr) {
			pq.add(elem);
			if (pq.size() > k) pq.remove();
		}
		return pq.peek();
	}

}