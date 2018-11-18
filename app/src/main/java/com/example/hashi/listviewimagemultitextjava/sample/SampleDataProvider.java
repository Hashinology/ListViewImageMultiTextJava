package com.example.hashi.listviewimagemultitextjava.sample;

import com.example.hashi.listviewimagemultitextjava.model.DataItems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleDataProvider
    {
        public static List<DataItems> mlist;
        public static Map<String, DataItems> map;

        static
        {
            mlist = new ArrayList<>();
            map = new HashMap<>();

            addItem(new DataItems(null, "Quinoa Salmon Salad", "Salads",
                    9.9));
            addItem(new DataItems(null, "Chef's Salad", "Salads",12.80));
            addItem(new DataItems(null, "Mini Cheeseburgers", "Starters",3.80));
            addItem(new DataItems(null, "French Onion Soup", "Starters", 11.43));
            addItem(new DataItems(null, "Artichokes with Garlic Aeoli", "Starters",8.9));
            addItem(new DataItems(null, "Parmesan Deviled Eggs", "Starters",4.6));;
            addItem(new DataItems(null, "Handcrafted Pizza", "Entrees",2.5));
            addItem(new DataItems(null, "Barbecued Tofu Skewers", "Entrees",1.5));
            addItem(new DataItems(null, "Fiesta Family Platter", "Entrees", 5));
            addItem(new DataItems(null, "Crème Brûlée", "Desserts", 3));
            addItem(new DataItems(null, "Cheesecake", "Desserts",2.6));
            addItem(new DataItems(null, "Chocolate Chip Brownie ", "Desserts",3.3));

        }

        public static void addItem(DataItems item)
        {
            mlist.add(item);
            map.put(item.getItemId(), item);
        }
    }
