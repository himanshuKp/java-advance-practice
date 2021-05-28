/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 28/05/21, 11:47 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.solid.singleresonsiblity;

import java.util.List;
import java.util.stream.Stream;

enum Color{
    GREEN, YELLOW, RED;
}

enum Size {
    SMALL, MEDIUM, LARGE;
}

class Product {
    public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }
}

class ProductFilter {
    public Stream<Product> filterByColor(List<Product> products, Color color){
        return products.stream().filter(p -> p.color == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size){
        return products.stream().filter(p -> p.size == size);
    }

    public Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size){
        return products.stream().filter(p -> p.color == color && p.size == size);
    }
}

public class OCP {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.RED, Size.LARGE);

        List<Product> productList = List.of(apple, tree, house);

        ProductFilter pf = new ProductFilter();

        System.out.println("Green Products (OLD): ");
        pf.filterByColor(productList, Color.GREEN).forEach(p -> System.out.println(" - "+p.name+" is green."));
    }
}
