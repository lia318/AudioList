package kr.hs.lia318e_mirim.audiolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView list;
    Button but_play, but_stop;
    TextView text_music;
    ProgressBar progress;
    String[] sing = {"day6_Blood", "day6 _I smile", "day6_Say Wow"};
    int[] musicResIds = {R.raw.day6_blood, R.raw.day6_i_smile, R.raw.day6_say_wow};
    int selected_Music_Id;
    // 노래 파일을 클릭하고 Shift + F6를 누른 후 Ctrl + V

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.list_music);
        but_play = (Button) findViewById(R.id.but_play);
        but_stop = (Button) findViewById(R.id.but_stop);
        text_music = (TextView) findViewById(R.id.text_music);
        progress = (ProgressBar) findViewById(R.id.progress_music);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, sing);
        list.setAdapter(adapter);
        list.setChoiceMode(ListView.CHOICE_MODE_SINGLE); // 여러 모드 중 하나만 선택 가능
        list.setItemChecked(0, true); // 라디오 버튼이 선택된 상태에서 음악 재생
        selected_Music_Id = musicResIds[0]; // 재생이 가능하게 한다.

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    } // end of onCreate
} // end of MainActivity