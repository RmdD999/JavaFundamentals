public class MyGenerics <Thing extends Number, Thing2 extends String>{
    Thing x;
    Thing2 y;
    MyGenerics(Thing x, Thing2 y){
        this.x = x;
        this.y = y;
    }

    public Thing2 getValue(){
        return y;
    }
}
