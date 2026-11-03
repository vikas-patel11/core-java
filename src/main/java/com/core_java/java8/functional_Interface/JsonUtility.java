package com.core_java.java8.functional_Interface;

import com.google.gson.*;
import java.util.function.Function;

public class JsonUtility {
    private JsonUtility() {}
    public static final Function<JsonElement, JsonObject> getIfJsonObject = jsonElement ->
            jsonElement != null && jsonElement.isJsonObject() ? jsonElement.getAsJsonObject() : new JsonObject();

    public static final Function<JsonElement, JsonPrimitive> getIfJsonPrimitive = jsonElement ->
            jsonElement != null && jsonElement.isJsonPrimitive() ? jsonElement.getAsJsonPrimitive() : new JsonPrimitive("");

    public static final Function<JsonElement, JsonArray> getIfJsonArray = jsonElement ->
            jsonElement != null && jsonElement.isJsonArray() ? jsonElement.getAsJsonArray() : new JsonArray();
}
