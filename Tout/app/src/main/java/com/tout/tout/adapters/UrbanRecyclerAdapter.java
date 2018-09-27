package com.tout.tout.adapters;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tout.tout.R;
import com.tout.tout.entities.urban.Note;

import java.util.ArrayList;
import java.util.List;

public class UrbanRecyclerAdapter extends RecyclerView.Adapter<UrbanRecyclerAdapter.ViewHolder> {

    private List<Note> items = new ArrayList<>();
    @Nullable
    private final OnItemClickListener clickListener;

    public UrbanRecyclerAdapter(@Nullable OnItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ViewHolder(inflater.inflate(R.layout.list_item_urban, parent, false), clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Note notes = items.get(position);
        holder.word.setText(notes.getWord());
        holder.definition.setText(notes.getDefinition());
    }

    public void replaceWith(List<Note> items) {
        this.items = items;
        notifyDataSetChanged();
    }
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public Note getItem(int position) {
        return items.get(position);
    }
    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView word;
        TextView definition;

        ViewHolder(View itemView, OnItemClickListener listener) {
            super(itemView);
            itemView.setOnClickListener((view -> {
                int position = getAdapterPosition();
                if (listener != null && position != RecyclerView.NO_POSITION) {
                    listener.onItemClick(position);
                }
            }));
            word = itemView.findViewById(R.id.urban_word);
            definition = itemView.findViewById(R.id.urban_def);
        }
    }
}