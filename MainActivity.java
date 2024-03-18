package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Nama: Abmi Sukma Edri","Nim: 12250120341",R.drawable.a1));
        items.add(new Item("Nama: Ahmad Kurniawan","Nim: 12250111514",R.drawable.b));
        items.add(new Item("Nama: Aufa Hajati","Nim: 12250120338",R.drawable.c));
        items.add(new Item("Nama: Daffa Finanda","Nim: 12250111603",R.drawable.d));
        items.add(new Item("Nama: Daffa Ikhwan Nurfauzan","Nim: 12250110979",R.drawable.e));
        items.add(new Item("Nama: Dwi Jelita Adhaliyah","Nim: 12250120331",R.drawable.f));
        items.add(new Item("Nama: Dwi Mahdini","Nim: 12250111298",R.drawable.g));
        items.add(new Item("Nama: Fajri","Nim: 12250110382",R.drawable.h));
        items.add(new Item("Nama: Fakhri","Nim: 12250111381",R.drawable.i));
        items.add(new Item("Nama: Farras Lathief","Nim: 12250111328",R.drawable.j));
        items.add(new Item("Nama: Gilang Ramadhan Indra","Nim: 12250111323",R.drawable.k));
        items.add(new Item("Nama: Hafidz Alhadid Rahman","Nim: 12250111794",R.drawable.l));
        items.add(new Item("Nama: Haritsah Naufaldy","Nim: 12250110361",R.drawable.m));
        items.add(new Item("Nama: M.Nabil Dawami","Nim: 12250111527",R.drawable.n));
        items.add(new Item("Nama: M.Zaki Erbai Syas","Nim: 12250111134",R.drawable.o));
        items.add(new Item("Nama: M.Aditya Rinaldi","Nim: 12250111048",R.drawable.p));
        items.add(new Item("Nama: M.Dhimas Hadid","Nim: 12250111231",R.drawable.q));
        items.add(new Item("Nama: M.Faruq","Nim: 12250111791",R.drawable.r));
        items.add(new Item("Nama: M.Rafly Wirayudha","Nim: 12250111489",R.drawable.s));
        items.add(new Item("Nama: Nurika Dwi Wahyuni","Nim: 12250120360",R.drawable.t));
        items.add(new Item("Nama: Ogya Secio Nugroho S","Nim: 12250111346",R.drawable.u));
        items.add(new Item("Nama: Rahma Laksita","Nim: 12250124357",R.drawable.v));
        items.add(new Item("Nama: Surya Hidayatullah F","Nim: 12250111759",R.drawable.w));





        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}