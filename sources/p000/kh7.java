package p000;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import p000.c73;

/* renamed from: kh7 */
/* compiled from: WalletFile */
public class kh7 {
    private String address;
    private C7347c crypto;

    /* renamed from: id */
    private String f38903id;
    private int version;

    /* renamed from: kh7$a */
    /* compiled from: WalletFile */
    public static class C7345a implements C7348d {

        /* renamed from: c */
        private int f38904c;
        private int dklen;
        private String prf;
        private String salt;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7345a)) {
                return false;
            }
            C7345a aVar = (C7345a) obj;
            if (this.dklen != aVar.dklen || this.f38904c != aVar.f38904c) {
                return false;
            }
            if (getPrf() == null ? aVar.getPrf() != null : !getPrf().equals(aVar.getPrf())) {
                return false;
            }
            if (getSalt() != null) {
                return getSalt().equals(aVar.getSalt());
            }
            if (aVar.getSalt() == null) {
                return true;
            }
            return false;
        }

        public int getC() {
            return this.f38904c;
        }

        public int getDklen() {
            return this.dklen;
        }

        public String getPrf() {
            return this.prf;
        }

        public String getSalt() {
            return this.salt;
        }

        public int hashCode() {
            int i;
            int i2 = ((this.dklen * 31) + this.f38904c) * 31;
            int i3 = 0;
            if (getPrf() != null) {
                i = getPrf().hashCode();
            } else {
                i = 0;
            }
            int i4 = (i2 + i) * 31;
            if (getSalt() != null) {
                i3 = getSalt().hashCode();
            }
            return i4 + i3;
        }

        public void setC(int i) {
            this.f38904c = i;
        }

        public void setDklen(int i) {
            this.dklen = i;
        }

        public void setPrf(String str) {
            this.prf = str;
        }

        public void setSalt(String str) {
            this.salt = str;
        }
    }

    /* renamed from: kh7$b */
    /* compiled from: WalletFile */
    public static class C7346b {

        /* renamed from: iv */
        private String f38905iv;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7346b)) {
                return false;
            }
            C7346b bVar = (C7346b) obj;
            if (getIv() != null) {
                return getIv().equals(bVar.getIv());
            }
            if (bVar.getIv() == null) {
                return true;
            }
            return false;
        }

        public String getIv() {
            return this.f38905iv;
        }

        public int hashCode() {
            if (getIv() != null) {
                return getIv().hashCode();
            }
            return 0;
        }

        public void setIv(String str) {
            this.f38905iv = str;
        }
    }

    /* renamed from: kh7$c */
    /* compiled from: WalletFile */
    public static class C7347c {
        private String cipher;
        private C7346b cipherparams;
        private String ciphertext;
        private String kdf;
        private C7348d kdfparams;
        private String mac;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7347c)) {
                return false;
            }
            C7347c cVar = (C7347c) obj;
            if (getCipher() == null ? cVar.getCipher() != null : !getCipher().equals(cVar.getCipher())) {
                return false;
            }
            if (getCiphertext() == null ? cVar.getCiphertext() != null : !getCiphertext().equals(cVar.getCiphertext())) {
                return false;
            }
            if (getCipherparams() == null ? cVar.getCipherparams() != null : !getCipherparams().equals(cVar.getCipherparams())) {
                return false;
            }
            if (getKdf() == null ? cVar.getKdf() != null : !getKdf().equals(cVar.getKdf())) {
                return false;
            }
            if (getKdfparams() == null ? cVar.getKdfparams() != null : !getKdfparams().equals(cVar.getKdfparams())) {
                return false;
            }
            if (getMac() != null) {
                return getMac().equals(cVar.getMac());
            }
            if (cVar.getMac() == null) {
                return true;
            }
            return false;
        }

        public String getCipher() {
            return this.cipher;
        }

        public C7346b getCipherparams() {
            return this.cipherparams;
        }

        public String getCiphertext() {
            return this.ciphertext;
        }

        public String getKdf() {
            return this.kdf;
        }

        public C7348d getKdfparams() {
            return this.kdfparams;
        }

        public String getMac() {
            return this.mac;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (getCipher() != null) {
                i = getCipher().hashCode();
            } else {
                i = 0;
            }
            int i7 = i * 31;
            if (getCiphertext() != null) {
                i2 = getCiphertext().hashCode();
            } else {
                i2 = 0;
            }
            int i8 = (i7 + i2) * 31;
            if (getCipherparams() != null) {
                i3 = getCipherparams().hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 31;
            if (getKdf() != null) {
                i4 = getKdf().hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 31;
            if (getKdfparams() != null) {
                i5 = getKdfparams().hashCode();
            } else {
                i5 = 0;
            }
            int i11 = (i10 + i5) * 31;
            if (getMac() != null) {
                i6 = getMac().hashCode();
            }
            return i11 + i6;
        }

        public void setCipher(String str) {
            this.cipher = str;
        }

        public void setCipherparams(C7346b bVar) {
            this.cipherparams = bVar;
        }

        public void setCiphertext(String str) {
            this.ciphertext = str;
        }

        public void setKdf(String str) {
            this.kdf = str;
        }

        @JsonTypeInfo(include = JsonTypeInfo.C1971As.EXTERNAL_PROPERTY, property = "kdf", use = JsonTypeInfo.C1972Id.NAME)
        @c73({@c73.C1668a(name = "pbkdf2", value = C7345a.class), @c73.C1668a(name = "scrypt", value = C7349e.class)})
        public void setKdfparams(C7348d dVar) {
            this.kdfparams = dVar;
        }

        public void setMac(String str) {
            this.mac = str;
        }
    }

    /* renamed from: kh7$d */
    /* compiled from: WalletFile */
    public interface C7348d {
        int getDklen();

        String getSalt();
    }

    /* renamed from: kh7$e */
    /* compiled from: WalletFile */
    public static class C7349e implements C7348d {
        private int dklen;

        /* renamed from: n */
        private int f38906n;

        /* renamed from: p */
        private int f38907p;

        /* renamed from: r */
        private int f38908r;
        private String salt;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7349e)) {
                return false;
            }
            C7349e eVar = (C7349e) obj;
            if (this.dklen != eVar.dklen || this.f38906n != eVar.f38906n || this.f38907p != eVar.f38907p || this.f38908r != eVar.f38908r) {
                return false;
            }
            if (getSalt() != null) {
                return getSalt().equals(eVar.getSalt());
            }
            if (eVar.getSalt() == null) {
                return true;
            }
            return false;
        }

        public int getDklen() {
            return this.dklen;
        }

        public int getN() {
            return this.f38906n;
        }

        public int getP() {
            return this.f38907p;
        }

        public int getR() {
            return this.f38908r;
        }

        public String getSalt() {
            return this.salt;
        }

        public int hashCode() {
            int i;
            int i2 = ((((((this.dklen * 31) + this.f38906n) * 31) + this.f38907p) * 31) + this.f38908r) * 31;
            if (getSalt() != null) {
                i = getSalt().hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public void setDklen(int i) {
            this.dklen = i;
        }

        public void setN(int i) {
            this.f38906n = i;
        }

        public void setP(int i) {
            this.f38907p = i;
        }

        public void setR(int i) {
            this.f38908r = i;
        }

        public void setSalt(String str) {
            this.salt = str;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh7)) {
            return false;
        }
        kh7 kh7 = (kh7) obj;
        if (getAddress() == null ? kh7.getAddress() != null : !getAddress().equals(kh7.getAddress())) {
            return false;
        }
        if (getCrypto() == null ? kh7.getCrypto() != null : !getCrypto().equals(kh7.getCrypto())) {
            return false;
        }
        if (getId() == null ? kh7.getId() != null : !getId().equals(kh7.getId())) {
            return false;
        }
        if (this.version == kh7.version) {
            return true;
        }
        return false;
    }

    public String getAddress() {
        return this.address;
    }

    public C7347c getCrypto() {
        return this.crypto;
    }

    public String getId() {
        return this.f38903id;
    }

    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getAddress() != null) {
            i = getAddress().hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        if (getCrypto() != null) {
            i2 = getCrypto().hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        if (getId() != null) {
            i3 = getId().hashCode();
        }
        return ((i5 + i3) * 31) + this.version;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    @JsonSetter("crypto")
    public void setCrypto(C7347c cVar) {
        this.crypto = cVar;
    }

    @JsonSetter("Crypto")
    public void setCryptoV1(C7347c cVar) {
        setCrypto(cVar);
    }

    public void setId(String str) {
        this.f38903id = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
