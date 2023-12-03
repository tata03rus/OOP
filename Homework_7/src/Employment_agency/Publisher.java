package Employment_agency;

import Company.Vacancy;
import Worker.Observer;

import java.util.List;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    List<Observer> sendOffer(Vacancy vacancy);


}
