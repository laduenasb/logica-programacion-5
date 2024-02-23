import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Crear el diccionario Español-Inglés
    Map<String, String> diccionario = new HashMap<>();
    diccionario.put("casa", "house");
    diccionario.put("perro", "dog");
    diccionario.put("gato", "cat");
    diccionario.put("árbol", "tree");
    diccionario.put("libro", "book");
    diccionario.put("computadora", "computer");
    diccionario.put("manzana", "apple");
    diccionario.put("pelota", "ball");
    diccionario.put("sol", "sun");
    diccionario.put("luna", "moon");
    diccionario.put("amarillo", "yellow");
    diccionario.put("azul", "blue");
    diccionario.put("verde", "green");
    diccionario.put("rojo", "red");
    diccionario.put("plátano", "banana");
    diccionario.put("agua", "water");
    diccionario.put("fuego", "fire");
    diccionario.put("montaña", "mountain");
    diccionario.put("amigo", "friend");
    diccionario.put("tiempo", "time");

    // Escoger al azar 5 palabras en español
    String[] palabrasEspañol = diccionario.keySet().toArray(new String[0]);
    Random random = new Random();
//    String[] palabrasAleatorias = new String[5];
    Set<String> palabrasAleatorias = new HashSet<>();
    while (palabrasAleatorias.size() < 5) {
      palabrasAleatorias.add(palabrasEspañol[random.nextInt(palabrasEspañol.length)]);
    }
    // Pedir al usuario que traduzca las palabras y verificar las respuestas
    Scanner scanner = new Scanner(System.in);
    int respuestasCorrectas = 0;
    int respuestasIncorrectas = 0;
    for (String palabra : palabrasAleatorias) {
      System.out.print("Traduzca la palabra '" + palabra + "' al inglés: ");
      String respuestaUsuario = scanner.nextLine();
      String traduccionCorrecta = diccionario.get(palabra);
      if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
        System.out.println("¡Correcto!");
        respuestasCorrectas++;
      } else {
        System.out.println("Incorrecto. La traducción correcta es: " + traduccionCorrecta);
        respuestasIncorrectas++;
      }
    }

    // Mostrar el resultado final
    System.out.println("\nRespuestas correctas: " + respuestasCorrectas);
    System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
  }
}
