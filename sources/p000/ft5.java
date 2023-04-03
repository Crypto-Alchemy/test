package p000;

import java.io.Writer;

/* renamed from: ft5 */
/* compiled from: SegmentedStringWriter */
public final class ft5 extends Writer {

    /* renamed from: a */
    public final en6 f12064a;

    public ft5(r40 r40) {
        this.f12064a = new en6(r40);
    }

    /* renamed from: a */
    public String mo20168a() {
        String l = this.f12064a.mo19413l();
        this.f12064a.mo19425x();
        return l;
    }

    public void close() {
    }

    public void flush() {
    }

    public void write(char[] cArr) {
        this.f12064a.mo19404c(cArr, 0, cArr.length);
    }

    public void write(char[] cArr, int i, int i2) {
        this.f12064a.mo19404c(cArr, i, i2);
    }

    public void write(int i) {
        this.f12064a.mo19402a((char) i);
    }

    public Writer append(char c) {
        write((int) c);
        return this;
    }

    public void write(String str) {
        this.f12064a.mo19403b(str, 0, str.length());
    }

    public Writer append(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        this.f12064a.mo19403b(charSequence2, 0, charSequence2.length());
        return this;
    }

    public void write(String str, int i, int i2) {
        this.f12064a.mo19403b(str, i, i2);
    }

    public Writer append(CharSequence charSequence, int i, int i2) {
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        this.f12064a.mo19403b(charSequence2, 0, charSequence2.length());
        return this;
    }
}
