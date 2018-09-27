package com.tout.tout.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tout.tout.R;
import com.tout.tout.entities.subjects.Subject;

import java.util.List;


public class SubjectsRecyclerAdapter extends RecyclerView.Adapter<SubjectsRecyclerAdapter.ViewHolder> {
    @NonNull
    private final List<Subject> subjects;
    @NonNull
    private final Context context;
    private final LayoutInflater inflater;
    @Nullable
    private final OnItemClickListener clickListener;

    public SubjectsRecyclerAdapter(@NonNull Context context, @NonNull List<Subject> subjects,
                                   @Nullable OnItemClickListener clickListener) {
        this.subjects = subjects;
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.list_item_subject, parent, false), clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Subject actor = subjects.get(position);
        holder.name.setText(actor.getName());
        holder.info.setText(actor.getSubjectInfo());
    }

    public Subject getItem(int position) {
        return subjects.get(position);
    }

    @Override
    public int getItemCount() {
        return subjects.size();
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        final TextView name;
        final TextView info;

        ViewHolder(@NonNull View itemView, @Nullable OnItemClickListener listener) {
            super(itemView);
            itemView.setOnClickListener((view -> {
                int position = getAdapterPosition();
                if (listener != null && position != RecyclerView.NO_POSITION) {
                    listener.onItemClick(position);
                }
            }));

            info = itemView.findViewById(R.id.subject_info);
            name = itemView.findViewById(R.id.subject_name);
        }
    }
}

