package p000;

/* renamed from: qo4 */
/* compiled from: PingStore */
public class qo4 {

    /* renamed from: a */
    public int f16996a = 0;

    /* renamed from: b */
    public String f16997b = null;

    /* renamed from: c */
    public String[] f16998c = new String[100];

    /* renamed from: d */
    public String[] f16999d = new String[100];

    /* renamed from: a */
    public int mo25187a(String str, String str2) {
        Boolean bool = Boolean.FALSE;
        int i = 0;
        while (true) {
            if (i >= this.f16996a) {
                break;
            } else if (this.f16998c[i].equals(str)) {
                this.f16999d[i] = str2;
                bool = Boolean.TRUE;
                break;
            } else {
                i++;
            }
        }
        if (!bool.booleanValue()) {
            String[] strArr = this.f16998c;
            int i2 = this.f16996a;
            strArr[i2] = str;
            String[] strArr2 = this.f16999d;
            this.f16996a = i2 + 1;
            strArr2[i2] = str2;
        }
        return this.f16996a + 1;
    }

    /* renamed from: b */
    public String mo25188b(String str) {
        for (int i = 0; i <= this.f16996a; i++) {
            if (this.f16998c[i].equals(str)) {
                return this.f16999d[i];
            }
        }
        return "null";
    }
}
