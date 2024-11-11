package com.accessbank;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.JSONObject;

import java.util.*;

public final class Parser {

    private static final Gson gson = new Gson();

    private Parser() {
    }

    public static Map<String, List<String>> parseStr(String[] inputArr) {

        List<String> jsonList = new ArrayList<>();
        for (String input : inputArr) {
            String[] inputs = input.split(Properties.fmdelimetir);
            String[] values = inputs[0].split(Properties.vmdelimetir);
            String[] keys = inputs[1].split(Properties.vmdelimetir);
            String json = makeJsonSting(keys, values);
            jsonList.add(json);
        }
        return Collections.singletonMap("transferDocuments", jsonList);
    }

    private static String makeJsonSting(String[] keys, String[] values) {

        checkKeyAndValueLength(keys, values);
        StringBuilder builder = new StringBuilder("{");
        for (int i = 0; i < keys.length; i++) {
            builder.append(keys[i]).append(":\"").append(values[i]).append("\"");
            if (i < keys.length - 1) {
                builder.append(",");
            }
        }
        return builder.append("}").toString();

    }

    private static String makeJsonStingWithJSONObject(String[] keys, String[] values) {
        checkKeyAndValueLength(keys, values);
        JSONObject jsonObject = new JSONObject();
        for (int i = 0; i < keys.length; i++) {
            jsonObject.put(keys[i], values[i]);
        }
        return jsonObject.toString();
    }


    private static String makeJsonStringWithGson(String[] keys, String[] values) {

        checkKeyAndValueLength(keys, values);
        JsonObject jsonObject = new JsonObject();
        for (int i = 0; i < keys.length; i++) {
            jsonObject.addProperty(keys[i], values[i]);
        }

        return gson.toJson(jsonObject);
    }

    private static void checkKeyAndValueLength(String[] keys, String[] values) {
        if (keys == null || values == null || keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be non-null and of the same length.");
        }
    }

}
