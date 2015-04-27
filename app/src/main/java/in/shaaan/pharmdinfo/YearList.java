package in.shaaan.pharmdinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class YearList extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_list);
    }

    public void first_year_syllabus(View view) {
        Intent intent = new Intent(this, FirstYearSyllabus.class);
        startActivity(intent);
    }

    public void second_year_syllabus(View view) {
        Intent intent = new Intent(this, SecondYearSyllabus.class);
        startActivity(intent);
    }

    public void third_year_syllabus(View view) {
        Intent intent = new Intent(this, ThirdYearSyllabus.class);
        startActivity(intent);
    }

    public void fourth_year_syllabus(View view) {
        Intent intent = new Intent(this, FourthYearSyllabus.class);
        startActivity(intent);
    }

    public void fifth_year_syllabus(View view) {
        Intent intent = new Intent(this, FifthYearSyllabus.class);
        startActivity(intent);
    }

    public void sixth_year_syllabus(View view) {
        Intent intent = new Intent(this, SixthYearSyllabus.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.year_list, menu);
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
