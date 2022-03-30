package com.example.collegearena;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CreditsAdapter extends RecyclerView.Adapter<CreditsAdapter.CreditVH>{

    List<Credits> creditsList;

    public CreditsAdapter(List<Credits> creditsList) {
        this.creditsList = creditsList;

    }

    @NonNull
    @Override
    public CreditVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new CreditVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CreditVH holder, int position) {

        Credits credits = creditsList.get(position);
        holder.nameTxt.setText(credits.getName());
        holder.creditTxt.setText(credits.getCredit());
        holder.SyllabusTxt.setText(credits.getSyllabus());
        holder.descriptionTxt.setText(credits.getDescription());

        boolean isExpandable = creditsList.get(position).isExpandable();
        holder.expandable_layout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);



    }

    @Override
    public int getItemCount() {
        return creditsList.size();
    }

    public class CreditVH extends RecyclerView.ViewHolder {

        TextView nameTxt,creditTxt,SyllabusTxt,descriptionTxt;
        LinearLayout linearLayout;
        RelativeLayout expandable_layout;

        public CreditVH(@NonNull View itemView) {
            super(itemView);
            nameTxt=itemView.findViewById(R.id.name);
            creditTxt=itemView.findViewById(R.id.credit);
            SyllabusTxt=itemView.findViewById(R.id.syllabus);
            descriptionTxt=itemView.findViewById(R.id.description);

            linearLayout = itemView.findViewById(R.id.linear_layout);
            expandable_layout = itemView.findViewById(R.id.expandable_layout);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Credits credits = creditsList.get(getAdapterPosition());
                    credits.setExpandable(!credits.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });

        }
    }
}


