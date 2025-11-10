public class ProductSalesReport {
    public static void main(String[] args) {
        
        int[][] sales = {
            {300, 150, 700},  
            {250, 200, 600}  
        };

        ProductSales ps = new ProductSales();
        
        int total = ps.TotalSales(sales);
        double average = ps.AverageSales(sales);
        int max = ps.MaxSale(sales);
        int min = ps.MinSale(sales);

        
        System.out.println("=================================");
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("=================================");
        System.out.println("Total sales: " + total);
        System.out.printf("Average sales: %.0f\n", average);
        System.out.println("Maximum sale: " + max);
        System.out.println("Minimum sale: " + min);
        System.out.println("=================================");
    }
}

