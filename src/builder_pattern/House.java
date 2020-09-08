package builder_pattern;


public class House {
    private int a;
    private int b;
    private int c;

    public static Builder builder() {
        return new Builder();
    }

    public String toString(){
        return "a:" + a + " b:" + b + " c:" +c;
    }

    public static class Builder {
        private int a = 0;
        private int b = 0;
        private int c = 0;

        public Builder a (int x) {
            a = x;
            return this;
        }

        public Builder b (int x) {
            b = x;
            return this;
        }

        public Builder c (int x) {
            c = x;
            return this;
        }

        public House build () {
            House h = new House();
            h.a = a;
            h.b = b;
            h.c = c;
            return h;
        }
    }
}


class Main {
    public static void main(String[] args) {
        House a = House.builder()
                .build();

        System.out.println(a);
    }
}


