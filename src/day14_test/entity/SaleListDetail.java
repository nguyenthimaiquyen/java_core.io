package day14_test.entity;

public class SaleListDetail {
    private Product product;
    private int saleQuantity;

    public SaleListDetail(Product product, int saleQuantity) {
        this.product = product;
        this.saleQuantity = saleQuantity;
    }

    public SaleListDetail() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getSaleQuantity() {
        return saleQuantity;
    }

    public void setSaleQuantity(int saleQuantity) {
        this.saleQuantity = saleQuantity;
    }

    @Override
    public String toString() {
        return "SaleListDetail{" +
                "product=" + product +
                ", saleQuantity=" + saleQuantity +
                "}\n";
    }
}
