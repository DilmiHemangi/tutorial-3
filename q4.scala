object q4 extends App{
    def bookPrice(x:Int):Double=x*24.95;
    def discount(amount:Double):Double=amount*0.4;
    def shippingCost(x:Int):Double= x match{
        case x if x<=50=>3*x;
        case x if x>50=>3*x+(x-50)*0.75;
    }
    def total_cost(x:Int):Double=(bookPrice(x)-discount(bookPrice(x))+shippingCost(x));
    printf("Total cost = Rs.%.2f",total_cost(60));
}
