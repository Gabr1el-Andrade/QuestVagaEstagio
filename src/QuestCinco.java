public class QuestCinco {

        public static String inverterString(String input) {
            char[] caracteres = input.toCharArray();
            int inicio = 0;
            int fim = caracteres.length - 1;

            while (inicio < fim) {

                char temp = caracteres[inicio];
                caracteres[inicio] = caracteres[fim];
                caracteres[fim] = temp;

                inicio++;
                fim--;
            }

            return new String(caracteres);
        }

        public static void main(String[] args) {
            // Exemplo de uso
            String textoOriginal = "Hello, World!";
            String textoInvertido = inverterString(textoOriginal);

            System.out.println("Texto Original: " + textoOriginal);
            System.out.println("Texto Invertido: " + textoInvertido);
        }
    }

