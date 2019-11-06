package com.farm.smart.repository.impl;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class InventaryRepositoryImpl{

	/*BCP-dbconfig*/
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
	/*ECP-dbconfig*/

    public DBCollection ListAll() {
        DB database = mongoClient.getDB("farm");
        DBCollection collection = database.getCollection("Inventary");
        return collection;
    }
}
