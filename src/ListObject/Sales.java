package ListObject;

public class Sales {
    public Integer SalesId;
    public String SalesName;
    public Integer ProdId;
    public Integer CustomerId;
    public Integer SoldQty;
    public Float SalePrc;

    public Sales(Integer id, String name, Integer prodId, Integer custId, Integer qty, Float prc) {
        this.SalesId = id;
        this.SalesName = name;
        this.ProdId = prodId;
        this.CustomerId = custId;
        this.SoldQty = qty;
        this.SalePrc = prc;
    }

    public Integer getSalesId() {
        return SalesId;
    }

    public void setSalesId(Integer salesId) {
        SalesId = salesId;
    }

    public String getSalesName() {
        return SalesName;
    }

    public void setSalesName(String salesName) {
        SalesName = salesName;
    }

    public Integer getProdId() {
        return ProdId;
    }

    public void setProdId(Integer prodId) {
        ProdId = prodId;
    }

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer customerId) {
        CustomerId = customerId;
    }

    public Integer getSoldQty() {
        return SoldQty;
    }

    public void setSoldQty(Integer soldQty) {
        SoldQty = soldQty;
    }

    public Float getSalePrc() {
        return SalePrc;
    }

    public void setSalePrc(Float salePrc) {
        SalePrc = salePrc;
    }
}
