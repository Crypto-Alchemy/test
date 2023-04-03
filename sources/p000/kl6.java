package p000;

import android.annotation.SuppressLint;
import androidx.room.Index$Order;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0005\t\u000e\u0013\u0017\u001bBC\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u001c"}, mo44877d2 = {"Lkl6;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "name", "", "Lkl6$a;", "b", "Ljava/util/Map;", "columns", "", "Lkl6$c;", "c", "Ljava/util/Set;", "foreignKeys", "Lkl6$e;", "d", "indices", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "e", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: kl6 */
/* compiled from: TableInfo.kt */
public final class kl6 {

    /* renamed from: e */
    public static final C2709b f14173e = new C2709b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final String f14174a;

    /* renamed from: b */
    public final Map<String, C2707a> f14175b;

    /* renamed from: c */
    public final Set<C2710c> f14176c;

    /* renamed from: d */
    public final Set<C2712e> f14177d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u0000 \u001e2\u00020\u0001:\u0001\nB9\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0003R\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\t\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, mo44877d2 = {"Lkl6$a;", "", "other", "", "equals", "", "hashCode", "", "toString", "type", "a", "Ljava/lang/String;", "name", "b", "c", "Z", "notNull", "d", "I", "primaryKeyPosition", "e", "defaultValue", "f", "createdFrom", "g", "getAffinity$annotations", "()V", "affinity", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V", "h", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kl6$a */
    /* compiled from: TableInfo.kt */
    public static final class C2707a {

        /* renamed from: h */
        public static final C2708a f14178h = new C2708a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final String f14179a;

        /* renamed from: b */
        public final String f14180b;

        /* renamed from: c */
        public final boolean f14181c;

        /* renamed from: d */
        public final int f14182d;

        /* renamed from: e */
        public final String f14183e;

        /* renamed from: f */
        public final int f14184f;

        /* renamed from: g */
        public final int f14185g;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\n"}, mo44877d2 = {"Lkl6$a$a;", "", "", "current", "other", "", "b", "a", "<init>", "()V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: kl6$a$a */
        /* compiled from: TableInfo.kt */
        public static final class C2708a {
            public C2708a() {
            }

            public /* synthetic */ C2708a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final boolean mo22392a(String str) {
                boolean z;
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return false;
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        return false;
                    }
                    i++;
                    i3 = i4;
                }
                if (i2 == 0) {
                    return true;
                }
                return false;
            }

            @SuppressLint({"SyntheticAccessor"})
            /* renamed from: b */
            public final boolean mo22393b(String str, String str2) {
                vx2.m53591g(str, "current");
                if (vx2.m53586b(str, str2)) {
                    return true;
                }
                if (!mo22392a(str)) {
                    return false;
                }
                String substring = str.substring(1, str.length() - 1);
                vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return vx2.m53586b(StringsKt__StringsKt.m63090V0(substring).toString(), str2);
            }
        }

        public C2707a(String str, String str2, boolean z, int i, String str3, int i2) {
            vx2.m53591g(str, PublicResolver.FUNC_NAME);
            vx2.m53591g(str2, "type");
            this.f14179a = str;
            this.f14180b = str2;
            this.f14181c = z;
            this.f14182d = i;
            this.f14183e = str3;
            this.f14184f = i2;
            this.f14185g = mo22388a(str2);
        }

