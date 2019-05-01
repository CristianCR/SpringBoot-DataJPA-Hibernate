package es.cristian.example.serviceimpl;

import es.cristian.example.dao.CarRentRepo;
import es.cristian.example.dao.CarRepo;
import es.cristian.example.dao.UserRepo;
import es.cristian.example.model.Car;
import es.cristian.example.model.CarRent;
import es.cristian.example.model.User;
import es.cristian.example.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class DemoService implements IDemoService {

    @Autowired
    private CarRepo carRepo;

    @Autowired
    private CarRentRepo carRentRepo;

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<Car> find() {
        return carRepo.findAll();
    }

    @Override
    public void save() {
        User user = new User();
        user.setName("Cristian");

        CarRent carRent1 = new CarRent();
        carRent1.setName("Bugati");
        CarRent carRent2 = new CarRent();
        carRent2.setName("Masserati");
        Set<CarRent> set = new HashSet<>();
        set.add(carRentRepo.save(carRent1));
        set.add(carRentRepo.save(carRent2));

        user.setCarRents(set);
        user = userRepo.save(user);

        Car car = new Car();
        car.setName("Ferrari");
        car.setUser(user);
        carRepo.save(car);
    }
}
