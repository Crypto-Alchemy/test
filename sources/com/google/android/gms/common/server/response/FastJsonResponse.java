package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000.if4;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class FastJsonResponse {

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C4038a CREATOR = new C4038a();

        /* renamed from: A */
        public zan f22362A;

        /* renamed from: B */
        public C4037a f22363B;

        /* renamed from: a */
        public final int f22364a;

        /* renamed from: d */
        public final int f22365d;

        /* renamed from: e */
        public final boolean f22366e;

        /* renamed from: g */
        public final int f22367g;

        /* renamed from: k */
        public final boolean f22368k;

        /* renamed from: r */
        public final String f22369r;

        /* renamed from: s */
        public final int f22370s;

        /* renamed from: x */
        public final Class f22371x;

        /* renamed from: y */
        public final String f22372y;

        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaa) {
            this.f22364a = i;
            this.f22365d = i2;
            this.f22366e = z;
            this.f22367g = i3;
            this.f22368k = z2;
            this.f22369r = str;
            this.f22370s = i4;
            if (str2 == null) {
                this.f22371x = null;
                this.f22372y = null;
            } else {
                this.f22371x = SafeParcelResponse.class;
                this.f22372y = str2;
            }
            if (zaa == null) {
                this.f22363B = null;
            } else {
                this.f22363B = zaa.mo30693s1();
            }
        }

        /* renamed from: r1 */
        public int mo30702r1() {
            return this.f22370s;
        }

        /* renamed from: s1 */
        public final zaa mo30703s1() {
            C4037a aVar = this.f22363B;
            if (aVar == null) {
                return null;
            }
            return zaa.m33775r1(aVar);
        }

        public final String toString() {
            if4.C5959a a = if4.m45711c(this).mo43587a("versionCode", Integer.valueOf(this.f22364a)).mo43587a("typeIn", Integer.valueOf(this.f22365d)).mo43587a("typeInArray", Boolean.valueOf(this.f22366e)).mo43587a("typeOut", Integer.valueOf(this.f22367g)).mo43587a("typeOutArray", Boolean.valueOf(this.f22368k)).mo43587a("outputFieldName", this.f22369r).mo43587a("safeParcelFieldId", Integer.valueOf(this.f22370s)).mo43587a("concreteTypeName", mo30706v1());
            Class cls = this.f22371x;
            if (cls != null) {
                a.mo43587a("concreteType.class", cls.getCanonicalName());
            }
            C4037a aVar = this.f22363B;
            if (aVar != null) {
                a.mo43587a("converterName", aVar.getClass().getCanonicalName());
            }
            return a.toString();
        }

        /* renamed from: u1 */
        public final Object mo30705u1(Object obj) {
            cu4.m43221k(this.f22363B);
            return this.f22363B.mo30690D0(obj);
        }

        /* renamed from: v1 */
        public final String mo30706v1() {
            String str = this.f22372y;
            if (str == null) {
                return null;
            }
            return str;
        }

        /* renamed from: w1 */
        public final Map mo30707w1() {
            cu4.m43221k(this.f22372y);
            cu4.m43221k(this.f22362A);
            return (Map) cu4.m43221k(this.f22362A.mo30724s1(this.f22372y));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = rk5.m51125a(parcel);
            rk5.m51137m(parcel, 1, this.f22364a);
            rk5.m51137m(parcel, 2, this.f22365d);
            rk5.m51127c(parcel, 3, this.f22366e);
            rk5.m51137m(parcel, 4, this.f22367g);
            rk5.m51127c(parcel, 5, this.f22368k);
            rk5.m51143s(parcel, 6, this.f22369r, false);
            rk5.m51137m(parcel, 7, mo30702r1());
            rk5.m51143s(parcel, 8, mo30706v1(), false);
            rk5.m51142r(parcel, 9, mo30703s1(), i, false);
            rk5.m51126b(parcel, a);
        }

        /* renamed from: x1 */
        public final void mo30709x1(zan zan) {
            this.f22362A = zan;
        }

        /* renamed from: y1 */
        public final boolean mo30710y1() {
            return this.f22363B != null;
        }
    }

    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface C4037a<I, O> {
        /* renamed from: D0 */
        Object mo30690D0(Object obj);
    }

    /* renamed from: f */
    public static final Object m33777f(Field field, Object obj) {
        if (field.f22363B != null) {
            return field.mo30705u1(obj);
        }
        return obj;
    }

    /* renamed from: g */
    public static final void m33778g(StringBuilder sb, Field field, Object obj) {
        int i = field.f22365d;
        if (i == 11) {
            Class cls = field.f22371x;
            cu4.m43221k(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else if (i == 7) {
            sb.append("\"");
            sb.append(j73.m46161a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo30696a();

    /* renamed from: b */
    public Object mo30697b(Field field) {
        boolean z;
        String str = field.f22369r;
        if (field.f22371x == null) {
            return mo30698c(str);
        }
        if (mo30698c(str) == null) {
            z = true;
        } else {
            z = false;
        }
        cu4.m43227q(z, "Concrete field shouldn't be value object: %s", field.f22369r);
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public abstract Object mo30698c(String str);

    /* renamed from: d */
    public boolean mo30699d(Field field) {
        if (field.f22367g != 11) {
            return mo30700e(field.f22369r);
        }
        if (field.f22368k) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* renamed from: e */
    public abstract boolean mo30700e(String str);

    public String toString() {
        Map<String, Field<?, ?>> a = mo30696a();
        StringBuilder sb = new StringBuilder(100);
        for (String next : a.keySet()) {
            Field field = a.get(next);
            if (mo30699d(field)) {
                Object f = m33777f(field, mo30697b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(next);
                sb.append("\":");
                if (f != null) {
                    switch (field.f22367g) {
                        case 8:
                            sb.append("\"");
                            sb.append(C6585ux.m53029a((byte[]) f));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(C6585ux.m53030b((byte[]) f));
                            sb.append("\"");
                            break;
                        case 10:
                            tn3.m52382a(sb, (HashMap) f);
                            break;
                        default:
                            if (!field.f22366e) {
                                m33778g(sb, field, f);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) f;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m33778g(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
