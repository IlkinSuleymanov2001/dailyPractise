package com.accessbank.converter.json;

import com.accessbank.models.TransferDetails;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public final class JsonConverter {


    // Method to convert JSONObject to Person class
    public static List<TransferDetails> jsonObjectToTransferDetails(List<String> jsonObjects) {
        List<TransferDetails> transferDetailsList = new ArrayList<>();



        for (String  json : jsonObjects) {
            JSONObject jsonObject = new JSONObject(json);
            TransferDetails transferDetails = new TransferDetails();
            transferDetails.setDocName(jsonObject.optString("docName"));
            transferDetails.setNote(jsonObject.optString("note"));
            transferDetails.setDocText(jsonObject.optString("docText"));
            transferDetails.setAmount(jsonObject.optInt("amount"));

            transferDetailsList.add(transferDetails);
        }
        return transferDetailsList;
    }

    private JsonConverter(){}
}
