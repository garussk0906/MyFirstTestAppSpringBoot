package ru.archipov.MyFirstTestAppSpringBoot.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {

    // Метод для отображения всех элементов ArrayList
    @GetMapping("/show-array")
    public String showArrayList() {
        // Используем общий ArrayList из первого контроллера
        if (HelloController1.arrayList == null || HelloController1.arrayList.isEmpty()) {
            return "The list is empty.";
        }
        return String.format("Current list: %s", HelloController1.arrayList);
    }
}
