/**
 * Created by King Bradley on 7/15/2016.
 */



import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("The message in 1st intent is: " + message);
        setContentView(textView);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem)
    {
        //Handle action bar item clicks here. The action bar will automatically handle clicks on Home/Up button, so long as you specify a parent activity in AndroidManifest.xml

        int id = item.getItemId();
        //noinstepction SimplifiableIfStatement
        if(id == R.id.action_setttings)
        {
            return true;

        }
        return super.onOptionsItemSelected(item);


    }


}
