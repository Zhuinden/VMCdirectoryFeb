package com.example.vmcdirectory.Units.west;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import com.example.vmcdirectory.R;
import com.example.vmcdirectory.RecyclerViewAdapter;


public class west1 extends AppCompatActivity {

    private static final String TAG = "west1";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west1);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();

    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://png2.kisspng.com/sh/45e6067b5fd542f36f0e441e041db9b4/L0KzQYm3VMA1N6h8fZH0aYP2gLBuTfNwdaF6jNd7LXTog7y0kBVkepZ5eeRELXBpdrrqhb1kdJp1RdN7dD33db3sjfFzc5Z5gdDwLUXkc4a4VsRmPpc8e6Y9LkG0QYq8VMM1OWY3SqoBNUe3QoW8VscveJ9s/kisspng-computer-desk-secretary-office-clip-art-telemarketing-5ac5164e6f7c44.1119543415228657424567.png");
        mNames.add("Secretary  7-1505");

        mImageUrls.add("https://png2.kisspng.com/sh/d14021817f1bfda25d0a85cf549dbc6e/L0KzQYm3U8I6N5Z6fZH0aYP2gLBuTf52eqRuhtk2c4Tyc7y0kPhwfJDsitN5aImweLF6kPl1aZ0ygNdqbITrPbTokvUudqZ3i9c2NXHlc7eBUcM4bmdoTKs3OEm6QImBU8MyPWM3S6U8N0G4RYO4Wb5xdpg=/kisspng-nursing-stock-photography-hospital-health-care-nurse-5abcf8137f6c49.8970883315223337155219.png");
        mNames.add("Charge Nurse  7-3229");

        mImageUrls.add("https://png2.kisspng.com/sh/5151e53bd7356804ac9ebc741ea0c2aa/L0KzQYm3UsAyN6ppfZH0aYP2gLBuTfp2dpwyftNDLYDkgLb5TgBpd6V0e9H5aXX1Pb7ogBhqdpYyftNDLX3kc7nwjvUuPZI8S9MEMHa0SYaCgccvPWc6SaQDOUW0RYKAVcI6O2YASaI8OD7zfri=/kisspng-junk-fax-paper-photocopier-machine-fax-machine-5a73a90f1959a7.5651289515175293591038.png");
        mNames.add("Fax  7-xxxx");

        mImageUrls.add("https://png2.kisspng.com/sh/18113a15080ea07be1da30012e3f9543/L0KzQYm3U8I5N6J5iZH0aYP2gLBuTfJ2e5pzfeV8cHX1g7F1TgN1d5RwReJxb4Tyd8PokPh6NZN6i9t3ZYP2PbBslQdwepxuRdRAc3nxdcT6TgBmd6FxfZ8AYXLlc4OBVvU4PJJqSZCDNkG0Q4e4U8E2OmM3TaY9N0C8RIi7TwBvbz==/kisspng-businessperson-stock-photography-business-networki-business-people-5abbc286e74ae1.8611361315222544709474.png");
        mNames.add("Case Manager  7-2846/6-3897");

        mImageUrls.add("https://png2.kisspng.com/sh/4ab0ad1375e92233e54a48a68fd169f9/L0KzQYm3U8MyN6ZwiZH0aYP2gLBuTf9xcZDufJ9Ac3WwdLr6jCJlbaMyhddtaXPkfH7qgf5vaZNui594cHnyebW0hgBqbJZyReJybHz2PYbogvYza2I4SqMCYXWzPoW4U8AxOGc7Sac7MkS6SIGCWcE0P2MziNDw/kisspng-opioid-use-disorder-medical-cannabis-opioid-epidem-pills-5abf2c13217ae0.4130006615224780991372.png");
        mNames.add("Pharmacist  7-7900");

        mImageUrls.add("https://png2.kisspng.com/sh/dd5296b9266dfd71188de3812e90be1d/L0KzQYm3UsAzN6p6iZH0aYP2gLBuTfhidZN6itlucj32hMPshgQubpD0fJ98ZXHpf7FrTfZie6UyftH4ZD3ndb3wgBlwfaQyftH4ZD24cYi8UMg0a5Rqedg9MT61Roi9V8Q0PGI6SakBMUm1RoGBVMY3NqFzf3==/kisspng-hamburger-street-food-seafood-fast-food-delicious-food-5a75083cceaf41.2676743415176192608466.png");
        mNames.add("Nutritionist  7-2654/pager.5308");

        mImageUrls.add("https://png2.kisspng.com/sh/c32db0011e6d68db0af3d8707969b6cf/L0KzQYm3VsIzN5tAgZH0aYP2gLBuTfFkfaVqRdVqcnWwfsb5kBUueKNmeAZydHnyfrb5Tf52eqRuhtk2Y3H1dX7vhfFtfJkygtHAcn7kfH72hr11cJYyed9ucnnmcbA0ggN0d5RueeZyb36wf7e0jwVze5YyiORqY4SwRbO5hMQyamFpSdM6NUSxRoG6VMU0Pmo2TaQENkm1RYq5WMU5P191htk=/kisspng-acute-care-nurse-practitioner-nursing-care-health-journal-of-the-american-association-of-nurse-pract-5b2d41b0d1a154.6034536915296925928587.png");
        mNames.add("RN Pods  7-xxxx");

        mImageUrls.add("https://png2.kisspng.com/sh/bda93177156ce74f11433df9ac3a9261/L0KzQYm3U8I1N5Jwj5H0aYP2gLBuTfhmaZ15gJ9sYYLoPb7ojvFobZ5qhuY2cHH3ebb1lL1pd6R1geZqbD3rdbLzlPguaZVyRdZ4Y4TygsS0gf5lNZ96iuVucz24cbO8hMk1OGRoS6o8MT6zSYq8WMQ3QGI6SqMDNkezR4O5VMY4NqFzf3==/kisspng-health-care-management-patient-hospital-health-adm-doctors-and-nurses-5ab5d9403c3831.0995846815218670722467.png");
        mNames.add("Nurse Manager  7-xxxx");

        mImageUrls.add("https://png2.kisspng.com/sh/d37dc08886f08dae3fd8cd8a9769bdcf/L0KzQYm3U8I1N513iZH0aYP2gLBuTfhmaZ15gJ9sYYLoPbnsgfx1cF51itHvZYP2ebF1gfwueJlAi9tsaXHxPbL6kBl0fJJzRdZ4Y4TygsS0gf5lNZ96iuVucz24cbO8hMkzbWY5TNYEMz68RIi6Usc4OmI6SqMDNkezRYW6VMU0NqFzf3==/kisspng-health-care-health-professional-physician-assistan-doctors-and-nurses-5ab5d92e544d93.9473277215218670543453.png");
        mNames.add("NP/PA/Resident Rooms  7-xxxx");

        mImageUrls.add("https://png2.kisspng.com/sh/853f29325d3130c53573c554b7dada8e/L0KzQYm3V8E5N5Rmi5H0aYP2gLBuTgBqdJJ5feU2ZYjogrTwkBUubaJ6geJ2ZX73PcHvmgNqa5JxRdhydH7og8S0kPVze5DzRdRqY3vqgrF8jvQubpp5htd8cz24coXthsRmO2I8TqUCNT67SIaAWcYyP2I6S6MENka5SYK3WcU5NqFzf3==/kisspng-pilates-exercise-equipment-physical-fitness-person-background-fitness-5b4ff4e3176375.8857961715319666910958.png");
        mNames.add("PT/OT office  7-xxxx");

        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}
