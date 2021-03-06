package org.acappelli.myseries.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

import org.acappelli.myseries.R;
import org.acappelli.myseries.ui.fragment.ShowFragment;

/**
 * Created by andrea on 10/04/15.
 */
public class ShowActivity extends ActionBarActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_show);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        String tvImdb = getIntent().getStringExtra("imdb");
        if (savedInstanceState == null) {
            Bundle bundle = new Bundle();
            bundle.putString("imdb", tvImdb);
            ShowFragment f = new ShowFragment();
            f.setArguments(bundle);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, f)
                    .commit();

        }
    }
}
