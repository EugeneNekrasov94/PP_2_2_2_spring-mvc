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
��� ��� � ������-�� ������� ����� �� ���� ������� ,�� ����� ��������� ��� ��� ������� ����� �. �������� ������� ����-��)
1.��������� ������ 9 ������(� 10 � ���� ������ �� ��������, ��� ��� ���� ������ ���������� ����� , �� ����� ����� 9 �������)
2.����������� ������ �� ���������� �� �������
3.������� ����� model  � ��� ������� ��� ����� Car(�� � ������ �� �������)
4.� ����� controller ������� ��� CarController �� �������� � HelloController (�� ������� �������� , ��� �)
5.������ ������� ����� service, � ��� ������� ��������� � ����� ��� ����� Car(��������� CarService , ����� CarServiceImpl(������ ������� ��� ������ ��� ������ ��� �������)).
6.������ �� ����� ������� � ������ �������(������� ����� ������� https://www.youtube.com/watch?v=D58pIymCew4&list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ&index=21)
7.� webApp ��������� cars.html , ��� ��� �� �������� � index.html
8. �� � ������ � ����� ��� �� �������������� ����������� ��� �������, ���� ����������� ���������� ������� , ����� �� 6-�� ������ , �� ����� ���������� ������� ������� ����, ����� )))
 */