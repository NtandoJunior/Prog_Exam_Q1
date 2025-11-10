import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductSalesTest {

    int[][] sales = {
        {300, 150, 700},
        {250, 200, 600}
    };

    ProductSales ps = new ProductSales();

    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        int expected = 2200;
        int actual = ps.TotalSales(sales);
        assertEquals(expected, actual, "Total sales should be 2200");
    }

    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        double expected = 366.67; // 2200 / 6
        double actual = ps.AverageSales(sales);
        assertEquals(expected, actual, 0.01, "Average sales should be 366.67");
    }

    @Test
    public void MaxSale_ReturnsMaximumSale() {
        int expected = 700;
        int actual = ps.MaxSale(sales);
        assertEquals(expected, actual, "Maximum sale should be 700");
    }

    @Test
    public void MinSale_ReturnsMinimumSale() {
        int expected = 150;
        int actual = ps.MinSale(sales);
        assertEquals(expected, actual, "Minimum sale should be 150");
    }
}

