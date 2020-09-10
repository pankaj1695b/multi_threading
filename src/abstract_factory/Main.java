package abstract_factory;

import abstract_factory.factories.FactoryType;
import abstract_factory.factories.SuperFactory;
import abstract_factory.products.ProductType;

public class Main {
    public static void main(String[] args) {
        System.out.println(SuperFactory.getObject(FactoryType.FACTORY1, ProductType.PRODUCT1));
        System.out.println(SuperFactory.getObject(FactoryType.FACTORY1, ProductType.PRODUCT2));
        System.out.println(SuperFactory.getObject(FactoryType.FACTORY2, ProductType.PRODUCT1));
        System.out.println(SuperFactory.getObject(FactoryType.FACTORY2, ProductType.PRODUCT2));
    }
}
