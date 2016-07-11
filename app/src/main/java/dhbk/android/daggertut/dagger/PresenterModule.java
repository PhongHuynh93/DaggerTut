package dhbk.android.daggertut.dagger;

import dagger.Module;
import dagger.Provides;
import dhbk.android.daggertut.network.TwitterAPI;
import dhbk.android.daggertut.ui.MainActivityPresenterImpl;
import dhbk.android.daggertut.ui.presenterinterfaces.MainActivityPresenter;

/**
 * Created by huynhducthanhphong on 7/11/16.
 */
@Module
public class PresenterModule {

    @Provides
    MainActivityPresenter providesMainActivePresenter(TwitterAPI api){
        return new MainActivityPresenterImpl(api);
    }
}