package sg.edu.np.mad.hanisah.listactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_group);

        //when group1btn is clicked
        Button group1Btn = findViewById(R.id.button3);
        group1Btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                Group1 group1 = new Group1();
                ft.replace(R.id.placeholder, group1);
                ft.commit();
            }
        });

        //when group2btn is clicked
        Button group2Btn = findViewById(R.id.button4);
        group2Btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                Group2 group2 = new Group2();
                ft.replace(R.id.placeholder, group2);
                ft.commit();
            }
        });
    }
}