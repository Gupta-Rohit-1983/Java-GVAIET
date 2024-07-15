package System;

@SuppressWarnings("rawtypes")
public class Student implements Comparable{

    private static final String Object = null;
    private int rollNO;
    private String name;
    public Student(int rollNO, String name) {
        this.rollNO = rollNO;
        this.name = name;
    }
    public int getRollNO() {
        return rollNO;
    }
    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [rollNO=" + rollNO + ", name=" + name + "]";
    }
    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.rollNO, rollNO);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }if (this.getClass() != obj.getClass()) {
            return false;
        }

        Student temp = (Student) obj;
        return temp.rollNO==this.rollNO && temp.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Object.hashCode();
    }

    
}
