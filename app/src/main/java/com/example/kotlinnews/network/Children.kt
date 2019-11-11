package com.example.kotlinnews.network

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize
data class Children(
        val `data`: DataX,
        val kind: String?
):Parcelable

@Parcelize
data class DataX(
        val all_awardings: List<AllAwarding>,
        val allow_live_comments: Boolean,
        val approved_at_utc: String?,
        val approved_by: String?,
        val archived: Boolean,
        val author: String?,
        val author_flair_background_color: String?,
        val author_flair_css_class: String?,
        val author_flair_richtext: List<String?>,
        val author_flair_template_id: String?,
        val author_flair_text: String?,
        val author_flair_text_color: String?,
        val author_flair_type: String?,
        val author_fullname: String?,
        val author_patreon_flair: Boolean,
        val awarders: List<String?>,
        val banned_at_utc: String?,
        val banned_by: String?,
        val can_gild: Boolean,
        val can_mod_post: Boolean,
        val category: String?,
        val clicked: Boolean,
        val content_categories: String?,
        val contest_mode: Boolean,
        val created: Double,
        val created_utc: Double,
        val discussion_type: String?,
        val distinguished: String?,
        val domain: String?,
        val downs: Int?,
        val gilded: Int?,
        val gildings: Gildings?,
        val hidden: Boolean,
        val hide_score: Boolean,
        val id: String?,
        val is_crosspostable: Boolean,
        val is_meta: Boolean,
        val is_original_content: Boolean,
        val is_reddit_media_domain: Boolean,
        val is_robot_indexable: Boolean,
        val is_self: Boolean,
        val is_video: Boolean,
        val likes: String?,
        val link_flair_background_color: String?,
        val link_flair_css_class: String?,
        val link_flair_richtext: List<String?>,
        val link_flair_text: String?,
        val link_flair_text_color: String?,
        val link_flair_type: String?,
        val locked: Boolean,
        val media: String?,
        val media_embed: MediaEmbed,
        val media_only: Boolean,
        val mod_note: String?,
        val mod_reason_by: String?,
        val mod_reason_title: String?,
        val mod_reports: List<String?>,
        val name: String?,
        val no_follow: Boolean,
        val num_comments: Int?,
        val num_crossposts: Int?,
        val num_reports: String?,
        val over_18: Boolean,
        val parent_whitelist_status: String?,
        val permalink: String?,
        val pinned: Boolean,
        val pwls: Int?,
        val quarantine: Boolean,
        val removal_reason: String?,
        val report_reasons: String?,
        val saved: Boolean,
        val score: Int?,
        val secure_media: String?,
        val secure_media_embed: SecureMediaEmbed,
        val selftext: String?,
        val selftext_html: String?,
        val send_replies: Boolean,
        val spoiler: Boolean,
        val steward_reports: List<String?>,
        val stickied: Boolean,
        val subreddit: String?,
        val subreddit_id: String?,
        val subreddit_name_prefixed: String?,
        val subreddit_subscribers: Int?,
        val subreddit_type: String?,
        val suggested_sort: String?,
        val thumbnail: String?,
        val title: String?,
        val total_awards_received: Int?,
        val ups: Int?,
        val url: String?,
        val user_reports: List<String?>,
        val view_count: String?,
        val visited: Boolean,
        val whitelist_status: String?,
        val wls: Int?
):Parcelable

@Parcelize
data class AllAwarding(
        val award_type: String?,
        val coin_price: Int?,
        val coin_reward: Int?,
        val count: Int?,
        val days_of_drip_extension: Int?,
        val days_of_premium: Int?,
        val description: String?,
        val end_date: String?,
        val icon_height: Int?,
        val icon_url: String?,
        val icon_width: Int?,
        val id: String?,
        val is_enabled: Boolean,
        val name: String?,
        val resized_icons: List<ResizedIcon>,
        val start_date: String?,
        val subreddit_coin_reward: Int?,
        val subreddit_id: String?
):Parcelable

@Parcelize
data class ResizedIcon(
        val height: Int?,
        val url: String?,
        val width: Int?
):Parcelable
@Parcelize
data class Gildings(
        val gid_2: Int?
):Parcelable
@Parcelize
class MediaEmbed(
):Parcelable
@Parcelize
class SecureMediaEmbed(
):Parcelable