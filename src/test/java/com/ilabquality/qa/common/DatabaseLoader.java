package com.ilabquality.qa.common;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;

public class DatabaseLoader {

    private static final String MONGO_DB_NAME = "applicant";
    private static final String DB_COLLECTION_NAME = "_candidate";
    private static final String MONGO_DB_URI = "mongodb+srv://tester:ilab@ilabcluster-jopuw.gcp.mongodb.net/applicant?retryWrites=true&w=majority";

    private Document document;
    MongoClient mongoClient;

    public DatabaseLoader(String referenceId) {
        loadDatabase(referenceId);
    }

    private void loadDatabase(String referenceId) {
        try {
            mongoClient = new MongoClient(new MongoClientURI(MONGO_DB_URI));
            MongoDatabase mongoDb = mongoClient.getDatabase(MONGO_DB_NAME);

            MongoCollection<Document> mongoCollection = mongoDb.getCollection(DB_COLLECTION_NAME);
            document = mongoCollection.find(eq("_id", new ObjectId(referenceId))).first();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            mongoClient.close();
        }

    }

    public Document getDocument() {
        return document;
    }

}
