package animals;

public class Dog {
    private String name;
    private String size;
    private int age;
    private String breed;

    public Dog(String name, String size, int age, String breed){
        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;
    }

    private String bark(String size){
        String bark = "";
        if(size.equalsIgnoreCase("small")){
            bark = "yap yap yap";
        }
        else if(size.equalsIgnoreCase("medium")){
            bark = "woof woof";
        }
        else{
            bark = "WOOF! WOOF!";
        }

        return bark;
    }

    private String play(String breed){
        String Playing = "";
        if(breed.equalsIgnoreCase("Poodle")){
            Playing = "Oh Dear!";
        }
        else if(breed.equalsIgnoreCase("Labrador")){
            Playing = "Yeah, Yeah";
        }
        else if(breed.equalsIgnoreCase("Bordie Collie")){
            Playing = "Lets go chase some sheep";
        }
        return Playing;
    }

    private String beHuman(String name, int age, String breed){
        return "Hello Human, i'm " + name + " and i am a " + age + " year old " + breed + ", what breed are you?";
    }
}
