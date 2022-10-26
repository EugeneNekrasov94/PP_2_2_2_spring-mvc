package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCarsInfo(ModelMap modelMap) {
        List<Car> cars = List.of(new Car(1L, "BMW", 50000), new Car(2L, "Lexus", 40000)
                , new Car(3L, "Lada", 20000), new Car(4L, "FAW", 25000), new Car(5L, "Ferrari", 100000));
        modelMap.addAttribute("Cars",cars);
        return "cars";
    }

}

/*
Так как я почему-то надолго засел на этом задании ,то решил расписать как это задание делал я. Возможно поможет кому-то)
1.Скачиваем томкат 9 версию(с 10 у меня ничего не работало, так что если хотите сэкономить время , то лучше сразу 9 ставьте)
2.Настраиваем проект по инструкции из задания
3.Создаем папку model  в ней создаем наш класс Car(ну и дальше по заданию)
4.В папке controller создаем наш CarController по анологии с HelloController (не теряйте анотации , как я)
5.Дальше создаем папку service, в ней создаем интерфейс и класс для нашей Car(интерфейс CarService , класс CarServiceImpl(можете назвать как хотите это просто для примера)).
6.Список из машин создаем в классе сервиса(поможет видео Алишева https://www.youtube.com/watch?v=D58pIymCew4&list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ&index=21)
7.В webApp добавляем cars.html , там все по аналогии с index.html
8. Ну а дальше я думаю что вы самостоятельно догадаетесь как сделать, если внимательно посмотреть Алишева , видео из 6-го пункта , то думаю справитесь гораздо быстрее меня, удачи )))
 */