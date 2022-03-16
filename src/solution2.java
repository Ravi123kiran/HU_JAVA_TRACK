public class solution2 {
    private String Breed;
    private String Colour;
    private String name;
    public String getBreed(){
        return Breed;
    }
    public void setBreed(String x){
        this.Breed=x;
    }


    public String getColour(){
        return Colour;
    }
    public void setColour(String x){
        this.Colour=x;
    }


    public String getname(){
        return name;
    }
    public void setname(String x){
        this.name=x;
    }



    public static void main(String[] args) {
        solution2 dog = new solution2();
        dog.setBreed("Pug");
        System.out.println(dog.getBreed());
        dog.setname("lily");
        System.out.println(dog.getname());
        dog.setColour("white");
        System.out.println(dog.getColour());
    }

}
