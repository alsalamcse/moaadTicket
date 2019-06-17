package com.moaadticket.moaadticket;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;


public class NumberedAdapter extends RecyclerView.Adapter<NumberedAdapter.ViewHolder> {
    private List<String> labels;
    private DatabaseReference ref;
    private FirebaseUser user;



    public NumberedAdapter(int count) {
        labels = new ArrayList<>(count);
        for (int i = 0; i < count; ++i) {
            labels.add(String.valueOf(i));
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final String label = labels.get(position);
        holder.textView.setText(label);

        //handling item click event
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.textView.getContext(), label, Toast.LENGTH_SHORT).show();
                user = FirebaseAuth.getInstance().getCurrentUser();
                ref = FirebaseDatabase.getInstance().getReference().child("Tickets");

                ref.push().child("new tick").setValue(label+ " " +user.getEmail());

               // ref.setValue(label +" "+ user.getEmail());


                Intent toBuyTickets=new Intent(holder.textView.getContext(),BuyTickets.class);
                toBuyTickets.putExtra("label name" , label);
                holder.textView.getContext().startActivity(toBuyTickets);
            }
        });
    }

    @Override
    public int getItemCount() {
        return labels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text);
        }
    }
}
