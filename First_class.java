public class First_class {
    static class Employee{
        int id;
        String name;
        void print(){
            System.out.println("My id is "+ id);
            System.out.println("My name is  "+ name);
        }
    }
    public static void main(String[] args) {
        Employee harry = new Employee();
        harry.id = 101;
        harry.name = "Harry";
        harry.print();
    }
}
