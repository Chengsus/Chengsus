import java.util.Arrays;

public class Teacher {
    protected String name;
    protected int age;
    protected boolean sex;
    protected String title;
    protected String department;
    protected boolean isPartyMember;
    protected String[] courses;

    public Teacher() {
    }

    protected void attendClass(String course) {
        boolean isContained = Arrays.asList(this.courses).contains(course);
        if (isContained) {
            System.out.println(this.department + "的" + this.name + "老师上" + course + "课");
        } else {
            System.out.println(this.department + "的" + this.name + "老师不上" + course + "课");
        }

    }

    public boolean isSex() {
        return this.sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isPartyMember() {
        return this.isPartyMember;
    }

    public void setPartyMember(boolean partyMember) {
        this.isPartyMember = partyMember;
    }

    public String[] getCourses() {
        return this.courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
