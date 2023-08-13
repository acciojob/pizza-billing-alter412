package com.driver;

public class Pizza {


    private int price;

    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingAdded;
    private boolean isTakeAway;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        price=0;
        if(this.isVeg){
            price+=300;
        }else{
            price+=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.isExtraCheeseAdded) {
            this.price += 80;
            this.isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.isExtraToppingAdded) {
            if (this.isVeg) {
                this.price += 70;
            } else {
                this.price += 120;
            }
            this.isExtraToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.isTakeAway){
            this.price+=20;
            this.isTakeAway=true;
        }

    }

    public String getBill(){
        // your code goes here
        this.bill="";
        if(this.isVeg){
            this.bill+="Base Price Of The Pizza: 300\n";
        }else{
            this.bill+="Base Price Of The Pizza: 400\n";
        }

        if(this.isExtraCheeseAdded){
            this.bill+= "Extra Cheese Added: 80\n";
        }
        if(this.isExtraToppingAdded){
            if(this.isVeg){
                this.bill+="Extra Toppings Added: 70\n";
            }else{
                this.bill+="Extra Toppings Added: 120\n";
            }
        }
        if(this.isTakeAway){
            this.bill+="Paperbag Added: 20\n";
        }
        this.bill+="Total Price: ";
        this.bill+=this.getPrice();
        this.bill+="\n";

        return this.bill;
    }
}
