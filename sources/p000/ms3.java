package p000;

import java.util.Comparator;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;

/* renamed from: ms3 */
/* compiled from: MemberComparator */
public class ms3 implements Comparator<d31> {

    /* renamed from: a */
    public static final ms3 f41006a = new ms3();

    /* renamed from: b */
    public static Integer m64451b(d31 d31, d31 d312) {
        int c = m64452c(d312) - m64452c(d31);
        if (c != 0) {
            return Integer.valueOf(c);
        }
        if (dd1.m56797B(d31) && dd1.m56797B(d312)) {
            return 0;
        }
        int e = d31.getName().compareTo(d312.getName());
        if (e != 0) {
            return Integer.valueOf(e);
        }
        return null;
    }

    /* renamed from: c */
    public static int m64452c(d31 d31) {
        if (dd1.m56797B(d31)) {
            return 8;
        }
        if (d31 instanceof C7424b) {
            return 7;
        }
        if (d31 instanceof fx4) {
            if (((fx4) d31).mo51315J() == null) {
                return 6;
            }
            return 5;
        } else if (d31 instanceof C7425c) {
            if (((C7425c) d31).mo51315J() == null) {
                return 4;
            }
            return 3;
        } else if (d31 instanceof if0) {
            return 2;
        } else {
            if (d31 instanceof hz6) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public int compare(d31 d31, d31 d312) {
        Integer b = m64451b(d31, d312);
        if (b != null) {
            return b.intValue();
        }
        return 0;
    }
}
