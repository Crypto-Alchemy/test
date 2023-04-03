package com.walletconnect.android.pairing.model;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.pairing.model.PairingParams;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/android/pairing/model/PairingParams_DeleteParamsJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/pairing/model/PairingParams$DeleteParams;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "", "b", "Lcom/squareup/moshi/d;", "intAdapter", "c", "stringAdapter", "Ljava/lang/reflect/Constructor;", "d", "Ljava/lang/reflect/Constructor;", "constructorRef", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PairingParams_DeleteParamsJsonAdapter.kt */
public final class PairingParams_DeleteParamsJsonAdapter extends C5391d<PairingParams.DeleteParams> {

    /* renamed from: a */
    public final JsonReader.C5372b f27223a;

    /* renamed from: b */
    public final C5391d<Integer> f27224b;

    /* renamed from: c */
    public final C5391d<String> f27225c;

    /* renamed from: d */
    public volatile Constructor<PairingParams.DeleteParams> f27226d;

    public PairingParams_DeleteParamsJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("code", ThrowableDeserializer.PROP_NAME_MESSAGE);
        vx2.m53590f(a, "of(\"code\", \"message\")");
        this.f27223a = a;
        C5391d<Integer> f = hVar.mo39411f(Integer.TYPE, ny5.m49095e(), "code");
        vx2.m53590f(f, "moshi.adapter(Int::class.java, emptySet(), \"code\")");
        this.f27224b = f;
        C5391d<String> f2 = hVar.mo39411f(String.class, ny5.m49095e(), ThrowableDeserializer.PROP_NAME_MESSAGE);
        vx2.m53590f(f2, "moshi.adapter(String::cl…tySet(),\n      \"message\")");
        this.f27225c = f2;
    }

    /* renamed from: k */
    public PairingParams.DeleteParams mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        Integer num = 0;
        jsonReader.mo39276b();
        int i = -1;
        String str = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27223a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                num = this.f27224b.mo39346b(jsonReader);
                if (num != null) {
                    i &= -2;
                } else {
                    JsonDataException v = t67.m52121v("code", "code", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"code\", \"code\", reader)");
                    throw v;
                }
            } else if (z == 1 && (str = this.f27225c.mo39346b(jsonReader)) == null) {
                JsonDataException v2 = t67.m52121v(ThrowableDeserializer.PROP_NAME_MESSAGE, ThrowableDeserializer.PROP_NAME_MESSAGE, jsonReader);
                vx2.m53590f(v2, "unexpectedNull(\"message\"…       \"message\", reader)");
                throw v2;
            }
        }
        jsonReader.mo39278d();
        if (i == -2) {
            int intValue = num.intValue();
            if (str != null) {
                return new PairingParams.DeleteParams(intValue, str);
            }
            JsonDataException n = t67.m52113n(ThrowableDeserializer.PROP_NAME_MESSAGE, ThrowableDeserializer.PROP_NAME_MESSAGE, jsonReader);
            vx2.m53590f(n, "missingProperty(\"message\", \"message\", reader)");
            throw n;
        }
        Constructor<PairingParams.DeleteParams> constructor = this.f27226d;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = PairingParams.DeleteParams.class.getDeclaredConstructor(new Class[]{cls, String.class, cls, t67.f34130c});
            this.f27226d = constructor;
            vx2.m53590f(constructor, "PairingParams.DeletePara…his.constructorRef = it }");
        }
        Object[] objArr = new Object[4];
        objArr[0] = num;
        if (str != null) {
            objArr[1] = str;
            objArr[2] = Integer.valueOf(i);
            objArr[3] = null;
            PairingParams.DeleteParams newInstance = constructor.newInstance(objArr);
            vx2.m53590f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        JsonDataException n2 = t67.m52113n(ThrowableDeserializer.PROP_NAME_MESSAGE, ThrowableDeserializer.PROP_NAME_MESSAGE, jsonReader);
        vx2.m53590f(n2, "missingProperty(\"message\", \"message\", reader)");
        throw n2;
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, PairingParams.DeleteParams deleteParams) {
        vx2.m53591g(q73, "writer");
        if (deleteParams != null) {
            q73.mo39394c();
            q73.mo39399j("code");
            this.f27224b.mo39347j(q73, Integer.valueOf(deleteParams.mo40507a()));
            q73.mo39399j(ThrowableDeserializer.PROP_NAME_MESSAGE);
            this.f27225c.mo39347j(q73, deleteParams.mo40508b());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(48);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PairingParams.DeleteParams");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
