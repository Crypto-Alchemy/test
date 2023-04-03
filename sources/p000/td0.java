package p000;

/* renamed from: td0 */
/* compiled from: CharMatcher */
public abstract class td0 implements ku4<Character> {

    /* renamed from: td0$a */
    /* compiled from: CharMatcher */
    public static abstract class C6524a extends td0 {
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return td0.super.mo48061b((Character) obj);
        }
    }

    /* renamed from: td0$b */
    /* compiled from: CharMatcher */
    public static final class C6525b extends C6524a {

        /* renamed from: a */
        public final char f34232a;

        public C6525b(char c) {
            this.f34232a = c;
        }

        /* renamed from: e */
        public boolean mo48063e(char c) {
            if (c == this.f34232a) {
                return true;
            }
            return false;
        }

        public String toString() {
            String a = td0.m52221g(this.f34232a);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(a);
            sb.append("')");
            return sb.toString();
        }
    }

    /* renamed from: td0$c */
    /* compiled from: CharMatcher */
    public static abstract class C6526c extends C6524a {

        /* renamed from: a */
        public final String f34233a;

        public C6526c(String str) {
            this.f34233a = (String) du4.m43691k(str);
        }

        public final String toString() {
            return this.f34233a;
        }
    }

    /* renamed from: td0$d */
    /* compiled from: CharMatcher */
    public static final class C6527d extends C6526c {

        /* renamed from: d */
        public static final C6527d f34234d = new C6527d();

        public C6527d() {
            super("CharMatcher.none()");
        }

        /* renamed from: c */
        public int mo48062c(CharSequence charSequence, int i) {
            du4.m43693m(i, charSequence.length());
            return -1;
        }

        /* renamed from: e */
        public boolean mo48063e(char c) {
            return false;
        }
    }

    /* renamed from: d */
    public static td0 m52219d(char c) {
        return new C6525b(c);
    }

    /* renamed from: f */
    public static td0 m52220f() {
        return C6527d.f34234d;
    }

    /* renamed from: g */
    public static String m52221g(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo48061b(Character ch) {
        return mo48063e(ch.charValue());
    }

    /* renamed from: c */
    public int mo48062c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        du4.m43693m(i, length);
        while (i < length) {
            if (mo48063e(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: e */
    public abstract boolean mo48063e(char c);
}
