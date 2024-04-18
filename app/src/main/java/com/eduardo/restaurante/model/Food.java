package com.eduardo.restaurante.model;

public class Food {

   private int imgFood;
   private String foodName;
   private String foodDescription;
   private String foodPrice;

   public int getImgFood() {
      return imgFood;
   }

   public void setImgFood(int imgFood) {
      this.imgFood = imgFood;
   }

   public String getFoodName() {
      return foodName;
   }

   public void setFoodName(String foodName) {
      this.foodName = foodName;
   }

   public String getFoodDescription() {
      return foodDescription;
   }

   public void setFoodDescription(String foodDescription) {
      this.foodDescription = foodDescription;
   }

   public String getFoodPrice() {
      return foodPrice;
   }

   public void setFoodPrice(String foodPrice) {
      this.foodPrice = foodPrice;
   }
}
