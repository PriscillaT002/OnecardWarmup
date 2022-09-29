class Onecard {
  

    /** to store the name of the card owner */
    String owner;

    /** tO STORE TE CARD OWNER'S id */
    String ID;

    /** To store the balance of funds */
    double balance;



    /*first constructer */

    public Onecard(String name, String ID, double startingBal ){

        this.owner = name;
        this.ID = ID;
        this.balance = startingBal;

    }
     /** adds specified amount to the card's balance
      * @param amt: the amount to deposit
      */
    public void deposit(double amt){
       this.balance += amt;

    }
   
    /**
     * If sufficient balance, debits card for amt
     * @param amt Proposed amount 
     */
    
    public void spend(double amt){
        if (this.canAfford(amt)){
            this.balance += amt;
        }
        System.out.println(x: "Sorry, insufficient funds:");
    }


    /**
     * Checks whether the balance on card is equal to the proposed amount
     * @param amt Proposed amount to spend
     * @return T/F: whether the balance is sufficient to cover the amt
     */
    public boolean canAfford(double amt){
        return(this.balance >= amt );

    }

    public static void main(String[] args){
        Onecard myCards - new Onecard(owner: "Priscilla", ID: "9224890", balance: "5")
        System.out.println(myCard);
        myCard.deposit(amt: 5.0 );
        System.out.println("AFter deposit:" + myCard.balance);
        myCArd.spend(amt: 100.00);
        System.out.println(myCard.canAfford(amt: 2.00));
    }
}