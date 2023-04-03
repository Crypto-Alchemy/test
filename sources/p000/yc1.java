package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: yc1 */
/* compiled from: MemberScope.kt */
public final class yc1 {

    /* renamed from: c */
    public static final C9636a f46165c;

    /* renamed from: d */
    public static int f46166d = 1;

    /* renamed from: e */
    public static final int f46167e;

    /* renamed from: f */
    public static final int f46168f;

    /* renamed from: g */
    public static final int f46169g;

    /* renamed from: h */
    public static final int f46170h;

    /* renamed from: i */
    public static final int f46171i;

    /* renamed from: j */
    public static final int f46172j;

    /* renamed from: k */
    public static final int f46173k;

    /* renamed from: l */
    public static final int f46174l;

    /* renamed from: m */
    public static final int f46175m;

    /* renamed from: n */
    public static final int f46176n;

    /* renamed from: o */
    public static final yc1 f46177o;

    /* renamed from: p */
    public static final yc1 f46178p;

    /* renamed from: q */
    public static final yc1 f46179q;

    /* renamed from: r */
    public static final yc1 f46180r;

    /* renamed from: s */
    public static final yc1 f46181s;

    /* renamed from: t */
    public static final yc1 f46182t;

    /* renamed from: u */
    public static final yc1 f46183u;

    /* renamed from: v */
    public static final yc1 f46184v;

    /* renamed from: w */
    public static final yc1 f46185w;

    /* renamed from: x */
    public static final yc1 f46186x;

    /* renamed from: y */
    public static final List<C9636a.C9637a> f46187y;

    /* renamed from: z */
    public static final List<C9636a.C9637a> f46188z;

    /* renamed from: a */
    public final List<xc1> f46189a;

    /* renamed from: b */
    public final int f46190b;

    /* renamed from: yc1$a */
    /* compiled from: MemberScope.kt */
    public static final class C9636a {

        /* renamed from: yc1$a$a */
        /* compiled from: MemberScope.kt */
        public static final class C9637a {

            /* renamed from: a */
            public final int f46191a;

            /* renamed from: b */
            public final String f46192b;

            public C9637a(int i, String str) {
                vx2.m53591g(str, PublicResolver.FUNC_NAME);
                this.f46191a = i;
                this.f46192b = str;
            }

            /* renamed from: a */
            public final int mo67084a() {
                return this.f46191a;
            }

            /* renamed from: b */
            public final String mo67085b() {
                return this.f46192b;
            }
        }

        public C9636a() {
        }

        public /* synthetic */ C9636a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final int mo67075b() {
            return yc1.f46173k;
        }

        /* renamed from: c */
        public final int mo67076c() {
            return yc1.f46174l;
        }

        /* renamed from: d */
        public final int mo67077d() {
            return yc1.f46171i;
        }

        /* renamed from: e */
        public final int mo67078e() {
            return yc1.f46167e;
        }

        /* renamed from: f */
        public final int mo67079f() {
            return yc1.f46170h;
        }

        /* renamed from: g */
        public final int mo67080g() {
            return yc1.f46168f;
        }

        /* renamed from: h */
        public final int mo67081h() {
            return yc1.f46169g;
        }

        /* renamed from: i */
        public final int mo67082i() {
            return yc1.f46172j;
        }

        /* renamed from: j */
        public final int mo67083j() {
            int f = yc1.f46166d;
            yc1.f46166d = yc1.f46166d << 1;
            return f;
        }
    }

