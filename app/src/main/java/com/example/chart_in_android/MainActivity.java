package com.example.chart_in_android;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    LineChart lineChart;
    PieChart pieChart;
    // colo
    int[] colorClassArray = new int[]{Color.BLACK, Color.GREEN,Color.WHITE,Color.GRAY,Color.RED,Color.CYAN,Color.MAGENTA};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lineChart = findViewById(R.id.chart);
        LineDataSet lineDataSet1 = new LineDataSet(dataValues1(), "Data Set 1");
        LineDataSet lineDataSet2 = new LineDataSet(dataValues2(), "Data Set 1");
        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(lineDataSet1);
        dataSets.add(lineDataSet2);
        LineData data = new LineData(dataSets);
        lineChart.setData(data);
        lineChart.invalidate();
        // circal Chart is here

        pieChart = findViewById(R.id.piechart);
        PieDataSet pieDataSet = new PieDataSet(pieValue1(), "Data set 1");
        pieDataSet.setColors(colorClassArray); // setColors is work
        PieData pieData = new PieData(pieDataSet);
        pieChart.setHoleRadius(0);
        pieChart.setTransparentCircleRadius(0);
        pieChart.setData(pieData);
        pieChart.invalidate();
    }

    private ArrayList<PieEntry> pieValue1() {
        ArrayList<PieEntry> dataValus = new ArrayList<PieEntry>();
        dataValus.add(new PieEntry(10, "Sunday"));
        dataValus.add(new PieEntry(10, "Monday"));
        dataValus.add(new PieEntry(10, "Tuesday"));
        dataValus.add(new PieEntry(10, "Wed"));
        dataValus.add(new PieEntry(10, "Thusday"));
        dataValus.add(new PieEntry(10, "friday"));
        dataValus.add(new PieEntry(10, "Saturday"));
        return dataValus;
    }

    private ArrayList<Entry> dataValues1() {
        ArrayList<Entry> dataVals = new ArrayList<Entry>();
        dataVals.add(new Entry(0, 20));
        dataVals.add(new Entry(1, 10));
        dataVals.add(new Entry(2, 5));
        dataVals.add(new Entry(3, 10));
        return dataVals;
    }

    private ArrayList<Entry> dataValues2() {
        ArrayList<Entry> dataVals = new ArrayList<Entry>();
        dataVals.add(new Entry(0, 3));
        dataVals.add(new Entry(1, 5));
        dataVals.add(new Entry(2, 18));
        dataVals.add(new Entry(3, 89));
        return dataVals;
    }
}