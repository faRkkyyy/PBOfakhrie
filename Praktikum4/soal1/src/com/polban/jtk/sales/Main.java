package com.polban.jtk.sales;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Produk A", 15000, 10);
        Sales sales = new Sales(product);

        // Penjualan produk dengan quantity 5
        sales.sellProduct(5);

        // Restock produk
        sales.restockProduct(10);

        // Memperbarui harga produk
        sales.updateProductPrice(20000);

        // Mencoba memperbarui harga produk dengan nilai negatif
        sales.updateProductPrice(-5000);
    }
}
