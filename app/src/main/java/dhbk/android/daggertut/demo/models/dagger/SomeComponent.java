package dhbk.android.daggertut.demo.models.dagger;


import dagger.Component;
import dhbk.android.daggertut.SomeActivity;

@Component(modules = {SomeModule.class})
public interface SomeComponent {
    void inject(SomeActivity someActivity);
}
