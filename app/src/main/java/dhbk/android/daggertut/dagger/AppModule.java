package dhbk.android.daggertut.dagger;

import javax.inject.Singleton;

import dagger.Provides;
import dhbk.android.daggertut.MVPApp;

/**
 * Created by huynhducthanhphong on 7/11/16.
 */
public class AppModule {

    private final MVPApp mApp;

    public AppModule(MVPApp app){
        mApp = app;
    }

    @Provides
    @Singleton
    MVPApp providesMVPApp(){
        return mApp;
    }
}
