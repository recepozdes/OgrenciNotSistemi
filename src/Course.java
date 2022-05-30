public class Course {
    String name;
    String code;
    String prefix;
    double note;
    int sozNote;
    double sozNoteKatSayi;
    Teacher teacher;


    Course(String name,String code,String prefix,double sozNoteKatSayi){
        this.name = name;
        this.code = code;
        this.prefix = prefix;

        this.sozNoteKatSayi= sozNoteKatSayi;
        double note = 0;

    }


    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve Ders Bilgileri Uyuşmuyor");
        }


    }
    void printTeacher(){
        this.teacher.print();

    }
}
