class Solution {
    class Transaction{
        String name;
        int time;
        int amount;
        String city;
        public Transaction(String s){
        String[] split=s.split(",");
        name=split[0];
        time=Integer.parseInt(split[1]);
        amount=Integer.parseInt(split[2]);
        city=split[3];
        }
    }
        public List<String> invalidTransactions(String[] transactions) {
        int n=transactions.length;
        List<String> ans=new ArrayList<>();
        HashMap<String,List<Transaction>> map=new HashMap<>();
        for(String trans : transactions){
            Transaction s=new Transaction(trans);
            map.putIfAbsent(s.name,new ArrayList<>());
            map.get(s.name).add(s);
        }
        for(String transaction : transactions){
            Transaction t=new Transaction(transaction);
            if(!isValid(t,map.getOrDefault(t.name,new ArrayList<>()))){
                ans.add(transaction);
            }
        }
        return ans;
    }
    public boolean isValid(Transaction s,List<Transaction> list){
        if(s.amount>1000)return false;
        for(Transaction sol:list){
            if(Math.abs(sol.time-s.time)<=60 && !s.city.equals(sol.city)){
                return false;
            }
        }
        return true;
    } 
}