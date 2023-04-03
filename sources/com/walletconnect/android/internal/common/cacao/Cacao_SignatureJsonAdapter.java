package com.walletconnect.android.internal.common.cacao;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.internal.common.cacao.Cacao;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/cacao/Cacao_SignatureJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Signature;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "b", "Lcom/squareup/moshi/d;", "stringAdapter", "c", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "d", "Ljava/lang/reflect/Constructor;", "constructorRef", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Cacao_SignatureJsonAdapter.kt */
public final class Cacao_SignatureJsonAdapter extends C5391d<Cacao.Signature> {

    /* renamed from: a */
    public final JsonReader.C5372b f27096a;

    /* renamed from: b */
    public final C5391d<String> f27097b;

    /* renamed from: c */
    public final C5391d<String> f27098c;

    /* renamed from: d */
    public volatile Constructor<Cacao.Signature> f27099d;

    public Cacao_SignatureJsonAdapter(C5401h hVar) {
        Class<String> cls = String.class;
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("t", "s", "m");
        vx2.m53590f(a, "of(\"t\", \"s\", \"m\")");
        this.f27096a = a;
        C5391d<String> f = hVar.mo39411f(cls, ny5.m49095e(), "t");
        vx2.m53590f(f, "moshi.adapter(String::cl…a, emptySet(),\n      \"t\")");
        this.f27097b = f;
        C5391d<String> f2 = hVar.mo39411f(cls, ny5.m49095e(), "m");
        vx2.m53590f(f2, "moshi.adapter(String::cl…a,\n      emptySet(), \"m\")");
        this.f27098c = f2;
    }

    /* renamed from: k */
    public Cacao.Signature mo39346b(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        vx2.m53591g(jsonReader2, "reader");
        jsonReader.mo39276b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader2.mo39295z(this.f27096a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                str = this.f27097b.mo39346b(jsonReader2);
                if (str == null) {
                    JsonDataException v = t67.m52121v("t", "t", jsonReader2);
                    vx2.m53590f(v, "unexpectedNull(\"t\", \"t\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                str2 = this.f27097b.mo39346b(jsonReader2);
                if (str2 == null) {
                    JsonDataException v2 = t67.m52121v("s", "s", jsonReader2);
                    vx2.m53590f(v2, "unexpectedNull(\"s\", \"s\", reader)");
                    throw v2;
                }
            } else if (z == 2) {
                str3 = this.f27098c.mo39346b(jsonReader2);
                i &= -5;
            }
        }
        jsonReader.mo39278d();
        if (i != -5) {
            Constructor<Cacao.Signature> constructor = this.f27099d;
            if (constructor == null) {
                constructor = Cacao.Signature.class.getDeclaredConstructor(new Class[]{cls, cls, cls, Integer.TYPE, t67.f34130c});
                this.f27099d = constructor;
                vx2.m53590f(constructor, "Cacao.Signature::class.j…his.constructorRef = it }");
            }
            Object[] objArr = new Object[5];
            if (str != null) {
                objArr[0] = str;
                if (str2 != null) {
                    objArr[1] = str2;
                    objArr[2] = str3;
                    objArr[3] = Integer.valueOf(i);
                    objArr[4] = null;
                    Cacao.Signature newInstance = constructor.newInstance(objArr);
                    vx2.m53590f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                JsonDataException n = t67.m52113n("s", "s", jsonReader2);
                vx2.m53590f(n, "missingProperty(\"s\", \"s\", reader)");
                throw n;
            }
            JsonDataException n2 = t67.m52113n("t", "t", jsonReader2);
            vx2.m53590f(n2, "missingProperty(\"t\", \"t\", reader)");
            throw n2;
        } else if (str == null) {
            JsonDataException n3 = t67.m52113n("t", "t", jsonReader2);
            vx2.m53590f(n3, "missingProperty(\"t\", \"t\", reader)");
            throw n3;
        } else if (str2 != null) {
            return new Cacao.Signature(str, str2, str3);
        } else {
            JsonDataException n4 = t67.m52113n("s", "s", jsonReader2);
            vx2.m53590f(n4, "missingProperty(\"s\", \"s\", reader)");
            throw n4;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, Cacao.Signature signature) {
        vx2.m53591g(q73, "writer");
        if (signature != null) {
            q73.mo39394c();
            q73.mo39399j("t");
            this.f27097b.mo39347j(q73, signature.getT());
            q73.mo39399j("s");
            this.f27097b.mo39347j(q73, signature.getS());
            q73.mo39399j("m");
            this.f27098c.mo39347j(q73, signature.getM());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Cacao.Signature");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
