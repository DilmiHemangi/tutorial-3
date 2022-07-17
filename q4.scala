object q4 extends App{
    def bookPrice(x:Int):Double=x*24.95;
    def discount(amount:Double):Double=amount*0.4;
    def shippingCost(x:Int):Double=3*x+(x-50)*0.75;
    printf("Total cost = Rs.%.2f",bookPrice(60)-discount(bookPrice(60))+shippingCost(60));
}