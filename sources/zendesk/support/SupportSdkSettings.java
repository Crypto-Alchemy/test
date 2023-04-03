package zendesk.support;

import java.util.ArrayList;
import java.util.List;
import zendesk.core.AuthenticationType;

public class SupportSdkSettings {
    private final AuthenticationType authenticationType;
    private final HelpCenterSettings helpCenterSettings;
    private final SupportSettings mobileSettings;

    public SupportSdkSettings(SupportSettings supportSettings, HelpCenterSettings helpCenterSettings2, AuthenticationType authenticationType2) {
        this.mobileSettings = supportSettings;
        this.helpCenterSettings = helpCenterSettings2;
        this.authenticationType = authenticationType2;
    }

    private AttachmentSettings getAttachmentSettings() {
        boolean z;
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings == null || supportSettings.getAttachments() == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return this.mobileSettings.getAttachments();
        }
        return null;
    }

    private ConversationsSettings getConversationsSettings() {
        boolean z;
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings == null || supportSettings.getConversations() == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return this.mobileSettings.getConversations();
        }
        return null;
    }

    public AuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    public List<String> getContactZendeskTags() {
        boolean z;
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings == null || supportSettings.getContactUs() == null || !kj0.m47118i(this.mobileSettings.getContactUs().getTags())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return this.mobileSettings.getContactUs().getTags();
        }
        return new ArrayList();
    }

    public String getHelpCenterLocale() {
        boolean z;
        HelpCenterSettings helpCenterSettings2 = this.helpCenterSettings;
        if (helpCenterSettings2 == null || helpCenterSettings2.getLocale() == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return this.helpCenterSettings.getLocale();
        }
        return "";
    }

    public long getMaxAttachmentSize() {
        AttachmentSettings attachmentSettings = getAttachmentSettings();
        if (attachmentSettings != null) {
            return attachmentSettings.getMaxAttachmentSize();
        }
        return 0;
    }

    public String getReferrerUrl() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings == null || !kb6.m46949b(supportSettings.getReferrerUrl())) {
            return "https://www.zendesk.com/embeddables";
        }
        return this.mobileSettings.getReferrerUrl();
    }

    public String getRequestSystemMessage() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings == null || !kb6.m46949b(supportSettings.getSystemMessage())) {
            return "";
        }
        return this.mobileSettings.getSystemMessage();
    }

    public boolean hasHelpCenterSettings() {
        if (this.helpCenterSettings != null) {
            return true;
        }
        return false;
    }

    public boolean isAttachmentsEnabled() {
        AttachmentSettings attachmentSettings = getAttachmentSettings();
        if (attachmentSettings == null || !attachmentSettings.isEnabled()) {
            return false;
        }
        return true;
    }

    public boolean isConversationsEnabled() {
        ConversationsSettings conversationsSettings = getConversationsSettings();
        if (conversationsSettings == null || !conversationsSettings.isEnabled()) {
            return false;
        }
        return true;
    }

    public boolean isHelpCenterArticleVotingEnabled() {
        if (!hasHelpCenterSettings() || !this.helpCenterSettings.isArticleVotingEnabled()) {
            return false;
        }
        return true;
    }

    public boolean isHelpCenterEnabled() {
        HelpCenterSettings helpCenterSettings2 = this.helpCenterSettings;
        if (helpCenterSettings2 == null || !helpCenterSettings2.isEnabled()) {
            return false;
        }
        return true;
    }

    public boolean isNeverAskForEmailEnabled() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings == null || supportSettings.isNeverRequestEmailOn()) {
            return true;
        }
        return false;
    }

    public boolean isShowClosedRequests() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings == null || supportSettings.isShowClosedRequests()) {
            return true;
        }
        return false;
    }

    public boolean isShowReferrerLogoEnabled() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings == null || !supportSettings.isShowReferrerLogo()) {
            return false;
        }
        return true;
    }

    public boolean isTicketFormSupportAvailable() {
        boolean z;
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings == null || supportSettings.getTicketForms() == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !this.mobileSettings.getTicketForms().isAvailable()) {
            return false;
        }
        return true;
    }
}
