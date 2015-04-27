package in.shaaan.pharmdinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class CircularList extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_list);
    }

    public void pd_qf_teaching(View view) {
        Intent intent = new Intent(this, Circular1.class);
        startActivity(intent);
    }

    public void pd_nomenclature(View view) {
        Intent intent = new Intent(this, Circular2.class);
        startActivity(intent);
    }

    public void promotion(View view) {
        Intent intent = new Intent(this, Circular3.class);
        startActivity(intent);
    }

    public void registration(View view) {
        Intent intent = new Intent(this, Circular4.class);
        startActivity(intent);
    }

    public void phd_qualification(View view) {
        Intent intent = new Intent(this, Circular5.class);
        startActivity(intent);
    }

    public void pd_complaince(View view) {
        Intent intent = new Intent(this, Circular6.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.circular_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, About.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
