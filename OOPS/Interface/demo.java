class student {
    int roll;

    void getroll(int n) {
        roll = n;
    }

    void putroll() {
        System.out.println("Roll :" + roll);
    }
}

class test extends student {
    float mark1, mark2;

    void getmarks(float m1, float m2) {
        mark1 = m1;
        mark2 = m2;
    }

    void putmarks() {
        System.out.println("Marks are : " + mark1 + " " + mark2);
    }
}

interface sports {
    float sportmark = 6.0F; 

    void putsport();
}

class result extends test implements sports {
    float total;

    public void putsport(){
        System.out.println("Sports marks = "+ sportmark);
    }
    void display(){
        total = mark1+mark2+sportmark;
        putroll();
        putmarks();
        putsport();
        System.out.println("Total marks = "+total);
    }
}

    public class demo {
        public static void main(String[] args) {
            result a = new result();
            a.getroll(100);
            a.getmarks(30.23F, 44.55F);
            a.display();
        }
}
