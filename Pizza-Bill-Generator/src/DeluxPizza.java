public class DeluxPizza extends Pizza{
    public DeluxPizza (Boolean veg) {
        super(veg);
        super.AddExtraCheese();
        super.AddExtraToppings();
    }
    @Override
    public void AddExtraCheese(){

    }
    @Override
    public void AddExtraToppings(){

    }
}
