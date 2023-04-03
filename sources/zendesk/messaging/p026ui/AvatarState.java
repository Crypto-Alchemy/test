package zendesk.messaging.p026ui;

/* renamed from: zendesk.messaging.ui.AvatarState */
class AvatarState {
    private final String avatarLetter;
    private final Integer avatarRes;
    private final String avatarUrl;
    private final Object uniqueIdentifier;

    public AvatarState(Object obj, String str, String str2, Integer num) {
        this.uniqueIdentifier = obj;
        this.avatarLetter = str;
        this.avatarUrl = str2;
        this.avatarRes = num;
    }

    public String getAvatarLetter() {
        return this.avatarLetter;
    }

    public Integer getAvatarRes() {
        return this.avatarRes;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public Object getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }
}
