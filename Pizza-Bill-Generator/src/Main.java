public class Main {
    public static void main(String[] args) {
        System.out.println("AJ Pizza Restaurant");
        System.out.println("===================");
        Pizza BasePizza = new Pizza(false);
//        BasePizza.getPizzaPrice();
//        BasePizza.AddExtraCheese();
//        BasePizza.AddExtraToppings();
//        BasePizza.AddTakeAway();

//        BasePizza.AddExtraToppings();
//        BasePizza.AddTakeAway();
//        BasePizza.GetBill();
        DeluxPizza D = new DeluxPizza(false);
        D.GetBill();

    }
}

class Pizza{
    private int  price;
    private boolean veg;
    private int ExtraCheesePrice = 100;
    private int ExtraToppingsPrice = 100;
    private int TakeAwayCharge = 20;
    private int BasePrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeawayAdded = false;

    public Pizza(boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        BasePrice = this.price;
    }
    public void getPizzaPrice(){
        //System.out.println("Selected Pizza Price is Rs     "+this.price);
    }
    public void AddExtraCheese(){
        isExtraCheeseAdded = true;
        //System.out.println("Extra Cheese added Rs     " + ExtraCheesePrice );
        this.price += ExtraCheesePrice;
    }
    public void AddExtraToppings(){
        isExtraToppingsAdded = true;
        // System.out.println("Extra Toppings Added RS        " + ExtraToppingsPrice);
        this.price += ExtraToppingsPrice;
    }
    public void AddTakeAway(){
        isTakeawayAdded = true;
        //System.out.println("Packing Charges Added          " + TakeAwayCharge);
        this.price += TakeAwayCharge;
    }
    public void GetBill(){
        String bill = "";
        //       System.out.println("-----------------------------------");
        System.out.println("Base Pizza                       " + BasePrice);
        if(isExtraCheeseAdded) {
            bill += "Extra Cheese                     " + ExtraCheesePrice + "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Toppings                   " + ExtraToppingsPrice + "\n";
        }
        if(isTakeawayAdded){
            bill += "Take Away                        " + TakeAwayCharge + "\n";
        }
        bill += "Bill :                           " + this.price +"\n";
        System.out.println(bill);
    }
}