package dhbk.android.daggertut.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dhbk.android.daggertut.network.OKClient;

/**
 * Created by huynhducthanhphong on 7/11/16.
 */
@Module
public class OKModule {

    @Provides
    @Singleton
    public OKClient providesOKClient(){
        return new OKClient();
    }
}
