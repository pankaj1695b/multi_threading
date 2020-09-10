package retrier;

@FunctionalInterface
public interface RequestHandler<R,T> {
    R submit(T t);
}
