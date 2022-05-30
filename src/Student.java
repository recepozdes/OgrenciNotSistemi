public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1,int sozNote1,int note2,int sozNote2,int note3,int sozNote3){
        if(note1>=0 && note1<=100) {
            this.c1.note=(1-c1.sozNoteKatSayi)*note1+(c1.sozNoteKatSayi)* sozNote1;
                       }
            if(note2>=0 && note2<=100 ){
                this.c2.note=(1-c2.sozNoteKatSayi)*note2+(c2.sozNoteKatSayi)* sozNote2;
            }
            if (note3>=0 && note3<=100){
                this.c3.note=(1-c3.sozNoteKatSayi)*note3+(c3.sozNoteKatSayi)* sozNote3;
            }

        this.average = (note1+note2+note3)/3.0;
        if(this.average >= 50){
            this.isPass = true;
        }
    }

    void isPass(){
        this.average = (this.c1.note+this.c2.note+this.c3.note)/3.0;
        if(this.average >= 55){
            System.out.println("Geçtiniz");
            this.isPass = true;
        }else {
            System.out.println("Kaldınız");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(c1.name+" Notu\t\t:"+c1.note);
        System.out.println(c2.name+" Notu\t\t:"+c2.note);
        System.out.println(c3.name+" Notu\t:"+c3.note);
        System.out.println("Ortalama\t\t:"+this.average);
    }

}
