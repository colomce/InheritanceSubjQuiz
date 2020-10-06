public class Animal {
    protected int age;
    protected float weight;

    public Animal(int age, float weight) {
        this.age = age;
        this.weight = weight;
    }

    public void running() {
        System.out.println("Running");
    }

    public void eating(){
        System.out.println("Eating");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
