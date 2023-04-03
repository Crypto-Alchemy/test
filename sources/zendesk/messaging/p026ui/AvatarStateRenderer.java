package zendesk.messaging.p026ui;

import com.squareup.picasso.Picasso;
import zendesk.messaging.R$drawable;

/* renamed from: zendesk.messaging.ui.AvatarStateRenderer */
class AvatarStateRenderer {
    private static final int DEFAULT_AVATAR_DRAWABLE = R$drawable.zui_ic_default_avatar_16;
    private final Picasso picasso;

    public AvatarStateRenderer(Picasso picasso2) {
        this.picasso = picasso2;
    }

    public void render(AvatarState avatarState, AvatarView avatarView) {
        if (kb6.m46949b(avatarState.getAvatarUrl())) {
            avatarView.showImage(this.picasso, avatarState.getAvatarUrl());
        } else if (avatarState.getAvatarRes() != null) {
            avatarView.showDrawable(avatarState.getAvatarRes().intValue());
        } else if (!kb6.m46949b(avatarState.getAvatarLetter()) || !avatarState.getAvatarLetter().matches("[a-zA-Z]")) {
            avatarView.showDefault(DEFAULT_AVATAR_DRAWABLE, avatarState.getUniqueIdentifier());
        } else {
            avatarView.showLetter(avatarState.getAvatarLetter(), avatarState.getUniqueIdentifier());
        }
    }
}
