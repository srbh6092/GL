package com.globallogic.training.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8 {
	public static void main(String[] args) {
		
		System.out.println("List:");
		List<Integer> list = new ArrayList<>();
		list.add(18);
		list.add(-23);
		list.add(5);
		list.add(13);
		list.add(-2);
		list.stream().forEach(System.out::println);
		
		//Predicate
		predicates(list);
		
		//Consumer
		consumers(list);
		
		//Supplier
		suppliers();
	}

	private static void consumers(List<Integer> list) {
		System.out.println();
		System.out.println("Absolute of list items:");
		Consumer<List<Integer>> absConsumer = l -> {
			int i=0;
			while(i<l.size())
				l.set(i, Math.abs(l.get(i++)));
		};
		Consumer<Integer> printConsumer = a -> System.out.println(a);
		Consumer<List<Integer>> printConsumerList = l -> l.stream()
											.forEach(printConsumer);
		absConsumer.andThen(printConsumerList).accept(list);
	}
	
	private static void suppliers() {
		System.out.println();
		System.out.println("Random int:");
		Supplier<Integer> randomInt =  () -> new Random().nextInt();
		System.out.println(randomInt.get());
	}
	
	private static void predicates(List<Integer> list) {
		System.out.println();
		System.out.println("Even items in list:");
		Predicate<Integer> isEven = (n) -> n%2==0;
		list.stream().filter(isEven).forEach(System.out::println);
	}
}