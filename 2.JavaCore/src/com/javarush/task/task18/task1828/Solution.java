package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы 2
*/

public class Solution {

    public static class Product {
        int id;
        String name;
        String price;
        String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public int getId() {
            return id;
        }
    }

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        List<Product> products = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(filename))) {
            while (fileReader.ready()) {
                Product product = getProduct(fileReader.readLine());
                products.add(product);
            }
        }

        int id = Integer.parseInt(args[1]);

        switch (args[0]) {
            case "-u":
                String newName = args[1];
                String newPrice = args[2];
                String newQuantity = args[3];

                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).getId() == id) {
                        Product productToUpdate = products.get(i);
                        productToUpdate.setId(id);
                        productToUpdate.setName(newName);
                        productToUpdate.setPrice(newPrice);
                        productToUpdate.setQuantity(newQuantity);
                        products.set(i, productToUpdate);
                        break;
                    }
                }
                break;

            case "-d":
                Product productToDelete = products.get(id);
                products.remove(productToDelete);
                break;
        }

        try (FileWriter fileWriter = new FileWriter(filename)) {
            for (Product product : products) {
                fileWriter.write(product.toString());
                fileWriter.write("\n");
            }
        }
    }

    private static Product getProduct(String string) {
        String id = string.substring(0, 8).trim();
        String name = string.substring(8, 38).trim();
        String price = string.substring(38, 46).trim();
        String quantity = string.substring(46, 50).trim();
        return new Product(Integer.parseInt(id), name, price, quantity);
    }
}
