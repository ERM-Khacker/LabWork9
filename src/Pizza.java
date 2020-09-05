public class Pizza {
    public double basis_cir; //Окружность пицы
    public String composition; //Состав
    public String name;
    public  int cost; //цена

    public Pizza(String name, String composition, double basis_cir, int cost) {
        this.basis_cir = basis_cir;
        this.cost = cost;
        this.composition = composition;
        this.name = name;
        //Circle pizza = new Circle(1);
        System.out.println("Название пицы " + name + ", состав: " + composition + ", окружность или величина в сантиметрах: "
                + basis_cir + ", цена $: " + cost);

    }
}
