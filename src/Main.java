public class Main {
    public static void main(String[] args) {

        System.out.println("Часть 3. Задание 1");

        People maksim = new People("Максим",35, "Минск", "бренд-менеджер");
        People any = new People("Аня",29,"Москва","методист образовательных программ");
        People kate = new People("Катя",28,"Калиниград","продакт-менеджер");
        People artem = new People("Артём",27,"Москва","директор по развитию бизнеса");

        System.out.println("Привет! Меня зовут" + maksim.name + " Я из города " + maksim.city + "Мне " + maksim.age + " лет. Я работаю на должности" + maksim.post + " Будем знакомы!");
        System.out.println("Привет! Меня зовут" + any.name + " Я из города " + any.city + "Мне " + any.age + " лет. Я работаю на должности" + any.post + " Будем знакомы!");
        System.out.println("Привет! Меня зовут" + kate.name + " Я из города " + kate.city + "Мне " + kate.age + " лет. Я работаю на должности" + kate.post + " Будем знакомы!");
        System.out.println("Привет! Меня зовут" + artem.name + " Я из города " + artem.city + "Мне " + artem.age + " лет. Я работаю на должности" + artem.post + " Будем знакомы!");


        System.out.println("Часть 3. Задание 2");

        Car ladaGrande = new Car( "Lada", " Grande ", " в России", " желтого ",  2015,  1.7);
        Car audiA8 = new Car("Auda", "A8", " в Германии", "черного ", 2020,  3.0);
        Car bMWZ8 = new Car("BMW", "Z8", " в Германии", "черного", 2021,  3.0);
        Car kiaSportage4 = new Car("Kia", "Sportage4", " в Южной Корее", "красного", 2018,  2.4);
        Car hyundaiAvante = new Car("Hyundai", "Avante", "в Южной Корее", "оранжевого", 2016,  1.6);

        System.out.println( ladaGrande.mark + " " + ladaGrande.model + ", " + ladaGrande.yearOfProduction + " год выпуска, " + " сборка в " + ladaGrande.engineСapacity  + ", " + ladaGrande.bodyСolor + " цвета," + " обьем двигателя " + ladaGrande.countryOfAssembly);
        System.out.println( audiA8.mark + " " + audiA8.model + ", " + audiA8.yearOfProduction + " год выпуска, " + " сборка в " + audiA8.engineСapacity  + ", " + audiA8.bodyСolor + " цвета," + " обьем двигателя " + audiA8.countryOfAssembly);
        System.out.println( bMWZ8.mark + " " + bMWZ8.model + ", " + bMWZ8.yearOfProduction + " год выпуска, " + " сборка в " + bMWZ8.engineСapacity  + ", " + bMWZ8.bodyСolor + " цвета," + " обьем двигателя " + bMWZ8.countryOfAssembly);
        System.out.println( kiaSportage4.mark + " " + kiaSportage4.model + ", " + kiaSportage4.yearOfProduction + " год выпуска, " + " сборка в " + kiaSportage4.engineСapacity  + ", " + kiaSportage4.bodyСolor + " цвета," + " обьем двигателя " + kiaSportage4.countryOfAssembly);
        System.out.println( hyundaiAvante.mark + " " + hyundaiAvante.model + ", " + hyundaiAvante.yearOfProduction + " год выпуска, " + " сборка в " + hyundaiAvante.engineСapacity  + ", " + hyundaiAvante.bodyСolor + " цвета," + " обьем двигателя " + hyundaiAvante.countryOfAssembly);

    }
}
