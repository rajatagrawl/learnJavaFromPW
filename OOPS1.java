class Student {
    String name;
    int rollNum;
}

public class OOPS1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "John";
        st.rollNum = 2;
        System.out.println(st.name);
        System.out.println(st.rollNum);
    }
}
