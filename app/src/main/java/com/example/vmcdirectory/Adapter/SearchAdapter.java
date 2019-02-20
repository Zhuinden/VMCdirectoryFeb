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

import java.util.Collections;
import java.util.List;
public class SearchAdapter
        extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder> {
    private List<Patients> patients = Collections.emptyList();

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.layout_item, parent, false);
        return new SearchViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        Patients patient = patients.get(position);
        holder.bind(patient);
    }

    @Override
    public int getItemCount() {
        return patients != null ? patients.size() : 0;
    }
    
    public void updateData(List<Patients> patients) {
        this.patients = patients;
        notifyDataSetChanged();
    }

    class SearchViewHolder
            extends RecyclerView.ViewHolder {

        public TextView patient, rn, secretary, room_phone, case_manager, pharmacist, nutritionist, wound;

        public SearchViewHolder(@NonNull View itemView) {
            super(itemView);
            patient = (TextView) itemView.findViewById(R.id.patient);
            rn = (TextView) itemView.findViewById(R.id.rn);
            secretary = (TextView) itemView.findViewById(R.id.secretary);
            room_phone = (TextView) itemView.findViewById(R.id.room_phone);
            case_manager = (TextView) itemView.findViewById(R.id.case_manager);
            pharmacist = (TextView) itemView.findViewById(R.id.pharmacist);
            nutritionist = (TextView) itemView.findViewById(R.id.nutritionist);
            wound = (TextView) itemView.findViewById(R.id.wound);
        }
        
        public void bind(Patients patient) {
            this.patient.setText(patient.getPatient());
            rn.setText(patient.getRn());
            secretary.setText(patient.getSecretary());
            room_phone.setText(patient.getRoom_phone());
            case_manager.setText(patient.getCase_manager());
            pharmacist.setText(patient.getPharmacist());
            nutritionist.setText(patient.getNutritionist());
            wound.setText(patient.getWound());
        }
    }
}
