//Given an array of marks of students, if the mark of any student is less than 35 print its roll number.
//[roll number here refers to the index of the array]
public class marks{
    public static void main(String[] args){
        int[] marks = {81,17,45,56,31,100,60};

        for(int i = 0; i<marks.length; i++){
            if(marks[i]<35){
                System.out.println(i);
            }
        }
    }
}