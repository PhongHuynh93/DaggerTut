package dhbk.android.daggertut.base;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by huynhducthanhphong on 7/11/16.
 */
public abstract class BasePresenterActivity<T extends BasePresenter> extends AppCompatActivity {

    @Override
    protected void onResume() {
        super.onResume();
        getPresenter().onAttach();
    }

    @Override
    protected void onPause() {
        super.onPause();
        getPresenter().onDettach();
    }

    protected abstract T getPresenter();
}