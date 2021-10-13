package minitest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Số lượng sản Phẩm");
        int amount = scanner.nextInt();
        Product[] listProduct = new Product[amount];
        input(listProduct);
        System.out.println("Danh Sách Sản Phẩm: ");
        output(listProduct);

        System.out.println("Nhập mã sản phẩm muốn tìm");
        scanner.nextLine();
        String code = scanner.nextLine();
        System.out.println("Vị trí sản phẩm muốn tìm là: " + findByCode(listProduct, code));

        editByCode(listProduct, code);
        System.out.println("Danh Sách Sản Phẩm: ");
        output(listProduct);
    }

    public static void input(Product[] listProduct) {
        for (int i = 0; i < listProduct.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập Thông Tin Sản phẩm: ");
            System.out.println("1.Mã Sản Phẩm: ");
            String code = scanner.nextLine();
            System.out.println("2.Nhập Tên Sản Phẩm: ");
            String name = scanner.nextLine();
            System.out.println("3.Nhập Loại Sản Phẩm: ");
            String type = scanner.nextLine();
            System.out.println("4.Nhập Giá Sản Phẩm: ");
            double price = scanner.nextDouble();
            Product product = new Product(code, name, type, price);
            listProduct[i] = product;
        }
    }

    public static void output(Product[] listProduct) {
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    public static double calculateTotalPrice(Product[] listProduct) {
        double total = 0;
        for (Product product : listProduct) {
            total += product.getPrice();
        }
        return total;
    }

    // Viết 1 hàm nhận vào 1 danh sách sản phẩm và 1 mã sp, tìm vị trí của sp đó
    public static int findByCode(Product[] listProduct, String code) {
        int index = -1;
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i].getCode().equals(code)) {
                index = i;
            }
        }
        return index;
    }

    // Viết 1 hàm nhận vào 1 danh sách sản phẩm và 1 mã sp, sửa thông tin sản phẩm đó
    public static void editByCode(Product[] listProduct, String code) {
        int indexEdit = findByCode(listProduct, code); // tìm vị trí của sản phẩm muốn sửa
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Thông Tin Sản phẩm: ");
        System.out.println("Nhập Tên Sản Phẩm: ");
        listProduct[indexEdit].setName(scanner.nextLine()); // sửa tên cho sản phẩm đó
        System.out.println("Nhập Loại Sản Phẩm: ");
        listProduct[indexEdit].setType(scanner.nextLine()); // sửa loại cho sản phẩm đó
        System.out.println("Nhập Giá Sản Phẩm: ");
        listProduct[indexEdit].setPrice(scanner.nextDouble()); // sửa giá cho sản phẩm đó
    }
}
