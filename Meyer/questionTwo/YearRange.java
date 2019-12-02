/**
 * YearRange
 */
public class YearRange {
    public int firstYear;
    public int secondYear;
    public int rangeType;
    public int firstDivisor;
    public int secondDivisor;

    public YearRange(int firstYear, int secondYear){
        this.firstYear = firstYear;
        this.secondYear = secondYear;
        this.firstDivisor = 14;
        this.secondDivisor = 20;
    }

    /**
     * @param firstYear the firstYear to set
     */
    public void setFirstYear(int firstYear) {
        this.firstYear = firstYear;
    }
    /**
     * @param secondYear the secondYear to set
     */
    public void setSecondYear(int secondYear) {
        this.secondYear = secondYear;
    }

    /**
     * @param rangeType the rangeType to set
     */
    public void setRangeType(int rangeType) {
        this.rangeType = rangeType;
    }
     /**
     * @param firstDivisor the firstDivisor to set
     */
    public void setFirstDivisor(int firstDivisor) {
        this.firstDivisor = firstDivisor;
    }
    /**
     * @param secondDivisor the secondDivisor to set
     */
    public void setSecondDivisor(int secondDivisor) {
        this.secondDivisor = secondDivisor;
    }

    /**
     * @return the firstYear
     */
    public int getFirstYear() {
        return this.firstYear;
    }

    /**
     * @return the secondYear
     */
    public int getSecondYear() {
        return this.secondYear;
    }
   
    /**
     * @return the rangeType
     */
    public int getRangeType() {
        return this.rangeType;
    }
    /**
     * @return the firstDivisor
     */
    public int getFirstDivisor() {
        return this.firstDivisor;
    }
    /**
     * @return the secondDivisor
     */
    public int getSecondDivisor() {
        return this.secondDivisor;
    }

    public void printYears() {
        switch (this.rangeType) {
            case 1:
                for (int i = this.firstYear; i < this.secondYear+1; i++) {
                    if ((i%this.firstDivisor == 0) && (i%this.secondDivisor ==0)) {
                        System.out.println(i);
                    }
                }
                break;
            case 2:
                for (int i = this.firstYear; i < this.secondYear+1; i++) {
                    if (i%4 == 0) {
                        System.out.println(i);
                    }
                }
                break;
            case 3:
                for (int i = this.firstYear; i < this.secondYear+1; i+=4) {
                    if (i%3 == 0) {
                        System.out.println(i);
                    }
                }
                break;

        
            default:
                break;
        }
    }

}