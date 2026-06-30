class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Ecomm {

    public static int linearSearch(Product arr[], String key) {

        for(int i=0;i<arr.length;i++) {
            if(arr[i].name.equalsIgnoreCase(key))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        Product products[] = {
            new Product(1,"Mobile"),
            new Product(2,"Laptop"),
            new Product(3,"Watch")
        };

        int result = linearSearch(products,"Laptop");

        System.out.println(result);
    }
}