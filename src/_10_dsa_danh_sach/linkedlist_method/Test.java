package _10_dsa_danh_sach.linkedlist_method;

import _10_dsa_danh_sach.arraylist_method.MyList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Nguyễn Văn A");
        Student student2 = new Student(2, "Nguyễn Văn B");
        Student student3 = new Student(3, "Nguyễn Văn C");
        Student student4 = new Student(4, "Nguyễn Văn D");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(2, student4);

        System.out.println("NhanLinkedlist: ");
        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }

        myLinkedList.remove(2);
        System.out.println("NhanLinkedlist after remove: ");
        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }

        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();
        System.out.println("CloneLinkedList: ");
        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }
        System.out.println(cloneLinkedList.constrains(student2));
        System.out.println(cloneLinkedList.indexOf(student1));

        System.out.println("First element: " + cloneLinkedList.getFirst().toString());
        System.out.println("Last element: " + cloneLinkedList.getLast().toString());
        cloneLinkedList.clear();
        System.out.println("Clear: " + cloneLinkedList.size());
    }
}