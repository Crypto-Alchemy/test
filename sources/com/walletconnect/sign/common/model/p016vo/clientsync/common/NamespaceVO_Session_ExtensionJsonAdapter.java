package com.walletconnect.sign.common.model.p016vo.clientsync.common;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO_Session_ExtensionJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session$Extension;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "", "b", "Lcom/squareup/moshi/d;", "listOfStringAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.sign.common.model.vo.clientsync.common.NamespaceVO_Session_ExtensionJsonAdapter */
/* compiled from: NamespaceVO_Session_ExtensionJsonAdapter.kt */
public final class NamespaceVO_Session_ExtensionJsonAdapter extends C5391d<NamespaceVO.Session.Extension> {

    /* renamed from: a */
    public final JsonReader.C5372b f27539a;

    /* renamed from: b */
    public final C5391d<List<String>> f27540b;

    public NamespaceVO_Session_ExtensionJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("accounts", "methods", "events");
        vx2.m53590f(a, "of(\"accounts\", \"methods\", \"events\")");
        this.f27539a = a;
        C5391d<List<String>> f = hVar.mo39411f(u27.m52594j(List.class, String.class), ny5.m49095e(), "accounts");
        vx2.m53590f(f, "moshi.adapter(Types.newP…ySet(),\n      \"accounts\")");
        this.f27540b = f;
    }

    /* renamed from: k */
    public NamespaceVO.Session.Extension mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        List list = null;
        List list2 = null;
        List list3 = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27539a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                list = this.f27540b.mo39346b(jsonReader);
                if (list == null) {
                    JsonDataException v = t67.m52121v("accounts", "accounts", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"accounts\", \"accounts\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                list2 = this.f27540b.mo39346b(jsonReader);
                if (list2 == null) {
                    JsonDataException v2 = t67.m52121v("methods", "methods", jsonReader);
                    vx2.m53590f(v2, "unexpectedNull(\"methods\"…       \"methods\", reader)");
                    throw v2;
                }
            } else if (z == 2 && (list3 = this.f27540b.mo39346b(jsonReader)) == null) {
                JsonDataException v3 = t67.m52121v("events", "events", jsonReader);
                vx2.m53590f(v3, "unexpectedNull(\"events\",…        \"events\", reader)");
                throw v3;
            }
        }
        jsonReader.mo39278d();
        if (list == null) {
            JsonDataException n = t67.m52113n("accounts", "accounts", jsonReader);
            vx2.m53590f(n, "missingProperty(\"accounts\", \"accounts\", reader)");
            throw n;
        } else if (list2 == null) {
            JsonDataException n2 = t67.m52113n("methods", "methods", jsonReader);
            vx2.m53590f(n2, "missingProperty(\"methods\", \"methods\", reader)");
            throw n2;
        } else if (list3 != null) {
            return new NamespaceVO.Session.Extension(list, list2, list3);
        } else {
            JsonDataException n3 = t67.m52113n("events", "events", jsonReader);
            vx2.m53590f(n3, "missingProperty(\"events\", \"events\", reader)");
            throw n3;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, NamespaceVO.Session.Extension extension) {
        vx2.m53591g(q73, "writer");
        if (extension != null) {
            q73.mo39394c();
            q73.mo39399j("accounts");
            this.f27540b.mo39347j(q73, extension.mo41015a());
            q73.mo39399j("methods");
            this.f27540b.mo39347j(q73, extension.mo41017c());
            q73.mo39399j("events");
            this.f27540b.mo39347j(q73, extension.mo41016b());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NamespaceVO.Session.Extension");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
