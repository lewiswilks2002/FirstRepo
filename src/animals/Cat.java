package animals;

public class Cat {
    private String name;
    private String size;
    private int age;
    private String breed;

    public Cat(String name, String size, int age, String breed){
        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;
    }

    private String meow(String size){
        String meow = "";
        if(size.equalsIgnoreCase("small")){
            meow = "meow";
        }
        else if(size.equalsIgnoreCase("medium")){
            meow = "Meow Meow";
        }
        else{
            meow = "MEOWWWWWW!";
        }

        return meow;
    }

    private String play(String breed){
        String Playing = "";
        if(breed.equalsIgnoreCase("black")){
            Playing = "unlucky mate";
        }
        else if(breed.equalsIgnoreCase("white")){
            Playing = "Yeah, Yeah";
        }
        else if(breed.equalsIgnoreCase("spotted")){
            Playing = "Lets go chase some dogs";
        }
        return Playing;
    }

    private String beHuman(String name, int age, String breed){
        return "MEOW Human, i'm " + name + " and i am a " + age + " year old " + breed + ", what breed are you...meow btw.";
    }
}