        /* renamed from: a */
        public final int mo22388a(String str) {
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            vx2.m53590f(locale, "US");
            String upperCase = str.toUpperCase(locale);
            vx2.m53590f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt__StringsKt.m63081R(upperCase, "INT", false, 2, (Object) null)) {
                return 3;
            }
            if (StringsKt__StringsKt.m63081R(upperCase, "CHAR", false, 2, (Object) null) || StringsKt__StringsKt.m63081R(upperCase, "CLOB", false, 2, (Object) null) || StringsKt__StringsKt.m63081R(upperCase, "TEXT", false, 2, (Object) null)) {
                return 2;
            }
            if (StringsKt__StringsKt.m63081R(upperCase, "BLOB", false, 2, (Object) null)) {
                return 5;
            }
            if (StringsKt__StringsKt.m63081R(upperCase, "REAL", false, 2, (Object) null) || StringsKt__StringsKt.m63081R(upperCase, "FLOA", false, 2, (Object) null) || StringsKt__StringsKt.m63081R(upperCase, "DOUB", false, 2, (Object) null)) {
                return 4;
            }
            return 1;
        }

        public boolean equals(Object obj) {
            String str;
            boolean z;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2707a) || this.f14182d != ((C2707a) obj).f14182d) {
                return false;
            }
            C2707a aVar = (C2707a) obj;
            if (!vx2.m53586b(this.f14179a, aVar.f14179a) || this.f14181c != aVar.f14181c) {
                return false;
            }
            if (this.f14184f == 1 && aVar.f14184f == 2 && (str3 = this.f14183e) != null && !f14178h.mo22393b(str3, aVar.f14183e)) {
                return false;
            }
            if (this.f14184f == 2 && aVar.f14184f == 1 && (str2 = aVar.f14183e) != null && !f14178h.mo22393b(str2, this.f14183e)) {
                return false;
            }
            int i = this.f14184f;
            if (i != 0 && i == aVar.f14184f) {
                if ((str = this.f14183e) == null ? aVar.f14183e == null : f14178h.mo22393b(str, aVar.f14183e)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return false;
                }
            }
            if (this.f14185g == aVar.f14185g) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = ((this.f14179a.hashCode() * 31) + this.f14185g) * 31;
            if (this.f14181c) {
                i = 1231;
            } else {
                i = 1237;
            }
            return ((hashCode + i) * 31) + this.f14182d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.f14179a);
            sb.append("', type='");
            sb.append(this.f14180b);
            sb.append("', affinity='");
            sb.append(this.f14185g);
            sb.append("', notNull=");
            sb.append(this.f14181c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f14182d);
            sb.append(", defaultValue='");
            String str = this.f14183e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, mo44877d2 = {"Lkl6$b;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "tableName", "Lkl6;", "a", "", "CREATED_FROM_DATABASE", "I", "CREATED_FROM_ENTITY", "CREATED_FROM_UNKNOWN", "<init>", "()V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kl6$b */
    /* compiled from: TableInfo.kt */
    public static final class C2709b {
        public C2709b() {
        }

        public /* synthetic */ C2709b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final kl6 mo22394a(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            vx2.m53591g(supportSQLiteDatabase, "database");
            vx2.m53591g(str, "tableName");
            return ll6.m21531f(supportSQLiteDatabase, str);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, mo44877d2 = {"Lkl6$c;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "referenceTable", "b", "onDelete", "c", "onUpdate", "", "d", "Ljava/util/List;", "columnNames", "e", "referenceColumnNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kl6$c */
    /* compiled from: TableInfo.kt */
    public static final class C2710c {

        /* renamed from: a */
        public final String f14186a;

        /* renamed from: b */
        public final String f14187b;

        /* renamed from: c */
        public final String f14188c;

        /* renamed from: d */
        public final List<String> f14189d;

        /* renamed from: e */
        public final List<String> f14190e;

        public C2710c(String str, String str2, String str3, List<String> list, List<String> list2) {
            vx2.m53591g(str, "referenceTable");
            vx2.m53591g(str2, "onDelete");
            vx2.m53591g(str3, "onUpdate");
            vx2.m53591g(list, "columnNames");
            vx2.m53591g(list2, "referenceColumnNames");
            this.f14186a = str;
            this.f14187b = str2;
            this.f14188c = str3;
            this.f14189d = list;
            this.f14190e = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2710c)) {
                return false;
            }
            C2710c cVar = (C2710c) obj;
            if (vx2.m53586b(this.f14186a, cVar.f14186a) && vx2.m53586b(this.f14187b, cVar.f14187b) && vx2.m53586b(this.f14188c, cVar.f14188c) && vx2.m53586b(this.f14189d, cVar.f14189d)) {
                return vx2.m53586b(this.f14190e, cVar.f14190e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f14186a.hashCode() * 31) + this.f14187b.hashCode()) * 31) + this.f14188c.hashCode()) * 31) + this.f14189d.hashCode()) * 31) + this.f14190e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f14186a + "', onDelete='" + this.f14187b + " +', onUpdate='" + this.f14188c + "', columnNames=" + this.f14189d + ", referenceColumnNames=" + this.f14190e + '}';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0002R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\t\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, mo44877d2 = {"Lkl6$d;", "", "other", "", "a", "I", "e", "()I", "id", "d", "getSequence", "sequence", "", "Ljava/lang/String;", "()Ljava/lang/String;", "from", "g", "f", "to", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kl6$d */
    /* compiled from: TableInfo.kt */
    public static final class C2711d implements Comparable<C2711d> {

        /* renamed from: a */
        public final int f14191a;

        /* renamed from: d */
        public final int f14192d;

        /* renamed from: e */
        public final String f14193e;

        /* renamed from: g */
        public final String f14194g;

        public C2711d(int i, int i2, String str, String str2) {
            vx2.m53591g(str, "from");
            vx2.m53591g(str2, "to");
            this.f14191a = i;
            this.f14192d = i2;
            this.f14193e = str;
            this.f14194g = str2;
        }

        /* renamed from: a */
        public int compareTo(C2711d dVar) {
            vx2.m53591g(dVar, "other");
            int i = this.f14191a - dVar.f14191a;
            if (i == 0) {
                return this.f14192d - dVar.f14192d;
            }
            return i;
        }

        /* renamed from: d */
        public final String mo22400d() {
            return this.f14193e;
        }

        /* renamed from: e */
        public final int mo22401e() {
            return this.f14191a;
        }

        /* renamed from: f */
        public final String mo22402f() {
            return this.f14194g;
        }
    }

    public kl6(String str, Map<String, C2707a> map, Set<C2710c> set, Set<C2712e> set2) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(map, "columns");
        vx2.m53591g(set, "foreignKeys");
        this.f14174a = str;
        this.f14175b = map;
        this.f14176c = set;
        this.f14177d = set2;
    }

    /* renamed from: a */
    public static final kl6 m20892a(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return f14173e.mo22394a(supportSQLiteDatabase, str);
    }

    public boolean equals(Object obj) {
        Set<C2712e> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl6)) {
            return false;
        }
        kl6 kl6 = (kl6) obj;
        if (!vx2.m53586b(this.f14174a, kl6.f14174a) || !vx2.m53586b(this.f14175b, kl6.f14175b) || !vx2.m53586b(this.f14176c, kl6.f14176c)) {
            return false;
        }
        Set<C2712e> set2 = this.f14177d;
        if (set2 == null || (set = kl6.f14177d) == null) {
            return true;
        }
        return vx2.m53586b(set2, set);
    }

    public int hashCode() {
        return (((this.f14174a.hashCode() * 31) + this.f14175b.hashCode()) * 31) + this.f14176c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f14174a + "', columns=" + this.f14175b + ", foreignKeys=" + this.f14176c + ", indices=" + this.f14177d + '}';
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\tB3\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0004\b\u0015\u0010\u0016B'\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0004\b\u0015\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0019"}, mo44877d2 = {"Lkl6$e;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "name", "b", "Z", "unique", "", "c", "Ljava/util/List;", "columns", "d", "orders", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;ZLjava/util/List;)V", "e", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kl6$e */
    /* compiled from: TableInfo.kt */
    public static final class C2712e {

        /* renamed from: e */
        public static final C2713a f14195e = new C2713a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final String f14196a;

        /* renamed from: b */
        public final boolean f14197b;

        /* renamed from: c */
        public final List<String> f14198c;

        /* renamed from: d */
        public List<String> f14199d;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lkl6$e$a;", "", "", "DEFAULT_PREFIX", "Ljava/lang/String;", "<init>", "()V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: kl6$e$a */
        /* compiled from: TableInfo.kt */
        public static final class C2713a {
            public C2713a() {
            }

            public /* synthetic */ C2713a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C2712e(String str, boolean z, List<String> list, List<String> list2) {
            vx2.m53591g(str, PublicResolver.FUNC_NAME);
            vx2.m53591g(list, "columns");
            vx2.m53591g(list2, "orders");
            this.f14196a = str;
            this.f14197b = z;
            this.f14198c = list;
            this.f14199d = list2;
            boolean isEmpty = list2.isEmpty();
            ArrayList arrayList = list2;
            if (isEmpty) {
                int size = list.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList2.add(Index$Order.ASC.name());
                }
                arrayList = arrayList2;
            }
            this.f14199d = arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2712e)) {
                return false;
            }
            C2712e eVar = (C2712e) obj;
            if (this.f14197b != eVar.f14197b || !vx2.m53586b(this.f14198c, eVar.f14198c) || !vx2.m53586b(this.f14199d, eVar.f14199d)) {
                return false;
            }
            if (yb6.m74336M(this.f14196a, "index_", false, 2, (Object) null)) {
                return yb6.m74336M(eVar.f14196a, "index_", false, 2, (Object) null);
            }
            return vx2.m53586b(this.f14196a, eVar.f14196a);
        }

        public int hashCode() {
            int i;
            if (yb6.m74336M(this.f14196a, "index_", false, 2, (Object) null)) {
                i = -1184239155;
            } else {
                i = this.f14196a.hashCode();
            }
            return (((((i * 31) + (this.f14197b ? 1 : 0)) * 31) + this.f14198c.hashCode()) * 31) + this.f14199d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f14196a + "', unique=" + this.f14197b + ", columns=" + this.f14198c + ", orders=" + this.f14199d + "'}";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C2712e(java.lang.String r5, boolean r6, java.util.List<java.lang.String> r7) {
            /*
                r4 = this;
                java.lang.String r0 = "name"
                p000.vx2.m53591g(r5, r0)
                java.lang.String r0 = "columns"
                p000.vx2.m53591g(r7, r0)
                int r0 = r7.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
            L_0x0014:
                if (r2 >= r0) goto L_0x0022
                androidx.room.Index$Order r3 = androidx.room.Index$Order.ASC
                java.lang.String r3 = r3.name()
                r1.add(r3)
                int r2 = r2 + 1
                goto L_0x0014
            L_0x0022:
                r4.<init>(r5, r6, r7, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.kl6.C2712e.<init>(java.lang.String, boolean, java.util.List):void");
        }
    }
}
