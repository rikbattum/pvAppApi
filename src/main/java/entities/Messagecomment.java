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
@Table(name = "messagecomment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Messagecomment.findAll", query = "SELECT m FROM Messagecomment m"),
    @NamedQuery(name = "Messagecomment.findByMessagecommentid", query = "SELECT m FROM Messagecomment m WHERE m.messagecommentid = :messagecommentid"),
    @NamedQuery(name = "Messagecomment.findByCommenttype", query = "SELECT m FROM Messagecomment m WHERE m.commenttype = :commenttype"),
    @NamedQuery(name = "Messagecomment.findByCreatedon", query = "SELECT m FROM Messagecomment m WHERE m.createdon = :createdon"),
    @NamedQuery(name = "Messagecomment.findByDate", query = "SELECT m FROM Messagecomment m WHERE m.date = :date"),
    @NamedQuery(name = "Messagecomment.findByTags", query = "SELECT m FROM Messagecomment m WHERE m.tags = :tags"),
    @NamedQuery(name = "Messagecomment.findByText", query = "SELECT m FROM Messagecomment m WHERE m.text = :text")})
public class Messagecomment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "messagecommentid")
    private Long messagecommentid;
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
    @JoinColumn(name = "memberid", referencedColumnName = "id")
    @ManyToOne
    private Member1 memberid;
    @JoinColumn(name = "messageid", referencedColumnName = "messageid")
    @ManyToOne
    private Message messageid;

    public Messagecomment() {
    }

    public Messagecomment(Long messagecommentid) {
        this.messagecommentid = messagecommentid;
    }

    public Long getMessagecommentid() {
        return messagecommentid;
    }

    public void setMessagecommentid(Long messagecommentid) {
        this.messagecommentid = messagecommentid;
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

    public Member1 getMemberid() {
        return memberid;
    }

    public void setMemberid(Member1 memberid) {
        this.memberid = memberid;
    }

    public Message getMessageid() {
        return messageid;
    }

    public void setMessageid(Message messageid) {
        this.messageid = messageid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (messagecommentid != null ? messagecommentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Messagecomment)) {
            return false;
        }
        Messagecomment other = (Messagecomment) object;
        if ((this.messagecommentid == null && other.messagecommentid != null) || (this.messagecommentid != null && !this.messagecommentid.equals(other.messagecommentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Messagecomment[ messagecommentid=" + messagecommentid + " ]";
    }
    
}
