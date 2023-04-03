package com.walletconnect.android.echo.model;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.List;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB1\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/android/echo/model/EchoResponse;", "", "", "Lcom/walletconnect/android/echo/model/EchoResponse$Error;", "errors", "Lcom/walletconnect/android/echo/model/EchoResponse$Field;", "fields", "", "status", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Error", "Field", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@h43(generateAdapter = true)
/* compiled from: EchoResponse.kt */
public final class EchoResponse {

    /* renamed from: a */
    public final List<Error> f27024a;

    /* renamed from: b */
    public final List<Field> f27025b;

    /* renamed from: c */
    public final String f27026c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0005\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lcom/walletconnect/android/echo/model/EchoResponse$Error;", "", "", "message", "name", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: EchoResponse.kt */
    public static final class Error {

        /* renamed from: a */
        public final String f27027a;

        /* renamed from: b */
        public final String f27028b;

        public Error(@y33(name = "message") String str, @y33(name = "name") String str2) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            vx2.m53591g(str2, PublicResolver.FUNC_NAME);
            this.f27027a = str;
            this.f27028b = str2;
        }

        /* renamed from: a */
        public final String mo40116a() {
            return this.f27027a;
        }

        /* renamed from: b */
        public final String mo40117b() {
            return this.f27028b;
        }

        public final Error copy(@y33(name = "message") String str, @y33(name = "name") String str2) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            vx2.m53591g(str2, PublicResolver.FUNC_NAME);
            return new Error(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return vx2.m53586b(this.f27027a, error.f27027a) && vx2.m53586b(this.f27028b, error.f27028b);
        }

        public int hashCode() {
            return (this.f27027a.hashCode() * 31) + this.f27028b.hashCode();
        }

        public String toString() {
            String str = this.f27027a;
            String str2 = this.f27028b;
            return "Error(message=" + str + ", name=" + str2 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, mo44877d2 = {"Lcom/walletconnect/android/echo/model/EchoResponse$Field;", "", "", "description", "field", "location", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: EchoResponse.kt */
    public static final class Field {

        /* renamed from: a */
        public final String f27029a;

        /* renamed from: b */
        public final String f27030b;

        /* renamed from: c */
        public final String f27031c;

        public Field(@y33(name = "description") String str, @y33(name = "field") String str2, @y33(name = "location") String str3) {
            vx2.m53591g(str, "description");
            vx2.m53591g(str2, "field");
            vx2.m53591g(str3, "location");
            this.f27029a = str;
            this.f27030b = str2;
            this.f27031c = str3;
        }

        /* renamed from: a */
        public final String mo40122a() {
            return this.f27029a;
        }

        /* renamed from: b */
        public final String mo40123b() {
            return this.f27030b;
        }

        /* renamed from: c */
        public final String mo40124c() {
            return this.f27031c;
        }

        public final Field copy(@y33(name = "description") String str, @y33(name = "field") String str2, @y33(name = "location") String str3) {
            vx2.m53591g(str, "description");
            vx2.m53591g(str2, "field");
            vx2.m53591g(str3, "location");
            return new Field(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return vx2.m53586b(this.f27029a, field.f27029a) && vx2.m53586b(this.f27030b, field.f27030b) && vx2.m53586b(this.f27031c, field.f27031c);
        }

        public int hashCode() {
            return (((this.f27029a.hashCode() * 31) + this.f27030b.hashCode()) * 31) + this.f27031c.hashCode();
        }

        public String toString() {
            String str = this.f27029a;
            String str2 = this.f27030b;
            String str3 = this.f27031c;
            return "Field(description=" + str + ", field=" + str2 + ", location=" + str3 + ")";
        }
    }

    public EchoResponse(@y33(name = "errors") List<Error> list, @y33(name = "fields") List<Field> list2, @y33(name = "status") String str) {
        vx2.m53591g(list, "errors");
        vx2.m53591g(list2, "fields");
        vx2.m53591g(str, "status");
        this.f27024a = list;
        this.f27025b = list2;
        this.f27026c = str;
    }

    /* renamed from: a */
    public final List<Error> mo40109a() {
        return this.f27024a;
    }

    /* renamed from: b */
    public final List<Field> mo40110b() {
        return this.f27025b;
    }

    /* renamed from: c */
    public final String mo40111c() {
        return this.f27026c;
    }

    public final EchoResponse copy(@y33(name = "errors") List<Error> list, @y33(name = "fields") List<Field> list2, @y33(name = "status") String str) {
        vx2.m53591g(list, "errors");
        vx2.m53591g(list2, "fields");
        vx2.m53591g(str, "status");
        return new EchoResponse(list, list2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EchoResponse)) {
            return false;
        }
        EchoResponse echoResponse = (EchoResponse) obj;
        return vx2.m53586b(this.f27024a, echoResponse.f27024a) && vx2.m53586b(this.f27025b, echoResponse.f27025b) && vx2.m53586b(this.f27026c, echoResponse.f27026c);
    }

    public int hashCode() {
        return (((this.f27024a.hashCode() * 31) + this.f27025b.hashCode()) * 31) + this.f27026c.hashCode();
    }

    public String toString() {
        List<Error> list = this.f27024a;
        List<Field> list2 = this.f27025b;
        String str = this.f27026c;
        return "EchoResponse(errors=" + list + ", fields=" + list2 + ", status=" + str + ")";
    }
}
