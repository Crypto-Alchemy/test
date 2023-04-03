package net.safemoon.androidwallet.model.collectible;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/collectible/AssetTrait;", "", "()V", "display_type", "", "getDisplay_type", "()Ljava/lang/String;", "setDisplay_type", "(Ljava/lang/String;)V", "max_value", "getMax_value", "setMax_value", "trait_count", "", "getTrait_count", "()Ljava/lang/Integer;", "setTrait_count", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "trait_type", "getTrait_type", "setTrait_type", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Asset.kt */
public final class AssetTrait {
    private String display_type;
    private String max_value;
    private Integer trait_count;
    private String trait_type;
    private Object value;

    public final String getDisplay_type() {
        return this.display_type;
    }

    public final String getMax_value() {
        return this.max_value;
    }

    public final Integer getTrait_count() {
        return this.trait_count;
    }

    public final String getTrait_type() {
        return this.trait_type;
    }

    public final Object getValue() {
        return this.value;
    }

    public final void setDisplay_type(String str) {
        this.display_type = str;
    }

    public final void setMax_value(String str) {
        this.max_value = str;
    }

    public final void setTrait_count(Integer num) {
        this.trait_count = num;
    }

    public final void setTrait_type(String str) {
        this.trait_type = str;
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this, (Type) AssetTrait.class);
        vx2.m53590f(json, "Gson().toJson(this, AssetTrait::class.java)");
        return json;
    }
}
