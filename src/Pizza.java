public class Pizza {
    public Circle basis; //Окружность пицы
    public String composition; //Состав
    public String name;
    public int cost; //цена


    public Pizza(String name, String composition, int diameter, int cost) {
        this.basis = new Circle(diameter);
        this.cost = cost;
        this.composition = composition;
        this.name = name;
        System.out.println("Название пицы " + name + ", состав: " + composition + ", окружность или величина в сантиметрах: "+ diameter
                + ", цена $: " + cost);

    }
}
