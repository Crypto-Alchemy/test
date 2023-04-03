package p000;

import java.io.File;

/* renamed from: qw7 */
public final class qw7 {

    /* renamed from: a */
    public final File f33285a;

    /* renamed from: b */
    public final String f33286b;

    public qw7() {
    }

    public qw7(File file, String str) {
        this();
        if (file != null) {
            this.f33285a = file;
            if (str != null) {
                this.f33286b = str;
                return;
            }
            throw new NullPointerException("Null splitId");
        }
        throw new NullPointerException("Null splitFile");
    }

    /* renamed from: a */
    public File mo47286a() {
        return this.f33285a;
    }

    /* renamed from: b */
    public String mo47287b() {
        return this.f33286b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qw7) {
            qw7 qw7 = (qw7) obj;
            return this.f33285a.equals(qw7.mo47286a()) && this.f33286b.equals(qw7.mo47287b());
        }
    }

    public int hashCode() {
        return ((this.f33285a.hashCode() ^ 1000003) * 1000003) ^ this.f33286b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f33285a);
        String str = this.f33286b;
        StringBuilder sb = new StringBuilder(valueOf.length() + 35 + str.length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(valueOf);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
