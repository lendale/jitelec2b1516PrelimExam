package tech.sidespell.prelimexam;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private static final String TAG = "";
    private ToggleButton btnSwitch;
    private TextView tvCounter, tvSpeed;
    private SeekBar seekBarSpeed;
    private RadioButton rdBtnInc, rdBtnDec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Finding all views
        btnSwitch = (ToggleButton) findViewById(R.id.toggleButton);
        tvCounter = (TextView) findViewById(R.id.tvCounter);
        tvSpeed = (TextView) findViewById(R.id.tvSpeed);
        seekBarSpeed = (SeekBar) findViewById(R.id.seekBar);
        rdBtnInc = (RadioButton) findViewById(R.id.radioButtonInc);
        rdBtnDec = (RadioButton) findViewById(R.id.radioButtonDec);

        //Ser the appropriate listeners
        //btnSwitch.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
        seekBarSpeed.setOnSeekBarChangeListener(this);

        final Handler handler = new Handler();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        tvSpeed.setText(String.valueOf(new Integer(progress)));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
