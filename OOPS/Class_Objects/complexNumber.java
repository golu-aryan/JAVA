package JAVA.OOPS.Class_Objects;

class complexNumber{
    int real, image;

    public complexNumber(int r, int i)
    {
        this.real = r;
        this.image = i;
    }

    public void show(){
        System.out.println(this.real + " +i" + this.image);
    }

    public static complexNumber add(complexNumber n1, complexNumber n2){
        complexNumber res = new complexNumber(0, 0);

        res.real = n1.real + n2.real;
        res.image = n1.image + n2.image;

        return res;
    }

    public static void main(String[] args){
        complexNumber c1 = new complexNumber(2, 4);
        complexNumber c2 = new complexNumber(5, 5);

        System.out.print("first Complex number: ");
        c1.show();
         
        System.out.print("\nSecond Complex number: ");
        c2.show();
 
        complexNumber res = add(c1, c2);
 
        System.out.println("\nAddition is :");
        res.show();

    }
}