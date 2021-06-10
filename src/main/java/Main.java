import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		// Свободный текст из интернета
		// Присутствует дублирование текста/слов

		String text = "Alla seconda fermata Non attraversare la strada Gira subito a sinistra e prosegui dritto Alla seconda traversa gira a destra e continua per trecento metri circa"
						+ "Non attraversare la strada Ma com’e` pieno Quando ci vuole in autobus"
						+ "Dal tabaccaio o dal giornalaio Ogni biglietto e` valido per settantacinque minuti"
						+ "Ma com’e` pieno Quando ci vuole in autobus"
						+ "Un momento Frenello…si ecco Si ha una prenoazione Una camera singola per due settimane"
						+ "Ma com’e` pieno Quando ci vuole in autobus";

		System.out.println(Dictionary.apply(text));
	}

	//	Детерминированность функции
	//	Отсутствие побочных эффектов

	public static Function<String, List<String>> Dictionary = x -> Arrays.stream(x.split(" "))
					.map(Dictionary -> Dictionary.toLowerCase())
					.distinct()
					.sorted()
					.collect(Collectors.toList());
}