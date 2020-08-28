class Cat {

    // write static and instance variables
    public String name;
    public int age;
    public static int counter;


    public Cat(String name, int age) {
        if (counter >= 5) {
            System.out.println("You have too many cats");
        } else {
            this.name = name;
            this.age = age;

        }
        counter++;
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}
