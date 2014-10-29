package buildres.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

   private EditText usn,password;
   private TextView cgpa;

   @Override 
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      usn = (EditText)findViewById(R.id.editText1);
      password = (EditText)findViewById(R.id.editText2);
      cgpa = (TextView)findViewById(R.id.textView7);
   }
   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }

   public void login(View view){
      String id = usn.getText().toString();
      String pass = password.getText().toString();
      new Login(this,cgpa).execute(id,pass);

   }

}