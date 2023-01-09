public class Car {

    String mark;

    String model;

    String engineСapacity;

    String bodyСolor;

    int yearOfProduction;

    double countryOfAssembly;



    public Car(String mark, String model, String engineСapacity, String bodyСolor, int yearOfProduction, double countryOfAssembly) {

        this.mark = mark;
        if(mark == null){
            mark = "информация не указана";
        }

        this.model = model;
        if(model == null){
            model = "информация не указана";
        }

        this.engineСapacity = engineСapacity;
        if(engineСapacity == null){
            engineСapacity = "информация не указана";
        }

        this.bodyСolor = bodyСolor;
        if(bodyСolor == null){
            bodyСolor = "информация не указана";
        }


        if(yearOfProduction >= 0){
            this.yearOfProduction = yearOfProduction;
        }else {
            this.yearOfProduction = Math.abs(yearOfProduction);
        }


        if(countryOfAssembly >= 0){
            this.countryOfAssembly = countryOfAssembly;
        }else {
            this.countryOfAssembly = Math.abs(countryOfAssembly);
        }
    }

}
