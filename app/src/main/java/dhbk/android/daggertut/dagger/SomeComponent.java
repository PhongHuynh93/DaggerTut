package dhbk.android.daggertut.dagger;

import dagger.Component;
import dhbk.android.daggertut.SomeActivity;

/**
 * Created by huynhducthanhphong on 7/12/16.
 */

@Component(modules = {SomeModule.class})
public interface SomeComponent {
    void inject(SomeActivity someActivity);
}