package ru.archipov.MyFirstTestAppSpringBoot.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class HelloController3 {

    // Статическое поле для хранения данных
    private static Map<Integer, String> hashMap = null;
    // Статический счетчик для генерации уникальных ключей
    private static AtomicInteger idCounter = new AtomicInteger(1);

    // Метод для обновления HashMap
    @GetMapping("/update-map")
    public String updateHashMap(@RequestParam(value = "value") String value) {
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }

        int key = idCounter.getAndIncrement();
        hashMap.put(key, value);

        return String.format("Value '%s' added with key %d. Current map: %s", value, key, hashMap);
    }

    // Статический геттер для доступа к HashMap
    public static Map<Integer, String> getHashMap() {
        return hashMap;
    }
}
