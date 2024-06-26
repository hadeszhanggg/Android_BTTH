package com.example.lab06;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_b#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_b extends Fragment {
    private ListView listViewHistory;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> historyList;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_b() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_b.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_b newInstance(String param1, String param2) {
        fragment_b fragment = new fragment_b();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        listViewHistory = view.findViewById(R.id.listViewHistory);
        // Khởi tạo adapter và danh sách lịch sử
        historyList = new ArrayList<>();
        adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, historyList);
        listViewHistory.setAdapter(adapter);
        return view;
    }
    public void updateHistory(String history) {
        // Thêm lịch sử mới vào danh sách
        historyList.add(history);

        // Cập nhật danh sách lịch sử trên adapter và hiển thị lên ListView
        adapter.notifyDataSetChanged();
    }
}