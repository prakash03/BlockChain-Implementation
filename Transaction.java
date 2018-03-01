public class Transaction {
    private String sourceName;
    private String destinationName;
    private Long sum;

    public String getSourceName(){
        return sourceName;
    }

    public void setSourceName(String sourceName){
        this.sourceName = sourceName;
    }

    public String getDestinationName(){
        return destinationName;
    }

    public void setDestinationName(String destinationName){
        this.destinationName = destinationName;
    }

    public Long getSum(){
        return this.sum;
    }

    public void setSum(Long sum){
        this.sum = sum;
    }

    public Transaction(String sourceName, String destinationName, Long sum){
        this.sourceName = sourceName;
        this.destinationName = destinationName;
        this.sum = sum;
    }

    @Override
    public int hashCode() {
        int result = sourceName != null ? sourceName.hashCode() : 0;
        result = 31 * result + (destinationName != null ? destinationName.hashCode() : 0);
        result = 31 * result + (sum != null ? sum.hashCode() : 0);
        return result;
    }
}
