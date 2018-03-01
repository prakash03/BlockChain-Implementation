package BlockChain;

import java.util.Arrays;

public class BlockChain {
    public static void main(String[] args) {
        Transaction transaction1 = new Transaction("Prakash", "Apoorva", 100L);
        Transaction transaction2 = new Transaction("Apoorva", "Cabello", 20L);
        Transaction transaction3 = new Transaction("Cabello", "Highwater", 35L);
        Transaction transaction4 = new Transaction("Highwater", "Sanjay", 365L);

        Block firstBlock = new Block(0, Arrays.asList(transaction1, transaction2));
        System.out.println(firstBlock.hashCode());
        Block secondBlock = new Block(firstBlock.hashCode(),Arrays.asList(transaction3));
        System.out.println(secondBlock.hashCode());
        Block thirdBlock = new Block(secondBlock.hashCode(), Arrays.asList(transaction4));
        System.out.println(thirdBlock.hashCode());
    }
}
