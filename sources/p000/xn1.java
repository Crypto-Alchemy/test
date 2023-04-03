package p000;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000\"\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0019\u001a\u00020\u0016*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u001d\u001a\u00020\u001a*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0015\u0010 \u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, mo44877d2 = {"Lcom/google/gson/JsonElement;", "", "key", "b", "Lcom/google/gson/JsonObject;", "f", "property", "value", "Lr37;", "a", "Lcom/google/gson/JsonNull;", "Lcom/google/gson/JsonNull;", "getJsonNull", "()Lcom/google/gson/JsonNull;", "jsonNull", "h", "(Lcom/google/gson/JsonElement;)Ljava/lang/String;", "string", "", "d", "(Lcom/google/gson/JsonElement;)I", "int", "", "e", "(Lcom/google/gson/JsonElement;)J", "long", "Lcom/google/gson/JsonArray;", "c", "(Lcom/google/gson/JsonElement;)Lcom/google/gson/JsonArray;", "array", "g", "(Lcom/google/gson/JsonElement;)Lcom/google/gson/JsonObject;", "obj", "kotson_main"}, mo44878k = 2, mo44879mv = {1, 4, 0})
/* renamed from: xn1 */
/* compiled from: Element.kt */
public final class xn1 {

    /* renamed from: a */
    public static final JsonNull f19920a;

    static {
        JsonNull jsonNull = JsonNull.INSTANCE;
        vx2.m53587c(jsonNull, "JsonNull.INSTANCE");
        f19920a = jsonNull;
    }

    /* renamed from: a */
    public static final void m30224a(JsonObject jsonObject, String str, JsonElement jsonElement) {
        vx2.m53592h(jsonObject, "$receiver");
        vx2.m53592h(str, "property");
        jsonObject.add(str, jsonElement);
    }

    /* renamed from: b */
    public static final JsonElement m30225b(JsonElement jsonElement, String str) {
        vx2.m53592h(jsonElement, "$receiver");
        vx2.m53592h(str, "key");
        return m30229f(m30230g(jsonElement), str);
    }

    /* renamed from: c */
    public static final JsonArray m30226c(JsonElement jsonElement) {
        vx2.m53592h(jsonElement, "$receiver");
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        vx2.m53587c(asJsonArray, "asJsonArray");
        return asJsonArray;
    }

    /* renamed from: d */
    public static final int m30227d(JsonElement jsonElement) {
        vx2.m53592h(jsonElement, "$receiver");
        return jsonElement.getAsInt();
    }

    /* renamed from: e */
    public static final long m30228e(JsonElement jsonElement) {
        vx2.m53592h(jsonElement, "$receiver");
        return jsonElement.getAsLong();
    }

    /* renamed from: f */
    public static final JsonElement m30229f(JsonObject jsonObject, String str) {
        vx2.m53592h(jsonObject, "$receiver");
        vx2.m53592h(str, "key");
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new NoSuchElementException("'" + str + "' is not found");
    }

    /* renamed from: g */
    public static final JsonObject m30230g(JsonElement jsonElement) {
        vx2.m53592h(jsonElement, "$receiver");
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        vx2.m53587c(asJsonObject, "asJsonObject");
        return asJsonObject;
    }

    /* renamed from: h */
    public static final String m30231h(JsonElement jsonElement) {
        vx2.m53592h(jsonElement, "$receiver");
        String asString = jsonElement.getAsString();
        vx2.m53587c(asString, "asString");
        return asString;
    }
}
