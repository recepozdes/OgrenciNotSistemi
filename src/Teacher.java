public class Teacher {
    String name;
    String mpno;
    String branch;
    Teacher(String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print(){
        System.out.println("Name: "+name);
        System.out.println("Mobile Number: "+mpno);
        System.out.println("Branch: "+branch);
    }
}
