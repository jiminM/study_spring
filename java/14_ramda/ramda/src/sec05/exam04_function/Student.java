package sec05.exam04_function;

public class Student {
    private String name;
    private int engScore;
    private int mathScore;

    public Student(String _name, int _engScore, int _mathScore){
        this.name = _name;
        this.engScore = _engScore;
        this.mathScore = _mathScore;
    }

    public String getName(){
        return name;
    }

    public int getEngScore(){
        return engScore;
    }

    public int getMathScore(){
        return mathScore;
    }

}
