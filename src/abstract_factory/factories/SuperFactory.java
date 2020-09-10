package abstract_factory.factories;

import abstract_factory.products.Product;
import abstract_factory.products.ProductType;

public class SuperFactory {

    public static Product getObject(FactoryType factoryType, ProductType productType){
        if(factoryType == FactoryType.FACTORY1){
            return Factory1.getProduct(productType);
        } else if(factoryType == FactoryType.FACTORY2){
            return Factory2.getProduct(productType);
        } else {
            return null;
        }
    }
}
