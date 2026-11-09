package com.swordxstaff.plugins.com_github_botmakerdev.botmaker_sdk;

import com.botmaker.sdk.api.bot.SdkValue;
import com.botmaker.sdk.api.vision.ImageTemplate;
import com.botmaker.sdk.api.geometry.Rect;
import com.botmaker.sdk.api.geometry.Size;

/**
 * Values com.github.BotMakerDev:botmaker-sdk keeps in step with its own windows.
 * <p>Written by BotMaker because this project had none, and <b>yours from that moment</b>:
 * it is never rewritten. BotMaker changes the expression a {@code @SdkValue} method returns and nothing else.
 */
@SdkValue(SdkValue.Id.PICTURES)
public final class Pictures {
    public static final ImageTemplate DIALOGUE_NEXT_ARROW = new ImageTemplate("images/dialogue_next_arrow.png").at(new Rect(632, 699, 17, 16)).in(new Size(1280, 720));
    public static final ImageTemplate POLICY_BACK_ARROW = new ImageTemplate("images/policy_back_arrow.png").at(new Rect(12, 16, 44, 44));
    public static final ImageTemplate BOLTRAY_PAGE_LOGO = new ImageTemplate("images/boltray_page_logo.png").at(new Rect(948, 14, 110, 46));
    public static final ImageTemplate NOTIFICATION_PERMISSION_BELL = new ImageTemplate("images/notification_permission_bell.png").at(new Rect(615, 208, 50, 38)).in(new Size(1280, 720));
    public static final ImageTemplate STARTUP_LOADING_BAR_END = new ImageTemplate("images/startup_loading_bar_end.png").at(new Rect(512, 576, 18, 22)).in(new Size(1280, 720));
    public static final ImageTemplate NOTICE_TITLE = new ImageTemplate("images/notice_title.png").at(new Rect(467, 120, 145, 45));
    public static final ImageTemplate NOTICE_BACK = new ImageTemplate("images/notice_back.png").at(new Rect(60, 1795, 90, 70));
    public static final ImageTemplate NOTICE_TAB_SYSTEM = new ImageTemplate("images/notice_tab_system.png").at(new Rect(482, 237, 113, 38));
    public static final ImageTemplate NOTICE_TAB_NEWS = new ImageTemplate("images/notice_tab_news.png").at(new Rect(830, 237, 88, 38));
    public static final ImageTemplate NOTICE_ITEM_1 = new ImageTemplate("images/notice_item_1.png").at(new Rect(60, 330, 280, 165));
    public static final ImageTemplate NOTICE_ITEM_2 = new ImageTemplate("images/notice_item_2.png").at(new Rect(60, 522, 280, 165));
    public static final ImageTemplate NOTICE_ITEM_3 = new ImageTemplate("images/notice_item_3.png").at(new Rect(60, 718, 280, 165));
    public static final ImageTemplate NOTICE_ITEM_4 = new ImageTemplate("images/notice_item_4.png").at(new Rect(60, 912, 280, 160));
    public static final ImageTemplate NOTICE_HIDE_TODAY = new ImageTemplate("images/notice_hide_today.png").at(new Rect(345, 1668, 390, 36));
    public static final ImageTemplate TITLE_TAP_TO_PLAY = new ImageTemplate("images/title_tap_to_play.png").at(new Rect(383, 1574, 26, 26));
    public static final ImageTemplate TITLE_SERVERS = new ImageTemplate("images/title_servers.png").at(new Rect(937, 42, 96, 96));
    public static final ImageTemplate TITLE_SETTINGS = new ImageTemplate("images/title_settings.png").at(new Rect(937, 185, 96, 96));
    public static final ImageTemplate TITLE_FOLLOW_US = new ImageTemplate("images/title_follow_us.png").at(new Rect(937, 330, 96, 96));
    public static final ImageTemplate TITLE_CUSTOMER_SERVICE = new ImageTemplate("images/title_customer_service.png").at(new Rect(955, 490, 60, 44));
    public static final ImageTemplate TITLE_NOTICE = new ImageTemplate("images/title_notice.png").at(new Rect(958, 640, 54, 44));
    public static final ImageTemplate TITLE_USER_CENTER = new ImageTemplate("images/title_user_center.png").at(new Rect(958, 783, 54, 44));
    public static final ImageTemplate TITLE_SUBMIT_LOGS = new ImageTemplate("images/title_submit_logs.png").at(new Rect(958, 1076, 54, 44));
    public static final ImageTemplate TITLE_REPAIR_CLIENT = new ImageTemplate("images/title_repair_client.png").at(new Rect(958, 930, 54, 44));
    public static final ImageTemplate SERVERS_TITLE = new ImageTemplate("images/servers_title.png").at(new Rect(437, 240, 200, 45));
    public static final ImageTemplate SERVERS_ROW_SELECTED = new ImageTemplate("images/servers_row_selected.png").at(new Rect(162, 525, 180, 45));
    public static final ImageTemplate SERVERS_ROW_OTHER = new ImageTemplate("images/servers_row_other.png").at(new Rect(163, 508, 180, 44));
    public static final ImageTemplate SETTINGS_TITLE = new ImageTemplate("images/settings_title.png").at(new Rect(443, 450, 194, 50));
    public static final ImageTemplate SETTINGS_TAB_SOUND = new ImageTemplate("images/settings_tab_sound.png").at(new Rect(492, 567, 96, 36));
    public static final ImageTemplate SETTINGS_TAB_OTHER = new ImageTemplate("images/settings_tab_other.png").at(new Rect(762, 567, 93, 36));
    public static final ImageTemplate SETTINGS_TEXT_LANGUAGE = new ImageTemplate("images/settings_text_language.png").at(new Rect(587, 770, 325, 55));
    public static final ImageTemplate SETTINGS_TOGGLE_SERVER_CHANNEL = new ImageTemplate("images/settings_toggle_server_channel.png").at(new Rect(787, 1192, 125, 50));
    public static final ImageTemplate COMMUNITY_TITLE = new ImageTemplate("images/community_title.png").at(new Rect(325, 648, 430, 50));
    public static final ImageTemplate COMMUNITY_DISCORD = new ImageTemplate("images/community_discord.png").at(new Rect(222, 845, 164, 160));
    public static final ImageTemplate COMMUNITY_FACEBOOK = new ImageTemplate("images/community_facebook.png").at(new Rect(459, 845, 164, 160));
    public static final ImageTemplate COMMUNITY_X = new ImageTemplate("images/community_x.png").at(new Rect(694, 845, 164, 160));
    public static final ImageTemplate SUPPORT_BACK = new ImageTemplate("images/support_back.png").at(new Rect(12, 10, 24, 30));
    public static final ImageTemplate USER_CENTER_CLOSE = new ImageTemplate("images/user_center_close.png").at(new Rect(468, 10, 32, 32)).in(new Size(1280, 720));
    public static final ImageTemplate SERVERS_TAB_AVAILABLE = new ImageTemplate("images/servers_tab_available.png")
            .at(new Rect(713, 347, 150, 46));
    public static final ImageTemplate SERVERS_TAB_CHARACTERS = new ImageTemplate("images/servers_tab_characters.png")
            .at(new Rect(170, 347, 232, 46));
    public static final ImageTemplate SERVERS_SEARCH = new ImageTemplate("images/servers_search.png")
            .at(new Rect(100, 1572, 460, 76));
    public static final ImageTemplate SERVERS_SEARCH_GO = new ImageTemplate("images/servers_search_go.png")
            .at(new Rect(562, 1578, 66, 66));
    public static final ImageTemplate SETTINGS_TAB_GAME = new ImageTemplate("images/settings_tab_game.png")
            .at(new Rect(230, 567, 82, 36));
    public static final ImageTemplate SUPPORT_AVATAR = new ImageTemplate("images/support_avatar.png")
            .at(new Rect(12, 170, 45, 55));
    public static final ImageTemplate NOTICE_TAB_NOTICE = new ImageTemplate("images/notice_tab_notice.png")
            .at(new Rect(150, 237, 110, 38));
    public static final ImageTemplate LOGGING_IN_TEXT = new ImageTemplate("images/logging_in_text.png")
            .at(new Rect(452, 940, 176, 44));
    public static final ImageTemplate SCENE_LOADING_TEXT = new ImageTemplate("images/scene_loading_text.png")
            .at(new Rect(795, 1750, 125, 40));
    public static final ImageTemplate DIALOGUE_PANEL = new ImageTemplate("images/dialogue_panel.png")
            .at(new Rect(60, 1730, 900, 110));
    public static final ImageTemplate PROLOGUE_TURN_PORTRAIT = new ImageTemplate("images/prologue_turn_portrait.png")
            .at(new Rect(835, 130, 130, 110));
    public static final ImageTemplate BODY_TYPE_TITLE = new ImageTemplate("images/body_type_title.png")
            .at(new Rect(328, 80, 360, 57));
    public static final ImageTemplate BODY_TYPE_NEXT = new ImageTemplate("images/body_type_next.png")
            .at(new Rect(100, 1770, 880, 100));
    public static final ImageTemplate BODY_TYPE_A = new ImageTemplate("images/body_type_a.png")
            .at(new Rect(215, 1590, 150, 150));
    public static final ImageTemplate BODY_TYPE_B = new ImageTemplate("images/body_type_b.png")
            .at(new Rect(750, 1590, 150, 150));
    public static final ImageTemplate CUSTOMIZATION_TITLE = new ImageTemplate("images/customization_title.png")
            .at(new Rect(400, 85, 280, 55));
    public static final ImageTemplate CUSTOMIZATION_BACK = new ImageTemplate("images/customization_back.png")
            .at(new Rect(25, 1765, 175, 110));
    public static final ImageTemplate CUSTOMIZATION_NEXT = new ImageTemplate("images/customization_next.png")
            .at(new Rect(215, 1765, 835, 110));
    public static final ImageTemplate CUSTOMIZATION_TAB_HAIR = new ImageTemplate("images/customization_tab_hair.png")
            .at(new Rect(340, 985, 150, 55));
    public static final ImageTemplate CUSTOMIZATION_TAB_FACE = new ImageTemplate("images/customization_tab_face.png")
            .at(new Rect(610, 985, 150, 55));
    public static final ImageTemplate CUSTOMIZATION_TAB_TRAIT = new ImageTemplate("images/customization_tab_trait.png")
            .at(new Rect(840, 985, 150, 55));
    public static final ImageTemplate CUSTOMIZATION_SHUFFLE = new ImageTemplate("images/customization_shuffle.png")
            .at(new Rect(965, 735, 90, 85));
    public static final ImageTemplate CUSTOMIZATION_RESET = new ImageTemplate("images/customization_reset.png")
            .at(new Rect(965, 835, 90, 85));
    public static final ImageTemplate RESET_CONFIRM_TEXT = new ImageTemplate("images/reset_confirm_text.png")
            .at(new Rect(250, 855, 580, 55));
    public static final ImageTemplate RESET_CONFIRM_CANCEL = new ImageTemplate("images/reset_confirm_cancel.png").at(new Rect(255, 1066, 135, 44));
    public static final ImageTemplate RESET_CONFIRM_OK = new ImageTemplate("images/reset_confirm_ok.png")
            .at(new Rect(560, 1055, 360, 95));
    public static final ImageTemplate CUSTOMIZATION_HEADER = new ImageTemplate("images/customization_header.png")
            .at(new Rect(400, 85, 280, 55));
    public static final ImageTemplate NAME_TITLE = new ImageTemplate("images/name_title.png")
            .at(new Rect(390, 85, 300, 55));
    public static final ImageTemplate NAME_FIELD = new ImageTemplate("images/name_field.png")
            .at(new Rect(35, 1565, 1010, 110));
    public static final ImageTemplate NAME_LETS_GO = new ImageTemplate("images/name_lets_go.png")
            .at(new Rect(215, 1765, 835, 110));
    public static final ImageTemplate NAME_BACK = new ImageTemplate("images/name_back.png")
            .at(new Rect(20, 1765, 150, 110));
    public static final ImageTemplate CHOICE_BAR = new ImageTemplate("images/choice_bar.png")
            .at(new Rect(85, 1430, 910, 100));
    public static final ImageTemplate CART_BLUEPRINT_CARD = new ImageTemplate("images/cart_blueprint_card.png")
            .at(new Rect(72, 1245, 284, 196));
    public static final ImageTemplate UNLOCK_CART_PICTURE = new ImageTemplate("images/unlock_cart_picture.png")
            .at(new Rect(342, 557, 350, 213));
    public static final ImageTemplate UNLOCK_BUTTON = new ImageTemplate("images/unlock_button.png")
            .at(new Rect(380, 1400, 320, 64));
    public static final ImageTemplate UNLOCKED_TITLE = new ImageTemplate("images/unlocked_title.png")
            .at(new Rect(262, 465, 562, 95));
    public static final ImageTemplate TAP_TO_CONTINUE = new ImageTemplate("images/tap_to_continue.png")
            .at(new Rect(390, 1780, 296, 50));
    public static final ImageTemplate ISLAND_CART_BUTTON = new ImageTemplate("images/island_cart_button.png")
            .at(new Rect(120, 1290, 190, 100));
    public static final ImageTemplate CART_HEADER_PICTURE = new ImageTemplate("images/cart_header_picture.png")
            .at(new Rect(330, 270, 410, 260));
    public static final ImageTemplate CART_ROW_UNLOCK = new ImageTemplate("images/cart_row_unlock.png")
            .at(new Rect(785, 660, 200, 64));
    public static final ImageTemplate CART_CLAIM_ALL = new ImageTemplate("images/cart_claim_all.png")
            .at(new Rect(345, 1615, 390, 62));
    public static final ImageTemplate YOU_RECEIVED_TITLE = new ImageTemplate("images/you_received_title.png")
            .at(new Rect(300, 530, 480, 80));
    public static final ImageTemplate CART_ROW_UPGRADE = new ImageTemplate("images/cart_row_upgrade.png")
            .at(new Rect(928, 664, 36, 46));
    public static final ImageTemplate UPGRADE_LEVEL_ARROW = new ImageTemplate("images/upgrade_level_arrow.png")
            .at(new Rect(496, 636, 96, 56));
    public static final ImageTemplate UPGRADE_BACK = new ImageTemplate("images/upgrade_back.png")
            .at(new Rect(30, 1782, 166, 94));
    public static final ImageTemplate UPGRADE_TAB_WOOD = new ImageTemplate("images/upgrade_tab_wood.png")
            .at(new Rect(262, 186, 108, 84));
    public static final ImageTemplate UPGRADE_TAB_STONE = new ImageTemplate("images/upgrade_tab_stone.png")
            .at(new Rect(432, 186, 108, 84));
    public static final ImageTemplate HOUSE_ARCH_WINDOW = new ImageTemplate("images/house_arch_window.png")
            .at(new Rect(636, 672, 184, 176));
    public static final ImageTemplate HOUSE_PACKAGE_CARD = new ImageTemplate("images/house_package_card.png")
            .at(new Rect(100, 1282, 140, 106));
    public static final ImageTemplate HOUSE_STORAGE_CHEST = new ImageTemplate("images/house_storage_chest.png")
            .at(new Rect(126, 1294, 144, 94));
    public static final ImageTemplate CHOICE_ARROW = new ImageTemplate("images/choice_arrow.png")
            .at(new Rect(122, 1332, 62, 42));
    public static final ImageTemplate CHOICE_STAFF = new ImageTemplate("images/choice_staff.png")
            .at(new Rect(456, 1322, 56, 56));
    public static final ImageTemplate CHOICE_SWORD = new ImageTemplate("images/choice_sword.png")
            .at(new Rect(450, 1447, 56, 56));
    public static final ImageTemplate NAV_CHARACTER = new ImageTemplate("images/nav_character.png")
            .at(new Rect(86, 1810, 78, 84));
    public static final ImageTemplate CHAR_CLASS_ICON = new ImageTemplate("images/char_class_icon.png").at(new Rect(582, 1088, 106, 80));
    public static final ImageTemplate CHAR_GEAR_SLOT = new ImageTemplate("images/char_gear_slot.png")
            .at(new Rect(98, 578, 74, 74));
    public static final ImageTemplate REPLACE_GEAR_CORNER = new ImageTemplate("images/replace_gear_corner.png").at(new Rect(86, 266, 38, 38));
    public static final ImageTemplate GEAR_NOVICE_STAFF = new ImageTemplate("images/gear_novice_staff.png")
            .at(new Rect(165, 460, 126, 128));
    public static final ImageTemplate GEAR_SHARE = new ImageTemplate("images/gear_share.png")
            .at(new Rect(783, 438, 36, 36));
    public static final ImageTemplate GEAR_LOCK = new ImageTemplate("images/gear_lock.png").at(new Rect(852, 441, 34, 36));
    public static final ImageTemplate GEAR_EQUIP = new ImageTemplate("images/gear_equip.png")
            .at(new Rect(400, 1315, 270, 58));
    public static final ImageTemplate CHAR_SKILL_ICON = new ImageTemplate("images/char_skill_icon.png")
            .at(new Rect(418, 1112, 56, 56));
    public static final ImageTemplate SKILLS_LOADOUT_PENCIL = new ImageTemplate("images/skills_loadout_pencil.png").at(new Rect(428, 1030, 36, 32));
    public static final ImageTemplate SKILLS_LOADOUT_PREV = new ImageTemplate("images/skills_loadout_prev.png").at(new Rect(346, 1032, 34, 36));
    public static final ImageTemplate SKILLS_LOADOUT_NEXT = new ImageTemplate("images/skills_loadout_next.png").at(new Rect(701, 1032, 34, 36));
    public static final ImageTemplate SKILLS_WATER_SHOT = new ImageTemplate("images/skills_water_shot.png")
            .at(new Rect(98, 1296, 116, 104));
    public static final ImageTemplate TECHNIQUE_PIN = new ImageTemplate("images/technique_pin.png")
            .at(new Rect(870, 366, 30, 32));
    public static final ImageTemplate TECHNIQUE_EQUIP = new ImageTemplate("images/technique_equip.png")
            .at(new Rect(200, 1372, 290, 56));
    public static final ImageTemplate TECHNIQUE_HEADER_ICONS = new ImageTemplate("images/technique_header_icons.png")
            .at(new Rect(798, 364, 104, 36));
    public static final ImageTemplate NAV_PORTAL = new ImageTemplate("images/nav_portal.png")
            .at(new Rect(918, 1805, 94, 40));
    public static final ImageTemplate WORLD_ISLAND_ORIGINISLE = new ImageTemplate("images/world_island_originisle.png")
            .at(new Rect(340, 660, 360, 220));
    public static final ImageTemplate WORLD_TAB_SELECTED = new ImageTemplate("images/world_tab_selected.png")
            .at(new Rect(918, 1878, 118, 34));
    public static final ImageTemplate WORLD_CHEST = new ImageTemplate("images/world_chest.png")
            .at(new Rect(42, 1668, 72, 62));
    public static final ImageTemplate ISLAND_LOADING_PATTERN = new ImageTemplate("images/island_loading_pattern.png")
            .at(new Rect(590, 1140, 160, 160));
    public static final ImageTemplate STAGE_QUEST_ICON = new ImageTemplate("images/stage_quest_icon.png")
            .at(new Rect(36, 1482, 32, 34));
    public static final ImageTemplate STAGE_PACKAGE = new ImageTemplate("images/stage_package.png")
            .at(new Rect(945, 1505, 60, 55));
    public static final ImageTemplate TOP_AVATAR = new ImageTemplate("images/top_avatar.png").at(new Rect(52, 46, 85, 80));
    public static final ImageTemplate STAGE_DOWNLOAD_REWARD = new ImageTemplate("images/stage_download_reward.png")
            .at(new Rect(45, 228, 80, 78));
    public static final ImageTemplate STAGE_BOAR = new ImageTemplate("images/stage_boar.png")
            .at(new Rect(505, 925, 70, 70));
    public static final ImageTemplate BATTLE_CAMERA = new ImageTemplate("images/battle_camera.png")
            .at(new Rect(47, 1360, 62, 56));
    public static final ImageTemplate BATTLE_START = new ImageTemplate("images/battle_start.png")
            .at(new Rect(370, 1400, 340, 66));
    public static final ImageTemplate BATTLE_LOCK = new ImageTemplate("images/battle_lock.png")
            .at(new Rect(47, 1477, 62, 60));
    public static final ImageTemplate BATTLE_LOADOUT_SWAP = new ImageTemplate("images/battle_loadout_swap.png")
            .at(new Rect(458, 1803, 42, 42));
    public static final ImageTemplate STAGE_ORE_NODE = new ImageTemplate("images/stage_ore_node.png")
            .at(new Rect(503, 932, 70, 66));
    public static final ImageTemplate STAGE_WOOD_NODE = new ImageTemplate("images/stage_wood_node.png")
            .at(new Rect(525, 848, 76, 44));
    public static final ImageTemplate STAGE_QUEST_TRACKER = new ImageTemplate("images/stage_quest_tracker.png")
            .at(new Rect(36, 1474, 32, 34));
    public static final ImageTemplate QUEST_GOAL_LABEL = new ImageTemplate("images/quest_goal_label.png")
            .at(new Rect(172, 700, 84, 40));
    public static final ImageTemplate QUEST_CLAIM_BUTTON = new ImageTemplate("images/quest_claim_button.png")
            .at(new Rect(140, 1302, 800, 62));
    public static final ImageTemplate STAGE_PLANT_MONSTER = new ImageTemplate("images/stage_plant_monster.png")
            .at(new Rect(528, 1372, 66, 26));
    public static final ImageTemplate LOADOUT_RADIO_EMPTY = new ImageTemplate("images/loadout_radio_empty.png")
            .at(new Rect(928, 720, 44, 44));
    public static final ImageTemplate LOADOUT_EDIT = new ImageTemplate("images/loadout_edit.png")
            .at(new Rect(255, 1525, 115, 46));
    public static final ImageTemplate LOADOUT_OK = new ImageTemplate("images/loadout_ok.png")
            .at(new Rect(715, 1525, 95, 46));
    public static final ImageTemplate LOADOUT_EDIT_HEADER = new ImageTemplate("images/loadout_edit_header.png")
            .at(new Rect(50, 45, 120, 75));
    public static final ImageTemplate LOADOUT_EDIT_CHARM_TAB = new ImageTemplate("images/loadout_edit_charm_tab.png")
            .at(new Rect(545, 1178, 112, 40));
    public static final ImageTemplate LOADOUT_EDIT_TECHNIQUE_TAB = new ImageTemplate(
            "images/loadout_edit_technique_tab.png").at(new Rect(145, 1178, 160, 40));
    public static final ImageTemplate LOADOUT_EDIT_EMPTY_SLOT = new ImageTemplate("images/loadout_edit_empty_slot.png")
            .at(new Rect(868, 333, 144, 144));
    public static final ImageTemplate STAGE_BOAR_IDLE = new ImageTemplate("images/stage_boar_idle.png")
            .at(new Rect(325, 1005, 115, 140)).frames(3);
    public static final ImageTemplate STAGE_BOAR_CHECK = new ImageTemplate("images/stage_boar_check.png").at(new Rect(797, 1090, 103, 88));
    public static final ImageTemplate QUIT_GAME_QUESTION = new ImageTemplate("images/quit_game_question.png")
            .at(new Rect(410, 848, 265, 62));
    public static final ImageTemplate STAGE_PLANT_IDLE = new ImageTemplate("images/stage_plant_idle.png")
            .at(new Rect(928, 915, 125, 112)).frames(5);
    public static final ImageTemplate PROFILE_STATS_LABEL = new ImageTemplate("images/profile_stats_label.png")
            .at(new Rect(102, 850, 110, 36));
    public static final ImageTemplate PROFILE_POWER_SEARCH = new ImageTemplate("images/profile_power_search.png")
            .at(new Rect(195, 282, 40, 40));
    public static final ImageTemplate PROFILE_STATS_SEARCH = new ImageTemplate("images/profile_stats_search.png")
            .at(new Rect(938, 848, 40, 40));
    public static final ImageTemplate PROFILE_DISH = new ImageTemplate("images/profile_dish.png")
            .at(new Rect(130, 1555, 380, 80));
    public static final ImageTemplate PROFILE_QUICK_HEAL = new ImageTemplate("images/profile_quick_heal.png")
            .at(new Rect(575, 1555, 380, 80));
    public static final ImageTemplate PROFILE_PLAYER_ID_LABEL = new ImageTemplate("images/profile_player_id_label.png").at(new Rect(600, 462, 140, 42));
    public static final ImageTemplate POWER_BREAKDOWN_TITLE = new ImageTemplate("images/power_breakdown_title.png")
            .at(new Rect(345, 205, 390, 52));
    public static final ImageTemplate MENU_SERVER_TIME_LABEL = new ImageTemplate("images/menu_server_time_label.png")
            .at(new Rect(543, 1800, 175, 42));
    public static final ImageTemplate MENU_QUEST = new ImageTemplate("images/menu_quest.png")
            .at(new Rect(72, 1352, 450, 170));
    public static final ImageTemplate MENU_PHOTO = new ImageTemplate("images/menu_photo.png")
            .at(new Rect(72, 1560, 160, 170));
    public static final ImageTemplate MENU_USER_CENTER = new ImageTemplate("images/menu_user_center.png")
            .at(new Rect(460, 1560, 160, 170));
    public static final ImageTemplate MENU_SETTINGS = new ImageTemplate("images/menu_settings.png")
            .at(new Rect(652, 1560, 160, 170));
    public static final ImageTemplate MENU_NOTICE = new ImageTemplate("images/menu_notice.png")
            .at(new Rect(275, 1605, 140, 120));
    public static final ImageTemplate SETTINGS_TAB_GRAPHICS = new ImageTemplate("images/settings_tab_graphics.png")
            .at(new Rect(350, 556, 175, 52));
    public static final ImageTemplate GUIDANCE_QUEST_TITLE = new ImageTemplate("images/guidance_quest_title.png")
            .at(new Rect(55, 50, 345, 60));
    public static final ImageTemplate QUEST_GO = new ImageTemplate("images/quest_go.png")
            .at(new Rect(850, 1243, 105, 55));
    public static final ImageTemplate QUEST_TAB_ACHIEVEMENT = new ImageTemplate("images/quest_tab_achievement.png")
            .at(new Rect(680, 1800, 340, 60));
    public static final ImageTemplate PHOTO_SHUTTER = new ImageTemplate("images/photo_shutter.png")
            .at(new Rect(465, 1728, 150, 145));
    public static final ImageTemplate PHOTO_ZOOM_IN = new ImageTemplate("images/photo_zoom_in.png")
            .at(new Rect(1000, 1170, 45, 45));
    public static final ImageTemplate PHOTO_ZOOM_OUT = new ImageTemplate("images/photo_zoom_out.png").at(new Rect(1000, 1652, 45, 36));
    public static final ImageTemplate USER_CENTER_TITLE = new ImageTemplate("images/user_center_title.png")
            .at(new Rect(395, 428, 290, 70));
    public static final ImageTemplate UC_ACCOUNT_CENTER = new ImageTemplate("images/uc_account_center.png")
            .at(new Rect(165, 572, 367, 98));
    public static final ImageTemplate UC_HELP_CENTER = new ImageTemplate("images/uc_help_center.png")
            .at(new Rect(553, 572, 367, 98));
    public static final ImageTemplate UC_SUBMIT_LOGS = new ImageTemplate("images/uc_submit_logs.png")
            .at(new Rect(165, 707, 367, 98));
    public static final ImageTemplate UC_PRIVACY_POLICY = new ImageTemplate("images/uc_privacy_policy.png")
            .at(new Rect(553, 707, 367, 98));
    public static final ImageTemplate UC_USER_AGREEMENT = new ImageTemplate("images/uc_user_agreement.png")
            .at(new Rect(165, 844, 367, 98));
    public static final ImageTemplate UC_SELF_SERVICE = new ImageTemplate("images/uc_self_service.png")
            .at(new Rect(553, 844, 367, 98));
    public static final ImageTemplate UC_GIFT_CODE = new ImageTemplate("images/uc_gift_code.png")
            .at(new Rect(340, 1272, 400, 86));
    public static final ImageTemplate ACHIEVEMENT_TITLE = new ImageTemplate("images/achievement_title.png")
            .at(new Rect(55, 45, 425, 75));
    public static final ImageTemplate QUEST_TAB_QUEST = new ImageTemplate("images/quest_tab_quest.png")
            .at(new Rect(235, 1782, 395, 96));
    public static final ImageTemplate ACHIEVEMENT_CARD = new ImageTemplate("images/achievement_card.png")
            .at(new Rect(90, 220, 740, 330));
    public static final ImageTemplate RETURN_HOME_TEXT = new ImageTemplate("images/return_home_text.png")
            .at(new Rect(400, 852, 282, 56));
    public static final ImageTemplate CHARACTER_STATS_TITLE = new ImageTemplate("images/character_stats_title.png")
            .at(new Rect(350, 190, 380, 62));
    public static final ImageTemplate STATS_TAB_GENERAL = new ImageTemplate("images/stats_tab_general.png")
            .at(new Rect(100, 292, 435, 75));
    public static final ImageTemplate STATS_TAB_DETAILS = new ImageTemplate("images/stats_tab_details.png")
            .at(new Rect(552, 292, 435, 75));
    public static final ImageTemplate STATS_MAIN_HEADING = new ImageTemplate("images/stats_main_heading.png")
            .at(new Rect(430, 422, 220, 50));
    public static final ImageTemplate NAV_HOME_SELECTED = new ImageTemplate("images/nav_home_selected.png")
            .at(new Rect(465, 1795, 160, 120));
    public static final ImageTemplate NAV_LOCKED_LEFT = new ImageTemplate("images/nav_locked_left.png")
            .at(new Rect(265, 1748, 135, 145));
    public static final ImageTemplate NAV_LOCKED_RIGHT = new ImageTemplate("images/nav_locked_right.png")
            .at(new Rect(692, 1748, 140, 145));
    public static final ImageTemplate HOME_SIDE_ICON = new ImageTemplate("images/home_side_icon.png").at(new Rect(57, 1080, 40, 40));
    public static final ImageTemplate GEAR_REPLACE = new ImageTemplate("images/gear_replace.png").at(new Rect(230, 1298, 240, 55));
    public static final ImageTemplate GEAR_ENHANCE = new ImageTemplate("images/gear_enhance.png")
            .at(new Rect(560, 1295, 310, 68));
    public static final ImageTemplate ENHANCE_GEAR_TITLE = new ImageTemplate("images/enhance_gear_title.png")
            .at(new Rect(55, 45, 310, 75));
    public static final ImageTemplate ENHANCE_DO = new ImageTemplate("images/enhance_do.png")
            .at(new Rect(320, 1600, 400, 70));
    public static final ImageTemplate ENHANCE_RESONANCE = new ImageTemplate("images/enhance_resonance.png")
            .at(new Rect(805, 357, 275, 58));
    public static final ImageTemplate ENHANCE_TAB_GOALS = new ImageTemplate("images/enhance_tab_goals.png")
            .at(new Rect(690, 1792, 330, 68));
    public static final ImageTemplate ENHANCEMENT_GOALS_TITLE = new ImageTemplate("images/enhancement_goals_title.png")
            .at(new Rect(55, 45, 425, 75));
    public static final ImageTemplate GOAL_INCOMPLETE = new ImageTemplate("images/goal_incomplete.png")
            .at(new Rect(765, 290, 237, 78));
    public static final ImageTemplate ENHANCE_TAB_ENHANCE = new ImageTemplate("images/enhance_tab_enhance.png")
            .at(new Rect(235, 1784, 395, 92));
    public static final ImageTemplate GEAR_RESONANCE_TITLE = new ImageTemplate("images/gear_resonance_title.png")
            .at(new Rect(55, 45, 350, 75));
    public static final ImageTemplate RESONANCE_STATISTICS = new ImageTemplate("images/resonance_statistics.png")
            .at(new Rect(240, 1587, 605, 80));
    public static final ImageTemplate RESONANCE_ROW_ICON = new ImageTemplate("images/resonance_row_icon.png")
            .at(new Rect(48, 1368, 205, 155));
    public static final ImageTemplate REPLACE_GEAR_TITLE = new ImageTemplate("images/replace_gear_title.png")
            .at(new Rect(392, 293, 296, 66));
    public static final ImageTemplate CHAR_WEAPON_STAFF = new ImageTemplate("images/char_weapon_staff.png")
            .at(new Rect(72, 548, 120, 98));
    public static final ImageTemplate GEAR_LOCKED = new ImageTemplate("images/gear_locked.png")
            .at(new Rect(852, 441, 34, 36));
    public static final ImageTemplate SKILL_GOALS_TITLE = new ImageTemplate("images/skill_goals_title.png")
            .at(new Rect(55, 50, 245, 70));
    public static final ImageTemplate SKILL_GOALS_TAB_QUALITY = new ImageTemplate("images/skill_goals_tab_quality.png")
            .at(new Rect(560, 1648, 260, 70));
    public static final ImageTemplate SKILL_GOALS_TAB_LEVEL = new ImageTemplate("images/skill_goals_tab_level.png")
            .at(new Rect(250, 1648, 280, 70));
    public static final ImageTemplate GOALS_TAB_SKILL = new ImageTemplate("images/goals_tab_skill.png")
            .at(new Rect(240, 1790, 390, 80));
    public static final ImageTemplate SKILL_GOALS_LEVEL = new ImageTemplate("images/skill_goals_level.png").at(new Rect(300, 1660, 170, 48));
    public static final ImageTemplate SKILL_GOALS_QUALITY_SELECTED = new ImageTemplate(
            "images/skill_goals_quality_selected.png").at(new Rect(560, 1648, 260, 70));
    public static final ImageTemplate STARTUP_VERSION_LABEL = new ImageTemplate("images/startup_version_label.png")
            .at(new Rect(36, 33, 118, 26));
    public static final ImageTemplate NAV_HOME = new ImageTemplate("images/nav_home.png")
            .at(new Rect(492, 1800, 100, 100));
    public static final ImageTemplate RESOURCE_DOWNLOAD_TITLE = new ImageTemplate("images/resource_download_title.png")
            .at(new Rect(325, 525, 430, 60));
    public static final ImageTemplate RESOURCE_DOWNLOAD_CLAIM = new ImageTemplate("images/resource_download_claim.png")
            .at(new Rect(360, 1205, 360, 80));
    public static final ImageTemplate SELF_SERVICE_TITLE = new ImageTemplate("images/self_service_title.png")
            .at(new Rect(385, 38, 310, 44));
    public static final ImageTemplate SELF_SERVICE_CLOSE = new ImageTemplate("images/self_service_close.png")
            .at(new Rect(145, 35, 50, 50));
    public static final ImageTemplate GIFT_CODE_TITLE = new ImageTemplate("images/gift_code_title.png")
            .at(new Rect(430, 648, 225, 54));
    public static final ImageTemplate GIFT_CODE_FIELD = new ImageTemplate("images/gift_code_field.png")
            .at(new Rect(170, 850, 720, 70));
    public static final ImageTemplate EXPLORATION_GOALS_TITLE = new ImageTemplate("images/exploration_goals_title.png")
            .at(new Rect(62, 59, 386, 54));
    public static final ImageTemplate EXPLORATION_BACK = new ImageTemplate("images/exploration_back.png")
            .at(new Rect(30, 1780, 160, 95));
    public static final ImageTemplate EXPLORATION_PROGRESS_TAB = new ImageTemplate(
            "images/exploration_progress_tab.png").at(new Rect(360, 1795, 160, 60));
    public static final ImageTemplate EXPLORATION_EXPLORE_TAB = new ImageTemplate("images/exploration_explore_tab.png")
            .at(new Rect(770, 1795, 150, 60));
    public static final ImageTemplate DESTINY_EXPLORATION_TITLE = new ImageTemplate(
            "images/destiny_exploration_title.png").at(new Rect(58, 55, 490, 52));
    public static final ImageTemplate DESTINY_PROGRESS_TAB = new ImageTemplate("images/destiny_progress_tab.png")
            .at(new Rect(360, 1795, 160, 60));
    public static final ImageTemplate CHAR_RANK_BUTTON = new ImageTemplate("images/char_rank_button.png")
            .at(new Rect(748, 1335, 280, 90));
    public static final ImageTemplate CHAR_STATS_BAR = new ImageTemplate("images/char_stats_bar.png")
            .at(new Rect(50, 1462, 185, 46));
    public static final ImageTemplate RANK_ADVANCEMENT_TITLE = new ImageTemplate("images/rank_advancement_title.png")
            .at(new Rect(120, 52, 405, 56));
    public static final ImageTemplate RANK_TAB_GOALS = new ImageTemplate("images/rank_tab_goals.png")
            .at(new Rect(700, 1785, 330, 85));
    public static final ImageTemplate RANK_GOALS_TAB_RANK = new ImageTemplate("images/rank_goals_tab_rank.png")
            .at(new Rect(300, 1790, 280, 75));
    public static final ImageTemplate RANK_GOALS_TAB_POWER = new ImageTemplate("images/rank_goals_tab_power.png")
            .at(new Rect(560, 1650, 260, 65));
    public static final ImageTemplate STATS_TAB_GENERAL_OFF = new ImageTemplate("images/stats_tab_general_off.png")
            .at(new Rect(200, 305, 250, 52));
    public static final ImageTemplate DETAILS_CHARACTER_STATS = new ImageTemplate("images/details_character_stats.png")
            .at(new Rect(140, 455, 300, 50));
    public static final ImageTemplate DETAILS_GEAR_STATS = new ImageTemplate("images/details_gear_stats.png")
            .at(new Rect(140, 605, 220, 50));
    public static final ImageTemplate DISH_TITLE = new ImageTemplate("images/dish_title.png")
            .at(new Rect(470, 275, 145, 60));
    public static final ImageTemplate DISH_TYPE_FILTER = new ImageTemplate("images/dish_type_filter.png")
            .at(new Rect(660, 835, 320, 52));
    public static final ImageTemplate DISH_AUTO_SELECT = new ImageTemplate("images/dish_auto_select.png")
            .at(new Rect(130, 1525, 390, 75));
    public static final ImageTemplate DISH_USE = new ImageTemplate("images/dish_use.png")
            .at(new Rect(560, 1525, 395, 75));
    public static final ImageTemplate QUEST_TRACKER_GO = new ImageTemplate("images/quest_tracker_go.png")
            .at(new Rect(362, 1330, 356, 76));
    public static final ImageTemplate TRAVEL_CONFIRM_TEXT = new ImageTemplate("images/travel_confirm_text.png")
            .at(new Rect(337, 860, 190, 44));
    public static final ImageTemplate VISAGE_BODY_TYPES_LABEL = new ImageTemplate("images/visage_body_types_label.png")
            .at(new Rect(175, 848, 385, 50));
    public static final ImageTemplate RESONANCE_BOOST_TITLE = new ImageTemplate("images/resonance_boost_title.png")
            .at(new Rect(350, 195, 380, 52));
    public static final ImageTemplate POWER_ROW_EXPAND = new ImageTemplate("images/power_row_expand.png")
            .at(new Rect(882, 480, 48, 48));
    public static final ImageTemplate TOP_POWER_ICON = new ImageTemplate("images/top_power_icon.png")
            .at(new Rect(183, 114, 44, 34));
    public static final ImageTemplate GEM_ICON = new ImageTemplate("images/gem_icon.png").at(new Rect(717, 59, 40, 42));
    public static final ImageTemplate ENERGY_ICON = new ImageTemplate("images/energy_icon.png")
            .at(new Rect(874, 57, 38, 44));
    public static final ImageTemplate ROLLA_ICON = new ImageTemplate("images/rolla_icon.png")
            .at(new Rect(561, 62, 38, 38));
    public static final ImageTemplate HOME_GATE = new ImageTemplate("images/home_gate.png")
            .at(new Rect(860, 1260, 150, 100));
    public static final ImageTemplate ROLLA_INFO_COIN = new ImageTemplate("images/rolla_info_coin.png")
            .at(new Rect(635, 450, 230, 230));
    public static final ImageTemplate ITEM_SOURCE_GO = new ImageTemplate("images/item_source_go.png")
            .at(new Rect(860, 1132, 60, 50));
    private Pictures() {
    }
}
