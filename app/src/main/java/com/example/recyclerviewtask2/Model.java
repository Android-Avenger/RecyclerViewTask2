package com.example.recyclerviewtask2;

public class Model {

    String id;
    String name;
    String phone;
    String wallet;

    public Model(String id, String name, String phone, String wallet) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.wallet = wallet;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getPhone() {
        return phone;
    }


    public String getWallet() {
        return wallet;
    }

}


