package ru.archipov.MyFirstTestAppSpringBoot.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController5 {

    // Метод для отображения количества элементов в ArrayList и HashMap
    @GetMapping("/show-all-length")
    public String showAllLength() {
        // Получаем размеры коллекций из других контроллеров
        int arrayListSize = (HelloController1.arrayList != null) ? HelloController1.arrayList.size() : 0;
        int hashMapSize = (HelloController3.getHashMap() != null) ? HelloController3.getHashMap().size() : 0;

        return String.format("ArrayList contains %d elements and HashMap contains %d elements.", arrayListSize, hashMapSize);
    }
}
