package core2.functional.converter_ex;

@FunctionalInterface
public interface Converter<R, V> {

    R convert(V object);
}
