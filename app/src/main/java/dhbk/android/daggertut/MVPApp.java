package dhbk.android.daggertut;

import android.app.Application;

/**
 * Created by huynhducthanhphong on 7/11/16.
 */
public class MVPApp  extends Application {

    private static BaseComponent sBaseComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // TODO: 7/11/16 declare component
        AppModule appModule = new AppModule(this);
        sBaseComponent = DaggerBaseComponent.builder()
                .appModule(appModule)
                .build();
    }

    // TODO: 7/11/16 declare getcomponent
    public static BaseComponent getBaseComponent(){
        return sBaseComponent;
    }
}
