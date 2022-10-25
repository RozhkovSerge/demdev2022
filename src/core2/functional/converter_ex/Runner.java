package core2.functional.converter_ex;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Runner {
    public static void main(String[] args) {

        Converter<Recon, Dog> convertDogToRecon = dog -> new Recon(dog.getName(), dog.getAge());

        Converter<Dog, Recon> reconToDog = new Converter<Dog, Recon>() {
            @Override
            public Dog convert(Recon object) {
                return new Dog(object.getName(), object.getAge());
            }
        };

        Dog dog = new Dog("Bobik", 2);
        Recon recon = convertDogToRecon.convert(dog);
        Dog dog2 = reconToDog.convert(recon);


        System.out.println(dog);
        System.out.println(recon);
        System.out.println(dog2);

        System.out.println("-----------Predicate test---------------");
        Predicate<Integer> isEvenNumber = x -> x % 2 == 0; // принимает значение и возвращает boolean
        System.out.println(isEvenNumber.test(11));

        System.out.println("-----------Consumer test---------------");
        Consumer<String> sayHello = x -> System.out.println("Hello " + x); //принимает значение и ничего не возвращает
        sayHello.accept("Ivan");

        System.out.println("-----------Supplier test---------------");
        Supplier<Integer> getRandomInt = () -> new Random().nextInt(100); //ничего не принимает значение и возвращает какой-то тип
        System.out.println(getRandomInt.get());

        System.out.println("-----------Function test---------------");
        Function<Integer, Double> intToDouble = Integer::doubleValue; // <T, R> принимает тип  T, возвращет тип R
        System.out.println(intToDouble.apply(5));

        System.out.println("-----------UnaryOperator test---------------");
        UnaryOperator<Integer> multiplyValueByTwo = x -> x * 2;
        System.out.println(multiplyValueByTwo.apply(5));


    }

}
