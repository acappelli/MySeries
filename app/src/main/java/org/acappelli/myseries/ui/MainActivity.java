package org.acappelli.myseries.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import org.acappelli.myseries.R;
import org.acappelli.myseries.ui.fragment.MainFragment;

/**
 * Created by andrea on 13/04/15.
 */
public class MainActivity extends ActionBarActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new MainFragment())
                    .commit();
        }

        Drawer.Result drawer = new Drawer()
                .withActivity(this)
                .withToolbar(toolbar)
                .withSliderBackgroundColorRes(R.color.drawer_background)
                .withHeader(R.layout.drawer_header)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName("Serie TV")
                                .withSelectedColorRes(R.color.drawer_item_selected)
                                .withTextColorRes(R.color.primary_text_default_material_dark)
                                .withSelectedTextColorRes(R.color.primary_text_default_material_dark),
                        new PrimaryDrawerItem().withName("Cerca")
                                .withSelectedColorRes(R.color.drawer_item_selected)
                                .withTextColorRes(R.color.primary_text_default_material_dark)
                                .withSelectedTextColorRes(R.color.primary_text_default_material_dark),
                        new DividerDrawerItem(),
                        new SecondaryDrawerItem().withName("About")
                                .withSelectedColorRes(R.color.drawer_item_selected)
                                .withTextColorRes(R.color.primary_text_default_material_dark)
                                .withSelectedTextColorRes(R.color.primary_text_default_material_dark)
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l, IDrawerItem iDrawerItem) {
                        Intent intent;
                        switch (i) {
                            case 0: 
                                intent = new Intent(MainActivity.this, MainActivity.class);
                                startActivity(intent);
                                break;
                            case 1:
                                intent = new Intent(MainActivity.this, SearchActivity.class);
                                startActivity(intent);
                                break;
                            case 3:
                                break;
                            default:
                                break;
                        }
                    }
                })
                .build();

    }
}
