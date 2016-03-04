/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gebruiker
 */
@Entity
@Table(name = "eventcomment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Eventcomment.findAll", query = "SELECT e FROM Eventcomment e"),
    @NamedQuery(name = "Eventcomment.findByEventcommentid", query = "SELECT e FROM Eventcomment e WHERE e.eventcommentid = :eventcommentid"),
    @NamedQuery(name = "Eventcomment.findByCommenttype", query = "SELECT e FROM Eventcomment e WHERE e.commenttype = :commenttype"),
    @NamedQuery(name = "Eventcomment.findByCreatedon", query = "SELECT e FROM Eventcomment e WHERE e.createdon = :createdon"),
    @NamedQuery(name = "Eventcomment.findByDate", query = "SELECT e FROM Eventcomment e WHERE e.date = :date"),
    @NamedQuery(name = "Eventcomment.findByTags", query = "SELECT e FROM Eventcomment e WHERE e.tags = :tags"),
    @NamedQuery(name = "Eventcomment.findByText", query = "SELECT e FROM Eventcomment e WHERE e.text = :text")})
public class Eventcomment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "eventcommentid")
    private Long eventcommentid;
    @Size(max = 255)
    @Column(name = "commenttype")
    private String commenttype;
    @Column(name = "createdon")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdon;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Size(max = 255)
    @Column(name = "tags")
    private String tags;
    @Size(max = 255)
    @Column(name = "text")
    private String text;
    @JoinColumn(name = "eventid", referencedColumnName = "eventid")
    @ManyToOne
    private Event eventid;
    @JoinColumn(name = "memberid", referencedColumnName = "id")
    @ManyToOne
    private Member1 memberid;

    public Eventcomment() {
    }

    public Eventcomment(Long eventcommentid) {
        this.eventcommentid = eventcommentid;
    }

    public Long getEventcommentid() {
        return eventcommentid;
    }

    public void setEventcommentid(Long eventcommentid) {
        this.eventcommentid = eventcommentid;
    }

    public String getCommenttype() {
        return commenttype;
    }

    public void setCommenttype(String commenttype) {
        this.commenttype = commenttype;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Event getEventid() {
        return eventid;
    }

    public void setEventid(Event eventid) {
        this.eventid = eventid;
    }

    public Member1 getMemberid() {
        return memberid;
    }

    public void setMemberid(Member1 memberid) {
        this.memberid = memberid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventcommentid != null ? eventcommentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eventcomment)) {
            return false;
        }
        Eventcomment other = (Eventcomment) object;
        if ((this.eventcommentid == null && other.eventcommentid != null) || (this.eventcommentid != null && !this.eventcommentid.equals(other.eventcommentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Eventcomment[ eventcommentid=" + eventcommentid + " ]";
    }
    
}
