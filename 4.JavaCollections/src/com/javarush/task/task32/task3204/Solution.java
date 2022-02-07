package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
Генератор паролей

Реализуй логику метода getPassword, который должен возвращать ByteArrayOutputStream, в котором будут байты пароля.
Требования к паролю:
1) 8 символов.
2) только цифры и латинские буквы разного регистра.
3) обязательно должны присутствовать цифры, и буквы разного регистра.
Все сгенерированные пароли должны быть уникальные.

Пример правильного пароля:
wMh7smNu


Requirements:
1. Класс Solution должен содержать метод getPassword().
2. Длина пароля должна составлять 8 символов.
3. Пароль должен содержать хотя бы одну цифру.
4. Пароль должен содержать хотя бы одну латинскую букву нижнего регистра.
5. Пароль должен содержать хотя бы одну латинскую букву верхнего регистра.
6. Пароль не должен содержать других символов, кроме цифр и латинских букв разного регистра.
7. Сгенерированные пароли должны быть уникальными.
*/

public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password);
    }

    public static ByteArrayOutputStream getPassword() {
        // Create a list of character types in the generated password
        String[] typesArray = {"number", "upper", "lower"};
        List<String> types = Arrays.asList(typesArray);

        // Create a StringBuilder that will accumulate generated characters from array
        StringBuilder sb = new StringBuilder(2);

        // Array for storing password characters
        String[] password = new String[8];

        Random r = new Random();

        int size = 8;
        // Guarantee that the password contains at least one number
        int position = r.nextInt(size);
        int number = r.nextInt(10);
        password[position] = String.valueOf(number);

        // Guarantee that the password contains at least one upper case character
        do {
            position = r.nextInt(size);
        } while (password[position] != null);

        int upperChar = r.nextInt('[' - 'A') + 'A';
        password[position] = String.valueOf((char) upperChar);

        // Guarantee that the password contains at least one lower case character
        do {
            position = r.nextInt(size);
        } while (password[position] != null);

        int lowerChar = r.nextInt('{' - 'a') + 'a';
        password[position] = String.valueOf((char) lowerChar);


        // Now there are five nulls in the array.
        // Character type - number, lower case character
        // and upper case character - and value are selected randomly.
        for (int i = 0; i < 5; i++) {
            do {
                position = r.nextInt(size);
            } while (password[position] != null);

            String s = types.get(r.nextInt(types.size()));
            switch (s) {
                case "number":
                    number = r.nextInt(10);
                    password[position] = String.valueOf(number);
                    break;
                case "upper":
                    upperChar = r.nextInt('[' - 'A') + 'A';
                    password[position] = String.valueOf((char) upperChar);
                    break;
                case "lower":
                    lowerChar = r.nextInt('{' - 'a') + 'a';
                    password[position] = String.valueOf((char) lowerChar);
                    break;
            }
        }

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Arrays.stream(password)
                .forEach(s -> {
                    try {
                        bos.write(s.getBytes(StandardCharsets.UTF_8));
                    } catch (Exception e) {
                        throw new RuntimeException();
                    }
                });

        return bos;
    }
}
