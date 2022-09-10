public class Main{
    public static void main(String[] args) {
    StringBuilder builder = new StringBuilder("Hello");

        System.out.println(builder);

    }
        static void deleteChars(StringBuilder builder) {
            StringBuilder stringBuilder = new StringBuilder();
            char[] arr = {'a', 'e', 'i', 'o', 'y'};
            for (int i = builder.length() - 1; i >= 0; --i) {
                int counter = 0;
                for (int j = 0; j < arr.length; ++j) {
                    if (builder.charAt(i) == arr[j]) {
                        counter = 1;
                        break;

                    }
                }
                if(counter == 0){
                    stringBuilder.append(builder.charAt(i));
                }
            }
            return stringBuilder;
        }
    }
