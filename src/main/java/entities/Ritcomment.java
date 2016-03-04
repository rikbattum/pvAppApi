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
@Table(name = "ritcomment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ritcomment.findAll", query = "SELECT r FROM Ritcomment r"),
    @NamedQuery(name = "Ritcomment.findByRitcommentid", query = "SELECT r FROM Ritcomment r WHERE r.ritcommentid = :ritcommentid"),
    @NamedQuery(name = "Ritcomment.findByCommenttype", query = "SELECT r FROM Ritcomment r WHERE r.commenttype = :commenttype"),
    @NamedQuery(name = "Ritcomment.findByCreatedon", query = "SELECT r FROM Ritcomment r WHERE r.createdon = :createdon"),
    @NamedQuery(name = "Ritcomment.findByDate", query = "SELECT r FROM Ritcomment r WHERE r.date = :date"),
    @NamedQuery(name = "Ritcomment.findByTags", query = "SELECT r FROM Ritcomment r WHERE r.tags = :tags"),
    @NamedQuery(name = "Ritcomment.findByText", query = "SELECT r FROM Ritcomment r WHERE r.text = :text")})
public class Ritcomment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ritcommentid")
    private Long ritcommentid;
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
    @JoinColumn(name = "ritid", referencedColumnName = "eventid")
    @ManyToOne
    private Event ritid;
    @JoinColumn(name = "memberid", referencedColumnName = "id")
    @ManyToOne
    private Member1 memberid;

    public Ritcomment() {
    }

    public Ritcomment(Long ritcommentid) {
        this.ritcommentid = ritcommentid;
    }

    public Long getRitcommentid() {
        return ritcommentid;
    }

    public void setRitcommentid(Long ritcommentid) {
        this.ritcommentid = ritcommentid;
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

    public Event getRitid() {
        return ritid;
    }

    public void setRitid(Event ritid) {
        this.ritid = ritid;
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
        hash += (ritcommentid != null ? ritcommentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ritcomment)) {
            return false;
        }
        Ritcomment other = (Ritcomment) object;
        if ((this.ritcommentid == null && other.ritcommentid != null) || (this.ritcommentid != null && !this.ritcommentid.equals(other.ritcommentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Ritcomment[ ritcommentid=" + ritcommentid + " ]";
    }
    
}
