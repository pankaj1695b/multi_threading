package builder_pattern;

public class Main {
    public static void main(String[] args) {
        House a = House.builder()
                .build();

        System.out.println(a);
    }
}
