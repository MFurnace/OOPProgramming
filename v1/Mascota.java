public class Mascota {
    
    private int setAge;
    private String setLocation;
    private String setType;

    public static void main(String[] args) {
        Mascota mascota2 = new Mascota();
        mascota2.setAge = (17);
        mascota2.setLocation = ("Compton");
        mascota2.setType = ("snake");

        System.out.println(mascota2.getName());

        Mascota mascota1 = new Mascota("Snoop", 20, "Compton", "Doberman Pinscher");
        System.out.println(mascota1.getName());
        System.out.println(mascota1.getAge());
        System.out.println(mascota1.getLocation());
        System.out.println(mascota1.getType());

    }

    private String name, location, type;
    private int age;

    Mascota(){
        this.name = "Tipton";
        this.age = 11;
        this.location = "Raleigh";
        this.type = "dog";
    }

    Mascota(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getLocation(){
        return location;
    }
    public String getType(){
        return type;
    }
    public void setName(String setName){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setType(String type){
        this.type = type;
    }
}