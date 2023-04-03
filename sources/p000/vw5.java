package p000;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003B\u001f\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u0014"}, mo44877d2 = {"Lvw5;", "T", "", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "src", "Ljava/lang/reflect/Type;", "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "type", "Lvw5$a;", "c", "Lvw5$a;", "()Lvw5$a;", "context", "<init>", "(Ljava/lang/Object;Ljava/lang/reflect/Type;Lvw5$a;)V", "kotson_main"}, mo44878k = 1, mo44879mv = {1, 4, 0})
/* renamed from: vw5 */
/* compiled from: GsonBuilder.kt */
public final class vw5<T> {

    /* renamed from: a */
    public final T f18913a;

    /* renamed from: b */
    public final Type f18914b;

    /* renamed from: c */
    public final C3513a f18915c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\u0001J1\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u000e\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00070\u0007H\u0001R\u0017\u0010\r\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lvw5$a;", "Lcom/google/gson/JsonSerializationContext;", "", "kotlin.jvm.PlatformType", "p0", "Lcom/google/gson/JsonElement;", "serialize", "Ljava/lang/reflect/Type;", "p1", "a", "Lcom/google/gson/JsonSerializationContext;", "getGsonContext", "()Lcom/google/gson/JsonSerializationContext;", "gsonContext", "<init>", "(Lcom/google/gson/JsonSerializationContext;)V", "kotson_main"}, mo44878k = 1, mo44879mv = {1, 4, 0})
    /* renamed from: vw5$a */
    /* compiled from: GsonBuilder.kt */
    public static final class C3513a implements JsonSerializationContext {

        /* renamed from: a */
        public final JsonSerializationContext f18916a;

        public C3513a(JsonSerializationContext jsonSerializationContext) {
            vx2.m53592h(jsonSerializationContext, "gsonContext");
            this.f18916a = jsonSerializationContext;
        }

        public JsonElement serialize(Object obj) {
            return this.f18916a.serialize(obj);
        }

        public JsonElement serialize(Object obj, Type type) {
            return this.f18916a.serialize(obj, type);
        }
    }

    public vw5(T t, Type type, C3513a aVar) {
        vx2.m53592h(type, "type");
        vx2.m53592h(aVar, "context");
        this.f18913a = t;
        this.f18914b = type;
        this.f18915c = aVar;
    }

    /* renamed from: a */
    public final C3513a mo27349a() {
        return this.f18915c;
    }

    /* renamed from: b */
    public final T mo27350b() {
        return this.f18913a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw5)) {
            return false;
        }
        vw5 vw5 = (vw5) obj;
        return vx2.m53586b(this.f18913a, vw5.f18913a) && vx2.m53586b(this.f18914b, vw5.f18914b) && vx2.m53586b(this.f18915c, vw5.f18915c);
    }

    public int hashCode() {
        T t = this.f18913a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        Type type = this.f18914b;
        int hashCode2 = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        C3513a aVar = this.f18915c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "SerializerArg(src=" + this.f18913a + ", type=" + this.f18914b + ", context=" + this.f18915c + ")";
    }
}
