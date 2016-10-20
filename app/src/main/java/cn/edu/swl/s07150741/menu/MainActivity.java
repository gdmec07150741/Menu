package cn.edu.swl.s07150741.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private TextView tView;
    private int mcount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tView = (TextView) findViewById(R.id.text);
        registerForContextMenu(tView);
        mcount = 0;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater mi = getMenuInflater();
  //      mi.inflate(R.menu.menu,menu);
        mcount++;
      menu.add(0,1,0,R.string.m1);
        menu.add(0,2,0,R.string.m2);
        menu.add(0,3,0,R.string.m3);
        menu.add(0,mcount+3,0,"tt"+mcount);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        mcount++;
        menu.add(0,1,0,R.string.m1);
        menu.add(0,2,0,R.string.m2);
        menu.add(0,mcount+3,0,"tt"+mcount);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle().toString(),Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        mcount++;
        menu.add(0,mcount+3,0,"tt"+mcount);
        return super.onPrepareOptionsPanel(view, menu);
    }
}
