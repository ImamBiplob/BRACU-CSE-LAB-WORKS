class Dog extends Animal implements SoundSource {
    public Dog(String name) {
        super(name);
    }
    
    public void makeSound() {
        System.out.println(getName() + " is crying.");
    }
}