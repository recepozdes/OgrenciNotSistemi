public class Main {

    public static void main(String[] args) {

        Teacher t1=new Teacher("Mahmut Hoca","555-555-55-55","TRH");
        Teacher t2=new Teacher("Mehmet Hoca","555-555-55-51","FZK");
        Teacher t3=new Teacher("Külyutmaz","555-555-55-52","BIO");

        Course tarih=new Course("Tarih","101","TRH",0.2);
        tarih.addTeacher(t1);

        Course fizik=new Course("Fizik","102","FZK",0.25);
        fizik.addTeacher(t2);

        Course bio=new Course("Biyoloji","103","BIO",0.25);
        bio.addTeacher(t3);



        Student s1=new Student("İnek Şaban","123","4",tarih,fizik,bio);
        s1.addBulkExamNote(100,80,80,70,70,70);
        s1.isPass();

        Student s2=new Student("Güdük Necmi","124","4",tarih,fizik,bio);
        s2.addBulkExamNote(45,80,50,60,40,70);
        s2.isPass();

    }
}
