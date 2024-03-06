/***********************************/
/* Program   : MProduct.java */
/* Deskripsi : Main dari class Product */
/* NIM/Nama  : 24060122130052/Muhammad Reynaldi Akbar*/
/* Tanggal   : 6 Maret 2024*/
/***********************************/

public class MProduct {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 4, 500);
        Product product2 = new Product("Kulkas", 10, 2500);
        Product product3 = new Product("TV", -10, 2500);

        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Stock: " + product.getStock());
        System.out.println("Product Price: " + product.getPrice());
        product.purchaseProduct(3);
        System.out.println("Product Stock: " + product.getStock());

        System.out.println("\nProduct Name: " + product2.getName());
        System.out.println("Product Stock: " + product2.getStock());
        System.out.println("Product Price: " + product2.getPrice());
        product2.purchaseProduct(3);
        System.out.println("Product Stock: " + product2.getStock());

        product3.setName("");

        //Boleh Dites
        product3.setStock(-6);
        product3.setPrice(-2000);
        product3.purchaseProduct(-8);
    }
}
