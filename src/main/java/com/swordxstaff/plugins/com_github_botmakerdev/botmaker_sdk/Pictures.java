package com.swordxstaff.plugins.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.vision.ImageTemplate;
import com.botmaker.sdk.api.geometry.Rect;

/**
 * Values com.github.BotMakerDev:botmaker-sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
@SdkValue(SdkValue.Id.PICTURES)
public final class Pictures {
    public static final ImageTemplate DIALOGUE_NEXT_ARROW = new ImageTemplate("images/dialogue_next_arrow.png")
            .at(new Rect(632, 699, 17, 16));
    public static final ImageTemplate POLICY_BACK_ARROW = new ImageTemplate("images/policy_back_arrow.png")
            .at(new Rect(472, 14, 40, 40));
    public static final ImageTemplate BOLTRAY_PAGE_LOGO = new ImageTemplate("images/boltray_page_logo.png")
            .at(new Rect(698, 12, 110, 42));
    public static final ImageTemplate NOTIFICATION_PERMISSION_BELL = new ImageTemplate(
            "images/notification_permission_bell.png").at(new Rect(615, 208, 50, 38));
    public static final ImageTemplate STARTUP_LOADING_BAR_END = new ImageTemplate("images/startup_loading_bar_end.png")
            .at(new Rect(512, 576, 18, 22));
    public static final ImageTemplate NOTICE_TITLE = new ImageTemplate("images/notice_title.png")
            .at(new Rect(600, 62, 80, 28));
    public static final ImageTemplate NOTICE_BACK = new ImageTemplate("images/notice_back.png")
            .at(new Rect(462, 669, 60, 38));
    public static final ImageTemplate NOTICE_TAB_SYSTEM = new ImageTemplate("images/notice_tab_system.png")
            .at(new Rect(610, 104, 60, 24));
    public static final ImageTemplate NOTICE_TAB_NEWS = new ImageTemplate("images/notice_tab_news.png")
            .at(new Rect(730, 104, 54, 24));
    public static final ImageTemplate NOTICE_ITEM_1 = new ImageTemplate("images/notice_item_1.png")
            .at(new Rect(471, 139, 104, 62));
    public static final ImageTemplate NOTICE_ITEM_2 = new ImageTemplate("images/notice_item_2.png")
            .at(new Rect(471, 207, 104, 60));
    public static final ImageTemplate NOTICE_ITEM_3 = new ImageTemplate("images/notice_item_3.png")
            .at(new Rect(471, 275, 104, 60));
    public static final ImageTemplate NOTICE_ITEM_4 = new ImageTemplate("images/notice_item_4.png")
            .at(new Rect(471, 342, 104, 60));
    public static final ImageTemplate NOTICE_HIDE_TODAY = new ImageTemplate("images/notice_hide_today.png")
            .at(new Rect(572, 604, 138, 20));
    public static final ImageTemplate TITLE_TAP_TO_PLAY = new ImageTemplate("images/title_tap_to_play.png")
            .at(new Rect(606, 596, 70, 18));
    public static final ImageTemplate TITLE_SERVERS = new ImageTemplate("images/title_servers.png")
            .at(new Rect(778, 15, 34, 32));
    public static final ImageTemplate TITLE_SETTINGS = new ImageTemplate("images/title_settings.png")
            .at(new Rect(778, 65, 34, 32));
    public static final ImageTemplate TITLE_FOLLOW_US = new ImageTemplate("images/title_follow_us.png")
            .at(new Rect(778, 115, 34, 32));
    public static final ImageTemplate TITLE_CUSTOMER_SERVICE = new ImageTemplate("images/title_customer_service.png")
            .at(new Rect(778, 165, 34, 30));
    public static final ImageTemplate TITLE_NOTICE = new ImageTemplate("images/title_notice.png")
            .at(new Rect(782, 218, 26, 26));
    public static final ImageTemplate TITLE_USER_CENTER = new ImageTemplate("images/title_user_center.png")
            .at(new Rect(782, 268, 26, 26));
    public static final ImageTemplate TITLE_SUBMIT_LOGS = new ImageTemplate("images/title_submit_logs.png")
            .at(new Rect(782, 368, 26, 26));
    public static final ImageTemplate TITLE_REPAIR_CLIENT = new ImageTemplate("images/title_repair_client.png")
            .at(new Rect(784, 321, 22, 22));
    public static final ImageTemplate SERVERS_TITLE = new ImageTemplate("images/servers_title.png")
            .at(new Rect(600, 104, 80, 28));
    public static final ImageTemplate SERVERS_ROW_SELECTED = new ImageTemplate("images/servers_row_selected.png")
            .at(new Rect(505, 226, 72, 22));
    public static final ImageTemplate SERVERS_ROW_OTHER = new ImageTemplate("images/servers_row_other.png")
            .at(new Rect(505, 165, 72, 22));
    public static final ImageTemplate SETTINGS_TITLE = new ImageTemplate("images/settings_title.png")
            .at(new Rect(600, 178, 80, 28));
    public static final ImageTemplate SETTINGS_TAB_SOUND = new ImageTemplate("images/settings_tab_sound.png")
            .at(new Rect(616, 219, 48, 22));
    public static final ImageTemplate SETTINGS_TAB_OTHER = new ImageTemplate("images/settings_tab_other.png")
            .at(new Rect(710, 219, 48, 22));
    public static final ImageTemplate SETTINGS_TEXT_LANGUAGE = new ImageTemplate("images/settings_text_language.png")
            .at(new Rect(657, 293, 114, 20));
    public static final ImageTemplate SETTINGS_TOGGLE_SERVER_CHANNEL = new ImageTemplate(
            "images/settings_toggle_server_channel.png").at(new Rect(726, 440, 46, 19));
    public static final ImageTemplate COMMUNITY_TITLE = new ImageTemplate("images/community_title.png")
            .at(new Rect(562, 248, 156, 24));
    public static final ImageTemplate COMMUNITY_DISCORD = new ImageTemplate("images/community_discord.png")
            .at(new Rect(530, 318, 58, 60));
    public static final ImageTemplate COMMUNITY_FACEBOOK = new ImageTemplate("images/community_facebook.png")
            .at(new Rect(611, 318, 58, 60));
    public static final ImageTemplate COMMUNITY_X = new ImageTemplate("images/community_x.png")
            .at(new Rect(694, 318, 58, 60));
    public static final ImageTemplate SUPPORT_BACK = new ImageTemplate("images/support_back.png")
            .at(new Rect(12, 12, 22, 26));
    public static final ImageTemplate SUPPORT_LOGO = new ImageTemplate("images/support_logo.png")
            .at(new Rect(620, 2, 40, 40));
    public static final ImageTemplate SUPPORT_SEND = new ImageTemplate("images/support_send.png")
            .at(new Rect(1212, 262, 58, 34));
    public static final ImageTemplate USER_CENTER_CLOSE = new ImageTemplate("images/user_center_close.png")
            .at(new Rect(468, 10, 32, 32));

    private Pictures() {
    }
}
