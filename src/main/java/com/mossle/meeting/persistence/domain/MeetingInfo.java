package com.mossle.meeting.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MeetingInfo .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "MEETING_INFO")
public class MeetingInfo implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private MeetingRoom meetingRoom;

    /** null. */
    private String subject;

    /** null. */
    private String content;

    /** null. */
    private Date createTime;

    /** null. */
    private Date calendarDate;

    /** null. */
    private Date startTime;

    /** null. */
    private Date endTime;

    /** null. */
    private String organizer;

    /** null. */
    private String meetingTimezone;

    /** null. */
    private String type;

    /** null. */
    private String catalog;

    /** null. */
    private String status;

    /** null. */
    private String userId;

    /** null. */
    private String tenantId;

    /** . */
    private Set<MeetingItem> meetingItems = new HashSet<MeetingItem>(0);

    /** . */
    private Set<MeetingAttendee> meetingAttendees = new HashSet<MeetingAttendee>(
            0);

    public MeetingInfo() {
    }

    public MeetingInfo(Long id) {
        this.id = id;
    }

    public MeetingInfo(Long id, MeetingRoom meetingRoom, String subject,
            String content, Date createTime, Date calendarDate, Date startTime,
            Date endTime, String organizer, String meetingTimezone,
            String type, String catalog, String status, String userId,
            String tenantId, Set<MeetingItem> meetingItems,
            Set<MeetingAttendee> meetingAttendees) {
        this.id = id;
        this.meetingRoom = meetingRoom;
        this.subject = subject;
        this.content = content;
        this.createTime = createTime;
        this.calendarDate = calendarDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.organizer = organizer;
        this.meetingTimezone = meetingTimezone;
        this.type = type;
        this.catalog = catalog;
        this.status = status;
        this.userId = userId;
        this.tenantId = tenantId;
        this.meetingItems = meetingItems;
        this.meetingAttendees = meetingAttendees;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEETING_ROOM_ID")
    public MeetingRoom getMeetingRoom() {
        return this.meetingRoom;
    }

    /**
     * @param meetingRoom
     *            null.
     */
    public void setMeetingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
    }

    /** @return null. */
    @Column(name = "SUBJECT", length = 200)
    public String getSubject() {
        return this.subject;
    }

    /**
     * @param subject
     *            null.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /** @return null. */
    @Column(name = "CONTENT", length = 200)
    public String getContent() {
        return this.content;
    }

    /**
     * @param content
     *            null.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            null.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return null. */
    @Temporal(TemporalType.DATE)
    @Column(name = "CALENDAR_DATE", length = 10)
    public Date getCalendarDate() {
        return this.calendarDate;
    }

    /**
     * @param calendarDate
     *            null.
     */
    public void setCalendarDate(Date calendarDate) {
        this.calendarDate = calendarDate;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "START_TIME", length = 26)
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * @param startTime
     *            null.
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "END_TIME", length = 26)
    public Date getEndTime() {
        return this.endTime;
    }

    /**
     * @param endTime
     *            null.
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /** @return null. */
    @Column(name = "ORGANIZER", length = 64)
    public String getOrganizer() {
        return this.organizer;
    }

    /**
     * @param organizer
     *            null.
     */
    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    /** @return null. */
    @Column(name = "MEETING_TIMEZONE", length = 50)
    public String getMeetingTimezone() {
        return this.meetingTimezone;
    }

    /**
     * @param meetingTimezone
     *            null.
     */
    public void setMeetingTimezone(String meetingTimezone) {
        this.meetingTimezone = meetingTimezone;
    }

    /** @return null. */
    @Column(name = "TYPE", length = 50)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            null.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return null. */
    @Column(name = "CATALOG", length = 50)
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @param catalog
     *            null.
     */
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /** @return null. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return null. */
    @Column(name = "USER_ID", length = 64)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            null.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** @return null. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            null.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "meetingInfo")
    public Set<MeetingItem> getMeetingItems() {
        return this.meetingItems;
    }

    /**
     * @param meetingItems
     *            .
     */
    public void setMeetingItems(Set<MeetingItem> meetingItems) {
        this.meetingItems = meetingItems;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "meetingInfo")
    public Set<MeetingAttendee> getMeetingAttendees() {
        return this.meetingAttendees;
    }

    /**
     * @param meetingAttendees
     *            .
     */
    public void setMeetingAttendees(Set<MeetingAttendee> meetingAttendees) {
        this.meetingAttendees = meetingAttendees;
    }
}
