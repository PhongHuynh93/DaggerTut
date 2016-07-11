package dhbk.android.daggertut.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

import dhbk.android.daggertut.MVPApp;
import dhbk.android.daggertut.R;
import dhbk.android.daggertut.base.BasePresenterActivity;
import dhbk.android.daggertut.dagger.PresenterModule;
import dhbk.android.daggertut.ui.presenterinterfaces.MainActivityPresenter;
import dhbk.android.daggertut.ui.viewinterfaces.MainActivityView;

// TODO: 7/11/16  MainActivityPresenter là 1 interface extend interface BasePresenter
public class MainActivity extends BasePresenterActivity<MainActivityPresenter> implements MainActivityView {
    @Inject
    MainActivityPresenter mMainActivityPresenter;

    private TextView mTextView;
    private View mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initView();
    }

    // TODO: 7/11/16 hiện thưc từ  BasePresenterActivity
    @Override
    protected MainActivityPresenter getPresenter() {
        if(mMainActivityPresenter == null){
            // do dagger stuff
            DaggerPresenterComponent.builder()
                    .baseComponent(MVPApp.getBaseComponent())
                    .presenterModule(new PresenterModule())
                    .build().inject(this);
            mMainActivityPresenter.registerView(this);
        }

        return mMainActivityPresenter;
    }

    // TODO: 7/11/16 hiện thực từ MainActivityView
    @Override
    public void postTweet(String tweet) {
        mTextView.setText(tweet);

    }

    // TODO: 7/11/16 hiện thực từ baseview
    @Override
    public String getStringById(int id) {
        return getResources().getString(id);
    }

    // TODO: 7/11/16 call  getRandomTweet() fromm getPresenter()
    private void initView() {
        mTextView =(TextView) findViewById(R.id.tweet_text);
        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getPresenter().getRandomTweet();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(MainActivity.this, SomeActivity.class));
                    }
                }, 2000);
            }
        });
    }
}
