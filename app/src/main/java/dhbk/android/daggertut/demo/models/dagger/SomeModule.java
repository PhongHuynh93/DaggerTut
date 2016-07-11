package dhbk.android.daggertut.demo.models.dagger;

import dagger.Module;
import dagger.Provides;
import dhbk.android.daggertut.demo.models.SomeClass;
import dhbk.android.daggertut.demo.models.SomeDependency;
import dhbk.android.daggertut.demo.models.interfaces.ISomeClass;
import dhbk.android.daggertut.demo.models.interfaces.ISomeDependency;

@Module
public class SomeModule {


    @Provides
    public ISomeDependency providesSomeDependency(){
        return new SomeDependency();
    }

    @Provides
    public ISomeClass providesSomeClass(ISomeDependency someDependency){
        return new SomeClass(someDependency);
    }
}
