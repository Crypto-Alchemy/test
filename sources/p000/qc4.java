package p000;

/* renamed from: qc4 */
public class qc4 {

    /* renamed from: a */
    public String f44166a;

    /* renamed from: b */
    public int f44167b = 0;

    public qc4(String str) {
        this.f44166a = str;
    }

    /* renamed from: a */
    public boolean mo65439a() {
        return this.f44167b != -1;
    }

    /* renamed from: b */
    public String mo65440b() {
        int i = this.f44167b;
        if (i == -1) {
            return null;
        }
        int indexOf = this.f44166a.indexOf(46, i);
        if (indexOf == -1) {
            String substring = this.f44166a.substring(this.f44167b);
            this.f44167b = -1;
            return substring;
        }
        String substring2 = this.f44166a.substring(this.f44167b, indexOf);
        this.f44167b = indexOf + 1;
        return substring2;
    }
}
