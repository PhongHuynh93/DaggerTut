package dhbk.android.daggertut.demo.models;


import javax.inject.Inject;

import dhbk.android.daggertut.demo.models.interfaces.ISomeClass;
import dhbk.android.daggertut.demo.models.interfaces.ISomeDependency;

public class SomeClass implements ISomeClass {

    private final ISomeDependency someDependency;

    @Inject
    public SomeClass(ISomeDependency someDependency){
        this.someDependency = someDependency;
    }
}
