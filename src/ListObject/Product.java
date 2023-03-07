package ListObject;

public class Product {
    public Integer ProductId;
    public String ProductName;
    public Integer StockQty;
    public Float BoughtPrc;

    public Product(Integer id, String name, Integer qty, Float prc) {
        this.ProductId = id;
        this.ProductName = name;
        this.StockQty = qty;
        this.BoughtPrc = prc;
    }

    public Integer getProductId() {
        return ProductId;
    }

    public void setProductId(Integer productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Integer getStockQty() {
        return StockQty;
    }

    public void setStockQty(Integer stockQty) {
        StockQty = stockQty;
    }

    public Float getBoughtPrc() {
        return BoughtPrc;
    }

    public void setBoughtPrc(Float boughtPrc) {
        BoughtPrc = boughtPrc;
    }
}
