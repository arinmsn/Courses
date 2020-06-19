public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if (age < 0 || age > 100){
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen(){
        if (getAge() > 12 && getAge() < 20){
            return true;
        } else {
            return false;
        }
    }

    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return "";
        } else if (firstName.isEmpty()){
            return this.lastName;
        } else if (lastName.isEmpty()){
            return this.firstName;
        } else {
            return (this.firstName + " " + this.lastName);
        }
    }
}
