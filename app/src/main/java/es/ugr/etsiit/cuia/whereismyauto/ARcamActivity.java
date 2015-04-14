package es.ugr.etsiit.cuia.whereismyauto;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.wikitude.architect.ArchitectView;
import com.wikitude.architect.StartupConfiguration;

import java.io.IOException;

public class ARcamActivity extends ActionBarActivity {

    protected ArchitectView architectView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent =getIntent();

       setContentView(R.layout.activity_arcam);
        this.architectView = (ArchitectView)this.findViewById( R.id.architectView );
        StartupConfiguration config = new StartupConfiguration("peiS3vj7GhSSKJv275HS9y2Mcvw4fCfI+d1N4udX0CpNwecsdv23O5LEmPl4mEjIOKRXUJPpZTZMV0ND2gYFcWYft5Ozy16mzLVKkiqYeSNOQ+UgUPTx28dj4L2lT3VoJEq6RKGgY3swYUt9Li4iej3MlBibP/1EIp36RFe0opNTYWx0ZWRfX3QAQZYkWC9r5WsRhbyLMcP9l6lM7/QubkSJuC/Y0wq1cMcDR7tIJVoc//8zbZB0SWGvizmSvehAllFUdzlgrT8mWrU/gZo9PBBjVarZP6FKyfb3VunnSDEwULtNAUzfHxY1XyP9tbxxMFZZq/SOTWCM3stUXh3FQaI5vf5Wq/g+cbIWMWdcuIuZJIdswSFtXQq6MTdOilgAywykM5sZVcxWv1g5q3+afVvsvUxOlYJmDScmNnZt2lxsGd+Q2lXbwZX0apBFF3UhU/uwzLk65I++Em8Xfu1gKOBYboOTz6ajnr/Ab4Y1a0kxweLPre5HGfjeFrDKfotLdZWy7JstdIGFZteuYkovAMr3hGwJ4gN0vY0lTZzvaTfFq43HTOHZuGN3f99bhNx67Oft1mIwA5+W+UVtFYFbjgBUPXcXlxA5k610FrDaX7a5qWuZobuar0uBXqJT/R3GQr3mJBhb/aD7klC0qf+B1SOTp8/4qAhDRdZrOwN15rk=");
        this.architectView.onCreate(config);

    }

    @Override
    protected void onResume() {
        super.onResume();
        if ( this.architectView != null ) {
            this.architectView.onResume();
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        if ( this.architectView != null ) {
            this.architectView.onPause();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if ( this.architectView != null ) {
            this.architectView.onDestroy();
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        if ( this.architectView != null ) {
            this.architectView.onLowMemory();
        }
    }


    @Override
    protected void onPostCreate( final Bundle savedInstanceState ) {
        super.onPostCreate(savedInstanceState);
        //cargamos html
        architectView.onPostCreate();
        try {
            this.architectView.load("gps/index.html");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}