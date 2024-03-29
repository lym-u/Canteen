package com.canteen.bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table CanteenReview
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Canteenreview implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CanteenReview.CanteenReviewID
     *
     * @mbg.generated
     */
    private Integer canteenreviewid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CanteenReview.UserID
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CanteenReview.CanteenID
     *
     * @mbg.generated
     */
    private Integer canteenid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CanteenReview.Title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CanteenReview.ImageURL
     *
     * @mbg.generated
     */
    private String imageurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CanteenReview.ReviewTime
     *
     * @mbg.generated
     */
    private Date reviewtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CanteenReview.Rating
     *
     * @mbg.generated
     */
    private Integer rating;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CanteenReview.Content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CanteenReview
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CanteenReview.CanteenReviewID
     *
     * @return the value of CanteenReview.CanteenReviewID
     *
     * @mbg.generated
     */
    public Integer getCanteenreviewid() {
        return canteenreviewid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CanteenReview.CanteenReviewID
     *
     * @param canteenreviewid the value for CanteenReview.CanteenReviewID
     *
     * @mbg.generated
     */
    public void setCanteenreviewid(Integer canteenreviewid) {
        this.canteenreviewid = canteenreviewid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CanteenReview.UserID
     *
     * @return the value of CanteenReview.UserID
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CanteenReview.UserID
     *
     * @param userid the value for CanteenReview.UserID
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CanteenReview.CanteenID
     *
     * @return the value of CanteenReview.CanteenID
     *
     * @mbg.generated
     */
    public Integer getCanteenid() {
        return canteenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CanteenReview.CanteenID
     *
     * @param canteenid the value for CanteenReview.CanteenID
     *
     * @mbg.generated
     */
    public void setCanteenid(Integer canteenid) {
        this.canteenid = canteenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CanteenReview.Title
     *
     * @return the value of CanteenReview.Title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CanteenReview.Title
     *
     * @param title the value for CanteenReview.Title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CanteenReview.ImageURL
     *
     * @return the value of CanteenReview.ImageURL
     *
     * @mbg.generated
     */
    public String getImageurl() {
        return imageurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CanteenReview.ImageURL
     *
     * @param imageurl the value for CanteenReview.ImageURL
     *
     * @mbg.generated
     */
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CanteenReview.ReviewTime
     *
     * @return the value of CanteenReview.ReviewTime
     *
     * @mbg.generated
     */
    public Date getReviewtime() {
        return reviewtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CanteenReview.ReviewTime
     *
     * @param reviewtime the value for CanteenReview.ReviewTime
     *
     * @mbg.generated
     */
    public void setReviewtime(Date reviewtime) {
        this.reviewtime = reviewtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CanteenReview.Rating
     *
     * @return the value of CanteenReview.Rating
     *
     * @mbg.generated
     */
    public Integer getRating() {
        return rating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CanteenReview.Rating
     *
     * @param rating the value for CanteenReview.Rating
     *
     * @mbg.generated
     */
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CanteenReview.Content
     *
     * @return the value of CanteenReview.Content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CanteenReview.Content
     *
     * @param content the value for CanteenReview.Content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content;
    }
}