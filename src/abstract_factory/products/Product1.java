package abstract_factory.products;

public class Product1 implements Product{
    String factoryName;
    public Product1 (String factoryName){
        this.factoryName = factoryName;
    }

    @Override
    public String toString() {
        return "Product1{" +
                "factoryName='" + factoryName + '\'' +
                '}';
    }
}
