package www.supe.mvp.com.mvp_super.presenter;

import www.supe.mvp.com.mvp_super.contract.Contract;

/**
 * Created by Carlos Anguiano on 11/11/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

public class PresenterImplement implements Contract.Presenter {

    private Contract.View view;

    @Override
    public void setView(Contract.View view) {
        this.view = view;
    }

    @Override
    public void requestText() {
        view.showText("Show Message");
    }
}
