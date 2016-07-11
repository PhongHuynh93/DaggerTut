package dhbk.android.daggertut;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class SomeActivity extends AppCompatActivity {

    @Inject
    AnotherClass anotherClass;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some);
        DaggerSomeComponent.builder()
                .build()
                .inject(this);

        ((TextView)findViewById(R.id.sometext)).setText(anotherClass.getSomeText());
    }
}
