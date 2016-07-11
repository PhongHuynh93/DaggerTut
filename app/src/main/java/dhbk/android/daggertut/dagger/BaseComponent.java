package dhbk.android.daggertut.dagger;

import javax.inject.Singleton;

import dagger.Component;
import dhbk.android.daggertut.MVPApp;

/**
 * Created by huynhducthanhphong on 7/11/16.
 */
@Singleton
@Component(modules={AppModule.class, OkModule.class})
public interface BaseComponent {
    MVPApp getMVPApp();
    OKClient getOKClient();
}
