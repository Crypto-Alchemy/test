package p000;

/* renamed from: u10 */
/* compiled from: Bip39Wallet */
public class u10 {
    private final String filename;
    private final String mnemonic;

    public u10(String str, String str2) {
        this.filename = str;
        this.mnemonic = str2;
    }

    public String getFilename() {
        return this.filename;
    }

    public String getMnemonic() {
        return this.mnemonic;
    }

    public String toString() {
        return "Bip39Wallet{filename='" + this.filename + '\'' + ", mnemonic='" + this.mnemonic + '\'' + '}';
    }
}
