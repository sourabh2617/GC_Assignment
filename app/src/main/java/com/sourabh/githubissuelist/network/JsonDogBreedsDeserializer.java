package com.sourabh.githubissuelist.network;

import android.util.Log;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.sourabh.githubissuelist.model.Repository;

import java.lang.reflect.Type;
import java.util.Map;

public class JsonDogBreedsDeserializer implements JsonDeserializer<Repository> {
    @Override
    public Repository deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Repository breeds = new Repository();
//        if (json.isJsonObject()) {
            for (Map.Entry<String, JsonElement> entry : json.getAsJsonObject().entrySet()) {
//                if (entry.getKey().equals("status")) {
                    Log.d("Test", "Primitive: " + entry.getKey() + " = " + entry.getValue().getAsString());
//                    breeds.setStatus(entry.getValue().getAsString());
//                } else if (entry.getKey().equals("message")) {
                    Log.d("Test", "Object: key: " + entry.getKey() + " = " + entry.getValue());
//                    JsonObject jsonObject = entry.getValue().getAsJsonObject();
//                    for (Map.Entry<String, JsonElement> subEntry : jsonObject.entrySet()) {
//                        GitIssue db = new GitIssue();
//                        db.setBreed(subEntry.getKey());
//                        breeds.addBreed(db);
//                    }
//                }
            }
//        }
        return breeds;
    }
}
