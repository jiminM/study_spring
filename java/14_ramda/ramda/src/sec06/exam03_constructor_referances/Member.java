package sec06.exam03_constructor_referances;

public class Member {
    private String name;
    private String id;

    public Member(){
        System.out.println("memher() 실행");
    }
    public Member(String _id){
        System.out.println("memher(id) 실행");
        this.id = _id;
    }
    public Member(String _name, String _id){
        System.out.println("memher(name, id) 실행");
        this.name = _name;
        this.id = _id;
    }
    
}
