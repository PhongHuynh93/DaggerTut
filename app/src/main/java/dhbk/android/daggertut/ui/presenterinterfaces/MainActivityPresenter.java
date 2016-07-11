package dhbk.android.daggertut.ui.presenterinterfaces;

import dhbk.android.daggertut.base.BasePresenter;
import dhbk.android.daggertut.ui.viewinterfaces.MainActivityView;

/**
 * Created by huynhducthanhphong on 7/11/16.
 */
public interface MainActivityPresenter extends BasePresenter<MainActivityView> {
    public void getRandomTweet();
}