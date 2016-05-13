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
@Table(name = "messagelike")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Messagelike.findAll", query = "SELECT m FROM Messagelike m"),
    @NamedQuery(name = "Messagelike.findByMessagelikeid", query = "SELECT m FROM Messagelike m WHERE m.messagelikeid = :messagelikeid"),
    @NamedQuery(name = "Messagelike.findByCreatedon", query = "SELECT m FROM Messagelike m WHERE m.createdon = :createdon"),
    @NamedQuery(name = "Messagelike.findByLiketype", query = "SELECT m FROM Messagelike m WHERE m.liketype = :liketype")})
public class Messagelike implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "messagelikeid")
    private Long messagelikeid;
    @Column(name = "createdon")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdon;
    @Size(max = 255)
    @Column(name = "liketype")
    private String liketype;
    @JoinColumn(name = "memberid", referencedColumnName = "id")
    @ManyToOne
    private Member1 memberid;
    @JoinColumn(name = "messageid", referencedColumnName = "messageid")
    @ManyToOne
    private Message messageid;

    public Messagelike() {
    }

    public Messagelike(Long messagelikeid) {
        this.messagelikeid = messagelikeid;
    }

    public Long getMessagelikeid() {
        return messagelikeid;
    }

    public void setMessagelikeid(Long messagelikeid) {
        this.messagelikeid = messagelikeid;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getLiketype() {
        return liketype;
    }

    public void setLiketype(String liketype) {
        this.liketype = liketype;
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
        hash += (messagelikeid != null ? messagelikeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Messagelike)) {
            return false;
        }
        Messagelike other = (Messagelike) object;
        if ((this.messagelikeid == null && other.messagelikeid != null) || (this.messagelikeid != null && !this.messagelikeid.equals(other.messagelikeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Messagelike[ messagelikeid=" + messagelikeid + " ]";
    }
    
}
