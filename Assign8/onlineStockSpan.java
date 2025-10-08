class StockSpanner {
    Stack<Pair<Integer,Integer>> st;

    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int cnt = 1;
        while(!st.isEmpty() && st.peek().getKey() <= price){
            cnt += st.pop().getValue();
        }
        st.push(new Pair(price, cnt));
        return cnt;
    }
}

