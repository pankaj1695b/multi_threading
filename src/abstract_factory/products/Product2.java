package abstract_factory.products;

public class Product2 implements Product{
    String factoryName;
    public Product2 (String factoryName){
        this.factoryName = factoryName;
    }

    @Override
    public String toString() {
        return "Product2{" +
                "factoryName='" + factoryName + '\'' +
                '}';
    }
}
