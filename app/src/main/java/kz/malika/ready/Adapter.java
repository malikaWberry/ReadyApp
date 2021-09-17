package kz.malika.ready;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    private ArrayList<Model> mModels;

    public static class Holder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public RatingBar mDiffBar;
        public RatingBar mLevelBar;

        public Holder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.titleTextView);
            mDiffBar = itemView.findViewById(R.id.diffRatingBar);
            mLevelBar = itemView.findViewById(R.id.levelRatingBar);
        }
    }

    public Adapter(ArrayList<Model> models) {
        mModels = models;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v  = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        Holder evh = new Holder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Model currentModel = mModels.get(position);
        holder.mTextView.setText(currentModel.getTitle());
        holder.mDiffBar.setRating(currentModel.getDiff());
        holder.mLevelBar.setRating(currentModel.getLevel());
    }

    @Override
    public int getItemCount() {
        return mModels.size();
    }

}