package p000;

import java.util.Arrays;

/* renamed from: vd0 */
/* compiled from: constantValues.kt */
public final class vd0 extends ex2<Character> {
    public vd0(char c) {
        super(Character.valueOf(c));
    }

    /* renamed from: c */
    public final String mo66487c(char c) {
        if (c == 8) {
            return "\\b";
        }
        if (c == 9) {
            return "\\t";
        }
        if (c == 10) {
            return "\\n";
        }
        if (c == 12) {
            return "\\f";
        }
        if (c == 13) {
            return "\\r";
        }
        if (mo66489e(c)) {
            return String.valueOf(c);
        }
        return "?";
    }

    /* renamed from: d */
    public d36 mo50070a(mx3 mx3) {
        vx2.m53591g(mx3, "module");
        d36 u = mx3.mo51535k().mo53181u();
        vx2.m53590f(u, "module.builtIns.charType");
        return u;
    }

    /* renamed from: e */
    public final boolean mo66489e(char c) {
        byte type = (byte) Character.getType(c);
        if (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) {
            return false;
        }
        return true;
    }

    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) mo51739b()).charValue()), mo66487c(((Character) mo51739b()).charValue())}, 2));
        vx2.m53590f(format, "format(this, *args)");
        return format;
    }
}
