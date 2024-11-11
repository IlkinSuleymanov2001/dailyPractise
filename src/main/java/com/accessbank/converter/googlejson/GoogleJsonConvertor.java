package com.accessbank.converter.googlejson;

import com.accessbank.models.TransferDetails;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.List;
import java.util.ArrayList;


public final class GoogleJsonConvertor {

        private static final Gson gson = new Gson();

        public static List<TransferDetails> jsonStringToTransferDetails(List<String> jsonStrings) {
            List<TransferDetails> transferDetailsList = new ArrayList<>();

            for (String jsonString : jsonStrings) {
                JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
                TransferDetails transferDetails = gson.fromJson(jsonObject, TransferDetails.class);
                transferDetailsList.add(transferDetails);
            }

            return transferDetailsList;
        }

        private  GoogleJsonConvertor(){}
}
