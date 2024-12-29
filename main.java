class superclass{
    int number=7;
    
    void printnumber() {
        System.out.println(number);
    }
}
class subclass extends superclass{
    int number=5;
    @Override
    void printnumber(){
        System.out.println(super.number);
        System.out.println(number);
    }
}
class main{
    public static void main(String[] args){
        subclass s=new subclass();
        s.printnumber();
        superclass s1= new superclass();
        s1.printnumber();
    }
}