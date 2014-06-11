package exceptionHandling;


class Animal {
    public void eat(String str) {
        System.out.println("Eating for grass");
    }
}

class Goat extends Animal {
    public void eat(String str) {
        System.out.println("blank");
    }
}

class Another extends Goat{
  public void eat(String str) {
        System.out.println("another");
  }
}

public class ClassCastExceptionTest {
    public static void main(String[] args) {
    	try{
        Animal a = new Animal();
        Another t5 = (Another) new Goat(); //cannot create an instanc to Another class using goat classs
    	}
    	catch (Exception e){
    		System.out.println(e);
    	}
    	}
}
