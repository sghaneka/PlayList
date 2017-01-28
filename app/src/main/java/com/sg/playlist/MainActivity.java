package com.sg.playlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.napster.cedar.Napster;
import com.sg.napsteraccess.NapsterService;

public class MainActivity extends AppCompatActivity
implements PlayListFragment.OnItemSelectedListener{

    private Napster m_napster;
    //NapsterLoginDialogFragment loginDialog;
    private AppInfo mAppInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NapsterService ns = new NapsterService();
        m_napster = ns.getNapster();
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_login, menu);
        menu.findItem(R.id.menu_item_login).setVisible(true);
        menu.findItem(R.id.menu_item_logout).setVisible(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_item_login) {
            login();
            return true;
        } else if (id == R.id.menu_item_logout) {
            logout();
            invalidateOptionsMenu();
            return true;
        }
        return false;
    }

    private void login() {
        String loginUrl = m_napster.getLoginUrl(mAppInfo.getRedirectUrl());
        //loginDialog = NapsterLoginDialogFragment.newInstance(loginUrl, mAppInfo);
        //loginDialog.setLoginCallback(loginCallback);
        //loginDialog.show(getSupportFragmentManager(), "login");*/
    }

    private void logout() {
       // sessionManager.closeSession();
      // onLogout();
    }

    @Override
    public void onItemSelected(int position) {
        Toast.makeText(this, "selected position: " + position, Toast.LENGTH_SHORT).show();
    }
}
