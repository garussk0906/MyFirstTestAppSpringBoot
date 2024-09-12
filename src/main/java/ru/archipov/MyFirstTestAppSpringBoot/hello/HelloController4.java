package ru.archipov.MyFirstTestAppSpringBoot.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController4 {

    // Метод для отображения всех элементов HashMap
    @GetMapping("/show-map")
    public String showHashMap() {
        // Используем геттер для доступа к HashMap из предыдущего контроллера
        if (HelloController3.getHashMap() == null || HelloController3.getHashMap().isEmpty()) {
            return "The map is empty.";
        }
        return String.format("Current map: %s", HelloController3.getHashMap());
    }
}
