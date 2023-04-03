package com.walletconnect.android.internal.common.model;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/AppMetaDataJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "b", "Lcom/squareup/moshi/d;", "stringAdapter", "", "c", "listOfStringAdapter", "Lcom/walletconnect/android/internal/common/model/Redirect;", "d", "nullableRedirectAdapter", "Ljava/lang/reflect/Constructor;", "e", "Ljava/lang/reflect/Constructor;", "constructorRef", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AppMetaDataJsonAdapter.kt */
public final class AppMetaDataJsonAdapter extends C5391d<AppMetaData> {

    /* renamed from: a */
    public final JsonReader.C5372b f27123a;

    /* renamed from: b */
    public final C5391d<String> f27124b;

    /* renamed from: c */
    public final C5391d<List<String>> f27125c;

    /* renamed from: d */
    public final C5391d<Redirect> f27126d;

    /* renamed from: e */
    public volatile Constructor<AppMetaData> f27127e;

    public AppMetaDataJsonAdapter(C5401h hVar) {
        Class<String> cls = String.class;
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a(PublicResolver.FUNC_NAME, "description", "url", "icons", "redirect");
        vx2.m53590f(a, "of(\"name\", \"description\"…     \"icons\", \"redirect\")");
        this.f27123a = a;
        C5391d<String> f = hVar.mo39411f(cls, ny5.m49095e(), PublicResolver.FUNC_NAME);
        vx2.m53590f(f, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.f27124b = f;
        C5391d<List<String>> f2 = hVar.mo39411f(u27.m52594j(List.class, cls), ny5.m49095e(), "icons");
        vx2.m53590f(f2, "moshi.adapter(Types.newP…mptySet(),\n      \"icons\")");
        this.f27125c = f2;
        C5391d<Redirect> f3 = hVar.mo39411f(Redirect.class, ny5.m49095e(), "redirect");
        vx2.m53590f(f3, "moshi.adapter(Redirect::…  emptySet(), \"redirect\")");
        this.f27126d = f3;
    }

    /* renamed from: k */
    public AppMetaData mo39346b(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        vx2.m53591g(jsonReader2, "reader");
        jsonReader.mo39276b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        Redirect redirect = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader2.mo39295z(this.f27123a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                str = this.f27124b.mo39346b(jsonReader2);
                if (str == null) {
                    JsonDataException v = t67.m52121v(PublicResolver.FUNC_NAME, PublicResolver.FUNC_NAME, jsonReader2);
                    vx2.m53590f(v, "unexpectedNull(\"name\", \"name\",\n            reader)");
                    throw v;
                }
            } else if (z == 1) {
                str2 = this.f27124b.mo39346b(jsonReader2);
                if (str2 == null) {
                    JsonDataException v2 = t67.m52121v("description", "description", jsonReader2);
                    vx2.m53590f(v2, "unexpectedNull(\"descript…\", \"description\", reader)");
                    throw v2;
                }
            } else if (z == 2) {
                str3 = this.f27124b.mo39346b(jsonReader2);
                if (str3 == null) {
                    JsonDataException v3 = t67.m52121v("url", "url", jsonReader2);
                    vx2.m53590f(v3, "unexpectedNull(\"url\", \"url\", reader)");
                    throw v3;
                }
            } else if (z == 3) {
                list = this.f27125c.mo39346b(jsonReader2);
                if (list == null) {
                    JsonDataException v4 = t67.m52121v("icons", "icons", jsonReader2);
                    vx2.m53590f(v4, "unexpectedNull(\"icons\",\n…         \"icons\", reader)");
                    throw v4;
                }
            } else if (z == 4) {
                redirect = this.f27126d.mo39346b(jsonReader2);
                i &= -17;
            }
        }
        jsonReader.mo39278d();
        Class<String> cls2 = cls;
        if (i != -17) {
            Constructor<AppMetaData> constructor = this.f27127e;
            String str4 = "missingProperty(\"name\", \"name\", reader)";
            int i2 = 7;
            if (constructor == null) {
                constructor = AppMetaData.class.getDeclaredConstructor(new Class[]{cls2, cls2, cls2, List.class, Redirect.class, Integer.TYPE, t67.f34130c});
                this.f27127e = constructor;
                vx2.m53590f(constructor, "AppMetaData::class.java.…his.constructorRef = it }");
                i2 = 7;
            }
            Object[] objArr = new Object[i2];
            if (str != null) {
                objArr[0] = str;
                if (str2 != null) {
                    objArr[1] = str2;
                    if (str3 != null) {
                        objArr[2] = str3;
                        if (list != null) {
                            objArr[3] = list;
                            objArr[4] = redirect;
                            objArr[5] = Integer.valueOf(i);
                            objArr[6] = null;
                            AppMetaData newInstance = constructor.newInstance(objArr);
                            vx2.m53590f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                            return newInstance;
                        }
                        JsonDataException n = t67.m52113n("icons", "icons", jsonReader2);
                        vx2.m53590f(n, "missingProperty(\"icons\", \"icons\", reader)");
                        throw n;
                    }
                    JsonDataException n2 = t67.m52113n("url", "url", jsonReader2);
                    vx2.m53590f(n2, "missingProperty(\"url\", \"url\", reader)");
                    throw n2;
                }
                JsonDataException n3 = t67.m52113n("description", "description", jsonReader2);
                vx2.m53590f(n3, "missingProperty(\"descrip…\", \"description\", reader)");
                throw n3;
            }
            JsonDataException n4 = t67.m52113n(PublicResolver.FUNC_NAME, PublicResolver.FUNC_NAME, jsonReader2);
            vx2.m53590f(n4, str4);
            throw n4;
        } else if (str == null) {
            JsonDataException n5 = t67.m52113n(PublicResolver.FUNC_NAME, PublicResolver.FUNC_NAME, jsonReader2);
            vx2.m53590f(n5, "missingProperty(\"name\", \"name\", reader)");
            throw n5;
        } else if (str2 == null) {
            JsonDataException n6 = t67.m52113n("description", "description", jsonReader2);
            vx2.m53590f(n6, "missingProperty(\"descrip…n\",\n              reader)");
            throw n6;
        } else if (str3 == null) {
            JsonDataException n7 = t67.m52113n("url", "url", jsonReader2);
            vx2.m53590f(n7, "missingProperty(\"url\", \"url\", reader)");
            throw n7;
        } else if (list != null) {
            return new AppMetaData(str, str2, str3, list, redirect);
        } else {
            JsonDataException n8 = t67.m52113n("icons", "icons", jsonReader2);
            vx2.m53590f(n8, "missingProperty(\"icons\", \"icons\", reader)");
            throw n8;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, AppMetaData appMetaData) {
        vx2.m53591g(q73, "writer");
        if (appMetaData != null) {
            q73.mo39394c();
            q73.mo39399j(PublicResolver.FUNC_NAME);
            this.f27124b.mo39347j(q73, appMetaData.mo40311c());
            q73.mo39399j("description");
            this.f27124b.mo39347j(q73, appMetaData.mo40309a());
            q73.mo39399j("url");
            this.f27124b.mo39347j(q73, appMetaData.mo40314e());
            q73.mo39399j("icons");
            this.f27125c.mo39347j(q73, appMetaData.mo40310b());
            q73.mo39399j("redirect");
            this.f27126d.mo39347j(q73, appMetaData.mo40313d());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AppMetaData");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
