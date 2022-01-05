package sec05.exam06_predicate;

public class Student {
    private String name;
    private String gender;
    private int score;

    public Student(String _name, String _gender, int _score){
        this.setName(_name);
        this.setGender(_gender);
        this.setScore(_score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
