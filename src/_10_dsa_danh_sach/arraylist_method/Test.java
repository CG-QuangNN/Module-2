package _10_dsa_danh_sach.arraylist_method;

public class Test {
    public static void main(String[] args) {
        Student a = new Student(001,"Nguyễn Văn A");
        Student b = new Student(002,"Nguyễn Văn B");
        Student c = new Student(003,"Nguyễn Văn C");
        Student d = new Student(004,"Nguyễn Văn D");
        Student e = new Student(005,"Nguyễn Văn E");
        MyList<Student> student = new MyList<>();
        MyList<Student> student2;

        student.add(a);
        student.add(b);
        student.add(c);
        student.add(d);
        student2 = student.clone();
        student2.remove(1);
        for (int i=0;i<student2.getSize();i++) {
            System.out.print(student2.get(i).getId());
            System.out.println(student2.get(i).getName());
        }
    }
}