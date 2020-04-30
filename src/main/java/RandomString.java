public class RandomString {
    // функция для генерации случайной строки длиной n
    static String getAlphaNumericString(int n) {
        // выбрал символ случайный из этой строки
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "abcdefghijklmnopqrstuvxyz";


        // создаем StringBuffer размером AlphaNumericString

        StringBuffer sb = new StringBuffer(n);
        for (int i = 0; i < n; i++) {
            // генерируем случайное число между
            // 0 переменной длины AlphaNumericString
            int index= (int) (AlphaNumericString.length()* Math.random());
            // добавляем символ один за другим в конец sb
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }
}