package zendesk.messaging;

import android.app.Activity;
import android.content.Intent;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Update {
    private final String type;

    public static abstract class Action extends Update {

        public static class Navigation extends Action {
            private static int NO_REQUEST_CODE = -1;
            private final Intent intent;
            private final int requestCode;

            public void navigate(Activity activity) {
                int i = this.requestCode;
                if (i == NO_REQUEST_CODE) {
                    activity.startActivity(this.intent);
                } else {
                    activity.startActivityForResult(this.intent, i);
                }
            }
        }
    }

    public static class ApplyMenuItems extends State {
        private final List<MenuItem> menuItems;

        public ApplyMenuItems(MenuItem... menuItemArr) {
            super("apply_menu_items");
            List<MenuItem> list;
            if (menuItemArr == null) {
                list = Collections.emptyList();
            } else {
                list = Arrays.asList(menuItemArr);
            }
            this.menuItems = list;
        }

        public List<MenuItem> getMenuItems() {
            return this.menuItems;
        }
    }

    public static class ShowBanner extends State {
        private final Banner banner;

        public Banner getBanner() {
            return this.banner;
        }
    }

    public static class ShowDialog extends State {
        private final DialogContent dialogContent;

        public DialogContent getDialogContent() {
            return this.dialogContent;
        }
    }

    public static abstract class State extends Update {

        public static class ApplyMessagingItems extends State {
            private final List<MessagingItem> messagingItems;

            public List<MessagingItem> getMessagingItems() {
                return this.messagingItems;
            }
        }

        public static class ShowTyping extends State {
            private final AgentDetails agentDetails;

            public AgentDetails getAgentDetails() {
                return this.agentDetails;
            }
        }

        public static class UpdateConnectionState extends State {
            private final ConnectionState connectionState;

            public ConnectionState getConnectionState() {
                return this.connectionState;
            }
        }

        public static class UpdateInputFieldState extends State {
            private final AttachmentSettings attachmentSettings;
            private final Boolean enabled;
            private final String hint;
            private final Integer inputType;

            public UpdateInputFieldState(String str, Boolean bool, AttachmentSettings attachmentSettings2, Integer num) {
                super("update_input_field_state");
                this.hint = str;
                this.enabled = bool;
                this.attachmentSettings = attachmentSettings2;
                this.inputType = num;
            }

            public static UpdateInputFieldState updateInputFieldEnabled(boolean z) {
                return new UpdateInputFieldState((String) null, Boolean.valueOf(z), (AttachmentSettings) null, (Integer) null);
            }

            public AttachmentSettings getAttachmentSettings() {
                return this.attachmentSettings;
            }

            public String getHint() {
                return this.hint;
            }

            public Integer getInputType() {
                return this.inputType;
            }

            public Boolean isEnabled() {
                return this.enabled;
            }
        }

        public State(String str) {
            super(str);
        }
    }

    public Update(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }
}
