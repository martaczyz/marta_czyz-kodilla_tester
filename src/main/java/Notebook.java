public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight == "600g") {
            System.out.println("This notebook is light.");
        } else if (this.weight == "1600g") {
            System.out.println("This notebook is not very heavy.");
        } else if (this.weight == "2000g") {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkYear() {
        if (this.price == 1000 && this.year == 1998) {
            System.out.println("Not so expensive old notebook.");
        } else if (this.price == 1500 && this.year == 2019) {
            System.out.println("Quite new good notebook.");
        } else if (this.price == 500 && this.year == 2007) {
            System.out.println("Not so old good notebook.");
        }
    }
}
