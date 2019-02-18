package com.example.vmcdirectory.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vmcdirectory.Model.Patients;
import com.example.vmcdirectory.R;

import java.util.List;

class SearchViewHolder extends RecyclerView.ViewHolder{

    public TextView patient,rn,secretary,room_phone,case_manager,pharmacist,nutritionist,wound;

    public SearchViewHolder(@NonNull View itemView) {
        super(itemView);
        patient = (TextView)itemView.findViewById(R.id.patient);
        rn = (TextView)itemView.findViewById(R.id.rn);
        secretary = (TextView)itemView.findViewById(R.id.secretary);
        room_phone = (TextView)itemView.findViewById(R.id.room_phone);
        case_manager = (TextView)itemView.findViewById(R.id.case_manager);
        pharmacist = (TextView)itemView.findViewById(R.id.pharmacist);
        nutritionist = (TextView)itemView.findViewById(R.id.nutritionist);
        wound = (TextView)itemView.findViewById(R.id.wound);
    }
}

public class SearchAdapter extends RecyclerView.Adapter<SearchViewHolder> {

    private Context context;
    private List<Patients> patients;

    public SearchAdapter(Context context, List<Patients> patients) {
        this.context = context;
        this.patients = patients;
    }

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.layout_item,parent,false);

        return new SearchViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {

        holder.patient.setText(patients.get(position).getPatient());
        holder.rn.setText(patients.get(position).getRn());
        holder.secretary.setText(patients.get(position).getSecretary());
        holder.room_phone.setText(patients.get(position).getRoom_phone());
        holder.case_manager.setText(patients.get(position).getCase_manager());
        holder.pharmacist.setText(patients.get(position).getPharmacist());
        holder.nutritionist.setText(patients.get(position).getNutritionist());
        holder.wound.setText(patients.get(position).getWound());


    }

    @Override
    public int getItemCount() {
        return patients.size();
    }
}
