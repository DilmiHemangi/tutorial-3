object q3 extends App{
    def Volume(r:Double):Double={
        4/3*Math.PI*r*r*r;
    }
    printf("Volume of sphere = %.2f",Volume(5));
}