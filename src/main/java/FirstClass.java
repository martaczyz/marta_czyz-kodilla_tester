public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g",1000, 1998);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook ("2000g", 1500, 2019);
        System.out.println(heavyNotebook.weight + " " + notebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook ("1600g", 500, 2007);
        System.out.println(oldNotebook.weight + " " + notebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

    }
}




