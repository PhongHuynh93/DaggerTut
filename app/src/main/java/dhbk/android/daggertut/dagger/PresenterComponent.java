package dhbk.android.daggertut.dagger;

import dagger.Component;
import dhbk.android.daggertut.ui.MainActivity;

/**
 * Created by huynhducthanhphong on 7/11/16.
 */
@Component(modules = {PresenterModule.class}, dependencies = BaseComponent.class)
@ActivityScope
public interface PresenterComponent {
    void inject(MainActivity activity);
}
