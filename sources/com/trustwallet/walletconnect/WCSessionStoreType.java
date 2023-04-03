package com.trustwallet.walletconnect;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR(\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028V@VX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/WCSessionStoreType;", "Lcom/trustwallet/walletconnect/WCSessionStore;", "Lcom/trustwallet/walletconnect/WCSessionStoreItem;", "item", "Lr37;", "store", "load", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "getSession", "()Lcom/trustwallet/walletconnect/WCSessionStoreItem;", "setSession", "(Lcom/trustwallet/walletconnect/WCSessionStoreItem;)V", "session", "Lcom/google/gson/GsonBuilder;", "builder", "<init>", "(Landroid/content/SharedPreferences;Lcom/google/gson/GsonBuilder;)V", "Companion", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WCSessionStoreType.kt */
public final class WCSessionStoreType implements WCSessionStore {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String SESSION_KEY = "org.walletconnect.session";
    private final Gson gson;
    private final SharedPreferences sharedPreferences;

    @Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/WCSessionStoreType$Companion;", "", "()V", "SESSION_KEY", "", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: WCSessionStoreType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WCSessionStoreType(SharedPreferences sharedPreferences2, GsonBuilder gsonBuilder) {
        vx2.m53591g(sharedPreferences2, "sharedPreferences");
        vx2.m53591g(gsonBuilder, "builder");
        this.sharedPreferences = sharedPreferences2;
        this.gson = gsonBuilder.serializeNulls().create();
    }

    private final WCSessionStoreItem load() {
        Type type;
        String string = this.sharedPreferences.getString(SESSION_KEY, (String) null);
        if (string == null) {
            return null;
        }
        Gson gson2 = this.gson;
        vx2.m53590f(gson2, "gson");
        Type type2 = new WCSessionStoreType$load$$inlined$fromJson$1().getType();
        vx2.m53587c(type2, "object : TypeToken<T>() {} .type");
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            if (xj2.m30136a(parameterizedType)) {
                type = parameterizedType.getRawType();
                vx2.m53587c(type, "type.rawType");
                Object fromJson = gson2.fromJson(string, type);
                vx2.m53587c(fromJson, "fromJson(json, typeToken<T>())");
                return (WCSessionStoreItem) fromJson;
            }
        }
        type = xj2.m30139d(type2);
        Object fromJson2 = gson2.fromJson(string, type);
        vx2.m53587c(fromJson2, "fromJson(json, typeToken<T>())");
        return (WCSessionStoreItem) fromJson2;
    }

    private final void store(WCSessionStoreItem wCSessionStoreItem) {
        if (wCSessionStoreItem != null) {
            this.sharedPreferences.edit().putString(SESSION_KEY, this.gson.toJson((Object) wCSessionStoreItem)).apply();
        } else {
            this.sharedPreferences.edit().remove(SESSION_KEY).apply();
        }
    }

    public WCSessionStoreItem getSession() {
        return load();
    }

    public void setSession(WCSessionStoreItem wCSessionStoreItem) {
        store(wCSessionStoreItem);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WCSessionStoreType(SharedPreferences sharedPreferences2, GsonBuilder gsonBuilder, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences2, (i & 2) != 0 ? new GsonBuilder() : gsonBuilder);
    }
}
