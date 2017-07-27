package projectframework.example.admin.projectframework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import projectframework.example.admin.projectframework.home.ui.activity.HomeAcivity;
import projectframework.example.admin.projectframework.permission.permissionActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
   private Button frame_btn,permission_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frame_btn=(Button) findViewById(R.id.frame_btn);
        frame_btn.setOnClickListener(this);
        permission_btn=(Button) findViewById(R.id.permission_btn);
        permission_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.frame_btn:
                startActivity(new Intent(MainActivity.this,HomeAcivity.class));
                break;
            case R.id.permission_btn:
                startActivity(new Intent(MainActivity.this,permissionActivity.class));
                break;
        }
    }
}
