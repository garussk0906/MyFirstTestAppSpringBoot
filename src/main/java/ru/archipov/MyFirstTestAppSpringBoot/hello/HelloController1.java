package ru.archipov.MyFirstTestAppSpringBoot.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController1 {

    // Поле для хранения данных (общий ArrayList для обоих контроллеров)
    public static List<String> arrayList = null;

    // Метод для обновления ArrayList
    @GetMapping("/update-array")
    public String updateArrayList(@RequestParam(value = "value") String value) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }

        if (!arrayList.contains(value)) {
            arrayList.add(value);
            return String.format("Value '%s' added to the list. Current list: %s", value, arrayList);
        } else {
            return String.format("Value '%s' is already in the list. Current list: %s", value, arrayList);
        }
    }
}
