public class People {
    String name;
    int age;
    String city;
    String post;

    public People(String name, int age, String city, String post) {

        this.name = name;
        if(name == null){
            name = "информация не указана";
        }


        if(age >= 0){
            this.age = age;
        }else {
            this.age = Math.abs(age);
        }

        this.city = city;
        if(city == null){
            city = "информация не указана";
        }

        this.post = post;
        if(post == null){
            post = "информация не указана";
        }
    }


}
