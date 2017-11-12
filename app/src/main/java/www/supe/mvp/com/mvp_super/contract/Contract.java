package www.supe.mvp.com.mvp_super.contract;

import www.supe.mvp.com.mvp_super.iu.MainActivity;

/**
 * Created by Carlos Anguiano on 11/11/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

public interface Contract {

    interface View {

        void showText(String s);
    }

    interface Presenter {
        void setView(View view);

        void requestText();
    }
}
