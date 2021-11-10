package hello.core.member;

//왼쪽 세팅모양 클릭시 -> Compact Middle Packages 클릭하면 패키지 구조를 바꿀수 있다.
public class Member {
    //Getter Setter 메서드를 통해서 private 값을 설정 할 수 있음
    private Long id;
    private String name;
    private Grade grade;

    //Generate 단축키 : alt + insert
    //setting -> keymap으로 가면 단축키를 찾아 볼 수 있다.
    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    
    //데이터를 가지고 오고 뽑는 것
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    
    
}
