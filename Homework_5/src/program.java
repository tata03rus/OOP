import models.TableModel;
import presenters.BookingPresenter;
import views.BookingView;
import presenters.Model;
import presenters.View;

import java.util.Date;

public class program {

    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 2, "Иван Иванов");

        view.changeReservationTable(1001, new Date(), 3, "Иван Иванов");

    }

}