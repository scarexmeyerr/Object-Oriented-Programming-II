/**
 * MultiplicationTable
 */
public class MultiplicationTable {
    public int multiplicationNumber;
    public int rangeFrom;
    public int rangeTo;
    
    MultiplicationTable(int multiplicationNumber,int rangeFrom,int rangeTo){
        this.multiplicationNumber = multiplicationNumber;
        this.rangeFrom = rangeFrom;
        this.rangeTo = rangeTo;
    }

    /**
     * @return the multiplicationNumber
     */
    public int getMultiplicationNumber() {
        return multiplicationNumber;
    }

    /**
     * @return the rangeFrom
     */
    public int getRangeFrom() {
        return rangeFrom;
    }

    /**
     * @return the rangeTo
     */
    public int getRangeTo() {
        return rangeTo;
    }

    /**
     * @param multiplicationNumber the multiplicationNumber to set
     */
    public void setMultiplicationNumber(int multiplicationNumber) {
        this.multiplicationNumber = multiplicationNumber;
    }
    
    /**
     * @param rangeFrom the rangeFrom to set
     */
    public void setRangeFrom(int rangeFrom) {
        this.rangeFrom = rangeFrom;
    }

    /**
     * @param rangeTo the rangeTo to set
     */
    public void setRangeTo(int rangeTo) {
        this.rangeTo = rangeTo;
    }

    /**
     * 
     */
    public void printTable() {
        System.out.println("<------------- The Multiplication Table For " +this.multiplicationNumber + "---------------------->");
        for (int i = this.rangeFrom; i < this.rangeTo+1; i++) {
            System.out.println(this.multiplicationNumber + "x" + i + "=" + (this.multiplicationNumber*i));
        }
        System.out.println();
    }
}