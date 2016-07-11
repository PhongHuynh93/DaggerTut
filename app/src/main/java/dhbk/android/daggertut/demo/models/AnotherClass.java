package dhbk.android.daggertut.demo.models;


import javax.inject.Inject;

import dhbk.android.daggertut.demo.models.interfaces.ISomeClass;

public class AnotherClass {

    private final ISomeClass someClass;

    @Inject
    public AnotherClass(ISomeClass someClass){
        this.someClass = someClass;
    }

    public String getSomeText() {
        return null;
    }
}
