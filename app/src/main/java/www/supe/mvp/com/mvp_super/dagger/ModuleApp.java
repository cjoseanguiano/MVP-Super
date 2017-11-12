package www.supe.mvp.com.mvp_super.dagger;

import dagger.Module;
import dagger.Provides;
import www.supe.mvp.com.mvp_super.iu.MainActivity;
import www.supe.mvp.com.mvp_super.contract.Contract;
import www.supe.mvp.com.mvp_super.presenter.PresenterImplement;

/**
 * Created by Carlos Anguiano on 11/11/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

@Module(injects = {MainActivity.class})
public class ModuleApp {
    @Provides
    public Contract.Presenter provideMainPresenter() {
        return new PresenterImplement();
    }
}
