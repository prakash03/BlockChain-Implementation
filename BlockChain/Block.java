package BlockChain;

import java.util.List;

public class Block {
    private int previousHash;
    private List<Transaction> transactions;

    public Block(int previousHash, List<Transaction> transactions){
        this.previousHash = previousHash;
        this.transactions = transactions;
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public int hashCode(){
        int result = previousHash;
        result = 10*result + (transactions != null ? transactions.hashCode() : 0);
        return result;
    }
}
