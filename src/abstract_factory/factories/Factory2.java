package abstract_factory.factories;

import abstract_factory.products.Product;
import abstract_factory.products.Product1;
import abstract_factory.products.Product2;
import abstract_factory.products.ProductType;

public class Factory2 {
    public static Product getProduct(ProductType type){
        if (type == ProductType.PRODUCT1) {
            return new Product1(FactoryType.FACTORY2.name());
        } else if (type == ProductType.PRODUCT2) {
            return new Product2(FactoryType.FACTORY2.name());
        } else {
            return null;
        }
    }
}
