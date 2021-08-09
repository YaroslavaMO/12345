package com.Task15;

 class Auto {
     private String model1;
     private int power1= 250;
     private String color1 = "black";

     public void setModel1 (String model2){
         if(model2.isEmpty()){
             System.out.println("Введите данные о марке автомобиля");
         } else {
         model1 = model2;}
     }
     public String getModel1 (){
         return model1;
     }
     public void setPower1(int power2){
         if (power2<20) {
             System.out.println("Некорректная мощность");
         } else {
             power1 = power2;
         }
     }
     public int getPower1 (){
         return power1;
     }
     public void setColor1 (String color2){
         if(color2.isEmpty()){
             System.out.println("Введите данные о цвете автомобиля");
         }
         color1 = color2;
     }
     public String getColor1 (){
         return  color1;
     }
     void autovobil(){
         System.out.println("У автомобиля"+" марка-"+model1+", цвет-"+ color1+ ", мощность-"+power1);
     }


}
