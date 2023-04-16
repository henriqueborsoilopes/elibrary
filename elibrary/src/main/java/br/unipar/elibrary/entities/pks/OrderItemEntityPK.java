package br.unipar.elibrary.entities.pks;

import br.unipar.elibrary.entities.ProductEntity;
import br.unipar.elibrary.entities.OrderEntity;
import java.util.Objects;

public class OrderItemEntityPK {
    
    private OrderEntity order;
    private ProductEntity product;

    public OrderEntity getOrder() {
        return order;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.order);
        hash = 23 * hash + Objects.hashCode(this.product);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrderItemEntityPK other = (OrderItemEntityPK) obj;
        if (!Objects.equals(this.order, other.order)) {
            return false;
        }
        return Objects.equals(this.product, other.product);
    }
}
