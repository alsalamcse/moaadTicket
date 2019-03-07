package com.moaadticket.moaadticket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class matches_date extends AppCompatActivity {
    private ListView lv1;
    private TaskAdapter taskAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches_date);
        lv1 = (ListView)findViewById(R.id.lv1);
        taskAdapter=new TaskAdapter(this,R.layout.task_item);
        lv1.setAdapter(taskAdapter);

    }
    private void readTasks()
    {
        DatabaseReference reference=FirebaseDatabase.getInstance().getReference();
        reference.child("MyTasks").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Toast.makeText(getBaseContext(),"data changed",Toast.LENGTH_SHORT).show();
                taskAdapter.clear();
                for (DataSnapshot d: dataSnapshot.getChildren())
                {
                    MyTask task=d.getValue(MyTask.class);
                    taskAdapter.add(task);
                }
                taskAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(getBaseContext(),"onCancelled",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
