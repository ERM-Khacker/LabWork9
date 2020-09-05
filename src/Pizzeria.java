public class Pizzeria {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Львовская", "Сыр, колбаса, грибы, лук, чеснок, тесто, томаты",
                30, 10);
        Pizza pizza2 = new Pizza("Крымская", "Мясо говяжее, мясо куриное, томаты, лук," +
                " перец болгарский, перец чили", 25, 15);
        Pizza pizza3 = new Pizza("Итальянская", "Сыр, колбаса, брынза, укроп, петрушка, лук, " +
                "перец болгарский, томаты яйца", 20, 30);
        Pizza pizza4 = new Pizza("Карбонара", "Тесто, сыр, мясо, томаты, лук, перец", 35, 10);
        Pizza pizza5 = new Pizza("Запорожская", "Картошка, сыр, сухожилия, кости, кожа", 40, 30);
        Pizza[] pizza = new Pizza[5];
        pizza[0] = pizza1;
        pizza[1] = pizza2;
        pizza[2] = pizza3;
        pizza[3] = pizza4;
        pizza[4] = pizza5;
        for (Pizza pizzas : pizza) {
        }

    }
}
