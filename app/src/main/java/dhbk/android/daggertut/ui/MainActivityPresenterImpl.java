package dhbk.android.daggertut.ui;

import android.os.Handler;

import javax.inject.Inject;

import dhbk.android.daggertut.network.TwitterAPI;
import dhbk.android.daggertut.ui.presenterinterfaces.MainActivityPresenter;
import dhbk.android.daggertut.ui.viewinterfaces.MainActivityView;

/**
 * Created by huynhducthanhphong on 7/11/16.
 */
public class MainActivityPresenterImpl implements MainActivityPresenter {
    private MainActivityView mView;

    private final TwitterAPI mTwitterAPI;

    @Inject
    public MainActivityPresenterImpl(TwitterAPI twitterAPI){
        mTwitterAPI = twitterAPI;
    }



    @Override
    public void getRandomTweet() {
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mView.postTweet(mTwitterAPI.fetchTweetFromServer());
            }
        }, 5000);
    }

    @Override
    public void onAttach() {
    }

    @Override
    public void onDettach() {
    }

    @Override
    public void registerView(MainActivityView param) {
        mView = param;
    }
}