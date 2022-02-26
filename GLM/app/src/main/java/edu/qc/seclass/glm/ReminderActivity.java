package edu.qc.seclass.glm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ReminderActivity extends AppCompatActivity {
    private EditText nameEditText, typeEditText, dateEditText, timeEditText;
    private Button reminderFormButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder2);

        nameEditText = findViewById(R.id.activity_reminder_nameEditText);
        typeEditText = findViewById(R.id.activity_reminder_typeEditText);
        dateEditText = findViewById(R.id.activity_reminder_dateEditText);
        timeEditText = findViewById(R.id.activity_reminder_timeEditText);
        reminderFormButton = findViewById(R.id.activity_reminder_submitButton);

        reminderFormButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nameEditText.getText().length() > 0 && typeEditText.getText().length() > 0
                        && dateEditText.getText().length() > 0 && timeEditText.getText().length() > 0){
                    String toastMSG = "Reminder name: " + nameEditText.getText() + ", "
                            + "reminder type: " + typeEditText.getText() + ", "
                            + "reminder date: " + dateEditText.getText() + ", "
                            + "reminder time: " + timeEditText.getText();
                    Toast.makeText(getApplicationContext(), toastMSG, Toast.LENGTH_SHORT).show();
                }
                else{
                    String toastMSG = "Please fill out the form";
                    Toast.makeText(getApplicationContext(), toastMSG, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}