    static {
        boolean z;
        C9636a.C9637a aVar;
        yc1 yc1;
        C9636a.C9637a aVar2;
        Class<yc1> cls = yc1.class;
        C9636a aVar3 = new C9636a((DefaultConstructorMarker) null);
        f46165c = aVar3;
        int a = aVar3.mo67083j();
        f46167e = a;
        int a2 = aVar3.mo67083j();
        f46168f = a2;
        int a3 = aVar3.mo67083j();
        f46169g = a3;
        int a4 = aVar3.mo67083j();
        f46170h = a4;
        int a5 = aVar3.mo67083j();
        f46171i = a5;
        int a6 = aVar3.mo67083j();
        f46172j = a6;
        int a7 = aVar3.mo67083j() - 1;
        f46173k = a7;
        int i = a | a2 | a3;
        f46174l = i;
        int i2 = a2 | a5 | a6;
        f46175m = i2;
        int i3 = a5 | a6;
        f46176n = i3;
        f46177o = new yc1(a7, (List) null, 2, (DefaultConstructorMarker) null);
        f46178p = new yc1(i3, (List) null, 2, (DefaultConstructorMarker) null);
        f46179q = new yc1(a, (List) null, 2, (DefaultConstructorMarker) null);
        f46180r = new yc1(a2, (List) null, 2, (DefaultConstructorMarker) null);
        f46181s = new yc1(a3, (List) null, 2, (DefaultConstructorMarker) null);
        f46182t = new yc1(i, (List) null, 2, (DefaultConstructorMarker) null);
        f46183u = new yc1(a4, (List) null, 2, (DefaultConstructorMarker) null);
        f46184v = new yc1(a5, (List) null, 2, (DefaultConstructorMarker) null);
        f46185w = new yc1(a6, (List) null, 2, (DefaultConstructorMarker) null);
        f46186x = new yc1(i2, (List) null, 2, (DefaultConstructorMarker) null);
        Field[] fields = cls.getFields();
        vx2.m53590f(fields, "T::class.java.fields");
        ArrayList<Field> arrayList = new ArrayList<>();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get((Object) null);
            if (obj instanceof yc1) {
                yc1 = (yc1) obj;
            } else {
                yc1 = null;
            }
            if (yc1 != null) {
                int i4 = yc1.f46190b;
                String name = field2.getName();
                vx2.m53590f(name, "field.name");
                aVar2 = new C9636a.C9637a(i4, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        f46187y = arrayList2;
        Field[] fields2 = cls.getFields();
        vx2.m53590f(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList<>();
        for (Object next : arrayList3) {
            if (vx2.m53586b(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj2 = field4.get((Object) null);
            vx2.m53589e(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String name2 = field4.getName();
                vx2.m53590f(name2, "field.name");
                aVar = new C9636a.C9637a(intValue, name2);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList5.add(aVar);
            }
        }
        f46188z = arrayList5;
    }

    public yc1(int i, List<? extends xc1> list) {
        vx2.m53591g(list, "excludes");
        this.f46189a = list;
        for (xc1 a : list) {
            i &= ~a.mo66847a();
        }
        this.f46190b = i;
    }

    /* renamed from: a */
    public final boolean mo67068a(int i) {
        if ((i & this.f46190b) != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<yc1> cls2 = yc1.class;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!vx2.m53586b(cls2, cls)) {
            return false;
        }
        vx2.m53589e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        yc1 yc1 = (yc1) obj;
        if (vx2.m53586b(this.f46189a, yc1.f46189a) && this.f46190b == yc1.f46190b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f46189a.hashCode() * 31) + this.f46190b;
    }

    /* renamed from: l */
    public final List<xc1> mo67071l() {
        return this.f46189a;
    }

    /* renamed from: m */
    public final int mo67072m() {
        return this.f46190b;
    }

    /* renamed from: n */
    public final yc1 mo67073n(int i) {
        int i2 = i & this.f46190b;
        if (i2 == 0) {
            return null;
        }
        return new yc1(i2, this.f46189a);
    }

    public String toString() {
        T t;
        String str;
        String str2;
        boolean z;
        Iterator<T> it = f46187y.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C9636a.C9637a) t).mo67084a() == this.f46190b) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C9636a.C9637a aVar = (C9636a.C9637a) t;
        if (aVar != null) {
            str = aVar.mo67085b();
        } else {
            str = null;
        }
        if (str == null) {
            List<C9636a.C9637a> list = f46188z;
            ArrayList arrayList = new ArrayList();
            for (C9636a.C9637a aVar2 : list) {
                if (mo67068a(aVar2.mo67084a())) {
                    str2 = aVar2.mo67085b();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = CollectionsKt___CollectionsKt.m47338i0(arrayList, " | ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null);
        }
        return "DescriptorKindFilter(" + str + ", " + this.f46189a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc1(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? ck0.m33062j() : list);
    }
}
