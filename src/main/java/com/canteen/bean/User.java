package com.canteen.bean;

<<<<<<< HEAD
import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table User
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.Userid
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.Username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column User.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table User
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.Userid
     *
     * @return the value of User.Userid
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.Userid
     *
     * @param userid the value for User.Userid
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.Username
     *
     * @return the value of User.Username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.Username
     *
     * @param username the value for User.Username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column User.password
     *
     * @return the value of User.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column User.password
     *
     * @param password the value for User.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
=======
import org.springframework.stereotype.Component;

/**
 * 用户实体类
 * @author hmg
 *
 */
@Component
public class User {
	private int id;
	private String username;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
>>>>>>> origin/branch1
