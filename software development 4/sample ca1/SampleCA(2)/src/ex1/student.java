package ex1;

public class student {
    private String name;
    private int studentnumber;
    private double[] results;
    private String[] grades;
    private double[] gpas;
    private double gpa;

    public student(String name, int number, int numexams) {
        this.name = name;
        this.studentnumber = number;
        results = new double[numexams];
        grades = new String[numexams];
        gpas = new double[numexams];
    }

    public void setResult(int examnumber, int result){
        if (result >= 0 && result <=100){
            results[examnumber-1] = result;
        }else{
            results[examnumber-1] = 0;
        }
    }

    public void processResults(){
        for (int i=0;i<results.length;i++){

        }
    }
}


