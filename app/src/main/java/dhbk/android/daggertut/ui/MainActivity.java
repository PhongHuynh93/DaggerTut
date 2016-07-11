package dhbk.android.daggertut.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;

import dhbk.android.daggertut.R;
import dhbk.android.daggertut.base.BasePresenterActivity;
import dhbk.android.daggertut.ui.presenterinterfaces.MainActivityPresenter;
import dhbk.android.daggertut.ui.viewinterfaces.MainActivityView;

// TODO: 7/11/16  MainActivityPresenter là 1 interface extend interface BasePresenter
public class MainActivity extends BasePresenterActivity<MainActivityPresenter> implements MainActivityView {

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
    }

    // TODO: 7/11/16 hiện thưc từ  BasePresenterActivity
    @Override
    protected MainActivityPresenter getPresenter() {
        return null;
    }

    // TODO: 7/11/16 hiện thực từ MainActivityView
    @Override
    public void postTweet(String tweet) {

    }

    // TODO: 7/11/16 hiện thực từ baseview
    @Override
    public String getStringById(int id) {
        return null;
    }
}
