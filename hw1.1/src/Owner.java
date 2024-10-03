public class Owner {
    private String name;
    private int age;

    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void ownerInfo(){
        System.out.println("Owner name: " + this.getName() + " " +
                "\nAge: " + this.getAge());
    }
}
