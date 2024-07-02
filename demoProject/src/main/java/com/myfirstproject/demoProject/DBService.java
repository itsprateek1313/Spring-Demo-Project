package com.myfirstproject.demoProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    //Without Dependency Injection , Tight Coupling
//    @Autowired
//    DevDB db;
//    @Autowired
//    ProdDB pd;

//    @Autowired
    final private DB db;

    public DBService(DB db){
        this.db = db;
    }

    String getData(){
        return db.getData();
    }



}
