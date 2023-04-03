package com.walletconnect.android.internal.common.cacao;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.internal.common.cacao.Cacao;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00160\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012¨\u0006\u001d"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/cacao/Cacao_PayloadJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Payload;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "b", "Lcom/squareup/moshi/d;", "stringAdapter", "c", "nullableStringAdapter", "", "d", "nullableListOfStringAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Cacao_PayloadJsonAdapter.kt */
public final class Cacao_PayloadJsonAdapter extends C5391d<Cacao.Payload> {

    /* renamed from: a */
    public final JsonReader.C5372b f27092a;

    /* renamed from: b */
    public final C5391d<String> f27093b;

    /* renamed from: c */
    public final C5391d<String> f27094c;

    /* renamed from: d */
    public final C5391d<List<String>> f27095d;

    public Cacao_PayloadJsonAdapter(C5401h hVar) {
        Class<String> cls = String.class;
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("iss", "domain", "aud", "version", "nonce", "iat", "nbf", "exp", "statement", "requestId", "resources");
        vx2.m53590f(a, "of(\"iss\", \"domain\", \"aud…\"requestId\", \"resources\")");
        this.f27092a = a;
        C5391d<String> f = hVar.mo39411f(cls, ny5.m49095e(), "iss");
        vx2.m53590f(f, "moshi.adapter(String::cl… emptySet(),\n      \"iss\")");
        this.f27093b = f;
        C5391d<String> f2 = hVar.mo39411f(cls, ny5.m49095e(), "nbf");
        vx2.m53590f(f2, "moshi.adapter(String::cl…\n      emptySet(), \"nbf\")");
        this.f27094c = f2;
        C5391d<List<String>> f3 = hVar.mo39411f(u27.m52594j(List.class, cls), ny5.m49095e(), "resources");
        vx2.m53590f(f3, "moshi.adapter(Types.newP…Set(),\n      \"resources\")");
        this.f27095d = f3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010a, code lost:
        r14 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010c, code lost:
        r13 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010e, code lost:
        r12 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0110, code lost:
        r11 = r19;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.walletconnect.android.internal.common.cacao.Cacao.Payload mo39346b(com.squareup.moshi.JsonReader r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "reader"
            p000.vx2.m53591g(r1, r2)
            r21.mo39276b()
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x0018:
            boolean r2 = r21.mo39280f()
            java.lang.String r3 = "iat"
            java.lang.String r15 = "nonce"
            r16 = r14
            java.lang.String r14 = "version"
            r17 = r13
            java.lang.String r13 = "aud"
            r18 = r12
            java.lang.String r12 = "domain"
            r19 = r11
            java.lang.String r11 = "iss"
            if (r2 == 0) goto L_0x0114
            com.squareup.moshi.JsonReader$b r2 = r0.f27092a
            int r2 = r1.mo39295z(r2)
            switch(r2) {
                case -1: goto L_0x0104;
                case 0: goto L_0x00ee;
                case 1: goto L_0x00d8;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00ac;
                case 4: goto L_0x0096;
                case 5: goto L_0x007f;
                case 6: goto L_0x0074;
                case 7: goto L_0x0064;
                case 8: goto L_0x0055;
                case 9: goto L_0x0048;
                case 10: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x010a
        L_0x003d:
            com.squareup.moshi.d<java.util.List<java.lang.String>> r2 = r0.f27095d
            java.lang.Object r2 = r2.mo39346b(r1)
            r14 = r2
            java.util.List r14 = (java.util.List) r14
            goto L_0x010c
        L_0x0048:
            com.squareup.moshi.d<java.lang.String> r2 = r0.f27094c
            java.lang.Object r2 = r2.mo39346b(r1)
            r13 = r2
            java.lang.String r13 = (java.lang.String) r13
            r14 = r16
            goto L_0x010e
        L_0x0055:
            com.squareup.moshi.d<java.lang.String> r2 = r0.f27094c
            java.lang.Object r2 = r2.mo39346b(r1)
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            r14 = r16
            r13 = r17
            goto L_0x0110
        L_0x0064:
            com.squareup.moshi.d<java.lang.String> r2 = r0.f27094c
            java.lang.Object r2 = r2.mo39346b(r1)
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            r14 = r16
            r13 = r17
            r12 = r18
            goto L_0x0018
        L_0x0074:
            com.squareup.moshi.d<java.lang.String> r2 = r0.f27094c
            java.lang.Object r2 = r2.mo39346b(r1)
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x010a
        L_0x007f:
            com.squareup.moshi.d<java.lang.String> r2 = r0.f27093b
            java.lang.Object r2 = r2.mo39346b(r1)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x008c
            goto L_0x010a
        L_0x008c:
            com.squareup.moshi.JsonDataException r1 = p000.t67.m52121v(r3, r3, r1)
            java.lang.String r2 = "unexpectedNull(\"iat\", \"iat\", reader)"
            p000.vx2.m53590f(r1, r2)
            throw r1
        L_0x0096:
            com.squareup.moshi.d<java.lang.String> r2 = r0.f27093b
            java.lang.Object r2 = r2.mo39346b(r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x00a2
            goto L_0x010a
        L_0x00a2:
            com.squareup.moshi.JsonDataException r1 = p000.t67.m52121v(r15, r15, r1)
            java.lang.String r2 = "unexpectedNull(\"nonce\", …nce\",\n            reader)"
            p000.vx2.m53590f(r1, r2)
            throw r1
        L_0x00ac:
            com.squareup.moshi.d<java.lang.String> r2 = r0.f27093b
            java.lang.Object r2 = r2.mo39346b(r1)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x00b8
            goto L_0x010a
        L_0x00b8:
            com.squareup.moshi.JsonDataException r1 = p000.t67.m52121v(r14, r14, r1)
            java.lang.String r2 = "unexpectedNull(\"version\"…       \"version\", reader)"
            p000.vx2.m53590f(r1, r2)
            throw r1
        L_0x00c2:
            com.squareup.moshi.d<java.lang.String> r2 = r0.f27093b
            java.lang.Object r2 = r2.mo39346b(r1)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00ce
            goto L_0x010a
        L_0x00ce:
            com.squareup.moshi.JsonDataException r1 = p000.t67.m52121v(r13, r13, r1)
            java.lang.String r2 = "unexpectedNull(\"aud\", \"aud\", reader)"
            p000.vx2.m53590f(r1, r2)
            throw r1
        L_0x00d8:
            com.squareup.moshi.d<java.lang.String> r2 = r0.f27093b
            java.lang.Object r2 = r2.mo39346b(r1)
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x00e4
            goto L_0x010a
        L_0x00e4:
            com.squareup.moshi.JsonDataException r1 = p000.t67.m52121v(r12, r12, r1)
            java.lang.String r2 = "unexpectedNull(\"domain\",…        \"domain\", reader)"
            p000.vx2.m53590f(r1, r2)
            throw r1
        L_0x00ee:
            com.squareup.moshi.d<java.lang.String> r2 = r0.f27093b
            java.lang.Object r2 = r2.mo39346b(r1)
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x00fa
            goto L_0x010a
        L_0x00fa:
            com.squareup.moshi.JsonDataException r1 = p000.t67.m52121v(r11, r11, r1)
            java.lang.String r2 = "unexpectedNull(\"iss\", \"iss\", reader)"
            p000.vx2.m53590f(r1, r2)
            throw r1
        L_0x0104:
            r21.mo39272I()
            r21.mo39273J()
        L_0x010a:
            r14 = r16
        L_0x010c:
            r13 = r17
        L_0x010e:
            r12 = r18
        L_0x0110:
            r11 = r19
            goto L_0x0018
        L_0x0114:
            r21.mo39278d()
            com.walletconnect.android.internal.common.cacao.Cacao$Payload r2 = new com.walletconnect.android.internal.common.cacao.Cacao$Payload
            if (r4 == 0) goto L_0x0164
            if (r5 == 0) goto L_0x015a
            if (r6 == 0) goto L_0x0150
            if (r7 == 0) goto L_0x0146
            if (r8 == 0) goto L_0x013c
            if (r9 == 0) goto L_0x0132
            r3 = r2
            r11 = r19
            r12 = r18
            r13 = r17
            r14 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r2
        L_0x0132:
            com.squareup.moshi.JsonDataException r1 = p000.t67.m52113n(r3, r3, r1)
            java.lang.String r2 = "missingProperty(\"iat\", \"iat\", reader)"
            p000.vx2.m53590f(r1, r2)
            throw r1
        L_0x013c:
            com.squareup.moshi.JsonDataException r1 = p000.t67.m52113n(r15, r15, r1)
            java.lang.String r2 = "missingProperty(\"nonce\", \"nonce\", reader)"
            p000.vx2.m53590f(r1, r2)
            throw r1
        L_0x0146:
            com.squareup.moshi.JsonDataException r1 = p000.t67.m52113n(r14, r14, r1)
            java.lang.String r2 = "missingProperty(\"version\", \"version\", reader)"
            p000.vx2.m53590f(r1, r2)
            throw r1
        L_0x0150:
            com.squareup.moshi.JsonDataException r1 = p000.t67.m52113n(r13, r13, r1)
            java.lang.String r2 = "missingProperty(\"aud\", \"aud\", reader)"
            p000.vx2.m53590f(r1, r2)
            throw r1
        L_0x015a:
            com.squareup.moshi.JsonDataException r1 = p000.t67.m52113n(r12, r12, r1)
            java.lang.String r2 = "missingProperty(\"domain\", \"domain\", reader)"
            p000.vx2.m53590f(r1, r2)
            throw r1
        L_0x0164:
            com.squareup.moshi.JsonDataException r1 = p000.t67.m52113n(r11, r11, r1)
            java.lang.String r2 = "missingProperty(\"iss\", \"iss\", reader)"
            p000.vx2.m53590f(r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.android.internal.common.cacao.Cacao_PayloadJsonAdapter.mo39346b(com.squareup.moshi.JsonReader):com.walletconnect.android.internal.common.cacao.Cacao$Payload");
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, Cacao.Payload payload) {
        vx2.m53591g(q73, "writer");
        if (payload != null) {
            q73.mo39394c();
            q73.mo39399j("iss");
            this.f27093b.mo39347j(q73, payload.mo40200e());
            q73.mo39399j("domain");
            this.f27093b.mo39347j(q73, payload.mo40196b());
            q73.mo39399j("aud");
            this.f27093b.mo39347j(q73, payload.mo40195a());
            q73.mo39399j("version");
            this.f27093b.mo39347j(q73, payload.mo40208k());
            q73.mo39399j("nonce");
            this.f27093b.mo39347j(q73, payload.mo40203g());
            q73.mo39399j("iat");
            this.f27093b.mo39347j(q73, payload.mo40199d());
            q73.mo39399j("nbf");
            this.f27094c.mo39347j(q73, payload.mo40202f());
            q73.mo39399j("exp");
            this.f27094c.mo39347j(q73, payload.mo40197c());
            q73.mo39399j("statement");
            this.f27094c.mo39347j(q73, payload.mo40207j());
            q73.mo39399j("requestId");
            this.f27094c.mo39347j(q73, payload.mo40204h());
            q73.mo39399j("resources");
            this.f27095d.mo39347j(q73, payload.mo40206i());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Cacao.Payload");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
