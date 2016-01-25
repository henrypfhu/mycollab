/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table s_timeline_tracking_cache*/
package com.esofthead.mycollab.common.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import com.esofthead.mycollab.core.db.metadata.Column;
import com.esofthead.mycollab.core.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("s_timeline_tracking_cache")
public class TimelineTrackingCaching extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_timeline_tracking_cache.id
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    @Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_timeline_tracking_cache.type
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("type")
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_timeline_tracking_cache.fieldval
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("fieldval")
    private String fieldval;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_timeline_tracking_cache.extratypeid
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    @Column("extratypeid")
    private Integer extratypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_timeline_tracking_cache.sAccountId
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_timeline_tracking_cache.forDay
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    @Column("forDay")
    private Date forday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_timeline_tracking_cache.fieldgroup
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("fieldgroup")
    private String fieldgroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_timeline_tracking_cache.count
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    @Column("count")
    private Integer count;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (obj.getClass() != getClass()) { return false;}
        TimelineTrackingCaching item = (TimelineTrackingCaching)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1725, 1425).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_timeline_tracking_cache.id
     *
     * @return the value of s_timeline_tracking_cache.id
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_timeline_tracking_cache.id
     *
     * @param id the value for s_timeline_tracking_cache.id
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_timeline_tracking_cache.type
     *
     * @return the value of s_timeline_tracking_cache.type
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_timeline_tracking_cache.type
     *
     * @param type the value for s_timeline_tracking_cache.type
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_timeline_tracking_cache.fieldval
     *
     * @return the value of s_timeline_tracking_cache.fieldval
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public String getFieldval() {
        return fieldval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_timeline_tracking_cache.fieldval
     *
     * @param fieldval the value for s_timeline_tracking_cache.fieldval
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public void setFieldval(String fieldval) {
        this.fieldval = fieldval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_timeline_tracking_cache.extratypeid
     *
     * @return the value of s_timeline_tracking_cache.extratypeid
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public Integer getExtratypeid() {
        return extratypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_timeline_tracking_cache.extratypeid
     *
     * @param extratypeid the value for s_timeline_tracking_cache.extratypeid
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public void setExtratypeid(Integer extratypeid) {
        this.extratypeid = extratypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_timeline_tracking_cache.sAccountId
     *
     * @return the value of s_timeline_tracking_cache.sAccountId
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_timeline_tracking_cache.sAccountId
     *
     * @param saccountid the value for s_timeline_tracking_cache.sAccountId
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_timeline_tracking_cache.forDay
     *
     * @return the value of s_timeline_tracking_cache.forDay
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public Date getForday() {
        return forday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_timeline_tracking_cache.forDay
     *
     * @param forday the value for s_timeline_tracking_cache.forDay
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public void setForday(Date forday) {
        this.forday = forday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_timeline_tracking_cache.fieldgroup
     *
     * @return the value of s_timeline_tracking_cache.fieldgroup
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public String getFieldgroup() {
        return fieldgroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_timeline_tracking_cache.fieldgroup
     *
     * @param fieldgroup the value for s_timeline_tracking_cache.fieldgroup
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public void setFieldgroup(String fieldgroup) {
        this.fieldgroup = fieldgroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_timeline_tracking_cache.count
     *
     * @return the value of s_timeline_tracking_cache.count
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_timeline_tracking_cache.count
     *
     * @param count the value for s_timeline_tracking_cache.count
     *
     * @mbggenerated Fri Jan 22 00:29:03 ICT 2016
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    public enum Field {
        id,
        type,
        fieldval,
        extratypeid,
        saccountid,
        forday,
        fieldgroup,
        count;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}