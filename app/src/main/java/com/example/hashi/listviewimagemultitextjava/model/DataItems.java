package com.example.hashi.listviewimagemultitextjava.model;

    public class DataItems
    {
        private String itemId;
        private String itemName;
        private String Describtion;
        private double price;

        public DataItems() {}

        public DataItems(String itemId, String itemName, String describtion, double price) {
            this.itemId = itemId;
            this.itemName = itemName;
            Describtion = describtion;
            this.price = price;
        }

        public String getItemId() {
            return itemId;
        }

        public void setItemId(String itemId) {
            this.itemId = itemId;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public String getDescribtion() {
            return Describtion;
        }

        public void setDescribtion(String describtion) {
            Describtion = describtion;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "DataItems{" +
                    "itemId='" + itemId + '\'' +
                    ", itemName='" + itemName + '\'' +
                    ", Describtion='" + Describtion + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
