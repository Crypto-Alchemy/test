package wallet.core.jni;

public enum HDVersion {
    NONE(0),
    XPUB(76067358),
    XPRV(76066276),
    YPUB(77429938),
    YPRV(77428856),
    ZPUB(78792518),
    ZPRV(78791436),
    LTUB(27108450),
    LTPV(27106558),
    MTUB(28471030),
    MTPV(28469138),
    DPUB(50178342),
    DPRV(50177256),
    DGUB(49990397),
    DGPV(49988504);
    
    private final int value;

    private HDVersion(int i) {
        this.value = i;
    }

    public static HDVersion createFromValue(int i) {
        switch (i) {
            case 0:
                return NONE;
            case 27106558:
                return LTPV;
            case 27108450:
                return LTUB;
            case 28469138:
                return MTPV;
            case 28471030:
                return MTUB;
            case 49988504:
                return DGPV;
            case 49990397:
                return DGUB;
            case 50177256:
                return DPRV;
            case 50178342:
                return DPUB;
            case 76066276:
                return XPRV;
            case 76067358:
                return XPUB;
            case 77428856:
                return YPRV;
            case 77429938:
                return YPUB;
            case 78791436:
                return ZPRV;
            case 78792518:
                return ZPUB;
            default:
                return null;
        }
    }

    public native boolean isPrivate();

    public native boolean isPublic();

    public int value() {
        return this.value;
    }
}
