class KthLargest {

    int k;
	// ArrayList<Integer> arr = new ArrayList<>();
	int kthLargest = Integer.MIN_VALUE;
	PriorityQueue<Integer> pq = new PriorityQueue<>();

	public KthLargest(int k, int[] arr) {
		this.k = k;
		// for (int elem : arr) this.arr.add(elem);
        for (int elem : arr) {
			pq.add(elem);
			if (pq.size() > k) pq.remove();
			
		}
		if (arr.length == 0 || k > arr.length) return;
		
		this.kthLargest = pq.peek();
	}

	public int add(int val) {
		// this.arr.add(val);
		pq.add(val);
		if (pq.size() > k) {
			pq.remove();
		}
		this.kthLargest = pq.peek();
		return kthLargest;
	}
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */