package p000;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001:\u0001\u0003B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u0014"}, mo44877d2 = {"Lae1;", "", "Lcom/google/gson/JsonElement;", "a", "Lcom/google/gson/JsonElement;", "b", "()Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "type", "Lae1$a;", "c", "Lae1$a;", "()Lae1$a;", "context", "<init>", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lae1$a;)V", "kotson_main"}, mo44878k = 1, mo44879mv = {1, 4, 0})
/* renamed from: ae1 */
/* compiled from: GsonBuilder.kt */
public final class ae1 {

    /* renamed from: a */
    public final JsonElement f104a;

    /* renamed from: b */
    public final Type f105b;

    /* renamed from: c */
    public final C0018a f106c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\t\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\u0010\b\u0000\u0010\u0004*\n \u0003*\u0004\u0018\u00010\u00020\u00022\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052\u000e\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00070\u0007H\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lae1$a;", "Lcom/google/gson/JsonDeserializationContext;", "", "kotlin.jvm.PlatformType", "T", "Lcom/google/gson/JsonElement;", "p0", "Ljava/lang/reflect/Type;", "p1", "deserialize", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "a", "Lcom/google/gson/JsonDeserializationContext;", "()Lcom/google/gson/JsonDeserializationContext;", "gsonContext", "<init>", "(Lcom/google/gson/JsonDeserializationContext;)V", "kotson_main"}, mo44878k = 1, mo44879mv = {1, 4, 0})
    /* renamed from: ae1$a */
    /* compiled from: GsonBuilder.kt */
    public static final class C0018a implements JsonDeserializationContext {

        /* renamed from: a */
        public final JsonDeserializationContext f107a;

        public C0018a(JsonDeserializationContext jsonDeserializationContext) {
            vx2.m53592h(jsonDeserializationContext, "gsonContext");
            this.f107a = jsonDeserializationContext;
        }

        /* renamed from: a */
        public final JsonDeserializationContext mo169a() {
            return this.f107a;
        }

        public <T> T deserialize(JsonElement jsonElement, Type type) {
            return this.f107a.deserialize(jsonElement, type);
        }
    }

    public ae1(JsonElement jsonElement, Type type, C0018a aVar) {
        vx2.m53592h(jsonElement, "json");
        vx2.m53592h(type, "type");
        vx2.m53592h(aVar, "context");
        this.f104a = jsonElement;
        this.f105b = type;
        this.f106c = aVar;
    }

    /* renamed from: a */
    public final C0018a mo164a() {
        return this.f106c;
    }

    /* renamed from: b */
    public final JsonElement mo165b() {
        return this.f104a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae1)) {
            return false;
        }
        ae1 ae1 = (ae1) obj;
        return vx2.m53586b(this.f104a, ae1.f104a) && vx2.m53586b(this.f105b, ae1.f105b) && vx2.m53586b(this.f106c, ae1.f106c);
    }

    public int hashCode() {
        JsonElement jsonElement = this.f104a;
        int i = 0;
        int hashCode = (jsonElement != null ? jsonElement.hashCode() : 0) * 31;
        Type type = this.f105b;
        int hashCode2 = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        C0018a aVar = this.f106c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "DeserializerArg(json=" + this.f104a + ", type=" + this.f105b + ", context=" + this.f106c + ")";
    }
}
