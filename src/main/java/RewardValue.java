public class RewardValue{
    private final double cashValue;
    private final double milesValue;

    //constructor that accepts the value in cash
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.milesValue=cashValue/0.0035;
    }
    //constructor that accepts the value in miles
    public RewardValue(int milesValue) {
        this.milesValue=milesValue;
        this.cashValue=milesValue*0.0035;
    }
    //method to get the cash value of the reward value
    public double getCashValue(){
        return cashValue;
    }

    //method to get the miles value of the reward value
    public double getMilesValue(){
        return milesValue;
    }

}
