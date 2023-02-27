public class Checking extends Account{
    //List properties specific to a checking account
    private int debitNumber;
    private int debitPin;

    //Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initialDep){
        super(name, sSN, initialDep);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }


    private void setDebitCard(){
        debitNumber = (int) (Math.random()* Math.pow(10,12));
        debitPin = (int) (Math.random()* Math.pow(10,4));
    }

    //List any methods specific to checking account
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(
                " Your Checking Account Features"+
                        "\n Debit Card Number: " + debitNumber +
                        "\n Debit Card Pin: " + debitPin);
    }
}
