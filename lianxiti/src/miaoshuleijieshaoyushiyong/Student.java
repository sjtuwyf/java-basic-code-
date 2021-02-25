package miaoshuleijieshaoyushiyong;

public class Student {

    private String name;
    private int age;
    private String content;

    public Student(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void eat(){
        System.out.println(age+"岁的"+name+"在吃饭");
    }

    public void study(){
        System.out.println(age+"岁的"+name+"在学习"+content);
    }
}
