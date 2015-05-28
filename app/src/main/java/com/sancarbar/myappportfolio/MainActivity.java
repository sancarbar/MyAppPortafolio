package com.sancarbar.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity
    extends ActionBarActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        setTitle( R.string.app_name );
    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu )
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.menu_main, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item )
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if ( id == R.id.action_settings )
        {
            return true;
        }

        return super.onOptionsItemSelected( item );
    }

    public void displayApp( View view )
    {
        switch ( view.getId() )
        {
            case R.id.spotifyStreamer:
                showToast( R.string.SPOTIFY_STREAMER );
                break;

            case R.id.scoresApp:
                showToast( R.string.SCORES_APP );
                break;

            case R.id.libraryApp:
                showToast( R.string.LIBRARY_APP );
                break;

            case R.id.buildItBigger:
                showToast( R.string.BUILD_IT_BIGGER );
                break;

            case R.id.xyzReader:
                showToast( R.string.XYZ_READER );
                break;

            case R.id.myOwnApp:
                showToast( R.string.MY_OWN_APP );
                break;
        }
    }

    private void showToast( int appNameResourceId )
    {
        String appName = getString( appNameResourceId );
        Toast.makeText( this, getString( R.string.This_button_will_launch_App, appName ), Toast.LENGTH_SHORT ).show();
    }
}
