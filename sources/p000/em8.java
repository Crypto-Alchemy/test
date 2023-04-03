package p000;

/* renamed from: em8 */
public final class em8 {

    /* renamed from: a */
    public final String f28636a;

    /* renamed from: b */
    public int f28637b = 0;

    public em8(String str) {
        this.f28636a = str;
    }

    /* renamed from: a */
    public final boolean mo42328a() {
        return this.f28637b < this.f28636a.length();
    }

    /* renamed from: b */
    public final int mo42329b() {
        String str = this.f28636a;
        int i = this.f28637b;
        this.f28637b = i + 1;
        char charAt = str.charAt(i);
        if (charAt < 55296) {
            return charAt;
        }
        char c = charAt & 8191;
        int i2 = 13;
        while (true) {
            String str2 = this.f28636a;
            int i3 = this.f28637b;
            this.f28637b = i3 + 1;
            char charAt2 = str2.charAt(i3);
            if (charAt2 < 55296) {
                return c | (charAt2 << i2);
            }
            c |= (charAt2 & 8191) << i2;
            i2 += 13;
        }
    }
}
